package X;

import java.util.Arrays;

/* renamed from: X.7b4  reason: invalid class name and case insensitive filesystem */
public final class C153337b4 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public short[] A0A;
    public short[] A0B;
    public short[] A0C;
    public final float A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final short[] A0J;

    public final short[] A04(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.A0E;
        int i4 = length / i3;
        if (i + i2 > i4) {
            return Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
        }
        return sArr;
    }

    public final int A00(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.A0E;
        int i5 = 255;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += AnonymousClass001.A0A(sArr[i4 + i10], sArr[i4 + i2 + i10]);
            }
            if (i9 * i7 < i6 * i2) {
                i7 = i2;
                i6 = i9;
            }
            if (i9 * i5 > i8 * i2) {
                i5 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.A02 = i6 / i7;
        this.A01 = i8 / i5;
        return i7;
    }

    public final void A01() {
        int i;
        int A002;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = this.A05;
        float f = 1.0f / 1.0f;
        float f2 = this.A0D * 1.0f;
        double d = (double) f;
        double d2 = d;
        if (d > 1.00001d || d2 < 0.99999d) {
            int i10 = this.A00;
            int i11 = this.A0H;
            int i12 = i11;
            if (i10 >= i11) {
                int i13 = 0;
                do {
                    int i14 = this.A09;
                    if (i14 > 0) {
                        i4 = Math.min(i12, i14);
                        A02(this.A0A, i13, i4);
                        this.A09 -= i4;
                    } else {
                        short[] sArr = this.A0A;
                        int i15 = this.A0F;
                        if (i15 > 4000) {
                            i = i15 / 4000;
                        } else {
                            i = 1;
                        }
                        int i16 = this.A0E;
                        if (i16 == 1 && i == 1) {
                            A002 = A00(sArr, i13, this.A0I, this.A0G);
                        } else {
                            A03(sArr, i13, i);
                            short[] sArr2 = this.A0J;
                            int i17 = this.A0I;
                            int i18 = this.A0G;
                            A002 = A00(sArr2, 0, i17 / i, i18 / i);
                            if (i != 1) {
                                int i19 = A002 * i;
                                int i20 = i * 4;
                                int i21 = i19 - i20;
                                int i22 = i19 + i20;
                                if (i21 < i17) {
                                    i21 = i17;
                                }
                                if (i22 > i18) {
                                    i22 = i18;
                                }
                                if (i16 == 1) {
                                    A002 = A00(sArr, i13, i21, i22);
                                } else {
                                    A03(sArr, i13, 1);
                                    A002 = A00(sArr2, 0, i21, i22);
                                }
                            }
                        }
                        int i23 = this.A02;
                        int i24 = this.A01;
                        if (i23 == 0 || (i2 = this.A08) == 0 || i24 > i23 * 3 || i23 * 2 <= this.A07 * 3) {
                            i2 = A002;
                        }
                        this.A07 = i23;
                        this.A08 = A002;
                        if (d2 > 1.0d) {
                            float f3 = (float) i2;
                            if (f >= 2.0f) {
                                i5 = (int) (f3 / (f - 1.0f));
                            } else {
                                this.A09 = (int) ((f3 * (2.0f - f)) / (f - 1.0f));
                                i5 = i2;
                            }
                            short[] A042 = A04(this.A0B, this.A05, i5);
                            this.A0B = A042;
                            int i25 = this.A05;
                            int i26 = i13 + i2;
                            for (int i27 = 0; i27 < i16; i27++) {
                                int i28 = (i25 * i16) + i27;
                                int i29 = (i26 * i16) + i27;
                                int i30 = (i13 * i16) + i27;
                                for (int i31 = 0; i31 < i5; i31++) {
                                    A042[i28] = AnonymousClass6C7.A0w(sArr, i30, i5, i31, i29);
                                    i28 += i16;
                                    i30 += i16;
                                    i29 += i16;
                                }
                            }
                            this.A05 = i25 + i5;
                            i4 = i2 + i5;
                        } else {
                            float f4 = (float) i2;
                            if (f < 0.5f) {
                                i3 = (int) ((f4 * f) / (1.0f - f));
                            } else {
                                this.A09 = (int) ((f4 * ((2.0f * f) - 1.0f)) / (1.0f - f));
                                i3 = i2;
                            }
                            int i32 = i2 + i3;
                            short[] A043 = A04(this.A0B, this.A05, i32);
                            this.A0B = A043;
                            int i33 = i13 * i16;
                            System.arraycopy(sArr, i33, A043, this.A05 * i16, i16 * i2);
                            short[] sArr3 = this.A0B;
                            int i34 = this.A05;
                            int i35 = i34 + i2;
                            int i36 = i13 + i2;
                            for (int i37 = 0; i37 < i16; i37++) {
                                int i38 = (i35 * i16) + i37;
                                int i39 = i33 + i37;
                                int i40 = (i36 * i16) + i37;
                                for (int i41 = 0; i41 < i3; i41++) {
                                    sArr3[i38] = AnonymousClass6C7.A0w(sArr, i40, i3, i41, i39);
                                    i38 += i16;
                                    i40 += i16;
                                    i39 += i16;
                                }
                            }
                            this.A05 = i34 + i32;
                            i4 = i3;
                        }
                    }
                    i13 += i4;
                } while (i12 + i13 <= i10);
                int i42 = this.A00 - i13;
                short[] sArr4 = this.A0A;
                int i43 = this.A0E;
                System.arraycopy(sArr4, i13 * i43, sArr4, 0, i43 * i42);
                this.A00 = i42;
            }
        } else {
            A02(this.A0A, 0, this.A00);
            this.A00 = 0;
        }
        if (f2 != 1.0f && (i6 = this.A05) != i9) {
            int i44 = this.A0F;
            int i45 = (int) (((float) i44) / f2);
            while (true) {
                if (i45 <= 16384 && i44 <= 16384) {
                    break;
                }
                i45 /= 2;
                i44 /= 2;
            }
            int i46 = i6 - i9;
            short[] A044 = A04(this.A0C, this.A06, i46);
            this.A0C = A044;
            short[] sArr5 = this.A0B;
            int i47 = this.A0E;
            System.arraycopy(sArr5, i9 * i47, A044, this.A06 * i47, i47 * i46);
            this.A05 = i9;
            this.A06 += i46;
            int i48 = 0;
            while (true) {
                int i49 = this.A06;
                if (i48 >= i49 - 1) {
                    int i50 = i49 - 1;
                    if (i50 != 0) {
                        short[] sArr6 = this.A0C;
                        System.arraycopy(sArr6, i50 * i47, sArr6, 0, (i49 - i50) * i47);
                        this.A06 -= i50;
                        return;
                    }
                    return;
                }
                while (true) {
                    i7 = this.A04 + 1;
                    int i51 = i7 * i45;
                    i8 = this.A03;
                    if (i51 <= i8 * i44) {
                        break;
                    }
                    short[] A045 = A04(this.A0B, i9, 1);
                    this.A0B = A045;
                    for (int i52 = 0; i52 < i47; i52++) {
                        short[] sArr7 = this.A0C;
                        int i53 = (i47 * i48) + i52;
                        A045[(this.A05 * i47) + i52] = AnonymousClass6C9.A0r(this.A04, i45, this.A03 * i44, sArr7[i53], sArr7[i53 + i47]);
                    }
                    this.A03++;
                    i9 = this.A05 + 1;
                    this.A05 = i9;
                }
                this.A04 = i7;
                if (i7 == i44) {
                    this.A04 = 0;
                    if (i8 == i45) {
                        this.A03 = 0;
                    } else {
                        throw AnonymousClass001.A0e("Wrong sample rate");
                    }
                }
                i48++;
            }
        }
    }

    public final void A02(short[] sArr, int i, int i2) {
        short[] A042 = A04(this.A0B, this.A05, i2);
        this.A0B = A042;
        int i3 = this.A0E;
        System.arraycopy(sArr, i * i3, A042, this.A05 * i3, i3 * i2);
        this.A05 += i2;
    }

    public final void A03(short[] sArr, int i, int i2) {
        int i3 = this.A0H / i2;
        int i4 = this.A0E;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.A0J[i7] = (short) (i8 / i5);
        }
    }

    public C153337b4(int i, int i2) {
        this.A0F = i;
        this.A0E = i2;
        this.A0D = ((float) i) / ((float) 44100);
        this.A0I = i / 400;
        int i3 = i / 65;
        this.A0G = i3;
        int i4 = i3 * 2;
        this.A0H = i4;
        this.A0J = new short[i4];
        int i5 = i4 * i2;
        this.A0A = new short[i5];
        this.A0B = new short[i5];
        this.A0C = new short[i5];
    }
}
