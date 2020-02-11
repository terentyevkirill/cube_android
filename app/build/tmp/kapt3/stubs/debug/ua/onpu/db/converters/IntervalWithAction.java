package ua.onpu.db.converters;

import java.lang.System;

@androidx.room.TypeConverters(value = {ua.onpu.db.converters.DateConverter.class})
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\bH\u00c6\u0003J\t\u0010\"\u001a\u00020\nH\u00c6\u0003J;\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\'\u001a\u00020\nH\u00d6\u0001J\t\u0010(\u001a\u00020\bH\u00d6\u0001R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017\u00a8\u0006)"}, d2 = {"Lua/onpu/db/converters/IntervalWithAction;", "", "intervalId", "", "startTime", "Ljava/util/Date;", "endTime", "actionName", "", "actionColor", "", "(JLjava/util/Date;Ljava/util/Date;Ljava/lang/String;I)V", "getActionColor", "()I", "setActionColor", "(I)V", "getActionName", "()Ljava/lang/String;", "setActionName", "(Ljava/lang/String;)V", "getEndTime", "()Ljava/util/Date;", "setEndTime", "(Ljava/util/Date;)V", "getIntervalId", "()J", "setIntervalId", "(J)V", "getStartTime", "setStartTime", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class IntervalWithAction {
    @androidx.room.ColumnInfo(name = "interval_id")
    private long intervalId;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "start_time")
    private java.util.Date startTime;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "end_time")
    private java.util.Date endTime;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "name")
    private java.lang.String actionName;
    @androidx.room.ColumnInfo(name = "color")
    private int actionColor;
    
    public final long getIntervalId() {
        return 0L;
    }
    
    public final void setIntervalId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getStartTime() {
        return null;
    }
    
    public final void setStartTime(@org.jetbrains.annotations.NotNull()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getEndTime() {
        return null;
    }
    
    public final void setEndTime(@org.jetbrains.annotations.NotNull()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getActionName() {
        return null;
    }
    
    public final void setActionName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getActionColor() {
        return 0;
    }
    
    public final void setActionColor(int p0) {
    }
    
    public IntervalWithAction(long intervalId, @org.jetbrains.annotations.NotNull()
    java.util.Date startTime, @org.jetbrains.annotations.NotNull()
    java.util.Date endTime, @org.jetbrains.annotations.NotNull()
    java.lang.String actionName, int actionColor) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.onpu.db.converters.IntervalWithAction copy(long intervalId, @org.jetbrains.annotations.NotNull()
    java.util.Date startTime, @org.jetbrains.annotations.NotNull()
    java.util.Date endTime, @org.jetbrains.annotations.NotNull()
    java.lang.String actionName, int actionColor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}