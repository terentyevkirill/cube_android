package ua.onpu.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Lua/onpu/di/AppComponent;", "Ldagger/android/AndroidInjector;", "Lua/onpu/CubeApplication;", "Builder", "app_debug"})
@dagger.Component(modules = {dagger.android.AndroidInjectionModule.class, ua.onpu.di.modules.AppModule.class, ua.onpu.di.modules.ActivityModule.class, ua.onpu.di.modules.DatabaseModule.class, ua.onpu.di.modules.ViewModelModule.class, ua.onpu.di.modules.RepositoryModule.class, ua.onpu.di.modules.NetworkingApiModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent extends dagger.android.AndroidInjector<ua.onpu.CubeApplication> {
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011H&\u00a8\u0006\u0012"}, d2 = {"Lua/onpu/di/AppComponent$Builder;", "", "application", "Lua/onpu/CubeApplication;", "build", "Lua/onpu/di/AppComponent;", "initAppModule", "appModule", "Lua/onpu/di/modules/AppModule;", "initDatabaseModule", "databaseModule", "Lua/onpu/di/modules/DatabaseModule;", "initNetworkingApiModule", "networkingApiModule", "Lua/onpu/di/modules/NetworkingApiModule;", "initRepositoryModule", "repositoryModule", "Lua/onpu/di/modules/RepositoryModule;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract ua.onpu.di.AppComponent.Builder application(@org.jetbrains.annotations.NotNull()
        ua.onpu.CubeApplication application);
        
        @org.jetbrains.annotations.NotNull()
        public abstract ua.onpu.di.AppComponent.Builder initAppModule(@org.jetbrains.annotations.NotNull()
        ua.onpu.di.modules.AppModule appModule);
        
        @org.jetbrains.annotations.NotNull()
        public abstract ua.onpu.di.AppComponent.Builder initDatabaseModule(@org.jetbrains.annotations.NotNull()
        ua.onpu.di.modules.DatabaseModule databaseModule);
        
        @org.jetbrains.annotations.NotNull()
        public abstract ua.onpu.di.AppComponent.Builder initNetworkingApiModule(@org.jetbrains.annotations.NotNull()
        ua.onpu.di.modules.NetworkingApiModule networkingApiModule);
        
        @org.jetbrains.annotations.NotNull()
        public abstract ua.onpu.di.AppComponent.Builder initRepositoryModule(@org.jetbrains.annotations.NotNull()
        ua.onpu.di.modules.RepositoryModule repositoryModule);
        
        @org.jetbrains.annotations.NotNull()
        public abstract ua.onpu.di.AppComponent build();
    }
}