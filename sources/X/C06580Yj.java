package X;

import android.animation.Animator;
import android.animation.ValueAnimator;

/* renamed from: X.0Yj  reason: invalid class name and case insensitive filesystem */
public class C06580Yj implements Animator.AnimatorListener {
    public float A00;
    public float A01;
    public float A02;
    public boolean A03 = false;
    public boolean A04;
    public boolean A05 = false;
    public final float A06;
    public final float A07;
    public final float A08;
    public final float A09;
    public final int A0A;
    public final ValueAnimator A0B;
    public final C05570Ua A0C;

    public void onAnimationCancel(Animator animator) {
        this.A00 = 1.0f;
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.A03) {
            this.A0C.A05(true);
        }
        this.A03 = true;
    }

    public C06580Yj(C05570Ua r4, float f, float f2, float f3, float f4, int i) {
        this.A0A = i;
        this.A0C = r4;
        this.A06 = f;
        this.A07 = f2;
        this.A08 = f3;
        this.A09 = f4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.A0B = ofFloat;
        ofFloat.addUpdateListener(new C02910Ib(this, 0));
        ofFloat.setTarget(r4.A0H);
        ofFloat.addListener(this);
        this.A00 = 0.0f;
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
