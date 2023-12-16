package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.4OE  reason: invalid class name */
public class AnonymousClass4OE extends Animation {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ C87144Oe A03;

    public AnonymousClass4OE(View view, C87144Oe r2, int i, int i2) {
        this.A03 = r2;
        this.A02 = view;
        this.A00 = i;
        this.A01 = i2;
    }

    public void applyTransformation(float f, Transformation transformation) {
        int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        View view = this.A02;
        if (i == 0) {
            view.getLayoutParams().height = -2;
        } else {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i2 = this.A00;
            layoutParams.height = i2 + ((int) (((float) (this.A01 - i2)) * f));
        }
        view.requestLayout();
    }

    public boolean willChangeBounds() {
        return true;
    }
}
