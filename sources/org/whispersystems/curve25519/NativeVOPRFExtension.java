package org.whispersystems.curve25519;

import X.C44022Uj;

public class NativeVOPRFExtension {
    public C44022Uj A00 = new C44022Uj();

    private native byte[] nativeBlind(byte[] bArr, int i, byte[] bArr2, int i2);

    private native boolean nativeIsValid(byte[] bArr, int i);

    private native byte[] nativeUnBlind(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3);

    public boolean A00(byte[] bArr) {
        try {
            return nativeIsValid(bArr, 32);
        } catch (SecurityException | UnsatisfiedLinkError unused) {
            return false;
        }
    }

    public byte[] A02(byte[] bArr, byte[] bArr2, int i) {
        try {
            return nativeBlind(bArr, i, bArr2, 32);
        } catch (SecurityException | UnsatisfiedLinkError unused) {
            return null;
        }
    }

    public byte[] A01(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3) {
        try {
            return nativeUnBlind(bArr, i, bArr2, i2, bArr3, i3);
        } catch (SecurityException | UnsatisfiedLinkError unused) {
            return null;
        }
    }
}
