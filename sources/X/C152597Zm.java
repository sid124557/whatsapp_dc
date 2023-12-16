package X;

/* renamed from: X.7Zm  reason: invalid class name and case insensitive filesystem */
public final class C152597Zm {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public final C161467pi A05 = C161467pi.A05(255);
    public final int[] A06 = new int[255];

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001f, code lost:
        if (r14 == false) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A01(X.C187648xa r13, boolean r14) {
        /*
            r12 = this;
            r3 = 0
            r12.A03 = r3
            r0 = 0
            r12.A04 = r0
            r12.A02 = r3
            r12.A01 = r3
            r12.A00 = r3
            X.7pi r4 = r12.A05
            r1 = 27
            r4.A0Q(r1)
            byte[] r0 = r4.A02
            r6 = 0
            boolean r0 = r13.Bge(r0, r3, r1, r14)     // Catch:{ EOFException -> 0x001e }
            if (r0 == 0) goto L_0x0021
            goto L_0x0022
        L_0x001e:
            r0 = move-exception
            if (r14 == 0) goto L_0x003b
        L_0x0021:
            return r3
        L_0x0022:
            long r7 = r4.A0I()
            r1 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0021
            int r0 = r4.A0C()
            if (r0 == 0) goto L_0x003c
            if (r14 != 0) goto L_0x0021
            java.lang.String r0 = "unsupported bit stream revision"
            X.6u7 r0 = X.AnonymousClass6u7.A01(r0)
        L_0x003b:
            throw r0
        L_0x003c:
            int r0 = r4.A0C()
            r12.A03 = r0
            byte[] r5 = r4.A02
            int r0 = r4.A01
            int r2 = r0 + 1
            byte r0 = r5[r0]
            long r0 = (long) r0
            r10 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r10
            int r3 = r2 + 1
            byte r2 = r5[r2]
            long r0 = X.AnonymousClass6C9.A0L(r2, r0)
            int r7 = r3 + 1
            byte r2 = r5[r3]
            long r2 = X.AnonymousClass6C8.A0O(r2, r0)
            int r9 = r7 + 1
            byte r0 = r5[r7]
            long r0 = (long) r0
            long r0 = r0 & r10
            r7 = 24
            long r0 = r0 << r7
            long r2 = r2 | r0
            int r8 = r9 + 1
            byte r0 = r5[r9]
            long r0 = (long) r0
            long r0 = r0 & r10
            r7 = 32
            long r0 = r0 << r7
            long r2 = r2 | r0
            int r9 = r8 + 1
            byte r0 = r5[r8]
            long r0 = (long) r0
            long r0 = r0 & r10
            r7 = 40
            long r0 = r0 << r7
            long r2 = r2 | r0
            int r8 = r9 + 1
            byte r0 = r5[r9]
            long r0 = (long) r0
            long r0 = r0 & r10
            r7 = 48
            long r0 = r0 << r7
            long r2 = r2 | r0
            int r0 = r8 + 1
            r4.A01 = r0
            byte r0 = r5[r8]
            long r0 = (long) r0
            long r0 = r0 & r10
            r5 = 56
            long r0 = r0 << r5
            long r2 = r2 | r0
            r12.A04 = r2
            r4.A0G()
            r4.A0G()
            r4.A0G()
            int r1 = r4.A0C()
            r12.A02 = r1
            int r0 = r1 + 27
            r12.A01 = r0
            r4.A0Q(r1)
            X.C161467pi.A06(r13, r4, r1)
        L_0x00ad:
            int r0 = r12.A02
            if (r6 >= r0) goto L_0x00c1
            int[] r0 = r12.A06
            int r1 = r4.A0C()
            r0[r6] = r1
            int r0 = r12.A00
            int r0 = r0 + r1
            r12.A00 = r0
            int r6 = r6 + 1
            goto L_0x00ad
        L_0x00c1:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C152597Zm.A01(X.8xa, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        if (r4 != 0) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        if (r10.BBW() < r11) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        if (r10.BpM(1) == -1) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A00(X.C187648xa r10, long r11) {
        /*
            r9 = this;
            long r3 = r10.BBW()
            long r1 = r10.BBF()
            r6 = 0
            r5 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1T(r0)
            X.C161487pm.A03(r0)
            X.7pi r8 = r9.A05
            r7 = 4
            r8.A0Q(r7)
        L_0x0019:
            r0 = -1
            int r4 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x002a
            long r2 = r10.BBW()
            r0 = 4
            long r2 = r2 + r0
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x004a
        L_0x002a:
            byte[] r0 = r8.A02
            boolean r0 = r10.Bge(r0, r6, r7, r5)     // Catch:{ EOFException -> 0x0048 }
            if (r0 == 0) goto L_0x0048
            r8.A0S(r6)
            long r3 = r8.A0I()
            r1 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0044
            r10.Bjy()
            return r5
        L_0x0044:
            r10.BpP(r5)
            goto L_0x0019
        L_0x0048:
            if (r4 == 0) goto L_0x0052
        L_0x004a:
            long r1 = r10.BBW()
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x005a
        L_0x0052:
            int r1 = r10.BpM(r5)
            r0 = -1
            if (r1 == r0) goto L_0x005a
            goto L_0x0048
        L_0x005a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C152597Zm.A00(X.8xa, long):boolean");
    }
}
