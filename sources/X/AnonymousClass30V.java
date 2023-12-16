package X;

import java.util.Iterator;
import java.util.Set;

/* renamed from: X.30V  reason: invalid class name */
public final class AnonymousClass30V {
    public static final AnonymousClass66R A0A = C154517dI.A00(AnonymousClass58H.NONE, C817240v.A00);
    public int A00 = 8;
    public final C56612sH A01;
    public final AnonymousClass1VX A02;
    public final AnonymousClass4FV A03;
    public final C45582aF A04;
    public final AnonymousClass4FS A05;
    public final C183538qC A06;
    public final AnonymousClass66R A07 = C154517dI.A01(new C79663wz(this));
    public final AnonymousClass66R A08 = C154517dI.A01(new C79673x0(this));
    public volatile boolean A09;

    public final synchronized void A00() {
        if (C18270x1.A1V(this.A07) && this.A00 != 1) {
            if (this.A09) {
                this.A09 = false;
            } else {
                C25871bD r1 = new C25871bD();
                r1.A06 = Integer.valueOf(this.A00);
                r1.A05 = 1;
                A01(r1);
                this.A00 = 1;
            }
        }
    }

    public final synchronized void A01(C25871bD r5) {
        if (!C73723fy.A0U((Set) A0A.getValue(), AnonymousClass3Z6.A02(r5.A06, r5.A05))) {
            C45582aF r1 = this.A04;
            r5.A0B = AnonymousClass0x9.A0m(r1.A00());
            r5.A0A = C18310x6.A0f(this.A01.A0H(), AnonymousClass0x2.A0A(r1.A02.A00(), "session_start_timestamp"));
            this.A03.BhA(r5);
        }
    }

    public final synchronized void A02(C95814uZ r3, int i) {
        if (C18270x1.A1V(this.A07) && !A04(i)) {
            C71713cY.A00(this.A05, this, r3, i, 24);
        }
    }

    public final synchronized void A03(C95814uZ r5, int i) {
        if (C18270x1.A1V(this.A07) && !A04(i)) {
            C25871bD r3 = new C25871bD();
            r3.A06 = Integer.valueOf(this.A00);
            r3.A05 = Integer.valueOf(i);
            Iterator A0Y = C18270x1.A0Y(this.A06);
            while (A0Y.hasNext()) {
                C84664Df r1 = (C84664Df) A0Y.next();
                if (r1.BoJ(r5)) {
                    r1.AwZ(r3, r5);
                }
            }
            this.A09 = true;
            A01(r3);
            this.A00 = i;
        }
    }

    public final boolean A04(int i) {
        return ((1 << i) & AnonymousClass0x2.A09(this.A08)) != 0;
    }

    public AnonymousClass30V(C56612sH r2, AnonymousClass1VX r3, AnonymousClass4FV r4, C45582aF r5, AnonymousClass4FS r6, C183538qC r7) {
        C18260x0.A0f(r2, r3, r6, r4, r5);
        C162457s7.A0J(r7, 6);
        this.A01 = r2;
        this.A02 = r3;
        this.A05 = r6;
        this.A03 = r4;
        this.A04 = r5;
        this.A06 = r7;
    }
}
