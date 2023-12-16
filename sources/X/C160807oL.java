package X;

/* renamed from: X.7oL  reason: invalid class name and case insensitive filesystem */
public final class C160807oL {
    public int A00;
    public int A01;
    public int A02;
    public byte[] A03;

    public int A04(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = this.A00 + i;
        this.A00 = i2;
        int i3 = 0;
        while (i2 > 8) {
            i2 -= 8;
            this.A00 = i2;
            byte[] bArr = this.A03;
            int i4 = this.A02;
            this.A02 = i4 + 1;
            i3 |= (bArr[i4] & 255) << i2;
        }
        byte[] bArr2 = this.A03;
        int i5 = this.A02;
        int A0I = AnonymousClass6C8.A0I(bArr2, i5, i2, i3, i);
        if (i2 == 8) {
            this.A00 = 0;
            this.A02 = i5 + 1;
        }
        A07();
        return A0I;
    }

    public void A0B(byte[] bArr, int i) {
        int i2 = i >> 3;
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.A03;
            int i4 = this.A02;
            int i5 = i4 + 1;
            this.A02 = i5;
            byte b = bArr2[i4];
            int i6 = this.A00;
            byte b2 = (byte) (b << i6);
            bArr[i3] = b2;
            AnonymousClass6C8.A0u((255 & bArr2[i5]) >> (8 - i6), bArr, b2, i3);
        }
        int i7 = i & 7;
        if (i7 != 0) {
            byte b3 = (byte) (bArr[i2] & (255 >> i7));
            bArr[i2] = b3;
            int i8 = this.A00;
            if (i8 + i7 > 8) {
                byte[] bArr3 = this.A03;
                int i9 = this.A02;
                this.A02 = i9 + 1;
                b3 = (byte) (b3 | ((bArr3[i9] & 255) << i8));
                bArr[i2] = b3;
                i8 -= 8;
                this.A00 = i8;
            }
            int i10 = i8 + i7;
            this.A00 = i10;
            byte[] bArr4 = this.A03;
            int i11 = this.A02;
            AnonymousClass6C8.A0u((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7)), bArr, b3, i2);
            if (i10 == 8) {
                this.A00 = 0;
                this.A02 = i11 + 1;
            }
            A07();
        }
    }

    public void A0C(byte[] bArr, int i) {
        C161487pm.A04(AnonymousClass000.A1T(this.A00));
        System.arraycopy(this.A03, this.A02, bArr, 0, i);
        this.A02 += i;
        A07();
    }

    public static int A00(C160807oL r2) {
        return ((r2.A01 - r2.A02) * 8) - r2.A00;
    }

    public static long A02(C160807oL r4, long j) {
        r4.A09(1);
        long A04 = j | ((long) (r4.A04(15) << 15)) | ((long) r4.A04(15));
        r4.A09(1);
        return A04;
    }

    public void A05() {
        if (this.A00 != 0) {
            this.A00 = 0;
            this.A02++;
            A07();
        }
    }

    public void A06() {
        int i = this.A00 + 1;
        this.A00 = i;
        if (i == 8) {
            this.A00 = 0;
            this.A02++;
        }
        A07();
    }

    public final void A07() {
        boolean z;
        int i;
        int i2 = this.A02;
        if (i2 < 0 || (i2 >= (i = this.A01) && !(i2 == i && this.A00 == 0))) {
            z = false;
        } else {
            z = true;
        }
        C161487pm.A04(z);
    }

    public void A08(int i) {
        int i2 = i / 8;
        this.A02 = i2;
        this.A00 = i - (i2 * 8);
        A07();
    }

    public void A09(int i) {
        int i2 = i / 8;
        int i3 = this.A02 + i2;
        this.A02 = i3;
        int i4 = this.A00 + (i - (i2 * 8));
        this.A00 = i4;
        if (i4 > 7) {
            this.A02 = i3 + 1;
            this.A00 = i4 - 8;
        }
        A07();
    }

    public void A0A(int i) {
        C161487pm.A04(AnonymousClass000.A1T(this.A00));
        this.A02 += i;
        A07();
    }

    public boolean A0D() {
        boolean A1S = AnonymousClass000.A1S(this.A03[this.A02] & (128 >> this.A00));
        A06();
        return A1S;
    }

    public C160807oL(byte[] bArr, int i) {
        this.A03 = bArr;
        this.A01 = i;
    }

    public static int A01(C160807oL r0, int i, int i2) {
        r0.A09(i);
        return r0.A04(i2);
    }

    public static void A03(C160807oL r1, int i) {
        if (r1.A0D()) {
            r1.A09(i);
        }
    }

    public C160807oL() {
        this.A03 = C162387ry.A0A;
    }
}
