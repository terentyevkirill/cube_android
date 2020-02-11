package ua.onpu.core

import androidx.lifecycle.MutableLiveData

class OneTimeLiveData<T>: MutableLiveData<T>() {
    override fun setValue(value: T) {
        super.setValue(value)
        super.setValue(null)
    }
}