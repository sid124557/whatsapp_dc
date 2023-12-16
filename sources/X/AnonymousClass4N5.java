package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.ViewGroup;
import android.view.Window;

/* renamed from: X.4N5  reason: invalid class name */
public final class AnonymousClass4N5 extends Fade {
    public final /* synthetic */ Window A00;
    public final /* synthetic */ AnonymousClass7ZM A01;

    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        float f;
        C162457s7.A0J(viewGroup, 0);
        C18260x0.A0Q(transitionValues, transitionValues2);
        Animator createAnimator = super.createAnimator(viewGroup, transitionValues, transitionValues2);
        C162457s7.A0K(createAnimator, "null cannot be cast to non-null type android.animation.ObjectAnimator");
        ObjectAnimator objectAnimator = (ObjectAnimator) createAnimator;
        AnonymousClass7ZM r4 = this.A01;
        if (r4.A01 != 0) {
            Window window = this.A00;
            objectAnimator.addUpdateListener(new C107845bz(objectAnimator, window, r4, window.getStatusBarColor()));
            int navigationBarColor = window.getNavigationBarColor();
            int i = r4.A00;
            Number number = (Number) objectAnimator.getAnimatedValue();
            if (number != null) {
                f = number.floatValue();
            } else {
                f = 0.0f;
            }
            window.setNavigationBarColor(AnonymousClass0YI.A03(f, i, navigationBarColor));
        }
        return objectAnimator;
    }

    public AnonymousClass4N5(Window window, AnonymousClass7ZM r2) {
        this.A01 = r2;
        this.A00 = window;
    }
}
