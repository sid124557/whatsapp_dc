package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* renamed from: X.9M2  reason: invalid class name */
public final class AnonymousClass9M2 {
    public static Boolean A00;

    public static boolean A00(Context context) {
        boolean z = true;
        Boolean bool = A00;
        if (bool == null) {
            int i = Build.VERSION.SDK_INT;
            if (i > 29) {
                bool = Boolean.TRUE;
            } else if (i < 24) {
                bool = Boolean.FALSE;
            } else {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || !packageManager.hasSystemFeature("android.hardware.camera.level.full")) {
                    z = false;
                }
                bool = Boolean.valueOf(z);
            }
            A00 = bool;
        }
        return bool.booleanValue();
    }
}
