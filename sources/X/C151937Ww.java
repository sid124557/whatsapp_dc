package X;

import java.util.List;

/* renamed from: X.7Ww  reason: invalid class name and case insensitive filesystem */
public class C151937Ww {
    public int A00 = 0;
    public long A01;
    public C152767a5 A02;
    public List A03 = null;
    public final C1672580j A04 = new C1672580j();
    public final /* synthetic */ C161787qS A05;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r3.A05;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(boolean r4, int r5) {
        /*
            r3 = this;
            r0 = 3
            if (r5 != r0) goto L_0x0012
            X.7qS r1 = r3.A05
            X.7a6 r0 = r1.A0B
            if (r0 == 0) goto L_0x0012
            X.7yv r0 = r0.A0F
            boolean r0 = r0.A0R
            if (r0 == 0) goto L_0x0012
            X.C161787qS.A01(r1)
        L_0x0012:
            X.7qS r0 = r3.A05
            java.util.List r0 = r0.A0U
            java.util.Iterator r2 = r0.iterator()
        L_0x001a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r2.next()
            X.8ub r1 = (X.C186008ub) r1
            r0 = 0
            r1.BYN(r5, r4, r0)
            goto L_0x001a
        L_0x002b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C151937Ww.A01(boolean, int):void");
    }

    public C151937Ww(C161787qS r2) {
        this.A05 = r2;
    }

    public void A00(int i) {
        C161787qS r1 = this.A05;
        C152777a6 r0 = r1.A0B;
        if (r0 != null && r0.A0F.A0R) {
            C161787qS.A01(r1);
        }
        if (r1.A0R.improveLooping) {
            for (C186008ub BYS : r1.A0U) {
                BYS.BYS(i);
            }
        }
    }
}
