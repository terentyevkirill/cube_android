package ua.onpu.repository

import androidx.lifecycle.LiveData
import ua.onpu.db.converters.IntervalWithAction
import ua.onpu.db.entity.Interval

interface IntervalRepository {
    fun getAllIntervals(): LiveData<List<Interval>>
    fun insertInterval(interval: Interval)
    fun getLatestInterval(): Interval?
    fun getTodayTrackedSeconds(): Int?
    fun getIntervalsWithActions(): LiveData<List<IntervalWithAction>>
    fun isEmpty(): Boolean
    fun deleteAll()
}