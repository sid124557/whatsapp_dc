package X;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.Window;

/* renamed from: X.5by  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C107835by implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ ObjectAnimator A01;
    public final /* synthetic */ Window A02;
    public final /* synthetic */ AnonymousClass7ZM A03;

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        ObjectAnimator objectAnimator = this.A01;
        float f2 = this.A00;
        Window window = this.A02;
        AnonymousClass7ZM r3 = this.A03;
        C162457s7.A0J(objectAnimator, 0);
        Number number = (Number) objectAnimator.getAnimatedValue();
        if (number != null) {
            f = number.floatValue();
        } else {
            f = 0.0f;
        }
        float f3 = (f - f2) / (((float) 1) - f2);
        window.setStatusBarColor(AnonymousClass0YI.A03(f3, r3.A03, -16777216));
        window.setNavigationBarColor(AnonymousClass0YI.A03(f3, r3.A02, -16777216));
    }

    public /* synthetic */ C107835by(ObjectAnimator objectAnimator, Window window, AnonymousClass7ZM r3, float f) {
        this.A01 = objectAnimator;
        this.A00 = f;
        this.A02 = window;
        this.A03 = r3;
    }
}
