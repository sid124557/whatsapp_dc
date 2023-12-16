package X;

import android.database.Cursor;

/* renamed from: X.0fe  reason: invalid class name and case insensitive filesystem */
public final class C09100fe implements C16760tv {
    public final C012209r A00;
    public final AnonymousClass0R5 A01;

    public Long B9F(String str) {
        C08700eu A012 = C02920Ic.A01("SELECT long_value FROM Preference where `key`=?", str);
        AnonymousClass0R5 r0 = this.A01;
        r0.A09();
        Long l = null;
        Cursor A002 = C02930Id.A00(r0, A012, false);
        try {
            if (A002.moveToFirst() && !A002.isNull(0)) {
                l = Long.valueOf(A002.getLong(0));
            }
            return l;
        } finally {
            A002.close();
            A012.A01();
        }
    }

    public void BGe(AnonymousClass0PK r3) {
        AnonymousClass0R5 r1 = this.A01;
        r1.A09();
        r1.A0A();
        try {
            this.A00.A05(r3);
            r1.A0B();
        } finally {
            r1.A0C();
        }
    }

    public C09100fe(AnonymousClass0R5 r3) {
        this.A01 = r3;
        this.A00 = new C17620vs(r3, this, 1);
    }
}
