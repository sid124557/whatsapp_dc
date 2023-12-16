package X;

/* renamed from: X.8eH  reason: invalid class name and case insensitive filesystem */
public class C177228eH extends C158467k1 {
    public int A00;
    public int A01;
    public C185968uX A02;

    public final byte[] A04(int i, int i2) {
        byte[] bArr;
        byte[] bArr2;
        int length;
        int length2;
        int i3 = this.A01;
        byte[] bArr3 = new byte[i3];
        byte[] bArr4 = new byte[i2];
        int i4 = 0;
        while (i4 != i3) {
            i4 = AnonymousClass6CA.A0A(bArr3, i, i4);
        }
        byte[] bArr5 = this.A02;
        if (bArr5 == null || (length2 = bArr5.length) == 0) {
            bArr = new byte[0];
        } else {
            int i5 = i3 * (((length2 + i3) - 1) / i3);
            bArr = new byte[i5];
            for (int i6 = 0; i6 != i5; i6++) {
                AnonymousClass6CA.A0g(bArr5, bArr, i6 % length2, i6);
            }
        }
        byte[] bArr6 = this.A01;
        if (bArr6 == null || (length = bArr6.length) == 0) {
            bArr2 = new byte[0];
        } else {
            int i7 = i3 * (((length + i3) - 1) / i3);
            bArr2 = new byte[i7];
            for (int i8 = 0; i8 != i7; i8++) {
                AnonymousClass6CA.A0g(bArr6, bArr2, i8 % length, i8);
            }
        }
        int length3 = bArr.length;
        int length4 = bArr2.length;
        int i9 = length3 + length4;
        byte[] bArr7 = new byte[i9];
        System.arraycopy(bArr, 0, bArr7, 0, length3);
        System.arraycopy(bArr2, 0, bArr7, length3, length4);
        byte[] bArr8 = new byte[i3];
        int i10 = this.A00;
        int i11 = ((i2 + i10) - 1) / i10;
        byte[] bArr9 = new byte[i10];
        for (int i12 = 1; i12 <= i11; i12++) {
            C185968uX r2 = this.A02;
            r2.update(bArr3, 0, i3);
            r2.update(bArr7, 0, i9);
            r2.B24(bArr9, 0);
            for (int i13 = 1; i13 < this.A00; i13++) {
                r2.update(bArr9, 0, i10);
                r2.B24(bArr9, 0);
            }
            for (int i14 = 0; i14 != i3; i14++) {
                AnonymousClass6CA.A0g(bArr9, bArr8, i14 % i10, i14);
            }
            for (int i15 = 0; i15 != i9 / i3; i15++) {
                int i16 = i3 * i15;
                int i17 = (i3 + i16) - 1;
                int i18 = (bArr8[i3 - 1] & 255) + (bArr7[i17] & 255) + 1;
                bArr7[i17] = (byte) i18;
                int i19 = i18 >>> 8;
                for (int i20 = i3 - 2; i20 >= 0; i20--) {
                    int i21 = i16 + i20;
                    int i22 = i19 + (bArr8[i20] & 255) + (bArr7[i21] & 255);
                    bArr7[i21] = (byte) i22;
                    i19 = i22 >>> 8;
                }
            }
            if (i12 == i11) {
                int i23 = (i12 - 1) * i10;
                System.arraycopy(bArr9, 0, bArr4, i23, i2 - i23);
            } else {
                System.arraycopy(bArr9, 0, bArr4, (i12 - 1) * i10, i10);
            }
        }
        return bArr4;
    }

    public C177228eH(C185968uX r3) {
        this.A02 = r3;
        if (r3 instanceof C188608zC) {
            this.A00 = r3.B74();
            this.A01 = ((C188608zC) r3).B51();
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Digest ");
        A0o.append(r3.B4N());
        throw AnonymousClass000.A0F(" unsupported", A0o);
    }
}
