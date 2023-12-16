package X;

import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: X.0Xi  reason: invalid class name and case insensitive filesystem */
public class C06360Xi {
    public static int A00(View view) {
        return view.getAccessibilityLiveRegion();
    }

    public static void A01(View view, int i) {
        view.setAccessibilityLiveRegion(i);
    }

    public static void A03(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }

    public static boolean A04(View view) {
        return view.isAttachedToWindow();
    }

    public static boolean A05(View view) {
        return view.isLaidOut();
    }

    public static void A02(View view, View view2, ViewParent viewParent, int i) {
        viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
    }
}
