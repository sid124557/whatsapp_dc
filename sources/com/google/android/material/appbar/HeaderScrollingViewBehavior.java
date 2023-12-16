package com.google.android.material.appbar;

import X.AnonymousClass001;
import X.AnonymousClass0XY;
import X.AnonymousClass0YY;
import X.C05630Ug;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar$ScrollingViewBehavior;
import java.util.List;

public abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior {
    public int A00;
    public int A01 = 0;
    public final Rect A02 = AnonymousClass001.A0N();
    public final Rect A03 = AnonymousClass001.A0N();

    public float A0K(View view) {
        int i;
        int i2;
        if (!(this instanceof AppBarLayout.ScrollingViewBehavior)) {
            return 1.0f;
        }
        if (!(view instanceof AppBarLayout)) {
            return 0.0f;
        }
        AppBarLayout appBarLayout = (AppBarLayout) view;
        int totalScrollRange = appBarLayout.getTotalScrollRange();
        int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
        C05630Ug r1 = AnonymousClass001.A0W(appBarLayout).A0A;
        if (r1 instanceof AppBarLayout.BaseBehavior) {
            i = ((HeaderBehavior) r1).A0K();
        } else {
            i = 0;
        }
        if ((downNestedPreScrollRange == 0 || totalScrollRange + i > downNestedPreScrollRange) && (i2 = totalScrollRange - downNestedPreScrollRange) != 0) {
            return (((float) i) / ((float) i2)) + 1.0f;
        }
        return 0.0f;
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean A0J(View view, CoordinatorLayout coordinatorLayout, int i, int i2, int i3, int i4) {
        int measuredHeight;
        AnonymousClass0XY r0;
        int i5 = view.getLayoutParams().height;
        if (i5 != -1 && i5 != -2) {
            return false;
        }
        List A05 = coordinatorLayout.A05(view);
        int size = A05.size();
        int i6 = 0;
        while (i6 < size) {
            View view2 = (View) A05.get(i6);
            if (!(view2 instanceof AppBarLayout)) {
                i6++;
            } else if (view2 == null) {
                return false;
            } else {
                int size2 = View.MeasureSpec.getSize(i3);
                if (size2 <= 0) {
                    size2 = coordinatorLayout.getHeight();
                } else if (AnonymousClass0YY.A0B(view2) && (r0 = coordinatorLayout.A06) != null) {
                    size2 += r0.A05() + r0.A02();
                }
                if (this instanceof AppBarLayout.ScrollingViewBehavior) {
                    measuredHeight = ((AppBarLayout) view2).getTotalScrollRange();
                } else {
                    measuredHeight = view2.getMeasuredHeight();
                }
                int i7 = size2 + measuredHeight;
                int measuredHeight2 = view2.getMeasuredHeight();
                if (this instanceof SearchBar$ScrollingViewBehavior) {
                    view.setTranslationY((float) (-measuredHeight2));
                } else {
                    view.setTranslationY(0.0f);
                    i7 -= measuredHeight2;
                }
                int i8 = Integer.MIN_VALUE;
                if (i5 == -1) {
                    i8 = 1073741824;
                }
                coordinatorLayout.A0C(view, i, i2, View.MeasureSpec.makeMeasureSpec(i7, i8));
                return true;
            }
        }
        return false;
    }

    public HeaderScrollingViewBehavior() {
    }
}
