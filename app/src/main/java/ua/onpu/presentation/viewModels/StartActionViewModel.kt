package ua.onpu.presentation.viewModels

import androidx.lifecycle.LiveData
import ua.onpu.base.BaseViewModel
import ua.onpu.db.entity.Action
import ua.onpu.repository.ActionRepository
import javax.inject.Inject

class StartActionViewModel @Inject constructor(private val actionRepository: ActionRepository): BaseViewModel() {
    fun getAllActions(): LiveData<List<Action>> = actionRepository.getAllActions()
    fun getActionById(id: Long):Action = actionRepository.getActionById(id)
    fun getId(): List<Long> = actionRepository.getId()
}