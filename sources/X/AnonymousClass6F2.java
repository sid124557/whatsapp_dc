package X;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.6F2  reason: invalid class name */
public class AnonymousClass6F2 extends Animation {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1893691a A01;

    public AnonymousClass6F2(C1893691a r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public void applyTransformation(float f, Transformation transformation) {
        int i;
        if (f == 1.0f) {
            i = this.A00;
        } else {
            i = (int) (f * ((float) this.A00));
        }
        View view = (View) this.A01.A00;
        C86624Kv.A0w(view, i);
        view.requestLayout();
    }

    public boolean willChangeBounds() {
        return true;
    }
}
