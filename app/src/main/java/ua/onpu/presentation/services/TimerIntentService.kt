package ua.onpu.presentation.services

import android.app.IntentService
import android.content.Intent
import android.os.Handler
import android.util.Log
import androidx.lifecycle.MutableLiveData

class TimerIntentService : IntentService("TimerService") {
    private val TAG = "TimerIntentService"

    override fun onHandleIntent(intent: Intent?) {
        if (intent!!.action == "stop") {
            Log.i(TAG, "Timer Intent service stopped")
        } else if (intent.hasExtra("seconds")) {
            val seconds = intent.getIntExtra("seconds", 0)
            Log.i(TAG, "timer fragment paused at ${seconds}")
        }
    }
}