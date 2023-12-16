package X;

/* renamed from: X.8Qa  reason: invalid class name and case insensitive filesystem */
public class C173398Qa implements C185538tq {
    public C185768uD A00;
    public AnonymousClass8QN A01;
    public boolean A02;
    public byte[] A03 = null;
    public byte[] A04;
    public byte[] A05;

    public byte[] BsY(byte[] bArr, int i, int i2) {
        if (this.A02) {
            byte[] bArr2 = new byte[8];
            byte[] bArr3 = new byte[4];
            int i3 = i2;
            C161817qb.A02(bArr3, i3, 0);
            byte[] bArr4 = this.A05;
            int i4 = 0;
            System.arraycopy(bArr4, 0, bArr2, 0, bArr4.length);
            System.arraycopy(bArr3, 0, bArr2, this.A05.length, 4);
            byte[] bArr5 = new byte[i3];
            System.arraycopy(bArr, 0, bArr5, 0, i3);
            int i5 = (8 - (i2 % 8)) % 8;
            int i6 = i2 + i5;
            byte[] bArr6 = new byte[i6];
            System.arraycopy(bArr5, 0, bArr6, 0, i3);
            if (i5 != 0) {
                System.arraycopy(new byte[i5], 0, bArr6, i3, i5);
            }
            if (i6 == 8) {
                byte[] bArr7 = new byte[16];
                System.arraycopy(bArr2, 0, bArr7, 0, 8);
                System.arraycopy(bArr6, 0, bArr7, 8, i6);
                C185768uD r1 = this.A00;
                r1.BFw(this.A01, true);
                do {
                    r1.Bha(bArr7, bArr7, i4, i4);
                    i4 += r1.B4g();
                } while (i4 < 16);
                return bArr7;
            }
            C185768uD r11 = this.A00;
            AnonymousClass8QP r0 = new AnonymousClass8QP(this.A01, bArr2);
            byte[] bArr8 = r0.A01;
            C834748n r12 = r0.A00;
            int length = bArr8.length;
            if (length == 8) {
                int i7 = i6 / 8;
                if (i7 * 8 == i6) {
                    byte[] bArr9 = new byte[(i6 + 8)];
                    byte[] bArr10 = new byte[16];
                    System.arraycopy(bArr8, 0, bArr9, 0, length);
                    System.arraycopy(bArr6, 0, bArr9, length, i6);
                    r11.BFw(r12, true);
                    int i8 = 0;
                    do {
                        for (int i9 = 1; i9 <= i7; i9++) {
                            System.arraycopy(bArr9, 0, bArr10, 0, length);
                            int i10 = i9 * 8;
                            System.arraycopy(bArr9, i10, bArr10, length, 8);
                            r11.Bha(bArr10, bArr10, 0, 0);
                            int i11 = (i7 * i8) + i9;
                            int i12 = 1;
                            while (i11 != 0) {
                                int i13 = length - i12;
                                AnonymousClass6CA.A0e((byte) i11, bArr10, bArr10[i13], i13);
                                i11 >>>= 8;
                                i12++;
                            }
                            System.arraycopy(bArr10, 0, bArr9, 0, 8);
                            System.arraycopy(bArr10, 8, bArr9, i10, 8);
                        }
                        i8++;
                    } while (i8 != 6);
                    return bArr9;
                }
                throw new C177248eJ("wrap data must be a multiple of 8 bytes");
            }
            throw AnonymousClass001.A0c("IV not equal to 8");
        }
        throw AnonymousClass001.A0e("not set for wrapping");
    }

    public String B4N() {
        return this.A00.B4N();
    }

    public void BFw(C834748n r3, boolean z) {
        this.A02 = z;
        if (r3 instanceof AnonymousClass8QJ) {
            r3 = ((AnonymousClass8QJ) r3).A01;
        }
        if (r3 instanceof AnonymousClass8QN) {
            this.A01 = (AnonymousClass8QN) r3;
            this.A05 = this.A04;
        } else if (r3 instanceof AnonymousClass8QP) {
            AnonymousClass8QP r32 = (AnonymousClass8QP) r3;
            byte[] bArr = r32.A01;
            this.A05 = bArr;
            this.A01 = (AnonymousClass8QN) r32.A00;
            if (bArr.length != 4) {
                throw AnonymousClass001.A0c("IV length not equal to 4");
            }
        }
    }

    public byte[] BrR(byte[] bArr, int i, int i2) {
        byte[] bArr2;
        int i3 = i2;
        if (!this.A02) {
            int i4 = i2 / 8;
            if (i4 * 8 != i3) {
                throw new C177188eD("unwrap data must be a multiple of 8 bytes");
            } else if (i4 > 1) {
                byte[] bArr3 = new byte[i3];
                byte[] bArr4 = bArr;
                System.arraycopy(bArr4, 0, bArr3, 0, i3);
                byte[] bArr5 = new byte[i3];
                if (i4 == 2) {
                    C185768uD r2 = this.A00;
                    r2.BFw(this.A01, false);
                    for (int i5 = 0; i5 < i3; i5 += r2.B4g()) {
                        r2.Bha(bArr3, bArr5, i5, i5);
                    }
                    byte[] bArr6 = new byte[8];
                    this.A03 = bArr6;
                    System.arraycopy(bArr5, 0, bArr6, 0, 8);
                    int length = this.A03.length;
                    int i6 = i2 - length;
                    bArr2 = new byte[i6];
                    System.arraycopy(bArr5, length, bArr2, 0, i6);
                } else {
                    int i7 = i2 - 8;
                    bArr2 = new byte[i7];
                    byte[] bArr7 = new byte[8];
                    byte[] bArr8 = new byte[16];
                    System.arraycopy(bArr4, 0, bArr7, 0, 8);
                    System.arraycopy(bArr4, 8, bArr2, 0, i7);
                    C185768uD r13 = this.A00;
                    r13.BFw(this.A01, false);
                    int i8 = (i2 / 8) - 1;
                    int i9 = 5;
                    do {
                        for (int i10 = i8; i10 >= 1; i10--) {
                            System.arraycopy(bArr7, 0, bArr8, 0, 8);
                            int i11 = (i10 - 1) * 8;
                            System.arraycopy(bArr2, i11, bArr8, 8, 8);
                            int i12 = (i8 * i9) + i10;
                            int i13 = 1;
                            while (i12 != 0) {
                                int i14 = 8 - i13;
                                AnonymousClass6CA.A0e((byte) i12, bArr8, bArr8[i14], i14);
                                i12 >>>= 8;
                                i13++;
                            }
                            r13.Bha(bArr8, bArr8, 0, 0);
                            System.arraycopy(bArr8, 0, bArr7, 0, 8);
                            System.arraycopy(bArr8, 8, bArr2, i11, 8);
                        }
                        i9--;
                    } while (i9 >= 0);
                    this.A03 = bArr7;
                }
                int i15 = 4;
                byte[] bArr9 = new byte[4];
                byte[] bArr10 = new byte[4];
                System.arraycopy(this.A03, 0, bArr9, 0, 4);
                System.arraycopy(this.A03, 4, bArr10, 0, 4);
                int A0E = AnonymousClass6C7.A0E(bArr10, bArr10[0] << 24, (bArr10[1] & 255) << 16, 1);
                boolean A012 = C161007oo.A01(bArr9, this.A05);
                int length2 = bArr2.length;
                if (A0E <= length2 - 8) {
                    A012 = false;
                }
                if (A0E > length2) {
                    A012 = false;
                }
                int i16 = length2 - A0E;
                if (i16 >= 8 || i16 < 0) {
                    A012 = false;
                } else {
                    i15 = i16;
                }
                byte[] bArr11 = new byte[i15];
                System.arraycopy(bArr2, length2 - i15, bArr11, 0, i15);
                if (!C161007oo.A01(bArr11, new byte[i15]) || !A012) {
                    throw new C177188eD("checksum failed");
                }
                byte[] bArr12 = new byte[A0E];
                System.arraycopy(bArr2, 0, bArr12, 0, A0E);
                return bArr12;
            } else {
                throw new C177188eD("unwrap data must be at least 16 bytes");
            }
        } else {
            throw AnonymousClass001.A0e("not set for unwrapping");
        }
    }

    public C173398Qa(C185768uD r2) {
        byte[] bArr = {-90, 89, 89, -90};
        this.A04 = bArr;
        this.A05 = bArr;
        this.A00 = r2;
    }
}
