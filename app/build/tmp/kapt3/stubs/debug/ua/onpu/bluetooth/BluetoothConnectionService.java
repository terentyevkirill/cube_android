package ua.onpu.bluetooth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0003J\u001c\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u000fH\u0002J\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\nH\u0016J\b\u0010\u001e\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lua/onpu/bluetooth/BluetoothConnectionService;", "Landroid/app/Service;", "()V", "bluetoothManager", "Lua/onpu/bluetooth/BluetoothManager;", "connectionStateListener", "Lua/onpu/bluetooth/ConnectionListener;", "dataListener", "Lua/onpu/bluetooth/DataListener;", "broadcastCurrentCubeFace", "", "face", "", "broadcastEvent", "event", "", "createNotification", "Landroid/app/Notification;", "createNotificationChannel", "id", "channelName", "extractCoordinates", "Lkotlin/Pair;", "", "src", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "onDestroy", "Companion", "app_debug"})
public final class BluetoothConnectionService extends android.app.Service {
    private final ua.onpu.bluetooth.DataListener dataListener = null;
    private final ua.onpu.bluetooth.ConnectionListener connectionStateListener = null;
    private final ua.onpu.bluetooth.BluetoothManager bluetoothManager = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_DEVICE_CONNECTED = "action_device_connected";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_DEVICE_DISCONNECTED = "action_device_disconnected";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_CUBE_FACE_DATA_SENT = "action_cube_face_data_sent";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_SERVICE_CREATED = "action_service_created";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_SERVICE_DESTROYED = "action_service_destroyed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_CUBE_FACE = "cube_face";
    private static final int FOREGROUND_ID = 6;
    private static final java.lang.String NOTIFICATION_CHANNEL_NAME = "Connection Service";
    private static final java.lang.String NOTIFICATION_CHANNEL_ID = "connection_service";
    public static final ua.onpu.bluetooth.BluetoothConnectionService.Companion Companion = null;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final void broadcastEvent(java.lang.String event) {
    }
    
    private final void broadcastCurrentCubeFace(int face) {
    }
    
    private final kotlin.Pair<java.lang.Float, java.lang.Float> extractCoordinates(java.lang.String src) {
        return null;
    }
    
    private final android.app.Notification createNotification() {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    private final java.lang.String createNotificationChannel(java.lang.String id, java.lang.String channelName) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.os.IBinder onBind(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
        return null;
    }
    
    public BluetoothConnectionService() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lua/onpu/bluetooth/BluetoothConnectionService$Companion;", "", "()V", "ACTION_CUBE_FACE_DATA_SENT", "", "ACTION_DEVICE_CONNECTED", "ACTION_DEVICE_DISCONNECTED", "ACTION_SERVICE_CREATED", "ACTION_SERVICE_DESTROYED", "EXTRA_CUBE_FACE", "FOREGROUND_ID", "", "NOTIFICATION_CHANNEL_ID", "NOTIFICATION_CHANNEL_NAME", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}