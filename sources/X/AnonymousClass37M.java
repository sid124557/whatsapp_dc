package X;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* renamed from: X.37M  reason: invalid class name */
public final /* synthetic */ class AnonymousClass37M implements DatabaseErrorHandler {
    public final /* synthetic */ File A00;

    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        C18260x0.A1R(AnonymousClass001.A0o(), "MessageStoreBackup/integritycheck/error-handler/corrupt-db ", this.A00);
    }

    public /* synthetic */ AnonymousClass37M(File file) {
        this.A00 = file;
    }
}
