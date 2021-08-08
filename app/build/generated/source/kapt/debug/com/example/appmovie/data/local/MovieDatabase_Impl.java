package com.example.appmovie.data.local;

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
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MovieDatabase_Impl extends MovieDatabase {
  private volatile MovieDao _movieDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `MovieDetail` (`title` TEXT NOT NULL, `posterPath` TEXT NOT NULL, `voteAverage` REAL NOT NULL, `id` INTEGER NOT NULL, `backDropPath` TEXT NOT NULL, `overview` TEXT NOT NULL, `releaseData` TEXT NOT NULL, `voteCount` INTEGER NOT NULL, `status` TEXT NOT NULL, `homepage` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ffbbd6dbcab69a03be856322cf150b0e')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `MovieDetail`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
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
        final HashMap<String, TableInfo.Column> _columnsMovieDetail = new HashMap<String, TableInfo.Column>(10);
        _columnsMovieDetail.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieDetail.put("posterPath", new TableInfo.Column("posterPath", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieDetail.put("voteAverage", new TableInfo.Column("voteAverage", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieDetail.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieDetail.put("backDropPath", new TableInfo.Column("backDropPath", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieDetail.put("overview", new TableInfo.Column("overview", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieDetail.put("releaseData", new TableInfo.Column("releaseData", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieDetail.put("voteCount", new TableInfo.Column("voteCount", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieDetail.put("status", new TableInfo.Column("status", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieDetail.put("homepage", new TableInfo.Column("homepage", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMovieDetail = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMovieDetail = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMovieDetail = new TableInfo("MovieDetail", _columnsMovieDetail, _foreignKeysMovieDetail, _indicesMovieDetail);
        final TableInfo _existingMovieDetail = TableInfo.read(_db, "MovieDetail");
        if (! _infoMovieDetail.equals(_existingMovieDetail)) {
          return new RoomOpenHelper.ValidationResult(false, "MovieDetail(com.example.appmovie.model.MovieDetail).\n"
                  + " Expected:\n" + _infoMovieDetail + "\n"
                  + " Found:\n" + _existingMovieDetail);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "ffbbd6dbcab69a03be856322cf150b0e", "97a0861cba7f12013c29825f4209e4e6");
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
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "MovieDetail");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `MovieDetail`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(MovieDao.class, MovieDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public MovieDao movieDetailDao() {
    if (_movieDao != null) {
      return _movieDao;
    } else {
      synchronized(this) {
        if(_movieDao == null) {
          _movieDao = new MovieDao_Impl(this);
        }
        return _movieDao;
      }
    }
  }
}
