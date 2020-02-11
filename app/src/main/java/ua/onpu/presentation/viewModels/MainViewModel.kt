package ua.onpu.presentation.viewModels

import androidx.lifecycle.MutableLiveData
import ua.onpu.base.BaseViewModel
import javax.inject.Inject

class MainViewModel@Inject constructor() : BaseViewModel() {
    var toolbarTitle: MutableLiveData<String> = MutableLiveData()
}