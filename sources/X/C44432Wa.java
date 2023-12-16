package X;

import android.database.Cursor;

/* renamed from: X.2Wa  reason: invalid class name and case insensitive filesystem */
public class C44432Wa {
    public final C49102fz A00;

    public int A00() {
        Cursor A01;
        int i;
        AnonymousClass4GK A002 = this.A00.A00();
        try {
            A01 = C56862sg.A01(((AnonymousClass3H0) A002).A03, "SELECT COUNT(*) as count FROM prefetched_files WHERE prefetched = 0", "XPM_FILE_PREFETCHER_PENDING_COUNT");
            if (A01.moveToNext()) {
                i = AnonymousClass0x2.A03(A01);
            } else {
                i = 0;
            }
            A01.close();
            A002.close();
            return i;
        } catch (Throwable th) {
            try {
                A002.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public C44432Wa(C49102fz r1) {
        this.A00 = r1;
    }
}
