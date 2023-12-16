package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* renamed from: X.6CK  reason: invalid class name */
public abstract class AnonymousClass6CK extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
    public float A00;
    public float A01;
    public boolean A02;
    public final /* synthetic */ C160787oJ A03;

    public AnonymousClass6CK(C160787oJ r1) {
        this.A03 = r1;
    }

    public void onAnimationEnd(Animator animator) {
        C160787oJ r2 = this.A03;
        float f = (float) ((int) this.A00);
        AnonymousClass6D7 r0 = r2.A0D;
        if (r0 != null) {
            r0.A04(f);
        }
        this.A02 = false;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        float f2;
        float f3;
        float f4;
        if (!this.A02) {
            AnonymousClass6D7 r0 = this.A03.A0D;
            if (r0 == null) {
                f = 0.0f;
            } else {
                f = r0.A03.A00;
            }
            this.A01 = f;
            if (this instanceof C129036Yy) {
                f2 = ((C129036Yy) this).A00.A00;
            } else {
                if (this instanceof C129026Yx) {
                    C160787oJ r02 = ((C129026Yx) this).A00;
                    f3 = r02.A00;
                    f4 = r02.A03;
                } else if (this instanceof C129016Yw) {
                    C160787oJ r03 = ((C129016Yw) this).A00;
                    f3 = r03.A00;
                    f4 = r03.A01;
                } else {
                    f2 = 0.0f;
                }
                f2 = f3 + f4;
            }
            this.A00 = f2;
            this.A02 = true;
        }
        C160787oJ r3 = this.A03;
        float f5 = this.A01;
        float animatedFraction = (float) ((int) (f5 + ((this.A00 - f5) * valueAnimator.getAnimatedFraction())));
        AnonymousClass6D7 r04 = r3.A0D;
        if (r04 != null) {
            r04.A04(animatedFraction);
        }
    }
}
