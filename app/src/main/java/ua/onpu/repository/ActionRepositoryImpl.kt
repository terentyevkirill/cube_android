package ua.onpu.repository

import ua.onpu.db.CubeLocalDb
import ua.onpu.db.entity.Action
import ua.onpu.networkingApi.ApiService
import javax.inject.Inject

class ActionRepositoryImpl @Inject constructor(private val apiService: ApiService, private val cubeLocalDb: CubeLocalDb) : ActionRepository {

    override fun getActionById(id: Long): Action = cubeLocalDb.actionsDao().get(id)

    override fun getAllActions() = cubeLocalDb.actionsDao().getAllAction()

    override fun addAction(action: Action) = cubeLocalDb.actionsDao().add(action)

    override fun getId(): List<Long> = cubeLocalDb.actionsDao().getIds()

    override fun editAction(action: Action) = cubeLocalDb.actionsDao().update(action)

    override fun deleteAction(action: Action) = cubeLocalDb.actionsDao().delete(action)
}