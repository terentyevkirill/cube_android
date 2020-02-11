package ua.onpu.base

import androidx.lifecycle.ViewModel
import ua.onpu.core.ResourceProvider
import javax.inject.Inject

abstract class BaseViewModel: ViewModel() {

    @Inject
    protected lateinit var resourceProvider: ResourceProvider
}