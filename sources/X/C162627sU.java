package X;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.7sU  reason: invalid class name and case insensitive filesystem */
public class C162627sU implements Application.ActivityLifecycleCallbacks {
    public void onActivityCreated(Activity activity, Bundle bundle) {
        synchronized (C155577f8.A01) {
            if (C155577f8.A03.containsKey(activity)) {
                throw AnonymousClass001.A0e("The MountContentPools has a reference to an activity that has just been created");
            }
        }
    }

    public void onActivityDestroyed(Activity activity) {
        synchronized (C155577f8.A01) {
            Map map = C155577f8.A03;
            map.remove(activity);
            Iterator A0q = AnonymousClass000.A0q(map);
            while (A0q.hasNext()) {
                Context context = (Context) AnonymousClass001.A0w(A0q).getKey();
                Context context2 = activity;
                while (context2 instanceof ContextWrapper) {
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
                while (context instanceof ContextWrapper) {
                    context = ((ContextWrapper) context).getBaseContext();
                }
                if (context == context2) {
                    A0q.remove();
                }
            }
            WeakHashMap weakHashMap = C155577f8.A04;
            Context context3 = activity;
            while ((context3 instanceof ContextWrapper) && !(context3 instanceof Activity) && !(context3 instanceof Application) && !(context3 instanceof Service)) {
                context3 = ((ContextWrapper) context3).getBaseContext();
            }
            weakHashMap.put(context3, Boolean.TRUE);
        }
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
