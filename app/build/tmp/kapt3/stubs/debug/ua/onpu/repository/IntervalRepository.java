package ua.onpu.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0014\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H&J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00060\u0005H&J\n\u0010\n\u001a\u0004\u0018\u00010\u0007H&J\u000f\u0010\u000b\u001a\u0004\u0018\u00010\fH&\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0007H&J\b\u0010\u0010\u001a\u00020\u0011H&\u00a8\u0006\u0012"}, d2 = {"Lua/onpu/repository/IntervalRepository;", "", "deleteAll", "", "getAllIntervals", "Landroidx/lifecycle/LiveData;", "", "Lua/onpu/db/entity/Interval;", "getIntervalsWithActions", "Lua/onpu/db/converters/IntervalWithAction;", "getLatestInterval", "getTodayTrackedSeconds", "", "()Ljava/lang/Integer;", "insertInterval", "interval", "isEmpty", "", "app_debug"})
public abstract interface IntervalRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<ua.onpu.db.entity.Interval>> getAllIntervals();
    
    public abstract void insertInterval(@org.jetbrains.annotations.NotNull()
    ua.onpu.db.entity.Interval interval);
    
    @org.jetbrains.annotations.Nullable()
    public abstract ua.onpu.db.entity.Interval getLatestInterval();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Integer getTodayTrackedSeconds();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<ua.onpu.db.converters.IntervalWithAction>> getIntervalsWithActions();
    
    public abstract boolean isEmpty();
    
    public abstract void deleteAll();
}