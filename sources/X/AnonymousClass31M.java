package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;

/* renamed from: X.31M  reason: invalid class name */
public final class AnonymousClass31M {
    public static final boolean A01(Context context, C53652nR r6) {
        C162457s7.A0J(r6, 1);
        if ((A00(context, "com.facebook.katana") != -1 || A00(context, "com.facebook.wakizashi") != -1 || A02(context, r6)) && r6.A02(5767)) {
            return true;
        }
        return false;
    }

    public static final boolean A02(Context context, C53652nR r6) {
        if (A00(context, "com.facebook.katana") != -1 || A00(context, "com.facebook.wakizashi") != -1 || AnonymousClass345.A00(context, "com.instagram.android") == -1 || !r6.A02(5987)) {
            return false;
        }
        return true;
    }

    public static long A00(Context context, String str) {
        ApplicationInfo applicationInfo;
        PackageInfo A01 = AnonymousClass345.A01(context, str);
        if (A01 == null || (applicationInfo = A01.applicationInfo) == null || !applicationInfo.enabled) {
            return -1;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return A01.getLongVersionCode();
        }
        return (long) A01.versionCode;
    }
}
