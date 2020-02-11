package ua.onpu.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'J\b\u0010\t\u001a\u00020\nH\'J\b\u0010\u000b\u001a\u00020\fH\'J\b\u0010\r\u001a\u00020\u000eH\'J\b\u0010\u000f\u001a\u00020\u0010H\'J\b\u0010\u0011\u001a\u00020\u0012H\'J\b\u0010\u0013\u001a\u00020\u0014H\'\u00a8\u0006\u0015"}, d2 = {"Lua/onpu/di/modules/FragmentModule;", "", "()V", "bindAddActionFragment", "Lua/onpu/presentation/fragments/assignToTracker/AddActionFragment;", "bindAssignToTrackerFragment", "Lua/onpu/presentation/fragments/assignToTracker/AssignToTrackerFragment;", "bindEditActionFragment", "Lua/onpu/presentation/fragments/assignToTracker/EditActionFragment;", "bindHistoryFragment", "Lua/onpu/presentation/fragments/HistoryFragment;", "bindProfileFragment", "Lua/onpu/presentation/fragments/settings/ProfileFragment;", "bindSettingsFragment", "Lua/onpu/presentation/fragments/settings/SettingsFragment;", "bindStartActionFragment", "Lua/onpu/presentation/fragments/StartActionFragment;", "bindTimerFragment", "Lua/onpu/presentation/fragments/TimerFragment;", "bindTrackerFragment", "Lua/onpu/presentation/fragments/settings/TrackerSettingsFragment;", "app_debug"})
@dagger.Module()
public abstract class FragmentModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.onpu.presentation.fragments.assignToTracker.AssignToTrackerFragment bindAssignToTrackerFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.onpu.presentation.fragments.TimerFragment bindTimerFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.onpu.presentation.fragments.HistoryFragment bindHistoryFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.onpu.presentation.fragments.settings.TrackerSettingsFragment bindTrackerFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.onpu.presentation.fragments.settings.SettingsFragment bindSettingsFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.onpu.presentation.fragments.settings.ProfileFragment bindProfileFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.onpu.presentation.fragments.StartActionFragment bindStartActionFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.onpu.presentation.fragments.assignToTracker.AddActionFragment bindAddActionFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.onpu.presentation.fragments.assignToTracker.EditActionFragment bindEditActionFragment();
    
    public FragmentModule() {
        super();
    }
}