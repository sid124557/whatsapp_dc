package X;

import android.util.Log;
import java.util.Arrays;

/* renamed from: X.7q8  reason: invalid class name and case insensitive filesystem */
public final class C161627q8 {
    public static int[] A00 = new int[10];
    public static final Object A01 = AnonymousClass002.A0D();
    public static final byte[] A02 = {0, 0, 0, 1};
    public static final float[] A03 = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    public static int A00(byte[] bArr, int i) {
        int i2;
        synchronized (A01) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 < i - 2) {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } else {
                        i3 = i;
                        break;
                    }
                }
                if (i3 < i) {
                    int[] iArr = A00;
                    int length = iArr.length;
                    if (length <= i4) {
                        iArr = Arrays.copyOf(iArr, length * 2);
                        A00 = iArr;
                    }
                    iArr[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = A00[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i10 + 1;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0072, code lost:
        if (r9[r12 - 3] == 0) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0078, code lost:
        if (r9[r12 - 2] == 0) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x007a, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x007d, code lost:
        if (r9[r2] == 1) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x008d, code lost:
        if (r9[r2] != 0) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00a3, code lost:
        if (r10[2] != false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00a8, code lost:
        if (r10[1] != false) goto L_0x007a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A01(byte[] r9, boolean[] r10, int r11, int r12) {
        /*
            int r5 = r12 - r11
            r8 = 0
            r4 = 1
            boolean r0 = X.AnonymousClass001.A1U(r5)
            X.C161487pm.A04(r0)
            if (r5 == 0) goto L_0x00ab
            boolean r0 = r10[r8]
            if (r0 == 0) goto L_0x001b
            r10[r8] = r8
            r10[r4] = r8
            r0 = 2
            r10[r0] = r8
            int r11 = r11 + -3
            return r11
        L_0x001b:
            r3 = 2
            if (r5 <= r4) goto L_0x0046
            boolean r0 = r10[r4]
            if (r0 == 0) goto L_0x002e
            byte r0 = r9[r11]
            if (r0 != r4) goto L_0x002e
            r10[r8] = r8
            r10[r4] = r8
            r10[r3] = r8
            int r11 = r11 - r3
            return r11
        L_0x002e:
            if (r5 <= r3) goto L_0x0046
            boolean r0 = r10[r3]
            if (r0 == 0) goto L_0x0046
            byte r0 = r9[r11]
            if (r0 != 0) goto L_0x0046
            int r0 = r11 + 1
            byte r0 = r9[r0]
            if (r0 != r4) goto L_0x0046
            r10[r8] = r8
            r10[r4] = r8
            r10[r3] = r8
            int r11 = r11 - r4
            return r11
        L_0x0046:
            int r2 = r12 + -1
            int r7 = r11 + 2
        L_0x004a:
            if (r7 >= r2) goto L_0x006c
            byte r6 = r9[r7]
            r0 = r6 & 254(0xfe, float:3.56E-43)
            if (r0 != 0) goto L_0x0069
            int r1 = r7 + -2
            byte r0 = r9[r1]
            if (r0 != 0) goto L_0x0067
            int r0 = r7 + -1
            byte r0 = r9[r0]
            if (r0 != 0) goto L_0x0067
            if (r6 != r4) goto L_0x0067
            r10[r8] = r8
            r10[r4] = r8
            r10[r3] = r8
            return r1
        L_0x0067:
            int r7 = r7 + -2
        L_0x0069:
            int r7 = r7 + 3
            goto L_0x004a
        L_0x006c:
            if (r5 <= r3) goto L_0x009f
            int r0 = r12 + -3
            byte r0 = r9[r0]
            if (r0 != 0) goto L_0x007f
        L_0x0074:
            int r0 = r12 + -2
            byte r0 = r9[r0]
            if (r0 != 0) goto L_0x007f
        L_0x007a:
            byte r1 = r9[r2]
            r0 = 1
            if (r1 == r4) goto L_0x0080
        L_0x007f:
            r0 = 0
        L_0x0080:
            r10[r8] = r0
            if (r5 <= r4) goto L_0x009a
            int r0 = r12 + -2
            byte r0 = r9[r0]
            if (r0 != 0) goto L_0x008f
        L_0x008a:
            byte r1 = r9[r2]
            r0 = 1
            if (r1 == 0) goto L_0x0090
        L_0x008f:
            r0 = 0
        L_0x0090:
            r10[r4] = r0
            byte r0 = r9[r2]
            if (r0 != 0) goto L_0x0097
            r8 = 1
        L_0x0097:
            r10[r3] = r8
            return r12
        L_0x009a:
            boolean r0 = r10[r3]
            if (r0 == 0) goto L_0x008f
            goto L_0x008a
        L_0x009f:
            if (r5 != r3) goto L_0x00a6
            boolean r0 = r10[r3]
            if (r0 == 0) goto L_0x007f
            goto L_0x0074
        L_0x00a6:
            boolean r0 = r10[r4]
            if (r0 == 0) goto L_0x007f
            goto L_0x007a
        L_0x00ab:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161627q8.A01(byte[], boolean[], int, int):int");
    }

    public static AnonymousClass7P3 A02(byte[] bArr, int i, int i2) {
        int A002;
        C153587bb r7 = new C153587bb(bArr, i, i2);
        r7.A04(8);
        int A012 = r7.A01(8);
        int A013 = r7.A01(8);
        int A014 = r7.A01(8);
        int A003 = r7.A00();
        int i3 = 1;
        if (A012 == 100 || A012 == 110 || A012 == 122 || A012 == 244 || A012 == 44 || A012 == 83 || A012 == 86 || A012 == 118 || A012 == 128 || A012 == 138) {
            A002 = r7.A00();
            if (A002 == 3) {
                r7.A02();
            }
            r7.A00();
            r7.A00();
            r7.A02();
            if (r7.A05()) {
                int i4 = 12;
                if (A002 != 3) {
                    i4 = 8;
                }
                int i5 = 0;
                do {
                    if (r7.A05()) {
                        int i6 = 64;
                        if (i5 < 6) {
                            i6 = 16;
                        }
                        int i7 = 8;
                        int i8 = 0;
                        while (true) {
                            int A004 = r7.A00();
                            int i9 = 1;
                            if (A004 % 2 == 0) {
                                i9 = -1;
                            }
                            int i10 = (((i9 * ((A004 + 1) / 2)) + i7) + 256) % 256;
                            if (i10 != 0) {
                                i7 = i10;
                            }
                            while (true) {
                                i8++;
                                if (i8 >= i6) {
                                    break;
                                } else if (i10 != 0) {
                                }
                            }
                        }
                    }
                    i5++;
                } while (i5 < i4);
            }
        } else {
            A002 = 1;
        }
        r7.A00();
        int A005 = r7.A00();
        if (A005 == 0) {
            r7.A00();
        } else if (A005 == 1) {
            r7.A02();
            r7.A00();
            r7.A00();
            long A006 = (long) r7.A00();
            for (int i11 = 0; ((long) i11) < A006; i11++) {
                r7.A00();
            }
        }
        r7.A00();
        r7.A02();
        int A007 = r7.A00() + 1;
        boolean A05 = r7.A05();
        int i12 = true - (A05 ? 1 : 0);
        int A008 = (r7.A00() + 1) * i12;
        if (!A05) {
            r7.A02();
        }
        r7.A02();
        int i13 = A007 * 16;
        int i14 = A008 * 16;
        if (r7.A05()) {
            int A009 = r7.A00();
            int A0010 = r7.A00();
            int A0011 = r7.A00();
            int A0012 = r7.A00();
            if (A002 != 0) {
                int i15 = 1;
                if (A002 != 3) {
                    i15 = 2;
                    if (A002 == 1) {
                        i3 = 2;
                    }
                }
                i12 *= i3;
                i3 = i15;
            }
            i13 -= (A009 + A0010) * i3;
            i14 -= (A0011 + A0012) * i12;
        }
        float f = 1.0f;
        if (r7.A05() && r7.A05()) {
            int A015 = r7.A01(8);
            if (A015 == 255) {
                int A016 = r7.A01(16);
                int A017 = r7.A01(16);
                if (!(A016 == 0 || A017 == 0)) {
                    f = ((float) A016) / ((float) A017);
                }
            } else {
                float[] fArr = A03;
                if (A015 < fArr.length) {
                    f = fArr[A015];
                } else {
                    Log.w("NalUnitUtil", AnonymousClass000.A0Y("Unexpected aspect_ratio_idc value: ", AnonymousClass001.A0o(), A015));
                }
            }
        }
        return new AnonymousClass7P3(f, A012, A013, A014, A003, i13, i14);
    }
}
