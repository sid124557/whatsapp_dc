package X;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.7R4  reason: invalid class name */
public class AnonymousClass7R4 {
    public void A00(byte[] bArr, byte[] bArr2, long j) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-512");
            instance.update(bArr2, 0, (int) j);
            byte[] digest = instance.digest();
            System.arraycopy(digest, 0, bArr, 0, digest.length);
        } catch (NoSuchAlgorithmException e) {
            throw AnonymousClass0x9.A0i(e);
        }
    }
}
