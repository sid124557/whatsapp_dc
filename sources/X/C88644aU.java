package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4aU  reason: invalid class name and case insensitive filesystem */
public class C88644aU extends C87084Ny {
    public boolean A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final List A05 = AnonymousClass001.A0s();

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        C07890cz r0 = this.A0H;
        int size = View.MeasureSpec.getSize(i);
        int size2 = r0.A05().size();
        int childCount = getChildCount();
        List list = this.A05;
        list.clear();
        int size3 = View.MeasureSpec.getSize(i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        int i5 = this.A09;
        boolean z = true;
        if (i5 != -1 ? i5 != 0 : size2 <= 3) {
            z = false;
        }
        int i6 = 1;
        if (!z || !this.A00) {
            if (size2 != 0) {
                i6 = size2;
            }
            int min = Math.min(size / i6, this.A01);
            int i7 = size - (size2 * min);
            for (int i8 = 0; i8 < childCount; i8++) {
                if (getChildAt(i8).getVisibility() != 8) {
                    i3 = min;
                    if (i7 > 0) {
                        i3 = min + 1;
                        i7--;
                    }
                } else {
                    i3 = 0;
                }
                C86634Kw.A1V(list, i3);
            }
        } else {
            View childAt = getChildAt(this.A0B);
            int i9 = this.A02;
            if (childAt.getVisibility() != 8) {
                C86644Kx.A10(childAt, this.A01, Integer.MIN_VALUE, makeMeasureSpec);
                i9 = Math.max(i9, childAt.getMeasuredWidth());
            }
            int i10 = size2 - (AnonymousClass001.A1X(childAt.getVisibility(), 8) ? 1 : 0);
            int min2 = Math.min(size - (this.A04 * i10), Math.min(i9, this.A01));
            int i11 = size - min2;
            if (i10 != 0) {
                i6 = i10;
            }
            int min3 = Math.min(i11 / i6, this.A03);
            int i12 = i11 - (i10 * min3);
            for (int i13 = 0; i13 < childCount; i13++) {
                if (getChildAt(i13).getVisibility() != 8) {
                    i4 = min3;
                    if (i13 == this.A0B) {
                        i4 = min2;
                    }
                    if (i12 > 0) {
                        i4++;
                        i12--;
                    }
                } else {
                    i4 = 0;
                }
                C86634Kw.A1V(list, i4);
            }
        }
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = getChildAt(i15);
            if (childAt2.getVisibility() != 8) {
                C86644Kx.A10(childAt2, AnonymousClass000.A09(list, i15), 1073741824, makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i14 = C86664Kz.A0G(childAt2, i14);
            }
        }
        setMeasuredDimension(i14, size3);
    }

    public C88644aU(Context context) {
        super(context);
        FrameLayout.LayoutParams A0p = C86664Kz.A0p();
        A0p.gravity = 17;
        setLayoutParams(A0p);
        Resources resources = getResources();
        this.A03 = resources.getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A04 = resources.getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A01 = resources.getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A02 = resources.getDimensionPixelSize(R.dimen.f6nameremoved);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                if (AnonymousClass0YH.A01(this) == 1) {
                    int i9 = i5 - i7;
                    childAt.layout(i9 - childAt.getMeasuredWidth(), 0, i9, i6);
                } else {
                    childAt.layout(i7, 0, childAt.getMeasuredWidth() + i7, i6);
                }
                i7 = C86664Kz.A0G(childAt, i7);
            }
        }
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.A00 = z;
    }
}
