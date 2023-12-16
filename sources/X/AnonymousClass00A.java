package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.00A  reason: invalid class name */
public final class AnonymousClass00A extends AnimatorListenerAdapter {
    public boolean A00;
    public final /* synthetic */ C153427bI A01;
    public final /* synthetic */ C131266dJ A02;
    public final /* synthetic */ C835248t A03;

    public void onAnimationCancel(Animator animator) {
        this.A00 = true;
    }

    public void onAnimationEnd(Animator animator) {
        C162457s7.A0J(animator, 0);
        C152057Xj r2 = new C152057Xj();
        r2.A04(animator, 0);
        r2.A04(Boolean.valueOf(!this.A00), 1);
        r2.A04(this.A01, 2);
        C157157hp.A00(this.A02, r2.A03(), this.A03);
        this.A00 = false;
    }

    public AnonymousClass00A(C153427bI r1, C131266dJ r2, C835248t r3) {
        this.A01 = r1;
        this.A03 = r3;
        this.A02 = r2;
    }
}
