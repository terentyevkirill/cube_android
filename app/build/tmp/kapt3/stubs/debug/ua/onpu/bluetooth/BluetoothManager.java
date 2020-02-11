package ua.onpu.bluetooth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \'2\u00020\u0001:\u0001\'B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u001bJ\u000e\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020#J\u0006\u0010$\u001a\u00020\u0017J\u0006\u0010%\u001a\u00020\u0017J\u0006\u0010&\u001a\u00020\u001bR\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0017@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006("}, d2 = {"Lua/onpu/bluetooth/BluetoothManager;", "", "dataListener", "Lua/onpu/bluetooth/DataListener;", "connectionListener", "Lua/onpu/bluetooth/ConnectionListener;", "(Lua/onpu/bluetooth/DataListener;Lua/onpu/bluetooth/ConnectionListener;)V", "bluetoothAdapter", "Landroid/bluetooth/BluetoothAdapter;", "kotlin.jvm.PlatformType", "getConnectionListener", "()Lua/onpu/bluetooth/ConnectionListener;", "setConnectionListener", "(Lua/onpu/bluetooth/ConnectionListener;)V", "getDataListener", "()Lua/onpu/bluetooth/DataListener;", "setDataListener", "(Lua/onpu/bluetooth/DataListener;)V", "gatt", "Landroid/bluetooth/BluetoothGatt;", "gattCallback", "Landroid/bluetooth/BluetoothGattCallback;", "<set-?>", "", "isConnected", "()Z", "connectTo", "", "device", "Landroid/bluetooth/BluetoothDevice;", "context", "Landroid/content/Context;", "disconnect", "getRemoteDevice", "address", "", "isBluetoothEnabled", "isBluetoothSupported", "onDestroy", "Companion", "app_debug"})
public final class BluetoothManager {
    private final android.bluetooth.BluetoothAdapter bluetoothAdapter = null;
    private android.bluetooth.BluetoothGatt gatt;
    private boolean isConnected;
    private final android.bluetooth.BluetoothGattCallback gattCallback = null;
    @org.jetbrains.annotations.Nullable()
    private ua.onpu.bluetooth.DataListener dataListener;
    @org.jetbrains.annotations.Nullable()
    private ua.onpu.bluetooth.ConnectionListener connectionListener;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PROTOTYPE_ADDRESS = "90:E2:02:BE:E3:0E";
    private static final java.lang.String TAG = "BluetoothManager";
    public static final ua.onpu.bluetooth.BluetoothManager.Companion Companion = null;
    
    public final boolean isConnected() {
        return false;
    }
    
    public final boolean isBluetoothSupported() {
        return false;
    }
    
    public final boolean isBluetoothEnabled() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.bluetooth.BluetoothDevice getRemoteDevice(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        return null;
    }
    
    public final void connectTo(@org.jetbrains.annotations.NotNull()
    android.bluetooth.BluetoothDevice device, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void disconnect() {
    }
    
    public final void onDestroy() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ua.onpu.bluetooth.DataListener getDataListener() {
        return null;
    }
    
    public final void setDataListener(@org.jetbrains.annotations.Nullable()
    ua.onpu.bluetooth.DataListener p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ua.onpu.bluetooth.ConnectionListener getConnectionListener() {
        return null;
    }
    
    public final void setConnectionListener(@org.jetbrains.annotations.Nullable()
    ua.onpu.bluetooth.ConnectionListener p0) {
    }
    
    public BluetoothManager(@org.jetbrains.annotations.Nullable()
    ua.onpu.bluetooth.DataListener dataListener, @org.jetbrains.annotations.Nullable()
    ua.onpu.bluetooth.ConnectionListener connectionListener) {
        super();
    }
    
    public BluetoothManager() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lua/onpu/bluetooth/BluetoothManager$Companion;", "", "()V", "PROTOTYPE_ADDRESS", "", "TAG", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}