package X;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: X.2eB  reason: invalid class name and case insensitive filesystem */
public class C48002eB {
    public final C72303dV A00;

    public final void A00(C30431mR r6, String str, String str2) {
        Cursor A0E;
        AnonymousClass4GK A03 = this.A00.get();
        try {
            C56862sg r3 = ((AnonymousClass3H0) A03).A03;
            String[] A1Y = AnonymousClass0x9.A1Y();
            C18260x0.A1Y(A1Y, r6.A1L);
            A0E = r3.A0E(str, str2, A1Y);
            if (A0E.moveToLast()) {
                r6.A00 = AnonymousClass0x2.A04(A0E, "service");
                r6.A01 = AnonymousClass0x2.A0C(A0E, "expiration_timestamp");
            }
            A0E.close();
            A03.close();
            return;
        } catch (Throwable th) {
            try {
                A03.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public final void A01(String str, String str2, int i, long j, long j2) {
        C85284Fq A04 = this.A00.A04();
        try {
            ContentValues A0E = C18290x4.A0E();
            C18270x1.A0a(A0E, j);
            C18270x1.A0b(A0E, "service", i);
            AnonymousClass3H0.A02(A0E, A04, "expiration_timestamp", j2).A0C(str, str2, A0E, 5);
            A04.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public C48002eB(C72303dV r1) {
        this.A00 = r1;
    }
}
