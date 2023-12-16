package X;

import java.util.Iterator;

/* renamed from: X.5U1  reason: invalid class name */
public final class AnonymousClass5U1 {
    public final C101795Gd A00;
    public final C183538qC A01;
    public final AnonymousClass66R A02;

    public final boolean A01(C624134x r5) {
        C162457s7.A0J(r5, 0);
        if (r5.A05 <= 0 || r5.A1F) {
            return false;
        }
        Iterator A0j = AnonymousClass0x2.A0j(this.A01);
        while (A0j.hasNext()) {
            if (C162457s7.A0P(((C1229566m) A0j.next()).BHv(r5), Boolean.FALSE)) {
                return false;
            }
        }
        return A00(this, r5).BHw(r5);
    }

    public final boolean A02(C624134x r5) {
        C162457s7.A0J(r5, 0);
        if (r5.A1J.A02 && AnonymousClass358.A00(r5.A0D, 4) < 0) {
            return false;
        }
        Iterator A0j = AnonymousClass0x2.A0j(this.A01);
        while (A0j.hasNext()) {
            if (C162457s7.A0P(((C1229566m) A0j.next()).BIa(r5), Boolean.FALSE)) {
                return false;
            }
        }
        return A00(this, r5).BIb(r5);
    }

    public final boolean A03(C624134x r5) {
        C162457s7.A0J(r5, 0);
        if (!r5.A1J.A02) {
            Iterator A0j = AnonymousClass0x2.A0j(this.A01);
            while (A0j.hasNext()) {
                if (C162457s7.A0P(((C1229566m) A0j.next()).BIj(r5), Boolean.FALSE)) {
                }
            }
            return A00(this, r5).BIk(r5);
        }
        return false;
    }

    public final boolean A04(C624134x r5) {
        C162457s7.A0J(r5, 0);
        Iterator A0j = AnonymousClass0x2.A0j(this.A01);
        while (A0j.hasNext()) {
            if (C162457s7.A0P(((C1229566m) A0j.next()).BIw(r5), Boolean.FALSE)) {
                return false;
            }
        }
        return A00(this, r5).BIx(r5);
    }

    public final boolean A05(C624134x r5) {
        C162457s7.A0J(r5, 0);
        Iterator A0j = AnonymousClass0x2.A0j(this.A01);
        while (A0j.hasNext()) {
            if (C162457s7.A0P(((C1229566m) A0j.next()).BIz(r5), Boolean.FALSE)) {
                return false;
            }
        }
        return A00(this, r5).BJ0(r5);
    }

    public static AnonymousClass67E A00(AnonymousClass5U1 r1, C624134x r2) {
        return (AnonymousClass67E) ((C53662nS) r1.A02.getValue()).A02(r2.A1I);
    }

    public AnonymousClass5U1(C46422bb r2, C101795Gd r3, C183538qC r4) {
        C18260x0.A0R(r2, r4);
        this.A00 = r3;
        this.A01 = r4;
        this.A02 = C154517dI.A01(new C78503v7(r2));
    }
}
