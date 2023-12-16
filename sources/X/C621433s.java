package X;

import android.app.Activity;
import android.os.Bundle;

/* renamed from: X.33s  reason: invalid class name and case insensitive filesystem */
public class C621433s {
    public static void A00(Activity activity, int i) {
        if (!A03(activity)) {
            activity.removeDialog(i);
        }
    }

    public static void A01(Activity activity, int i) {
        if (!A03(activity)) {
            activity.showDialog(i);
        }
    }

    public static void A02(Activity activity, Bundle bundle, int i) {
        if (!A03(activity)) {
            activity.showDialog(i, bundle);
        }
    }

    public static boolean A03(Activity activity) {
        if (activity.isFinishing() || activity.isChangingConfigurations() || activity.isDestroyed()) {
            return true;
        }
        return false;
    }
}
