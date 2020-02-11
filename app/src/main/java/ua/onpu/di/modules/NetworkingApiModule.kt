package ua.onpu.di.modules

import dagger.Module
import dagger.Provides
import ua.onpu.networkingApi.ApiService
import ua.onpu.networkingApi.RetrofitClient
import javax.inject.Singleton

@Module
class NetworkingApiModule {

    @Singleton
    @Provides
    fun provideRetrofitApi(): ApiService = RetrofitClient.getInstance().create(ApiService::class.java)
}