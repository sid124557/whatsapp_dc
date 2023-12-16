package X;

/* renamed from: X.8Qb  reason: invalid class name and case insensitive filesystem */
public class C173408Qb implements C188618zD {
    public int A00;
    public int A01;
    public C185768uD A02;
    public C834748n A03;
    public C140246tO A04 = new C140246tO(this);
    public C140246tO A05 = new C140246tO(this);
    public boolean A06;
    public byte[] A07;
    public byte[] A08;
    public byte[] A09;

    public int Bhb(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (bArr.length >= i + i2) {
            this.A05.write(bArr, i, i2);
            return 0;
        }
        throw new C177248eJ("Input buffer too short");
    }

    public final void A00(byte[] bArr, byte[] bArr2, int i, int i2) {
        int length;
        int length2;
        int length3;
        int i3;
        int i4 = i;
        int i5 = i2;
        C185768uD r3 = this.A02;
        int i6 = this.A01 * 8;
        if (i6 % 8 == 0) {
            AnonymousClass8QA r9 = new AnonymousClass8QA(r3);
            int i7 = i6 / 8;
            int B4g = r3.B4g();
            byte[] bArr3 = new byte[B4g];
            byte[] bArr4 = new byte[B4g];
            C834748n r2 = this.A03;
            for (int i8 = 0; i8 < B4g; i8++) {
                bArr4[i8] = 0;
            }
            r9.reset();
            r9.BFw(r2, true);
            byte[] bArr5 = new byte[16];
            C140246tO r17 = this.A04;
            int size = r17.size();
            byte[] bArr6 = this.A07;
            if (bArr6 == null) {
                length = 0;
            } else {
                length = bArr6.length;
            }
            if (size + length > 0) {
                bArr5[0] = (byte) (bArr5[0] | 64);
            }
            int i9 = 2;
            byte b = (byte) (bArr5[0] | ((((i7 - 2) / 2) & 7) << 3));
            bArr5[0] = b;
            byte[] bArr7 = this.A09;
            int length4 = bArr7.length;
            AnonymousClass6C8.A0u(b, bArr5, ((15 - length4) - 1) & 7, 0);
            System.arraycopy(bArr7, 0, bArr5, 1, length4);
            int i10 = i5;
            int i11 = 1;
            while (i10 > 0) {
                AnonymousClass6C9.A1G(bArr5, i10, 16 - i11);
                i10 >>>= 8;
                i11++;
            }
            int i12 = 0;
            int i13 = 16;
            int B4g2 = r9.A01.B4g();
            if (16 > B4g2) {
                System.arraycopy(bArr5, 0, bArr4, 0, B4g2);
                r9.Bha(bArr4, bArr3, 0, 0);
                i13 = 16 - B4g2;
                i12 = B4g2;
                while (i13 > B4g2) {
                    r9.Bha(bArr5, bArr3, i12, 0);
                    i13 -= B4g2;
                    i12 += B4g2;
                }
            }
            System.arraycopy(bArr5, i12, bArr4, 0, i13);
            int size2 = r17.size();
            byte[] bArr8 = this.A07;
            if (bArr8 == null) {
                length2 = 0;
            } else {
                length2 = bArr8.length;
            }
            if (size2 + length2 > 0) {
                int size3 = r17.size();
                byte[] bArr9 = this.A07;
                if (bArr9 == null) {
                    length3 = 0;
                } else {
                    length3 = bArr9.length;
                }
                int i14 = size3 + length3;
                if (i14 < 65280) {
                    byte b2 = (byte) (i14 >> 8);
                    if (i13 == B4g) {
                        r9.Bha(bArr4, bArr3, 0, 0);
                        i13 = 0;
                    }
                    int i15 = i13 + 1;
                    bArr4[i13] = b2;
                    byte b3 = (byte) i14;
                    if (i15 == B4g) {
                        r9.Bha(bArr4, bArr3, 0, 0);
                        i15 = 0;
                    }
                    i3 = i15 + 1;
                    bArr4[i15] = b3;
                } else {
                    if (i13 == B4g) {
                        r9.Bha(bArr4, bArr3, 0, 0);
                        i13 = 0;
                    }
                    int i16 = i13 + 1;
                    bArr4[i13] = -1;
                    if (i16 == B4g) {
                        r9.Bha(bArr4, bArr3, 0, 0);
                        i16 = 0;
                    }
                    int i17 = i16 + 1;
                    bArr4[i16] = -2;
                    byte b4 = (byte) (i14 >> 24);
                    if (i17 == B4g) {
                        r9.Bha(bArr4, bArr3, 0, 0);
                        i17 = 0;
                    }
                    int i18 = i17 + 1;
                    bArr4[i17] = b4;
                    byte b5 = (byte) (i14 >> 16);
                    if (i18 == B4g) {
                        r9.Bha(bArr4, bArr3, 0, 0);
                        i18 = 0;
                    }
                    int i19 = i18 + 1;
                    bArr4[i18] = b5;
                    byte b6 = (byte) (i14 >> 8);
                    if (i19 == B4g) {
                        r9.Bha(bArr4, bArr3, 0, 0);
                        i19 = 0;
                    }
                    int i20 = i19 + 1;
                    bArr4[i19] = b6;
                    byte b7 = (byte) i14;
                    if (i20 == B4g) {
                        r9.Bha(bArr4, bArr3, 0, 0);
                        i20 = 0;
                    }
                    i3 = i20 + 1;
                    bArr4[i20] = b7;
                    i9 = 6;
                }
                byte[] bArr10 = this.A07;
                if (bArr10 != null) {
                    int length5 = bArr10.length;
                    int i21 = 0;
                    int i22 = B4g2 - i3;
                    if (length5 > i22) {
                        System.arraycopy(bArr10, 0, bArr4, i3, i22);
                        r9.Bha(bArr4, bArr3, 0, 0);
                        i3 = 0;
                        length5 -= i22;
                        i21 = i22;
                        while (length5 > B4g2) {
                            r9.Bha(bArr10, bArr3, i21, 0);
                            length5 -= B4g2;
                            i21 += B4g2;
                        }
                    }
                    System.arraycopy(bArr10, i21, bArr4, i3, length5);
                    i3 += length5;
                }
                if (r17.size() > 0) {
                    byte[] A002 = r17.A00();
                    int size4 = r17.size();
                    int i23 = 0;
                    if (size4 >= 0) {
                        int i24 = B4g2 - i3;
                        if (size4 > i24) {
                            System.arraycopy(A002, 0, bArr4, i3, i24);
                            r9.Bha(bArr4, bArr3, 0, 0);
                            i3 = 0;
                            size4 -= i24;
                            i23 = i24;
                            while (size4 > B4g2) {
                                r9.Bha(A002, bArr3, i23, 0);
                                size4 -= B4g2;
                                i23 += B4g2;
                            }
                        }
                        System.arraycopy(A002, i23, bArr4, i3, size4);
                        i3 += size4;
                    } else {
                        throw AnonymousClass001.A0c("Can't have a negative input length!");
                    }
                }
                int i25 = (i9 + i14) % 16;
                if (i25 != 0) {
                    while (i25 != 16) {
                        int i26 = i13;
                        if (i13 == B4g) {
                            r9.Bha(bArr4, bArr3, 0, 0);
                            i26 = 0;
                        }
                        i13 = i26 + 1;
                        bArr4[i26] = 0;
                        i25++;
                    }
                }
            }
            if (i2 >= 0) {
                int i27 = B4g2 - i13;
                byte[] bArr11 = bArr;
                if (i5 > i27) {
                    System.arraycopy(bArr11, i4, bArr4, i13, i27);
                    r9.Bha(bArr4, bArr3, 0, 0);
                    i13 = 0;
                    i5 = i2 - i27;
                    i4 = i + i27;
                    while (i5 > B4g2) {
                        r9.Bha(bArr11, bArr3, i4, 0);
                        i5 -= B4g2;
                        i4 += B4g2;
                    }
                }
                System.arraycopy(bArr11, i4, bArr4, i13, i5);
                for (int i28 = i13 + i5; i28 < B4g2; i28++) {
                    bArr4[i28] = 0;
                }
                r9.Bha(bArr4, bArr3, 0, 0);
                System.arraycopy(bArr3, 0, bArr2, 0, i7);
                for (int i29 = 0; i29 < B4g; i29++) {
                    bArr4[i29] = 0;
                }
                r9.reset();
                return;
            }
            throw AnonymousClass001.A0c("Can't have a negative input length!");
        }
        throw AnonymousClass001.A0c("MAC size must be multiple of 8");
    }

    public int B24(byte[] bArr, int i) {
        int i2;
        C140246tO r8 = this.A05;
        byte[] A002 = r8.A00();
        int size = r8.size();
        int i3 = 0;
        if (this.A03 != null) {
            byte[] bArr2 = this.A09;
            int length = bArr2.length;
            int i4 = 15 - length;
            if (i4 >= 4 || size < (1 << (i4 * 8))) {
                int i5 = this.A00;
                byte[] bArr3 = new byte[i5];
                bArr3[0] = (byte) ((i4 - 1) & 7);
                System.arraycopy(bArr2, 0, bArr3, 1, length);
                C185768uD r6 = this.A02;
                C177308eP r5 = new C177308eP(r6);
                r5.BFw(new AnonymousClass8QP(this.A03, bArr3), this.A06);
                boolean z = this.A06;
                int i6 = this.A01;
                if (z) {
                    i2 = i6 + size;
                    if (bArr.length >= i2 + i) {
                        byte[] bArr4 = this.A08;
                        A00(A002, bArr4, 0, size);
                        byte[] bArr5 = new byte[i5];
                        r5.Bha(bArr4, bArr5, 0, 0);
                        int i7 = i;
                        while (i3 < size - i5) {
                            r5.Bha(A002, bArr, i3, i7);
                            i7 += i5;
                            i3 += i5;
                        }
                        byte[] bArr6 = new byte[i5];
                        int i8 = size - i3;
                        System.arraycopy(A002, i3, bArr6, 0, i8);
                        r5.Bha(bArr6, bArr6, 0, 0);
                        System.arraycopy(bArr6, 0, bArr, i7, i8);
                        System.arraycopy(bArr5, 0, bArr, i + size, this.A01);
                    } else {
                        throw new C177198eE("Output buffer too short.");
                    }
                } else if (size >= i6) {
                    int i9 = size - i6;
                    if (bArr.length >= i9 + i) {
                        byte[] bArr7 = this.A08;
                        System.arraycopy(A002, i9, bArr7, 0, i6);
                        r5.Bha(bArr7, bArr7, 0, 0);
                        for (int i10 = this.A01; i10 != bArr7.length; i10++) {
                            bArr7[i10] = 0;
                        }
                        int i11 = 0;
                        int i12 = i;
                        while (i11 < i9 - i5) {
                            r5.Bha(A002, bArr, i11, i12);
                            i12 += i5;
                            i11 += i5;
                        }
                        byte[] bArr8 = new byte[i5];
                        int i13 = i9 - i11;
                        System.arraycopy(A002, i11, bArr8, 0, i13);
                        r5.Bha(bArr8, bArr8, 0, 0);
                        System.arraycopy(bArr8, 0, bArr, i12, i13);
                        byte[] bArr9 = new byte[i5];
                        A00(bArr, bArr9, i, i9);
                        if (C161007oo.A01(bArr7, bArr9)) {
                            i2 = i9;
                        } else {
                            throw new C177188eD("mac check in CCM failed");
                        }
                    } else {
                        throw new C177198eE("Output buffer too short.");
                    }
                } else {
                    throw new C177188eD("data too short");
                }
                r6.reset();
                this.A04.reset();
                r8.reset();
                return i2;
            }
            throw AnonymousClass001.A0e("CCM packet too large for choice of q.");
        }
        throw AnonymousClass001.A0e("CCM cipher unitialized.");
    }

    public byte[] B9G() {
        int i = this.A01;
        byte[] bArr = new byte[i];
        System.arraycopy(this.A08, 0, bArr, 0, i);
        return bArr;
    }

    public int BAJ(int i) {
        int size = i + this.A05.size();
        boolean z = this.A06;
        int i2 = this.A01;
        if (z) {
            return size + i2;
        }
        int i3 = size;
        int i4 = size - i2;
        if (i3 < i2) {
            return 0;
        }
        return i4;
    }

    public C185768uD BE1() {
        return this.A02;
    }

    public int BE4(int i) {
        return 0;
    }

    public void BFw(C834748n r3, boolean z) {
        C834748n r0;
        int length;
        this.A06 = z;
        if (r3 instanceof AnonymousClass8QK) {
            AnonymousClass8QK r32 = (AnonymousClass8QK) r3;
            this.A09 = C161007oo.A02(r32.A03);
            this.A07 = C161007oo.A02(r32.A02);
            int i = r32.A00;
            if (!z || (i >= 32 && i <= 128 && (i & 15) == 0)) {
                this.A01 = i >>> 3;
                r0 = r32.A01;
            } else {
                throw AnonymousClass001.A0c("tag length in octets must be one of {4,6,8,10,12,14,16}");
            }
        } else if (r3 instanceof AnonymousClass8QP) {
            AnonymousClass8QP r33 = (AnonymousClass8QP) r3;
            this.A09 = r33.A01;
            this.A07 = null;
            this.A01 = 8;
            r0 = r33.A00;
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            C18260x0.A1T(A0o, "invalid parameters passed to CCM: ", r3);
            throw C18310x6.A0d(A0o);
        }
        if (r0 != null) {
            this.A03 = r0;
        }
        byte[] bArr = this.A09;
        if (bArr == null || (length = bArr.length) < 7 || length > 13) {
            throw AnonymousClass001.A0c("nonce must have length from 7 to 13 octets");
        }
        this.A02.reset();
        this.A04.reset();
        this.A05.reset();
    }

    public void BhZ(byte[] bArr, int i, int i2) {
        this.A04.write(bArr, i, i2);
    }

    public C173408Qb(C185768uD r3) {
        this.A02 = r3;
        int B4g = r3.B4g();
        this.A00 = B4g;
        this.A08 = new byte[B4g];
        if (B4g != 16) {
            throw AnonymousClass001.A0c("cipher required with a block size of 16.");
        }
    }

    public String B4N() {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass6C9.A1A(A0o, this.A02);
        return AnonymousClass000.A0X("/CCM", A0o);
    }
}
