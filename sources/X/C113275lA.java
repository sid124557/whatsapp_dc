package X;

import android.app.Activity;
import com.whatsapp.deeplink.DeepLinkActivity;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.5lA  reason: invalid class name and case insensitive filesystem */
public class C113275lA implements AnonymousClass4E7 {
    public final /* synthetic */ DeepLinkActivity A00;
    public final /* synthetic */ WeakReference A01;

    public C113275lA(DeepLinkActivity deepLinkActivity, WeakReference weakReference) {
        this.A00 = deepLinkActivity;
        this.A01 = weakReference;
    }

    public void BZH() {
    }

    public void Bdo(AnonymousClass304 r3) {
        String str;
        if (r3 != null) {
            int i = r3.A00;
            if (i == 0) {
                str = "Conversation/createSyncContactTaskCallback/onSyncCompleted/NETWORK_UNAVAILABLE/";
            } else if (i == 4) {
                str = "Conversation/createSyncContactTaskCallback/onSyncCompleted/SYNC_REQUEST_FAILED/";
            }
            Log.w(str);
        }
        Activity activity = (Activity) this.A01.get();
        if (activity != null && !C621433s.A03(activity)) {
            activity.finish();
        }
    }

    public /* synthetic */ void Bdp() {
    }
}
