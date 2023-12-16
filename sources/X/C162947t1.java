package X;

import android.os.Handler;

/* renamed from: X.7t1  reason: invalid class name and case insensitive filesystem */
public class C162947t1 implements Handler.Callback {
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0100  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMessage(android.os.Message r9) {
        /*
            r8 = this;
            int r0 = r9.what
            r4 = 1
            if (r0 == 0) goto L_0x0092
            if (r0 == r4) goto L_0x0009
            r0 = 0
            return r0
        L_0x0009:
            java.lang.Object r5 = r9.obj
            X.7l7 r5 = (X.C159097l7) r5
            int r7 = r9.arg1
            android.view.accessibility.AccessibilityManager r0 = r5.A0I
            if (r0 == 0) goto L_0x001f
            java.util.List r0 = r0.getEnabledAccessibilityServiceList(r4)
            if (r0 == 0) goto L_0x008e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x008e
        L_0x001f:
            X.6FH r1 = r5.A0J
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x008e
            int r0 = r1.A00
            if (r0 != r4) goto L_0x0050
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {1065353216, 0} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r0)
            android.animation.TimeInterpolator r0 = r5.A0D
            r2.setInterpolator(r0)
            r0 = 3
            X.C86604Kt.A0w(r2, r5, r0)
            int r0 = r5.A0B
            long r0 = (long) r0
            r2.setDuration(r0)
            X.6CD r0 = new X.6CD
            r0.<init>(r5, r7)
            r2.addListener(r0)
            r2.start()
            return r4
        L_0x0050:
            android.animation.ValueAnimator r6 = new android.animation.ValueAnimator
            r6.<init>()
            int[] r3 = X.C86664Kz.A1Z()
            r0 = 0
            r3[r0] = r0
            int r2 = r1.getHeight()
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x006d
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r0 = r1.bottomMargin
            int r2 = r2 + r0
        L_0x006d:
            r3[r4] = r2
            r6.setIntValues(r3)
            android.animation.TimeInterpolator r0 = r5.A0F
            r6.setInterpolator(r0)
            int r0 = r5.A0C
            long r0 = (long) r0
            r6.setDuration(r0)
            r1 = 0
            X.67F r0 = new X.67F
            r0.<init>(r5, r7, r1)
            r6.addListener(r0)
            r0 = 6
            X.C86604Kt.A0w(r6, r5, r0)
            r6.start()
            return r4
        L_0x008e:
            r5.A09(r7)
            return r4
        L_0x0092:
            java.lang.Object r5 = r9.obj
            X.7l7 r5 = (X.C159097l7) r5
            X.6FH r6 = r5.A0J
            android.view.ViewParent r0 = r6.getParent()
            if (r0 != 0) goto L_0x0109
            android.view.ViewGroup$LayoutParams r3 = r6.getLayoutParams()
            boolean r0 = r3 instanceof X.C002002f
            if (r0 == 0) goto L_0x00cd
            X.02f r3 = (X.C002002f) r3
            com.google.android.material.snackbar.BaseTransientBottomBar$Behavior r2 = new com.google.android.material.snackbar.BaseTransientBottomBar$Behavior
            r2.<init>()
            X.7BY r1 = r2.A00
            X.8iJ r0 = r5.A07
            r1.A00 = r0
            X.8Bj r0 = new X.8Bj
            r0.<init>(r5)
            r2.A04 = r0
            r3.A01(r2)
            X.5fe r0 = r5.A06
            if (r0 == 0) goto L_0x00c9
            java.lang.ref.WeakReference r0 = r0.A00
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L_0x00cd
        L_0x00c9:
            r0 = 80
            r3.A03 = r0
        L_0x00cd:
            android.view.ViewGroup r7 = r5.A0H
            r6.A06 = r4
            r7.addView(r6)
            r0 = 0
            r6.A06 = r0
            X.5fe r0 = r5.A06
            if (r0 == 0) goto L_0x0113
            java.lang.ref.WeakReference r2 = r0.A00
            java.lang.Object r0 = r2.get()
            if (r0 == 0) goto L_0x0113
            r3 = 2
            int[] r1 = new int[r3]
            android.view.View r0 = X.C86664Kz.A0j(r2)
            r0.getLocationOnScreen(r1)
            r2 = r1[r4]
            int[] r0 = new int[r3]
            r7.getLocationOnScreen(r0)
            r1 = r0[r4]
            int r0 = r7.getHeight()
            int r1 = r1 + r0
            int r1 = r1 - r2
        L_0x00fc:
            int r0 = r5.A01
            if (r1 == r0) goto L_0x0105
            r5.A01 = r1
            r5.A07()
        L_0x0105:
            r0 = 4
            r6.setVisibility(r0)
        L_0x0109:
            boolean r0 = X.C06360Xi.A05(r6)
            if (r0 == 0) goto L_0x0115
            r5.A06()
            return r4
        L_0x0113:
            r1 = 0
            goto L_0x00fc
        L_0x0115:
            r5.A09 = r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162947t1.handleMessage(android.os.Message):boolean");
    }
}
