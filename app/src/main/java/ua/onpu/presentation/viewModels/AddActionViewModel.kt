package ua.onpu.presentation.viewModels

import ua.onpu.base.BaseViewModel
import ua.onpu.db.entity.Action
import ua.onpu.repository.ActionRepository
import javax.inject.Inject

class AddActionViewModel @Inject constructor(private val actionRepository: ActionRepository) : BaseViewModel()  {

    fun addAction(action: Action)= actionRepository.addAction(action)

    fun editAction(action: Action)= actionRepository.editAction(action)

    fun getId(): List<Long> = actionRepository.getId()

    fun getActionById(id: Long):Action = actionRepository.getActionById(id)

    fun deleteAction(action: Action) = actionRepository.deleteAction(action)
}