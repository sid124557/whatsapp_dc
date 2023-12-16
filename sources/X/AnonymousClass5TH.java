package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.5TH  reason: invalid class name */
public final class AnonymousClass5TH {
    public final C56972sr A00;
    public final C56722sS A01;
    public final C50192hm A02;
    public final C54862pP A03;
    public final C64773Ex A04;
    public final C54292oU A05;
    public final C56982ss A06;
    public final AnonymousClass1VX A07;
    public final C183538qC A08;
    public final C183538qC A09;

    public boolean A02(C95814uZ r3) {
        if (r3 != null && A00() && !C155477ey.A00(r3) && !this.A00.A0a(r3)) {
            if (r3 instanceof UserJid) {
                AnonymousClass3ZH A072 = this.A04.A07(r3);
                if (A072 == null || A072.A00 == 0) {
                    return true;
                }
            } else if (r3 instanceof C27991fJ) {
                return true;
            }
        }
        return false;
    }

    public boolean A00() {
        C52802m4 r1 = this.A01.A01;
        if (!r1.A00() || !r1.A01()) {
            return false;
        }
        return true;
    }

    public AnonymousClass5TH(C56972sr r1, C56722sS r2, C50192hm r3, C54862pP r4, C64773Ex r5, C54292oU r6, C56982ss r7, AnonymousClass1VX r8, C183538qC r9, C183538qC r10) {
        C18260x0.A0f(r8, r6, r1, r2, r7);
        C18260x0.A0g(r5, r4, r9, r10, r3);
        this.A07 = r8;
        this.A05 = r6;
        this.A00 = r1;
        this.A01 = r2;
        this.A06 = r7;
        this.A04 = r5;
        this.A03 = r4;
        this.A08 = r9;
        this.A09 = r10;
        this.A02 = r3;
    }

    public boolean A01(C95814uZ r4) {
        if (A02(r4)) {
            C56982ss r1 = this.A06;
            if (r1.A0N(r4) || (r4 != null && AnonymousClass352.A00(this.A04, r1, r4) > 0)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
