package X;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: X.37L  reason: invalid class name */
public final /* synthetic */ class AnonymousClass37L implements DatabaseErrorHandler {
    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WaDatabaseErrorHandler/integritycheck/error-handler/corrupt-db ");
        C18260x0.A1L(A0o, sQLiteDatabase.getPath());
    }
}
