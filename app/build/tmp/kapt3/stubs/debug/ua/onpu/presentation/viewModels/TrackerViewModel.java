package ua.onpu.presentation.viewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\b\u0010)\u001a\u00020*H\u0002J\u0006\u0010+\u001a\u00020*J\u0006\u0010,\u001a\u00020*J\u0006\u0010-\u001a\u00020*J\b\u0010.\u001a\u00020\u0014H\u0002J\b\u0010/\u001a\u00020\u0014H\u0002J\u000e\u00100\u001a\u00020*2\u0006\u00101\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000R#\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00060\u001e0\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082.\u00a2\u0006\u0002\n\u0000R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u0017\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0010\u00a8\u00062"}, d2 = {"Lua/onpu/presentation/viewModels/TrackerViewModel;", "Lua/onpu/base/BaseViewModel;", "()V", "DEVICE_ADDRESS", "", "ENABLE_BLUETOOTH_ACTIVITY_CODE", "", "MY_UUID", "Ljava/util/UUID;", "kotlin.jvm.PlatformType", "buffer", "", "bufferPosition", "data", "Landroidx/lifecycle/MutableLiveData;", "getData", "()Landroidx/lifecycle/MutableLiveData;", "device", "Landroid/bluetooth/BluetoothDevice;", "deviceConnected", "", "inputStream", "Ljava/io/InputStream;", "isBluetoothEnabled", "outputStream", "Ljava/io/OutputStream;", "socket", "Landroid/bluetooth/BluetoothSocket;", "startActivityForResult", "Lua/onpu/core/OneTimeLiveData;", "Lkotlin/Pair;", "Landroid/content/Intent;", "getStartActivityForResult", "()Lua/onpu/core/OneTimeLiveData;", "stopThread", "thread", "Ljava/lang/Thread;", "toastLiveData", "getToastLiveData", "toolbarTitle", "getToolbarTitle", "beginListenForData", "", "clearData", "disableBluetooth", "enableBluetooth", "isBtConnected", "isBtInitialized", "send", "command", "app_debug"})
public final class TrackerViewModel extends ua.onpu.base.BaseViewModel {
    private final int ENABLE_BLUETOOTH_ACTIVITY_CODE = 0;
    private final java.util.UUID MY_UUID = null;
    private final java.lang.String DEVICE_ADDRESS = "20:18:08:34:ED:E1";
    private android.bluetooth.BluetoothDevice device;
    private android.bluetooth.BluetoothSocket socket;
    private java.io.OutputStream outputStream;
    private java.io.InputStream inputStream;
    private boolean deviceConnected;
    private java.lang.Thread thread;
    private byte[] buffer;
    private int bufferPosition;
    private boolean stopThread;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isBluetoothEnabled = null;
    @org.jetbrains.annotations.NotNull()
    private final ua.onpu.core.OneTimeLiveData<java.lang.String> toastLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> data = null;
    @org.jetbrains.annotations.NotNull()
    private final ua.onpu.core.OneTimeLiveData<kotlin.Pair<android.content.Intent, java.lang.Integer>> startActivityForResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> toolbarTitle = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isBluetoothEnabled() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.onpu.core.OneTimeLiveData<java.lang.String> getToastLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.onpu.core.OneTimeLiveData<kotlin.Pair<android.content.Intent, java.lang.Integer>> getStartActivityForResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getToolbarTitle() {
        return null;
    }
    
    public final void enableBluetooth() {
    }
    
    public final void disableBluetooth() {
    }
    
    public final void clearData() {
    }
    
    public final void send(@org.jetbrains.annotations.NotNull()
    java.lang.String command) {
    }
    
    private final boolean isBtInitialized() {
        return false;
    }
    
    private final boolean isBtConnected() {
        return false;
    }
    
    private final void beginListenForData() {
    }
    
    @javax.inject.Inject()
    public TrackerViewModel() {
        super();
    }
}