package ua.onpu.bluetooth

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.Service
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.IBinder
import android.util.Log.v
import androidx.annotation.RequiresApi
import androidx.core.app.NotificationCompat
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import ua.onpu.R
import ua.onpu.core.CubeFace
import java.lang.RuntimeException

class BluetoothConnectionService : Service() {

    companion object {
        const val ACTION_DEVICE_CONNECTED = "action_device_connected"
        const val ACTION_DEVICE_DISCONNECTED = "action_device_disconnected"
        const val ACTION_CUBE_FACE_DATA_SENT = "action_cube_face_data_sent"
        const val ACTION_SERVICE_CREATED = "action_service_created"
        const val ACTION_SERVICE_DESTROYED = "action_service_destroyed"
        const val EXTRA_CUBE_FACE = "cube_face"

        private const val FOREGROUND_ID = 6
        private const val NOTIFICATION_CHANNEL_NAME = "Connection Service"
        private const val NOTIFICATION_CHANNEL_ID = "connection_service"
    }

    private val dataListener = object : DataListener {
        override fun onData(data: String) {
            val coordinates = extractCoordinates(data)
            val face = CubeFace.fromCoordinates(coordinates.first, coordinates.second)
            broadcastCurrentCubeFace(face)
            v("ConnectionService", "onData: $data, face = $face")
        }
    }

    private val connectionStateListener = object : ConnectionListener {
        override fun onConnected() {
            broadcastEvent(ACTION_DEVICE_CONNECTED)
            v("ConnectionService", "onConnected")
        }

        override fun onDisconnected() {
            broadcastEvent(ACTION_DEVICE_DISCONNECTED)
            v("ConnectionService", "onDisconnected")
        }
    }

    private val bluetoothManager = BluetoothManager(dataListener, connectionStateListener)

    override fun onCreate() {
        super.onCreate()
        v("ConnectionService", "onCreate()")
        broadcastEvent(ACTION_SERVICE_CREATED)
        try {
            val remoteDevice = bluetoothManager.getRemoteDevice(BluetoothManager.PROTOTYPE_ADDRESS)
            bluetoothManager.connectTo(remoteDevice, this)
        } catch (e: RuntimeException) {
        } finally {
            startForeground(FOREGROUND_ID, createNotification())
        }
    }


    override fun onDestroy() {
        super.onDestroy()
        broadcastEvent(ACTION_SERVICE_DESTROYED)
        if (bluetoothManager.isConnected) {
            bluetoothManager.disconnect()
        }
        bluetoothManager.onDestroy()
    }

    private fun broadcastEvent(event: String) {
        val intent = Intent(event)
        intent.setClass(applicationContext, BluetoothBroadcastReceiver::class.java)
        sendBroadcast(intent)
//        val intent = Intent(event)
//        LocalBroadcastManager.getInstance(this).sendBroadcast(intent)
    }

    private fun broadcastCurrentCubeFace(face: Int) {
        val intent = Intent(ACTION_CUBE_FACE_DATA_SENT)
        intent.putExtra(EXTRA_CUBE_FACE, face)
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent)
    }

    private fun extractCoordinates(src: String): Pair<Float, Float> {
        val split = src.split(" ")
        return Pair(split[0].toFloat(), split[1].toFloat())
    }

    private fun createNotification(): Notification {
        val channelId = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            createNotificationChannel(NOTIFICATION_CHANNEL_ID, NOTIFICATION_CHANNEL_NAME)
        } else NOTIFICATION_CHANNEL_ID

        return NotificationCompat.Builder(this, channelId)
            .setContentTitle(getString(R.string.connection_notification_title))
            .setSmallIcon(R.drawable.ic_timer)
            .build()

    }


    @RequiresApi(Build.VERSION_CODES.O)
    private fun createNotificationChannel(id: String, channelName: String): String {
        val notificationManager =
            getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        val notificationChannel =
            NotificationChannel(id, channelName, NotificationManager.IMPORTANCE_HIGH)
        notificationChannel.lockscreenVisibility = Notification.VISIBILITY_PUBLIC
        notificationChannel.setSound(null, null)
        notificationChannel.enableVibration(false)
        notificationManager.createNotificationChannel(notificationChannel)
        return id
    }

    override fun onBind(intent: Intent?): IBinder? = null
}