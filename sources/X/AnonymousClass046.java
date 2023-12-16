package X;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;

/* renamed from: X.046  reason: invalid class name */
public class AnonymousClass046 extends AnonymousClass0Q2 {
    public final ObjectAnimator A00;
    public final boolean A01;

    public void A00() {
        this.A00.reverse();
    }

    public void A01() {
        this.A00.start();
    }

    public void A02() {
        this.A00.cancel();
    }

    public boolean A03() {
        return this.A01;
    }

    public AnonymousClass046(AnimationDrawable animationDrawable, boolean z, boolean z2) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i = z ? numberOfFrames - 1 : 0;
        int i2 = z ? 0 : numberOfFrames - 1;
        C06600Yl r3 = new C06600Yl(animationDrawable, z);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i, i2});
        ofInt.setAutoCancel(true);
        ofInt.setDuration((long) r3.A01);
        ofInt.setInterpolator(r3);
        this.A01 = z2;
        this.A00 = ofInt;
    }
}
