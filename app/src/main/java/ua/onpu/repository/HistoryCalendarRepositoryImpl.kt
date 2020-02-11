package ua.onpu.repository

import ua.onpu.db.CubeLocalDb
import ua.onpu.networkingApi.ApiService
import javax.inject.Inject

class HistoryCalendarRepositoryImpl @Inject constructor(private val apiService: ApiService,
                                                        private val cubeLocalDb: CubeLocalDb) : HistoryCalendarRepository {


}