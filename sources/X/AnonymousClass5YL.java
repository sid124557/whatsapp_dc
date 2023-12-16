package X;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/* renamed from: X.5YL  reason: invalid class name */
public class AnonymousClass5YL {
    public static int A01(Context context, WindowManager windowManager) {
        int i;
        DisplayMetrics A0B;
        if (Build.VERSION.SDK_INT < 30) {
            A0B = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(A0B);
            i = A0B.densityDpi;
        } else {
            i = AnonymousClass001.A0M(context).densityDpi;
            A0B = AnonymousClass000.A0B(context);
        }
        float f = A0B.density;
        if (i >= 320) {
            return (int) (f * 25.0f);
        }
        if (i >= 240) {
            return 38;
        }
        if (i >= 160) {
            return 25;
        }
        return 19;
    }

    public static int A00(Context context) {
        float A00 = C86604Kt.A00(context);
        float f = 2.0f;
        if (((float) AnonymousClass000.A0B(context).widthPixels) / A00 >= 360.0f) {
            f = 7.0f;
        }
        return AnonymousClass001.A07(f, A00);
    }
}
