package X;

import com.facebook.msys.mci.DefaultCrypto;

/* renamed from: X.25n  reason: invalid class name and case insensitive filesystem */
public class C380825n {
    public static byte[] A00(byte[] bArr, byte[] bArr2) {
        return AnonymousClass0x2.A0k(DefaultCrypto.HMAC_SHA256, bArr2).doFinal(bArr);
    }
}
