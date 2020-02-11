package ua.onpu.bluetooth

interface ConnectionListener {
    fun onConnected()
    fun onDisconnected()
}