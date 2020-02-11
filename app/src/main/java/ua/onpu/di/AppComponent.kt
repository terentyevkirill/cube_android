package ua.onpu.di

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import ua.onpu.CubeApplication
import ua.onpu.di.modules.*
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        AppModule::class,
        ActivityModule::class,
        DatabaseModule::class,
        ViewModelModule::class,
        RepositoryModule::class,
        NetworkingApiModule::class
    ]
)
interface AppComponent : AndroidInjector<CubeApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: CubeApplication): Builder

        fun initAppModule(appModule: AppModule): Builder
        fun initDatabaseModule(databaseModule: DatabaseModule): Builder
        fun initNetworkingApiModule(networkingApiModule: NetworkingApiModule): Builder
        fun initRepositoryModule(repositoryModule: RepositoryModule): Builder
        fun build(): AppComponent
    }
}