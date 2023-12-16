package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Iterator;

/* renamed from: X.4xl  reason: invalid class name and case insensitive filesystem */
public final class C97184xl extends C29451iq implements Application.ActivityLifecycleCallbacks {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97184xl(C183538qC r2) {
        super(r2);
        C162457s7.A0J(r2, 1);
    }

    public static Iterator A00(C61102zi r1, Object obj) {
        C162457s7.A0J(obj, 0);
        return r1.A05().iterator();
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        Iterator A00 = A00(this, activity);
        while (A00.hasNext()) {
            C86664Kz.A0R(A00).onActivityCreated(activity, bundle);
        }
    }

    public void onActivityDestroyed(Activity activity) {
        Iterator A00 = A00(this, activity);
        while (A00.hasNext()) {
            C86664Kz.A0R(A00).onActivityDestroyed(activity);
        }
    }

    public void onActivityPaused(Activity activity) {
        Iterator A00 = A00(this, activity);
        while (A00.hasNext()) {
            C86664Kz.A0R(A00).onActivityPaused(activity);
        }
    }

    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        Iterator A00 = A00(this, activity);
        while (A00.hasNext()) {
            C86664Kz.A0R(A00).onActivityPostCreated(activity, bundle);
        }
    }

    public void onActivityPostDestroyed(Activity activity) {
        Iterator A00 = A00(this, activity);
        while (A00.hasNext()) {
            C86664Kz.A0R(A00).onActivityPostDestroyed(activity);
        }
    }

    public void onActivityPostPaused(Activity activity) {
        Iterator A00 = A00(this, activity);
        while (A00.hasNext()) {
            C86664Kz.A0R(A00).onActivityPostPaused(activity);
        }
    }

    public void onActivityPostResumed(Activity activity) {
        Iterator A00 = A00(this, activity);
        while (A00.hasNext()) {
            C86664Kz.A0R(A00).onActivityPostResumed(activity);
        }
    }

    public void onActivityPostSaveInstanceState(Activity activity, Bundle bundle) {
        C18260x0.A0O(activity, bundle);
        Iterator A03 = C61102zi.A03(this);
        while (A03.hasNext()) {
            C86664Kz.A0R(A03).onActivityPostSaveInstanceState(activity, bundle);
        }
    }

    public void onActivityPostStarted(Activity activity) {
        Iterator A00 = A00(this, activity);
        while (A00.hasNext()) {
            C86664Kz.A0R(A00).onActivityPostStarted(activity);
        }
    }

    public void onActivityPostStopped(Activity activity) {
        Iterator A00 = A00(this, activity);
        while (A00.hasNext()) {
            C86664Kz.A0R(A00).onActivityPostStopped(activity);
        }
    }

    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        Iterator A00 = A00(this, activity);
        while (A00.hasNext()) {
            C86664Kz.A0R(A00).onActivityPreCreated(activity, bundle);
        }
    }

    public void onActivityPreDestroyed(Activity activity) {
        Iterator A00 = A00(this, activity);
        while (A00.hasNext()) {
            C86664Kz.A0R(A00).onActivityPreDestroyed(activity);
        }
    }

    public void onActivityPrePaused(Activity activity) {
        Iterator A00 = A00(this, activity);
        while (A00.hasNext()) {
            C86664Kz.A0R(A00).onActivityPrePaused(activity);
        }
    }

    public void onActivityPreResumed(Activity activity) {
        Iterator A00 = A00(this, activity);
        while (A00.hasNext()) {
            C86664Kz.A0R(A00).onActivityPreResumed(activity);
        }
    }

    public void onActivityPreSaveInstanceState(Activity activity, Bundle bundle) {
        C18260x0.A0O(activity, bundle);
        Iterator A03 = C61102zi.A03(this);
        while (A03.hasNext()) {
            C86664Kz.A0R(A03).onActivityPreSaveInstanceState(activity, bundle);
        }
    }

    public void onActivityPreStarted(Activity activity) {
        Iterator A00 = A00(this, activity);
        while (A00.hasNext()) {
            C86664Kz.A0R(A00).onActivityPreStarted(activity);
        }
    }

    public void onActivityPreStopped(Activity activity) {
        Iterator A00 = A00(this, activity);
        while (A00.hasNext()) {
            C86664Kz.A0R(A00).onActivityPreStopped(activity);
        }
    }

    public void onActivityResumed(Activity activity) {
        Iterator A00 = A00(this, activity);
        while (A00.hasNext()) {
            C86664Kz.A0R(A00).onActivityResumed(activity);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C18260x0.A0O(activity, bundle);
        Iterator A03 = C61102zi.A03(this);
        while (A03.hasNext()) {
            C86664Kz.A0R(A03).onActivitySaveInstanceState(activity, bundle);
        }
    }

    public void onActivityStarted(Activity activity) {
        Iterator A00 = A00(this, activity);
        while (A00.hasNext()) {
            C86664Kz.A0R(A00).onActivityStarted(activity);
        }
    }

    public void onActivityStopped(Activity activity) {
        Iterator A00 = A00(this, activity);
        while (A00.hasNext()) {
            C86664Kz.A0R(A00).onActivityStopped(activity);
        }
    }
}
