package X;

import java.security.SecureRandom;

/* renamed from: X.8Qf  reason: invalid class name and case insensitive filesystem */
public class C173448Qf implements C185188tE {
    public int Awh(byte[] bArr, int i) {
        int length = bArr.length;
        int i2 = length - i;
        byte b = Byte.MIN_VALUE;
        while (true) {
            bArr[i] = b;
            i++;
            if (i >= length) {
                return i2;
            }
            b = 0;
        }
    }

    public int BgR(byte[] bArr) {
        int length = bArr.length;
        int i = length;
        do {
            length--;
            if (length <= 0 || bArr[length] != 0) {
            }
            length--;
            break;
        } while (bArr[length] != 0);
        if (bArr[length] == Byte.MIN_VALUE) {
            return i - length;
        }
        throw new C177188eD("pad block corrupted");
    }

    public void BFt(SecureRandom secureRandom) {
    }
}
