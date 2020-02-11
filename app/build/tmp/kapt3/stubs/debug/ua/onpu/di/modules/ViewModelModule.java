package ua.onpu.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b!\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH\'J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\fH\'J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000eH\'J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0010H\'J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0012H\'J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0014H\'J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\'\u00a8\u0006\u0019"}, d2 = {"Lua/onpu/di/modules/ViewModelModule;", "", "()V", "bindAddActionViewModel", "Landroidx/lifecycle/ViewModel;", "viewModel", "Lua/onpu/presentation/viewModels/AddActionViewModel;", "bindAssignToTrackerViewModel", "Lua/onpu/presentation/viewModels/AssignToTrackerViewModel;", "bindHistoryViewModel", "Lua/onpu/presentation/viewModels/HistoryViewModel;", "bindProfileViewModel", "Lua/onpu/presentation/viewModels/ProfileViewModel;", "bindSettingsViewModel", "Lua/onpu/presentation/viewModels/SettingsViewModel;", "bindStartActionViewModel", "Lua/onpu/presentation/viewModels/StartActionViewModel;", "bindTimerViewModel", "Lua/onpu/presentation/viewModels/TimerViewModel;", "bindTrackerViewModel", "Lua/onpu/presentation/viewModels/TrackerViewModel;", "bindViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lua/onpu/di/DaggerViewModelFactory;", "app_debug"})
@dagger.Module()
public abstract class ViewModelModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModelProvider.Factory bindViewModelFactory(@org.jetbrains.annotations.NotNull()
    ua.onpu.di.DaggerViewModelFactory factory);
    
    @org.jetbrains.annotations.NotNull()
    @ua.onpu.di.ViewModelKey(value = ua.onpu.presentation.viewModels.SettingsViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindSettingsViewModel(@org.jetbrains.annotations.NotNull()
    ua.onpu.presentation.viewModels.SettingsViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ua.onpu.di.ViewModelKey(value = ua.onpu.presentation.viewModels.TrackerViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindTrackerViewModel(@org.jetbrains.annotations.NotNull()
    ua.onpu.presentation.viewModels.TrackerViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ua.onpu.di.ViewModelKey(value = ua.onpu.presentation.viewModels.ProfileViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindProfileViewModel(@org.jetbrains.annotations.NotNull()
    ua.onpu.presentation.viewModels.ProfileViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ua.onpu.di.ViewModelKey(value = ua.onpu.presentation.viewModels.HistoryViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindHistoryViewModel(@org.jetbrains.annotations.NotNull()
    ua.onpu.presentation.viewModels.HistoryViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ua.onpu.di.ViewModelKey(value = ua.onpu.presentation.viewModels.AssignToTrackerViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindAssignToTrackerViewModel(@org.jetbrains.annotations.NotNull()
    ua.onpu.presentation.viewModels.AssignToTrackerViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ua.onpu.di.ViewModelKey(value = ua.onpu.presentation.viewModels.TimerViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindTimerViewModel(@org.jetbrains.annotations.NotNull()
    ua.onpu.presentation.viewModels.TimerViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ua.onpu.di.ViewModelKey(value = ua.onpu.presentation.viewModels.StartActionViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindStartActionViewModel(@org.jetbrains.annotations.NotNull()
    ua.onpu.presentation.viewModels.StartActionViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ua.onpu.di.ViewModelKey(value = ua.onpu.presentation.viewModels.AddActionViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindAddActionViewModel(@org.jetbrains.annotations.NotNull()
    ua.onpu.presentation.viewModels.AddActionViewModel viewModel);
    
    public ViewModelModule() {
        super();
    }
}