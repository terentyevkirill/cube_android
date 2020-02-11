package ua.onpu.di

import ua.onpu.CubeApplication
import ua.onpu.di.modules.AppModule
import ua.onpu.di.modules.DatabaseModule
import ua.onpu.di.modules.NetworkingApiModule
import ua.onpu.di.modules.RepositoryModule

object AppInjector {

    @JvmStatic
    fun init(app: CubeApplication): AppComponent {
        return DaggerAppComponent
            .builder()
            .application(app)
            .initAppModule(AppModule(app))
            .initDatabaseModule(DatabaseModule(app))
            .initRepositoryModule(RepositoryModule(app))
            .initNetworkingApiModule(NetworkingApiModule())
            .build()
    }
}