package X;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: X.7mg  reason: invalid class name and case insensitive filesystem */
public class C159917mg {
    public static final TimeInterpolator A00 = new DecelerateInterpolator();
    public static final TimeInterpolator A01 = new AnonymousClass087();
    public static final TimeInterpolator A02 = new AnonymousClass088();
    public static final TimeInterpolator A03 = new LinearInterpolator();
    public static final TimeInterpolator A04 = new AnonymousClass089();

    public static float A00(float f, float f2, float f3, float f4, float f5) {
        if (f5 <= f3) {
            return f;
        }
        if (f5 >= f4) {
            return f2;
        }
        return AnonymousClass001.A00(f2, f, (f5 - f3) / (f4 - f3));
    }
}
