package X;

import android.animation.ValueAnimator;

/* renamed from: X.0Yq  reason: invalid class name and case insensitive filesystem */
public class C06650Yq implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AnonymousClass09U A00;

    public C06650Yq(AnonymousClass09U r1) {
        this.A00 = r1;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int A03 = (int) (AnonymousClass001.A03(valueAnimator) * 255.0f);
        AnonymousClass09U r1 = this.A00;
        r1.A0O.setAlpha(A03);
        r1.A0M.setAlpha(A03);
        r1.A0B.invalidate();
    }
}
