package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.009  reason: invalid class name */
public final class AnonymousClass009 extends AnimatorListenerAdapter {
    public final /* synthetic */ C153427bI A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public AnonymousClass009(C153427bI r1, String str, boolean z) {
        this.A02 = z;
        this.A00 = r1;
        this.A01 = str;
    }

    public void onAnimationCancel(Animator animator) {
        if (this.A02) {
            C162377rs.A0A(this.A00, this.A01);
        }
    }

    public void onAnimationEnd(Animator animator) {
        if (this.A02) {
            C162377rs.A0A(this.A00, this.A01);
        }
    }
}
