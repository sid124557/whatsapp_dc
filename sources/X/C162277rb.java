package X;

/* renamed from: X.7rb  reason: invalid class name and case insensitive filesystem */
public abstract class C162277rb {
    public static int[] A00;
    public static AnonymousClass7NI[] A01;
    public static final Object A02 = AnonymousClass002.A0D();
    public static final int[] A03 = {52811034, 25909283, 8072341, 50637101, 13785486, 30858332, 20483199, 20966410, 43936626, 4379245};
    public static final int[] A04 = {40265304, 26843545, 6710886, 53687091, 13421772, 40265318, 26843545, 6710886, 53687091, 13421772};
    public static final int[] A05 = {56195235, 47411844, 25868126, 40503822, 57364, 58321048, 30416477, 31930572, 57760639, 10749657};
    public static final int[] A06 = {45281625, 27714825, 18181821, 13898781, 114729, 49533232, 60832955, 30306712, 48412415, 4722099};
    public static final int[] A07 = {23454386, 55429651, 2809210, 27797563, 229458, 31957600, 54557047, 27058993, 29715967, 9444199};
    public static final int[] A08 = {1559614445, 1477600026, -1560830762, 350157278, 0, 0, 0, 268435456};
    public static final int[] A09 = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};

    public static void A03(byte[] bArr, int i, long j) {
        AnonymousClass6C8.A1H(bArr, (int) j, i);
        int A062 = C86664Kz.A06(j);
        int A0A = AnonymousClass6CA.A0A(bArr, A062, i + 4);
        AnonymousClass6CA.A0f(bArr, A062, A0A);
        bArr[A0A + 1] = (byte) (A062 >>> 16);
    }

    public static int A00(byte[] bArr, int i) {
        int i2 = i + 1;
        return ((bArr[i2 + 1] & 255) << 16) | AnonymousClass6C8.A0G(bArr, i2, bArr[i] & 255);
    }

    public static void A01(AnonymousClass7NI r14, AnonymousClass7NI r15, AnonymousClass7NI r16, boolean z) {
        int[] iArr = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3 = new int[10];
        int[] iArr4 = new int[10];
        int[] iArr5 = new int[10];
        int[] iArr6 = new int[10];
        int[] iArr7 = new int[10];
        int[] iArr8 = new int[10];
        int[] iArr9 = iArr3;
        int[] iArr10 = iArr4;
        int[] iArr11 = iArr6;
        int[] iArr12 = iArr7;
        if (z) {
            iArr10 = iArr3;
            iArr9 = iArr4;
            iArr12 = iArr6;
            iArr11 = iArr7;
        }
        C162437s5.A0F(r14.A02, r14.A01, iArr2, iArr);
        C162437s5.A0F(r15.A02, r15.A01, iArr10, iArr9);
        C162437s5.A0D(iArr, iArr3, iArr);
        C162437s5.A0D(iArr2, iArr4, iArr2);
        C162437s5.A0D(r14.A00, r15.A00, iArr3);
        C162437s5.A0D(iArr3, A06, iArr3);
        C162437s5.A0D(r14.A03, r15.A03, iArr4);
        C162437s5.A0C(iArr4, iArr4, iArr4);
        C162437s5.A0F(iArr2, iArr, iArr8, iArr5);
        C162437s5.A0F(iArr4, iArr3, iArr12, iArr11);
        C162437s5.A04(iArr12);
        AnonymousClass7NI r1 = r16;
        C162437s5.A0D(iArr5, iArr6, r1.A01);
        C162437s5.A0D(iArr7, iArr8, r1.A02);
        C162437s5.A0D(iArr6, iArr7, r1.A03);
        C162437s5.A0D(iArr5, iArr8, r1.A00);
    }

    public static void A02(AnonymousClass7NI r14, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, boolean z) {
        int[] iArr6 = new int[10];
        int[] iArr7 = new int[10];
        int[] iArr8 = new int[10];
        int[] iArr9 = new int[10];
        int[] iArr10 = new int[10];
        int[] iArr11 = new int[10];
        int[] iArr12 = iArr8;
        int[] iArr13 = iArr9;
        int[] iArr14 = iArr10;
        int[] iArr15 = iArr11;
        if (z) {
            iArr13 = iArr8;
            iArr12 = iArr9;
            iArr15 = iArr10;
            iArr14 = iArr11;
        }
        int[] iArr16 = iArr4;
        int[] iArr17 = iArr3;
        C162437s5.A0F(iArr16, iArr17, iArr7, iArr6);
        C162437s5.A0F(r14.A02, r14.A01, iArr13, iArr12);
        C162437s5.A0D(iArr6, iArr8, iArr6);
        C162437s5.A0D(iArr7, iArr9, iArr7);
        int[] iArr18 = iArr2;
        C162437s5.A0D(iArr, iArr18, iArr8);
        C162437s5.A0D(iArr8, r14.A00, iArr8);
        C162437s5.A0D(iArr8, A06, iArr8);
        int[] iArr19 = iArr5;
        C162437s5.A0D(iArr19, r14.A03, iArr9);
        C162437s5.A0C(iArr9, iArr9, iArr9);
        C162437s5.A0F(iArr7, iArr6, iArr18, iArr);
        C162437s5.A0F(iArr9, iArr8, iArr15, iArr14);
        C162437s5.A04(iArr15);
        C162437s5.A0D(iArr, iArr10, iArr17);
        C162437s5.A0D(iArr11, iArr18, iArr16);
        C162437s5.A0D(iArr10, iArr11, iArr19);
    }

    public static void A04(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5) {
        int[] iArr6 = new int[10];
        int[] iArr7 = new int[10];
        int[] iArr8 = new int[10];
        int[] iArr9 = new int[10];
        int[] iArr10 = new int[10];
        C162437s5.A0A(iArr3, iArr6);
        C162437s5.A0A(iArr4, iArr7);
        C162437s5.A0A(iArr5, iArr8);
        C162437s5.A0C(iArr8, iArr8, iArr8);
        C162437s5.A0F(iArr6, iArr7, iArr2, iArr10);
        C162437s5.A0C(iArr3, iArr4, iArr);
        C162437s5.A0A(iArr, iArr);
        C162437s5.A0E(iArr2, iArr, iArr);
        C162437s5.A0C(iArr8, iArr10, iArr9);
        C162437s5.A04(iArr9);
        C162437s5.A0D(iArr, iArr9, iArr3);
        C162437s5.A0D(iArr10, iArr2, iArr4);
        C162437s5.A0D(iArr9, iArr10, iArr5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0027 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A05(byte[] r6) {
        /*
            r2 = 8
            int[] r5 = new int[r2]
            r1 = 0
        L_0x0005:
            int r0 = r1 * 4
            int r0 = X.AnonymousClass6C7.A0C(r6, r0)
            r5[r1] = r0
            int r1 = r1 + 1
            if (r1 < r2) goto L_0x0005
            r2 = 7
            r1 = r5[r2]
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1 = r1 & r0
            r5[r2] = r1
            int[] r4 = A09
            r3 = 7
        L_0x001d:
            r2 = r5[r3]
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 ^ r1
            r0 = r4[r3]
            r1 = r1 ^ r0
            if (r2 >= r1) goto L_0x002b
            r0 = 0
        L_0x0028:
            r0 = r0 ^ 1
            return r0
        L_0x002b:
            if (r2 > r1) goto L_0x0032
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x0032
            goto L_0x001d
        L_0x0032:
            r0 = 1
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162277rb.A05(byte[]):boolean");
    }

    public static byte[] A06(int[] iArr, int i) {
        int i2;
        int[] iArr2 = new int[16];
        int i3 = 0;
        int i4 = 8;
        int i5 = 16;
        int i6 = 0;
        while (true) {
            i4--;
            if (i4 < 0) {
                break;
            }
            int i7 = iArr[i4];
            int i8 = i5 - 1;
            iArr2[i8] = (i6 << 16) | (i7 >>> 16);
            i5 = i8 - 1;
            iArr2[i5] = i7;
            i6 = i7;
        }
        byte[] bArr = new byte[253];
        int i9 = 1 << i;
        int i10 = i9 - 1;
        int i11 = i9 >>> 1;
        int i12 = 0;
        int i13 = 0;
        do {
            int i14 = iArr2[i3];
            while (i2 < 16) {
                int i15 = i14 >>> i2;
                if ((i15 & 1) == i13) {
                    i2++;
                } else {
                    int i16 = (i15 & i10) + i13;
                    int i17 = i16 & i11;
                    int i18 = i16 - (i17 << 1);
                    i13 = i17 >>> (i - 1);
                    bArr[(i3 << 4) + i2] = (byte) i18;
                    i2 += i;
                }
            }
            i3++;
            i12 = i2 - 16;
        } while (i3 < 16);
        return bArr;
    }

    public static AnonymousClass7NI[] A07(AnonymousClass7NI r8, int i) {
        AnonymousClass7NI r5 = new AnonymousClass7NI();
        A01(r8, r8, r5, false);
        AnonymousClass7NI[] r3 = new AnonymousClass7NI[i];
        AnonymousClass7NI r7 = new AnonymousClass7NI();
        int[] iArr = r8.A01;
        int[] iArr2 = r7.A01;
        int i2 = 0;
        do {
            i2 = AnonymousClass6C9.A0J(iArr, iArr2, i2);
        } while (i2 < 10);
        int[] iArr3 = r8.A02;
        int[] iArr4 = r7.A02;
        int i3 = 0;
        do {
            i3 = AnonymousClass6C9.A0J(iArr3, iArr4, i3);
        } while (i3 < 10);
        int[] iArr5 = r8.A03;
        int[] iArr6 = r7.A03;
        int i4 = 0;
        do {
            i4 = AnonymousClass6C9.A0J(iArr5, iArr6, i4);
        } while (i4 < 10);
        int[] iArr7 = r8.A00;
        int[] iArr8 = r7.A00;
        int i5 = 0;
        do {
            i5 = AnonymousClass6C9.A0J(iArr7, iArr8, i5);
        } while (i5 < 10);
        r3[0] = r7;
        for (int i6 = 1; i6 < i; i6++) {
            AnonymousClass7NI r1 = r3[i6 - 1];
            AnonymousClass7NI r0 = new AnonymousClass7NI();
            r3[i6] = r0;
            A01(r1, r5, r0, false);
        }
        return r3;
    }
}
