package X;

import android.view.View;
import android.view.animation.ScaleAnimation;

/* renamed from: X.5VQ  reason: invalid class name */
public class AnonymousClass5VQ {
    public static void A01(View view, boolean z, boolean z2) {
        A00(view, 125, z, z2);
    }

    public static void A00(View view, int i, boolean z, boolean z2) {
        int visibility = view.getVisibility();
        if (z) {
            if (visibility != 0) {
                view.setVisibility(0);
                if (z2) {
                    ScaleAnimation A0Q = C86634Kw.A0Q(0.0f, 1.0f);
                    C86604Kt.A1I(A0Q, (long) i);
                    A0Q.setFillBefore(true);
                    view.startAnimation(A0Q);
                }
            }
        } else if (visibility == 0) {
            if (z2) {
                ScaleAnimation A0Q2 = C86634Kw.A0Q(1.0f, 0.0f);
                C86604Kt.A1I(A0Q2, (long) i);
                A0Q2.setFillBefore(true);
                view.startAnimation(A0Q2);
            }
            view.setVisibility(4);
        }
    }
}
