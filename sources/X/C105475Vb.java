package X;

import java.util.Set;

/* renamed from: X.5Vb  reason: invalid class name and case insensitive filesystem */
public class C105475Vb {
    public static final Set A00 = C18280x3.A0h(new String[]{"NONE", "ES256"});

    public static byte[] A00(byte[] bArr) {
        int length;
        int i = 0;
        while (true) {
            length = bArr.length;
            if (i < length && bArr[i] == 0) {
                i++;
            }
        }
        if (i == length) {
            return new byte[]{0};
        }
        int i2 = length - i;
        if ((bArr[i] & 255) > Byte.MAX_VALUE) {
            byte[] bArr2 = new byte[(i2 + 1)];
            System.arraycopy(bArr, i, bArr2, 1, i2);
            return bArr2;
        }
        byte[] bArr3 = new byte[i2];
        System.arraycopy(bArr, i, bArr3, 0, i2);
        return bArr3;
    }
}
