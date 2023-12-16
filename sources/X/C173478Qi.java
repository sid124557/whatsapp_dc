package X;

import java.security.SecureRandom;

/* renamed from: X.8Qi  reason: invalid class name and case insensitive filesystem */
public class C173478Qi implements C185188tE {
    public int Awh(byte[] bArr, int i) {
        int length = bArr.length;
        int i2 = length - i;
        while (i < length) {
            bArr[i] = 0;
            i++;
        }
        return i2;
    }

    public int BgR(byte[] bArr) {
        int length = bArr.length;
        int i = length;
        while (length > 0 && bArr[length - 1] == 0) {
            length--;
        }
        return i - length;
    }

    public void BFt(SecureRandom secureRandom) {
    }
}
