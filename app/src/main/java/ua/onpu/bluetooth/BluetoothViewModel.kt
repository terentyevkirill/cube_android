package ua.onpu.bluetooth

import android.bluetooth.BluetoothDevice
import android.content.Context
import android.util.Log.v
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ua.onpu.core.CubeFace

@Deprecated("Use BluetoothConnectionService")
class BluetoothViewModel : ViewModel() {

    companion object {
        private const val TAG = "BluetoothViewModel"
    }

    private val cubeFace = MutableLiveData<Int>()

    private val connectionStatus = MutableLiveData<Boolean>()

    private val dataListener = object : DataListener {
        override fun onData(data: String) {
            val coordinates = extractCoordinates(data)
            cubeFace.postValue(CubeFace.fromCoordinates(coordinates.first, coordinates.second))
            v(TAG, cubeFace.value.toString())
        }
    }

    private val connectionListener = object : ConnectionListener {
        override fun onConnected() {
            connectionStatus.postValue(true)
        }

        override fun onDisconnected() {
            connectionStatus.postValue(false)
        }
    }

    private val bluetoothManager = BluetoothManager(dataListener, connectionListener)


    init {
        cubeFace.value = CubeFace.CALIBRATING
        connectionStatus.value = false
    }

    /**
     * Checks whether Bluetooth is available for the app
     */
    fun isBluetoothAvailable(): Boolean =
        bluetoothManager.isBluetoothSupported() && bluetoothManager.isBluetoothEnabled()

    /**
     * Provides LiveData representing whether there is an active connected device
     */
    fun getConnectionStatus() = connectionStatus

    /**
     * Creates remote device from given address
     */
    fun getRemoteDevice(address: String) = bluetoothManager.getRemoteDevice(address)

    /**
     * Establishes connection with a given Bluetooth device
     */
    fun connect(device: BluetoothDevice, context: Context) {
        bluetoothManager.connectTo(device, context)
    }

    /**
     * Stops active Bluetooth connection
     */
    fun disconnect() {
        bluetoothManager.disconnect()
        connectionStatus.value = false
    }

    /**
     * Provides LiveData representing current face of cube
     */
    fun getCurrentCubeFace(): LiveData<Int> = cubeFace

    /**
     * Indicates whether there is an active connection
     */
    fun isConnected() = bluetoothManager.isConnected


    private fun extractCoordinates(src: String): Pair<Float, Float> {
        val split = src.split(" ")
        return Pair(split[0].toFloat(), split[1].toFloat())
    }

    override fun onCleared() {
        super.onCleared()
        bluetoothManager.onDestroy()
    }
}