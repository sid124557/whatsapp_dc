package X;

import android.os.Bundle;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: X.06O  reason: invalid class name */
public class AnonymousClass06O extends AnonymousClass0U3 {
    public final /* synthetic */ AnonymousClass066 A00;

    public C05650Ui A01(int i) {
        int i2;
        AnonymousClass066 r0 = this.A00;
        if (i == 2) {
            i2 = r0.A00;
        } else {
            i2 = r0.A02;
        }
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return A00(i2);
    }

    public AnonymousClass06O(AnonymousClass066 r1) {
        this.A00 = r1;
    }

    public C05650Ui A00(int i) {
        return new C05650Ui(AccessibilityNodeInfo.obtain(this.A00.A0F(i).A01));
    }

    public boolean A02(int i, int i2, Bundle bundle) {
        int i3;
        AnonymousClass066 r2 = this.A00;
        if (i == -1) {
            return AnonymousClass0YY.A0E(r2.A07, i2, bundle);
        }
        if (i2 == 1) {
            return r2.A0O(i);
        }
        if (i2 == 2) {
            return r2.A0N(i);
        }
        if (i2 == 64) {
            AccessibilityManager accessibilityManager = r2.A08;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = r2.A00) == i) {
                return false;
            }
            if (i3 != Integer.MIN_VALUE && i3 == i3) {
                r2.A00 = Integer.MIN_VALUE;
                r2.A07.invalidate();
                r2.A0I(i3, 65536);
            }
            r2.A00 = i;
            r2.A07.invalidate();
            r2.A0I(i, 32768);
            return true;
        } else if (i2 != 128) {
            return r2.A0P(i, i2, bundle);
        } else {
            if (r2.A00 != i) {
                return false;
            }
            r2.A00 = Integer.MIN_VALUE;
            r2.A07.invalidate();
            r2.A0I(i, 65536);
            return true;
        }
    }
}
