package ua.onpu

import android.database.sqlite.SQLiteConstraintException
import android.graphics.Color
import androidx.room.Room
import androidx.test.platform.app.InstrumentationRegistry
import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertTrue
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import ua.onpu.db.CubeLocalDb
import ua.onpu.db.dao.ActionsDao
import ua.onpu.db.dao.IntervalsDao
import ua.onpu.db.entity.Action
import ua.onpu.db.entity.Interval
import java.util.*

@RunWith(JUnit4::class)
class DaoTest {

    private val context = InstrumentationRegistry.getInstrumentation().context

    private val database = Room.inMemoryDatabaseBuilder(context, CubeLocalDb::class.java).build()

    private lateinit var actionsDao: ActionsDao

    private lateinit var intervalsDao: IntervalsDao

    @Before
    fun setUp() {
        actionsDao = database.actionsDao()
        intervalsDao = database.intervalsDao()
    }

    @After
    fun tearDown() {
        intervalsDao.deleteAll()
        actionsDao.deleteAll()
        database.close()
    }

    @Test
    fun test_insertActivity() {
        val activity = Action(name = "Test Action", color = Color.RED)
        val id = actionsDao.insert(activity)

        val activityInDb = actionsDao.get(id)

        assertEquals(activity.color, activityInDb?.color)
        assertEquals(activity.name, activityInDb?.name)
    }

    @Test
    fun test_insertInterval() {
        val activity = Action(name = "Action", color = Color.GREEN)
        val activityId = actionsDao.insert(activity)

        val expectedInterval = Interval(startTime = Date(), endTime = Date(), actionId = activityId)
        val intervalInDb = intervalsDao.getInterval(intervalsDao.insert(expectedInterval))

        assertEquals(expectedInterval.actionId, intervalInDb.actionId)
        assertEquals(expectedInterval.startTime, intervalInDb.startTime)
        assertEquals(expectedInterval.endTime, intervalInDb.endTime)
    }

    @Test(expected = SQLiteConstraintException::class)
    fun test_insertInterval_withNonExistingActivity() {
        val interval = Interval(startTime = Date(), endTime = Date(), actionId = -1)
        intervalsDao.insert(interval)
    }

    @Test
    fun test_getIntervalWithActivity() {
        val expectedActivity = Action(name = "Action", color = Color.BLUE)
        val activityId = actionsDao.insert(expectedActivity)

        val expectedInterval = Interval(startTime = Date(), endTime = Date(), actionId = activityId)
        val intervalInDb = intervalsDao.getInterval(intervalsDao.insert(expectedInterval))

        val intervalWithActivity = intervalsDao.getIntervalWithActions(intervalInDb.id)

        assertEquals(expectedActivity.name, intervalWithActivity.actionName)
        assertEquals(expectedActivity.color, intervalWithActivity.actionColor)
        assertEquals(expectedInterval.startTime, intervalWithActivity.startTime)
        assertEquals(expectedInterval.endTime, intervalWithActivity.endTime)
    }

    @Test
    fun test_getAllActivities() {
        val activity = Action(name = "Action", color = Color.BLUE)
        actionsDao.insert(activity)

        actionsDao.getAllAvailable().value?.forEach {
            assertTrue(it.available)
        }
    }

}