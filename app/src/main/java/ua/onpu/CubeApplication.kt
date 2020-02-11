package ua.onpu

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import ua.onpu.di.AppInjector
import ua.onpu.di.AppComponent

class CubeApplication : DaggerApplication() {

    companion object {
        private lateinit var appComponent: AppComponent
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        appComponent = AppInjector.init(this)
        return appComponent
    }
}