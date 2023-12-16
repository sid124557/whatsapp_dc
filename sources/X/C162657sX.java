package X;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;

/* renamed from: X.7sX  reason: invalid class name and case insensitive filesystem */
public class C162657sX implements ComponentCallbacks {
    public final /* synthetic */ AnonymousClass4PH A00;

    public C162657sX(AnonymousClass4PH r1) {
        this.A00 = r1;
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        this.A00.A05();
    }
}
