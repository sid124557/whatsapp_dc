package org.whispersystems.curve25519;

import X.AnonymousClass8RS;
import X.C185988uZ;
import X.C44022Uj;

public class NativeCurve25519Provider implements C185988uZ {
    public C44022Uj A00 = new C44022Uj();

    private native boolean smokeCheck(int i);

    public native byte[] calculateAgreement(byte[] bArr, byte[] bArr2);

    public native byte[] calculateSignature(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public native byte[] generatePrivateKey(byte[] bArr);

    public native byte[] generatePublicKey(byte[] bArr);

    public native boolean verifySignature(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public byte[] B3i() {
        byte[] bArr = new byte[32];
        this.A00.A00(bArr);
        return generatePrivateKey(bArr);
    }

    public byte[] BBq(int i) {
        byte[] bArr = new byte[64];
        this.A00.A00(bArr);
        return bArr;
    }

    public NativeCurve25519Provider() {
        try {
            smokeCheck(31337);
        } catch (UnsatisfiedLinkError e) {
            throw new AnonymousClass8RS(e);
        }
    }
}
