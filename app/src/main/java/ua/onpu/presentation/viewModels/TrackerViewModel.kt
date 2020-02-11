package ua.onpu.presentation.viewModels

import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothDevice
import android.bluetooth.BluetoothSocket
import android.content.Intent
import android.os.Handler
import androidx.lifecycle.MutableLiveData
import ua.onpu.base.BaseViewModel
import ua.onpu.core.OneTimeLiveData
import java.io.IOException
import java.io.InputStream
import java.io.OutputStream
import java.nio.charset.Charset
import java.util.*
import javax.inject.Inject

class TrackerViewModel @Inject constructor() : BaseViewModel() {

    private val ENABLE_BLUETOOTH_ACTIVITY_CODE = 0
    private val MY_UUID = UUID.fromString("00001101-0000-1000-8000-00805f9b34fb")
    private val DEVICE_ADDRESS = "20:18:08:34:ED:E1"
    private lateinit var device: BluetoothDevice
    private lateinit var socket: BluetoothSocket
    private lateinit var outputStream: OutputStream
    private lateinit var inputStream: InputStream
    private var deviceConnected = false
    private lateinit var thread: Thread
    private lateinit var buffer: ByteArray
    private var bufferPosition: Int = 0
    private var stopThread = false

    val isBluetoothEnabled: MutableLiveData<Boolean> = MutableLiveData()
    val toastLiveData: OneTimeLiveData<String> = OneTimeLiveData()
    val data: MutableLiveData<String> = MutableLiveData()
    val startActivityForResult: OneTimeLiveData<Pair<Intent, Int>> = OneTimeLiveData()
    val toolbarTitle: MutableLiveData<String> = MutableLiveData()


    fun enableBluetooth() {
        if (isBtInitialized()) {
            if (isBtConnected()) {
                deviceConnected = true
                beginListenForData()
                isBluetoothEnabled.value = true
                data.value = "\nConnection Opened!\n"
            }

        }
    }

    fun disableBluetooth() {
        stopThread = true
        outputStream.close()
        inputStream.close()
        socket.close()
        deviceConnected = false
        isBluetoothEnabled.value = false
        data.value = "\nConnection Closed!\n"
    }

    fun clearData() {
        data.value = ""
    }

    fun send(command: String) {
        command + "\n"
        try {
            outputStream.write(command.toByteArray())
        } catch (e: IOException) {
            e.printStackTrace()
        }
        data.value = "\nSent Data:$command\n"
    }

    private fun isBtInitialized(): Boolean {
        var found = false
        val bluetoothAdapter = BluetoothAdapter.getDefaultAdapter()
        if (bluetoothAdapter == null) {
            toastLiveData.setValue("Device doesnt Support Bluetooth")
            return found
        }
        if (!bluetoothAdapter.isEnabled) {
            val enableAdapter = Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE)
            startActivityForResult.setValue(Pair(enableAdapter, ENABLE_BLUETOOTH_ACTIVITY_CODE))
            Thread.sleep(1000)
        }

        val bondedDevices = bluetoothAdapter.bondedDevices
        if (bondedDevices.isEmpty()) {
            toastLiveData.setValue("Please Pair the Device first")
        } else {
            for (iterator in bondedDevices) {
                if (iterator.address == DEVICE_ADDRESS) {
                    device = iterator
                    found = true
                    break
                }
            }
        }
        return found
    }


    private fun isBtConnected(): Boolean {
        var connected = true
        try {
            socket = device.createRfcommSocketToServiceRecord(MY_UUID)
            socket.connect()
        } catch (e: IOException) {
            e.printStackTrace()
            connected = false
        }
        if (connected) {
            try {
                outputStream = socket.outputStream
            } catch (e: IOException) {
                e.printStackTrace()
            }
            try {
                inputStream = socket.inputStream
            } catch (e: IOException) {
                e.printStackTrace()
            }
        }
        return connected
    }

    private fun beginListenForData() {
        val handler = Handler()
        stopThread = false
        buffer = ByteArray(1024)
        val thread = Thread(Runnable {
            while (!Thread.currentThread().isInterrupted && !stopThread) {
                try {
                    val byteCount = inputStream.available()
                    if (byteCount > 0) {
                        val rawBytes = ByteArray(byteCount)
                        inputStream.read(rawBytes)
                        val string = String(rawBytes, Charset.forName("UTF-8"))
                        handler.post { data.postValue(string) }

                    }
                } catch (ex: IOException) {
                    stopThread = true
                }

            }
        })

        thread.start()
    }
}