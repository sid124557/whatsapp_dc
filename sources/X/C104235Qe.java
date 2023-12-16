package X;

import android.database.Cursor;

/* renamed from: X.5Qe  reason: invalid class name and case insensitive filesystem */
public class C104235Qe {
    public final C56972sr A00;
    public final AnonymousClass36E A01;
    public final AnonymousClass30C A02;
    public final C102905Ks A03;
    public final AnonymousClass5NS A04;
    public final C1907099n A05;
    public final C55832qz A06;

    public boolean A00(C42242Ni r7, C95814uZ r8, C624134x r9) {
        Cursor cursor;
        if (r7 == null || (cursor = r7.A00) == null || cursor.isClosed() || !cursor.moveToFirst()) {
            return true;
        }
        C624134x A042 = this.A06.A04(cursor, r8);
        return A042 == null || A042.A1M < r9.A1M;
    }

    public C104235Qe(C56972sr r1, AnonymousClass36E r2, AnonymousClass30C r3, C102905Ks r4, AnonymousClass5NS r5, C1907099n r6, C55832qz r7) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A06 = r7;
        this.A02 = r3;
        this.A05 = r6;
        this.A04 = r5;
    }
}
