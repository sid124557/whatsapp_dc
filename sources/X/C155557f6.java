package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* renamed from: X.7f6  reason: invalid class name and case insensitive filesystem */
public final class C155557f6 {
    public static Boolean A00;
    public static Boolean A01;
    public static Boolean A02;
    public static Boolean A03;

    public static boolean A00(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Boolean bool = A00;
        if (bool == null) {
            boolean z = false;
            if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z = true;
            }
            bool = Boolean.valueOf(z);
            A00 = bool;
        }
        if (bool.booleanValue() && Build.VERSION.SDK_INT < 24) {
            return true;
        }
        Boolean bool2 = A01;
        if (bool2 == null) {
            boolean z2 = false;
            if (context.getPackageManager().hasSystemFeature("cn.google")) {
                z2 = true;
            }
            bool2 = Boolean.valueOf(z2);
            A01 = bool2;
        }
        if (!bool2.booleanValue()) {
            return false;
        }
        if (!C154017cR.A00() || C154017cR.A01()) {
            return true;
        }
        return false;
    }
}
