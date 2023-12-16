package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

/* renamed from: X.0ZB  reason: invalid class name */
public final /* synthetic */ class AnonymousClass0ZB implements SQLiteDatabase.CursorFactory {
    public final /* synthetic */ AnonymousClass4GT A00;

    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        return C08630en.A00(sQLiteCursorDriver, sQLiteDatabase, sQLiteQuery, str, this.A00);
    }

    public /* synthetic */ AnonymousClass0ZB(AnonymousClass4GT r1) {
        this.A00 = r1;
    }
}
