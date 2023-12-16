package X;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.4OC  reason: invalid class name */
public class AnonymousClass4OC extends Animation {
    public final int A00;
    public final Drawable A01;
    public final ViewGroup A02;

    public void applyTransformation(float f, Transformation transformation) {
        int i = this.A00;
        int i2 = i - ((int) (((float) i) * f));
        ViewGroup viewGroup = this.A02;
        Drawable background = viewGroup.getBackground();
        if (!(background instanceof AnonymousClass4M8)) {
            return;
        }
        if (f == 1.0f) {
            AnonymousClass4M8.A00(this.A01, viewGroup);
            return;
        }
        AnonymousClass4M8 r1 = (AnonymousClass4M8) background;
        r1.A00 = i2;
        r1.invalidateSelf();
    }

    public boolean willChangeBounds() {
        return false;
    }

    public AnonymousClass4OC(Drawable drawable, ViewGroup viewGroup, int i) {
        this.A02 = viewGroup;
        this.A00 = i;
        this.A01 = drawable;
    }
}
