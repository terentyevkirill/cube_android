package ua.onpu.di.modules

import android.content.Context
import dagger.Module
import dagger.Provides
import ua.onpu.db.CubeLocalDb
import ua.onpu.networkingApi.ApiService
import ua.onpu.repository.*
import javax.inject.Singleton

@Module
class RepositoryModule(val context: Context) {

    @Singleton
    @Provides
    fun provideTimerRepository(apiService: ApiService, cubeLocalDb: CubeLocalDb): IntervalRepository =
        IntervalRepositoryImpl(apiService, cubeLocalDb)

    @Singleton
    @Provides
    fun provideHistoryCalendarRepository(apiService: ApiService, cubeLocalDb: CubeLocalDb): HistoryCalendarRepository =
        HistoryCalendarRepositoryImpl(apiService, cubeLocalDb)

    @Singleton
    @Provides
    fun provideActionRepository(apiService: ApiService, cubeLocalDb: CubeLocalDb): ActionRepository =
        ActionRepositoryImpl(apiService, cubeLocalDb)

}