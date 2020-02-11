package ua.onpu.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lua/onpu/di/modules/RepositoryModule;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "provideActionRepository", "Lua/onpu/repository/ActionRepository;", "apiService", "Lua/onpu/networkingApi/ApiService;", "cubeLocalDb", "Lua/onpu/db/CubeLocalDb;", "provideHistoryCalendarRepository", "Lua/onpu/repository/HistoryCalendarRepository;", "provideTimerRepository", "Lua/onpu/repository/IntervalRepository;", "app_debug"})
@dagger.Module()
public final class RepositoryModule {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final ua.onpu.repository.IntervalRepository provideTimerRepository(@org.jetbrains.annotations.NotNull()
    ua.onpu.networkingApi.ApiService apiService, @org.jetbrains.annotations.NotNull()
    ua.onpu.db.CubeLocalDb cubeLocalDb) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final ua.onpu.repository.HistoryCalendarRepository provideHistoryCalendarRepository(@org.jetbrains.annotations.NotNull()
    ua.onpu.networkingApi.ApiService apiService, @org.jetbrains.annotations.NotNull()
    ua.onpu.db.CubeLocalDb cubeLocalDb) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final ua.onpu.repository.ActionRepository provideActionRepository(@org.jetbrains.annotations.NotNull()
    ua.onpu.networkingApi.ApiService apiService, @org.jetbrains.annotations.NotNull()
    ua.onpu.db.CubeLocalDb cubeLocalDb) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public RepositoryModule(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}