package ua.onpu.db.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.Generated;
import ua.onpu.db.converters.DateConverter;
import ua.onpu.db.converters.IntervalWithAction;
import ua.onpu.db.entity.Interval;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class IntervalsDao_Impl implements IntervalsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Interval> __insertionAdapterOfInterval;

  private final DateConverter __dateConverter = new DateConverter();

  private final EntityDeletionOrUpdateAdapter<Interval> __deletionAdapterOfInterval;

  private final EntityDeletionOrUpdateAdapter<Interval> __updateAdapterOfInterval;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public IntervalsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfInterval = new EntityInsertionAdapter<Interval>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `interval` (`id`,`start_time`,`end_time`,`action_id`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Interval value) {
        stmt.bindLong(1, value.getId());
        final long _tmp;
        _tmp = __dateConverter.fromDate(value.getStartTime());
        stmt.bindLong(2, _tmp);
        final long _tmp_1;
        _tmp_1 = __dateConverter.fromDate(value.getEndTime());
        stmt.bindLong(3, _tmp_1);
        stmt.bindLong(4, value.getActionId());
      }
    };
    this.__deletionAdapterOfInterval = new EntityDeletionOrUpdateAdapter<Interval>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `interval` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Interval value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfInterval = new EntityDeletionOrUpdateAdapter<Interval>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `interval` SET `id` = ?,`start_time` = ?,`end_time` = ?,`action_id` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Interval value) {
        stmt.bindLong(1, value.getId());
        final long _tmp;
        _tmp = __dateConverter.fromDate(value.getStartTime());
        stmt.bindLong(2, _tmp);
        final long _tmp_1;
        _tmp_1 = __dateConverter.fromDate(value.getEndTime());
        stmt.bindLong(3, _tmp_1);
        stmt.bindLong(4, value.getActionId());
        stmt.bindLong(5, value.getId());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM `interval`";
        return _query;
      }
    };
  }

  @Override
  public long insert(final Interval interval) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfInterval.insertAndReturnId(interval);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final Interval interval) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfInterval.handle(interval);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final Interval interval) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfInterval.handle(interval);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAll() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public LiveData<List<IntervalWithAction>> getAllIntervalsWithActions() {
    final String _sql = "SELECT i.id AS interval_id, start_time, end_time, name, color FROM `interval` AS i INNER JOIN `action` AS a ON a.id = i.action_id";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"interval","action"}, false, new Callable<List<IntervalWithAction>>() {
      @Override
      public List<IntervalWithAction> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfIntervalId = CursorUtil.getColumnIndexOrThrow(_cursor, "interval_id");
          final int _cursorIndexOfStartTime = CursorUtil.getColumnIndexOrThrow(_cursor, "start_time");
          final int _cursorIndexOfEndTime = CursorUtil.getColumnIndexOrThrow(_cursor, "end_time");
          final int _cursorIndexOfActionName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfActionColor = CursorUtil.getColumnIndexOrThrow(_cursor, "color");
          final List<IntervalWithAction> _result = new ArrayList<IntervalWithAction>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final IntervalWithAction _item;
            final long _tmpIntervalId;
            _tmpIntervalId = _cursor.getLong(_cursorIndexOfIntervalId);
            final Date _tmpStartTime;
            final long _tmp;
            _tmp = _cursor.getLong(_cursorIndexOfStartTime);
            _tmpStartTime = __dateConverter.toDate(_tmp);
            final Date _tmpEndTime;
            final long _tmp_1;
            _tmp_1 = _cursor.getLong(_cursorIndexOfEndTime);
            _tmpEndTime = __dateConverter.toDate(_tmp_1);
            final String _tmpActionName;
            _tmpActionName = _cursor.getString(_cursorIndexOfActionName);
            final int _tmpActionColor;
            _tmpActionColor = _cursor.getInt(_cursorIndexOfActionColor);
            _item = new IntervalWithAction(_tmpIntervalId,_tmpStartTime,_tmpEndTime,_tmpActionName,_tmpActionColor);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public IntervalWithAction getIntervalWithActions(final long id) {
    final String _sql = "SELECT i.id AS interval_id, start_time, end_time, name, color FROM `interval` AS i INNER JOIN `action` AS a ON a.id = i.action_id WHERE i.id = :id";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false);
    try {
      final int _cursorIndexOfIntervalId = CursorUtil.getColumnIndexOrThrow(_cursor, "interval_id");
      final int _cursorIndexOfStartTime = CursorUtil.getColumnIndexOrThrow(_cursor, "start_time");
      final int _cursorIndexOfEndTime = CursorUtil.getColumnIndexOrThrow(_cursor, "end_time");
      final int _cursorIndexOfActionName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfActionColor = CursorUtil.getColumnIndexOrThrow(_cursor, "color");
      final IntervalWithAction _result;
      if(_cursor.moveToFirst()) {
        final long _tmpIntervalId;
        _tmpIntervalId = _cursor.getLong(_cursorIndexOfIntervalId);
        final Date _tmpStartTime;
        final long _tmp;
        _tmp = _cursor.getLong(_cursorIndexOfStartTime);
        _tmpStartTime = __dateConverter.toDate(_tmp);
        final Date _tmpEndTime;
        final long _tmp_1;
        _tmp_1 = _cursor.getLong(_cursorIndexOfEndTime);
        _tmpEndTime = __dateConverter.toDate(_tmp_1);
        final String _tmpActionName;
        _tmpActionName = _cursor.getString(_cursorIndexOfActionName);
        final int _tmpActionColor;
        _tmpActionColor = _cursor.getInt(_cursorIndexOfActionColor);
        _result = new IntervalWithAction(_tmpIntervalId,_tmpStartTime,_tmpEndTime,_tmpActionName,_tmpActionColor);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Interval getInterval(final long intervalId) {
    final String _sql = "SELECT * FROM `interval` WHERE id = :intervalId";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, intervalId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfStartTime = CursorUtil.getColumnIndexOrThrow(_cursor, "start_time");
      final int _cursorIndexOfEndTime = CursorUtil.getColumnIndexOrThrow(_cursor, "end_time");
      final int _cursorIndexOfActionId = CursorUtil.getColumnIndexOrThrow(_cursor, "action_id");
      final Interval _result;
      if(_cursor.moveToFirst()) {
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final Date _tmpStartTime;
        final long _tmp;
        _tmp = _cursor.getLong(_cursorIndexOfStartTime);
        _tmpStartTime = __dateConverter.toDate(_tmp);
        final Date _tmpEndTime;
        final long _tmp_1;
        _tmp_1 = _cursor.getLong(_cursorIndexOfEndTime);
        _tmpEndTime = __dateConverter.toDate(_tmp_1);
        final long _tmpActionId;
        _tmpActionId = _cursor.getLong(_cursorIndexOfActionId);
        _result = new Interval(_tmpId,_tmpStartTime,_tmpEndTime,_tmpActionId);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LiveData<List<Interval>> getAll() {
    final String _sql = "SELECT * FROM `interval`";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"interval"}, false, new Callable<List<Interval>>() {
      @Override
      public List<Interval> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfStartTime = CursorUtil.getColumnIndexOrThrow(_cursor, "start_time");
          final int _cursorIndexOfEndTime = CursorUtil.getColumnIndexOrThrow(_cursor, "end_time");
          final int _cursorIndexOfActionId = CursorUtil.getColumnIndexOrThrow(_cursor, "action_id");
          final List<Interval> _result = new ArrayList<Interval>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Interval _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final Date _tmpStartTime;
            final long _tmp;
            _tmp = _cursor.getLong(_cursorIndexOfStartTime);
            _tmpStartTime = __dateConverter.toDate(_tmp);
            final Date _tmpEndTime;
            final long _tmp_1;
            _tmp_1 = _cursor.getLong(_cursorIndexOfEndTime);
            _tmpEndTime = __dateConverter.toDate(_tmp_1);
            final long _tmpActionId;
            _tmpActionId = _cursor.getLong(_cursorIndexOfActionId);
            _item = new Interval(_tmpId,_tmpStartTime,_tmpEndTime,_tmpActionId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Interval getLatest() {
    final String _sql = "SELECT * FROM `interval` ORDER BY end_time DESC LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfStartTime = CursorUtil.getColumnIndexOrThrow(_cursor, "start_time");
      final int _cursorIndexOfEndTime = CursorUtil.getColumnIndexOrThrow(_cursor, "end_time");
      final int _cursorIndexOfActionId = CursorUtil.getColumnIndexOrThrow(_cursor, "action_id");
      final Interval _result;
      if(_cursor.moveToFirst()) {
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final Date _tmpStartTime;
        final long _tmp;
        _tmp = _cursor.getLong(_cursorIndexOfStartTime);
        _tmpStartTime = __dateConverter.toDate(_tmp);
        final Date _tmpEndTime;
        final long _tmp_1;
        _tmp_1 = _cursor.getLong(_cursorIndexOfEndTime);
        _tmpEndTime = __dateConverter.toDate(_tmp_1);
        final long _tmpActionId;
        _tmpActionId = _cursor.getLong(_cursorIndexOfActionId);
        _result = new Interval(_tmpId,_tmpStartTime,_tmpEndTime,_tmpActionId);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Integer getTodayTrackedSeconds() {
    final String _sql = "SELECT SUM(strftime('%S', end_time) - strftime('%S', start_time)) FROM `interval`";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false);
    try {
      final Integer _result;
      if(_cursor.moveToFirst()) {
        final Integer _tmp;
        if (_cursor.isNull(0)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getInt(0);
        }
        _result = _tmp;
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
