package X;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

/* renamed from: X.0Uq  reason: invalid class name and case insensitive filesystem */
public final class C05720Uq {
    public static int A00(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C05700Uo.A00((AppOpsManager) C05700Uo.A01(context, AppOpsManager.class), str, str2);
        }
        return 1;
    }

    public static int A01(Context context, String str, String str2, int i) {
        if (Build.VERSION.SDK_INT < 29) {
            return A00(context, str, str2);
        }
        AppOpsManager A01 = C05710Up.A01(context);
        int A00 = C05710Up.A00(A01, str, str2, Binder.getCallingUid());
        if (A00 == 0) {
            return C05710Up.A00(A01, str, C05710Up.A02(context), i);
        }
        return A00;
    }

    public static String A02(String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C05700Uo.A02(str);
        }
        return null;
    }
}
