package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.2lX  reason: invalid class name and case insensitive filesystem */
public class C52472lX {
    public final C64773Ex A00;
    public final C56982ss A01;
    public final AnonymousClass1VX A02;

    public boolean A00(AnonymousClass3ZH r5) {
        if (r5 != null) {
            int A06 = this.A01.A06((GroupJid) AnonymousClass3ZH.A04(r5));
            if (r5.A0U() && (A06 == 3 || A06 == 1)) {
                return r5.A0s;
            }
        }
        return false;
    }

    public boolean A01(AnonymousClass3ZH r4) {
        if (r4 != null) {
            int A06 = this.A01.A06((GroupJid) AnonymousClass3ZH.A04(r4));
            if (!(!r4.A0U() || A06 == 3 || A06 == 1)) {
                return r4.A0s;
            }
        }
        return false;
    }

    public boolean A02(C95814uZ r4) {
        if (r4 == null || !C627336j.A0K(r4) || !A01(this.A00.A0A(r4))) {
            return false;
        }
        return C56952sp.A0K(this.A02, 3180, false);
    }

    public C52472lX(C64773Ex r1, C56982ss r2, AnonymousClass1VX r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }
}
