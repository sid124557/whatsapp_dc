package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDiskIOException;

/* renamed from: X.2Y6  reason: invalid class name */
public class AnonymousClass2Y6 {
    public final C28761hj A00;
    public final C72303dV A01;

    public int A00(String str) {
        Cursor A0E;
        try {
            AnonymousClass4GK A03 = this.A01.get();
            try {
                int i = 0;
                A0E = ((AnonymousClass3H0) A03).A03.A0E("SELECT ref_count FROM media_refs WHERE path = ?", "GET_MEDIA_REF_COUNT_SQL", new String[]{str});
                if (A0E.moveToNext()) {
                    i = AnonymousClass0x2.A04(A0E, "ref_count");
                }
                A0E.close();
                A03.close();
                return i;
            } catch (Throwable th) {
                A03.close();
                throw th;
            }
            throw th;
        } catch (SQLiteDiskIOException e) {
            this.A00.A08(1);
            throw e;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public AnonymousClass2Y6(C28761hj r1, C72303dV r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
