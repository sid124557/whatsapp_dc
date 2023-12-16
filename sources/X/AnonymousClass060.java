package X;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: X.060  reason: invalid class name */
public class AnonymousClass060 extends AnonymousClass0WH {
    public final AnonymousClass84O A00;

    public AnonymousClass060(AnonymousClass84O r1) {
        this.A00 = r1;
    }

    public void A0D(View view, C05650Ui r6) {
        super.A0D(view, r6);
        AnonymousClass84O r3 = this.A00;
        String A0O = r3.A0O(36);
        String A0O2 = r3.A0O(38);
        if (A0O != null) {
            r6.A09(A0O);
        }
        C1001159m.A00(view.getContext(), view, r6, A0O2);
        String A0O3 = r3.A0O(40);
        if (A0O3 != null) {
            r6.A07(new C06220Ws(16, (CharSequence) A0O3));
        }
        boolean A0W = r3.A0W(42, false);
        boolean A0W2 = r3.A0W(43, false);
        AccessibilityNodeInfo accessibilityNodeInfo = r6.A01;
        accessibilityNodeInfo.setSelected(A0W);
        accessibilityNodeInfo.setEnabled(!A0W2);
    }
}
