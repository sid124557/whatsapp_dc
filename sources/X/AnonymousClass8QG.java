package X;

/* renamed from: X.8QG  reason: invalid class name */
public abstract class AnonymousClass8QG implements C185768uD, C180088kT {
    public final C185768uD A00;

    public byte A00(byte b) {
        byte[] bArr;
        byte b2;
        int i;
        int i2;
        byte[] bArr2;
        byte b3;
        int i3;
        byte[] bArr3;
        byte b4;
        if (this instanceof C177308eP) {
            C177308eP r7 = (C177308eP) this;
            int i4 = r7.A00;
            if (i4 == 0) {
                C185768uD r1 = r7.A05;
                byte[] bArr4 = r7.A02;
                byte[] bArr5 = r7.A03;
                r1.Bha(bArr4, bArr5, 0, 0);
                int i5 = r7.A00;
                r7.A00 = i5 + 1;
                return (byte) (b ^ bArr5[i5]);
            }
            byte[] bArr6 = r7.A03;
            int i6 = i4 + 1;
            r7.A00 = i6;
            byte b5 = (byte) (b ^ bArr6[i4]);
            byte[] bArr7 = r7.A02;
            int length = bArr7.length;
            if (i6 != length) {
                return b5;
            }
            r7.A00 = 0;
            do {
                length--;
                if (length < 0) {
                    break;
                }
                b4 = (byte) (bArr7[length] + 1);
                bArr7[length] = b4;
            } while (b4 == 0);
            byte[] bArr8 = r7.A01;
            int length2 = bArr8.length;
            if (length2 >= r7.A04) {
                return b5;
            }
            int i7 = 0;
            while (i7 != length2) {
                if (bArr7[i7] == bArr8[i7]) {
                    i7++;
                } else {
                    throw AnonymousClass001.A0e("Counter in CTR/SIC mode out of range.");
                }
            }
            return b5;
        }
        if (this instanceof C177268eL) {
            C177268eL r72 = (C177268eL) this;
            i2 = 0;
            if (r72.A00 == 0) {
                r72.A05.Bha(r72.A03, r72.A02, 0, 0);
            }
            bArr2 = r72.A02;
            int i8 = r72.A00;
            int i9 = i8 + 1;
            r72.A00 = i9;
            b3 = (byte) (b ^ bArr2[i8]);
            i3 = r72.A04;
            if (i9 != i3) {
                return b3;
            }
            r72.A00 = 0;
            bArr3 = r72.A03;
        } else if (this instanceof C177288eN) {
            C177288eN r2 = (C177288eN) this;
            i2 = 0;
            if (r2.A02 == 0) {
                if (r2.A03) {
                    r2.A03 = false;
                    C185768uD r12 = r2.A08;
                    byte[] bArr9 = r2.A06;
                    byte[] bArr10 = r2.A05;
                    r12.Bha(bArr9, bArr10, 0, 0);
                    r2.A00 = ((bArr10[3] << 24) & -16777216) + ((bArr10[2] << 16) & 16711680) + ((bArr10[1] << 8) & 65280) + (bArr10[0] & 255);
                    r2.A01 = ((bArr10[7] << 24) & -16777216) + ((bArr10[6] << 16) & 16711680) + ((bArr10[5] << 8) & 65280) + (bArr10[4] & 255);
                }
                int i10 = r2.A00 + 16843009;
                r2.A00 = i10;
                int i11 = r2.A01 + 16843012;
                r2.A01 = i11;
                if (i11 < 16843012 && i11 > 0) {
                    i11++;
                    r2.A01 = i11;
                }
                byte[] bArr11 = r2.A06;
                bArr11[3] = (byte) (i10 >>> 24);
                bArr11[2] = (byte) (i10 >>> 16);
                AnonymousClass6CA.A0f(bArr11, i10, 1);
                bArr11[0] = (byte) i10;
                bArr11[7] = (byte) (i11 >>> 24);
                bArr11[6] = (byte) (i11 >>> 16);
                AnonymousClass6CA.A0f(bArr11, i11, 5);
                bArr11[4] = (byte) i11;
                r2.A08.Bha(bArr11, r2.A05, 0, 0);
            }
            bArr2 = r2.A05;
            int i12 = r2.A02;
            int i13 = i12 + 1;
            r2.A02 = i13;
            b3 = (byte) (b ^ bArr2[i12]);
            i3 = r2.A07;
            if (i13 != i3) {
                return b3;
            }
            r2.A02 = 0;
            bArr3 = r2.A06;
        } else if (this instanceof C177298eO) {
            C177298eO r4 = (C177298eO) this;
            long j = r4.A00;
            if (j > 0 && j % 1024 == 0) {
                C177278eM r5 = r4.A03;
                C185768uD r73 = r5.A00;
                r73.BFw(r4.A01, false);
                byte[] bArr12 = new byte[32];
                byte[] bArr13 = C177298eO.A04;
                r73.Bha(bArr13, bArr12, 0, 0);
                r73.Bha(bArr13, bArr12, 8, 8);
                r73.Bha(bArr13, bArr12, 16, 16);
                r73.Bha(bArr13, bArr12, 24, 24);
                AnonymousClass8QN r13 = new AnonymousClass8QN(bArr12);
                r4.A01 = r13;
                r73.BFw(r13, true);
                byte[] A02 = C161007oo.A02(r5.A06);
                r73.Bha(A02, A02, 0, 0);
                r5.BFw(new AnonymousClass8QP(r4.A01, A02), r4.A02);
            }
            r4.A00++;
            return r4.A03.A00(b);
        } else {
            C177278eM r52 = (C177278eM) this;
            boolean z = r52.A03;
            int i14 = r52.A01;
            if (z) {
                if (i14 == 0) {
                    r52.A02.Bha(r52.A06, r52.A05, 0, 0);
                }
                byte[] bArr14 = r52.A05;
                int i15 = r52.A01;
                b2 = (byte) (b ^ bArr14[i15]);
                bArr = r52.A07;
                int i16 = i15 + 1;
                r52.A01 = i16;
                bArr[i15] = b2;
                i = r52.A00;
                if (i16 != i) {
                    return b2;
                }
            } else {
                if (i14 == 0) {
                    r52.A02.Bha(r52.A06, r52.A05, 0, 0);
                }
                bArr = r52.A07;
                int i17 = r52.A01;
                bArr[i17] = b;
                byte[] bArr15 = r52.A05;
                int i18 = i17 + 1;
                r52.A01 = i18;
                b2 = (byte) (b ^ bArr15[i17]);
                i = r52.A00;
                if (i18 != i) {
                    return b2;
                }
            }
            r52.A01 = 0;
            byte[] bArr16 = r52.A06;
            int length3 = bArr16.length - i;
            System.arraycopy(bArr16, i, bArr16, 0, length3);
            System.arraycopy(bArr, 0, bArr16, length3, i);
            return b2;
        }
        int length4 = bArr3.length - i3;
        System.arraycopy(bArr3, i3, bArr3, i2, length4);
        System.arraycopy(bArr2, i2, bArr3, length4, i3);
        return b3;
    }

    public void A01(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        int i4 = i + i2;
        if (i4 > bArr.length) {
            throw new C177248eJ("input buffer too small");
        } else if (i3 + i2 > bArr2.length) {
            throw C177198eE.A00();
        } else {
            while (i < i4) {
                bArr2[i3] = A00(bArr[i]);
                i3++;
                i++;
            }
        }
    }

    public AnonymousClass8QG(C185768uD r1) {
        this.A00 = r1;
    }
}
