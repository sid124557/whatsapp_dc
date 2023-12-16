package X;

import java.util.Iterator;

/* renamed from: X.2oz  reason: invalid class name and case insensitive filesystem */
public final class C54602oz {
    public final C69253Wh A00;
    public final AnonymousClass4FS A01;
    public final C183538qC A02;

    public final void A00(C51692kE r7, C624134x r8) {
        C162457s7.A0J(r7, 1);
        C183538qC r5 = this.A02;
        Iterator A0j = AnonymousClass0x2.A0j(r5);
        while (A0j.hasNext()) {
            C84554Cu r1 = (C84554Cu) A0j.next();
            if (r1.BLR(r7, r8)) {
                r1.BJr(r7, r8);
            }
        }
        C624134x A0w = r8.A0w();
        if (A0w != null) {
            C51692kE r3 = new C51692kE(r7.A00, true);
            Iterator A0j2 = AnonymousClass0x2.A0j(r5);
            while (A0j2.hasNext()) {
                C84554Cu r12 = (C84554Cu) A0j2.next();
                if (r12.BLR(r3, A0w)) {
                    r12.BJr(r3, A0w);
                }
            }
        }
    }

    public final void A01(C51692kE r12, C624134x r13, Runnable runnable) {
        C51692kE r8;
        C624134x r7;
        Runnable runnable2;
        C183538qC r4 = this.A02;
        Iterator A0j = AnonymousClass0x2.A0j(r4);
        while (true) {
            r8 = r12;
            r7 = r13;
            runnable2 = runnable;
            if (A0j.hasNext()) {
                if (((C84554Cu) A0j.next()).BLR(r12, r13)) {
                    break;
                }
            } else {
                C624134x A0w = r13.A0w();
                if (A0w != null) {
                    C51692kE r2 = new C51692kE(r12.A00, true);
                    Iterator A0j2 = AnonymousClass0x2.A0j(r4);
                    while (A0j2.hasNext()) {
                        if (((C84554Cu) A0j2.next()).BLR(r2, A0w)) {
                        }
                    }
                }
                this.A00.BkS(runnable);
                return;
            }
        }
        this.A01.BkM(new C70513ac(this, r7, r8, runnable2, 0));
    }

    public final void A02(C624134x r4) {
        C162457s7.A0J(r4, 0);
        A00(new C51692kE(C72063d7.A00, false), r4);
    }

    public final void A03(C624134x r4, Runnable runnable) {
        C162457s7.A0J(r4, 0);
        A01(new C51692kE(C72063d7.A00, false), r4, runnable);
    }

    public C54602oz(C69253Wh r1, AnonymousClass4FS r2, C183538qC r3) {
        C18260x0.A0V(r2, r1, r3);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
