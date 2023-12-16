package X;

import android.view.accessibility.AccessibilityManager;

/* renamed from: X.0Rn  reason: invalid class name and case insensitive filesystem */
public class C05010Rn {
    public static void A00(AccessibilityManager accessibilityManager, C15850s3 r2) {
        accessibilityManager.addTouchExplorationStateChangeListener(new C07290ad(r2));
    }

    public static void A01(AccessibilityManager accessibilityManager, C15850s3 r2) {
        accessibilityManager.removeTouchExplorationStateChangeListener(new C07290ad(r2));
    }
}
