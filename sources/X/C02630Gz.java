package X;

import android.content.Context;
import android.os.Build;

/* renamed from: X.0Gz  reason: invalid class name and case insensitive filesystem */
public class C02630Gz {
    public static boolean A00(Context context) {
        if (Build.VERSION.SDK_INT < 23 || context == null || context.getPackageManager() == null || !C02620Gy.A00(context.getPackageManager())) {
            return false;
        }
        return true;
    }
}
