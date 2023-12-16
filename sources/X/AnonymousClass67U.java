package X;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.67U  reason: invalid class name */
public class AnonymousClass67U extends Animation {
    public int A00;
    public int A01;
    public Object A02;
    public final int A03;

    public AnonymousClass67U(Object obj, int i, int i2, int i3) {
        this.A03 = i3;
        this.A02 = obj;
        this.A01 = i;
        this.A00 = i2;
    }

    public void applyTransformation(float f, Transformation transformation) {
        AnonymousClass5RH r3;
        int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        if (this.A03 != 0) {
            if (i == 0) {
                r3 = (AnonymousClass5RH) ((AnonymousClass6AM) this.A02).A01;
                r3.A01.getLayoutParams().height = this.A01;
            } else {
                AnonymousClass6AM r1 = (AnonymousClass6AM) this.A02;
                r3 = (AnonymousClass5RH) r1.A01;
                ViewGroup.LayoutParams layoutParams = r3.A01.getLayoutParams();
                int i2 = r1.A00;
                layoutParams.height = i2 + ((int) (((float) (this.A00 - i2)) * f));
            }
            r3.A01.requestLayout();
        } else if (i != 0) {
            AnonymousClass4M5 r2 = (AnonymousClass4M5) this.A02;
            int i3 = this.A01;
            r2.A00 = i3 + ((int) (((float) (this.A00 - i3)) * f));
            r2.invalidateSelf();
        }
    }

    public boolean willChangeBounds() {
        if (1 - this.A03 != 0) {
            return super.willChangeBounds();
        }
        return true;
    }
}
