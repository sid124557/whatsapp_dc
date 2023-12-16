package X;

/* renamed from: X.8QC  reason: invalid class name */
public class AnonymousClass8QC implements C185768uD {
    public int A00;
    public int A01;
    public C185768uD A02;
    public boolean A03;
    public boolean A04;
    public byte[] A05;
    public byte[] A06;
    public byte[] A07;
    public byte[] A08;

    public void reset() {
        this.A01 = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.A05;
            if (i != bArr.length) {
                if (this.A04) {
                    bArr[i] = 0;
                } else {
                    bArr[i] = this.A07[i];
                }
                i++;
            } else {
                this.A02.reset();
                return;
            }
        }
    }

    public String B4N() {
        String str;
        boolean z = this.A04;
        StringBuilder A0o = AnonymousClass001.A0o();
        String B4N = this.A02.B4N();
        if (z) {
            A0o.append(B4N);
            str = "/PGPCFBwithIV";
        } else {
            A0o.append(B4N);
            str = "/PGPCFB";
        }
        return AnonymousClass000.A0X(str, A0o);
    }

    public int B4g() {
        return this.A02.B4g();
    }

    public void BFw(C834748n r7, boolean z) {
        C185768uD r0;
        this.A03 = z;
        if (r7 instanceof AnonymousClass8QP) {
            AnonymousClass8QP r72 = (AnonymousClass8QP) r7;
            byte[] bArr = r72.A01;
            int length = bArr.length;
            byte[] bArr2 = this.A07;
            int length2 = bArr2.length;
            if (length < length2) {
                int i = length2 - length;
                System.arraycopy(bArr, 0, bArr2, i, length);
                for (int i2 = 0; i2 < i; i2++) {
                    bArr2[i2] = 0;
                }
            } else {
                System.arraycopy(bArr, 0, bArr2, 0, length2);
            }
            reset();
            r0 = this.A02;
            r7 = r72.A00;
        } else {
            reset();
            r0 = this.A02;
        }
        r0.BFw(r7, true);
    }

    public int Bha(byte[] bArr, byte[] bArr2, int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z = this.A04;
        boolean z2 = this.A03;
        if (z) {
            if (z2) {
                i3 = this.A00;
                if (i + i3 <= bArr.length) {
                    int i6 = this.A01;
                    if (i6 == 0) {
                        int i7 = i3 * 2;
                        if (i7 + i2 + 2 <= bArr2.length) {
                            C185768uD r8 = this.A02;
                            byte[] bArr3 = this.A05;
                            byte[] bArr4 = this.A06;
                            r8.Bha(bArr3, bArr4, 0, 0);
                            for (int i8 = 0; i8 < i3; i8++) {
                                AnonymousClass6C7.A1T(bArr4, bArr2, i8, this.A07[i8], i2 + i8);
                            }
                            System.arraycopy(bArr2, i2, bArr3, 0, i3);
                            r8.Bha(bArr3, bArr4, 0, 0);
                            int i9 = i2 + i3;
                            byte[] bArr5 = this.A07;
                            AnonymousClass6C7.A1T(bArr4, bArr2, 0, bArr5[i3 - 2], i9);
                            AnonymousClass6C7.A1T(bArr4, bArr2, 1, bArr5[i3 - 1], i9 + 1);
                            System.arraycopy(bArr2, i2 + 2, bArr3, 0, i3);
                            r8.Bha(bArr3, bArr4, 0, 0);
                            for (int i10 = 0; i10 < i3; i10++) {
                                AnonymousClass6C7.A1T(bArr4, bArr2, i10, bArr[i + i10], i9 + 2 + i10);
                            }
                            System.arraycopy(bArr2, i9 + 2, bArr3, 0, i3);
                            i4 = i7 + 2;
                            i5 = this.A01 + i4;
                        } else {
                            throw new C177198eE("output buffer too short");
                        }
                    } else if (i6 >= i3 + 2) {
                        if (i3 + i2 <= bArr2.length) {
                            C185768uD r0 = this.A02;
                            byte[] bArr6 = this.A05;
                            byte[] bArr7 = this.A06;
                            r0.Bha(bArr6, bArr7, 0, 0);
                            for (int i11 = 0; i11 < i3; i11++) {
                                AnonymousClass6C7.A1T(bArr7, bArr2, i11, bArr[i + i11], i2 + i11);
                            }
                            System.arraycopy(bArr2, i2, bArr6, 0, i3);
                        } else {
                            throw new C177198eE("output buffer too short");
                        }
                    }
                } else {
                    throw C177248eJ.A01();
                }
            } else {
                int i12 = this.A00;
                if (i + i12 > bArr.length) {
                    throw C177248eJ.A01();
                } else if (i2 + i12 <= bArr2.length) {
                    int i13 = this.A01;
                    if (i13 == 0) {
                        for (int i14 = 0; i14 < i12; i14++) {
                            AnonymousClass6CA.A0g(bArr, this.A05, i + i14, i14);
                        }
                        this.A02.Bha(this.A05, this.A06, 0, 0);
                        this.A01 += i12;
                        return 0;
                    } else if (i13 == i12) {
                        byte[] bArr8 = this.A08;
                        System.arraycopy(bArr, i, bArr8, 0, i12);
                        byte[] bArr9 = this.A05;
                        i4 = i12 - 2;
                        System.arraycopy(bArr9, 2, bArr9, 0, i4);
                        int i15 = i12 - 2;
                        AnonymousClass6CA.A0g(bArr8, bArr9, 0, i15);
                        AnonymousClass6CA.A0g(bArr8, bArr9, 1, i12 - 1);
                        C185768uD r02 = this.A02;
                        byte[] bArr10 = this.A06;
                        r02.Bha(bArr9, bArr10, 0, 0);
                        for (int i16 = 0; i16 < i15; i16++) {
                            AnonymousClass6C7.A1T(bArr10, bArr2, i16, bArr8[i16 + 2], i2 + i16);
                        }
                        System.arraycopy(bArr8, 2, bArr9, 0, i4);
                        i5 = this.A01 + 2;
                    } else {
                        if (i13 >= i12 + 2) {
                            byte[] bArr11 = this.A08;
                            System.arraycopy(bArr, i, bArr11, 0, i12);
                            byte b = bArr11[0];
                            int i17 = i12 - 2;
                            byte[] bArr12 = this.A06;
                            AnonymousClass6C7.A1T(bArr12, bArr2, i17, b, i2);
                            AnonymousClass6C7.A1T(bArr12, bArr2, i12 - 1, bArr11[1], i2 + 1);
                            byte[] bArr13 = this.A05;
                            System.arraycopy(bArr11, 0, bArr13, i17, 2);
                            this.A02.Bha(bArr13, bArr12, 0, 0);
                            for (int i18 = 0; i18 < i12 - 2; i18++) {
                                AnonymousClass6C7.A1T(bArr12, bArr2, i18, bArr11[i18 + 2], i2 + i18 + 2);
                            }
                            System.arraycopy(bArr11, 2, bArr13, 0, i17);
                        }
                        return i12;
                    }
                } else {
                    throw C177198eE.A00();
                }
            }
            this.A01 = i5;
            return i4;
        }
        i3 = this.A00;
        int i19 = i + i3;
        int length = bArr.length;
        if (z2) {
            if (i19 > length) {
                throw C177248eJ.A01();
            } else if (i3 + i2 <= bArr2.length) {
                C185768uD r03 = this.A02;
                byte[] bArr14 = this.A05;
                byte[] bArr15 = this.A06;
                r03.Bha(bArr14, bArr15, 0, 0);
                for (int i20 = 0; i20 < i3; i20++) {
                    AnonymousClass6C7.A1T(bArr15, bArr2, i20, bArr[i + i20], i2 + i20);
                }
                for (int i21 = 0; i21 < i3; i21++) {
                    AnonymousClass6CA.A0g(bArr2, bArr14, i2 + i21, i21);
                }
            } else {
                throw C177198eE.A00();
            }
        } else if (i19 > length) {
            throw C177248eJ.A01();
        } else if (i3 + i2 <= bArr2.length) {
            C185768uD r04 = this.A02;
            byte[] bArr16 = this.A05;
            byte[] bArr17 = this.A06;
            r04.Bha(bArr16, bArr17, 0, 0);
            for (int i22 = 0; i22 < i3; i22++) {
                AnonymousClass6C7.A1T(bArr17, bArr2, i22, bArr[i + i22], i2 + i22);
            }
            for (int i23 = 0; i23 < i3; i23++) {
                AnonymousClass6CA.A0g(bArr, bArr16, i + i23, i23);
            }
        } else {
            throw C177198eE.A00();
        }
        return i3;
    }

    public AnonymousClass8QC(C185768uD r3, boolean z) {
        this.A02 = r3;
        this.A04 = z;
        int B4g = r3.B4g();
        this.A00 = B4g;
        this.A07 = new byte[B4g];
        this.A05 = new byte[B4g];
        this.A06 = new byte[B4g];
        this.A08 = new byte[B4g];
    }
}
