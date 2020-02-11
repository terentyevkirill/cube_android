package ua.onpu.core

import android.content.Context
import androidx.preference.PreferenceManager
import ua.onpu.presentation.fragments.TimerFragment

class PrefUtil {
    companion object {

        private const val PREVIOUS_TIMER_LENGTH_SECONDS_ID = "previous_timer_length_seconds"

        fun getPreviousTimerLengthSeconds(context: Context?): Long {
            val prefs = PreferenceManager.getDefaultSharedPreferences(context)
            return prefs.getLong(PREVIOUS_TIMER_LENGTH_SECONDS_ID, 0)
        }

        fun setPreviousTimerLengthSeconds(seconds: Long, context: Context?) {
            val editor = PreferenceManager.getDefaultSharedPreferences(context).edit()
            editor.putLong(PREVIOUS_TIMER_LENGTH_SECONDS_ID, seconds)
            editor.apply()
        }

        private const val TIMER_STATE_ID = "timer_state"

        fun getTimerState(context: Context?): TimerFragment.TimerState {
            val prefs = PreferenceManager.getDefaultSharedPreferences(context)
            val ordinal = prefs.getInt(TIMER_STATE_ID, 0)
            return TimerFragment.TimerState.values()[ordinal]
        }

        fun setTimerState(state: TimerFragment.TimerState, context: Context?) {
            val editor = PreferenceManager.getDefaultSharedPreferences(context).edit()
            val ordinal = state.ordinal
            editor.putInt(TIMER_STATE_ID, ordinal)
            editor.apply()
        }

        private const val PAUSE_START_ID = "pause_start_id"

        fun getPauseStart(context: Context?): Long {
            val prefs = PreferenceManager.getDefaultSharedPreferences(context)
            return prefs.getLong(PAUSE_START_ID, 0)
        }

        fun setPauseStart(pauseStartInMs: Long, context: Context?) {
            val editor = PreferenceManager.getDefaultSharedPreferences(context).edit()
            editor.putLong(PAUSE_START_ID, pauseStartInMs)
            editor.apply()
        }

        private const val START_TIME_ID = "start_time_id"

        fun getStartTime(context: Context?): Long {
            val prefs = PreferenceManager.getDefaultSharedPreferences(context)
            return prefs.getLong(START_TIME_ID, 0)
        }

        fun setStartTime(startTimeInMs: Long, context: Context?) {
            val editor = PreferenceManager.getDefaultSharedPreferences(context).edit()
            editor.putLong(START_TIME_ID, startTimeInMs)
            editor.apply()
        }

        private const val PREVIOUS_ACTION_ID = "previous_action_id"

        fun getPreviousActionId(context: Context?): Long {
            val prefs = PreferenceManager.getDefaultSharedPreferences(context)
            return prefs.getLong(PREVIOUS_ACTION_ID, 0)
        }

        fun setPreviousActionId(actionId: Long, context: Context?) {
            val editor = PreferenceManager.getDefaultSharedPreferences(context).edit()
            editor.putLong(PREVIOUS_ACTION_ID, actionId)
            editor.apply()
        }


    }
}