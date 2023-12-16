package X;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;

/* renamed from: X.74n  reason: invalid class name and case insensitive filesystem */
public class C1451874n implements C15860s4 {
    public Object A00;
    public final int A01;

    public C1451874n(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public boolean Bgj(View view, AnonymousClass0KQ r7) {
        boolean z;
        if (this.A01 != 0) {
            return ((BottomSheetDragHandleView) this.A00).A02();
        }
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.A00;
        if (swipeDismissBehavior instanceof BaseTransientBottomBar$Behavior) {
            z = view instanceof AnonymousClass6FH;
        } else {
            z = true;
        }
        boolean z2 = false;
        if (!z) {
            return false;
        }
        boolean A1U = AnonymousClass000.A1U(AnonymousClass0YH.A01(view), 1);
        int i = swipeDismissBehavior.A02;
        if (i != 0 ? !(i != 1 || A1U) : A1U) {
            z2 = true;
        }
        int width = view.getWidth();
        if (z2) {
            width = -width;
        }
        C06560Yg.A0I(view, width);
        view.setAlpha(0.0f);
        C181188mL r0 = swipeDismissBehavior.A04;
        if (r0 == null) {
            return true;
        }
        r0.BRJ(view);
        return true;
    }
}
