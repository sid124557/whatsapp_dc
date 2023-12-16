package X;

import java.security.PublicKey;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;

/* renamed from: X.34Q  reason: invalid class name */
public class AnonymousClass34Q {
    public byte[] A00 = null;
    public byte[] A01 = null;

    public static String A01(String str) {
        String[] A1b = C18320x8.A1b(str);
        String A0X = AnonymousClass000.A0X("=", AnonymousClass000.A0l("CN"));
        for (String trim : A1b) {
            String trim2 = trim.trim();
            if (trim2.startsWith(A0X)) {
                return C18320x8.A0f(A0X, trim2);
            }
        }
        return null;
    }

    public static byte[] A02(PublicKey publicKey, SecretKey secretKey) {
        Cipher instance = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
        instance.init(1, publicKey, new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT));
        return instance.doFinal(secretKey.getEncoded());
    }

    public static final C42152Mz A00(String str) {
        SecretKey A15 = C18290x4.A15();
        IvParameterSpec A0D = C18330xA.A0D(AnonymousClass29O.A01(16));
        byte[] bytes = str.getBytes();
        Cipher A0v = C18320x8.A0v();
        A0v.init(1, A15, A0D);
        return new C42152Mz(A15, A0v.doFinal(bytes), A0v.getIV());
    }
}
