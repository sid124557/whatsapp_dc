package X;

import android.view.Display;
import android.view.View;

/* renamed from: X.0YH  reason: invalid class name */
public class AnonymousClass0YH {
    public static int A00() {
        return View.generateViewId();
    }

    public static int A01(View view) {
        return view.getLayoutDirection();
    }

    public static int A02(View view) {
        return view.getPaddingEnd();
    }

    public static int A03(View view) {
        return view.getPaddingStart();
    }

    public static Display A04(View view) {
        return view.getDisplay();
    }

    public static void A05(View view, int i) {
        view.setLabelFor(i);
    }

    public static void A06(View view, int i) {
        view.setLayoutDirection(i);
    }

    public static boolean A08(View view) {
        if (A01(view) != 1) {
            return false;
        }
        return true;
    }

    public static boolean A09(View view) {
        return view.isPaddingRelative();
    }

    public static void A07(View view, int i, int i2, int i3, int i4) {
        view.setPaddingRelative(i, i2, i3, i4);
    }
}
