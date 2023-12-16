package X;

import android.database.DatabaseErrorHandler;
import android.database.DefaultDatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;

/* renamed from: X.37N  reason: invalid class name */
public class AnonymousClass37N implements DatabaseErrorHandler {
    public final DefaultDatabaseErrorHandler A00;
    public final C55682qk A01;
    public final String A02;
    public final ThreadLocal A03 = new ThreadLocal();

    public void onCorruption(SQLiteDatabase sQLiteDatabase) {
        String str;
        String str2;
        Boolean bool = Boolean.TRUE;
        ThreadLocal threadLocal = this.A03;
        if (bool == threadLocal.get()) {
            this.A00.onCorruption(sQLiteDatabase);
            return;
        }
        threadLocal.set(bool);
        try {
            sQLiteDatabase.close();
            SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(sQLiteDatabase.getPath(), (SQLiteDatabase.CursorFactory) null, 536870928, new AnonymousClass37L());
            AnonymousClass32M A002 = AnonymousClass350.A00(openDatabase);
            C55682qk r3 = this.A01;
            StringBuilder A0l = AnonymousClass000.A0l("db-corrupted/");
            A0l.append(this.A02);
            A0l.append("/");
            if (A002 == null) {
                str = "unknown";
            } else {
                int i = A002.A00;
                if (i == -2) {
                    str = "unknown-query-failed";
                } else if (i == -1) {
                    str = "unknown-exception";
                } else if (i == -3) {
                    str = "unknown-corrupted";
                } else if (i == 0) {
                    str = "non-corrupted";
                } else if (A002.A02.isEmpty()) {
                    str = "recoverable";
                } else {
                    str = "non-recoverable";
                }
            }
            String A0X = AnonymousClass000.A0X(str, A0l);
            if (A002 == null) {
                str2 = null;
            } else if (A002.A04) {
                StringBuilder A0o = AnonymousClass001.A0o();
                AnonymousClass0x7.A1H(A0o, A002.A03);
                A0o.append(" corrupted indexes,\n");
                str2 = AnonymousClass000.A0R(A002.A02, A0o);
            } else {
                str2 = A002.A01;
            }
            r3.A0A(A0X, false, str2);
            this.A00.onCorruption(openDatabase);
        } catch (SQLiteDatabaseCorruptException e) {
            C55682qk r2 = this.A01;
            StringBuilder A0l2 = AnonymousClass000.A0l("db-corrupted/");
            A0l2.append(this.A02);
            r2.A0A(AnonymousClass000.A0X("/unknown-corrupted-global", A0l2), false, e.toString());
        } catch (Exception e2) {
            C55682qk r22 = this.A01;
            StringBuilder A0l3 = AnonymousClass000.A0l("db-corrupted/");
            A0l3.append(this.A02);
            A0l3.append("/");
            r22.A0A(AnonymousClass000.A0X("unknown", A0l3), false, e2.toString());
        } catch (Throwable th) {
            threadLocal.set(Boolean.FALSE);
            throw th;
        }
        threadLocal.set(Boolean.FALSE);
    }

    public AnonymousClass37N(C55682qk r2, String str) {
        this.A01 = r2;
        this.A02 = str;
        this.A00 = new DefaultDatabaseErrorHandler();
    }
}
