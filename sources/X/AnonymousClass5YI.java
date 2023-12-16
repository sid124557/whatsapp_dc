package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;

/* renamed from: X.5YI  reason: invalid class name */
public class AnonymousClass5YI {
    public static float A00(Context context) {
        return (float) A04(context, 4.0f);
    }

    public static int A02(Context context) {
        return A04(context, 120.0f);
    }

    public static float A01(Context context, float f) {
        return (float) A04(context, f);
    }

    public static int A03(Context context) {
        int[] iArr = {16843499};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AnonymousClass4L0.A0B().data, iArr);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static int A04(Context context, float f) {
        return Math.round((f * ((float) AnonymousClass000.A0B(context).densityDpi)) / 160.0f);
    }

    public static Point A05(WindowManager windowManager) {
        Point A07 = AnonymousClass4L0.A07();
        if (C107385bE.A08()) {
            WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars() | WindowInsets.Type.displayCutout());
            int i = insetsIgnoringVisibility.right + insetsIgnoringVisibility.left;
            int i2 = insetsIgnoringVisibility.top + insetsIgnoringVisibility.bottom;
            Rect bounds = currentWindowMetrics.getBounds();
            A07.set(bounds.width() - i, bounds.height() - i2);
            return A07;
        }
        windowManager.getDefaultDisplay().getSize(A07);
        return A07;
    }
}
