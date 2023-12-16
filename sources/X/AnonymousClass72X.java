package X;

/* renamed from: X.72X  reason: invalid class name */
public final class AnonymousClass72X {
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        if (r3 > 0) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        if (r3 < 0) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        return r5 + r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(java.math.RoundingMode r6, int r7, int r8) {
        /*
            if (r8 == 0) goto L_0x0044
            int r5 = r7 / r8
            int r0 = r8 * r5
            int r4 = r7 - r0
            if (r4 == 0) goto L_0x0043
            r7 = r7 ^ r8
            int[] r0 = X.C1456976x.A00
            int r1 = X.AnonymousClass6CA.A04(r6, r0)
            int r0 = r7 >> 31
            r3 = r0 | 1
            r2 = 0
            switch(r1) {
                case 1: goto L_0x001f;
                case 2: goto L_0x0043;
                case 3: goto L_0x003f;
                case 4: goto L_0x0041;
                case 5: goto L_0x003c;
                case 6: goto L_0x0027;
                case 7: goto L_0x0027;
                case 8: goto L_0x0027;
                default: goto L_0x0019;
            }
        L_0x0019:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L_0x001f:
            java.lang.String r0 = "mode was UNNECESSARY, but rounding was necessary"
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException
            r1.<init>(r0)
            throw r1
        L_0x0027:
            int r1 = java.lang.Math.abs(r4)
            int r0 = java.lang.Math.abs(r8)
            int r0 = r0 - r1
            int r1 = r1 - r0
            if (r1 != 0) goto L_0x0039
            r0 = r5 & 1
            r2 = r2 & r0
            if (r2 == 0) goto L_0x0043
            goto L_0x0041
        L_0x0039:
            if (r1 <= 0) goto L_0x0043
            goto L_0x0041
        L_0x003c:
            if (r3 <= 0) goto L_0x0043
            goto L_0x0041
        L_0x003f:
            if (r3 >= 0) goto L_0x0043
        L_0x0041:
            int r5 = r5 + r3
            return r5
        L_0x0043:
            return r5
        L_0x0044:
            java.lang.String r0 = "/ by zero"
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass72X.A00(java.math.RoundingMode, int, int):int");
    }
}
