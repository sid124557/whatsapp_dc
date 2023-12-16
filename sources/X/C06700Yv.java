package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: X.0Yv  reason: invalid class name and case insensitive filesystem */
public class C06700Yv implements Application.ActivityLifecycleCallbacks {
    public static void registerIn(Activity activity) {
        activity.registerActivityLifecycleCallbacks(new C06700Yv());
    }

    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        AnonymousClass00S.A01(activity, AnonymousClass0GH.ON_CREATE);
    }

    public void onActivityPostResumed(Activity activity) {
        AnonymousClass00S.A01(activity, AnonymousClass0GH.ON_RESUME);
    }

    public void onActivityPostStarted(Activity activity) {
        AnonymousClass00S.A01(activity, AnonymousClass0GH.ON_START);
    }

    public void onActivityPreDestroyed(Activity activity) {
        AnonymousClass00S.A01(activity, AnonymousClass0GH.ON_DESTROY);
    }

    public void onActivityPrePaused(Activity activity) {
        AnonymousClass00S.A01(activity, AnonymousClass0GH.ON_PAUSE);
    }

    public void onActivityPreStopped(Activity activity) {
        AnonymousClass00S.A01(activity, AnonymousClass0GH.ON_STOP);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
