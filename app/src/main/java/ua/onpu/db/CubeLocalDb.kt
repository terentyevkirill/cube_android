package ua.onpu.db

import android.content.Context
import android.graphics.Color
import android.util.Log
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import ua.onpu.db.dao.ActionsDao
import ua.onpu.db.dao.IntervalsDao
import ua.onpu.db.entity.Action
import ua.onpu.db.entity.Interval

@Database(entities = [Action::class, Interval::class], version = CubeLocalDb.VERSION_CUBE_DB)
abstract class CubeLocalDb : RoomDatabase() {
    abstract fun actionsDao(): ActionsDao
    abstract fun intervalsDao(): IntervalsDao

    companion object {
        private lateinit var cubeLocalDb: CubeLocalDb

        private const val NAME_LOCAL_DB = "cube.db"
        const val VERSION_CUBE_DB = 1

        fun getCubeDatabase(appContext: Context): CubeLocalDb {
            if (!Companion::cubeLocalDb.isInitialized) cubeLocalDb = buildCubeDb(appContext)
            return cubeLocalDb
        }

        private fun buildCubeDb(appContext: Context): CubeLocalDb {
            return Room.databaseBuilder(appContext, CubeLocalDb::class.java, NAME_LOCAL_DB)
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .addCallback(object : RoomDatabase.Callback() {
                    override fun onCreate(db: SupportSQLiteDatabase) {
                        super.onCreate(db)
                        populateInitialData(appContext)
                        Log.i("DATABASE", "pre-populated!")
                    }
                })
                .build()
        }

        private fun populateInitialData(context: Context) = GlobalScope.launch(Dispatchers.IO) {
            val db = getCubeDatabase(context)

            db.actionsDao().insert(Action(name = "Stop", color = Color.BLACK))
            db.actionsDao().insert(Action(name = "Explore app", color = Color.parseColor("#FF3F51B5"), available = true))
            db.actionsDao().insert(Action(name = "Phone call", color = Color.parseColor("#FF009688"), available = true))
            db.actionsDao().insert(Action(name = "Coding", color = Color.parseColor("#FFE91E63"), available = true))
            db.actionsDao().insert(Action(name = "Meeting", color = Color.parseColor("#FF9C27B0"), available = true))
            db.actionsDao().insert(Action(name = "Code review", color = Color.parseColor("#FFFF9800"), available = true))
        }
    }
}