package X;

import android.os.Build;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.spec.ECGenParameterSpec;

/* renamed from: X.9Qf  reason: invalid class name and case insensitive filesystem */
public class C193829Qf {
    public final C201619kR A00 = new C201619kR(new C201579kN());

    public AnonymousClass0PJ A00() {
        KeyPair generateKeyPair;
        Boolean bool;
        AnonymousClass9R1 r2 = (AnonymousClass9R1) this.A00.get();
        if (Build.VERSION.SDK_INT < 23 || r2 == null || (generateKeyPair = r2.A00()) == null) {
            ECGenParameterSpec eCGenParameterSpec = new ECGenParameterSpec("secp256r1");
            KeyPairGenerator instance = KeyPairGenerator.getInstance("EC");
            instance.initialize(eCGenParameterSpec);
            generateKeyPair = instance.generateKeyPair();
            bool = Boolean.FALSE;
        } else {
            bool = Boolean.TRUE;
        }
        return AnonymousClass0x9.A0G(generateKeyPair, bool);
    }
}
