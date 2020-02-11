package ua.onpu.db.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0003H\'J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\'J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\t0\bH\'J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\'J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000eH\'J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\'J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\'\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0017"}, d2 = {"Lua/onpu/db/dao/IntervalsDao;", "", "delete", "", "interval", "Lua/onpu/db/entity/Interval;", "deleteAll", "getAll", "Landroidx/lifecycle/LiveData;", "", "getAllIntervalsWithActions", "Lua/onpu/db/converters/IntervalWithAction;", "getInterval", "intervalId", "", "getIntervalWithActions", "id", "getLatest", "getTodayTrackedSeconds", "", "()Ljava/lang/Integer;", "insert", "update", "app_debug"})
public abstract interface IntervalsDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT i.id AS interval_id, start_time, end_time, name, color FROM `interval` AS i INNER JOIN `action` AS a ON a.id = i.action_id")
    public abstract androidx.lifecycle.LiveData<java.util.List<ua.onpu.db.converters.IntervalWithAction>> getAllIntervalsWithActions();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT i.id AS interval_id, start_time, end_time, name, color FROM `interval` AS i INNER JOIN `action` AS a ON a.id = i.action_id WHERE i.id = :id")
    public abstract ua.onpu.db.converters.IntervalWithAction getIntervalWithActions(long id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM `interval` WHERE id = :intervalId")
    public abstract ua.onpu.db.entity.Interval getInterval(long intervalId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM `interval`")
    public abstract androidx.lifecycle.LiveData<java.util.List<ua.onpu.db.entity.Interval>> getAll();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM `interval` ORDER BY end_time DESC LIMIT 1")
    public abstract ua.onpu.db.entity.Interval getLatest();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT SUM(strftime(\'%S\', end_time) - strftime(\'%S\', start_time)) FROM `interval`")
    public abstract java.lang.Integer getTodayTrackedSeconds();
    
    @androidx.room.Insert()
    public abstract long insert(@org.jetbrains.annotations.NotNull()
    ua.onpu.db.entity.Interval interval);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    ua.onpu.db.entity.Interval interval);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    ua.onpu.db.entity.Interval interval);
    
    @androidx.room.Query(value = "DELETE FROM `interval`")
    public abstract void deleteAll();
}