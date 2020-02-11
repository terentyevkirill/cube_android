package ua.onpu.di.modules

import dagger.Module
import dagger.android.ContributesAndroidInjector
import ua.onpu.presentation.activity.LobbyActivity

@Module(includes = [FragmentModule::class])
abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract fun bindLobbyActivity(): LobbyActivity

}