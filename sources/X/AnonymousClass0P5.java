package X;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* renamed from: X.0P5  reason: invalid class name */
public abstract class AnonymousClass0P5 {
    public Animatable2.AnimationCallback A00;

    public abstract void A02(Drawable drawable);

    public Animatable2.AnimationCallback A00() {
        Animatable2.AnimationCallback animationCallback = this.A00;
        if (animationCallback != null) {
            return animationCallback;
        }
        C001100w r0 = new C001100w(this);
        this.A00 = r0;
        return r0;
    }

    public void A01(Drawable drawable) {
    }
}
