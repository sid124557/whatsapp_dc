package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* renamed from: X.341  reason: invalid class name */
public class AnonymousClass341 {
    public static String A00() {
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder A0o = AnonymousClass001.A0o();
        int i = 0;
        do {
            A0o.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+{}".charAt(secureRandom.nextInt(76)));
            i++;
        } while (i < 50);
        return A0o.toString();
    }

    public static KeyPair A04() {
        KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA");
        instance.initialize(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
        return instance.generateKeyPair();
    }

    public static PublicKey A05(String str) {
        if (!str.startsWith("-----BEGIN PUBLIC KEY-----\n") || !str.endsWith("\n-----END PUBLIC KEY-----\n")) {
            throw new InvalidKeySpecException("malformed string");
        }
        return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(AnonymousClass0x7.A1X(str.substring(26, str.length() - 26))));
    }

    public static String A01(KeyPair keyPair) {
        String A02 = A02(keyPair.getPublic());
        C162457s7.A0D(A02);
        return A02;
    }

    public static String A02(PublicKey publicKey) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("-----BEGIN PUBLIC KEY-----\n");
        A0o.append(C18290x4.A0t(publicKey.getEncoded()));
        return AnonymousClass000.A0X("\n-----END PUBLIC KEY-----\n", A0o);
    }

    public static KeyPair A03() {
        KeyPair A04 = A04();
        C162457s7.A0H(A04);
        return A04;
    }
}
