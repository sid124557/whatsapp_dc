package X;

import android.animation.ValueAnimator;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: X.5RX  reason: invalid class name */
public final class AnonymousClass5RX {
    public static int A01;
    public static WeakReference A02;
    public ValueAnimator A00;

    public final void A01(View view, boolean z) {
        C162457s7.A0J(view, 0);
        if (!z) {
            A00();
            view.setVisibility(8);
        } else if (view.getVisibility() == 8) {
            A00();
        } else {
            int height = view.getHeight();
            AnonymousClass67L r0 = new AnonymousClass67L(view, 22);
            A00();
            ValueAnimator A06 = C86604Kt.A06(height, 0);
            this.A00 = A06;
            if (A06 != null) {
                C86604Kt.A0v(r0, A06);
                A06.setStartDelay(C86654Ky.A07(A06, view, 1, 0));
                A06.start();
            }
        }
    }

    public final void A00() {
        ValueAnimator valueAnimator = this.A00;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
        }
        ValueAnimator valueAnimator2 = this.A00;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator3 = this.A00;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
    }
}
