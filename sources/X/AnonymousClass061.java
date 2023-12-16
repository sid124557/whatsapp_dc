package X;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* renamed from: X.061  reason: invalid class name */
public class AnonymousClass061 extends AnonymousClass0WH {
    public void A06(View view, AccessibilityEvent accessibilityEvent) {
        super.A06(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        accessibilityEvent.setScrollable(AnonymousClass001.A1W(nestedScrollView.getScrollRange()));
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        C05020Ro.A00(accessibilityEvent, nestedScrollView.getScrollX());
        C05020Ro.A01(accessibilityEvent, nestedScrollView.getScrollRange());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (r7 != 16908346) goto L_0x003e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A09(android.view.View r6, int r7, android.os.Bundle r8) {
        /*
            r5 = this;
            boolean r0 = super.A09(r6, r7, r8)
            r3 = 1
            if (r0 != 0) goto L_0x007d
            androidx.core.widget.NestedScrollView r6 = (androidx.core.widget.NestedScrollView) r6
            boolean r0 = r6.isEnabled()
            r2 = 0
            if (r0 == 0) goto L_0x003e
            int r4 = r6.getHeight()
            android.graphics.Rect r1 = X.AnonymousClass001.A0N()
            android.graphics.Matrix r0 = r6.getMatrix()
            boolean r0 = r0.isIdentity()
            if (r0 == 0) goto L_0x002c
            boolean r0 = r6.getGlobalVisibleRect(r1)
            if (r0 == 0) goto L_0x002c
            int r4 = r1.height()
        L_0x002c:
            r0 = 4096(0x1000, float:5.74E-42)
            if (r7 == r0) goto L_0x0053
            r0 = 8192(0x2000, float:1.14794E-41)
            if (r7 == r0) goto L_0x003f
            r0 = 16908344(0x1020038, float:2.3877386E-38)
            if (r7 == r0) goto L_0x003f
            r0 = 16908346(0x102003a, float:2.3877392E-38)
            if (r7 == r0) goto L_0x0053
        L_0x003e:
            return r2
        L_0x003f:
            int r0 = r6.getPaddingBottom()
            int r4 = r4 - r0
            int r0 = r6.getPaddingTop()
            int r4 = r4 - r0
            int r0 = r6.getScrollY()
            int r0 = r0 - r4
            int r1 = java.lang.Math.max(r0, r2)
            goto L_0x006a
        L_0x0053:
            int r0 = r6.getPaddingBottom()
            int r4 = r4 - r0
            int r0 = r6.getPaddingTop()
            int r4 = r4 - r0
            int r1 = r6.getScrollY()
            int r1 = r1 + r4
            int r0 = r6.getScrollRange()
            int r1 = java.lang.Math.min(r1, r0)
        L_0x006a:
            int r0 = r6.getScrollY()
            if (r1 == r0) goto L_0x003e
            int r0 = r6.getScrollX()
            int r2 = r2 - r0
            int r0 = r6.getScrollY()
            int r1 = r1 - r0
            r6.A07(r2, r1, r3)
        L_0x007d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass061.A09(android.view.View, int, android.os.Bundle):boolean");
    }

    public void A0D(View view, C05650Ui r5) {
        int scrollRange;
        super.A0D(view, r5);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        String name = ScrollView.class.getName();
        AccessibilityNodeInfo accessibilityNodeInfo = r5.A01;
        accessibilityNodeInfo.setClassName(name);
        if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
            accessibilityNodeInfo.setScrollable(true);
            if (nestedScrollView.getScrollY() > 0) {
                r5.A07(C06220Ws.A0X);
                r5.A07(C06220Ws.A0d);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                r5.A07(C06220Ws.A0Z);
                r5.A07(C06220Ws.A0Y);
            }
        }
    }
}
