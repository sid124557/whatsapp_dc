package X;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;

/* renamed from: X.0jG  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C11200jG implements Runnable {
    public final /* synthetic */ AnonymousClass0Og A00;

    public final void run() {
        AnonymousClass0Og r2 = this.A00;
        FrameLayout frameLayout = r2.A00;
        if (frameLayout != null) {
            ViewParent parent = frameLayout.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(r2.A00);
            }
            r2.A00.removeAllViews();
        }
    }

    public /* synthetic */ C11200jG(AnonymousClass0Og r1) {
        this.A00 = r1;
    }
}
