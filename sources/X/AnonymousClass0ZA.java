package X;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: X.0ZA  reason: invalid class name */
public final /* synthetic */ class AnonymousClass0ZA implements DatabaseErrorHandler {
    public final /* synthetic */ AnonymousClass0U2 A00;
    public final /* synthetic */ C03410Ka A01;

    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        C001000s.A02(sQLiteDatabase, this.A00, this.A01);
    }

    public /* synthetic */ AnonymousClass0ZA(AnonymousClass0U2 r1, C03410Ka r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
