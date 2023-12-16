package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.00B  reason: invalid class name */
public final class AnonymousClass00B extends AnimatorListenerAdapter {
    public final long A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass004 A02;

    public void onAnimationCancel(Animator animator) {
        C162457s7.A0J(animator, 0);
        AnonymousClass004 r5 = this.A02;
        if (r5.A00 == 0 && animator.getStartDelay() != 0) {
            animator.setStartDelay(this.A00);
        }
        r5.A00 = 0;
        r5.A02 = true;
        r5.A02(new C14280pF(r5));
    }

    public void onAnimationEnd(Animator animator) {
        int i;
        C162457s7.A0J(animator, 0);
        AnonymousClass004 r5 = this.A02;
        if (r5.A00 == 0 && animator.getStartDelay() != 0) {
            animator.setStartDelay(this.A00);
        }
        int i2 = r5.A00 + 1;
        r5.A00 = i2;
        if (r5.A02 || ((i = this.A01) != -1 && i2 >= i)) {
            r5.A00 = 0;
            r5.A02 = false;
            r5.A02(new C14290pG(r5));
            return;
        }
        animator.start();
    }

    public AnonymousClass00B(AnonymousClass004 r3, int i) {
        this.A02 = r3;
        this.A01 = i;
        this.A00 = r3.A05.getStartDelay();
    }

    public void onAnimationStart(Animator animator) {
        AnonymousClass004 r1 = this.A02;
        if (r1.A00 == 0) {
            r1.A02(new C14300pH(r1));
        }
    }
}
