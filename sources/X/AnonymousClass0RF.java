package X;

import android.app.Activity;
import android.app.ActivityOptions;
import android.util.Pair;
import android.view.View;

/* renamed from: X.0RF  reason: invalid class name */
public class AnonymousClass0RF {
    public static ActivityOptions A00(Activity activity, View view, String str) {
        return ActivityOptions.makeSceneTransitionAnimation(activity, view, str);
    }

    public static ActivityOptions A01(Activity activity, Pair... pairArr) {
        return ActivityOptions.makeSceneTransitionAnimation(activity, pairArr);
    }
}
