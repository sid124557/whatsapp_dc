package X;

import java.io.UnsupportedEncodingException;

/* renamed from: X.76H  reason: invalid class name */
public class AnonymousClass76H {
    public static String A00(byte[] bArr) {
        int i;
        try {
            int length = bArr.length;
            byte[] bArr2 = C177528g1.A00;
            int i2 = (length / 3) * 4;
            if (length % 3 > 0) {
                i2 += 4;
            }
            byte[] bArr3 = new byte[i2];
            int i3 = -1;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int i6 = i4 + 3;
                if (i6 > length) {
                    break;
                }
                AnonymousClass6C8.A1K(bArr, bArr2, bArr3, i4, i5);
                i5 += 4;
                i3--;
                if (i3 == 0) {
                    bArr3[i5] = 10;
                    i5++;
                    i4 = i6;
                    i3 = 19;
                } else {
                    i4 = i6;
                }
            }
            if (i4 == length - 1) {
                int A0J = AnonymousClass6C8.A0J(bArr2, bArr3, i5, (bArr[i4] & 255) << 4);
                i = A0J + 1;
                bArr3[A0J] = 61;
            } else {
                if (i4 == length - 2) {
                    int i7 = ((bArr[i4] & 255) << 10) | ((bArr[i4 + 1] & 255) << 2);
                    AnonymousClass6CA.A0g(bArr2, bArr3, (i7 >> 12) & 63, i5);
                    i = AnonymousClass6C8.A0J(bArr2, bArr3, i5 + 1, i7);
                }
                return new String(bArr3, "US-ASCII");
            }
            bArr3[i] = 61;
            return new String(bArr3, "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw AnonymousClass0x9.A0i(e);
        }
    }
}
