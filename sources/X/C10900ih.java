package X;

import android.app.Activity;

/* renamed from: X.0ih  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C10900ih implements Runnable {
    public final /* synthetic */ Activity A00;

    public final void run() {
        Activity activity = this.A00;
        if (!activity.isFinishing() && !C05250Sp.A00(activity)) {
            activity.recreate();
        }
    }

    public /* synthetic */ C10900ih(Activity activity) {
        this.A00 = activity;
    }
}
