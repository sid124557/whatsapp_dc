package org.whispersystems.curve25519;

import X.AnonymousClass000;
import X.AnonymousClass6C7;
import X.AnonymousClass6C8;
import X.AnonymousClass6C9;
import X.AnonymousClass6CA;
import X.AnonymousClass762;
import X.AnonymousClass763;
import X.AnonymousClass764;
import X.AnonymousClass765;
import X.AnonymousClass766;
import X.AnonymousClass767;
import X.AnonymousClass768;
import X.AnonymousClass769;
import X.AnonymousClass76B;
import X.AnonymousClass76C;
import X.AnonymousClass76D;
import X.AnonymousClass76E;
import X.AnonymousClass76F;
import X.AnonymousClass76G;
import X.AnonymousClass78D;
import X.AnonymousClass78E;
import X.AnonymousClass78F;
import X.AnonymousClass78G;
import X.AnonymousClass7LZ;
import X.AnonymousClass7NM;
import X.AnonymousClass7NN;
import X.AnonymousClass7R4;
import X.C156477gh;
import X.C159537m0;
import X.C159547m1;
import X.C185988uZ;
import X.C44022Uj;

public class JavaCurve25519Provider implements C185988uZ {
    public C44022Uj A00;
    public final AnonymousClass7R4 A01;

    public static void A04(C156477gh r11, byte b, int i) {
        C156477gh[][] r8;
        if (i <= 7) {
            r8 = AnonymousClass78D.A00;
        } else if (i <= 15) {
            r8 = AnonymousClass78G.A00;
        } else if (i <= 23) {
            r8 = AnonymousClass78E.A00;
        } else {
            r8 = AnonymousClass78F.A00;
        }
        C156477gh r4 = new C156477gh();
        int i2 = (int) (((long) b) >>> 63);
        int[] iArr = r11.A02;
        iArr[0] = 1;
        AnonymousClass6C9.A1K(iArr);
        int[] iArr2 = r11.A01;
        iArr2[0] = 1;
        AnonymousClass6C9.A1K(iArr2);
        int[] iArr3 = r11.A00;
        iArr3[0] = 0;
        AnonymousClass6C9.A1K(iArr3);
        C156477gh[] r10 = r8[i];
        byte b2 = (byte) (b - (((-i2) & b) << 1));
        A05(r11, r10[0], ((b2 ^ 1) - 1) >>> 31);
        A05(r11, r10[1], ((b2 ^ 2) - 1) >>> 31);
        A05(r11, r10[2], ((b2 ^ 3) - 1) >>> 31);
        A05(r11, r10[3], ((b2 ^ 4) - 1) >>> 31);
        A05(r11, r10[4], ((b2 ^ 5) - 1) >>> 31);
        A05(r11, r10[5], ((b2 ^ 6) - 1) >>> 31);
        A05(r11, r10[6], ((b2 ^ 7) - 1) >>> 31);
        A05(r11, r10[7], ((b2 ^ 8) - 1) >>> 31);
        AnonymousClass763.A00(r4.A02, iArr2);
        AnonymousClass763.A00(r4.A01, iArr);
        AnonymousClass766.A00(r4.A00, iArr3);
        A05(r11, r4, i2);
    }

    public JavaCurve25519Provider() {
        AnonymousClass7R4 r1 = new AnonymousClass7R4();
        C44022Uj r0 = new C44022Uj();
        this.A01 = r1;
        this.A00 = r0;
    }

    public static void A02(AnonymousClass7NN r5, byte[] bArr) {
        int[] iArr = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3 = new int[10];
        AnonymousClass764.A00(iArr, r5.A03);
        AnonymousClass765.A00(iArr2, r5.A01, iArr);
        AnonymousClass765.A00(iArr3, r5.A02, iArr);
        AnonymousClass769.A00(bArr, iArr3);
        byte b = bArr[31];
        byte[] bArr2 = new byte[32];
        AnonymousClass769.A00(bArr2, iArr2);
        AnonymousClass6CA.A0e(b, bArr, (bArr2[0] & 1) << 7, 31);
    }

    public static void A03(AnonymousClass7NN r11, byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[64];
        AnonymousClass7NM r4 = new AnonymousClass7NM();
        AnonymousClass7LZ r8 = new AnonymousClass7LZ();
        C156477gh r3 = new C156477gh();
        int i2 = 0;
        int i3 = 0;
        do {
            i3 = AnonymousClass6CA.A0D(bArr2, (bArr[i3] >>> 4) & 15, AnonymousClass6CA.A0A(bArr2, (bArr[i3] >>> 0) & 15, i3 * 2), i3);
            i = 1;
        } while (i3 < 32);
        int i4 = 0;
        byte b = 0;
        do {
            byte b2 = (byte) (bArr2[i4] + b);
            bArr2[i4] = b2;
            b = (byte) (((byte) (b2 + 8)) >> 4);
            i4 = AnonymousClass6CA.A0A(bArr2, b2 - (b << 4), i4);
        } while (i4 < 63);
        bArr2[63] = (byte) (bArr2[63] + b);
        int[] iArr = r11.A01;
        iArr[0] = 0;
        AnonymousClass6C9.A1K(iArr);
        int[] iArr2 = r11.A02;
        iArr2[0] = 1;
        AnonymousClass6C9.A1K(iArr2);
        int[] iArr3 = r11.A03;
        iArr3[0] = 1;
        AnonymousClass6C9.A1K(iArr3);
        int[] iArr4 = r11.A00;
        iArr4[0] = 0;
        AnonymousClass6C9.A1K(iArr4);
        do {
            A04(r3, bArr2[i], i / 2);
            AnonymousClass76B.A00(r4, r11, r3);
            AnonymousClass76D.A00(r4, r11);
            i += 2;
        } while (i < 64);
        AnonymousClass76F.A00(r4, r11);
        AnonymousClass76C.A00(r4, r8);
        AnonymousClass76E.A00(r4, r8);
        AnonymousClass76C.A00(r4, r8);
        AnonymousClass76E.A00(r4, r8);
        AnonymousClass76C.A00(r4, r8);
        AnonymousClass76E.A00(r4, r8);
        AnonymousClass76D.A00(r4, r11);
        do {
            A04(r3, bArr2[i2], i2 / 2);
            AnonymousClass76B.A00(r4, r11, r3);
            AnonymousClass76D.A00(r4, r11);
            i2 += 2;
        } while (i2 < 64);
    }

    public static void A05(C156477gh r2, C156477gh r3, int i) {
        A06(r2.A02, r3.A02, i);
        A06(r2.A01, r3.A01, i);
        A06(r2.A00, r3.A00, i);
    }

    public static void A06(int[] iArr, int[] iArr2, int i) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int i10 = iArr[8];
        int i11 = iArr[9];
        int i12 = iArr2[0];
        int i13 = iArr2[1];
        int i14 = iArr2[2];
        int i15 = iArr2[3];
        int i16 = iArr2[4];
        int i17 = iArr2[5];
        int i18 = iArr2[6];
        int i19 = iArr2[7];
        int i20 = i2 ^ i12;
        int i21 = i3 ^ i13;
        int i22 = i4 ^ i14;
        int i23 = i5 ^ i15;
        int i24 = i6 ^ i16;
        int i25 = i7 ^ i17;
        int i26 = i8 ^ i18;
        int i27 = i9 ^ i19;
        int i28 = i10 ^ iArr2[8];
        int i29 = i11 ^ iArr2[9];
        int i30 = -i;
        iArr[0] = i2 ^ (i20 & i30);
        iArr[1] = i3 ^ (i21 & i30);
        iArr[2] = i4 ^ (i22 & i30);
        iArr[3] = i5 ^ (i23 & i30);
        iArr[4] = i6 ^ (i24 & i30);
        iArr[5] = i7 ^ (i25 & i30);
        iArr[6] = i8 ^ (i26 & i30);
        iArr[7] = i9 ^ (i27 & i30);
        iArr[8] = i10 ^ (i28 & i30);
        iArr[9] = i11 ^ (i29 & i30);
    }

    public static void A07(int[] iArr, int[] iArr2, int i) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int i10 = iArr[8];
        int i11 = iArr[9];
        int i12 = iArr2[0];
        int i13 = iArr2[1];
        int i14 = iArr2[2];
        int i15 = iArr2[3];
        int i16 = iArr2[4];
        int i17 = iArr2[5];
        int i18 = iArr2[6];
        int i19 = iArr2[7];
        int i20 = iArr2[8];
        int i21 = iArr2[9];
        int i22 = -i;
        int i23 = (i2 ^ i12) & i22;
        int i24 = (i3 ^ i13) & i22;
        int i25 = (i4 ^ i14) & i22;
        int i26 = (i5 ^ i15) & i22;
        int i27 = (i6 ^ i16) & i22;
        int i28 = (i7 ^ i17) & i22;
        int i29 = (i8 ^ i18) & i22;
        int i30 = (i9 ^ i19) & i22;
        int i31 = (i10 ^ i20) & i22;
        int i32 = (i11 ^ i21) & i22;
        iArr[0] = i2 ^ i23;
        iArr[1] = i3 ^ i24;
        iArr[2] = i4 ^ i25;
        iArr[3] = i5 ^ i26;
        iArr[4] = i6 ^ i27;
        iArr[5] = i7 ^ i28;
        iArr[6] = i8 ^ i29;
        iArr[7] = i9 ^ i30;
        iArr[8] = i10 ^ i31;
        iArr[9] = i11 ^ i32;
        iArr2[0] = i12 ^ i23;
        iArr2[1] = i13 ^ i24;
        iArr2[2] = i14 ^ i25;
        iArr2[3] = i15 ^ i26;
        iArr2[4] = i16 ^ i27;
        iArr2[5] = i17 ^ i28;
        iArr2[6] = i18 ^ i29;
        iArr2[7] = i19 ^ i30;
        iArr2[8] = i20 ^ i31;
        iArr2[9] = i21 ^ i32;
    }

    public byte[] B3i() {
        byte[] bArr = new byte[32];
        this.A00.A00(bArr);
        byte[] bArr2 = new byte[32];
        System.arraycopy(bArr, 0, bArr2, 0, 32);
        bArr2[0] = (byte) (bArr2[0] & 248);
        byte b = (byte) (bArr2[31] & Byte.MAX_VALUE);
        bArr2[31] = b;
        bArr2[31] = (byte) (b | 64);
        return bArr2;
    }

    public byte[] BBq(int i) {
        byte[] bArr = new byte[64];
        this.A00.A00(bArr);
        return bArr;
    }

    public byte[] calculateAgreement(byte[] bArr, byte[] bArr2) {
        int i;
        byte[] bArr3 = new byte[32];
        byte[] bArr4 = new byte[32];
        int[] iArr = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3 = new int[10];
        int[] iArr4 = new int[10];
        int[] iArr5 = new int[10];
        int[] iArr6 = new int[10];
        int[] iArr7 = new int[10];
        int i2 = 0;
        do {
            bArr4[i2] = bArr[i2];
            i2++;
        } while (i2 < 32);
        int[] iArr8 = iArr;
        C159537m0.A00(bArr2, iArr8);
        iArr2[0] = 1;
        AnonymousClass6C9.A1K(iArr2);
        iArr3[0] = 0;
        AnonymousClass6C9.A1K(iArr3);
        AnonymousClass763.A00(iArr4, iArr8);
        iArr5[0] = 1;
        AnonymousClass6C9.A1K(iArr5);
        int i3 = 254;
        int i4 = 0;
        do {
            i = (bArr4[i3 / 8] >>> (i3 & 7)) & 1;
            int i5 = i4 ^ i;
            int[] iArr9 = iArr4;
            A07(iArr2, iArr9, i5);
            A07(iArr3, iArr5, i5);
            AnonymousClass768.A00(iArr6, iArr9, iArr5);
            int[] iArr10 = iArr2;
            AnonymousClass768.A00(iArr7, iArr10, iArr3);
            AnonymousClass762.A00(iArr10, iArr10, iArr3);
            AnonymousClass762.A00(iArr3, iArr4, iArr5);
            int[] iArr11 = iArr6;
            AnonymousClass765.A00(iArr5, iArr11, iArr2);
            AnonymousClass765.A00(iArr3, iArr3, iArr7);
            AnonymousClass767.A00(iArr11, iArr7);
            AnonymousClass767.A00(iArr7, iArr2);
            AnonymousClass762.A00(iArr4, iArr5, iArr3);
            AnonymousClass768.A00(iArr3, iArr5, iArr3);
            int[] iArr12 = iArr6;
            AnonymousClass765.A00(iArr2, iArr7, iArr12);
            AnonymousClass768.A00(iArr7, iArr7, iArr12);
            AnonymousClass767.A00(iArr3, iArr3);
            int i6 = iArr7[0];
            int i7 = iArr7[1];
            int i8 = iArr7[2];
            int i9 = iArr7[3];
            int i10 = iArr7[4];
            int i11 = iArr7[5];
            int i12 = iArr7[6];
            int i13 = iArr7[7];
            int i14 = iArr7[8];
            long j = ((long) i7) * 121666;
            long j2 = ((long) i8) * 121666;
            long j3 = ((long) i9) * 121666;
            long j4 = ((long) i11) * 121666;
            long j5 = ((long) i13) * 121666;
            long j6 = ((long) iArr7[9]) * 121666;
            long j7 = (j6 + 16777216) >> 25;
            long j8 = (((long) i6) * 121666) + (19 * j7);
            long j9 = (j + 16777216) >> 25;
            long j10 = j2 + j9;
            long j11 = j - (j9 << 25);
            long j12 = (j3 + 16777216) >> 25;
            long j13 = (((long) i10) * 121666) + j12;
            long j14 = j3 - (j12 << 25);
            long j15 = (j4 + 16777216) >> 25;
            long j16 = (((long) i12) * 121666) + j15;
            long j17 = j4 - (j15 << 25);
            long j18 = (16777216 + j5) >> 25;
            long j19 = (((long) i14) * 121666) + j18;
            long j20 = (j8 + 33554432) >> 26;
            long j21 = j11 + j20;
            long j22 = j8 - (j20 << 26);
            long j23 = (j10 + 33554432) >> 26;
            long j24 = j14 + j23;
            long j25 = j10 - (j23 << 26);
            long j26 = (j13 + 33554432) >> 26;
            long j27 = j17 + j26;
            long j28 = j13 - (j26 << 26);
            long j29 = (j16 + 33554432) >> 26;
            long j30 = (j5 - (j18 << 25)) + j29;
            long j31 = j16 - (j29 << 26);
            long j32 = (j19 + 33554432) >> 26;
            iArr5[0] = (int) j22;
            iArr5[1] = (int) j21;
            iArr5[2] = (int) j25;
            iArr5[3] = (int) j24;
            iArr5[4] = (int) j28;
            iArr5[5] = (int) j27;
            iArr5[6] = (int) j31;
            iArr5[7] = (int) j30;
            iArr5[8] = (int) (j19 - (j32 << 26));
            iArr5[9] = (int) ((j6 - (j7 << 25)) + j32);
            int[] iArr13 = iArr4;
            AnonymousClass767.A00(iArr13, iArr13);
            int[] iArr14 = iArr6;
            AnonymousClass762.A00(iArr14, iArr14, iArr5);
            AnonymousClass765.A00(iArr5, iArr, iArr3);
            AnonymousClass765.A00(iArr3, iArr7, iArr14);
            i3--;
            i4 = i;
        } while (i3 >= 0);
        int[] iArr15 = iArr2;
        int i15 = i;
        A07(iArr15, iArr4, i15);
        A07(iArr3, iArr5, i15);
        AnonymousClass764.A00(iArr3, iArr3);
        AnonymousClass765.A00(iArr15, iArr15, iArr3);
        AnonymousClass769.A00(bArr3, iArr15);
        return bArr3;
    }

    public byte[] calculateSignature(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[64];
        AnonymousClass7R4 r9 = this.A01;
        byte[] bArr5 = bArr3;
        int length = bArr5.length;
        AnonymousClass7NN r1 = new AnonymousClass7NN();
        byte[] bArr6 = new byte[32];
        byte[] bArr7 = new byte[(length + 128)];
        byte[] bArr8 = bArr2;
        A03(r1, bArr8);
        A02(r1, bArr6);
        byte b = (byte) (bArr6[31] & 128);
        long j = (long) length;
        byte[] bArr9 = new byte[64];
        byte[] bArr10 = new byte[64];
        AnonymousClass7NN r10 = new AnonymousClass7NN();
        byte[] bArr11 = bArr7;
        System.arraycopy(bArr5, 0, bArr11, 64, (int) j);
        System.arraycopy(bArr8, 0, bArr11, 32, 32);
        bArr7[0] = -2;
        int i = 1;
        do {
            bArr7[i] = -1;
            i++;
        } while (i < 32);
        long j2 = 64 + j;
        byte[] bArr12 = bArr7;
        System.arraycopy(bArr, 0, bArr12, (int) j2, 64);
        r9.A00(bArr9, bArr12, j + 128);
        System.arraycopy(bArr6, 0, bArr12, 32, 32);
        C159547m1.A01(bArr9);
        A03(r10, bArr9);
        A02(r10, bArr12);
        r9.A00(bArr10, bArr12, j2);
        C159547m1.A01(bArr10);
        byte[] bArr13 = new byte[32];
        long A002 = A00(bArr10, 0) & 2097151;
        long A012 = (A01(bArr10, 2) >>> 5) & 2097151;
        long A0P = AnonymousClass6C9.A0P(bArr10, 5, 2);
        long A013 = (A01(bArr10, 7) >>> 7) & 2097151;
        long A014 = (A01(bArr10, 10) >>> 4) & 2097151;
        long A003 = (A00(bArr10, 13) >>> 1) & 2097151;
        long A015 = (A01(bArr10, 15) >>> 6) & 2097151;
        long A004 = (A00(bArr10, 18) >>> 3) & 2097151;
        long A005 = A00(bArr10, 21) & 2097151;
        long A0Q = AnonymousClass6C9.A0Q(bArr10, 23, 5);
        long A0P2 = AnonymousClass6C9.A0P(bArr10, 26, 2);
        long A016 = A01(bArr10, 28) >>> 7;
        long A006 = A00(bArr8, 0) & 2097151;
        long A0Q2 = AnonymousClass6C9.A0Q(bArr8, 2, 5);
        long A0P3 = AnonymousClass6C9.A0P(bArr8, 5, 2);
        long A017 = (A01(bArr8, 7) >>> 7) & 2097151;
        long A0Q3 = AnonymousClass6C9.A0Q(bArr8, 10, 4);
        long A0P4 = AnonymousClass6C9.A0P(bArr8, 13, 1);
        long A0Q4 = AnonymousClass6C9.A0Q(bArr8, 15, 6);
        long A0P5 = AnonymousClass6C9.A0P(bArr8, 18, 3);
        long A007 = A00(bArr8, 21) & 2097151;
        long A0Q5 = AnonymousClass6C9.A0Q(bArr8, 23, 5);
        long A0P6 = AnonymousClass6C9.A0P(bArr8, 26, 2);
        long A018 = A01(bArr8, 28) >>> 7;
        long A0Q6 = AnonymousClass6C9.A0Q(bArr9, 2, 5);
        long A0P7 = AnonymousClass6C9.A0P(bArr9, 5, 2);
        long A0Q7 = AnonymousClass6C9.A0Q(bArr9, 10, 4);
        long A0P8 = AnonymousClass6C9.A0P(bArr9, 13, 1);
        long A0Q8 = AnonymousClass6C9.A0Q(bArr9, 15, 6);
        long A0P9 = AnonymousClass6C9.A0P(bArr9, 18, 3);
        long A0Q9 = AnonymousClass6C9.A0Q(bArr9, 23, 5);
        long A0P10 = AnonymousClass6C9.A0P(bArr9, 26, 2);
        long A008 = (A00(bArr9, 0) & 2097151) + (A002 * A006);
        long j3 = A0Q6 + (A002 * A0Q2) + (A012 * A006);
        long j4 = A0P7 + (A002 * A0P3) + (A012 * A0Q2) + (A0P * A006);
        long A019 = ((A01(bArr9, 7) >>> 7) & 2097151) + (A002 * A017) + (A012 * A0P3) + (A0P * A0Q2) + (A013 * A006);
        long j5 = A0Q7 + (A002 * A0Q3) + (A012 * A017) + (A0P * A0P3) + (A013 * A0Q2) + (A014 * A006);
        long j6 = A0P8 + (A002 * A0P4) + (A012 * A0Q3) + (A0P * A017) + (A013 * A0P3) + (A014 * A0Q2) + (A003 * A006);
        long j7 = A0Q8 + (A002 * A0Q4) + (A012 * A0P4) + (A0P * A0Q3) + (A013 * A017) + (A014 * A0P3) + (A003 * A0Q2) + (A015 * A006);
        long j8 = A0P9 + (A002 * A0P5) + (A012 * A0Q4) + (A0P * A0P4) + (A013 * A0Q3) + (A014 * A017) + (A003 * A0P3) + (A015 * A0Q2) + (A004 * A006);
        long A009 = (A00(bArr9, 21) & 2097151) + (A002 * A007) + (A012 * A0P5) + (A0P * A0Q4) + (A013 * A0P4) + (A014 * A0Q3) + (A003 * A017) + (A015 * A0P3) + (A004 * A0Q2) + (A005 * A006);
        long j9 = A0Q9 + (A002 * A0Q5) + (A012 * A007) + (A0P * A0P5) + (A013 * A0Q4) + (A014 * A0P4) + (A003 * A0Q3) + (A015 * A017) + (A004 * A0P3) + (A005 * A0Q2) + (A0Q * A006);
        long j10 = A0P10 + (A002 * A0P6) + (A012 * A0Q5) + (A0P * A007) + (A013 * A0P5) + (A014 * A0Q4) + (A003 * A0P4) + (A015 * A0Q3) + (A004 * A017) + (A005 * A0P3) + (A0Q * A0Q2) + (A0P2 * A006);
        long j11 = (A012 * A018) + (A0P * A0P6) + (A013 * A0Q5) + (A014 * A007) + (A003 * A0P5) + (A015 * A0Q4) + (A004 * A0P4) + (A005 * A0Q3) + (A0Q * A017) + (A0P2 * A0P3) + (A0Q2 * A016);
        long j12 = (A013 * A018) + (A014 * A0P6) + (A003 * A0Q5) + (A015 * A007) + (A004 * A0P5) + (A005 * A0Q4) + (A0Q * A0P4) + (A0P2 * A0Q3) + (A017 * A016);
        long j13 = (A003 * A018) + (A015 * A0P6) + (A004 * A0Q5) + (A005 * A007) + (A0Q * A0P5) + (A0P2 * A0Q4) + (A0P4 * A016);
        long j14 = (A004 * A018) + (A005 * A0P6) + (A0Q * A0Q5) + (A0P2 * A007) + (A0P5 * A016);
        long j15 = (A0Q * A018) + (A0P2 * A0P6) + (A0Q5 * A016);
        long j16 = A016 * A018;
        long j17 = (A008 + 1048576) >> 21;
        long j18 = j3 + j17;
        long j19 = A008 - (j17 << 21);
        long j20 = (j4 + 1048576) >> 21;
        long j21 = A019 + j20;
        long j22 = j4 - (j20 << 21);
        long j23 = (j5 + 1048576) >> 21;
        long j24 = j6 + j23;
        long j25 = j5 - (j23 << 21);
        long j26 = (j7 + 1048576) >> 21;
        long j27 = j8 + j26;
        long j28 = j7 - (j26 << 21);
        long j29 = (A009 + 1048576) >> 21;
        long j30 = j9 + j29;
        long j31 = A009 - (j29 << 21);
        long j32 = (j10 + 1048576) >> 21;
        long A0110 = (A01(bArr9, 28) >>> 7) + (A002 * A018) + (A012 * A0P6) + (A0P * A0Q5) + (A013 * A007) + (A014 * A0P5) + (A003 * A0Q4) + (A015 * A0P4) + (A004 * A0Q3) + (A005 * A017) + (A0Q * A0P3) + (A0P2 * A0Q2) + (A006 * A016) + j32;
        long j33 = j10 - (j32 << 21);
        long j34 = (j11 + 1048576) >> 21;
        long j35 = (A0P * A018) + (A013 * A0P6) + (A014 * A0Q5) + (A003 * A007) + (A015 * A0P5) + (A004 * A0Q4) + (A005 * A0P4) + (A0Q * A0Q3) + (A0P2 * A017) + (A0P3 * A016) + j34;
        long j36 = j11 - (j34 << 21);
        long j37 = (j12 + 1048576) >> 21;
        long j38 = (A014 * A018) + (A003 * A0P6) + (A015 * A0Q5) + (A004 * A007) + (A005 * A0P5) + (A0Q * A0Q4) + (A0P2 * A0P4) + (A0Q3 * A016) + j37;
        long j39 = j12 - (j37 << 21);
        long j40 = (j13 + 1048576) >> 21;
        long j41 = (A015 * A018) + (A004 * A0P6) + (A005 * A0Q5) + (A0Q * A007) + (A0P2 * A0P5) + (A0Q4 * A016) + j40;
        long j42 = j13 - (j40 << 21);
        long j43 = (j14 + 1048576) >> 21;
        long j44 = (A005 * A018) + (A0Q * A0P6) + (A0P2 * A0Q5) + (A007 * A016) + j43;
        long j45 = j14 - (j43 << 21);
        long j46 = (j15 + 1048576) >> 21;
        long j47 = (A0P2 * A018) + (A0P6 * A016) + j46;
        long j48 = j15 - (j46 << 21);
        long j49 = (j16 + 1048576) >> 21;
        long j50 = j49 + 0;
        long j51 = (j18 + 1048576) >> 21;
        long j52 = j22 + j51;
        long j53 = j18 - (j51 << 21);
        long j54 = (j21 + 1048576) >> 21;
        long j55 = j25 + j54;
        long j56 = j21 - (j54 << 21);
        long j57 = (j24 + 1048576) >> 21;
        long j58 = j28 + j57;
        long j59 = j24 - (j57 << 21);
        long j60 = (j27 + 1048576) >> 21;
        long j61 = j31 + j60;
        long j62 = j27 - (j60 << 21);
        long j63 = (j30 + 1048576) >> 21;
        long j64 = j33 + j63;
        long j65 = j30 - (j63 << 21);
        long j66 = (A0110 + 1048576) >> 21;
        long j67 = j36 + j66;
        long j68 = A0110 - (j66 << 21);
        long j69 = (j35 + 1048576) >> 21;
        long j70 = j39 + j69;
        long j71 = j35 - (j69 << 21);
        long j72 = (j38 + 1048576) >> 21;
        long j73 = j42 + j72;
        long j74 = j38 - (j72 << 21);
        long j75 = (j41 + 1048576) >> 21;
        long j76 = j45 + j75;
        long j77 = j41 - (j75 << 21);
        long j78 = (j44 + 1048576) >> 21;
        long j79 = j48 + j78;
        long j80 = j44 - (j78 << 21);
        long j81 = (j47 + 1048576) >> 21;
        long j82 = (j16 - (j49 << 21)) + j81;
        long j83 = j47 - (j81 << 21);
        long j84 = j73 - (j50 * 683901);
        long j85 = ((j70 - (j50 * 997805)) + (j82 * 136657)) - (j83 * 683901);
        long j86 = ((((j67 + (j50 * 470296)) + (j82 * 654183)) - (j83 * 997805)) + (j79 * 136657)) - (j80 * 683901);
        long j87 = j58 + (j76 * 666643);
        long j88 = j61 + (j79 * 666643) + (j80 * 470296) + (j76 * 654183);
        long j89 = ((((j64 + (j82 * 666643)) + (j83 * 470296)) + (j79 * 654183)) - (j80 * 997805)) + (j76 * 136657);
        long j90 = (j87 + 1048576) >> 21;
        long j91 = j62 + (j80 * 666643) + (j76 * 470296) + j90;
        long j92 = j87 - (j90 << 21);
        long j93 = (j88 + 1048576) >> 21;
        long j94 = ((((j65 + (j83 * 666643)) + (j79 * 470296)) + (j80 * 654183)) - (j76 * 997805)) + j93;
        long j95 = j88 - (j93 << 21);
        long j96 = (j89 + 1048576) >> 21;
        long j97 = ((((((j68 + (j50 * 666643)) + (j82 * 470296)) + (j83 * 654183)) - (j79 * 997805)) + (j80 * 136657)) - (j76 * 683901)) + j96;
        long j98 = j89 - (j96 << 21);
        long j99 = (j86 + 1048576) >> 21;
        long j100 = ((((j71 + (j50 * 654183)) - (j82 * 997805)) + (j83 * 136657)) - (j79 * 683901)) + j99;
        long j101 = j86 - (j99 << 21);
        long j102 = (j85 + 1048576) >> 21;
        long j103 = ((j74 + (j50 * 136657)) - (j82 * 683901)) + j102;
        long j104 = j85 - (j102 << 21);
        long j105 = (j84 + 1048576) >> 21;
        long j106 = j77 + j105;
        long j107 = j84 - (j105 << 21);
        long j108 = (j91 + 1048576) >> 21;
        long j109 = j95 + j108;
        long j110 = j91 - (j108 << 21);
        long j111 = (j94 + 1048576) >> 21;
        long j112 = j98 + j111;
        long j113 = j94 - (j111 << 21);
        long j114 = (j97 + 1048576) >> 21;
        long j115 = j101 + j114;
        long j116 = j97 - (j114 << 21);
        long j117 = (j100 + 1048576) >> 21;
        long j118 = j104 + j117;
        long j119 = j100 - (j117 << 21);
        long j120 = (j103 + 1048576) >> 21;
        long j121 = j107 + j120;
        long j122 = j103 - (j120 << 21);
        long j123 = j112 - (j106 * 683901);
        long j124 = ((j109 - (j106 * 997805)) + (j121 * 136657)) - (j122 * 683901);
        long j125 = ((((j92 + (j106 * 470296)) + (j121 * 654183)) - (j122 * 997805)) + (j118 * 136657)) - (j119 * 683901);
        long j126 = j19 + (j115 * 666643);
        long j127 = j52 + (j118 * 666643) + (j119 * 470296) + (j115 * 654183);
        long j128 = ((((j55 + (j121 * 666643)) + (j122 * 470296)) + (j118 * 654183)) - (j119 * 997805)) + (j115 * 136657);
        long j129 = (j126 + 1048576) >> 21;
        long j130 = j53 + (j119 * 666643) + (j115 * 470296) + j129;
        long j131 = j126 - (j129 << 21);
        long j132 = (j127 + 1048576) >> 21;
        long j133 = ((((j56 + (j122 * 666643)) + (j118 * 470296)) + (j119 * 654183)) - (j115 * 997805)) + j132;
        long j134 = j127 - (j132 << 21);
        long j135 = (j128 + 1048576) >> 21;
        long j136 = ((((((j59 + (j106 * 666643)) + (j121 * 470296)) + (j122 * 654183)) - (j118 * 997805)) + (j119 * 136657)) - (j115 * 683901)) + j135;
        long j137 = j128 - (j135 << 21);
        long j138 = (j125 + 1048576) >> 21;
        long j139 = ((((j110 + (j106 * 654183)) - (j121 * 997805)) + (j122 * 136657)) - (j118 * 683901)) + j138;
        long j140 = j125 - (j138 << 21);
        long j141 = (j124 + 1048576) >> 21;
        long j142 = ((j113 + (j106 * 136657)) - (j121 * 683901)) + j141;
        long j143 = j124 - (j141 << 21);
        long j144 = (j123 + 1048576) >> 21;
        long j145 = j116 + j144;
        long j146 = j123 - (j144 << 21);
        long j147 = (j130 + 1048576) >> 21;
        long j148 = j134 + j147;
        long j149 = j130 - (j147 << 21);
        long j150 = (j133 + 1048576) >> 21;
        long j151 = j137 + j150;
        long j152 = j133 - (j150 << 21);
        long j153 = (j136 + 1048576) >> 21;
        long j154 = j140 + j153;
        long j155 = j136 - (j153 << 21);
        long j156 = (j139 + 1048576) >> 21;
        long j157 = j143 + j156;
        long j158 = j139 - (j156 << 21);
        long j159 = (j142 + 1048576) >> 21;
        long j160 = j146 + j159;
        long j161 = j142 - (j159 << 21);
        long j162 = (1048576 + j145) >> 21;
        long j163 = 0 + j162;
        long j164 = j131 + (j163 * 666643);
        long j165 = j164 >> 21;
        long j166 = j149 + (j163 * 470296) + j165;
        long j167 = j164 - (j165 << 21);
        long j168 = j166 >> 21;
        long j169 = j148 + (j163 * 654183) + j168;
        long j170 = j166 - (j168 << 21);
        long j171 = j169 >> 21;
        long j172 = (j152 - (j163 * 997805)) + j171;
        long j173 = j169 - (j171 << 21);
        long j174 = j172 >> 21;
        long j175 = j151 + (j163 * 136657) + j174;
        long j176 = j172 - (j174 << 21);
        long j177 = j175 >> 21;
        long j178 = (j155 - (j163 * 683901)) + j177;
        long j179 = j175 - (j177 << 21);
        long j180 = j178 >> 21;
        long j181 = j154 + j180;
        long j182 = j178 - (j180 << 21);
        long j183 = j181 >> 21;
        long j184 = j158 + j183;
        long j185 = j181 - (j183 << 21);
        long j186 = j184 >> 21;
        long j187 = j157 + j186;
        long j188 = j184 - (j186 << 21);
        long j189 = j187 >> 21;
        long j190 = j161 + j189;
        long j191 = j187 - (j189 << 21);
        long j192 = j190 >> 21;
        long j193 = j160 + j192;
        long j194 = j190 - (j192 << 21);
        long j195 = j193 >> 21;
        long j196 = (j145 - (j162 << 21)) + j195;
        long j197 = j193 - (j195 << 21);
        long j198 = j196 >> 21;
        long j199 = 0 + j198;
        long j200 = j167 + (666643 * j199);
        long j201 = j182 - (j199 * 683901);
        long j202 = j200 >> 21;
        long j203 = j170 + (470296 * j199) + j202;
        long j204 = j200 - (j202 << 21);
        long j205 = j203 >> 21;
        long j206 = j173 + (654183 * j199) + j205;
        long j207 = j203 - (j205 << 21);
        long j208 = j206 >> 21;
        long j209 = (j176 - (997805 * j199)) + j208;
        long j210 = j206 - (j208 << 21);
        long j211 = j209 >> 21;
        long j212 = j179 + (136657 * j199) + j211;
        long j213 = j209 - (j211 << 21);
        long j214 = j212 >> 21;
        long j215 = j201 + j214;
        long j216 = j212 - (j214 << 21);
        long j217 = j215 >> 21;
        long j218 = j185 + j217;
        long j219 = j215 - (j217 << 21);
        long j220 = j218 >> 21;
        long j221 = j188 + j220;
        long j222 = j218 - (j220 << 21);
        long j223 = j221 >> 21;
        long j224 = j191 + j223;
        long j225 = j221 - (j223 << 21);
        long j226 = j224 >> 21;
        long j227 = j194 + j226;
        long j228 = j224 - (j226 << 21);
        long j229 = j227 >> 21;
        long j230 = j197 + j229;
        long j231 = j227 - (j229 << 21);
        long j232 = j230 >> 21;
        long j233 = (j196 - (j198 << 21)) + j232;
        long j234 = j230 - (j232 << 21);
        bArr13[0] = (byte) ((int) (j204 >> 0));
        AnonymousClass6C7.A0x(j204, bArr13, 8, 1);
        bArr13[2] = AnonymousClass6CA.A00(5, j207, j204 >> 16);
        bArr13[3] = (byte) ((int) (j207 >> 3));
        AnonymousClass6C7.A0x(j207, bArr13, 11, 4);
        bArr13[5] = AnonymousClass6CA.A00(2, j210, j207 >> 19);
        bArr13[6] = (byte) ((int) (j210 >> 6));
        bArr13[7] = AnonymousClass6CA.A00(7, j213, j210 >> 14);
        bArr13[8] = (byte) ((int) (j213 >> 1));
        bArr13[9] = (byte) ((int) (j213 >> 9));
        bArr13[10] = AnonymousClass6CA.A00(4, j216, j213 >> 17);
        bArr13[11] = (byte) ((int) (j216 >> 4));
        bArr13[12] = (byte) ((int) (j216 >> 12));
        bArr13[13] = AnonymousClass6CA.A00(1, j219, j216 >> 20);
        bArr13[14] = (byte) ((int) (j219 >> 7));
        bArr13[15] = AnonymousClass6CA.A00(6, j222, j219 >> 15);
        bArr13[16] = (byte) ((int) (j222 >> 2));
        bArr13[17] = (byte) ((int) (j222 >> 10));
        bArr13[18] = AnonymousClass6CA.A00(3, j225, j222 >> 18);
        bArr13[19] = (byte) ((int) (j225 >> 5));
        bArr13[20] = (byte) ((int) (j225 >> 13));
        AnonymousClass6C7.A0x(j228, bArr13, 0, 21);
        bArr13[22] = (byte) ((int) (j228 >> 8));
        bArr13[23] = AnonymousClass6CA.A00(5, j231, j228 >> 16);
        bArr13[24] = (byte) ((int) (j231 >> 3));
        bArr13[25] = (byte) ((int) (j231 >> 11));
        bArr13[26] = AnonymousClass6CA.A00(2, j234, j231 >> 19);
        bArr13[27] = (byte) ((int) (j234 >> 6));
        byte[] bArr14 = bArr13;
        AnonymousClass6C9.A1I(bArr14, (int) ((j234 >> 14) | (j233 << 7)), j233);
        byte[] bArr15 = bArr7;
        System.arraycopy(bArr14, 0, bArr15, 32, 32);
        System.arraycopy(bArr15, 0, bArr4, 0, 64);
        byte b2 = (byte) (bArr4[63] & Byte.MAX_VALUE);
        bArr4[63] = b2;
        AnonymousClass6C8.A0u(b2, bArr4, b, 63);
        return bArr4;
    }

    public byte[] generatePublicKey(byte[] bArr) {
        byte[] bArr2 = new byte[32];
        AnonymousClass7NN r6 = new AnonymousClass7NN();
        int[] iArr = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3 = new int[10];
        int[] iArr4 = new int[10];
        A03(r6, bArr);
        int[] iArr5 = r6.A02;
        int[] iArr6 = r6.A03;
        AnonymousClass762.A00(iArr, iArr5, iArr6);
        AnonymousClass768.A00(iArr2, iArr6, iArr5);
        AnonymousClass764.A00(iArr3, iArr2);
        AnonymousClass765.A00(iArr4, iArr, iArr3);
        AnonymousClass769.A00(bArr2, iArr4);
        return bArr2;
    }

    public boolean verifySignature(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        AnonymousClass7R4 r11 = this.A01;
        byte[] bArr4 = bArr2;
        int length = bArr4.length;
        int[] iArr = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3 = new int[10];
        int[] iArr4 = new int[10];
        int[] iArr5 = new int[10];
        int[] iArr6 = new int[10];
        byte[] bArr5 = new byte[32];
        int i = length + 64;
        byte[] bArr6 = new byte[i];
        C159537m0.A00(bArr, iArr);
        iArr5[0] = 1;
        AnonymousClass6C9.A1K(iArr5);
        AnonymousClass768.A00(iArr2, iArr, iArr5);
        AnonymousClass762.A00(iArr3, iArr, iArr5);
        AnonymousClass764.A00(iArr4, iArr3);
        AnonymousClass765.A00(iArr6, iArr2, iArr4);
        AnonymousClass769.A00(bArr5, iArr6);
        byte b = (byte) (bArr5[31] & Byte.MAX_VALUE);
        bArr5[31] = b;
        AnonymousClass6C8.A0u(b, bArr5, bArr3[63] & 128, 31);
        System.arraycopy(bArr3, 0, bArr6, 0, 64);
        bArr6[63] = (byte) (bArr6[63] & Byte.MAX_VALUE);
        System.arraycopy(bArr4, 0, bArr6, 64, length);
        return AnonymousClass000.A1T(AnonymousClass76G.A00(r11, new byte[i], bArr6, bArr5, (long) i));
    }

    public static long A00(byte[] bArr, int i) {
        return AnonymousClass6C7.A0L(bArr, i) | AnonymousClass6C7.A0M(bArr, i);
    }

    public static long A01(byte[] bArr, int i) {
        return ((((long) bArr[i + 3]) << 24) & 4278190080L) | AnonymousClass6C7.A0M(bArr, i) | AnonymousClass6C7.A0L(bArr, i);
    }
}
