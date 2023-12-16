package X;

/* renamed from: X.8QB  reason: invalid class name */
public class AnonymousClass8QB implements C185768uD {
    public int A00;
    public int A01;
    public C185768uD A02;
    public boolean A03;
    public byte[] A04;
    public byte[] A05;
    public byte[] A06;

    public void reset() {
        this.A01 = 0;
        byte[] bArr = this.A06;
        byte[] bArr2 = this.A04;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.A02.reset();
    }

    public int B4g() {
        return this.A02.B4g();
    }

    public void BFw(C834748n r3, boolean z) {
        this.A03 = z;
        reset();
        this.A02.BFw(r3, true);
    }

    public int Bha(byte[] bArr, byte[] bArr2, int i, int i2) {
        boolean z = this.A03;
        int i3 = this.A00;
        int i4 = i + i3;
        int length = bArr.length;
        if (z) {
            if (i4 > length) {
                throw C177248eJ.A01();
            } else if (i2 + i3 <= bArr2.length) {
                int i5 = this.A01;
                int i6 = 2;
                if (i5 > i3) {
                    byte[] bArr3 = this.A04;
                    byte b = bArr[i];
                    byte[] bArr4 = this.A05;
                    byte b2 = (byte) (b ^ bArr4[i3 - 2]);
                    bArr2[i2] = b2;
                    bArr3[i3 - 2] = b2;
                    byte b3 = (byte) (bArr[i + 1] ^ bArr4[i3 - 1]);
                    bArr2[i2 + 1] = b3;
                    bArr3[i3 - 1] = b3;
                    this.A02.Bha(bArr3, bArr4, 0, 0);
                    while (i6 < i3) {
                        int i7 = i6 - 2;
                        byte b4 = (byte) (bArr[i + i6] ^ bArr4[i7]);
                        bArr2[i2 + i6] = b4;
                        bArr3[i7] = b4;
                        i6++;
                    }
                } else if (i5 == 0) {
                    C185768uD r0 = this.A02;
                    byte[] bArr5 = this.A04;
                    byte[] bArr6 = this.A05;
                    r0.Bha(bArr5, bArr6, 0, 0);
                    for (int i8 = 0; i8 < i3; i8++) {
                        byte b5 = (byte) (bArr[i + i8] ^ bArr6[i8]);
                        bArr2[i2 + i8] = b5;
                        bArr5[i8] = b5;
                    }
                } else if (i5 == i3) {
                    C185768uD r2 = this.A02;
                    byte[] bArr7 = this.A04;
                    byte[] bArr8 = this.A05;
                    r2.Bha(bArr7, bArr8, 0, 0);
                    AnonymousClass6C7.A1T(bArr8, bArr2, 0, bArr[i], i2);
                    AnonymousClass6C7.A1T(bArr8, bArr2, 1, bArr[i + 1], i2 + 1);
                    int i9 = i3 - 2;
                    System.arraycopy(bArr7, 2, bArr7, 0, i9);
                    System.arraycopy(bArr2, i2, bArr7, i9, 2);
                    r2.Bha(bArr7, bArr8, 0, 0);
                    while (i6 < i3) {
                        int i10 = i6 - 2;
                        byte b6 = (byte) (bArr[i + i6] ^ bArr8[i10]);
                        bArr2[i2 + i6] = b6;
                        bArr7[i10] = b6;
                        i6++;
                    }
                }
                return i3;
            } else {
                throw C177198eE.A00();
            }
        } else if (i4 > length) {
            throw C177248eJ.A01();
        } else if (i2 + i3 <= bArr2.length) {
            int i11 = this.A01;
            int i12 = 2;
            if (i11 > i3) {
                byte b7 = bArr[i];
                byte[] bArr9 = this.A04;
                bArr9[i3 - 2] = b7;
                byte[] bArr10 = this.A05;
                AnonymousClass6C7.A1T(bArr10, bArr2, i3 - 2, b7, i2);
                byte b8 = bArr[i + 1];
                bArr9[i3 - 1] = b8;
                AnonymousClass6C7.A1T(bArr10, bArr2, i3 - 1, b8, i2 + 1);
                this.A02.Bha(bArr9, bArr10, 0, 0);
                while (i12 < i3) {
                    byte b9 = bArr[i + i12];
                    int i13 = i12 - 2;
                    bArr9[i13] = b9;
                    AnonymousClass6C7.A1T(bArr10, bArr2, i13, b9, i2 + i12);
                    i12++;
                }
            } else if (i11 == 0) {
                C185768uD r02 = this.A02;
                byte[] bArr11 = this.A04;
                byte[] bArr12 = this.A05;
                r02.Bha(bArr11, bArr12, 0, 0);
                for (int i14 = 0; i14 < i3; i14++) {
                    int i15 = i + i14;
                    AnonymousClass6CA.A0g(bArr, bArr11, i15, i14);
                    AnonymousClass6CA.A0e(bArr[i15], bArr2, bArr12[i14], i14);
                }
            } else if (i11 == i3) {
                C185768uD r7 = this.A02;
                byte[] bArr13 = this.A04;
                byte[] bArr14 = this.A05;
                r7.Bha(bArr13, bArr14, 0, 0);
                byte b10 = bArr[i];
                byte b11 = bArr[i + 1];
                AnonymousClass6C7.A1T(bArr14, bArr2, 0, b10, i2);
                AnonymousClass6C7.A1T(bArr14, bArr2, 1, b11, i2 + 1);
                System.arraycopy(bArr13, 2, bArr13, 0, i3 - 2);
                bArr13[i3 - 2] = b10;
                bArr13[i3 - 1] = b11;
                r7.Bha(bArr13, bArr14, 0, 0);
                while (i12 < i3) {
                    byte b12 = bArr[i + i12];
                    int i16 = i12 - 2;
                    bArr13[i16] = b12;
                    AnonymousClass6C7.A1T(bArr14, bArr2, i16, b12, i2 + i12);
                    i12++;
                }
            }
            return i3;
        } else {
            throw C177198eE.A00();
        }
        this.A01 += i3;
        return i3;
    }

    public AnonymousClass8QB(C185768uD r3) {
        this.A02 = r3;
        int B4g = r3.B4g();
        this.A00 = B4g;
        this.A06 = new byte[B4g];
        this.A04 = new byte[B4g];
        this.A05 = new byte[B4g];
    }

    public String B4N() {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass6C9.A1A(A0o, this.A02);
        return AnonymousClass000.A0X("/OpenPGPCFB", A0o);
    }
}
