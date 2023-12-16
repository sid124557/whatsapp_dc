package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* renamed from: X.6Fj  reason: invalid class name */
public class AnonymousClass6Fj extends LinearLayout implements ViewGroup.OnHierarchyChangeListener, AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;
    public int[] A02;

    public final Object generatedComponent() {
        C116855qy r0 = this.A00;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public AnonymousClass6Fj(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A02 = new int[4];
        setOnHierarchyChangeListener(this);
    }

    public void onChildViewAdded(View view, View view2) {
        int childCount = getChildCount();
        if (this.A02.length < childCount) {
            this.A02 = new int[childCount];
        }
    }

    public void onChildViewRemoved(View view, View view2) {
    }

    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int childCount = getChildCount();
        int i3 = 1;
        if (childCount > 1 && size > 0) {
            View childAt = getChildAt(0);
            childAt.measure(View.MeasureSpec.makeMeasureSpec(0, 0), i2);
            int size2 = View.MeasureSpec.getSize(i) - childAt.getMeasuredWidth();
            int i4 = 1;
            boolean z = false;
            int i5 = 0;
            do {
                View childAt2 = getChildAt(i4);
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(size2, 0), i2);
                this.A02[i4] = childAt2.getMeasuredWidth();
                i5 += this.A02[i4];
                if (((float) childAt2.getMeasuredWidth()) > ((float) size2) / ((float) (childCount - 1))) {
                    z = true;
                }
                i4++;
            } while (i4 < childCount);
            if (z) {
                do {
                    getChildAt(i3).measure(C86664Kz.A05((this.A02[i3] * size2) / i5), i2);
                    i3++;
                } while (i3 < childCount);
                setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
                return;
            }
        }
        super.onMeasure(i, i2);
    }
}
