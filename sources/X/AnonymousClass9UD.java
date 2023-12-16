package X;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.PublicKey;

/* renamed from: X.9UD  reason: invalid class name */
public class AnonymousClass9UD {
    public static String A00(String str) {
        return Base64.encodeToString(str.getBytes(C58152un.A0B), 11);
    }

    public static String A01(PublicKey publicKey) {
        Object[] A0L = AnonymousClass002.A0L();
        A0L[0] = Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(publicKey.getEncoded()), 11);
        return String.format("fp:%s", A0L);
    }
}
