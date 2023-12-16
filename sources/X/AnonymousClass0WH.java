package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;

/* renamed from: X.0WH  reason: invalid class name */
public class AnonymousClass0WH {
    public static final View.AccessibilityDelegate A02 = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate A00;
    public final View.AccessibilityDelegate A01;

    public void A05(View view, int i) {
        this.A01.sendAccessibilityEvent(view, i);
    }

    public void A06(View view, AccessibilityEvent accessibilityEvent) {
        this.A01.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void A07(View view, AccessibilityEvent accessibilityEvent) {
        this.A01.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void A08(View view, AccessibilityEvent accessibilityEvent) {
        this.A01.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public boolean A0A(View view, AccessibilityEvent accessibilityEvent) {
        return this.A01.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean A0B(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.A01.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public AnonymousClass0U3 A0C(View view) {
        AccessibilityNodeProvider A002 = C04900Rc.A00(this.A01, view);
        if (A002 != null) {
            return new AnonymousClass0U3(A002);
        }
        return null;
    }

    public void A0D(View view, C05650Ui r4) {
        this.A01.onInitializeAccessibilityNodeInfo(view, r4.A01);
    }

    public AnonymousClass0WH(View.AccessibilityDelegate accessibilityDelegate) {
        this.A01 = accessibilityDelegate;
        this.A00 = new AnonymousClass02Q(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A09(android.view.View r7, int r8, android.os.Bundle r9) {
        /*
            r6 = this;
            r0 = 2131434163(0x7f0b1ab3, float:1.8490132E38)
            java.lang.Object r3 = r7.getTag(r0)
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto L_0x000f
            java.util.List r3 = java.util.Collections.emptyList()
        L_0x000f:
            r2 = 0
        L_0x0010:
            int r0 = r3.size()
            if (r2 >= r0) goto L_0x005b
            java.lang.Object r1 = r3.get(r2)
            X.0Ws r1 = (X.C06220Ws) r1
            java.lang.Object r0 = r1.A03
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r0
            int r0 = r0.getId()
            if (r0 != r8) goto L_0x0030
            X.0s4 r5 = r1.A01
            if (r5 == 0) goto L_0x005b
            java.lang.Class r1 = r1.A02
            r4 = 0
            if (r1 == 0) goto L_0x0055
            goto L_0x0033
        L_0x0030:
            int r2 = r2 + 1
            goto L_0x0010
        L_0x0033:
            java.lang.Object r0 = X.AnonymousClass001.A0h(r1)     // Catch:{ Exception -> 0x003c }
            X.0KQ r0 = (X.AnonymousClass0KQ) r0     // Catch:{ Exception -> 0x003c }
            r0.A00 = r9     // Catch:{ Exception -> 0x003e }
            goto L_0x0054
        L_0x003c:
            r3 = move-exception
            goto L_0x0040
        L_0x003e:
            r3 = move-exception
            r4 = r0
        L_0x0040:
            java.lang.String r2 = r1.getName()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Failed to execute command with argument class ViewCommandArgument: "
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r2, r1)
            java.lang.String r0 = "A11yActionCompat"
            android.util.Log.e(r0, r1, r3)
            goto L_0x0055
        L_0x0054:
            r4 = r0
        L_0x0055:
            boolean r1 = r5.Bgj(r7, r4)
            if (r1 != 0) goto L_0x00ba
        L_0x005b:
            android.view.View$AccessibilityDelegate r0 = r6.A01
            boolean r1 = X.C04900Rc.A01(r9, r0, r7, r8)
            if (r1 != 0) goto L_0x00ba
            r0 = 2131427372(0x7f0b002c, float:1.8476358E38)
            if (r8 != r0) goto L_0x00ba
            if (r9 == 0) goto L_0x00ba
            java.lang.String r1 = "ACCESSIBILITY_CLICKABLE_SPAN_ID"
            r0 = -1
            int r1 = r9.getInt(r1, r0)
            r0 = 2131434164(0x7f0b1ab4, float:1.8490134E38)
            java.lang.Object r0 = r7.getTag(r0)
            android.util.SparseArray r0 = (android.util.SparseArray) r0
            if (r0 == 0) goto L_0x00be
            java.lang.Object r0 = r0.get(r1)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L_0x00be
            java.lang.Object r4 = r0.get()
            android.text.style.ClickableSpan r4 = (android.text.style.ClickableSpan) r4
            r3 = 0
            if (r4 == 0) goto L_0x00be
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.createAccessibilityNodeInfo()
            java.lang.CharSequence r1 = r0.getText()
            boolean r0 = r1 instanceof android.text.Spanned
            if (r0 == 0) goto L_0x00be
            r2 = r1
            android.text.Spanned r2 = (android.text.Spanned) r2
            int r1 = r1.length()
            java.lang.Class<android.text.style.ClickableSpan> r0 = android.text.style.ClickableSpan.class
            java.lang.Object[] r2 = r2.getSpans(r3, r1, r0)
            android.text.style.ClickableSpan[] r2 = (android.text.style.ClickableSpan[]) r2
            r1 = 0
            if (r2 == 0) goto L_0x00be
        L_0x00ab:
            int r0 = r2.length
            if (r1 >= r0) goto L_0x00be
            r0 = r2[r1]
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00bb
            r4.onClick(r7)
            r1 = 1
        L_0x00ba:
            return r1
        L_0x00bb:
            int r1 = r1 + 1
            goto L_0x00ab
        L_0x00be:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0WH.A09(android.view.View, int, android.os.Bundle):boolean");
    }

    public AnonymousClass0WH() {
        this(A02);
    }
}
