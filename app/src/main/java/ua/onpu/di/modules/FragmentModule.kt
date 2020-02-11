package ua.onpu.di.modules

import dagger.Module
import dagger.android.ContributesAndroidInjector
import ua.onpu.presentation.fragments.*
import ua.onpu.presentation.fragments.assignToTracker.AddActionFragment
import ua.onpu.presentation.fragments.assignToTracker.AssignToTrackerFragment
import ua.onpu.presentation.fragments.assignToTracker.EditActionFragment
import ua.onpu.presentation.fragments.settings.ProfileFragment
import ua.onpu.presentation.fragments.settings.SettingsFragment
import ua.onpu.presentation.fragments.settings.TrackerSettingsFragment

@Module
abstract class FragmentModule {

    @ContributesAndroidInjector
    abstract fun bindAssignToTrackerFragment(): AssignToTrackerFragment

    @ContributesAndroidInjector
    abstract fun bindTimerFragment(): TimerFragment

    @ContributesAndroidInjector
    abstract fun bindHistoryFragment(): HistoryFragment

    @ContributesAndroidInjector
    abstract fun bindTrackerFragment(): TrackerSettingsFragment

    @ContributesAndroidInjector
    abstract fun bindSettingsFragment(): SettingsFragment

    @ContributesAndroidInjector
    abstract fun bindProfileFragment(): ProfileFragment

    @ContributesAndroidInjector
    abstract fun bindStartActionFragment(): StartActionFragment

    @ContributesAndroidInjector
    abstract fun bindAddActionFragment(): AddActionFragment

    @ContributesAndroidInjector
    abstract fun bindEditActionFragment(): EditActionFragment

}