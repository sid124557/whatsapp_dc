package X;

import android.view.View;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* renamed from: X.068  reason: invalid class name */
public class AnonymousClass068 extends AnonymousClass0QF {
    public final WindowInsetsAnimation A00;

    public AnonymousClass068(int i, Interpolator interpolator, long j) {
        this(new WindowInsetsAnimation(i, interpolator, j));
    }

    public static WindowInsetsAnimation.Bounds A00(C06020Vx r3) {
        return new WindowInsetsAnimation.Bounds(r3.A00.A03(), r3.A01.A03());
    }

    public static void A03(View view, AnonymousClass0QA r2) {
        C002402t r0;
        if (r2 != null) {
            r0 = new C002402t(r2);
        } else {
            r0 = null;
        }
        view.setWindowInsetsAnimationCallback(r0);
    }

    public float A05() {
        return this.A00.getInterpolatedFraction();
    }

    public int A06() {
        return this.A00.getTypeMask();
    }

    public long A07() {
        return this.A00.getDurationMillis();
    }

    public void A08(float f) {
        this.A00.setFraction(f);
    }

    public static AnonymousClass0XU A01(WindowInsetsAnimation.Bounds bounds) {
        return AnonymousClass0XU.A01(bounds.getUpperBound());
    }

    public static AnonymousClass0XU A02(WindowInsetsAnimation.Bounds bounds) {
        return AnonymousClass0XU.A01(bounds.getLowerBound());
    }

    public AnonymousClass068(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, (Interpolator) null, 0);
        this.A00 = windowInsetsAnimation;
    }
}
