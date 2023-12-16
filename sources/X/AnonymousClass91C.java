package X;

import android.view.View;

/* renamed from: X.91C  reason: invalid class name */
public class AnonymousClass91C implements View.OnLayoutChangeListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass91C(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        r0 = (X.AnonymousClass4Qc) r4.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayoutChange(android.view.View r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13) {
        /*
            r4 = this;
            int r0 = r4.A02
            switch(r0) {
                case 0: goto L_0x0014;
                case 1: goto L_0x0039;
                case 2: goto L_0x0045;
                case 3: goto L_0x005f;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.C86644Kx.A0v(r4, r5)
            java.lang.Object r1 = r4.A00
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r4.A01
            X.90g r0 = (X.C1891690g) r0
            r1.addOnLayoutChangeListener(r0)
        L_0x0013:
            return
        L_0x0014:
            java.lang.Object r3 = r4.A01
            android.view.View r3 = (android.view.View) r3
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L_0x0013
            java.lang.Object r0 = r4.A00
            X.4Qc r0 = (X.AnonymousClass4Qc) r0
            X.4M1 r2 = r0.A08
            if (r2 == 0) goto L_0x0013
            android.view.View r0 = r0.A02
            if (r3 != r0) goto L_0x0013
            r1 = 0
            android.graphics.Rect r0 = X.AnonymousClass001.A0N()
            r3.getDrawingRect(r0)
            r2.setBounds(r0)
            r2.A08(r3, r1)
            return
        L_0x0039:
            java.lang.Object r1 = r4.A00
            X.4mS r1 = (X.C92314mS) r1
            java.lang.Object r0 = r4.A01
            android.view.View r0 = (android.view.View) r0
            r1.setAnchorWidthView(r0)
            return
        L_0x0045:
            java.lang.Object r0 = r4.A00
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r2 = r4.A01
            android.view.ViewTreeObserver$OnGlobalLayoutListener r2 = (android.view.ViewTreeObserver.OnGlobalLayoutListener) r2
            int r1 = r0.getVisibility()
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            if (r1 != 0) goto L_0x005b
            r0.addOnGlobalLayoutListener(r2)
            return
        L_0x005b:
            r0.removeGlobalOnLayoutListener(r2)
            return
        L_0x005f:
            X.C86644Kx.A0v(r4, r5)
            java.lang.Object r0 = r4.A00
            android.view.View r0 = (android.view.View) r0
            com.google.android.material.bottomsheet.BottomSheetBehavior r3 = com.google.android.material.bottomsheet.BottomSheetBehavior.A01(r0)
            X.AnonymousClass6C9.A0v(r0, r3)
            java.lang.Object r2 = r4.A01
            r1 = 1
            X.8ze r0 = new X.8ze
            r0.<init>(r2, r1, r3)
            r3.A0Z(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass91C.onLayoutChange(android.view.View, int, int, int, int, int, int, int, int):void");
    }
}
