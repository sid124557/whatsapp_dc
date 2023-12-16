package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: X.5X4  reason: invalid class name */
public final class AnonymousClass5X4 {
    public static int A04;
    public static WeakReference A05;
    public ValueAnimator A00;
    public C101935Gv A01;
    public final C183538qC A02;
    public final C183538qC A03;

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

    public AnonymousClass5X4(C183538qC r1, C183538qC r2) {
        C18260x0.A0Q(r1, r2);
        this.A03 = r1;
        this.A02 = r2;
    }

    public final void A01(Animator.AnimatorListener animatorListener, View view, int i, int i2) {
        A00();
        ValueAnimator A06 = C86604Kt.A06(i, i2);
        this.A00 = A06;
        if (A06 != null) {
            C86604Kt.A0v(animatorListener, A06);
            A06.addUpdateListener(new AnonymousClass2AP(view, 3));
            A06.setStartDelay(0);
            A06.start();
        }
    }
}
