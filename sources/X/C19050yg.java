package X;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.0yg  reason: invalid class name and case insensitive filesystem */
public class C19050yg extends Animation {
    public final int A00;
    public final ViewGroup A01;

    public void applyTransformation(float f, Transformation transformation) {
        int i = (int) (((float) this.A00) * f);
        Drawable background = this.A01.getBackground();
        if (background instanceof AnonymousClass4M8) {
            AnonymousClass4M8 r1 = (AnonymousClass4M8) background;
            r1.A00 = i;
            r1.invalidateSelf();
        }
    }

    public C19050yg(ViewGroup viewGroup, int i) {
        this.A01 = viewGroup;
        this.A00 = i;
    }

    public boolean willChangeBounds() {
        return false;
    }
}
