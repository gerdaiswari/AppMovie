package com.example.appmovie.data.local;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.appmovie.model.MovieDetail;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MovieDao_Impl implements MovieDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<MovieDetail> __insertionAdapterOfMovieDetail;

  public MovieDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMovieDetail = new EntityInsertionAdapter<MovieDetail>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `MovieDetail` (`title`,`posterPath`,`voteAverage`,`id`,`backDropPath`,`overview`,`releaseData`,`voteCount`,`status`,`homepage`) VALUES (?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MovieDetail value) {
        if (value.getTitle() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getTitle());
        }
        if (value.getPosterPath() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getPosterPath());
        }
        stmt.bindDouble(3, value.getVoteAverage());
        stmt.bindLong(4, value.getId());
        if (value.getBackDropPath() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getBackDropPath());
        }
        if (value.getOverview() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getOverview());
        }
        if (value.getReleaseData() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getReleaseData());
        }
        stmt.bindLong(8, value.getVoteCount());
        if (value.getStatus() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getStatus());
        }
        if (value.getHomepage() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getHomepage());
        }
      }
    };
  }

  @Override
  public void insertMovieDetail(final MovieDetail movie) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfMovieDetail.insert(movie);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public MovieDetail getDetailMovie(final int movieId) {
    final String _sql = "SELECT * FROM moviedetail WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, movieId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "posterPath");
      final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "voteAverage");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfBackDropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backDropPath");
      final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
      final int _cursorIndexOfReleaseData = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseData");
      final int _cursorIndexOfVoteCount = CursorUtil.getColumnIndexOrThrow(_cursor, "voteCount");
      final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
      final int _cursorIndexOfHomepage = CursorUtil.getColumnIndexOrThrow(_cursor, "homepage");
      final MovieDetail _result;
      if(_cursor.moveToFirst()) {
        _result = new MovieDetail();
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        _result.setTitle(_tmpTitle);
        final String _tmpPosterPath;
        if (_cursor.isNull(_cursorIndexOfPosterPath)) {
          _tmpPosterPath = null;
        } else {
          _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
        }
        _result.setPosterPath(_tmpPosterPath);
        final double _tmpVoteAverage;
        _tmpVoteAverage = _cursor.getDouble(_cursorIndexOfVoteAverage);
        _result.setVoteAverage(_tmpVoteAverage);
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _result.setId(_tmpId);
        final String _tmpBackDropPath;
        if (_cursor.isNull(_cursorIndexOfBackDropPath)) {
          _tmpBackDropPath = null;
        } else {
          _tmpBackDropPath = _cursor.getString(_cursorIndexOfBackDropPath);
        }
        _result.setBackDropPath(_tmpBackDropPath);
        final String _tmpOverview;
        if (_cursor.isNull(_cursorIndexOfOverview)) {
          _tmpOverview = null;
        } else {
          _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
        }
        _result.setOverview(_tmpOverview);
        final String _tmpReleaseData;
        if (_cursor.isNull(_cursorIndexOfReleaseData)) {
          _tmpReleaseData = null;
        } else {
          _tmpReleaseData = _cursor.getString(_cursorIndexOfReleaseData);
        }
        _result.setReleaseData(_tmpReleaseData);
        final int _tmpVoteCount;
        _tmpVoteCount = _cursor.getInt(_cursorIndexOfVoteCount);
        _result.setVoteCount(_tmpVoteCount);
        final String _tmpStatus;
        if (_cursor.isNull(_cursorIndexOfStatus)) {
          _tmpStatus = null;
        } else {
          _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
        }
        _result.setStatus(_tmpStatus);
        final String _tmpHomepage;
        if (_cursor.isNull(_cursorIndexOfHomepage)) {
          _tmpHomepage = null;
        } else {
          _tmpHomepage = _cursor.getString(_cursorIndexOfHomepage);
        }
        _result.setHomepage(_tmpHomepage);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
