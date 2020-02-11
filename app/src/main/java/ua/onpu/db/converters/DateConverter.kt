package ua.onpu.db.converters

import androidx.room.TypeConverter
import java.util.*

class DateConverter {

    @TypeConverter
    fun toDate(timestamp: Long) = Date(timestamp)

    @TypeConverter
    fun fromDate(date: Date) = date.time

}