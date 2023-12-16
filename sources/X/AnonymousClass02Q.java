package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;

/* renamed from: X.02Q  reason: invalid class name */
public final class AnonymousClass02Q extends View.AccessibilityDelegate {
    public final AnonymousClass0WH A00;

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.A00.A0A(view, accessibilityEvent);
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        AnonymousClass0U3 A0C = this.A00.A0C(view);
        if (A0C != null) {
            return (AccessibilityNodeProvider) A0C.A00;
        }
        return null;
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.A00.A06(view, accessibilityEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (r1 == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0031, code lost:
        if (r1 == false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onInitializeAccessibilityNodeInfo(android.view.View r5, android.view.accessibility.AccessibilityNodeInfo r6) {
        /*
            r4 = this;
            X.0Ui r3 = new X.0Ui
            r3.<init>(r6)
            r1 = 0
            X.0vm r0 = new X.0vm
            r0.<init>(r1)
            java.lang.Object r0 = r0.A02(r5)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x001a
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            r3.A0J(r0)
            r1 = 3
            X.0vm r0 = new X.0vm
            r0.<init>(r1)
            java.lang.Object r0 = r0.A02(r5)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x0033
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            r3.A0I(r0)
            java.lang.CharSequence r0 = X.C06560Yg.A09(r5)
            r3.A0B(r0)
            r1 = 2
            X.0vm r0 = new X.0vm
            r0.<init>(r1)
            java.lang.Object r0 = r0.A02(r5)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r3.A0D(r0)
            X.0WH r0 = r4.A00
            r0.A0D(r5, r3)
            java.lang.CharSequence r0 = r6.getText()
            r3.A06(r5, r0)
            r0 = 2131434163(0x7f0b1ab3, float:1.8490132E38)
            java.lang.Object r2 = r5.getTag(r0)
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L_0x0068
            java.util.List r2 = java.util.Collections.emptyList()
        L_0x0068:
            r1 = 0
        L_0x0069:
            int r0 = r2.size()
            if (r1 >= r0) goto L_0x007b
            java.lang.Object r0 = r2.get(r1)
            X.0Ws r0 = (X.C06220Ws) r0
            r3.A07(r0)
            int r1 = r1 + 1
            goto L_0x0069
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass02Q.onInitializeAccessibilityNodeInfo(android.view.View, android.view.accessibility.AccessibilityNodeInfo):void");
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.A00.A07(view, accessibilityEvent);
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.A00.A0B(viewGroup, view, accessibilityEvent);
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.A00.A09(view, i, bundle);
    }

    public void sendAccessibilityEvent(View view, int i) {
        this.A00.A05(view, i);
    }

    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.A00.A08(view, accessibilityEvent);
    }

    public AnonymousClass02Q(AnonymousClass0WH r1) {
        this.A00 = r1;
    }
}
