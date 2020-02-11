package ua.onpu.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = Action.TABLE_NAME)
data class Action(
    @PrimaryKey(autoGenerate = true) var id: Long = 0,
    var name: String,
    var color: Int,
    var available: Boolean = false
) : Serializable {
    companion object {
        const val TABLE_NAME = "action"
    }
}