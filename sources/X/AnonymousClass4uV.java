package X;

import android.database.Cursor;
import java.util.List;

/* renamed from: X.4uV  reason: invalid class name */
public class AnonymousClass4uV extends AnonymousClass5YV {
    public final AnonymousClass314 A00;
    public final C56612sH A01;
    public final C56542sA A02;
    public final C56982ss A03;
    public final C66543Lv A04;
    public final C48672fH A05;
    public final AnonymousClass1f7 A06;
    public final AnonymousClass1R1 A07;
    public final C55832qz A08;

    public final void A00(C95814uZ r18, List list, long j) {
        C95814uZ r10 = r18;
        long A082 = this.A03.A08(r10);
        C66543Lv r9 = this.A04;
        C56612sH r3 = this.A01;
        C42242Ni A0B = r9.A0B(r10, 100, A082, r3.A0H(), true);
        try {
            Cursor cursor = A0B.A00;
            if (cursor != null) {
                if (cursor.moveToFirst()) {
                    do {
                        C624134x A042 = this.A08.A04(cursor, r10);
                        if (A042 != null && A042.A1L != A082 && !A042.A1J.A02 && A042.A0I >= r3.A0H() - j) {
                            list.add(A042);
                        }
                    } while (cursor.moveToNext());
                }
                cursor.close();
            }
        } catch (Throwable th) {
            Cursor cursor2 = A0B.A00;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    public AnonymousClass4uV(AnonymousClass314 r1, C56612sH r2, C56542sA r3, C56982ss r4, C66543Lv r5, C48672fH r6, AnonymousClass1f7 r7, AnonymousClass1R1 r8, C55832qz r9) {
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = r5;
        this.A08 = r9;
        this.A07 = r8;
        this.A00 = r1;
        this.A06 = r7;
        this.A05 = r6;
    }
}
