package X;

import java.security.InvalidParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGeneratorSpi;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.8U2  reason: invalid class name */
public class AnonymousClass8U2 extends KeyGeneratorSpi {
    public int A00;
    public String A01;
    public AnonymousClass7W0 A02;
    public boolean A03 = true;

    public SecretKey engineGenerateKey() {
        if (this.A03) {
            this.A02.A00(new C148407Ig(this.A00, C161657qB.A00()));
            this.A03 = false;
        }
        return new SecretKeySpec(this.A02.A01(), this.A01);
    }

    public void engineInit(int i, SecureRandom secureRandom) {
        if (secureRandom == null) {
            try {
                secureRandom = C161657qB.A00();
            } catch (IllegalArgumentException e) {
                throw new InvalidParameterException(e.getMessage());
            }
        }
        this.A02.A00(new C148407Ig(i, secureRandom));
        this.A03 = false;
    }

    public AnonymousClass8U2(String str, AnonymousClass7W0 r3, int i) {
        this.A01 = str;
        this.A00 = i;
        this.A02 = r3;
    }

    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        throw AnonymousClass6CA.A0Z("Not Implemented");
    }

    public void engineInit(SecureRandom secureRandom) {
        if (secureRandom != null) {
            this.A02.A00(new C148407Ig(this.A00, secureRandom));
            this.A03 = false;
        }
    }
}
