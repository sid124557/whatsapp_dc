package X;

import java.lang.reflect.Array;

/* renamed from: X.8Qu  reason: invalid class name and case insensitive filesystem */
public class C173588Qu implements C184668sK, C188608zC {
    public static final byte[] A0I = {0, -1, 0, -1, 0, -1, 0, -1, -1, 0, -1, 0, -1, 0, -1, 0, 0, -1, -1, 0, -1, 0, 0, -1, -1, 0, 0, 0, -1, -1, 0, -1};
    public int A00;
    public long A01;
    public C185768uD A02;
    public byte[] A03 = new byte[32];
    public byte[] A04;
    public byte[] A05 = new byte[32];
    public byte[] A06 = new byte[32];
    public byte[] A07;
    public byte[] A08 = new byte[32];
    public byte[] A09;
    public byte[] A0A;
    public byte[] A0B;
    public byte[] A0C;
    public byte[] A0D;
    public byte[] A0E;
    public short[] A0F;
    public short[] A0G;
    public byte[][] A0H;

    public void A01(byte[] bArr) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4 = this.A06;
        System.arraycopy(bArr, 0, bArr4, 0, 32);
        byte[] bArr5 = this.A03;
        byte[] bArr6 = this.A09;
        System.arraycopy(bArr5, 0, bArr6, 0, 32);
        System.arraycopy(bArr4, 0, this.A0A, 0, 32);
        int i = 0;
        do {
            bArr2 = this.A0B;
            AnonymousClass6CA.A0e(bArr6[i], bArr2, this.A0A[i], i);
            i++;
        } while (i < 32);
        int i2 = 0;
        do {
            bArr3 = this.A04;
            int i3 = i2 * 4;
            AnonymousClass6CA.A0g(bArr2, bArr3, i2, i3);
            AnonymousClass6CA.A0g(bArr2, bArr3, i2 + 8, i3 + 1);
            AnonymousClass6CA.A0g(bArr2, bArr3, i2 + 16, i3 + 2);
            AnonymousClass6CA.A0g(bArr2, bArr3, i2 + 24, i3 + 3);
            i2++;
        } while (i2 < 8);
        byte[] bArr7 = this.A07;
        C185768uD r9 = this.A02;
        r9.BFw(new AnonymousClass8QN(bArr3), true);
        r9.Bha(bArr5, bArr7, 0, 0);
        int i4 = 1;
        do {
            A02(bArr6);
            int i5 = 0;
            do {
                AnonymousClass6CA.A0e(bArr6[i5], bArr6, this.A0H[i4][i5], i5);
                i5++;
            } while (i5 < 32);
            byte[] bArr8 = this.A0A;
            A02(bArr8);
            A02(bArr8);
            this.A0A = bArr8;
            int i6 = 0;
            do {
                AnonymousClass6CA.A0e(bArr6[i6], bArr2, bArr8[i6], i6);
                i6++;
            } while (i6 < 32);
            int i7 = 0;
            do {
                int i8 = i7 * 4;
                AnonymousClass6CA.A0g(bArr2, bArr3, i7, i8);
                AnonymousClass6CA.A0g(bArr2, bArr3, i7 + 8, i8 + 1);
                AnonymousClass6CA.A0g(bArr2, bArr3, i7 + 16, i8 + 2);
                AnonymousClass6CA.A0g(bArr2, bArr3, i7 + 24, i8 + 3);
                i7++;
            } while (i7 < 8);
            int i9 = i4 * 8;
            r9.BFw(new AnonymousClass8QN(bArr3), true);
            r9.Bha(bArr5, bArr7, i9, i9);
            i4++;
        } while (i4 < 4);
        int i10 = 0;
        do {
            A03(bArr7);
            i10++;
        } while (i10 < 12);
        int i11 = 0;
        do {
            AnonymousClass6C8.A1J(bArr7, bArr4, i11);
            i11++;
        } while (i11 < 32);
        A03(bArr7);
        int i12 = 0;
        do {
            AnonymousClass6CA.A0e(bArr5[i12], bArr7, bArr7[i12], i12);
            i12++;
        } while (i12 < 32);
        int i13 = 0;
        do {
            A03(bArr7);
            i13++;
        } while (i13 < 61);
        System.arraycopy(bArr7, 0, bArr5, 0, bArr5.length);
    }

    public final void A02(byte[] bArr) {
        byte[] bArr2;
        int i = 0;
        do {
            bArr2 = this.A0C;
            AnonymousClass6C7.A1T(bArr, bArr2, i + 8, bArr[i], i);
            i++;
        } while (i < 8);
        System.arraycopy(bArr, 8, bArr, 0, 24);
        System.arraycopy(bArr2, 0, bArr, 24, 8);
    }

    public static void A00(C173588Qu r3, int[] iArr) {
        r3.A0H = (byte[][]) Array.newInstance(Byte.TYPE, iArr);
        r3.A0E = new byte[32];
        r3.A02 = new AnonymousClass8QF();
        r3.A04 = new byte[32];
        r3.A0C = new byte[8];
        r3.A0F = new short[16];
        r3.A0G = new short[16];
        r3.A07 = new byte[32];
        r3.A09 = new byte[32];
        r3.A0A = new byte[32];
        r3.A0B = new byte[32];
    }

    public final void A03(byte[] bArr) {
        int length;
        short[] sArr = this.A0F;
        int i = 0;
        while (true) {
            length = bArr.length / 2;
            if (i >= length) {
                break;
            }
            int i2 = i * 2;
            sArr[i] = (short) AnonymousClass6CA.A0B(bArr, i2, (bArr[i2 + 1] << 8) & 65280);
            i++;
        }
        short[] sArr2 = this.A0G;
        sArr2[15] = (short) (((((sArr[0] ^ sArr[1]) ^ sArr[2]) ^ sArr[3]) ^ sArr[12]) ^ sArr[15]);
        System.arraycopy(sArr, 1, sArr2, 0, 15);
        int i3 = 0;
        while (i3 < length) {
            int i4 = i3 * 2;
            short s = sArr2[i3];
            bArr[i4 + 1] = (byte) (s >> 8);
            i3 = AnonymousClass6CA.A0D(bArr, s, i4, i3);
        }
    }

    public C184668sK Azm() {
        return new C173588Qu(this);
    }

    public int B24(byte[] bArr, int i) {
        byte[] bArr2 = this.A05;
        C161817qb.A04(bArr2, 0, this.A01 * 8);
        while (this.A00 != 0) {
            BrT((byte) 0);
        }
        A01(bArr2);
        A01(this.A08);
        byte[] bArr3 = this.A03;
        System.arraycopy(bArr3, 0, bArr, i, bArr3.length);
        reset();
        return 32;
    }

    public String B4N() {
        return "GOST3411";
    }

    public int B51() {
        return 32;
    }

    public int B74() {
        return 32;
    }

    public void Bjv(C184668sK r8) {
        C173588Qu r82 = (C173588Qu) r8;
        byte[] bArr = r82.A0D;
        this.A0D = bArr;
        this.A02.BFw(new AnonymousClass8QH(bArr), true);
        reset();
        byte[] bArr2 = r82.A03;
        System.arraycopy(bArr2, 0, this.A03, 0, bArr2.length);
        byte[] bArr3 = r82.A05;
        System.arraycopy(bArr3, 0, this.A05, 0, bArr3.length);
        byte[] bArr4 = r82.A06;
        System.arraycopy(bArr4, 0, this.A06, 0, bArr4.length);
        byte[] bArr5 = r82.A08;
        System.arraycopy(bArr5, 0, this.A08, 0, bArr5.length);
        byte[][] bArr6 = r82.A0H;
        byte[] bArr7 = bArr6[1];
        byte[][] bArr8 = this.A0H;
        System.arraycopy(bArr7, 0, bArr8[1], 0, bArr7.length);
        byte[] bArr9 = bArr6[2];
        System.arraycopy(bArr9, 0, bArr8[2], 0, bArr9.length);
        byte[] bArr10 = bArr6[3];
        System.arraycopy(bArr10, 0, bArr8[3], 0, bArr10.length);
        byte[] bArr11 = r82.A0E;
        System.arraycopy(bArr11, 0, this.A0E, 0, bArr11.length);
        this.A00 = r82.A00;
        this.A01 = r82.A01;
    }

    public void BrT(byte b) {
        byte[] bArr = this.A0E;
        int i = this.A00;
        int i2 = i + 1;
        this.A00 = i2;
        bArr[i] = b;
        if (i2 == bArr.length) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                byte[] bArr2 = this.A08;
                if (i3 == bArr2.length) {
                    break;
                }
                int i5 = (bArr2[i3] & 255) + (bArr[i3] & 255) + i4;
                bArr2[i3] = (byte) i5;
                i4 = i5 >>> 8;
                i3++;
            }
            A01(bArr);
            this.A00 = 0;
        }
        this.A01++;
    }

    public void reset() {
        byte[][] bArr;
        this.A01 = 0;
        this.A00 = 0;
        int i = 0;
        while (true) {
            byte[] bArr2 = this.A03;
            if (i >= bArr2.length) {
                break;
            }
            bArr2[i] = 0;
            i++;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr3 = this.A05;
            if (i2 >= bArr3.length) {
                break;
            }
            bArr3[i2] = 0;
            i2++;
        }
        int i3 = 0;
        while (true) {
            byte[] bArr4 = this.A06;
            if (i3 >= bArr4.length) {
                break;
            }
            bArr4[i3] = 0;
            i3++;
        }
        int i4 = 0;
        while (true) {
            bArr = this.A0H;
            byte[] bArr5 = bArr[1];
            if (i4 >= bArr5.length) {
                break;
            }
            bArr5[i4] = 0;
            i4++;
        }
        int i5 = 0;
        while (true) {
            byte[] bArr6 = bArr[3];
            if (i5 >= bArr6.length) {
                break;
            }
            bArr6[i5] = 0;
            i5++;
        }
        int i6 = 0;
        while (true) {
            byte[] bArr7 = this.A08;
            if (i6 >= bArr7.length) {
                break;
            }
            bArr7[i6] = 0;
            i6++;
        }
        int i7 = 0;
        while (true) {
            byte[] bArr8 = this.A0E;
            if (i7 < bArr8.length) {
                bArr8[i7] = 0;
                i7++;
            } else {
                byte[] bArr9 = A0I;
                System.arraycopy(bArr9, 0, bArr[2], 0, bArr9.length);
                return;
            }
        }
    }

    public void update(byte[] bArr, int i, int i2) {
        while (this.A00 != 0 && i2 > 0) {
            BrT(bArr[i]);
            i++;
            i2--;
        }
        while (true) {
            byte[] bArr2 = this.A0E;
            int length = bArr2.length;
            if (i2 <= length) {
                break;
            }
            System.arraycopy(bArr, i, bArr2, 0, length);
            int i3 = 0;
            int i4 = 0;
            while (true) {
                byte[] bArr3 = this.A08;
                if (i3 == bArr3.length) {
                    break;
                }
                int i5 = (bArr3[i3] & 255) + (bArr2[i3] & 255) + i4;
                bArr3[i3] = (byte) i5;
                i4 = i5 >>> 8;
                i3++;
            }
            A01(bArr2);
            i += length;
            i2 -= length;
            this.A01 += (long) length;
        }
        while (i2 > 0) {
            BrT(bArr[i]);
            i++;
            i2--;
        }
    }

    public C173588Qu(C173588Qu r3) {
        int[] A1Z = C86664Kz.A1Z();
        // fill-array-data instruction
        A1Z[0] = 4;
        A1Z[1] = 32;
        A00(this, A1Z);
        Bjv(r3);
    }

    public C173588Qu() {
        int[] A1Z = C86664Kz.A1Z();
        // fill-array-data instruction
        A1Z[0] = 4;
        A1Z[1] = 32;
        A00(this, A1Z);
        byte[] bArr = (byte[]) AnonymousClass8QF.A03.get(C162077rB.A01("D-A"));
        if (bArr != null) {
            byte[] A022 = C161007oo.A02(bArr);
            this.A0D = A022;
            this.A02.BFw(new AnonymousClass8QH(A022), true);
            reset();
            return;
        }
        throw AnonymousClass001.A0c("Unknown S-Box - possible types: \"Default\", \"E-Test\", \"E-A\", \"E-B\", \"E-C\", \"E-D\", \"Param-Z\", \"D-Test\", \"D-A\".");
    }
}
