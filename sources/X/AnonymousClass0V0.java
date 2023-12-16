package X;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: X.0V0  reason: invalid class name */
public class AnonymousClass0V0 {
    public static WindowInsets A00(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static WindowInsets A01(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    public static void A02(View view) {
        view.requestApplyInsets();
    }
}
