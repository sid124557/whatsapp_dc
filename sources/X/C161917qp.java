package X;

/* renamed from: X.7qp  reason: invalid class name and case insensitive filesystem */
public final class C161917qp {
    public static int A00(C148847Jy r8, C160647o3 r9, byte[] bArr, int i, int i2, int i3) {
        Object r1;
        int i4 = i2;
        if ((i >>> 3) != 0) {
            int i5 = i & 7;
            C148847Jy r3 = r8;
            byte[] bArr2 = bArr;
            if (i5 == 0) {
                int A02 = A02(r8, bArr, i2);
                r9.A01(i, Long.valueOf(r8.A01));
                return A02;
            } else if (i5 == 1) {
                r9.A01(i, Long.valueOf(AnonymousClass6C7.A0N(bArr, i2)));
                return i2 + 8;
            } else if (i5 == 2) {
                int A01 = A01(r8, bArr, i2);
                int i6 = r8.A00;
                if (i6 == 0) {
                    r1 = C172528Lo.A00;
                } else {
                    r1 = new C128286Vm(C172528Lo.A01.Bts(bArr, A01, i6));
                }
                r9.A01(i, r1);
                return A01 + i6;
            } else if (i5 == 3) {
                C160647o3 r4 = new C160647o3();
                int i7 = (i & -8) | 4;
                int i8 = 0;
                while (true) {
                    int i9 = i3;
                    if (i4 >= i3) {
                        break;
                    }
                    i4 = A01(r3, bArr, i4);
                    i8 = r3.A00;
                    if (i8 == i7) {
                        break;
                    }
                    i4 = A00(r3, r4, bArr2, i8, i4, i9);
                }
                if (i4 > i3 || i8 != i7) {
                    throw new C140566tx("Failed to parse the message.");
                }
                r9.A01(i, r4);
                return i4;
            } else if (i5 == 5) {
                r9.A01(i, Integer.valueOf(AnonymousClass6C7.A0B(bArr, i2)));
                return i2 + 4;
            }
        }
        throw new C140566tx("Protocol message contained an invalid tag (zero).");
    }

    public static int A01(C148847Jy r2, byte[] bArr, int i) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return A04(r2, bArr, b, i2);
        }
        r2.A00 = b;
        return i2;
    }

    public static int A02(C148847Jy r8, byte[] bArr, int i) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            r8.A01 = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            b = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b & Byte.MAX_VALUE)) << i4;
            i3++;
        }
        r8.A01 = j2;
        return i3;
    }

    public static int A04(C148847Jy r4, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = i & 127;
        int i7 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            i5 = b << 7;
        } else {
            int i8 = i6 | ((b & Byte.MAX_VALUE) << 7);
            int i9 = i7 + 1;
            byte b2 = bArr[i7];
            if (b2 >= 0) {
                i4 = b2 << 14;
            } else {
                i6 = i8 | ((b2 & Byte.MAX_VALUE) << 14);
                i7 = i9 + 1;
                byte b3 = bArr[i9];
                if (b3 >= 0) {
                    i5 = b3 << 21;
                } else {
                    i8 = i6 | ((b3 & Byte.MAX_VALUE) << 21);
                    i9 = i7 + 1;
                    byte b4 = bArr[i7];
                    if (b4 >= 0) {
                        i4 = b4 << 28;
                    } else {
                        i3 = i8 | ((b4 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            i7 = i9 + 1;
                            if (bArr[i9] >= 0) {
                                break;
                            }
                            i9 = i7;
                        }
                        r4.A00 = i3;
                        return i7;
                    }
                }
            }
            r4.A00 = i8 | i4;
            return i9;
        }
        i3 = i6 | i5;
        r4.A00 = i3;
        return i7;
    }

    public static int A03(C148847Jy r4, byte[] bArr, int i) {
        int A01 = A01(r4, bArr, i);
        int i2 = r4.A00;
        if (i2 == 0) {
            r4.A02 = C172528Lo.A00;
            return A01;
        }
        r4.A02 = new C128286Vm(C172528Lo.A01.Bts(bArr, A01, i2));
        return A01 + i2;
    }
}
