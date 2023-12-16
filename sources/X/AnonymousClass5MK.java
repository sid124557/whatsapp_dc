package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.5MK  reason: invalid class name */
public final class AnonymousClass5MK {
    public final C105145Tt A00;

    public AnonymousClass5MK(C105145Tt r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public final void A00(UserJid userJid, int i) {
        C105145Tt r2 = this.A00;
        AnonymousClass5P6 r1 = new AnonymousClass5P6();
        r1.A00 = userJid;
        AnonymousClass5P6.A02(r1, i);
        r1.A0A = r2.A02;
        r1.A05 = Integer.valueOf(r2.A0C.get());
        AnonymousClass5P6.A04(r1, r2);
        r1.A02 = Boolean.TRUE;
        r2.A03(r1);
    }
}
