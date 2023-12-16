package X;

import java.security.SecureRandom;

/* renamed from: X.8Qk  reason: invalid class name and case insensitive filesystem */
public class C173498Qk implements C185188tE {
    public SecureRandom A00 = null;

    public int Awh(byte[] bArr, int i) {
        byte nextInt;
        int length = bArr.length;
        byte b = (byte) (length - i);
        while (i < length - 1) {
            SecureRandom secureRandom = this.A00;
            if (secureRandom == null) {
                nextInt = 0;
            } else {
                nextInt = (byte) secureRandom.nextInt();
            }
            bArr[i] = nextInt;
            i++;
        }
        bArr[i] = b;
        return b;
    }

    public int BgR(byte[] bArr) {
        int length = bArr.length;
        byte b = bArr[length - 1] & 255;
        if (b <= length) {
            return b;
        }
        throw new C177188eD("pad block corrupted");
    }

    public void BFt(SecureRandom secureRandom) {
        this.A00 = secureRandom;
    }
}
