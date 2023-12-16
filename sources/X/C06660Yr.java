package X;

import android.animation.ValueAnimator;

/* renamed from: X.0Yr  reason: invalid class name and case insensitive filesystem */
public class C06660Yr implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C10130hR A00;
    public final /* synthetic */ C131266dJ A01;
    public final /* synthetic */ C157967jD A02;
    public final /* synthetic */ C835248t A03;

    public C06660Yr(C10130hR r1, C131266dJ r2, C157967jD r3, C835248t r4) {
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        C835248t r2 = this.A03;
        C157157hp.A00(this.A01, this.A02, r2);
    }
}
