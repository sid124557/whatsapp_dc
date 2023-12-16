package com.google.android.material.transformation;

import X.AnonymousClass001;
import X.AnonymousClass6Z3;
import X.C05630Ug;
import X.C178828iA;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

@Deprecated
public abstract class ExpandableBehavior extends C05630Ug {
    public int A00 = 0;

    public abstract boolean A0K(View view, View view2, boolean z, boolean z2);

    public boolean A05(View view, View view2, CoordinatorLayout coordinatorLayout) {
        if (this instanceof FabTransformationScrimBehavior) {
            return view2 instanceof AnonymousClass6Z3;
        }
        if (view.getVisibility() == 8) {
            throw AnonymousClass001.A0e("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof AnonymousClass6Z3)) {
            return false;
        } else {
            int i = ((AnonymousClass6Z3) view2).A0F.A00;
            if (i == 0 || i == view.getId()) {
                return true;
            }
            return false;
        }
    }

    public boolean A06(View view, View view2, CoordinatorLayout coordinatorLayout) {
        int i;
        C178828iA r6 = (C178828iA) view2;
        boolean z = ((AnonymousClass6Z3) r6).A0F.A01;
        int i2 = this.A00;
        if (!z) {
            i = 2;
            if (i2 != 1) {
                return false;
            }
        } else if (i2 != 0 && i2 != 2) {
            return false;
        } else {
            i = 1;
        }
        this.A00 = i;
        return A0K((View) r6, view, z, true);
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        if (r3 != false) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0I(android.view.View r6, androidx.coordinatorlayout.widget.CoordinatorLayout r7, int r8) {
        /*
            r5 = this;
            boolean r0 = X.C06360Xi.A05(r6)
            if (r0 != 0) goto L_0x0044
            java.util.List r3 = r7.A05(r6)
            int r2 = r3.size()
            r1 = 0
        L_0x000f:
            if (r1 >= r2) goto L_0x0044
            java.lang.Object r4 = r3.get(r1)
            android.view.View r4 = (android.view.View) r4
            boolean r0 = r5.A05(r6, r4, r7)
            if (r0 == 0) goto L_0x0046
            X.8iA r4 = (X.C178828iA) r4
            if (r4 == 0) goto L_0x0044
            r0 = r4
            X.6Z3 r0 = (X.AnonymousClass6Z3) r0
            X.7WF r0 = r0.A0F
            boolean r3 = r0.A01
            r1 = 1
            int r0 = r5.A00
            if (r3 == 0) goto L_0x0030
            if (r0 == 0) goto L_0x0035
            r1 = 2
        L_0x0030:
            if (r0 != r1) goto L_0x0044
            r2 = 2
            if (r3 == 0) goto L_0x0036
        L_0x0035:
            r2 = 1
        L_0x0036:
            r5.A00 = r2
            android.view.ViewTreeObserver r1 = r6.getViewTreeObserver()
            X.7zd r0 = new X.7zd
            r0.<init>(r6, r4, r5, r2)
            r1.addOnPreDrawListener(r0)
        L_0x0044:
            r0 = 0
            return r0
        L_0x0046:
            int r1 = r1 + 1
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.ExpandableBehavior.A0I(android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout, int):boolean");
    }

    public ExpandableBehavior() {
    }
}
