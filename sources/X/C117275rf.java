package X;

import java.util.Iterator;

/* renamed from: X.5rf  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C117275rf implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ AnonymousClass5TM A03;

    public final void run() {
        AnonymousClass5TM r0 = this.A03;
        int i = this.A01;
        int i2 = this.A02;
        float f = this.A00;
        C147447Ei r4 = r0.A05;
        if (r4 != null) {
            int i3 = r0.A09;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("CompositeHeroPlayer - onVideoSizeChanged() - ");
            A0o.append(i3);
            AnonymousClass001.A1M(A0o);
            A0o.append(i);
            C18260x0.A0w(" x ", A0o, i2);
            C158577kC r2 = new C158577kC(i, i2, f);
            C106075Xn r1 = r4.A00;
            r1.A0F[i3] = r2;
            if (i3 == r1.A00 % 2) {
                r1.A02(i3);
            }
            for (AnonymousClass7RZ r02 : r1.A0D) {
                C158617kH r03 = r02.A00.A01;
                if (r03 != null) {
                    Iterator it = r03.A03.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            }
        }
    }

    public /* synthetic */ C117275rf(AnonymousClass5TM r1, float f, int i, int i2) {
        this.A03 = r1;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = f;
    }
}
