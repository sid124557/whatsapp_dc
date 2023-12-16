package X;

/* renamed from: X.7WY  reason: invalid class name */
public abstract class AnonymousClass7WY {
    public C156927hR A00;
    public final int A01;
    public final C1687386o A02;
    public final C183858qm A03;

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0073, code lost:
        r9.A00 = null;
        r8.Bb3();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00(X.C187648xa r24, X.AnonymousClass7BG r25) {
        /*
            r23 = this;
        L_0x0000:
            r9 = r23
            X.7hR r6 = r9.A00
            X.C161487pm.A01(r6)
            long r0 = r6.A02
            long r10 = r6.A00
            long r3 = r6.A04
            long r10 = r10 - r0
            int r2 = r9.A01
            long r7 = (long) r2
            int r2 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            r10 = r24
            r7 = r25
            if (r2 > 0) goto L_0x002d
            r2 = 0
            r9.A00 = r2
            X.8qm r2 = r9.A03
            r2.Bb3()
            long r3 = r10.BBW()
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x00ad
            r7.A00 = r0
        L_0x002b:
            r0 = 1
            return r0
        L_0x002d:
            long r11 = r10.BBW()
            long r0 = r3 - r11
            r11 = 0
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 < 0) goto L_0x0079
            r11 = 262144(0x40000, double:1.295163E-318)
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 > 0) goto L_0x0079
            int r2 = (int) r0
            r10.BpP(r2)
            r10.Bjy()
            X.8qm r8 = r9.A03
            long r11 = r6.A07
            X.7gl r1 = r8.Bkt(r10, r11)
            int r2 = r1.A00
            r0 = -3
            if (r2 == r0) goto L_0x0073
            r0 = -2
            if (r2 == r0) goto L_0x0084
            r0 = -1
            if (r2 == r0) goto L_0x0091
            long r3 = r1.A01
            long r0 = r10.BBW()
            long r5 = r3 - r0
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0073
            r1 = 262144(0x40000, double:1.295163E-318)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0073
            int r0 = (int) r5
            r10.BpP(r0)
        L_0x0073:
            r0 = 0
            r9.A00 = r0
            r8.Bb3()
        L_0x0079:
            long r1 = r10.BBW()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00ad
            r7.A00 = r3
            goto L_0x002b
        L_0x0084:
            long r13 = r1.A02
            long r2 = r1.A01
            r6.A03 = r13
            r6.A02 = r2
            long r15 = r6.A01
            long r4 = r6.A00
            goto L_0x009d
        L_0x0091:
            long r15 = r1.A02
            long r4 = r1.A01
            r6.A01 = r15
            r6.A00 = r4
            long r13 = r6.A03
            long r2 = r6.A02
        L_0x009d:
            long r0 = r6.A05
            r19 = r4
            r21 = r0
            r17 = r2
            long r0 = X.C156927hR.A00(r11, r13, r15, r17, r19, r21)
            r6.A04 = r0
            goto L_0x0000
        L_0x00ad:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7WY.A00(X.8xa, X.7BG):int");
    }

    public final void A01(long j) {
        C156927hR r0 = this.A00;
        long j2 = j;
        if (r0 == null || r0.A06 != j) {
            C1687386o r1 = this.A02;
            this.A00 = new C156927hR(j2, r1.A05.Bqi(j2), r1.A02, r1.A04, r1.A01, r1.A00);
        }
    }

    public AnonymousClass7WY(C180648lP r13, C183858qm r14, int i, long j, long j2, long j3, long j4, long j5) {
        this.A03 = r14;
        this.A01 = i;
        this.A02 = new C1687386o(r13, j, j2, j3, j4, j5);
    }
}
