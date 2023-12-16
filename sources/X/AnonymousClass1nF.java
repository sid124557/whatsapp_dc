package X;

import android.database.Cursor;

/* renamed from: X.1nF  reason: invalid class name */
public class AnonymousClass1nF extends C30471mV implements AnonymousClass4B9 {
    public int A00;
    public String A01;

    public C624134x Az3(AnonymousClass2z0 r9) {
        AnonymousClass2z0 r2 = r9;
        if (this instanceof C30731mv) {
            C30731mv r3 = (C30731mv) this;
            return new C30731mv(r3.A01, r2, r3, r3.A0K);
        } else if (this instanceof C30741mw) {
            C30741mw r32 = (C30741mw) this;
            C162457s7.A0J(r9, 0);
            long j = r32.A0K;
            AnonymousClass33C r1 = r32.A01;
            C162457s7.A0H(r1);
            return new C30741mw(r1, r2, r32, j, true);
        } else {
            return new AnonymousClass1nF(this.A01, r2, this, this.A1I, this.A0K, true);
        }
    }

    public void A23(String str) {
        this.A01 = C107575bX.A0C(str, 65536);
    }

    public C614630w A0y() {
        C614630w A0y = super.A0y();
        C626936e.A06(A0y);
        return A0y;
    }

    public void A1y(Cursor cursor, AnonymousClass33C r3) {
        super.A1y(cursor, r3);
        this.A00 = AnonymousClass0x2.A04(cursor, "page_count");
        A23(AnonymousClass0x2.A0Z(cursor, "media_caption"));
    }

    public void A1z(Cursor cursor, AnonymousClass33C r3) {
        super.A1z(cursor, r3);
        this.A00 = AnonymousClass0x2.A04(cursor, "page_count");
        A23(AnonymousClass0x2.A0Z(cursor, "media_caption"));
    }

    public AnonymousClass1nF(AnonymousClass2z0 r1, byte b, long j) {
        super(r1, b, j);
    }

    public AnonymousClass1nF(AnonymousClass2z0 r2, long j) {
        super(r2, (byte) 9, j);
    }

    public AnonymousClass1nF(AnonymousClass33C r2, AnonymousClass2z0 r3, AnonymousClass1nF r4, byte b, long j, boolean z) {
        super(r2, r3, r4, b, j, z);
        this.A00 = r4.A00;
        this.A01 = r4.A01;
    }
}
