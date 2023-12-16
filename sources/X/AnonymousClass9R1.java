package X;

import android.security.keystore.KeyGenParameterSpec;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.spec.ECGenParameterSpec;

/* renamed from: X.9R1  reason: invalid class name */
public class AnonymousClass9R1 {
    public final C160757oG A00 = C160757oG.A00("Secp256r1KeyStoreHelper", "infra", "COMMON");
    public final KeyStore A01;

    public KeyPair A00() {
        try {
            KeyGenParameterSpec build = new KeyGenParameterSpec.Builder("alias-payments-br-trusted-device-key", 4).setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1")).setKeySize(256).setDigests(new String[]{"SHA-256"}).build();
            KeyPairGenerator instance = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
            instance.initialize(build);
            return instance.generateKeyPair();
        } catch (Exception e) {
            this.A00.A0A("", e);
            return null;
        }
    }

    public AnonymousClass9R1(KeyStore keyStore) {
        this.A01 = keyStore;
    }
}
