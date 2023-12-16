package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: X.0xD  reason: invalid class name and case insensitive filesystem */
public class C18360xD extends AnimatorListenerAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ ViewPropertyAnimator A03;
    public final /* synthetic */ C05570Ua A04;
    public final /* synthetic */ C197912r A05;

    public C18360xD(View view, ViewPropertyAnimator viewPropertyAnimator, C05570Ua r3, C197912r r4, int i, int i2) {
        this.A05 = r4;
        this.A04 = r3;
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
        C197912r r2 = this.A05;
        C05570Ua r1 = this.A04;
        r2.A02(r1);
        r2.A05.remove(r1);
        r2.A0G();
    }

    public void onAnimationStart(Animator animator) {
        this.A05.A0C = true;
    }
}
