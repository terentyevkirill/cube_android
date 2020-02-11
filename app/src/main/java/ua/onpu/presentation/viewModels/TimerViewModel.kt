package ua.onpu.presentation.viewModels

import android.os.Handler
import android.util.Log
import androidx.lifecycle.MutableLiveData
import ua.onpu.R
import ua.onpu.base.BaseViewModel
import ua.onpu.db.entity.Action
import ua.onpu.db.entity.Interval
import ua.onpu.repository.ActionRepository
import ua.onpu.repository.IntervalRepository
import java.lang.StringBuilder
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject

class TimerViewModel @Inject constructor(
    private val intervalRepository: IntervalRepository,
    private val actionRepository: ActionRepository
) :
    BaseViewModel(), Runnable {

    private lateinit var action: Action
    private var startRecordTime = 0L
    private var recordTimeInMs = 0L
    private var recordTimeSwapBuff = 0L
    private var recordUpdateTime = 0L
    private val timerHandler: Handler = Handler()
    private val TAG = "TimerViewModel"

    var timerValue: MutableLiveData<Pair<String, Long>> = MutableLiveData()

    init {
        timerValue.value = "00:00:00" to 0
    }

    override fun run() {
        recordTimeInMs = Date().time - startRecordTime
        recordUpdateTime = recordTimeSwapBuff + recordTimeInMs
        var seconds = (recordUpdateTime / 1000)
        val minutes = (seconds / 60)
        val hours = (minutes / 60)
        seconds %= 60
        timerValue.value =
            "${formatTimeLongToString(hours)}:${formatTimeLongToString(minutes)}:${formatTimeLongToString(
                seconds
            )}" to seconds
        timerHandler.postDelayed(this, 1000)
    }

    fun setupAction(action: Action) {
        this.action = action
    }

    fun setupActionById(actionId: Long) {
        this.action = actionRepository.getActionById(actionId)
    }

    fun resumeTimer(prevTimerLengthSeconds: Long, pauseStartInMs: Long) {
        if (pauseStartInMs != 0L) {
            recordTimeSwapBuff = prevTimerLengthSeconds * 1000 + (Date().time - pauseStartInMs)
        } else {
            recordTimeSwapBuff = prevTimerLengthSeconds * 1000
        }
        Log.i(
            TAG,
            "Timer resumed, prevTimerSeconds= {$prevTimerLengthSeconds}, pauseStartMs={$pauseStartInMs}"
        )
        startRecordTime = Date().time
        timerHandler.post(this)
    }

    fun startTimer() : Int {
        Log.i(TAG, "Timer started!")
        startRecordTime = Date().time
        timerHandler.post(this)
        return 1
    }

    fun stopTimer(startTimeInMs: Long) {
        Log.i(TAG, "Timer stopped! start=$startTimeInMs")
        intervalRepository.insertInterval(
            Interval(
                startTime = Date(startTimeInMs),
                endTime = Date(),
                actionId = action.id
            )
        )
        timerHandler.removeCallbacks(this)
        timerValue.value = "00:00:00" to 0
    }

    fun getLastAddedData(): String? {
        val interval = intervalRepository.getLatestInterval()
        val actionName: String?
        val result = StringBuilder()
        if (interval != null) {
            actionName = actionRepository.getActionById(interval.actionId).name
            val dateDiff = Date(interval.endTime.time - interval.startTime.time)
            if (dateDiff.time < 60000) {
                result.append(SimpleDateFormat("ss", Locale.getDefault()).format(dateDiff))
                result.append(" sec")
            } else if (dateDiff.time < 3600000) {
                result.append(SimpleDateFormat("mm", Locale.getDefault()).format(dateDiff))
                result.append(" min")
            } else {
                result.append(SimpleDateFormat("HH:mm", Locale.getDefault()).format(dateDiff))
            }
            result.append(" - ").append(actionName)
        } else {
            result
                .append("Nothing tracked yet")
        }

        return result.toString()
    }

    fun getFormattedData(pattern: String): String =
        SimpleDateFormat(pattern).format(Calendar.getInstance().time)

    private fun formatTimeLongToString(param: Long): String =
        if (param / 10 == 0L) "0$param" else param.toString()

    fun getTotalTodayData(): String? {
        val result = StringBuilder()
        val seconds = intervalRepository.getTodayTrackedSeconds()
        if (seconds == null) {
            result.append(R.string.nothing_tracked_yet)
        } else {
            result
                .append(seconds)
                .append(" sec")
        }

        return result.toString()
    }

    enum class TimerEnum{ TIMERON, TIMEROFF}

}