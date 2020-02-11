package ua.onpu.presentation.viewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001,B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\rH\u0002J\u000e\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\tJ\b\u0010\u001e\u001a\u0004\u0018\u00010\tJ\b\u0010\u001f\u001a\u0004\u0018\u00010\tJ\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\r2\u0006\u0010#\u001a\u00020\rJ\b\u0010$\u001a\u00020!H\u0016J\u000e\u0010%\u001a\u00020!2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010&\u001a\u00020!2\u0006\u0010\'\u001a\u00020\rJ\u0006\u0010(\u001a\u00020)J\u000e\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020\rR\u000e\u0010\b\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R,\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\u00150\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006-"}, d2 = {"Lua/onpu/presentation/viewModels/TimerViewModel;", "Lua/onpu/base/BaseViewModel;", "Ljava/lang/Runnable;", "intervalRepository", "Lua/onpu/repository/IntervalRepository;", "actionRepository", "Lua/onpu/repository/ActionRepository;", "(Lua/onpu/repository/IntervalRepository;Lua/onpu/repository/ActionRepository;)V", "TAG", "", "action", "Lua/onpu/db/entity/Action;", "recordTimeInMs", "", "recordTimeSwapBuff", "recordUpdateTime", "startRecordTime", "timerHandler", "Landroid/os/Handler;", "timerValue", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Pair;", "getTimerValue", "()Landroidx/lifecycle/MutableLiveData;", "setTimerValue", "(Landroidx/lifecycle/MutableLiveData;)V", "formatTimeLongToString", "param", "getFormattedData", "pattern", "getLastAddedData", "getTotalTodayData", "resumeTimer", "", "prevTimerLengthSeconds", "pauseStartInMs", "run", "setupAction", "setupActionById", "actionId", "startTimer", "", "stopTimer", "startTimeInMs", "TimerEnum", "app_debug"})
public final class TimerViewModel extends ua.onpu.base.BaseViewModel implements java.lang.Runnable {
    private ua.onpu.db.entity.Action action;
    private long startRecordTime;
    private long recordTimeInMs;
    private long recordTimeSwapBuff;
    private long recordUpdateTime;
    private final android.os.Handler timerHandler = null;
    private final java.lang.String TAG = "TimerViewModel";
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<kotlin.Pair<java.lang.String, java.lang.Long>> timerValue;
    private final ua.onpu.repository.IntervalRepository intervalRepository = null;
    private final ua.onpu.repository.ActionRepository actionRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<kotlin.Pair<java.lang.String, java.lang.Long>> getTimerValue() {
        return null;
    }
    
    public final void setTimerValue(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<kotlin.Pair<java.lang.String, java.lang.Long>> p0) {
    }
    
    @java.lang.Override()
    public void run() {
    }
    
    public final void setupAction(@org.jetbrains.annotations.NotNull()
    ua.onpu.db.entity.Action action) {
    }
    
    public final void setupActionById(long actionId) {
    }
    
    public final void resumeTimer(long prevTimerLengthSeconds, long pauseStartInMs) {
    }
    
    public final int startTimer() {
        return 0;
    }
    
    public final void stopTimer(long startTimeInMs) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLastAddedData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFormattedData(@org.jetbrains.annotations.NotNull()
    java.lang.String pattern) {
        return null;
    }
    
    private final java.lang.String formatTimeLongToString(long param) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTotalTodayData() {
        return null;
    }
    
    @javax.inject.Inject()
    public TimerViewModel(@org.jetbrains.annotations.NotNull()
    ua.onpu.repository.IntervalRepository intervalRepository, @org.jetbrains.annotations.NotNull()
    ua.onpu.repository.ActionRepository actionRepository) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lua/onpu/presentation/viewModels/TimerViewModel$TimerEnum;", "", "(Ljava/lang/String;I)V", "TIMERON", "TIMEROFF", "app_debug"})
    public static enum TimerEnum {
        /*public static final*/ TIMERON /* = new TIMERON() */,
        /*public static final*/ TIMEROFF /* = new TIMEROFF() */;
        
        TimerEnum() {
        }
    }
}