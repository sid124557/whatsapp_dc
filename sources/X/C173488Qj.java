package X;

import java.security.SecureRandom;

/* renamed from: X.8Qj  reason: invalid class name and case insensitive filesystem */
public class C173488Qj implements C185188tE {
    public SecureRandom A00;

    public int Awh(byte[] bArr, int i) {
        int length = bArr.length;
        byte b = (byte) (length - i);
        while (i < length - 1) {
            i = AnonymousClass6CA.A0A(bArr, this.A00.nextInt(), i);
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
        if (secureRandom == null) {
            secureRandom = C161657qB.A00();
        }
        this.A00 = secureRandom;
    }
}
