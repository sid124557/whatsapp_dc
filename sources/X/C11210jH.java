package X;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;

/* renamed from: X.0jH  reason: invalid class name and case insensitive filesystem */
public final class C11210jH implements Runnable {
    public final /* synthetic */ AnonymousClass0Oh A00;

    public C11210jH(AnonymousClass0Oh r1) {
        this.A00 = r1;
    }

    public final void run() {
        FrameLayout frameLayout = this.A00.A00;
        if (frameLayout != null) {
            ViewParent parent = frameLayout.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(frameLayout);
                frameLayout.removeAllViews();
            }
        }
    }
}
