package ua.onpu.presentation.viewModels

import androidx.lifecycle.LiveData
import ua.onpu.base.BaseViewModel
import ua.onpu.db.entity.Action
import ua.onpu.repository.ActionRepository
import javax.inject.Inject

class AssignToTrackerViewModel @Inject constructor(private val actionRepository: ActionRepository) : BaseViewModel() {
    fun getAllActions(): LiveData<List<Action>> = actionRepository.getAllActions()
}