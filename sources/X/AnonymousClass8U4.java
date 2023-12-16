package X;

import java.security.InvalidKeyException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactorySpi;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.8U4  reason: invalid class name */
public class AnonymousClass8U4 extends SecretKeyFactorySpi implements C180118kW {
    public String A00;
    public C176768dX A01;

    public SecretKey engineGenerateSecret(KeySpec keySpec) {
        if (keySpec instanceof SecretKeySpec) {
            return new SecretKeySpec(((SecretKeySpec) keySpec).getEncoded(), this.A00);
        }
        throw new InvalidKeySpecException("Invalid KeySpec");
    }

    public KeySpec engineGetKeySpec(SecretKey secretKey, Class cls) {
        if (cls == null) {
            throw new InvalidKeySpecException("keySpec parameter is null");
        } else if (secretKey == null) {
            throw new InvalidKeySpecException("key parameter is null");
        } else if (SecretKeySpec.class.isAssignableFrom(cls)) {
            return new SecretKeySpec(secretKey.getEncoded(), this.A00);
        } else {
            try {
                return (KeySpec) cls.getConstructor(new Class[]{byte[].class}).newInstance(new Object[]{secretKey.getEncoded()});
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        }
    }

    public SecretKey engineTranslateKey(SecretKey secretKey) {
        if (secretKey != null) {
            String algorithm = secretKey.getAlgorithm();
            String str = this.A00;
            if (algorithm.equalsIgnoreCase(str)) {
                return new SecretKeySpec(secretKey.getEncoded(), str);
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Key not of type ");
            A0o.append(str);
            throw new InvalidKeyException(AnonymousClass000.A0X(".", A0o));
        }
        throw new InvalidKeyException("key parameter is null");
    }

    public AnonymousClass8U4(String str, C176768dX r2) {
        this.A00 = str;
        this.A01 = r2;
    }
}
