package X;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/* renamed from: X.2Uj  reason: invalid class name and case insensitive filesystem */
public class C44022Uj {
    public void A00(byte[] bArr) {
        try {
            SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr);
        } catch (NoSuchAlgorithmException e) {
            throw AnonymousClass0x9.A0i(e);
        }
    }
}
