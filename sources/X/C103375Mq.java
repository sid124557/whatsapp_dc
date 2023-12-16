package X;

import android.animation.ValueAnimator;
import java.lang.ref.WeakReference;

/* renamed from: X.5Mq  reason: invalid class name and case insensitive filesystem */
public final class C103375Mq {
    public static int A01;
    public static WeakReference A02;
    public ValueAnimator A00;

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
