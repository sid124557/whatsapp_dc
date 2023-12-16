package X;

import android.animation.ValueAnimator;

/* renamed from: X.7sP  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C162577sP implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ C149917Ok A02;

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C149917Ok r6 = this.A02;
        float f = this.A00;
        float f2 = this.A01;
        float A03 = AnonymousClass001.A03(valueAnimator);
        r6.A00 = Math.min(r6.A00, Math.max(f, f2 - ((f2 - f) * (0.5f * A03))));
        float f3 = (float) r6.A01;
        r6.A01 = (int) Math.max(f3 - (A03 * f3), 0.0f);
    }

    public /* synthetic */ C162577sP(C149917Ok r1, float f, float f2) {
        this.A02 = r1;
        this.A00 = f;
        this.A01 = f2;
    }
}
