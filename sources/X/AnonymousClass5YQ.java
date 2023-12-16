package X;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: X.5YQ  reason: invalid class name */
public final class AnonymousClass5YQ {
    public static final int A00(Context context) {
        C162457s7.A0J(context, 0);
        Context A00 = AnonymousClass74U.A00(context);
        int i = AnonymousClass001.A0M(A00).smallestScreenWidthDp;
        Point A01 = A01(A00);
        if (A01 != null) {
            float min = ((float) Math.min(A01.x, A01.y)) / C86604Kt.A00(A00);
            if (((double) AnonymousClass002.A00(min, (float) i)) <= ((double) i) * 0.15d) {
                return (int) min;
            }
        }
        return i;
    }

    public static final Point A01(Context context) {
        Context A00 = AnonymousClass74U.A00(context);
        Point A07 = AnonymousClass4L0.A07();
        Object systemService = A00.getSystemService("display");
        C162457s7.A0K(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
        Display display = ((DisplayManager) systemService).getDisplay(0);
        if (display == null) {
            if (!C107385bE.A08() || A00.getDisplay() == null) {
                Object systemService2 = A00.getSystemService("window");
                C162457s7.A0K(systemService2, "null cannot be cast to non-null type android.view.WindowManager");
                display = ((WindowManager) systemService2).getDefaultDisplay();
            } else {
                display = A00.getDisplay();
            }
            if (display == null) {
                return null;
            }
        }
        display.getRealSize(A07);
        return A07;
    }

    public static final C152337Ym A02(Context context) {
        int i;
        int i2;
        C162457s7.A0J(context, 0);
        Object systemService = context.getSystemService("display");
        C162457s7.A0K(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
        Display display = ((DisplayManager) systemService).getDisplay(0);
        if (display != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            display.getRealMetrics(displayMetrics);
            float f = displayMetrics.xdpi;
            if (f >= 100.0f) {
                float f2 = displayMetrics.ydpi;
                if (f2 >= 100.0f && (i = displayMetrics.widthPixels) > 0 && (i2 = displayMetrics.heightPixels) > 0) {
                    float f3 = ((float) (i * 100)) / f;
                    float f4 = ((float) (i2 * 100)) / f2;
                    return new C152337Ym((int) f3, (int) f4, (int) Math.sqrt(Math.pow((double) f3, 2.0d) + Math.pow((double) f4, 2.0d)));
                }
            }
        }
        return null;
    }
}
