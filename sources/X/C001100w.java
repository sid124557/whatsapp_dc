package X;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* renamed from: X.00w  reason: invalid class name and case insensitive filesystem */
public class C001100w extends Animatable2.AnimationCallback {
    public final /* synthetic */ AnonymousClass0P5 A00;

    public C001100w(AnonymousClass0P5 r1) {
        this.A00 = r1;
    }

    public void onAnimationEnd(Drawable drawable) {
        this.A00.A02(drawable);
    }

    public void onAnimationStart(Drawable drawable) {
        this.A00.A01(drawable);
    }
}
