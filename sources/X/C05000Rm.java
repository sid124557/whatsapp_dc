package X;

import android.view.accessibility.AccessibilityEvent;

/* renamed from: X.0Rm  reason: invalid class name and case insensitive filesystem */
public class C05000Rm {
    public static int A00(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    public static void A01(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }
}
