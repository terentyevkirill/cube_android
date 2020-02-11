package ua.onpu.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lua/onpu/core/PrefUtil;", "", "()V", "Companion", "app_debug"})
public final class PrefUtil {
    private static final java.lang.String PREVIOUS_TIMER_LENGTH_SECONDS_ID = "previous_timer_length_seconds";
    private static final java.lang.String TIMER_STATE_ID = "timer_state";
    private static final java.lang.String PAUSE_START_ID = "pause_start_id";
    private static final java.lang.String START_TIME_ID = "start_time_id";
    private static final java.lang.String PREVIOUS_ACTION_ID = "previous_action_id";
    public static final ua.onpu.core.PrefUtil.Companion Companion = null;
    
    public PrefUtil() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\r\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\u000e\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\u000f\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\u0010\u001a\u00020\u00112\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0018\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0018\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0018\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00112\b\u0010\u000b\u001a\u0004\u0018\u00010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lua/onpu/core/PrefUtil$Companion;", "", "()V", "PAUSE_START_ID", "", "PREVIOUS_ACTION_ID", "PREVIOUS_TIMER_LENGTH_SECONDS_ID", "START_TIME_ID", "TIMER_STATE_ID", "getPauseStart", "", "context", "Landroid/content/Context;", "getPreviousActionId", "getPreviousTimerLengthSeconds", "getStartTime", "getTimerState", "Lua/onpu/presentation/fragments/TimerFragment$TimerState;", "setPauseStart", "", "pauseStartInMs", "setPreviousActionId", "actionId", "setPreviousTimerLengthSeconds", "seconds", "setStartTime", "startTimeInMs", "setTimerState", "state", "app_debug"})
    public static final class Companion {
        
        public final long getPreviousTimerLengthSeconds(@org.jetbrains.annotations.Nullable()
        android.content.Context context) {
            return 0L;
        }
        
        public final void setPreviousTimerLengthSeconds(long seconds, @org.jetbrains.annotations.Nullable()
        android.content.Context context) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ua.onpu.presentation.fragments.TimerFragment.TimerState getTimerState(@org.jetbrains.annotations.Nullable()
        android.content.Context context) {
            return null;
        }
        
        public final void setTimerState(@org.jetbrains.annotations.NotNull()
        ua.onpu.presentation.fragments.TimerFragment.TimerState state, @org.jetbrains.annotations.Nullable()
        android.content.Context context) {
        }
        
        public final long getPauseStart(@org.jetbrains.annotations.Nullable()
        android.content.Context context) {
            return 0L;
        }
        
        public final void setPauseStart(long pauseStartInMs, @org.jetbrains.annotations.Nullable()
        android.content.Context context) {
        }
        
        public final long getStartTime(@org.jetbrains.annotations.Nullable()
        android.content.Context context) {
            return 0L;
        }
        
        public final void setStartTime(long startTimeInMs, @org.jetbrains.annotations.Nullable()
        android.content.Context context) {
        }
        
        public final long getPreviousActionId(@org.jetbrains.annotations.Nullable()
        android.content.Context context) {
            return 0L;
        }
        
        public final void setPreviousActionId(long actionId, @org.jetbrains.annotations.Nullable()
        android.content.Context context) {
        }
        
        private Companion() {
            super();
        }
    }
}