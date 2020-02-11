package ua.onpu.presentation.fragments

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.View
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_timer.*
import ua.onpu.core.PrefUtil
import ua.onpu.R
import ua.onpu.base.BaseFragment
import ua.onpu.presentation.activity.LobbyActivity
import ua.onpu.presentation.viewModels.TimerViewModel
import java.util.*

class TimerFragment : BaseFragment<TimerViewModel>(TimerViewModel::class.java) {

    enum class TimerState {
        Running, Stopped
    }

    override val fragmentLayout = R.layout.fragment_timer
    private val args: TimerFragmentArgs by navArgs()
    private val TAG = "TimerFragment"
    private var timerState = TimerState.Stopped

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.i(TAG, "onViewCreated!")
        super.onViewCreated(view, savedInstanceState)
        circular_progress.maxProgress = 60.toDouble()
        viewModel.setupAction(args.StringTrackedAction)
        initData()
        hideToolbar()
    }

    override fun onPause() {
        Log.i(TAG, "onPause!")
        super.onPause()
        if (timerState == TimerState.Running) {
            viewModel.timerValue.value?.second?.let { PrefUtil.setPreviousTimerLengthSeconds(it, context) }
            PrefUtil.setPauseStart(Date().time, context)
        }

    }

    override fun onResume() {
        Log.i(TAG, "onResume!")
        super.onResume()
        timerState = PrefUtil.getTimerState(context)
        if (PrefUtil.getStartTime(context) == 0L) {
            PrefUtil.setStartTime(Date().time, context)
        }
        if (timerState == TimerState.Stopped) {
            Log.i(TAG, "stopped")
            viewModel.startTimer()
            timerState = TimerState.Running
            PrefUtil.setTimerState(timerState, context)
            PrefUtil.setStartTime(Date().time, context)
            PrefUtil.setPreviousActionId(args.StringTrackedAction.id, context)
        } else if (timerState == TimerState.Running) {
            Log.i(TAG, "running")
            val prevActionId = PrefUtil.getPreviousActionId(context)
            if (prevActionId != 0L && prevActionId != args.StringTrackedAction.id) {
                timerState = TimerState.Stopped
                PrefUtil.setPreviousTimerLengthSeconds(0, context)
                PrefUtil.setTimerState(timerState, context)
                PrefUtil.setPauseStart(0, context)
                viewModel.setupActionById(PrefUtil.getPreviousActionId(context))
                viewModel.stopTimer(PrefUtil.getStartTime(context))
                viewModel.setupAction(args.StringTrackedAction)
                PrefUtil.setPreviousActionId(args.StringTrackedAction.id, context)
                onResume()
            } else {
                val prevTimerLengthSeconds = PrefUtil.getPreviousTimerLengthSeconds(context)
                val pauseStartInMs = PrefUtil.getPauseStart(context)
                viewModel.resumeTimer(prevTimerLengthSeconds, pauseStartInMs)
            }

        }
    }

    override fun initObservers() {
        viewModel.timerValue.observe(viewLifecycleOwner, Observer {
            tv_timer.text = it.first
            circular_progress.setCurrentProgress(it.second.toDouble())
        })
    }

    override fun initListeners() {
        stop_button.setOnClickListener {
            timerState = TimerState.Stopped
            PrefUtil.setPreviousTimerLengthSeconds(0, context)
            PrefUtil.setTimerState(timerState, context)
            PrefUtil.setPauseStart(0, context)
            viewModel.stopTimer(PrefUtil.getStartTime(context))
            findNavController().navigateUp()
        }
    }

    private fun initData() {
        actionNameTv.text = args.StringTrackedAction.name
        actionNameTv.setTextColor(args.StringTrackedAction.color)
        circular_progress.progressColor = args.StringTrackedAction.color
        timerDay.text = viewModel.getFormattedData("d")
        timerMonth.text = viewModel.getFormattedData("MMM")
        timerYear.text = viewModel.getFormattedData("yyyy")
        lastAdded.text = viewModel.getLastAddedData()
        totalToday.text = viewModel.getTotalTodayData()
    }

    override fun onPrepareOptionsMenu(menu: Menu){
        menu.findItem(R.id.menu_add_activity).isVisible = false
        menu.findItem(R.id.menu_save_activity).isVisible = false
        return super.onPrepareOptionsMenu(menu)
    }

    private fun hideToolbar(){
        (requireActivity() as LobbyActivity).hideToolbar()
    }
}
