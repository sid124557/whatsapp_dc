package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.6CD  reason: invalid class name */
public class AnonymousClass6CD extends AnimatorListenerAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C159097l7 A01;

    public AnonymousClass6CD(C159097l7 r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public void onAnimationEnd(Animator animator) {
        this.A01.A09(this.A00);
    }
}
