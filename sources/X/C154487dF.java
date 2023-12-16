package X;

import java.io.UnsupportedEncodingException;

/* renamed from: X.7dF  reason: invalid class name and case insensitive filesystem */
public class C154487dF {
    public static String A00(byte[] bArr, int i) {
        byte[] bArr2;
        int i2;
        int i3;
        try {
            int length = bArr.length;
            boolean z = true;
            boolean A1T = AnonymousClass000.A1T(i & 1);
            boolean A1T2 = AnonymousClass000.A1T(i & 2);
            if ((i & 4) == 0) {
                z = false;
            }
            if ((i & 8) == 0) {
                bArr2 = C140196tJ.A00;
            } else {
                bArr2 = C140196tJ.A01;
            }
            int i4 = -1;
            if (A1T2) {
                i4 = 19;
            }
            int i5 = (length / 3) * 4;
            int i6 = 2;
            int i7 = length % 3;
            if (A1T) {
                if (i7 > 0) {
                    i5 += 4;
                }
            } else if (i7 == 1) {
                i5 += 2;
            } else if (i7 == 2) {
                i5 += 3;
            }
            if (A1T2 && length > 0) {
                int i8 = ((length - 1) / 57) + 1;
                if (!z) {
                    i6 = 1;
                }
                i5 += i8 * i6;
            }
            byte[] bArr3 = new byte[i5];
            int i9 = 0;
            int i10 = 0;
            while (true) {
                int i11 = i9 + 3;
                if (i11 > length) {
                    break;
                }
                AnonymousClass6C8.A1K(bArr, bArr2, bArr3, i9, i10);
                i10 += 4;
                i2--;
                if (i2 == 0) {
                    if (z) {
                        bArr3[i10] = 13;
                        i10++;
                    }
                    bArr3[i10] = 10;
                    i10++;
                    i9 = i11;
                    i2 = 19;
                } else {
                    i9 = i11;
                }
            }
            if (i9 == length - 1) {
                i3 = AnonymousClass6C8.A0J(bArr2, bArr3, i10, (bArr[i9] & 255) << 4);
                if (A1T) {
                    int i12 = i3 + 1;
                    bArr3[i3] = 61;
                    i3 = i12 + 1;
                    bArr3[i12] = 61;
                }
            } else if (i9 == length - 2) {
                int i13 = ((bArr[i9 + 1] & 255) << 2) | ((bArr[i9] & 255) << 10);
                AnonymousClass6CA.A0g(bArr2, bArr3, (i13 >> 12) & 63, i10);
                i3 = AnonymousClass6C8.A0J(bArr2, bArr3, i10 + 1, i13);
                if (A1T) {
                    bArr3[i3] = 61;
                    i3++;
                }
            } else {
                if (A1T2 && i10 > 0 && i2 != 19) {
                    if (z) {
                        bArr3[i10] = 13;
                        i10++;
                    }
                    bArr3[i10] = 10;
                }
                return new String(bArr3, "US-ASCII");
            }
            if (A1T2) {
                if (z) {
                    bArr3[i3] = 13;
                    i3++;
                }
                bArr3[i3] = 10;
            }
            return new String(bArr3, "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw AnonymousClass0x9.A0i(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005e, code lost:
        if (r12 != 4) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007a, code lost:
        if (r2 == r4) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007c, code lost:
        r1 = new byte[r2];
        java.lang.System.arraycopy(r3, 0, r1, 0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0082, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00fb, code lost:
        return r3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x007a A[EDGE_INSN: B:56:0x007a->B:16:0x007a ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A01(byte[] r16) {
        /*
            r6 = r16
            int r5 = r6.length
            int r0 = r5 * 3
            int r4 = r0 / 4
            byte[] r3 = new byte[r4]
            int[] r16 = X.C140186tI.A00
            r15 = 6
            r8 = 0
            r2 = 0
            r12 = 0
            r9 = 0
        L_0x0010:
            r13 = 3
            r11 = 4
            r14 = 2
            r1 = 1
            if (r9 >= r5) goto L_0x0058
            if (r12 != 0) goto L_0x0083
        L_0x0018:
            int r7 = r9 + 4
            if (r7 > r5) goto L_0x0078
            byte r0 = r6[r9]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r16[r0]
            int r8 = r0 << 18
            int r0 = r9 + 1
            byte r0 = r6[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r16[r0]
            int r0 = r0 << 12
            r8 = r8 | r0
            int r0 = r9 + 2
            byte r0 = r6[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r16[r0]
            int r0 = r0 << r15
            r8 = r8 | r0
            int r0 = r9 + 3
            byte r0 = r6[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r16[r0]
            r8 = r8 | r0
            if (r8 < 0) goto L_0x0078
            int r0 = r2 + 2
            int r9 = X.AnonymousClass6CA.A0D(r3, r8, r0, r2)
            int r0 = r8 >> 8
            byte r0 = (byte) r0
            r3[r9] = r0
            int r0 = r8 >> 16
            byte r0 = (byte) r0
            r3[r2] = r0
            int r2 = r2 + 3
            r9 = r7
            goto L_0x0018
        L_0x0058:
            if (r12 == r1) goto L_0x009c
            if (r12 == r14) goto L_0x006f
            if (r12 == r13) goto L_0x0061
            if (r12 == r11) goto L_0x009c
            goto L_0x007a
        L_0x0061:
            int r1 = r2 + 1
            int r0 = r8 >> 10
            int r2 = X.AnonymousClass6CA.A0D(r3, r0, r2, r1)
            int r0 = r8 >> 2
            byte r0 = (byte) r0
            r3[r1] = r0
            goto L_0x007a
        L_0x006f:
            int r1 = r2 + 1
            int r0 = r8 >> 4
            byte r0 = (byte) r0
            r3[r2] = r0
            r2 = r1
            goto L_0x007a
        L_0x0078:
            if (r9 < r5) goto L_0x0083
        L_0x007a:
            if (r2 == r4) goto L_0x00fb
            byte[] r1 = new byte[r2]
            r0 = 0
            java.lang.System.arraycopy(r3, r0, r1, r0, r2)
            return r1
        L_0x0083:
            int r10 = r9 + 1
            byte r0 = r6[r9]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r7 = r16[r0]
            r9 = -1
            if (r12 == 0) goto L_0x00be
            if (r12 == r1) goto L_0x00b9
            r1 = -2
            if (r12 == r14) goto L_0x00a8
            r0 = 5
            if (r12 == r13) goto L_0x00ca
            if (r12 == r11) goto L_0x00a3
            if (r12 != r0) goto L_0x00e3
            if (r7 == r9) goto L_0x00e3
        L_0x009c:
            java.lang.String r0 = "bad base-64"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x00a3:
            if (r7 == r1) goto L_0x00f6
            if (r7 == r9) goto L_0x00e3
            goto L_0x009c
        L_0x00a8:
            if (r7 >= 0) goto L_0x00c3
            if (r7 != r1) goto L_0x00b6
            int r1 = r2 + 1
            int r0 = r8 >> 4
            byte r0 = (byte) r0
            r3[r2] = r0
            r2 = r1
            r12 = 4
            goto L_0x00e3
        L_0x00b6:
            if (r7 == r9) goto L_0x00e3
            goto L_0x009c
        L_0x00b9:
            if (r7 >= 0) goto L_0x00c3
            if (r7 == r9) goto L_0x00e3
            goto L_0x009c
        L_0x00be:
            if (r7 >= 0) goto L_0x00c6
            if (r7 == r9) goto L_0x00e3
            goto L_0x009c
        L_0x00c3:
            int r0 = r8 << 6
            r7 = r7 | r0
        L_0x00c6:
            int r12 = r12 + 1
            r8 = r7
            goto L_0x00e3
        L_0x00ca:
            if (r7 < 0) goto L_0x00e6
            int r0 = r8 << 6
            r7 = r7 | r0
            int r0 = r2 + 2
            int r1 = X.AnonymousClass6CA.A0D(r3, r7, r0, r2)
            int r0 = r7 >> 8
            byte r0 = (byte) r0
            r3[r1] = r0
            int r0 = r7 >> 16
            byte r0 = (byte) r0
            r3[r2] = r0
            int r2 = r2 + 3
            r8 = r7
            r12 = 0
        L_0x00e3:
            r9 = r10
            goto L_0x0010
        L_0x00e6:
            if (r7 != r1) goto L_0x00f8
            int r1 = r2 + 1
            int r0 = r8 >> 2
            byte r0 = (byte) r0
            r3[r1] = r0
            int r0 = r8 >> 10
            byte r0 = (byte) r0
            r3[r2] = r0
            int r2 = r2 + 2
        L_0x00f6:
            r12 = 5
            goto L_0x00e3
        L_0x00f8:
            if (r7 == r9) goto L_0x00e3
            goto L_0x009c
        L_0x00fb:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C154487dF.A01(byte[]):byte[]");
    }
}
