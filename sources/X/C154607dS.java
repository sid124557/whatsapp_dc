package X;

/* renamed from: X.7dS  reason: invalid class name and case insensitive filesystem */
public final class C154607dS {
    public static final int[] A00 = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b8, code lost:
        r17 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(X.C153437bJ r20, boolean r21) {
        /*
            r13 = 0
            r11 = r20
            long r6 = r11.A04
            r1 = 4096(0x1000, double:2.0237E-320)
            r19 = -1
            int r18 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
            if (r18 == 0) goto L_0x0012
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0012
            r1 = r6
        L_0x0012:
            int r10 = (int) r1
            r0 = 64
            X.7ph r9 = new X.7ph
            r9.<init>((int) r0)
            r16 = 0
            r8 = 0
            r17 = 0
        L_0x001f:
            if (r8 >= r10) goto L_0x00e0
            r4 = 8
            r9.A0F(r4)
            byte[] r2 = r9.A02
            r0 = 1
            boolean r0 = r11.A04(r4, r0)
            if (r0 == 0) goto L_0x00e0
            byte[] r1 = r11.A03
            int r0 = r11.A01
            int r0 = r0 - r4
            java.lang.System.arraycopy(r1, r0, r2, r13, r4)
            long r2 = r9.A09()
            int r12 = r9.A03()
            r14 = 1
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x00c7
            byte[] r0 = r9.A02
            r11.A03(r0, r4, r4)
            r0 = 16
            r9.A0G(r0)
            long r2 = r9.A08()
            r1 = 16
        L_0x0055:
            long r4 = (long) r1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x00ed
            int r8 = r8 + r1
            r0 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r12 != r0) goto L_0x006b
            int r0 = (int) r2
            int r10 = r10 + r0
            if (r18 == 0) goto L_0x001f
            long r0 = (long) r10
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x001f
            int r10 = (int) r6
            goto L_0x001f
        L_0x006b:
            r0 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r12 == r0) goto L_0x00e4
            r0 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r12 == r0) goto L_0x00e4
            long r0 = (long) r8
            long r0 = r0 + r2
            long r0 = r0 - r4
            long r14 = (long) r10
            int r16 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r16 >= 0) goto L_0x00e0
            long r2 = r2 - r4
            int r1 = (int) r2
            int r8 = r8 + r1
            r0 = 1718909296(0x66747970, float:2.8862439E23)
            if (r12 != r0) goto L_0x00be
            r0 = 8
            if (r1 < r0) goto L_0x00df
            r2 = 0
            r9.A0F(r1)
            byte[] r0 = r9.A02
            r11.A03(r0, r13, r1)
            int r1 = r1 / 4
        L_0x0094:
            if (r2 >= r1) goto L_0x00bb
            r0 = 1
            if (r2 != r0) goto L_0x00a0
            r0 = 4
            r9.A0I(r0)
        L_0x009d:
            int r2 = r2 + 1
            goto L_0x0094
        L_0x00a0:
            int r12 = r9.A03()
            int r3 = r12 >>> 8
            r0 = 3368816(0x336770, float:4.720717E-39)
            if (r3 == r0) goto L_0x00b8
            int[] r5 = A00
            int r4 = r5.length
            r3 = 0
        L_0x00af:
            if (r3 >= r4) goto L_0x009d
            r0 = r5[r3]
            if (r0 == r12) goto L_0x00b8
            int r3 = r3 + 1
            goto L_0x00af
        L_0x00b8:
            r17 = 1
            goto L_0x00c3
        L_0x00bb:
            if (r17 != 0) goto L_0x00c3
            return r13
        L_0x00be:
            if (r1 == 0) goto L_0x00c3
            r11.A04(r1, r13)
        L_0x00c3:
            r16 = 0
            goto L_0x001f
        L_0x00c7:
            r14 = 0
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x00db
            int r0 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x00db
            long r0 = r11.A02
            int r2 = r11.A01
            long r2 = (long) r2
            long r0 = r0 + r2
            long r2 = r6 - r0
            long r0 = (long) r4
            long r2 = r2 + r0
        L_0x00db:
            r1 = 8
            goto L_0x0055
        L_0x00df:
            return r13
        L_0x00e0:
            r16 = 1
            r0 = 0
            goto L_0x00e7
        L_0x00e4:
            r16 = 1
            r0 = 1
        L_0x00e7:
            if (r17 == 0) goto L_0x00ee
            r1 = r21
            if (r1 != r0) goto L_0x00ee
        L_0x00ed:
            return r16
        L_0x00ee:
            r16 = 0
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C154607dS.A00(X.7bJ, boolean):boolean");
    }
}
