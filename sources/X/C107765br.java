package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.5br  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C107765br implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ boolean A01;

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction;
        View view = this.A00;
        boolean z = this.A01;
        int A012 = C86604Kt.A01(valueAnimator);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = A012;
            view.setLayoutParams(layoutParams);
        }
        if (z) {
            animatedFraction = valueAnimator.getAnimatedFraction();
        } else {
            animatedFraction = 1.0f - valueAnimator.getAnimatedFraction();
        }
        view.setAlpha(animatedFraction);
    }

    public /* synthetic */ C107765br(View view, boolean z) {
        this.A00 = view;
        this.A01 = z;
    }
}
