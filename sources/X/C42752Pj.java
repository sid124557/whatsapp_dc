package X;

import android.database.Cursor;

/* renamed from: X.2Pj  reason: invalid class name and case insensitive filesystem */
public class C42752Pj {
    public final long A00;
    public final long A01;
    public final AnonymousClass2z0 A02;
    public final boolean A03;

    public C42752Pj(Cursor cursor, C95814uZ r7) {
        String A0Z = AnonymousClass0x2.A0Z(cursor, "key_id");
        boolean z = false;
        boolean A1U = AnonymousClass000.A1U(AnonymousClass0x2.A04(cursor, "from_me"), 1);
        this.A02 = AnonymousClass2z0.A05(r7, A0Z, A1U);
        cursor.getLong(AnonymousClass0x7.A02(cursor));
        this.A00 = AnonymousClass0x2.A0C(cursor, "sort_id");
        this.A03 = AnonymousClass0x2.A04(cursor, "starred") == 1 ? true : z;
        this.A01 = AnonymousClass33E.A01(cursor, A1U);
    }
}
