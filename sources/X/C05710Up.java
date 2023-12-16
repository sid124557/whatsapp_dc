package X;

import android.app.AppOpsManager;
import android.content.Context;

/* renamed from: X.0Up  reason: invalid class name and case insensitive filesystem */
public class C05710Up {
    public static int A00(AppOpsManager appOpsManager, String str, String str2, int i) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i, str2);
    }

    public static AppOpsManager A01(Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }

    public static String A02(Context context) {
        return context.getOpPackageName();
    }
}
