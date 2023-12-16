package X;

/* renamed from: X.7k6  reason: invalid class name and case insensitive filesystem */
public final class C158517k6 {
    public int A00;
    public int A01;
    public int A02;
    public byte[] A03;

    public C158517k6(byte[] bArr) {
        int length = bArr.length;
        this.A03 = bArr;
        this.A01 = length;
    }

    public int A00(int i) {
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
        A01();
        return A0I;
    }

    public final void A01() {
        boolean z;
        int i;
        int i2 = this.A02;
        if (i2 < 0 || (i2 >= (i = this.A01) && !(i2 == i && this.A00 == 0))) {
            z = false;
        } else {
            z = true;
        }
        C159197lM.A02(z);
    }

    public boolean A02() {
        byte[] bArr = this.A03;
        int i = this.A02;
        byte b = bArr[i];
        int i2 = this.A00;
        boolean A1S = AnonymousClass000.A1S(b & (128 >> i2));
        int i3 = i2 + 1;
        this.A00 = i3;
        if (i3 == 8) {
            this.A00 = 0;
            this.A02 = i + 1;
        }
        A01();
        return A1S;
    }

    public C158517k6() {
    }
}
