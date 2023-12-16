package X;

import android.database.sqlite.SQLiteStatement;
import android.os.SystemClock;

/* renamed from: X.2sQ  reason: invalid class name and case insensitive filesystem */
public abstract class C56702sQ {
    public final SQLiteStatement A00;

    public int A00() {
        long j;
        AnonymousClass1RN r5 = (AnonymousClass1RN) this;
        if (r5.A06) {
            j = SystemClock.uptimeMillis();
        } else {
            j = 0;
        }
        int executeUpdateDelete = r5.A00.executeUpdateDelete();
        r5.A0B((long) executeUpdateDelete, j);
        return executeUpdateDelete;
    }

    public long A01() {
        long j;
        AnonymousClass1RN r4 = (AnonymousClass1RN) this;
        if (r4.A06) {
            j = SystemClock.uptimeMillis();
        } else {
            j = 0;
        }
        long executeInsert = r4.A00.executeInsert();
        r4.A0B(executeInsert, j);
        return executeInsert;
    }

    public void A02() {
        this.A00.clearBindings();
    }

    public void A03() {
        this.A00.close();
    }

    public void A04() {
        this.A00.execute();
    }

    public void A05(int i) {
        this.A00.bindNull(i);
    }

    public void A06(int i, long j) {
        this.A00.bindLong(i, j);
    }

    public void A07(int i, String str) {
        this.A00.bindString(i, str);
    }

    public void A08(int i, byte[] bArr) {
        this.A00.bindBlob(i, bArr);
    }

    public void A09(String[] strArr) {
        this.A00.bindAllArgsAsStrings(strArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C56702sQ) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C56702sQ(SQLiteStatement sQLiteStatement) {
        this.A00 = sQLiteStatement;
    }
}
