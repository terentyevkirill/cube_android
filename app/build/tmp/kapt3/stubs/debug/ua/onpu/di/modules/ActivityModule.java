package ua.onpu.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'\u00a8\u0006\u0005"}, d2 = {"Lua/onpu/di/modules/ActivityModule;", "", "()V", "bindLobbyActivity", "Lua/onpu/presentation/activity/LobbyActivity;", "app_debug"})
@dagger.Module(includes = {ua.onpu.di.modules.FragmentModule.class})
public abstract class ActivityModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.onpu.presentation.activity.LobbyActivity bindLobbyActivity();
    
    public ActivityModule() {
        super();
    }
}