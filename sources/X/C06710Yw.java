package X;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;

/* renamed from: X.0Yw  reason: invalid class name and case insensitive filesystem */
public final class C06710Yw implements ComponentCallbacks {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C08870fF A01;

    public C06710Yw(Activity activity, C08870fF r2) {
        this.A01 = r2;
        this.A00 = activity;
    }

    public void onConfigurationChanged(Configuration configuration) {
        C08870fF r0 = this.A01;
        C16110sU r2 = r0.A00;
        if (r2 != null) {
            Activity activity = this.A00;
            r2.Bfq(activity, r0.A00(activity));
        }
    }

    public void onLowMemory() {
    }
}
