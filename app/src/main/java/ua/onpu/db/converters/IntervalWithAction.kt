package ua.onpu.db.converters

import androidx.room.ColumnInfo
import androidx.room.TypeConverters
import java.util.*

@TypeConverters(DateConverter::class)
data class IntervalWithAction(
    @ColumnInfo(name = "interval_id") var intervalId: Long,
    @ColumnInfo(name = "start_time") var startTime: Date,
    @ColumnInfo(name = "end_time") var endTime: Date,
    @ColumnInfo(name = "name") var actionName: String,
    @ColumnInfo(name = "color") var actionColor: Int
)