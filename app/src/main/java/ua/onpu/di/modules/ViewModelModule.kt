package ua.onpu.di.modules

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ua.onpu.di.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import ua.onpu.di.DaggerViewModelFactory
import ua.onpu.presentation.viewModels.*

@Module
internal abstract class ViewModelModule {

    @Binds
    abstract fun bindViewModelFactory(factory: DaggerViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(SettingsViewModel::class)
    abstract fun bindSettingsViewModel(viewModel: SettingsViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(TrackerViewModel::class)
    abstract fun bindTrackerViewModel(viewModel: TrackerViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ProfileViewModel::class)
    abstract fun bindProfileViewModel(viewModel: ProfileViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(HistoryViewModel::class)
    abstract fun bindHistoryViewModel(viewModel: HistoryViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(AssignToTrackerViewModel::class)
    abstract fun bindAssignToTrackerViewModel(viewModel: AssignToTrackerViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(TimerViewModel::class)
    abstract fun bindTimerViewModel(viewModel: TimerViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(StartActionViewModel::class)
    abstract fun bindStartActionViewModel(viewModel: StartActionViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(AddActionViewModel::class)
    abstract fun bindAddActionViewModel(viewModel: AddActionViewModel): ViewModel
}