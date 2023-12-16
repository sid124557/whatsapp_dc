package X;

/* renamed from: X.7dn  reason: invalid class name and case insensitive filesystem */
public final class C154817dn {
    public static final int[] A00 = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b8, code lost:
        r17 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(X.C187648xa r20, boolean r21) {
        /*
            r15 = 0
            r12 = r20
            long r7 = r12.getLength()
            r1 = 4096(0x1000, double:2.0237E-320)
            r19 = -1
            int r18 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            if (r18 == 0) goto L_0x0014
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0014
            r1 = r7
        L_0x0014:
            int r11 = (int) r1
            r0 = 64
            X.7pi r10 = X.C161467pi.A05(r0)
            r16 = 0
            r9 = 0
            r17 = 0
        L_0x0020:
            r1 = 1
            if (r9 >= r11) goto L_0x00d5
            r4 = 8
            r10.A0Q(r4)
            byte[] r0 = r10.A02
            boolean r0 = r12.Bge(r0, r15, r4, r1)
            if (r0 == 0) goto L_0x00d5
            long r2 = r10.A0I()
            int r6 = r10.A07()
            r13 = 1
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x00be
            byte[] r0 = r10.A02
            r12.Bgd(r0, r4, r4)
            r0 = 16
            r10.A0R(r0)
            long r2 = r10.A0H()
            r1 = 16
        L_0x004e:
            long r4 = (long) r1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x00e2
            int r9 = r9 + r1
            r0 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r6 != r0) goto L_0x0064
            int r0 = (int) r2
            int r11 = r11 + r0
            if (r18 == 0) goto L_0x0020
            long r0 = (long) r11
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x0020
            int r11 = (int) r7
            goto L_0x0020
        L_0x0064:
            r0 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r6 == r0) goto L_0x00d9
            r0 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r6 == r0) goto L_0x00d9
            long r0 = (long) r9
            long r0 = r0 + r2
            long r0 = r0 - r4
            long r13 = (long) r11
            int r16 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r16 >= 0) goto L_0x00d5
            long r2 = r2 - r4
            int r1 = (int) r2
            int r9 = r9 + r1
            r0 = 1718909296(0x66747970, float:2.8862439E23)
            if (r6 != r0) goto L_0x00b2
            r0 = 8
            if (r1 < r0) goto L_0x00d4
            r6 = 0
            r10.A0Q(r1)
            X.C161467pi.A06(r12, r10, r1)
            int r5 = r1 / 4
        L_0x008b:
            if (r6 >= r5) goto L_0x00af
            r0 = 1
            if (r6 != r0) goto L_0x0097
            r0 = 4
            r10.A0T(r0)
        L_0x0094:
            int r6 = r6 + 1
            goto L_0x008b
        L_0x0097:
            int r4 = r10.A07()
            int r1 = r4 >>> 8
            r0 = 3368816(0x336770, float:4.720717E-39)
            if (r1 == r0) goto L_0x00b8
            int[] r3 = A00
            int r2 = r3.length
            r1 = 0
        L_0x00a6:
            if (r1 >= r2) goto L_0x0094
            r0 = r3[r1]
            if (r0 == r4) goto L_0x00b8
            int r1 = r1 + 1
            goto L_0x00a6
        L_0x00af:
            if (r17 != 0) goto L_0x00ba
            return r15
        L_0x00b2:
            if (r1 == 0) goto L_0x00ba
            r12.Awu(r1)
            goto L_0x00ba
        L_0x00b8:
            r17 = 1
        L_0x00ba:
            r16 = 0
            goto L_0x0020
        L_0x00be:
            r13 = 0
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x00d0
            int r0 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x00d0
            long r0 = r12.BBF()
            long r2 = r7 - r0
            long r0 = (long) r4
            long r2 = r2 + r0
        L_0x00d0:
            r1 = 8
            goto L_0x004e
        L_0x00d4:
            return r15
        L_0x00d5:
            r16 = 1
            r0 = 0
            goto L_0x00dc
        L_0x00d9:
            r16 = 1
            r0 = 1
        L_0x00dc:
            if (r17 == 0) goto L_0x00e3
            r1 = r21
            if (r1 != r0) goto L_0x00e3
        L_0x00e2:
            return r16
        L_0x00e3:
            r16 = 0
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C154817dn.A00(X.8xa, boolean):boolean");
    }
}
