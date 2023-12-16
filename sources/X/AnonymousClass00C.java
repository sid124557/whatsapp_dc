package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: X.00C  reason: invalid class name */
public class AnonymousClass00C extends AnimatorListenerAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ ViewPropertyAnimator A03;
    public final /* synthetic */ C011709l A04;
    public final /* synthetic */ C05570Ua A05;

    public AnonymousClass00C(View view, ViewPropertyAnimator viewPropertyAnimator, C011709l r3, C05570Ua r4, int i, int i2) {
        this.A04 = r3;
        this.A05 = r4;
        this.A00 = i;
        this.A02 = view;
        this.A01 = i2;
        this.A03 = viewPropertyAnimator;
    }

    public void onAnimationCancel(Animator animator) {
        if (this.A00 != 0) {
            this.A02.setTranslationX(0.0f);
        }
        if (this.A01 != 0) {
            this.A02.setTranslationY(0.0f);
        }
    }

    public void onAnimationEnd(Animator animator) {
        this.A03.setListener((Animator.AnimatorListener) null);
        C011709l r2 = this.A04;
        C05570Ua r1 = this.A05;
        r2.A02(r1);
        r2.A04.remove(r1);
        if (!r2.A0A()) {
            r2.A01();
        }
    }

    public void onAnimationStart(Animator animator) {
    }
}
