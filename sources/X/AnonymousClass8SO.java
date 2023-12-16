package X;

import java.security.AlgorithmParameterGeneratorSpi;
import java.security.SecureRandom;

/* renamed from: X.8SO  reason: invalid class name */
public abstract class AnonymousClass8SO extends AlgorithmParameterGeneratorSpi {
    public SecureRandom A00;
    public final C180128kX A01 = new C173558Qq();

    public void engineInit(int i, SecureRandom secureRandom) {
        this.A00 = secureRandom;
    }
}
