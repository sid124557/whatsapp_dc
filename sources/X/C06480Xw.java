package X;

import android.view.View;

/* renamed from: X.0Xw  reason: invalid class name and case insensitive filesystem */
public class C06480Xw {
    public static CharSequence A00(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static Object A01(View view, int i) {
        return view.requireViewById(i);
    }

    public static void A02(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void A03(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    public static void A04(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }

    public static boolean A05(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean A06(View view) {
        return view.isScreenReaderFocusable();
    }
}
