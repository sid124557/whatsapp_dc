package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.4L7  reason: invalid class name */
public class AnonymousClass4L7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C115815pH A01;
    public final /* synthetic */ boolean A02;

    public AnonymousClass4L7(C115815pH r1, int i, boolean z) {
        this.A01 = r1;
        this.A02 = z;
        this.A00 = i;
    }

    public void onAnimationEnd(Animator animator) {
        this.A01.A01.setVisibility(this.A00);
    }

    public void onAnimationStart(Animator animator) {
        if (this.A02) {
            this.A01.A01.setVisibility(0);
        }
    }
}
