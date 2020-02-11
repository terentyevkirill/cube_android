package ua.onpu.di.modules

import android.app.Application
import dagger.Module
import dagger.Provides
import ua.onpu.db.CubeLocalDb
import javax.inject.Singleton

@Module
class DatabaseModule(private val application: Application) {

    @Singleton
    @Provides
    fun provideDb() = CubeLocalDb.getCubeDatabase(application)

}