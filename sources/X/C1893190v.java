package X;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.whatsapp.mediacomposer.VideoComposerFragment;

/* renamed from: X.90v  reason: invalid class name and case insensitive filesystem */
public class C1893190v implements View.OnAttachStateChangeListener {
    public Object A00;
    public final int A01;

    public C1893190v(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        if (this.A01 == 0) {
            AnonymousClass6Ff r2 = (AnonymousClass6Ff) this.A00;
            if (r2.A0A != null && (accessibilityManager = r2.A0E) != null && C06360Xi.A04(r2)) {
                C05010Rn.A00(accessibilityManager, r2.A0A);
            }
        }
    }

    public void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        if (this.A01 == 0) {
            AnonymousClass6Ff r0 = (AnonymousClass6Ff) this.A00;
            C15850s3 r1 = r0.A0A;
            if (r1 != null && (accessibilityManager = r0.A0E) != null) {
                C05010Rn.A01(accessibilityManager, r1);
            }
        } else if (view != null) {
            VideoComposerFragment videoComposerFragment = (VideoComposerFragment) this.A00;
            view.removeCallbacks(videoComposerFragment.A0i);
            view.removeOnAttachStateChangeListener(videoComposerFragment.A0h);
        }
    }
}
