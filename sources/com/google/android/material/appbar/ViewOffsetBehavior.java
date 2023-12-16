package com.google.android.material.appbar;

import X.AnonymousClass001;
import X.AnonymousClass0I2;
import X.AnonymousClass0XY;
import X.AnonymousClass0YY;
import X.AnonymousClass7TO;
import X.C002002f;
import X.C05630Ug;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

public class ViewOffsetBehavior extends C05630Ug {
    public int A00 = 0;
    public AnonymousClass7TO A01;

    public boolean A0I(View view, CoordinatorLayout coordinatorLayout, int i) {
        int i2;
        int i3 = i;
        if (this instanceof HeaderScrollingViewBehavior) {
            HeaderScrollingViewBehavior headerScrollingViewBehavior = (HeaderScrollingViewBehavior) this;
            List A05 = coordinatorLayout.A05(view);
            int size = A05.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    break;
                }
                View view2 = (View) A05.get(i4);
                if (!(view2 instanceof AppBarLayout)) {
                    i4++;
                } else if (view2 != null) {
                    C002002f A0W = AnonymousClass001.A0W(view);
                    Rect rect = headerScrollingViewBehavior.A02;
                    rect.set(coordinatorLayout.getPaddingLeft() + A0W.leftMargin, view2.getBottom() + A0W.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - A0W.rightMargin, ((coordinatorLayout.getHeight() + view2.getBottom()) - coordinatorLayout.getPaddingBottom()) - A0W.bottomMargin);
                    AnonymousClass0XY r2 = coordinatorLayout.A06;
                    if (r2 != null && AnonymousClass0YY.A0B(coordinatorLayout) && !AnonymousClass0YY.A0B(view)) {
                        rect.left += r2.A03();
                        rect.right -= r2.A04();
                    }
                    Rect rect2 = headerScrollingViewBehavior.A03;
                    int i5 = A0W.A02;
                    if (i5 == 0) {
                        i5 = 8388659;
                    }
                    AnonymousClass0I2.A00(i5, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i3);
                    int i6 = 0;
                    if (headerScrollingViewBehavior.A00 != 0) {
                        float A0K = headerScrollingViewBehavior.A0K(view2);
                        int i7 = headerScrollingViewBehavior.A00;
                        int i8 = (int) (A0K * ((float) i7));
                        if (i8 >= 0) {
                            i6 = i8;
                            if (i8 > i7) {
                                i6 = i7;
                            }
                        }
                    }
                    view.layout(rect2.left, rect2.top - i6, rect2.right, rect2.bottom - i6);
                    i2 = rect2.top - view2.getBottom();
                }
            }
            coordinatorLayout.A0B(view, i);
            i2 = 0;
            headerScrollingViewBehavior.A01 = i2;
        } else {
            coordinatorLayout.A0B(view, i);
        }
        AnonymousClass7TO r22 = this.A01;
        if (r22 == null) {
            r22 = new AnonymousClass7TO(view);
            this.A01 = r22;
        }
        View view3 = r22.A03;
        r22.A01 = view3.getTop();
        r22.A00 = view3.getLeft();
        this.A01.A00();
        int i9 = this.A00;
        if (i9 == 0) {
            return true;
        }
        AnonymousClass7TO r1 = this.A01;
        if (r1.A02 != i9) {
            r1.A02 = i9;
            r1.A00();
        }
        this.A00 = 0;
        return true;
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ViewOffsetBehavior() {
    }
}
