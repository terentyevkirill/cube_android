package ua.onpu.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nH\u0016J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\nH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0016J\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\fH\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lua/onpu/repository/IntervalRepositoryImpl;", "Lua/onpu/repository/IntervalRepository;", "apiService", "Lua/onpu/networkingApi/ApiService;", "cubeLocalDb", "Lua/onpu/db/CubeLocalDb;", "(Lua/onpu/networkingApi/ApiService;Lua/onpu/db/CubeLocalDb;)V", "deleteAll", "", "getAllIntervals", "Landroidx/lifecycle/LiveData;", "", "Lua/onpu/db/entity/Interval;", "getIntervalsWithActions", "Lua/onpu/db/converters/IntervalWithAction;", "getLatestInterval", "getTodayTrackedSeconds", "", "()Ljava/lang/Integer;", "insertInterval", "interval", "isEmpty", "", "app_debug"})
public final class IntervalRepositoryImpl implements ua.onpu.repository.IntervalRepository {
    private final ua.onpu.networkingApi.ApiService apiService = null;
    private final ua.onpu.db.CubeLocalDb cubeLocalDb = null;
    
    @java.lang.Override()
    public void deleteAll() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Integer getTodayTrackedSeconds() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public ua.onpu.db.entity.Interval getLatestInterval() {
        return null;
    }
    
    @java.lang.Override()
    public void insertInterval(@org.jetbrains.annotations.NotNull()
    ua.onpu.db.entity.Interval interval) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<ua.onpu.db.entity.Interval>> getAllIntervals() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<ua.onpu.db.converters.IntervalWithAction>> getIntervalsWithActions() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isEmpty() {
        return false;
    }
    
    @javax.inject.Inject()
    public IntervalRepositoryImpl(@org.jetbrains.annotations.NotNull()
    ua.onpu.networkingApi.ApiService apiService, @org.jetbrains.annotations.NotNull()
    ua.onpu.db.CubeLocalDb cubeLocalDb) {
        super();
    }
}