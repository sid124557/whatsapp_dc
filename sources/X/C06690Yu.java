package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* renamed from: X.0Yu  reason: invalid class name and case insensitive filesystem */
public final class C06690Yu implements Application.ActivityLifecycleCallbacks {
    public Activity A00;
    public Object A01;
    public boolean A02 = false;
    public boolean A03 = false;
    public boolean A04 = false;
    public final int A05;

    public void onActivityDestroyed(Activity activity) {
        if (this.A00 == activity) {
            this.A00 = null;
            this.A02 = true;
        }
    }

    public void onActivityPaused(Activity activity) {
        if (this.A02 && !this.A04 && !this.A03) {
            Object obj = this.A01;
            int i = this.A05;
            try {
                Object obj2 = C05250Sp.A02.get(activity);
                if (obj2 == obj && activity.hashCode() == i) {
                    C05250Sp.A00.postAtFrontOfQueue(new C11810kF(C05250Sp.A01.get(activity), obj2));
                    this.A04 = true;
                    this.A01 = null;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th);
            }
        }
    }

    public void onActivityStarted(Activity activity) {
        if (this.A00 == activity) {
            this.A03 = true;
        }
    }

    public C06690Yu(Activity activity) {
        this.A00 = activity;
        this.A05 = activity.hashCode();
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
