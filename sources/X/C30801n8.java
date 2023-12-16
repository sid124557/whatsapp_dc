package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1n8  reason: invalid class name and case insensitive filesystem */
public class C30801n8 extends C30361mK implements AnonymousClass4B9 {
    public int A00;
    public long A01;
    public C54942pX A02;
    public String A03;

    public C30801n8(AnonymousClass2z0 r10, C30801n8 r11, long j) {
        super(r10, r11, r11.A1I, j, true);
        this.A00 = r11.A00;
        this.A01 = r11.A01;
        this.A03 = r11.A03;
        this.A02 = r11.A02;
    }

    public C624134x Az3(AnonymousClass2z0 r4) {
        return new C30801n8(r4, this, this.A0K);
    }

    public void A1w(Cursor cursor, C56972sr r11) {
        UserJid A0o;
        super.A1w(cursor, r11);
        this.A00 = AnonymousClass0x2.A04(cursor, "live_location_share_duration");
        this.A01 = AnonymousClass0x2.A0C(cursor, "live_location_sequence_number");
        double A002 = C18310x6.A00(cursor, "live_location_final_latitude");
        double A003 = C18310x6.A00(cursor, "live_location_final_longitude");
        long A0C = AnonymousClass0x2.A0C(cursor, "live_location_final_timestamp");
        if (A002 != 0.0d || A003 != 0.0d || A0C != 0) {
            if (this.A1J.A02) {
                A0o = C56972sr.A04(r11);
            } else {
                A0o = A0o();
            }
            C626936e.A06(A0o);
            C54942pX r0 = new C54942pX(A0o);
            r0.A00 = A002;
            r0.A01 = A003;
            r0.A05 = A0C;
            this.A02 = r0;
        }
    }

    public C30801n8(AnonymousClass2z0 r2, long j) {
        super(r2, (byte) 16, j);
    }
}
