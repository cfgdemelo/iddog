package com.cfgdemelo.iddog.data.database;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.cfgdemelo.iddog.data.model.User;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class LoginDao_Impl implements LoginDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<User> __insertionAdapterOfUser;

  public LoginDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUser = new EntityInsertionAdapter<User>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `USER` (`_id`,`__v`,`createdAt`,`email`,`token`,`updatedAt`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, User value) {
        if (value.get_id() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.get_id());
        }
        stmt.bindLong(2, value.get__v());
        if (value.getCreatedAt() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCreatedAt());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getEmail());
        }
        if (value.getToken() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getToken());
        }
        if (value.getUpdatedAt() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getUpdatedAt());
        }
      }
    };
  }

  @Override
  public Object insertUser(final User token, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfUser.insert(token);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public User getUser() {
    final String _sql = "SELECT * FROM USER";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
      final int _cursorIndexOfV = CursorUtil.getColumnIndexOrThrow(_cursor, "__v");
      final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
      final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
      final int _cursorIndexOfToken = CursorUtil.getColumnIndexOrThrow(_cursor, "token");
      final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedAt");
      final User _result;
      if(_cursor.moveToFirst()) {
        final String _tmp_id;
        _tmp_id = _cursor.getString(_cursorIndexOfId);
        final int _tmp__v;
        _tmp__v = _cursor.getInt(_cursorIndexOfV);
        final String _tmpCreatedAt;
        _tmpCreatedAt = _cursor.getString(_cursorIndexOfCreatedAt);
        final String _tmpEmail;
        _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
        final String _tmpToken;
        _tmpToken = _cursor.getString(_cursorIndexOfToken);
        final String _tmpUpdatedAt;
        _tmpUpdatedAt = _cursor.getString(_cursorIndexOfUpdatedAt);
        _result = new User(_tmp_id,_tmp__v,_tmpCreatedAt,_tmpEmail,_tmpToken,_tmpUpdatedAt);
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
