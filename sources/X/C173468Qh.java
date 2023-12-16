package X;

import java.security.SecureRandom;

/* renamed from: X.8Qh  reason: invalid class name and case insensitive filesystem */
public class C173468Qh implements C185188tE {
    public int Awh(byte[] bArr, int i) {
        int length = bArr.length;
        int i2 = length - i;
        int i3 = 255;
        int i4 = length - 1;
        if (i > 0) {
            i4 = i - 1;
        }
        if ((bArr[i4] & 1) != 0) {
            i3 = 0;
        }
        byte b = (byte) i3;
        while (i < length) {
            bArr[i] = b;
            i++;
        }
        return i2;
    }

    public int BgR(byte[] bArr) {
        int length = bArr.length;
        int i = length - 1;
        byte b = bArr[i];
        while (i > 0 && bArr[i - 1] == b) {
            i--;
        }
        return length - i;
    }

    public void BFt(SecureRandom secureRandom) {
    }
}
