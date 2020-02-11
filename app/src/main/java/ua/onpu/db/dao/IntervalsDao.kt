package ua.onpu.db.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import ua.onpu.db.entity.Interval
import ua.onpu.db.converters.IntervalWithAction
import ua.onpu.db.entity.Action

@Dao
interface IntervalsDao {

    @Query("SELECT i.id AS interval_id, start_time, end_time, name, color FROM `${Interval.TABLE_NAME}` AS i INNER JOIN `${Action.TABLE_NAME}` AS a ON a.id = i.action_id")
    fun getAllIntervalsWithActions(): LiveData<List<IntervalWithAction>>

    @Query("SELECT i.id AS interval_id, start_time, end_time, name, color FROM `${Interval.TABLE_NAME}` AS i INNER JOIN `${Action.TABLE_NAME}` AS a ON a.id = i.action_id WHERE i.id = :id")
    fun getIntervalWithActions(id: Long): IntervalWithAction

    @Query("SELECT * FROM `${Interval.TABLE_NAME}` WHERE id = :intervalId")
    fun getInterval(intervalId: Long): Interval

    @Query("SELECT * FROM `${Interval.TABLE_NAME}`")
    fun getAll(): LiveData<List<Interval>>

    @Query("SELECT * FROM `${Interval.TABLE_NAME}` ORDER BY end_time DESC LIMIT 1")
    fun getLatest(): Interval?

    @Query("SELECT SUM(strftime('%S', end_time) - strftime('%S', start_time)) FROM `${Interval.TABLE_NAME}`")
    fun getTodayTrackedSeconds(): Int?

    @Insert
    fun insert(interval: Interval): Long

    @Update
    fun update(interval: Interval)

    @Delete
    fun delete(interval: Interval)

    @Query("DELETE FROM `${Interval.TABLE_NAME}`")
    fun deleteAll()
}