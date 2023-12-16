package X;

import android.animation.ValueAnimator;

/* renamed from: X.7sN  reason: invalid class name and case insensitive filesystem */
public class C162557sN implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ AnonymousClass4PF A01;

    public C162557sN(AnonymousClass4PF r1, float f) {
        this.A01 = r1;
        this.A00 = f;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A01.A04(AnonymousClass001.A03(valueAnimator), this.A00);
    }
}
