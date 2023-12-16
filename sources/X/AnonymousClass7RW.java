package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.7RW  reason: invalid class name */
public class AnonymousClass7RW {
    public final C620433g A00;

    public void A00(C95614ty r4, C108985dt r5, UserJid userJid) {
        if (r5 == null || !r5.A0X) {
            r4.A05();
            return;
        }
        C166057y4 r1 = r5.A02;
        if (r1 != null) {
            C620433g r0 = this.A00;
            r0.A0C.A1g(userJid.getRawString(), r1.A00);
        }
        this.A00.A07(r4, userJid, true);
    }

    public AnonymousClass7RW(C620433g r1) {
        this.A00 = r1;
    }
}
