package ua.onpu.repository

import androidx.lifecycle.LiveData
import ua.onpu.db.entity.Action

 interface ActionRepository {

    fun getAllActions() : LiveData<List<Action>>
    fun getActionById(id: Long): Action
    fun addAction(action: Action)
    fun editAction(action: Action)
    fun getId():List<Long>
    fun deleteAction(action: Action)
}