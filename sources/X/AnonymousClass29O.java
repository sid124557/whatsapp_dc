package X;

import android.os.Build;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/* renamed from: X.29O  reason: invalid class name */
public class AnonymousClass29O {
    public static SecureRandom A00() {
        if (Build.VERSION.SDK_INT < 26) {
            return new SecureRandom();
        }
        try {
            return SecureRandom.getInstanceStrong();
        } catch (NoSuchAlgorithmException unused) {
            return new SecureRandom();
        }
    }

    public static byte[] A01(int i) {
        byte[] bArr = new byte[i];
        A00().nextBytes(bArr);
        return bArr;
    }
}
