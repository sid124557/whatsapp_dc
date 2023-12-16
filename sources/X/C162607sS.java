package X;

import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* renamed from: X.7sS  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C162607sS implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ ViewGroup.LayoutParams A04;
    public final /* synthetic */ AnonymousClass7XM A05;

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        AnonymousClass7XM r7 = this.A05;
        ViewGroup.LayoutParams layoutParams = this.A04;
        int i = this.A00;
        int i2 = this.A01;
        int i3 = this.A02;
        int i4 = this.A03;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float f = 1.0f - animatedFraction;
        layoutParams.width = (int) ((((float) i) * animatedFraction) + (((float) i2) * f));
        layoutParams.height = (int) ((animatedFraction * ((float) i3)) + (f * ((float) i4)));
        r7.A04.setLayoutParams(layoutParams);
    }

    public /* synthetic */ C162607sS(ViewGroup.LayoutParams layoutParams, AnonymousClass7XM r2, int i, int i2, int i3, int i4) {
        this.A05 = r2;
        this.A04 = layoutParams;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
    }
}
