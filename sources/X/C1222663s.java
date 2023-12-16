package X;

import android.util.DisplayMetrics;
import android.util.TypedValue;

/* renamed from: X.63s  reason: invalid class name and case insensitive filesystem */
public final class C1222663s extends AnonymousClass70T {
    public static final int A00(double d) {
        if (Double.isNaN(d)) {
            throw AnonymousClass001.A0c("Cannot round NaN value.");
        } else if (d > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        } else {
            if (d < -2.147483648E9d) {
                return Integer.MIN_VALUE;
            }
            return (int) Math.round(d);
        }
    }

    public static final int A01(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        throw AnonymousClass001.A0c("Cannot round NaN value.");
    }

    public static int A02(DisplayMetrics displayMetrics, float f, int i) {
        return A01(TypedValue.applyDimension(i, f, displayMetrics));
    }
}
