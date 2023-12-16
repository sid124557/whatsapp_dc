package X;

import android.hardware.biometrics.BiometricPrompt;
import android.security.identity.IdentityCredential;

/* renamed from: X.0RB  reason: invalid class name */
public class AnonymousClass0RB {
    public static BiometricPrompt.CryptoObject A00(IdentityCredential identityCredential) {
        return new BiometricPrompt.CryptoObject(identityCredential);
    }

    public static IdentityCredential A01(BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getIdentityCredential();
    }
}
