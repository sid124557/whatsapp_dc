package X;

import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.4OF  reason: invalid class name */
public class AnonymousClass4OF extends Animation {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Drawable A01;
    public final /* synthetic */ C110005fX A02;
    public final /* synthetic */ AnonymousClass4M8 A03;

    public AnonymousClass4OF(Drawable drawable, C110005fX r2, AnonymousClass4M8 r3, int i) {
        this.A02 = r2;
        this.A00 = i;
        this.A01 = drawable;
        this.A03 = r3;
    }

    public void applyTransformation(float f, Transformation transformation) {
        int i = this.A00;
        int i2 = i - ((int) (((float) i) * f));
        if (f == 1.0f) {
            AnonymousClass4M8.A00(this.A01, this.A02.A03.A2c.A02);
            return;
        }
        AnonymousClass4M8 r0 = this.A03;
        r0.A00 = i2;
        r0.invalidateSelf();
    }

    public boolean willChangeBounds() {
        return false;
    }
}
