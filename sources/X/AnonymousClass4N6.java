package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Map;

/* renamed from: X.4N6  reason: invalid class name */
public final class AnonymousClass4N6 extends Fade {
    public final /* synthetic */ float A00;
    public final /* synthetic */ Window A01;
    public final /* synthetic */ AnonymousClass7ZM A02;

    public void captureStartValues(TransitionValues transitionValues) {
        C162457s7.A0J(transitionValues, 0);
        super.captureStartValues(transitionValues);
        float f = this.A00;
        if (f != 0.0f) {
            Map map = transitionValues.values;
            C162457s7.A0C(map);
            map.put("android:fade:transitionAlpha", Float.valueOf(f));
        }
    }

    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        C162457s7.A0J(viewGroup, 0);
        C18260x0.A0Q(transitionValues, transitionValues2);
        Animator createAnimator = super.createAnimator(viewGroup, transitionValues, transitionValues2);
        C162457s7.A0K(createAnimator, "null cannot be cast to non-null type android.animation.ObjectAnimator");
        ObjectAnimator objectAnimator = (ObjectAnimator) createAnimator;
        AnonymousClass7ZM r3 = this.A02;
        if (r3.A03 != 0) {
            objectAnimator.addUpdateListener(new C107835by(objectAnimator, this.A01, r3, this.A00));
        }
        return objectAnimator;
    }

    public AnonymousClass4N6(Window window, AnonymousClass7ZM r2, float f) {
        this.A00 = f;
        this.A02 = r2;
        this.A01 = window;
    }
}
