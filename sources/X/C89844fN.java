package X;

import android.app.Activity;
import android.os.Bundle;
import com.whatsapp.util.Log;

/* renamed from: X.4fN  reason: invalid class name and case insensitive filesystem */
public class C89844fN extends AnonymousClass5c4 {
    public final C183538qC A00;

    public C89844fN(C183538qC r1) {
        this.A00 = r1;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        super.onActivityCreated(activity, bundle);
        if ((activity instanceof C89644eZ) && ((C625835r) this.A00.get()).A0Z()) {
            Log.i("LockedForBackupLifecycleObserver/onActivityCreated redirect to BlockingUserInteractionActivity");
            activity.startActivity(C86624Kv.A06(activity, 0));
            activity.finish();
        }
    }

    public void onActivityStarted(Activity activity) {
        super.onActivityStarted(activity);
        if ((activity instanceof C89644eZ) && ((C625835r) this.A00.get()).A0Z()) {
            Log.i("LockedForBackupLifecycleObserver/onActivityStarted redirect to BlockingUserInteractionActivity");
            activity.startActivity(C86624Kv.A06(activity, 0));
            activity.finish();
        }
    }
}
