package X;

/* renamed from: X.7Z1  reason: invalid class name */
public final class AnonymousClass7Z1 {
    public int A00;
    public int A01;
    public final int A02;
    public final byte[] A03;

    public int A00(int i) {
        int i2 = this.A01;
        int i3 = this.A00;
        int min = Math.min(i, 8 - i3);
        byte[] bArr = this.A03;
        int i4 = i2 + 1;
        int i5 = ((bArr[i2] & 255) >> i3) & (255 >> (8 - min));
        while (min < i) {
            i5 |= (bArr[i4] & 255) << min;
            min += 8;
            i4++;
        }
        int i6 = i5 & (-1 >>> (32 - i));
        A01(i);
        return i6;
    }

    public void A01(int i) {
        boolean z;
        int i2;
        int i3 = i / 8;
        int i4 = this.A01 + i3;
        this.A01 = i4;
        int i5 = this.A00 + (i - (i3 * 8));
        this.A00 = i5;
        if (i5 > 7) {
            i4++;
            this.A01 = i4;
            i5 -= 8;
            this.A00 = i5;
        }
        if (i4 < 0 || (i4 >= (i2 = this.A02) && !(i4 == i2 && i5 == 0))) {
            z = false;
        } else {
            z = true;
        }
        C159197lM.A02(z);
    }

    public boolean A02() {
        boolean A1U = AnonymousClass000.A1U(((this.A03[this.A01] & 255) >> this.A00) & 1, 1);
        A01(1);
        return A1U;
    }

    public AnonymousClass7Z1(byte[] bArr) {
        this.A03 = bArr;
        this.A02 = bArr.length;
    }
}
