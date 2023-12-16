package com.whatsapp.mediacomposer.filter;

import X.AnonymousClass5Y7;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.util.Log;

public class FilterSelectorController$4 extends BottomSheetBehavior {
    public boolean A00;
    public final /* synthetic */ AnonymousClass5Y7 A01;

    public boolean A0I(View view, CoordinatorLayout coordinatorLayout, int i) {
        this.A00 = true;
        return super.A0I(view, coordinatorLayout, i);
    }

    public FilterSelectorController$4(AnonymousClass5Y7 r1) {
        this.A01 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        if (r1.A03.A00(r5) != null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        if (r0 != null) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0E(android.view.MotionEvent r5, android.view.View r6, androidx.coordinatorlayout.widget.CoordinatorLayout r7) {
        /*
            r4 = this;
            boolean r0 = r4.A00
            r3 = 0
            if (r0 != 0) goto L_0x0011
            boolean r0 = r6.isShown()
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = "FilterSelectorController/ onInterceptTouchEvent called before onLayoutChild"
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x0010:
            return r3
        L_0x0011:
            int r1 = r5.getPointerCount()
            r0 = 2
            if (r1 >= r0) goto L_0x0010
            X.5Y7 r0 = r4.A01
            X.5eH r0 = r0.A0U
            com.whatsapp.mediacomposer.MediaComposerFragment r0 = r0.A01
            X.5nf r1 = r0.A0E
            X.5Ol r0 = r1.A0O
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0010
            X.5eJ r1 = r1.A0R
            X.5Ob r0 = r1.A04
            X.5Uw r0 = r0.A01
            if (r0 != 0) goto L_0x0037
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r1.A03
            X.5Uw r0 = r0.A00(r5)
            r2 = 0
            if (r0 == 0) goto L_0x0038
        L_0x0037:
            r2 = 1
        L_0x0038:
            X.7EA r0 = r1.A08
            X.5Uw r0 = r0.A00
            if (r0 != 0) goto L_0x0047
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r1.A03
            X.5Uw r0 = r0.A01(r5)
            r1 = 0
            if (r0 == 0) goto L_0x0048
        L_0x0047:
            r1 = 1
        L_0x0048:
            if (r2 != 0) goto L_0x0010
            if (r1 != 0) goto L_0x0010
            boolean r0 = super.A0E(r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.filter.FilterSelectorController$4.A0E(android.view.MotionEvent, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout):boolean");
    }

    public boolean A0F(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        if (this.A01.A0N.A00(motionEvent)) {
            return true;
        }
        try {
            if (!this.A00 || !super.A0F(motionEvent, view, coordinatorLayout)) {
                return false;
            }
            return true;
        } catch (IllegalArgumentException e) {
            Log.d("FilterSelectorController/ onTouchEvent exception", e);
            return false;
        }
    }
}
