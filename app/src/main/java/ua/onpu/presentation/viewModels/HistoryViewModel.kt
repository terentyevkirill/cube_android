package ua.onpu.presentation.viewModels

import androidx.lifecycle.LiveData
import ua.onpu.base.BaseViewModel
import ua.onpu.db.converters.IntervalWithAction
import ua.onpu.repository.IntervalRepository
import javax.inject.Inject

class HistoryViewModel @Inject constructor(private val intervalRepository: IntervalRepository) : BaseViewModel() {

    private val intervalsWithActions = intervalRepository.getIntervalsWithActions()

    fun isHistoryEmpty(): Boolean = intervalRepository.isEmpty()


    fun getAllIntervalsWithActions(): LiveData<List<IntervalWithAction>> = intervalsWithActions


    fun deleteAllIntervals() {
        intervalRepository.deleteAll()
    }
}