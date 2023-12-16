package X;

import android.app.KeyguardManager;
import android.content.Context;

/* renamed from: X.0RD  reason: invalid class name */
public class AnonymousClass0RD {
    public static KeyguardManager A00(Context context) {
        return (KeyguardManager) context.getSystemService(KeyguardManager.class);
    }

    public static boolean A01(KeyguardManager keyguardManager) {
        return keyguardManager.isDeviceSecure();
    }
}
