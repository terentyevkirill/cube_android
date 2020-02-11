package ua.onpu.bluetooth

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log.v
import ua.onpu.core.CubeFace
import ua.onpu.presentation.activity.LobbyActivity

class BluetoothBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action.equals(BluetoothConnectionService.ACTION_DEVICE_CONNECTED)) {
            v("BTBroadcastReceiver", "connected")
        } else if (intent.action.equals(BluetoothConnectionService.ACTION_DEVICE_DISCONNECTED)) {
            v("BTBroadcastReceiver", "disconnected")
        } else if (intent.action.equals(BluetoothConnectionService.ACTION_CUBE_FACE_DATA_SENT)) {
            val face = intent.getIntExtra(BluetoothConnectionService.EXTRA_CUBE_FACE, CubeFace.CALIBRATING)
            v("BTBroadcastReceiver", "face=$face")
            val intent = Intent(context, LobbyActivity::class.java)
            context.startActivity(intent)
        } else if (intent.action.equals(BluetoothConnectionService.ACTION_SERVICE_CREATED)) {
            v("BTBroadcastReceiver", "service started")
        } else if (intent.action.equals(BluetoothConnectionService.ACTION_SERVICE_DESTROYED)) {
            v("BTBroadcastReceiver", "service destroyed")
        }
    }
}
