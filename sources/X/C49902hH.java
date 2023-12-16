package X;

import java.util.Collection;

/* renamed from: X.2hH  reason: invalid class name and case insensitive filesystem */
public final class C49902hH {
    public final C55682qk A00;
    public final C29441ip A01;
    public final C57162tC A02;
    public final C183538qC A03;
    public final AnonymousClass66R A04;

    public final boolean A00(C369020e r4, C624134x r5) {
        Iterable<C84094Az> iterable = (Iterable) C18300x5.A0b(this.A03);
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (C84094Az BIP : iterable) {
                if (!BIP.BIP(r5)) {
                    return false;
                }
            }
        }
        if (A01(r4, r5)) {
            return true;
        }
        return false;
    }

    public C49902hH(C55682qk r2, C29441ip r3, C57162tC r4, C46422bb r5, C183538qC r6) {
        C18260x0.A0f(r5, r2, r6, r3, r4);
        this.A00 = r2;
        this.A03 = r6;
        this.A01 = r3;
        this.A02 = r4;
        this.A04 = C154517dI.A01(new C79013vw(r5));
    }

    public final boolean A01(C369020e r6, C624134x r7) {
        boolean A1W = C18290x4.A1W(r6);
        AnonymousClass66R r3 = this.A04;
        byte b = r7.A1I;
        if (!((C53662nS) r3.getValue()).A04(b)) {
            return A1W;
        }
        AnonymousClass4G4 r1 = (AnonymousClass4G4) C53662nS.A00(r3, b);
        if ((r6 != C369020e.PIN || !r1.BIP(r7)) && (r6 != C369020e.UNPIN || !r1.BJB(r7))) {
            return false;
        }
        return true;
    }
}
