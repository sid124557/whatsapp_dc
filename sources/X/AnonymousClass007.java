package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.007  reason: invalid class name */
public class AnonymousClass007 extends AnimatorListenerAdapter {
    public boolean A00 = false;
    public final /* synthetic */ AnonymousClass09U A01;

    public void onAnimationCancel(Animator animator) {
        this.A00 = true;
    }

    public AnonymousClass007(AnonymousClass09U r2) {
        this.A01 = r2;
    }

    public void onAnimationEnd(Animator animator) {
        if (this.A00) {
            this.A00 = false;
            return;
        }
        AnonymousClass09U r2 = this.A01;
        if (AnonymousClass001.A03(r2.A0K) == 0.0f) {
            r2.A02 = 0;
            r2.A05(0);
            return;
        }
        r2.A02 = 2;
        r2.A0B.invalidate();
    }
}
