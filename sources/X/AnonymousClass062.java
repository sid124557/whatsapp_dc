package X;

import android.os.Bundle;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* renamed from: X.062  reason: invalid class name */
public class AnonymousClass062 extends AnonymousClass0WH {
    public final /* synthetic */ ViewPager A00;

    public AnonymousClass062(ViewPager viewPager) {
        this.A00 = viewPager;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r1 > 1) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(android.view.View r4, android.view.accessibility.AccessibilityEvent r5) {
        /*
            r3 = this;
            super.A06(r4, r5)
            java.lang.Class<androidx.viewpager.widget.ViewPager> r0 = androidx.viewpager.widget.ViewPager.class
            java.lang.String r0 = r0.getName()
            r5.setClassName(r0)
            androidx.viewpager.widget.ViewPager r2 = r3.A00
            X.0R4 r0 = r2.A0V
            if (r0 == 0) goto L_0x003a
            int r1 = r0.A0C()
            r0 = 1
            if (r1 <= r0) goto L_0x003a
        L_0x0019:
            r5.setScrollable(r0)
            int r1 = r5.getEventType()
            r0 = 4096(0x1000, float:5.74E-42)
            if (r1 != r0) goto L_0x0039
            X.0R4 r0 = r2.A0V
            if (r0 == 0) goto L_0x0039
            int r0 = r0.A0C()
            r5.setItemCount(r0)
            int r0 = r2.A0A
            r5.setFromIndex(r0)
            int r0 = r2.A0A
            r5.setToIndex(r0)
        L_0x0039:
            return
        L_0x003a:
            r0 = 0
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass062.A06(android.view.View, android.view.accessibility.AccessibilityEvent):void");
    }

    public boolean A09(View view, int i, Bundle bundle) {
        ViewPager viewPager;
        int i2;
        if (!super.A09(view, i, bundle)) {
            if (i != 4096) {
                if (i == 8192) {
                    viewPager = this.A00;
                    if (viewPager.canScrollHorizontally(-1)) {
                        i2 = viewPager.A0A - 1;
                    }
                }
                return false;
            }
            viewPager = this.A00;
            if (viewPager.canScrollHorizontally(1)) {
                i2 = viewPager.A0A + 1;
            }
            return false;
            viewPager.setCurrentItem(i2);
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r1 > 1) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D(android.view.View r5, X.C05650Ui r6) {
        /*
            r4 = this;
            super.A0D(r5, r6)
            java.lang.Class<androidx.viewpager.widget.ViewPager> r0 = androidx.viewpager.widget.ViewPager.class
            java.lang.String r0 = r0.getName()
            android.view.accessibility.AccessibilityNodeInfo r3 = r6.A01
            r3.setClassName(r0)
            androidx.viewpager.widget.ViewPager r2 = r4.A00
            X.0R4 r0 = r2.A0V
            if (r0 == 0) goto L_0x0037
            int r1 = r0.A0C()
            r0 = 1
            if (r1 <= r0) goto L_0x0037
        L_0x001b:
            r3.setScrollable(r0)
            r0 = 1
            boolean r0 = r2.canScrollHorizontally(r0)
            if (r0 == 0) goto L_0x002a
            r0 = 4096(0x1000, float:5.74E-42)
            r3.addAction(r0)
        L_0x002a:
            r0 = -1
            boolean r0 = r2.canScrollHorizontally(r0)
            if (r0 == 0) goto L_0x0036
            r0 = 8192(0x2000, float:1.14794E-41)
            r3.addAction(r0)
        L_0x0036:
            return
        L_0x0037:
            r0 = 0
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass062.A0D(android.view.View, X.0Ui):void");
    }
}
