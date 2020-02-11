package ua.onpu.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import dagger.android.support.DaggerFragment
import javax.inject.Inject

abstract class BaseFragment<VM : BaseViewModel>(clazz: Class<VM>) : DaggerFragment() {

    @get: LayoutRes
    protected abstract val fragmentLayout: Int

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    protected val viewModel: VM by lazy { ViewModelProviders.of(this, viewModelFactory)[clazz] }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListeners()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(fragmentLayout, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initObservers()
    }

    open fun initListeners() {}
    open fun initObservers() {}
}