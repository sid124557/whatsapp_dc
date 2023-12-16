package X;

import java.util.ArrayList;

/* renamed from: X.05K  reason: invalid class name */
public class AnonymousClass05K extends AnonymousClass0R7 {
    public float A00 = -1.0f;
    public int A01;
    public int A02 = -1;
    public int A03 = -1;
    public C04800Qs A04;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001d, code lost:
        if (r0.A0o[0] != X.C02310Fr.A04) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D(X.C05620Uf r10) {
        /*
            r9 = this;
            X.0R7 r3 = r9.A0Z
            if (r3 == 0) goto L_0x005d
            X.0G0 r0 = X.AnonymousClass0G0.LEFT
            X.0Qs r7 = r3.A08(r0)
            X.0G0 r0 = X.AnonymousClass0G0.RIGHT
            X.0Qs r6 = r3.A08(r0)
            X.0R7 r0 = r9.A0Z
            r2 = 1
            r4 = 0
            if (r0 == 0) goto L_0x001f
            X.0Fr[] r0 = r0.A0o
            r1 = r0[r4]
            X.0Fr r0 = X.C02310Fr.WRAP_CONTENT
            r8 = 1
            if (r1 == r0) goto L_0x0020
        L_0x001f:
            r8 = 0
        L_0x0020:
            int r0 = r9.A01
            if (r0 != 0) goto L_0x003d
            X.0G0 r0 = X.AnonymousClass0G0.TOP
            X.0Qs r7 = r3.A08(r0)
            X.0G0 r0 = X.AnonymousClass0G0.BOTTOM
            X.0Qs r6 = r3.A08(r0)
            X.0R7 r0 = r9.A0Z
            if (r0 == 0) goto L_0x00a5
            X.0Fr[] r0 = r0.A0o
            r1 = r0[r2]
            X.0Fr r0 = X.C02310Fr.WRAP_CONTENT
            if (r1 != r0) goto L_0x00a5
        L_0x003c:
            r8 = r2
        L_0x003d:
            int r0 = r9.A02
            r5 = 8
            r1 = -1
            r3 = 5
            if (r0 == r1) goto L_0x005e
            X.0Qs r0 = r9.A04
            X.0Qh r2 = r10.A06(r0)
            X.0Qh r1 = r10.A06(r7)
            int r0 = r9.A02
            r10.A0E(r2, r1, r0, r5)
            if (r8 == 0) goto L_0x005d
            X.0Qh r0 = r10.A06(r6)
            r10.A0F(r0, r2, r4, r3)
        L_0x005d:
            return
        L_0x005e:
            int r0 = r9.A03
            if (r0 == r1) goto L_0x007f
            X.0Qs r0 = r9.A04
            X.0Qh r2 = r10.A06(r0)
            X.0Qh r1 = r10.A06(r6)
            int r0 = r9.A03
            int r0 = -r0
            r10.A0E(r2, r1, r0, r5)
            if (r8 == 0) goto L_0x005d
            X.0Qh r0 = r10.A06(r7)
            r10.A0F(r2, r0, r4, r3)
            r10.A0F(r1, r2, r4, r3)
            return
        L_0x007f:
            float r1 = r9.A00
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x005d
            X.0Qs r0 = r9.A04
            X.0Qh r5 = r10.A06(r0)
            X.0Qh r4 = r10.A06(r6)
            float r3 = r9.A00
            X.0cp r2 = r10.A02()
            X.0uW r1 = r2.A01
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.Bhm(r5, r0)
            X.C07790cp.A00(r2, r4, r3)
            r10.A0A(r2)
            return
        L_0x00a5:
            r2 = 0
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass05K.A0D(X.0Uf):void");
    }

    public void A0F(C05620Uf r6) {
        AnonymousClass0R7 r4 = this.A0Z;
        if (r4 != null) {
            int A002 = C05620Uf.A00(this.A04);
            if (this.A01 == 1) {
                this.A0P = A002;
                this.A0Q = 0;
                A0A(r4.A04());
                A0B(0);
                return;
            }
            this.A0P = 0;
            this.A0Q = A002;
            A0B(r4.A05());
            A0A(0);
        }
    }

    public boolean A0K() {
        return true;
    }

    public void A0N(int i) {
        C04800Qs r3;
        if (this.A01 != i) {
            this.A01 = i;
            ArrayList arrayList = this.A0g;
            arrayList.clear();
            if (i == 1) {
                r3 = this.A0W;
            } else {
                r3 = this.A0Y;
            }
            this.A04 = r3;
            arrayList.add(r3);
            C04800Qs[] r2 = this.A0n;
            int length = r2.length;
            for (int i2 = 0; i2 < length; i2++) {
                r2[i2] = r3;
            }
        }
    }

    public AnonymousClass05K() {
        C04800Qs r3 = this.A0Y;
        this.A04 = r3;
        this.A01 = 0;
        ArrayList arrayList = this.A0g;
        arrayList.clear();
        arrayList.add(r3);
        C04800Qs[] r1 = this.A0n;
        int length = r1.length;
        for (int i = 0; i < length; i++) {
            r1[i] = r3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        throw new java.lang.AssertionError(r3.name());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        if (r2.A01 == 1) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        if (r2.A01 == 0) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        return r2.A04;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C04800Qs A08(X.AnonymousClass0G0 r3) {
        /*
            r2 = this;
            int r0 = r3.ordinal()
            switch(r0) {
                case 1: goto L_0x0009;
                case 2: goto L_0x000f;
                case 3: goto L_0x0009;
                case 4: goto L_0x000f;
                default: goto L_0x0007;
            }
        L_0x0007:
            r0 = 0
            return r0
        L_0x0009:
            int r1 = r2.A01
            r0 = 1
            if (r1 != r0) goto L_0x0016
            goto L_0x0013
        L_0x000f:
            int r0 = r2.A01
            if (r0 != 0) goto L_0x0016
        L_0x0013:
            X.0Qs r0 = r2.A04
            return r0
        L_0x0016:
            java.lang.String r1 = r3.name()
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass05K.A08(X.0G0):X.0Qs");
    }
}
