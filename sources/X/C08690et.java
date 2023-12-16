package X;

import android.database.sqlite.SQLiteProgram;

/* renamed from: X.0et  reason: invalid class name and case insensitive filesystem */
public class C08690et implements C17420vV {
    public final SQLiteProgram A00;

    public C08690et(SQLiteProgram sQLiteProgram) {
        C162457s7.A0J(sQLiteProgram, 1);
        this.A00 = sQLiteProgram;
    }

    public void Axp(int i, byte[] bArr) {
        C162457s7.A0J(bArr, 1);
        this.A00.bindBlob(i, bArr);
    }

    public void Axu(int i, String str) {
        C162457s7.A0J(str, 1);
        this.A00.bindString(i, str);
    }

    public void Axr(int i, double d) {
        this.A00.bindDouble(i, d);
    }

    public void Axs(int i, long j) {
        this.A00.bindLong(i, j);
    }

    public void Axt(int i) {
        this.A00.bindNull(i);
    }

    public void close() {
        this.A00.close();
    }
}
