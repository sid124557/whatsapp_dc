package X;

/* renamed from: X.7l4  reason: invalid class name and case insensitive filesystem */
public class C159077l4 {
    public int A00;
    public byte[] A01;

    public static void A00(C159077l4 r3, C159077l4 r4) {
        r4.A0A(r3.A01, 0, r3.A00);
    }

    public static void A01(C159077l4 r3, byte[] bArr, int i, int i2) {
        int i3 = i + 1;
        bArr[i] = (byte) (i2 >>> 8);
        bArr[i3] = (byte) i2;
        r3.A00 = i3 + 1;
    }

    public void A02(int i) {
        int i2 = this.A00;
        int i3 = i2 + 1;
        if (i3 > this.A01.length) {
            A05(1);
        }
        this.A01[i2] = (byte) i;
        this.A00 = i3;
    }

    public void A03(int i) {
        int i2 = this.A00;
        if (i2 + 4 > this.A01.length) {
            A05(4);
        }
        byte[] bArr = this.A01;
        int i3 = i2 + 1;
        int A0D = AnonymousClass6CA.A0D(bArr, i >>> 24, i2, i3);
        bArr[i3] = (byte) (i >>> 16);
        A01(this, bArr, A0D, i);
    }

    public void A04(int i) {
        int i2 = this.A00;
        if (i2 + 2 > this.A01.length) {
            A05(2);
        }
        A01(this, this.A01, i2, i);
    }

    public final void A05(int i) {
        byte[] bArr = this.A01;
        int length = bArr.length * 2;
        int i2 = this.A00;
        int i3 = i + i2;
        if (length <= i3) {
            length = i3;
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        this.A01 = bArr2;
    }

    public final void A06(int i, int i2) {
        int i3 = this.A00;
        if (i3 + 2 > this.A01.length) {
            A05(2);
        }
        byte[] bArr = this.A01;
        int i4 = i3 + 1;
        int A0D = AnonymousClass6CA.A0D(bArr, i, i3, i4);
        bArr[i4] = (byte) i2;
        this.A00 = A0D;
    }

    public final void A07(int i, int i2) {
        int i3 = this.A00;
        if (i3 + 3 > this.A01.length) {
            A05(3);
        }
        byte[] bArr = this.A01;
        bArr[i3] = (byte) i;
        A01(this, bArr, i3 + 1, i2);
    }

    public final void A08(int i, int i2, int i3) {
        int i4 = this.A00;
        if (i4 + 5 > this.A01.length) {
            A05(5);
        }
        byte[] bArr = this.A01;
        int i5 = i4 + 1;
        int A0D = AnonymousClass6CA.A0D(bArr, i, i4, i5);
        AnonymousClass6CA.A0f(bArr, i2, i5);
        bArr[A0D] = (byte) i2;
        A01(this, bArr, A0D + 1, i3);
    }

    public void A0A(byte[] bArr, int i, int i2) {
        if (this.A00 + i2 > this.A01.length) {
            A05(i2);
        }
        if (bArr != null) {
            System.arraycopy(bArr, i, this.A01, this.A00, i2);
        }
        this.A00 += i2;
    }

    public C159077l4(int i) {
        this.A01 = new byte[i];
    }

    public final void A09(String str, int i, int i2) {
        byte[] bArr;
        int A0D;
        int length = str.length();
        int i3 = i;
        for (int i4 = i; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            if (charAt >= 1) {
                if (charAt <= 127) {
                    i3++;
                } else if (charAt > 2047) {
                    i3 += 3;
                }
            }
            i3 += 2;
        }
        if (i3 <= i2) {
            int i5 = this.A00;
            int i6 = (i5 - i) - 2;
            if (i6 >= 0) {
                byte[] bArr2 = this.A01;
                AnonymousClass6CA.A0f(bArr2, i3, i6);
                bArr2[i6 + 1] = (byte) i3;
            }
            if ((i5 + i3) - i > this.A01.length) {
                A05(i3 - i);
            }
            int i7 = this.A00;
            while (i < length) {
                char charAt2 = str.charAt(i);
                if (charAt2 >= 1) {
                    if (charAt2 <= 127) {
                        bArr = this.A01;
                        A0D = i7 + 1;
                    } else if (charAt2 > 2047) {
                        bArr = this.A01;
                        int i8 = i7 + 1;
                        i7 = AnonymousClass6CA.A0D(bArr, ((charAt2 >> 12) & 15) | 224, i7, i8);
                        A0D = AnonymousClass6CA.A0D(bArr, ((charAt2 >> 6) & 63) | 128, i8, i7);
                        charAt2 = (charAt2 & '?') | 128;
                    }
                    bArr[i7] = (byte) charAt2;
                    i7 = A0D;
                    i++;
                }
                byte[] bArr3 = this.A01;
                int i9 = i7 + 1;
                i7 = AnonymousClass6CA.A0D(bArr3, ((charAt2 >> 6) & 31) | 192, i7, i9);
                bArr3[i9] = (byte) ((charAt2 & '?') | 128);
                i++;
            }
            this.A00 = i7;
            return;
        }
        throw AnonymousClass001.A0c("UTF8 string too large");
    }

    public C159077l4() {
        this.A01 = new byte[64];
    }
}
