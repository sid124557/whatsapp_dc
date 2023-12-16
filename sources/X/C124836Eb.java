package X;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;

/* renamed from: X.6Eb  reason: invalid class name and case insensitive filesystem */
public class C124836Eb extends View.AccessibilityDelegate {
    public final /* synthetic */ C153557bX A00;

    public C124836Eb(C153557bX r1) {
        this.A00 = r1;
    }

    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        EditText editText = this.A00.A0R.A0b;
        if (editText != null) {
            accessibilityNodeInfo.setLabeledBy(editText);
        }
    }
}
