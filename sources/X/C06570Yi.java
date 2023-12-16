package X;

import android.animation.Animator;

/* renamed from: X.0Yi  reason: invalid class name and case insensitive filesystem */
public class C06570Yi implements Animator.AnimatorListener {
    public final /* synthetic */ C10130hR A00;
    public final /* synthetic */ C131266dJ A01;
    public final /* synthetic */ C157967jD A02;
    public final /* synthetic */ C835248t A03;

    public C06570Yi(C10130hR r1, C131266dJ r2, C157967jD r3, C835248t r4) {
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }

    public void onAnimationEnd(Animator animator) {
        C835248t r2 = this.A03;
        C157157hp.A00(this.A01, this.A02, r2);
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
