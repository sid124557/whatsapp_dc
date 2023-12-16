package X;

import android.os.Build;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;

/* renamed from: X.34H  reason: invalid class name */
public class AnonymousClass34H {
    public static Set A00 = Collections.singleton("Crypto");
    public static final Set A01;

    public static Object A00(Object obj, String str, String str2) {
        if (Build.VERSION.SDK_INT < 28) {
            Iterator it = A01.iterator();
            while (true) {
                if (it.hasNext()) {
                    String A0m = AnonymousClass001.A0m(it);
                    try {
                        if (!A0m.equals(str2)) {
                            if (obj instanceof SecureRandom) {
                                return SecureRandom.getInstance(str, A0m);
                            }
                            if (obj instanceof Cipher) {
                                return Cipher.getInstance(str, A0m);
                            }
                            if (obj instanceof KeyGenerator) {
                                return KeyGenerator.getInstance(str, A0m);
                            }
                            throw AnonymousClass001.A0c("Unknown instance type");
                        }
                    } catch (IllegalArgumentException | NoSuchAlgorithmException | NoSuchProviderException | NoSuchPaddingException e) {
                        e.getMessage();
                    }
                } else if (A00.contains(str2)) {
                    C18260x0.A0q("SecureCryptoInstance/tryBestProvider/using insecure provider: ", str2, AnonymousClass001.A0o());
                }
            }
        }
        return obj;
    }

    public static SecureRandom A01() {
        if (Build.VERSION.SDK_INT >= 26) {
            return SecureRandom.getInstanceStrong();
        }
        SecureRandom instance = SecureRandom.getInstance("SHA1PRNG");
        return (SecureRandom) A00(instance, "SHA1PRNG", instance.getProvider().getName());
    }

    static {
        LinkedHashSet A17 = AnonymousClass0x9.A17();
        A01 = A17;
        A17.add("GmsCore_OpenSSL");
        A17.add("AndroidOpenSSL");
    }
}
