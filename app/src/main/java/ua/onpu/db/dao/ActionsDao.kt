package ua.onpu.db.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import ua.onpu.db.entity.Action

@Dao
interface ActionsDao {

    @Query("SELECT * FROM `${Action.TABLE_NAME}`")
    fun getAllAction(): LiveData<List<Action>>

    @Query("SELECT * FROM `${Action.TABLE_NAME}` WHERE available = 1")
    fun getAllAvailable(): LiveData<List<Action>>

    @Query("SELECT * FROM `${Action.TABLE_NAME}`")
    fun getAll(): List<Action>

    @Query("SELECT * FROM `${Action.TABLE_NAME}` WHERE id = :id")
    fun get(id: Long): Action

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(action: Action): Long

    @Query("Insert INTO `${Action.TABLE_NAME}` (name, color) VALUES(:name, :color)")
    fun addAction(name: String, color: Int)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun add(action: Action)

    @Query("SELECT id FROM `${Action.TABLE_NAME}` ORDER BY id")
    fun getIds():List<Long>

    @Update
    fun update(action: Action)

    @Query("UPDATE `${Action.TABLE_NAME}` SET available = 'FALSE' WHERE id = :id")
    fun markActionAsDeleted(id: Long)

    @Delete
    fun delete(action: Action)

    @Query("DELETE FROM `${Action.TABLE_NAME}`")
    fun deleteAll()

}