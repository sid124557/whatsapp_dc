package X;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: X.02u  reason: invalid class name and case insensitive filesystem */
public class C002502u extends AccessibilityNodeProvider {
    public final AnonymousClass0U3 A00;

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        C05650Ui A002 = this.A00.A00(i);
        if (A002 == null) {
            return null;
        }
        return A002.A01;
    }

    public boolean performAction(int i, int i2, Bundle bundle) {
        return this.A00.A02(i, i2, bundle);
    }

    public C002502u(AnonymousClass0U3 r1) {
        this.A00 = r1;
    }

    public List findAccessibilityNodeInfosByText(String str, int i) {
        return null;
    }
}
