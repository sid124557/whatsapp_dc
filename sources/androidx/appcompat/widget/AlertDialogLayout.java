package androidx.appcompat.widget;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0YH;
import X.AnonymousClass0YY;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.whatsapp.R;

public class AlertDialogLayout extends LinearLayoutCompat {
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int childCount = getChildCount();
        View view = null;
        int i9 = 0;
        View view2 = null;
        View view3 = null;
        int i10 = 0;
        while (true) {
            i3 = i;
            i4 = i2;
            if (i10 < childCount) {
                View childAt = getChildAt(i10);
                if (childAt.getVisibility() != 8) {
                    int id = childAt.getId();
                    if (id == R.id.topPanel) {
                        view = childAt;
                    } else if (id == R.id.buttonPanel) {
                        view2 = childAt;
                    } else if ((id == R.id.contentPanel || id == R.id.customPanel) && view3 == null) {
                        view3 = childAt;
                    }
                }
                i10++;
            } else {
                int mode = View.MeasureSpec.getMode(i4);
                int size = View.MeasureSpec.getSize(i4);
                int mode2 = View.MeasureSpec.getMode(i3);
                int A03 = AnonymousClass000.A03(this);
                if (view != null) {
                    view.measure(i3, 0);
                    A03 += view.getMeasuredHeight();
                    i5 = AnonymousClass000.A04(view, 0);
                } else {
                    i5 = 0;
                }
                if (view2 != null) {
                    view2.measure(i3, 0);
                    i6 = A00(view2);
                    i7 = view2.getMeasuredHeight() - i6;
                    A03 += i6;
                    i5 = AnonymousClass000.A04(view2, i5);
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (view3 != null) {
                    if (mode != 0) {
                        i9 = View.MeasureSpec.makeMeasureSpec(AnonymousClass001.A0C(size, A03, 0), mode);
                    }
                    view3.measure(i3, i9);
                    i8 = view3.getMeasuredHeight();
                    A03 += i8;
                    i5 = AnonymousClass000.A04(view3, i5);
                } else {
                    i8 = 0;
                }
                int i11 = size - A03;
                if (view2 != null) {
                    int i12 = A03 - i6;
                    int min = Math.min(i11, i7);
                    if (min > 0) {
                        i11 -= min;
                        i6 += min;
                    }
                    AnonymousClass001.A19(view2, i6, 1073741824, i3);
                    A03 = i12 + view2.getMeasuredHeight();
                    i5 = AnonymousClass000.A04(view2, i5);
                }
                if (view3 != null && i11 > 0) {
                    AnonymousClass001.A19(view3, i8 + i11, mode, i3);
                    A03 = (A03 - i8) + view3.getMeasuredHeight();
                    i5 = AnonymousClass000.A04(view3, i5);
                }
                int i13 = 0;
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt2 = getChildAt(i14);
                    if (childAt2.getVisibility() != 8) {
                        i13 = Math.max(i13, childAt2.getMeasuredWidth());
                    }
                }
                setMeasuredDimension(View.resolveSizeAndState(i13 + AnonymousClass000.A02(this), i3, i5), View.resolveSizeAndState(A03, i4, 0));
                if (mode2 != 1073741824) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                    for (int i15 = 0; i15 < childCount; i15++) {
                        View childAt3 = getChildAt(i15);
                        if (childAt3.getVisibility() != 8) {
                            LinearLayout.LayoutParams A0U = AnonymousClass001.A0U(childAt3);
                            if (A0U.width == -1) {
                                int i16 = A0U.height;
                                A0U.height = childAt3.getMeasuredHeight();
                                measureChildWithMargins(childAt3, makeMeasureSpec, 0, i4, 0);
                                A0U.height = i16;
                            }
                        }
                    }
                    return;
                }
                return;
            }
        }
        super.onMeasure(i3, i4);
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static int A00(View view) {
        int A01 = AnonymousClass0YY.A01(view);
        if (A01 > 0) {
            return A01;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return A00(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingTop;
        int intrinsicHeight;
        int i5;
        int i6;
        int paddingLeft = getPaddingLeft();
        int i7 = i3 - i;
        int paddingRight = i7 - getPaddingRight();
        int paddingRight2 = (i7 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int i8 = this.A06;
        int i9 = i8 & 112;
        int i10 = i8 & 8388615;
        if (i9 != 16) {
            paddingTop = getPaddingTop();
            if (i9 == 80) {
                paddingTop = ((paddingTop + i4) - i2) - measuredHeight;
            }
        } else {
            paddingTop = getPaddingTop() + (((i4 - i2) - measuredHeight) / 2);
        }
        Drawable drawable = this.A0A;
        if (drawable == null) {
            intrinsicHeight = 0;
        } else {
            intrinsicHeight = drawable.getIntrinsicHeight();
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                LinearLayout.LayoutParams A0U = AnonymousClass001.A0U(childAt);
                int i12 = A0U.gravity;
                if (i12 < 0) {
                    i12 = i10;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i12, AnonymousClass0YH.A01(this)) & 7;
                if (absoluteGravity == 1) {
                    i5 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + A0U.leftMargin;
                    i6 = i5 - A0U.rightMargin;
                } else if (absoluteGravity != 5) {
                    i6 = A0U.leftMargin + paddingLeft;
                } else {
                    i5 = paddingRight - measuredWidth;
                    i6 = i5 - A0U.rightMargin;
                }
                if (A06(i11)) {
                    paddingTop += intrinsicHeight;
                }
                int i13 = paddingTop + A0U.topMargin;
                childAt.layout(i6, i13, measuredWidth + i6, measuredHeight2 + i13);
                paddingTop = i13 + measuredHeight2 + A0U.bottomMargin;
            }
        }
    }

    public AlertDialogLayout(Context context) {
        super(context, (AttributeSet) null);
    }
}
