package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.whatsapp.videoplayback.BloksVideoPlayerView;

/* renamed from: X.92H  reason: invalid class name */
public class AnonymousClass92H implements Application.ActivityLifecycleCallbacks {
    public Object A00;
    public final int A01;

    public AnonymousClass92H(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onActivityDestroyed(Activity activity) {
        if (this.A01 == 0) {
            AnonymousClass7TS r1 = (AnonymousClass7TS) this.A00;
            if (activity == r1.A01.get()) {
                r1.A00();
            }
        }
    }

    public void onActivityPaused(Activity activity) {
        switch (this.A01) {
            case 0:
                return;
            case 1:
                AnonymousClass4GP r0 = ((AnonymousClass7OZ) this.A00).A00;
                if (r0 != null) {
                    r0.invoke();
                    return;
                }
                return;
            default:
                BloksVideoPlayerView bloksVideoPlayerView = (BloksVideoPlayerView) this.A00;
                C152437Yw r02 = bloksVideoPlayerView.A0A;
                bloksVideoPlayerView.A0A = new C152437Yw(r02.A01, r02.A02, false);
                bloksVideoPlayerView.A02();
                return;
        }
    }

    public void onActivityResumed(Activity activity) {
        switch (this.A01) {
            case 0:
                return;
            case 1:
                AnonymousClass4GP r0 = ((AnonymousClass7OZ) this.A00).A01;
                if (r0 != null) {
                    r0.invoke();
                    return;
                }
                return;
            default:
                BloksVideoPlayerView bloksVideoPlayerView = (BloksVideoPlayerView) this.A00;
                C152437Yw r02 = bloksVideoPlayerView.A0A;
                bloksVideoPlayerView.A0A = new C152437Yw(r02.A01, r02.A02, true);
                bloksVideoPlayerView.A02();
                return;
        }
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
