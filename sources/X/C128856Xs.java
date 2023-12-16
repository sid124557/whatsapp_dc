package X;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.6Xs  reason: invalid class name and case insensitive filesystem */
public final class C128856Xs extends AnonymousClass72Z {
    public static final Logger A04 = AnonymousClass6C8.A0m(C128856Xs.class);
    public static final boolean A05 = C162367ro.A06;
    public int A00;
    public AnonymousClass8B0 A01;
    public final int A02;
    public final byte[] A03;

    public static int A02(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        if ((j & -16384) != 0) {
            return i + 1;
        }
        return i;
    }

    public final void A04(byte b) {
        try {
            byte[] bArr = this.A03;
            int i = this.A00;
            this.A00 = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            Object[] A1X = AnonymousClass0x9.A1X();
            AnonymousClass000.A1L(A1X, this.A00);
            throw new AnonymousClass6u8(AnonymousClass6C7.A0g(this.A02, A1X), e);
        }
    }

    public final void A05(int i) {
        long j;
        byte b;
        if (A05 && !C155367ek.A00()) {
            int i2 = this.A02;
            int i3 = this.A00;
            if (i2 - i3 >= 5) {
                int i4 = i & -128;
                byte[] bArr = this.A03;
                this.A00 = i3 + 1;
                if (i4 == 0) {
                    j = (long) i3;
                    b = (byte) i;
                } else {
                    C162367ro.A08(bArr, (byte) (i | 128), (long) i3);
                    int i5 = i >>> 7;
                    if ((i5 & -128) != 0) {
                        int i6 = this.A00;
                        this.A00 = i6 + 1;
                        C162367ro.A08(bArr, (byte) (i5 | 128), (long) i6);
                        i5 >>>= 7;
                        if ((i5 & -128) != 0) {
                            int i7 = this.A00;
                            this.A00 = i7 + 1;
                            C162367ro.A08(bArr, (byte) (i5 | 128), (long) i7);
                            i5 >>>= 7;
                            if ((i5 & -128) != 0) {
                                int i8 = this.A00;
                                this.A00 = i8 + 1;
                                C162367ro.A08(bArr, (byte) (i5 | 128), (long) i8);
                                i5 >>>= 7;
                            }
                        }
                    }
                    int i9 = this.A00;
                    this.A00 = i9 + 1;
                    j = (long) i9;
                    b = (byte) i5;
                }
                C162367ro.A08(bArr, b, j);
                return;
            }
        }
        while ((i & -128) != 0) {
            try {
                byte[] bArr2 = this.A03;
                int i10 = this.A00;
                this.A00 = i10 + 1;
                AnonymousClass6C9.A1H(bArr2, i, i10);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                Object[] A1X = AnonymousClass0x9.A1X();
                AnonymousClass000.A1L(A1X, this.A00);
                throw new AnonymousClass6u8(AnonymousClass6C7.A0g(this.A02, A1X), e);
            }
        }
        byte[] bArr3 = this.A03;
        int i11 = this.A00;
        this.A00 = i11 + 1;
        bArr3[i11] = (byte) i;
    }

    public final void A06(int i) {
        try {
            byte[] bArr = this.A03;
            int A0D = AnonymousClass6C7.A0D(bArr, this.A00, i);
            this.A00 = A0D + 1;
            bArr[A0D] = (byte) (i >>> 24);
        } catch (IndexOutOfBoundsException e) {
            Object[] A1X = AnonymousClass0x9.A1X();
            AnonymousClass000.A1L(A1X, this.A00);
            throw new AnonymousClass6u8(AnonymousClass6C7.A0g(this.A02, A1X), e);
        }
    }

    public final void A07(int i, int i2) {
        A05(i << 3);
        if (i2 >= 0) {
            A05(i2);
        } else {
            A09((long) i2);
        }
    }

    public final void A09(long j) {
        if (!A05 || this.A02 - this.A00 < 10) {
            while ((j & -128) != 0) {
                try {
                    byte[] bArr = this.A03;
                    int i = this.A00;
                    this.A00 = i + 1;
                    AnonymousClass6C9.A1H(bArr, (int) j, i);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    Object[] A1X = AnonymousClass0x9.A1X();
                    AnonymousClass000.A1L(A1X, this.A00);
                    throw new AnonymousClass6u8(AnonymousClass6C7.A0g(this.A02, A1X), e);
                }
            }
            byte[] bArr2 = this.A03;
            int i2 = this.A00;
            this.A00 = i2 + 1;
            bArr2[i2] = (byte) ((int) j);
            return;
        }
        while (true) {
            int i3 = ((j & -128) > 0 ? 1 : ((j & -128) == 0 ? 0 : -1));
            byte[] bArr3 = this.A03;
            int i4 = this.A00;
            this.A00 = i4 + 1;
            long j2 = (long) i4;
            int i5 = (int) j;
            if (i3 == 0) {
                C162367ro.A08(bArr3, (byte) i5, j2);
                return;
            } else {
                C162367ro.A08(bArr3, (byte) ((i5 & 127) | 128), j2);
                j >>>= 7;
            }
        }
    }

    public final void A0A(long j) {
        try {
            byte[] bArr = this.A03;
            int i = this.A00;
            int i2 = i + 1;
            int A0D = AnonymousClass6CA.A0D(bArr, (int) j, i, i2);
            AnonymousClass6C7.A0x(j, bArr, 8, i2);
            int i3 = A0D + 1;
            AnonymousClass6C7.A0x(j, bArr, 16, A0D);
            int i4 = i3 + 1;
            AnonymousClass6C7.A0x(j, bArr, 24, i3);
            int i5 = i4 + 1;
            AnonymousClass6C7.A0x(j, bArr, 32, i4);
            int i6 = i5 + 1;
            AnonymousClass6C7.A0x(j, bArr, 40, i5);
            int i7 = i6 + 1;
            AnonymousClass6C7.A0x(j, bArr, 48, i6);
            this.A00 = i7 + 1;
            AnonymousClass6C7.A0x(j, bArr, 56, i7);
        } catch (IndexOutOfBoundsException e) {
            Object[] A1X = AnonymousClass0x9.A1X();
            AnonymousClass000.A1L(A1X, this.A00);
            throw new AnonymousClass6u8(AnonymousClass6C7.A0g(this.A02, A1X), e);
        }
    }

    public final void A0C(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.A03, this.A00, i2);
            this.A00 += i2;
        } catch (IndexOutOfBoundsException e) {
            Object[] A1X = AnonymousClass0x9.A1X();
            AnonymousClass000.A1L(A1X, this.A00);
            AnonymousClass000.A1M(A1X, this.A02);
            AnonymousClass000.A1P(A1X, i2, 2);
            throw new AnonymousClass6u8(String.format("Pos: %d, limit: %d, len: %d", A1X), e);
        }
    }

    public C128856Xs(byte[] bArr, int i) {
        int length = bArr.length;
        if ((i | (length - i)) >= 0) {
            this.A03 = bArr;
            this.A00 = 0;
            this.A02 = i;
            return;
        }
        Object[] A1X = AnonymousClass0x9.A1X();
        AnonymousClass000.A1P(A1X, length, 0);
        AnonymousClass6C7.A1U(A1X, 0, i);
        throw AnonymousClass6C7.A0W("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", A1X);
    }

    public static int A00(int i) {
        return AnonymousClass6C7.A00(i);
    }

    public static int A01(int i, String str) {
        int i2;
        int A042 = AnonymousClass72Z.A04(i);
        try {
            i2 = C154937dz.A00(str);
        } catch (C143976zn unused) {
            i2 = str.getBytes(C155597fA.A02).length;
        }
        return A042 + AnonymousClass6C7.A00(i2) + i2;
    }

    public static int A03(C172538Lp r1, int i) {
        int A042 = AnonymousClass72Z.A04(i);
        int A012 = r1.A01();
        return A042 + AnonymousClass6C7.A00(A012) + A012;
    }

    public final void A08(int i, String str) {
        int A002;
        AnonymousClass72Z.A07(this, i);
        int i2 = this.A00;
        try {
            int length = str.length();
            int A003 = AnonymousClass6C7.A00(length * 3);
            int A004 = AnonymousClass6C7.A00(length);
            if (A004 == A003) {
                int i3 = i2 + A004;
                this.A00 = i3;
                A002 = C154937dz.A00.A00(str, this.A03, i3, this.A02 - i3);
                this.A00 = i2;
                A05((A002 - i2) - A004);
            } else {
                A05(C154937dz.A00(str));
                byte[] bArr = this.A03;
                int i4 = this.A00;
                A002 = C154937dz.A00.A00(str, bArr, i4, this.A02 - i4);
            }
            this.A00 = A002;
        } catch (C143976zn e) {
            this.A00 = i2;
            A04.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", e);
            byte[] bytes = str.getBytes(C155597fA.A02);
            try {
                int length2 = bytes.length;
                A05(length2);
                A0C(bytes, 0, length2);
            } catch (IndexOutOfBoundsException e2) {
                throw new AnonymousClass6u8(e2);
            } catch (AnonymousClass6u8 e3) {
                throw e3;
            }
        } catch (IndexOutOfBoundsException e4) {
            throw new AnonymousClass6u8(e4);
        }
    }

    public final void A0B(C172538Lp r4, int i) {
        AnonymousClass72Z.A07(this, i);
        A05(r4.A01());
        C128876Xu r42 = (C128876Xu) r4;
        A0C(r42.zzb, r42.A03(), r42.A01());
    }

    public C128856Xs() {
    }
}
