package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2h6  reason: invalid class name and case insensitive filesystem */
public class C49792h6 {
    public final C52852m9 A00;
    public final C56922sm A01;
    public final C56982ss A02;
    public final C55272q5 A03;
    public final C55832qz A04;

    public C31341o8 A00(UserJid userJid) {
        AnonymousClass31A A002 = C56982ss.A00(this.A02, userJid);
        if (A002 == null) {
            return null;
        }
        long j = A002.A0C;
        if (j == -1) {
            return null;
        }
        C624134x A003 = C55122pp.A00(this.A04, j);
        if (!(A003 instanceof C30341mI) || ((C30341mI) A003).A00 != 28) {
            return null;
        }
        return (C31341o8) A003;
    }

    public void A01(UserJid userJid, C30341mI r6) {
        AnonymousClass31A A002 = C56982ss.A00(this.A02, userJid);
        if (A002 != null) {
            this.A00.A01(new C70343aL(this, A002, r6, 1), 18);
        }
    }

    public C49792h6(C52852m9 r1, C56922sm r2, C56982ss r3, C55272q5 r4, C55832qz r5) {
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = r5;
        this.A00 = r1;
        this.A03 = r4;
    }
}
