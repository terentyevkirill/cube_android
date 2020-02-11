package ua.onpu.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

abstract class BaseActivity<VM: BaseViewModel>(clazz: Class<VM>): DaggerAppCompatActivity() {

    @get: LayoutRes
    protected abstract val activityResId: Int

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    protected val viewModel: VM by lazy { ViewModelProviders.of(this, viewModelFactory)[clazz] }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activityResId)
        initListeners()
    }

    override fun onStart() {
        super.onStart()
        initObservers()
    }

    open fun initListeners() {}
    open fun initObservers() {}
}