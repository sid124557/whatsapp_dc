package X;

import java.lang.reflect.Array;

/* renamed from: X.7Vl  reason: invalid class name and case insensitive filesystem */
public final class C151607Vl {
    public AnonymousClass8LQ A00;
    public final C146707Bh A01;

    public AnonymousClass8LQ A00() {
        int[] iArr;
        int i;
        AnonymousClass8LQ r0 = this.A00;
        AnonymousClass8LQ r21 = r0;
        if (r0 == null) {
            C130886ch r2 = (C130886ch) this.A01;
            AnonymousClass8LQ r02 = r2.A00;
            r21 = r02;
            if (r02 == null) {
                C152847aG r10 = r2.A00;
                int i2 = r10.A01;
                int i3 = r10.A00;
                if (i2 < 40 || i3 < 40) {
                    r21 = new AnonymousClass8LQ(i2, i3);
                    if (r2.A01.length < i2) {
                        r2.A01 = new byte[i2];
                    }
                    int i4 = 0;
                    do {
                        iArr = r2.A02;
                        iArr[i4] = 0;
                        i4++;
                    } while (i4 < 32);
                    for (int i5 = 1; i5 < 5; i5++) {
                        byte[] A012 = r10.A01(r2.A01, (i3 * i5) / 5);
                        int i6 = (i2 << 2) / 5;
                        for (int i7 = i2 / 5; i7 < i6; i7++) {
                            AnonymousClass6C8.A1L(iArr, (A012[i7] & 255) >> 3);
                        }
                    }
                    int length = iArr.length;
                    int i8 = 0;
                    int i9 = 0;
                    int i10 = 0;
                    for (int i11 = 0; i11 < length; i11++) {
                        int i12 = iArr[i11];
                        if (i12 > i8) {
                            i10 = i11;
                            i8 = i12;
                        }
                        if (i12 > i9) {
                            i9 = i12;
                        }
                    }
                    int i13 = 0;
                    int i14 = 0;
                    for (int i15 = 0; i15 < length; i15++) {
                        int i16 = i15 - i10;
                        int i17 = iArr[i15] * i16 * i16;
                        if (i17 > i14) {
                            i13 = i15;
                            i14 = i17;
                        }
                    }
                    if (i10 <= i13) {
                        int i18 = i10;
                        i10 = i13;
                        i13 = i18;
                    }
                    if (i10 - i13 > length / 16) {
                        int i19 = i10 - 1;
                        int i20 = i19;
                        int i21 = -1;
                        while (i19 > i13) {
                            int i22 = i19 - i13;
                            int i23 = i22 * i22 * (i10 - i19) * (i9 - iArr[i19]);
                            if (i23 > i21) {
                                i20 = i19;
                                i21 = i23;
                            }
                            i19--;
                        }
                        int i24 = i20 << 3;
                        byte[] A002 = r10.A00();
                        for (int i25 = 0; i25 < i3; i25++) {
                            int i26 = i25 * i2;
                            for (int i27 = 0; i27 < i2; i27++) {
                                if ((A002[i26 + i27] & 255) < i24) {
                                    r21.A01(i27, i25);
                                }
                            }
                        }
                    } else {
                        throw C130936cm.A00;
                    }
                } else {
                    byte[] A003 = r10.A00();
                    int i28 = i2 >> 3;
                    if ((i2 & 7) != 0) {
                        i28++;
                    }
                    int i29 = i3 >> 3;
                    if ((i3 & 7) != 0) {
                        i29++;
                    }
                    int i30 = i3 - 8;
                    int i31 = i2 - 8;
                    int[] A1Z = C86664Kz.A1Z();
                    A1Z[1] = i28;
                    A1Z[0] = i29;
                    int[][] iArr2 = (int[][]) Array.newInstance(Integer.TYPE, A1Z);
                    for (int i32 = 0; i32 < i29; i32++) {
                        int i33 = i32 << 3;
                        int i34 = i30;
                        if (i33 > i34) {
                            i33 = i34;
                        }
                        for (int i35 = 0; i35 < i28; i35++) {
                            int i36 = i35 << 3;
                            int i37 = i31;
                            if (i36 > i37) {
                                i36 = i37;
                            }
                            int i38 = (i33 * i2) + i36;
                            byte b = 255;
                            int i39 = 0;
                            int i40 = 0;
                            byte b2 = 0;
                            do {
                                int i41 = 0;
                                do {
                                    byte b3 = A003[i38 + i41] & 255;
                                    i40 += b3;
                                    if (b3 < b) {
                                        b = b3;
                                    }
                                    if (b3 > b2) {
                                        b2 = b3;
                                    }
                                    i41++;
                                } while (i41 < 8);
                                i = b2 - b;
                                if (i > 24) {
                                    while (true) {
                                        i39++;
                                        i38 += i2;
                                        if (i39 >= 8) {
                                            break;
                                        }
                                        int i42 = 0;
                                        do {
                                            i40 += A003[i38 + i42] & 255;
                                            i42++;
                                        } while (i42 < 8);
                                    }
                                }
                                i39++;
                                i38 += i2;
                            } while (i39 < 8);
                            int i43 = i40 >> 6;
                            if (i <= 24) {
                                i43 = b / 2;
                                if (i32 > 0 && i35 > 0) {
                                    int[] iArr3 = iArr2[i32 - 1];
                                    int i44 = i35 - 1;
                                    int i45 = ((iArr3[i35] + (iArr2[i32][i44] * 2)) + iArr3[i44]) / 4;
                                    if (b < i45) {
                                        i43 = i45;
                                    }
                                }
                            }
                            iArr2[i32][i35] = i43;
                        }
                    }
                    r21 = new AnonymousClass8LQ(i2, i3);
                    for (int i46 = 0; i46 < i29; i46++) {
                        int i47 = i46 << 3;
                        int i48 = i30;
                        if (i47 > i48) {
                            i47 = i48;
                        }
                        int i49 = i29 - 3;
                        if (i46 < 2) {
                            i49 = 2;
                        } else if (i46 <= i49) {
                            i49 = i46;
                        }
                        for (int i50 = 0; i50 < i28; i50++) {
                            int i51 = i50 << 3;
                            int i52 = i31;
                            if (i51 > i52) {
                                i51 = i52;
                            }
                            int i53 = i28 - 3;
                            if (i50 < 2) {
                                i53 = 2;
                            } else if (i50 <= i53) {
                                i53 = i50;
                            }
                            int i54 = -2;
                            int i55 = 0;
                            do {
                                int[] iArr4 = iArr2[i49 + i54];
                                i55 = AnonymousClass6C9.A0I(iArr4, i53 + 2, iArr4[i53 - 2] + iArr4[i53 - 1] + iArr4[i53] + iArr4[i53 + 1], i55);
                                i54++;
                            } while (i54 <= 2);
                            int i56 = i55 / 25;
                            int i57 = (i47 * i2) + i51;
                            int i58 = 0;
                            do {
                                int i59 = 0;
                                do {
                                    if ((A003[i57 + i59] & 255) <= i56) {
                                        r21.A01(i51 + i59, i47 + i58);
                                    }
                                    i59++;
                                } while (i59 < 8);
                                i58++;
                                i57 += i2;
                            } while (i58 < 8);
                        }
                    }
                }
                r02 = r21;
                r2.A00 = r02;
            }
            this.A00 = r02;
        }
        return r21;
    }

    public C151607Vl(C146707Bh r1) {
        this.A01 = r1;
    }

    public String toString() {
        try {
            return A00().toString();
        } catch (C130936cm unused) {
            return "";
        }
    }
}
