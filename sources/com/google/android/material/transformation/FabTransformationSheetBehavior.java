package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import java.util.Map;

@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {
    public Map A00;

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        if ((X.AnonymousClass001.A0W(r2).A0A instanceof com.google.android.material.transformation.FabTransformationScrimBehavior) == false) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0K(android.view.View r7, android.view.View r8, boolean r9, boolean r10) {
        /*
            r6 = this;
            android.view.ViewParent r5 = r8.getParent()
            boolean r0 = r5 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            if (r0 == 0) goto L_0x0060
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            int r4 = r5.getChildCount()
            if (r9 == 0) goto L_0x0017
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r4)
            r6.A00 = r0
        L_0x0017:
            r3 = 0
        L_0x0018:
            if (r3 >= r4) goto L_0x005b
            android.view.View r2 = r5.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            boolean r0 = r0 instanceof X.C002002f
            if (r0 == 0) goto L_0x0031
            X.02f r0 = X.AnonymousClass001.A0W(r2)
            X.0Ug r0 = r0.A0A
            boolean r1 = r0 instanceof com.google.android.material.transformation.FabTransformationScrimBehavior
            r0 = 1
            if (r1 != 0) goto L_0x0032
        L_0x0031:
            r0 = 0
        L_0x0032:
            if (r2 == r8) goto L_0x004f
            if (r0 != 0) goto L_0x004f
            java.util.Map r1 = r6.A00
            if (r9 != 0) goto L_0x0052
            if (r1 == 0) goto L_0x004f
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L_0x004f
            java.util.Map r0 = r6.A00
            java.lang.Object r0 = r0.get(r2)
            int r0 = X.AnonymousClass001.A0K(r0)
        L_0x004c:
            X.AnonymousClass0YY.A06(r2, r0)
        L_0x004f:
            int r3 = r3 + 1
            goto L_0x0018
        L_0x0052:
            int r0 = r2.getImportantForAccessibility()
            X.C18280x3.A1D(r2, r1, r0)
            r0 = 4
            goto L_0x004c
        L_0x005b:
            if (r9 != 0) goto L_0x0060
            r0 = 0
            r6.A00 = r0
        L_0x0060:
            boolean r0 = super.A0K(r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationSheetBehavior.A0K(android.view.View, android.view.View, boolean, boolean):boolean");
    }

    public FabTransformationSheetBehavior() {
    }
}
