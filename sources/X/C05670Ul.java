package X;

import android.hardware.biometrics.BiometricPrompt;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: X.0Ul  reason: invalid class name and case insensitive filesystem */
public class C05670Ul {
    public static BiometricPrompt.CryptoObject A00(Signature signature) {
        return new BiometricPrompt.CryptoObject(signature);
    }

    public static BiometricPrompt.CryptoObject A01(Cipher cipher) {
        return new BiometricPrompt.CryptoObject(cipher);
    }

    public static BiometricPrompt.CryptoObject A02(Mac mac) {
        return new BiometricPrompt.CryptoObject(mac);
    }
}
