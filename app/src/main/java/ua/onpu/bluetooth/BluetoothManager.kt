package ua.onpu.bluetooth

import android.bluetooth.*
import android.content.Context
import android.util.Log.v

class BluetoothManager(var dataListener: DataListener? = null,
                       var connectionListener: ConnectionListener? = null) {

    companion object {
        const val PROTOTYPE_ADDRESS = "90:E2:02:BE:E3:0E"

        private const val TAG = "BluetoothManager"
    }

    private val bluetoothAdapter = BluetoothAdapter.getDefaultAdapter()

    private var gatt: BluetoothGatt? = null

    var isConnected = false
        private set

    private val gattCallback = object : BluetoothGattCallback() {
        override fun onConnectionStateChange(gatt: BluetoothGatt?, status: Int, newState: Int) {
            super.onConnectionStateChange(gatt, status, newState)
            if (newState == BluetoothGatt.STATE_CONNECTED) {
                v(TAG, "onConnected")
                isConnected = true
                connectionListener?.onConnected()
                gatt?.discoverServices()
            }
        }

        override fun onServicesDiscovered(gatt: BluetoothGatt?, status: Int) {
            super.onServicesDiscovered(gatt, status)
            v(TAG, "onServicesDiscovered")
            gatt?.services?.forEach { service ->
                service.characteristics.forEach { characteristic ->
                    gatt.setCharacteristicNotification(characteristic, true)
                }
            }
        }

        override fun onCharacteristicChanged(gatt: BluetoothGatt?, characteristic: BluetoothGattCharacteristic?) {
            super.onCharacteristicChanged(gatt, characteristic)
            val value = characteristic?.getStringValue(0)
            v(TAG, "onCharacteristicChanged, payload = $value")
            if (value != null) {
                dataListener?.onData(value)
            }
        }
    }

    fun isBluetoothSupported() = bluetoothAdapter != null

    fun isBluetoothEnabled() = bluetoothAdapter.isEnabled

    fun getRemoteDevice(address: String): BluetoothDevice = bluetoothAdapter.getRemoteDevice(address)

    fun connectTo(device: BluetoothDevice, context: Context) {
        this.gatt = device.connectGatt(context, true, gattCallback)
    }

    fun disconnect() {
        this.gatt?.disconnect()
        connectionListener?.onDisconnected()
        isConnected = false
    }

    fun onDestroy() {
        this.gatt?.close()
    }

}