package X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.9X0  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9X0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ View A01;

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A01.setTranslationX(valueAnimator.getAnimatedFraction() * this.A00);
    }

    public /* synthetic */ AnonymousClass9X0(View view, float f) {
        this.A01 = view;
        this.A00 = f;
    }
}
