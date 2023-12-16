package X;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.spec.ECGenParameterSpec;

/* renamed from: X.9LM  reason: invalid class name */
public class AnonymousClass9LM {
    public static PublicKey A00() {
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
            KeyGenParameterSpec.Builder userAuthenticationRequired = new KeyGenParameterSpec.Builder("payment_bio_key_alias", 4).setDigests(new String[]{"SHA-256"}).setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1")).setUserAuthenticationRequired(true);
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                userAuthenticationRequired.setUserAuthenticationParameters(0, 2);
            } else {
                userAuthenticationRequired.setUserAuthenticationValidityDurationSeconds(-1);
            }
            if (i >= 24) {
                userAuthenticationRequired.setInvalidatedByBiometricEnrollment(true);
            }
            instance.initialize(userAuthenticationRequired.build());
            return instance.generateKeyPair().getPublic();
        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("FingerprintHelper/generateKey generateKey: api=");
            throw new RuntimeException(AnonymousClass000.A0h(A0o, Build.VERSION.SDK_INT), e);
        }
    }
}
