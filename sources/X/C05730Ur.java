package X;

import android.app.Activity;
import android.content.Intent;

/* renamed from: X.0Ur  reason: invalid class name and case insensitive filesystem */
public class C05730Ur {
    public static Intent A00(Activity activity) {
        return activity.getParentActivityIntent();
    }

    public static void A01(Activity activity, Intent intent) {
        activity.navigateUpTo(intent);
    }

    public static boolean A02(Activity activity, Intent intent) {
        return activity.shouldUpRecreateTask(intent);
    }
}
