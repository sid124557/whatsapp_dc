package X;

/* renamed from: X.7aG  reason: invalid class name and case insensitive filesystem */
public abstract class C152847aG {
    public final int A00;
    public final int A01;

    public byte[] A00() {
        byte[] bArr;
        int i;
        int i2;
        int i3;
        byte[] bArr2;
        if (this instanceof C130896ci) {
            C130896ci r7 = (C130896ci) this;
            int i4 = r7.A01;
            int i5 = r7.A00;
            int i6 = r7.A01;
            if (i4 == i6 && i5 == r7.A00) {
                return r7.A02;
            }
            i3 = i4 * i5;
            bArr = new byte[i3];
            i = 0 * i6;
            i2 = 0;
            if (i4 == i6) {
                bArr2 = r7.A02;
            } else {
                while (i2 < i5) {
                    System.arraycopy(r7.A02, i, bArr, i2 * i4, i4);
                    i += i6;
                    i2++;
                }
                return bArr;
            }
        } else if (this instanceof C130906cj) {
            C130906cj r72 = (C130906cj) this;
            int i7 = r72.A01;
            int i8 = r72.A00;
            int i9 = r72.A01;
            if (i7 == i9 && i8 == r72.A00) {
                return r72.A04;
            }
            i3 = i7 * i8;
            bArr = new byte[i3];
            i = (r72.A03 * i9) + r72.A02;
            i2 = 0;
            if (i7 == i9) {
                bArr2 = r72.A04;
            } else {
                while (i2 < i8) {
                    System.arraycopy(r72.A04, i, bArr, i2 * i7, i7);
                    i += i9;
                    i2++;
                }
                return bArr;
            }
        } else {
            C130916ck r1 = (C130916ck) this;
            byte[] A002 = r1.A00.A00();
            int i10 = r1.A01 * r1.A00;
            byte[] bArr3 = new byte[i10];
            for (int i11 = 0; i11 < i10; i11 = AnonymousClass6CA.A0A(bArr3, 255 - (A002[i11] & 255), i11)) {
            }
            return bArr3;
        }
        System.arraycopy(bArr2, i, bArr, i2, i3);
        return bArr;
    }

    public byte[] A01(byte[] bArr, int i) {
        int i2;
        int i3;
        byte[] bArr2;
        if (this instanceof C130896ci) {
            C130896ci r1 = (C130896ci) this;
            if (i < 0 || i >= r1.A00) {
                throw AnonymousClass001.A0c("Requested row is outside the image: ".concat(String.valueOf(i)));
            }
            i2 = r1.A01;
            if (bArr == null || bArr.length < i2) {
                bArr = new byte[i2];
            }
            i3 = i * r1.A01;
            bArr2 = r1.A02;
        } else if (this instanceof C130906cj) {
            C130906cj r12 = (C130906cj) this;
            if (i < 0 || i >= r12.A00) {
                throw AnonymousClass001.A0c("Requested row is outside the image: ".concat(String.valueOf(i)));
            }
            i2 = r12.A01;
            if (bArr == null || bArr.length < i2) {
                bArr = new byte[i2];
            }
            i3 = ((i + r12.A03) * r12.A01) + r12.A02;
            bArr2 = r12.A04;
        } else {
            C130916ck r13 = (C130916ck) this;
            byte[] A012 = r13.A00.A01(bArr, i);
            int i4 = r13.A01;
            for (int i5 = 0; i5 < i4; i5 = AnonymousClass6CA.A0A(A012, 255 - (A012[i5] & 255), i5)) {
            }
            return A012;
        }
        System.arraycopy(bArr2, i3, bArr, 0, i2);
        return bArr;
    }

    public final String toString() {
        int i = this.A01;
        byte[] bArr = new byte[i];
        int i2 = this.A00;
        StringBuilder A0Y = AnonymousClass6CA.A0Y((i + 1) * i2);
        for (int i3 = 0; i3 < i2; i3++) {
            bArr = A01(bArr, i3);
            for (int i4 = 0; i4 < i; i4++) {
                byte b = bArr[i4] & 255;
                char c = '#';
                if (b >= 64) {
                    c = '+';
                    if (b >= 128) {
                        c = ' ';
                        if (b < 192) {
                            c = '.';
                        }
                    }
                }
                A0Y.append(c);
            }
            A0Y.append(10);
        }
        return A0Y.toString();
    }

    public C152847aG(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
