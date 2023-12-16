package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.7T5  reason: invalid class name */
public final class AnonymousClass7T5 {
    public final C56612sH A00;
    public final AnonymousClass1VX A01;
    public final AnonymousClass4FV A02;

    public final void A00(UserJid userJid, AnonymousClass36K r10, Integer num, Integer num2, Long l, String str, int i) {
        if (userJid instanceof PhoneUserJid) {
            AnonymousClass1VX r2 = this.A01;
            if (r2.A0X(2249)) {
                boolean z = false;
                if (!((num == null || num.intValue() == 200) && (num2 == null || num2.intValue() == 200))) {
                    z = true;
                }
                C134026iK r4 = new C134026iK();
                Long A0U = AnonymousClass0x2.A0U();
                r4.A05 = A0U;
                boolean z2 = true;
                if ((r2.A0N(2250) & 1) != 1) {
                    z2 = false;
                }
                r4.A00 = Boolean.valueOf(z2);
                r4.A09 = "status";
                if (l != null) {
                    long longValue = l.longValue();
                    long A0H = this.A00.A0H();
                    r4.A07 = Long.valueOf(longValue);
                    r4.A02 = Long.valueOf(A0H);
                    r4.A01 = C18310x6.A0f(A0H, longValue);
                }
                if (z) {
                    A0U = AnonymousClass0x2.A0T();
                }
                r4.A06 = A0U;
                if (num != null) {
                    r4.A03 = C18280x3.A0U(num);
                }
                if (num2 != null) {
                    r4.A04 = C18280x3.A0U(num2);
                }
                if (str != null) {
                    r4.A08 = str;
                }
                C18260x0.A1P(AnonymousClass001.A0o(), "mexmigrationperftracker/sendevent sending WAM event: ", r4);
                this.A02.BhD(r4);
                C18260x0.A0y("mexmigrationperftracker/requeststopped ", AnonymousClass001.A0o(), i);
                if (r10 != null) {
                    Log.d("mexmigrationperftracker/RECEIVED a response");
                }
                if (num != null || num2 != null) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("mexmigrationperftracker/RECEIVED (envelope ERROR: ");
                    A0o.append(num);
                    A0o.append(") (payload ERROR: ");
                    Log.d(C18260x0.A04(num2, A0o));
                }
            }
        }
    }

    public AnonymousClass7T5(C56612sH r1, AnonymousClass1VX r2, AnonymousClass4FV r3) {
        C18260x0.A0V(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
