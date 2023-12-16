package X;

import android.database.Cursor;

/* renamed from: X.1mK  reason: invalid class name and case insensitive filesystem */
public abstract class C30361mK extends C624134x {
    public double A00;
    public double A01;
    public int A02;

    public void A1v(Cursor cursor) {
        this.A00 = C18310x6.A00(cursor, "latitude");
        this.A01 = C18310x6.A00(cursor, "longitude");
        A0y().A04(C18280x3.A1Z(cursor, "thumbnail"), true);
    }

    public void A1w(Cursor cursor, C56972sr r4) {
        this.A00 = C18310x6.A00(cursor, "latitude");
        this.A01 = C18310x6.A00(cursor, "longitude");
        this.A02 = AnonymousClass0x2.A04(cursor, "map_download_status");
    }

    public C30361mK(AnonymousClass2z0 r2, byte b, long j) {
        super(r2, b, j);
        this.A02 = 1;
        this.A02 = 0;
    }

    public C614630w A0y() {
        C614630w A0y = super.A0y();
        C626936e.A06(A0y);
        return A0y;
    }

    public C30361mK(AnonymousClass2z0 r10, C30361mK r11, byte b, long j, boolean z) {
        super(r11, r10, b, j, z);
        this.A02 = 1;
        this.A00 = r11.A00;
        this.A01 = r11.A01;
        this.A02 = r11.A02;
    }
}
