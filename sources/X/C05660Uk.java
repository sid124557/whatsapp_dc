package X;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import java.lang.reflect.Method;

/* renamed from: X.0Uk  reason: invalid class name and case insensitive filesystem */
public class C05660Uk {
    public static BiometricManager A01(Context context) {
        return (BiometricManager) context.getSystemService(BiometricManager.class);
    }

    public static Method A02() {
        try {
            return AnonymousClass001.A0r(BiometricManager.class, BiometricPrompt.CryptoObject.class, "canAuthenticate", new Class[1], 0);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static int A00(BiometricManager biometricManager) {
        return biometricManager.canAuthenticate();
    }
}
