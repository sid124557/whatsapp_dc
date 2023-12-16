package X;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeProvider;

/* renamed from: X.0Rc  reason: invalid class name and case insensitive filesystem */
public class C04900Rc {
    public static AccessibilityNodeProvider A00(View.AccessibilityDelegate accessibilityDelegate, View view) {
        return accessibilityDelegate.getAccessibilityNodeProvider(view);
    }

    public static boolean A01(Bundle bundle, View.AccessibilityDelegate accessibilityDelegate, View view, int i) {
        return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
    }
}
