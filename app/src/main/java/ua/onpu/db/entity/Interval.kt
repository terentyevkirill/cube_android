package ua.onpu.db.entity

import androidx.room.*
import androidx.room.ForeignKey.CASCADE
import ua.onpu.db.converters.DateConverter
import java.util.*

@Entity(
    tableName = Interval.TABLE_NAME,
    indices = [Index("action_id")],
    foreignKeys = [ForeignKey(
        entity = Action::class,
        parentColumns = arrayOf("id"),
        childColumns = arrayOf("action_id"),
        onDelete = CASCADE
    )]
)
@TypeConverters(DateConverter::class)
class Interval(
    @PrimaryKey(autoGenerate = true) var id: Long = 0,
    @ColumnInfo(name = "start_time") var startTime: Date,
    @ColumnInfo(name = "end_time") var endTime: Date,
    @ColumnInfo(name = "action_id") var actionId: Long
) {
    companion object {
        const val TABLE_NAME = "interval"
    }
}