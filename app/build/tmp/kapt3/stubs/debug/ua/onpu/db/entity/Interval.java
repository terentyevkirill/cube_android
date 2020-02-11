package ua.onpu.db.entity;

import java.lang.System;

@androidx.room.TypeConverters(value = {ua.onpu.db.converters.DateConverter.class})
@androidx.room.Entity(tableName = "interval", indices = {@androidx.room.Index(value = {"action_id"})}, foreignKeys = {@androidx.room.ForeignKey(entity = ua.onpu.db.entity.Action.class, childColumns = {"action_id"}, onDelete = 5, parentColumns = {"id"})})
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bR\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010\u00a8\u0006\u0016"}, d2 = {"Lua/onpu/db/entity/Interval;", "", "id", "", "startTime", "Ljava/util/Date;", "endTime", "actionId", "(JLjava/util/Date;Ljava/util/Date;J)V", "getActionId", "()J", "setActionId", "(J)V", "getEndTime", "()Ljava/util/Date;", "setEndTime", "(Ljava/util/Date;)V", "getId", "setId", "getStartTime", "setStartTime", "Companion", "app_debug"})
public final class Interval {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private long id;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "start_time")
    private java.util.Date startTime;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "end_time")
    private java.util.Date endTime;
    @androidx.room.ColumnInfo(name = "action_id")
    private long actionId;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TABLE_NAME = "interval";
    public static final ua.onpu.db.entity.Interval.Companion Companion = null;
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
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
    
    public final long getActionId() {
        return 0L;
    }
    
    public final void setActionId(long p0) {
    }
    
    public Interval(long id, @org.jetbrains.annotations.NotNull()
    java.util.Date startTime, @org.jetbrains.annotations.NotNull()
    java.util.Date endTime, long actionId) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lua/onpu/db/entity/Interval$Companion;", "", "()V", "TABLE_NAME", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}