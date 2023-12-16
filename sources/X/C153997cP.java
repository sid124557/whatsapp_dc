package X;

/* renamed from: X.7cP  reason: invalid class name and case insensitive filesystem */
public final class C153997cP {
    public static boolean A01(AnonymousClass7BF r18, C161727qK r19, C161467pi r20, int i) {
        int i2;
        int A0F;
        C161467pi r3 = r20;
        long A0I = r3.A0I();
        long j = A0I >>> 16;
        if (j != ((long) i)) {
            return false;
        }
        boolean A1T = AnonymousClass000.A1T(((j & 1) > 1 ? 1 : ((j & 1) == 1 ? 0 : -1)));
        int i3 = (int) ((A0I >> 12) & 15);
        int i4 = (int) ((A0I >> 8) & 15);
        int i5 = (int) (15 & (A0I >> 4));
        int i6 = (int) ((A0I >> 1) & 7);
        boolean A1T2 = AnonymousClass000.A1T(((A0I & 1) > 1 ? 1 : ((A0I & 1) == 1 ? 0 : -1)));
        C161727qK r5 = r19;
        if (i5 <= 7) {
            i2 = r5.A02 - 1;
        } else if (i5 > 10) {
            return false;
        } else {
            i5 = r5.A02;
            i2 = 2;
        }
        if (i5 != i2) {
            return false;
        }
        if ((i6 != 0 && i6 != r5.A01) || A1T2) {
            return false;
        }
        try {
            long A0K = r3.A0K();
            if (!A1T) {
                A0K *= (long) r5.A03;
            }
            r18.A00 = A0K;
            int A00 = A00(r3, i3);
            if (A00 == -1 || A00 > r5.A03) {
                return false;
            }
            int i7 = r5.A07;
            if (i4 != 0) {
                if (i4 > 11) {
                    if (i4 == 12) {
                        A0F = r3.A0C() * 1000;
                    } else if (i4 > 14) {
                        return false;
                    } else {
                        A0F = r3.A0F();
                        if (i4 == 14) {
                            A0F *= 10;
                        }
                    }
                    if (A0F != i7) {
                        return false;
                    }
                } else if (i4 != r5.A08) {
                    return false;
                }
            }
            int A0C = r3.A0C();
            int i8 = r3.A01;
            byte[] bArr = r3.A02;
            int i9 = i8 - 1;
            int i10 = 0;
            for (int i11 = r3.A01; i11 < i9; i11++) {
                i10 = C162387ry.A0C[i10 ^ (bArr[i11] & 255)];
            }
            if (A0C == i10) {
                return true;
            }
            return false;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        return r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        return r0 << r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(X.C161467pi r0, int r1) {
        /*
            switch(r1) {
                case 1: goto L_0x001c;
                case 2: goto L_0x0016;
                case 3: goto L_0x0016;
                case 4: goto L_0x0016;
                case 5: goto L_0x0016;
                case 6: goto L_0x000f;
                case 7: goto L_0x000a;
                case 8: goto L_0x0005;
                case 9: goto L_0x0005;
                case 10: goto L_0x0005;
                case 11: goto L_0x0005;
                case 12: goto L_0x0005;
                case 13: goto L_0x0005;
                case 14: goto L_0x0005;
                case 15: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r0 = -1
            return r0
        L_0x0005:
            int r1 = r1 + -8
            r0 = 256(0x100, float:3.59E-43)
            goto L_0x001a
        L_0x000a:
            int r0 = r0.A0F()
            goto L_0x0013
        L_0x000f:
            int r0 = r0.A0C()
        L_0x0013:
            int r0 = r0 + 1
            return r0
        L_0x0016:
            int r1 = r1 + -2
            r0 = 576(0x240, float:8.07E-43)
        L_0x001a:
            int r0 = r0 << r1
            return r0
        L_0x001c:
            r0 = 192(0xc0, float:2.69E-43)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153997cP.A00(X.7pi, int):int");
    }
}
