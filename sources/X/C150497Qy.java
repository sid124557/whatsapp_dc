package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.7Qy  reason: invalid class name and case insensitive filesystem */
public abstract class C150497Qy {
    public void A00(View view) {
        View.OnLayoutChangeListener onLayoutChangeListener;
        int i;
        if (this instanceof C139796sd) {
            if (!C06360Xi.A05(view) || view.isLayoutRequested()) {
                i = 9;
            } else {
                BottomSheetBehavior A01 = BottomSheetBehavior.A01(view);
                ViewParent parent = view.getParent();
                C162457s7.A0K(parent, "null cannot be cast to non-null type android.view.View");
                A01.A0U(((View) parent).getHeight() / 2, false);
                A01.A0S(4);
                A01.A0p = true;
                return;
            }
        } else if (this instanceof C139816sf) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -1;
                view.setLayoutParams(layoutParams);
                if (!C06360Xi.A05(view) || view.isLayoutRequested()) {
                    onLayoutChangeListener = new AnonymousClass91C(view, 3, this);
                    view.addOnLayoutChangeListener(onLayoutChangeListener);
                }
                BottomSheetBehavior A012 = BottomSheetBehavior.A01(view);
                AnonymousClass6C9.A0v(view, A012);
                A012.A0Z(new C188888ze(this, 1, A012));
                return;
            }
            throw AnonymousClass001.A0g("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        } else if (this instanceof C139786sc) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = -2;
                view.setLayoutParams(layoutParams2);
                if (!C06360Xi.A05(view) || view.isLayoutRequested()) {
                    i = 8;
                } else {
                    AnonymousClass6C9.A0v(view, BottomSheetBehavior.A01(view));
                    return;
                }
            } else {
                throw AnonymousClass001.A0g("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        } else {
            ((C139806se) this).A00.A1X(view);
            return;
        }
        onLayoutChangeListener = new C1891690g((Object) view, i);
        view.addOnLayoutChangeListener(onLayoutChangeListener);
    }
}
