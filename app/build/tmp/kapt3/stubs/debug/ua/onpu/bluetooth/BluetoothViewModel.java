package ua.onpu.bluetooth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u000fJ\u001c\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001cJ\u000e\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0019J\u0006\u0010\u001f\u001a\u00020\tJ\u0006\u0010 \u001a\u00020\tJ\b\u0010!\u001a\u00020\u000fH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lua/onpu/bluetooth/BluetoothViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "bluetoothManager", "Lua/onpu/bluetooth/BluetoothManager;", "connectionListener", "Lua/onpu/bluetooth/ConnectionListener;", "connectionStatus", "Landroidx/lifecycle/MutableLiveData;", "", "cubeFace", "", "dataListener", "Lua/onpu/bluetooth/DataListener;", "connect", "", "device", "Landroid/bluetooth/BluetoothDevice;", "context", "Landroid/content/Context;", "disconnect", "extractCoordinates", "Lkotlin/Pair;", "", "src", "", "getConnectionStatus", "getCurrentCubeFace", "Landroidx/lifecycle/LiveData;", "getRemoteDevice", "address", "isBluetoothAvailable", "isConnected", "onCleared", "Companion", "app_debug"})
public final class BluetoothViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> cubeFace = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> connectionStatus = null;
    private final ua.onpu.bluetooth.DataListener dataListener = null;
    private final ua.onpu.bluetooth.ConnectionListener connectionListener = null;
    private final ua.onpu.bluetooth.BluetoothManager bluetoothManager = null;
    private static final java.lang.String TAG = "BluetoothViewModel";
    public static final ua.onpu.bluetooth.BluetoothViewModel.Companion Companion = null;
    
    /**
     * Checks whether Bluetooth is available for the app
     */
    public final boolean isBluetoothAvailable() {
        return false;
    }
    
    /**
     * Provides LiveData representing whether there is an active connected device
     */
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getConnectionStatus() {
        return null;
    }
    
    /**
     * Creates remote device from given address
     */
    @org.jetbrains.annotations.NotNull()
    public final android.bluetooth.BluetoothDevice getRemoteDevice(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        return null;
    }
    
    /**
     * Establishes connection with a given Bluetooth device
     */
    public final void connect(@org.jetbrains.annotations.NotNull()
    android.bluetooth.BluetoothDevice device, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    /**
     * Stops active Bluetooth connection
     */
    public final void disconnect() {
    }
    
    /**
     * Provides LiveData representing current face of cube
     */
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getCurrentCubeFace() {
        return null;
    }
    
    /**
     * Indicates whether there is an active connection
     */
    public final boolean isConnected() {
        return false;
    }
    
    private final kotlin.Pair<java.lang.Float, java.lang.Float> extractCoordinates(java.lang.String src) {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public BluetoothViewModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lua/onpu/bluetooth/BluetoothViewModel$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}