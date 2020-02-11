package ua.onpu.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Generated;
import ua.onpu.db.dao.ActionsDao;
import ua.onpu.db.dao.ActionsDao_Impl;
import ua.onpu.db.dao.IntervalsDao;
import ua.onpu.db.dao.IntervalsDao_Impl;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class CubeLocalDb_Impl extends CubeLocalDb {
  private volatile ActionsDao _actionsDao;

  private volatile IntervalsDao _intervalsDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `action` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `color` INTEGER NOT NULL, `available` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `interval` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `start_time` INTEGER NOT NULL, `end_time` INTEGER NOT NULL, `action_id` INTEGER NOT NULL, FOREIGN KEY(`action_id`) REFERENCES `action`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_interval_action_id` ON `interval` (`action_id`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ac43e37e3e9acadc30e0eff749a1598f')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `action`");
        _db.execSQL("DROP TABLE IF EXISTS `interval`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        _db.execSQL("PRAGMA foreign_keys = ON");
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsAction = new HashMap<String, TableInfo.Column>(4);
        _columnsAction.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAction.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAction.put("color", new TableInfo.Column("color", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAction.put("available", new TableInfo.Column("available", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysAction = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesAction = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoAction = new TableInfo("action", _columnsAction, _foreignKeysAction, _indicesAction);
        final TableInfo _existingAction = TableInfo.read(_db, "action");
        if (! _infoAction.equals(_existingAction)) {
          return new RoomOpenHelper.ValidationResult(false, "action(ua.onpu.db.entity.Action).\n"
                  + " Expected:\n" + _infoAction + "\n"
                  + " Found:\n" + _existingAction);
        }
        final HashMap<String, TableInfo.Column> _columnsInterval = new HashMap<String, TableInfo.Column>(4);
        _columnsInterval.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInterval.put("start_time", new TableInfo.Column("start_time", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInterval.put("end_time", new TableInfo.Column("end_time", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInterval.put("action_id", new TableInfo.Column("action_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysInterval = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysInterval.add(new TableInfo.ForeignKey("action", "CASCADE", "NO ACTION",Arrays.asList("action_id"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesInterval = new HashSet<TableInfo.Index>(1);
        _indicesInterval.add(new TableInfo.Index("index_interval_action_id", false, Arrays.asList("action_id")));
        final TableInfo _infoInterval = new TableInfo("interval", _columnsInterval, _foreignKeysInterval, _indicesInterval);
        final TableInfo _existingInterval = TableInfo.read(_db, "interval");
        if (! _infoInterval.equals(_existingInterval)) {
          return new RoomOpenHelper.ValidationResult(false, "interval(ua.onpu.db.entity.Interval).\n"
                  + " Expected:\n" + _infoInterval + "\n"
                  + " Found:\n" + _existingInterval);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "ac43e37e3e9acadc30e0eff749a1598f", "943ba9e8564e158f5cb17b371be40572");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "action","interval");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    boolean _supportsDeferForeignKeys = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP;
    try {
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = FALSE");
      }
      super.beginTransaction();
      if (_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA defer_foreign_keys = TRUE");
      }
      _db.execSQL("DELETE FROM `action`");
      _db.execSQL("DELETE FROM `interval`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = TRUE");
      }
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public ActionsDao actionsDao() {
    if (_actionsDao != null) {
      return _actionsDao;
    } else {
      synchronized(this) {
        if(_actionsDao == null) {
          _actionsDao = new ActionsDao_Impl(this);
        }
        return _actionsDao;
      }
    }
  }

  @Override
  public IntervalsDao intervalsDao() {
    if (_intervalsDao != null) {
      return _intervalsDao;
    } else {
      synchronized(this) {
        if(_intervalsDao == null) {
          _intervalsDao = new IntervalsDao_Impl(this);
        }
        return _intervalsDao;
      }
    }
  }
}
