package X;

/* renamed from: X.7bb  reason: invalid class name and case insensitive filesystem */
public final class C153587bb {
    public int A00 = 0;
    public int A01;
    public int A02;
    public byte[] A03;

    public final int A00() {
        int i = 0;
        int i2 = 0;
        while (!A05()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = A01(i2);
        }
        return i3 + i;
    }

    public final boolean A06(int i) {
        if (2 > i || i >= this.A01) {
            return false;
        }
        byte[] bArr = this.A03;
        if (bArr[i] == 3 && bArr[i - 2] == 0 && bArr[i - 1] == 0) {
            return true;
        }
        return false;
    }

    public int A01(int i) {
        int i2;
        int i3 = this.A00 + i;
        this.A00 = i3;
        int i4 = 0;
        while (true) {
            i2 = 2;
            if (i3 <= 8) {
                break;
            }
            i3 -= 8;
            this.A00 = i3;
            byte[] bArr = this.A03;
            int i5 = this.A02;
            i4 |= (bArr[i5] & 255) << i3;
            if (!A06(i5 + 1)) {
                i2 = 1;
            }
            this.A02 = i5 + i2;
        }
        byte[] bArr2 = this.A03;
        int i6 = this.A02;
        int A0I = AnonymousClass6C8.A0I(bArr2, i6, i3, i4, i);
        if (i3 == 8) {
            this.A00 = 0;
            if (!A06(i6 + 1)) {
                i2 = 1;
            }
            this.A02 = i6 + i2;
        }
        A03();
        return A0I;
    }

    public void A02() {
        int i = 1;
        int i2 = this.A00 + 1;
        this.A00 = i2;
        if (i2 == 8) {
            this.A00 = 0;
            int i3 = this.A02;
            if (A06(i3 + 1)) {
                i = 2;
            }
            this.A02 = i3 + i;
        }
        A03();
    }

    public final void A03() {
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

    public void A04(int i) {
        int i2 = this.A02;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.A02 = i4;
        int i5 = this.A00 + (i - (i3 * 8));
        this.A00 = i5;
        if (i5 > 7) {
            i4++;
            this.A02 = i4;
            this.A00 = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > i4) {
                A03();
                return;
            } else if (A06(i2)) {
                i4++;
                this.A02 = i4;
                i2 += 2;
            }
        }
    }

    public boolean A05() {
        boolean A1S = AnonymousClass000.A1S(this.A03[this.A02] & (128 >> this.A00));
        A02();
        return A1S;
    }

    public C153587bb(byte[] bArr, int i, int i2) {
        this.A03 = bArr;
        this.A02 = i;
        this.A01 = i2;
        A03();
    }
}
