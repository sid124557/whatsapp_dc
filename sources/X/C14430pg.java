package X;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;

/* renamed from: X.0pg  reason: invalid class name and case insensitive filesystem */
public final class C14430pg extends C829045j implements AnonymousClass4GT {
    public final /* synthetic */ C16680tn $query;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14430pg(C16680tn r2) {
        super(4);
        this.$query = r2;
    }

    public final SQLiteCursor A00(SQLiteCursorDriver sQLiteCursorDriver, SQLiteQuery sQLiteQuery, String str) {
        C16680tn r1 = this.$query;
        C162457s7.A0H(sQLiteQuery);
        r1.Axv(new C08690et(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    public /* bridge */ /* synthetic */ Object BGk(Object obj, Object obj2, Object obj3, Object obj4) {
        return A00((SQLiteCursorDriver) obj2, (SQLiteQuery) obj4, (String) obj3);
    }
}
