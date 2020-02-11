package ua.onpu.repository

import android.util.Log
import androidx.lifecycle.LiveData
import ua.onpu.db.CubeLocalDb
import ua.onpu.db.converters.IntervalWithAction
import ua.onpu.db.entity.Interval
import ua.onpu.networkingApi.ApiService
import javax.inject.Inject

class IntervalRepositoryImpl @Inject constructor(
    private val apiService: ApiService,
    private val cubeLocalDb: CubeLocalDb
) : IntervalRepository {
    override fun deleteAll() {
        Log.i("IntervalRepo", "delete all")
        cubeLocalDb.intervalsDao().deleteAll()
    }

    override fun getTodayTrackedSeconds(): Int? {
        val seconds = cubeLocalDb.intervalsDao().getTodayTrackedSeconds()
        Log.i("IntervalRepo", "trackedSeconds=$seconds")
        return seconds
    }

    override fun getLatestInterval(): Interval? = cubeLocalDb.intervalsDao().getLatest()


    override fun insertInterval(interval: Interval) {
        Log.i("IntervalRepoImpl", "insert!")
        cubeLocalDb.intervalsDao().insert(interval)
    }

    override fun getAllIntervals(): LiveData<List<Interval>> = cubeLocalDb.intervalsDao().getAll()


    override fun getIntervalsWithActions(): LiveData<List<IntervalWithAction>> = cubeLocalDb.intervalsDao().getAllIntervalsWithActions()


    override fun isEmpty(): Boolean = cubeLocalDb.intervalsDao().getLatest() == null

}