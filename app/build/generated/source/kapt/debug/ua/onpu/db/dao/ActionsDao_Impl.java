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
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.Generated;
import ua.onpu.db.entity.Action;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class ActionsDao_Impl implements ActionsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Action> __insertionAdapterOfAction;

  private final EntityDeletionOrUpdateAdapter<Action> __deletionAdapterOfAction;

  private final EntityDeletionOrUpdateAdapter<Action> __updateAdapterOfAction;

  private final SharedSQLiteStatement __preparedStmtOfAddAction;

  private final SharedSQLiteStatement __preparedStmtOfMarkActionAsDeleted;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public ActionsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfAction = new EntityInsertionAdapter<Action>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `action` (`id`,`name`,`color`,`available`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Action value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        stmt.bindLong(3, value.getColor());
        final int _tmp;
        _tmp = value.getAvailable() ? 1 : 0;
        stmt.bindLong(4, _tmp);
      }
    };
    this.__deletionAdapterOfAction = new EntityDeletionOrUpdateAdapter<Action>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `action` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Action value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfAction = new EntityDeletionOrUpdateAdapter<Action>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `action` SET `id` = ?,`name` = ?,`color` = ?,`available` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Action value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        stmt.bindLong(3, value.getColor());
        final int _tmp;
        _tmp = value.getAvailable() ? 1 : 0;
        stmt.bindLong(4, _tmp);
        stmt.bindLong(5, value.getId());
      }
    };
    this.__preparedStmtOfAddAction = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "Insert INTO `action` (name, color) VALUES(:name, :color)";
        return _query;
      }
    };
    this.__preparedStmtOfMarkActionAsDeleted = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE `action` SET available = 'FALSE' WHERE id = :id";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM `action`";
        return _query;
      }
    };
  }

  @Override
  public long insert(final Action action) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfAction.insertAndReturnId(action);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void add(final Action action) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfAction.insert(action);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final Action action) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfAction.handle(action);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final Action action) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfAction.handle(action);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void addAction(final String name, final int color) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfAddAction.acquire();
    int _argIndex = 1;
    if (name == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, name);
    }
    _argIndex = 2;
    _stmt.bindLong(_argIndex, color);
    __db.beginTransaction();
    try {
      _stmt.executeInsert();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfAddAction.release(_stmt);
    }
  }

  @Override
  public void markActionAsDeleted(final long id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfMarkActionAsDeleted.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfMarkActionAsDeleted.release(_stmt);
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
  public LiveData<List<Action>> getAllAction() {
    final String _sql = "SELECT * FROM `action`";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"action"}, false, new Callable<List<Action>>() {
      @Override
      public List<Action> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfColor = CursorUtil.getColumnIndexOrThrow(_cursor, "color");
          final int _cursorIndexOfAvailable = CursorUtil.getColumnIndexOrThrow(_cursor, "available");
          final List<Action> _result = new ArrayList<Action>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Action _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final int _tmpColor;
            _tmpColor = _cursor.getInt(_cursorIndexOfColor);
            final boolean _tmpAvailable;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfAvailable);
            _tmpAvailable = _tmp != 0;
            _item = new Action(_tmpId,_tmpName,_tmpColor,_tmpAvailable);
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
  public LiveData<List<Action>> getAllAvailable() {
    final String _sql = "SELECT * FROM `action` WHERE available = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"action"}, false, new Callable<List<Action>>() {
      @Override
      public List<Action> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfColor = CursorUtil.getColumnIndexOrThrow(_cursor, "color");
          final int _cursorIndexOfAvailable = CursorUtil.getColumnIndexOrThrow(_cursor, "available");
          final List<Action> _result = new ArrayList<Action>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Action _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final int _tmpColor;
            _tmpColor = _cursor.getInt(_cursorIndexOfColor);
            final boolean _tmpAvailable;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfAvailable);
            _tmpAvailable = _tmp != 0;
            _item = new Action(_tmpId,_tmpName,_tmpColor,_tmpAvailable);
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
  public List<Action> getAll() {
    final String _sql = "SELECT * FROM `action`";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfColor = CursorUtil.getColumnIndexOrThrow(_cursor, "color");
      final int _cursorIndexOfAvailable = CursorUtil.getColumnIndexOrThrow(_cursor, "available");
      final List<Action> _result = new ArrayList<Action>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Action _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final int _tmpColor;
        _tmpColor = _cursor.getInt(_cursorIndexOfColor);
        final boolean _tmpAvailable;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfAvailable);
        _tmpAvailable = _tmp != 0;
        _item = new Action(_tmpId,_tmpName,_tmpColor,_tmpAvailable);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Action get(final long id) {
    final String _sql = "SELECT * FROM `action` WHERE id = :id";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfColor = CursorUtil.getColumnIndexOrThrow(_cursor, "color");
      final int _cursorIndexOfAvailable = CursorUtil.getColumnIndexOrThrow(_cursor, "available");
      final Action _result;
      if(_cursor.moveToFirst()) {
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final int _tmpColor;
        _tmpColor = _cursor.getInt(_cursorIndexOfColor);
        final boolean _tmpAvailable;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfAvailable);
        _tmpAvailable = _tmp != 0;
        _result = new Action(_tmpId,_tmpName,_tmpColor,_tmpAvailable);
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
  public List<Long> getIds() {
    final String _sql = "SELECT id FROM `action` ORDER BY id";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false);
    try {
      final List<Long> _result = new ArrayList<Long>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Long _item;
        if (_cursor.isNull(0)) {
          _item = null;
        } else {
          _item = _cursor.getLong(0);
        }
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
