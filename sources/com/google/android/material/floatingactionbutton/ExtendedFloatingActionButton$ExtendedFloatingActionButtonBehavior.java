package com.google.android.material.floatingactionbutton;

import X.AnonymousClass001;
import X.C002002f;
import X.C05630Ug;
import X.C1463179t;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.List;

public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior extends C05630Ug {
    public /* bridge */ /* synthetic */ boolean A0I(View view, CoordinatorLayout coordinatorLayout, int i) {
        List A05 = coordinatorLayout.A05((View) null);
        int size = A05.size();
        int i2 = 0;
        while (i2 < size) {
            View view2 = (View) A05.get(i2);
            if (view2 instanceof AppBarLayout) {
                throw AnonymousClass001.A0g("getLayoutParams");
            }
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (!(layoutParams instanceof C002002f) || !(((C002002f) layoutParams).A0A instanceof BottomSheetBehavior)) {
                i2++;
            } else {
                throw AnonymousClass001.A0g("getLayoutParams");
            }
        }
        coordinatorLayout.A0B((View) null, i);
        return true;
    }

    public /* bridge */ /* synthetic */ boolean A06(View view, View view2, CoordinatorLayout coordinatorLayout) {
        if (view2 instanceof AppBarLayout) {
            throw AnonymousClass001.A0g("getLayoutParams");
        }
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (!(layoutParams instanceof C002002f) || !(((C002002f) layoutParams).A0A instanceof BottomSheetBehavior)) {
            return false;
        }
        throw AnonymousClass001.A0g("getLayoutParams");
    }

    public void A0D(C002002f r2) {
        if (r2.A01 == 0) {
            r2.A01 = 80;
        }
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1463179t.A0B);
        obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
    }

    public /* bridge */ /* synthetic */ boolean A03(Rect rect, View view, CoordinatorLayout coordinatorLayout) {
        return false;
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
    }
}
