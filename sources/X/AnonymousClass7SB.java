package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* renamed from: X.7SB  reason: invalid class name */
public final class AnonymousClass7SB {
    public final Animator.AnimatorListener A00 = new C188668zI(this, 1);
    public final ArrayList A01 = AnonymousClass001.A0s();

    public void A00(ValueAnimator valueAnimator, int[] iArr) {
        AnonymousClass7GR r1 = new AnonymousClass7GR(valueAnimator, iArr);
        valueAnimator.addListener(this.A00);
        this.A01.add(r1);
    }
}
