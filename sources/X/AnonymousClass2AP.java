package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.2AP  reason: invalid class name */
public class AnonymousClass2AP implements ValueAnimator.AnimatorUpdateListener {
    public Object A00;
    public final int A01;

    public AnonymousClass2AP(View view, int i) {
        this.A01 = i;
        this.A00 = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.A01 != 0) {
            View view = (View) this.A00;
            C162457s7.A0J(valueAnimator, 1);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Object animatedValue = valueAnimator.getAnimatedValue();
            C162457s7.A0K(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.height = AnonymousClass001.A0K(animatedValue);
            view.requestLayout();
            return;
        }
        View view2 = (View) this.A00;
        C162457s7.A0J(valueAnimator, 1);
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        C162457s7.A0K(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Number) animatedValue2).floatValue();
        if (view2 != null) {
            view2.setAlpha(floatValue);
            view2.requestLayout();
        }
    }
}
