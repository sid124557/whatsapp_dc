package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

/* renamed from: X.4Nw  reason: invalid class name */
public abstract class AnonymousClass4Nw extends ViewGroup {
    public int A00;
    public int A01;
    public int A02;
    public boolean A03 = false;

    public abstract void setSingleLine(boolean z);

    public int getItemSpacing() {
        return this.A00;
    }

    public int getLineSpacing() {
        return this.A01;
    }

    public int getRowCount() {
        return this.A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009d, code lost:
        if (r8 != 1073741824) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a5, code lost:
        if (r6 != 1073741824) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        if (r8 == 1073741824) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r18, int r19) {
        /*
            r17 = this;
            r13 = r18
            int r9 = android.view.View.MeasureSpec.getSize(r13)
            int r8 = android.view.View.MeasureSpec.getMode(r13)
            r12 = r19
            int r7 = android.view.View.MeasureSpec.getSize(r12)
            int r6 = android.view.View.MeasureSpec.getMode(r12)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 == r0) goto L_0x001f
            r1 = 1073741824(0x40000000, float:2.0)
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r8 != r1) goto L_0x0020
        L_0x001f:
            r0 = r9
        L_0x0020:
            r5 = r17
            int r16 = r5.getPaddingLeft()
            int r4 = r5.getPaddingTop()
            int r11 = X.AnonymousClass4L0.A03(r5, r0)
            r1 = r4
            r10 = 0
            r3 = 0
        L_0x0031:
            int r0 = r5.getChildCount()
            if (r10 >= r0) goto L_0x008d
            android.view.View r15 = r5.getChildAt(r10)
            int r2 = r15.getVisibility()
            r0 = 8
            if (r2 == r0) goto L_0x0087
            r5.measureChild(r15, r13, r12)
            android.view.ViewGroup$LayoutParams r2 = r15.getLayoutParams()
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x008a
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r14 = r2.leftMargin
            int r2 = r2.rightMargin
        L_0x0054:
            int r0 = r16 + r14
            int r0 = X.C86664Kz.A0G(r15, r0)
            if (r0 <= r11) goto L_0x0067
            boolean r0 = r5.A03
            if (r0 != 0) goto L_0x0067
            int r16 = r5.getPaddingLeft()
            int r1 = r5.A01
            int r1 = r1 + r4
        L_0x0067:
            int r0 = r16 + r14
            int r0 = X.C86664Kz.A0G(r15, r0)
            int r4 = X.AnonymousClass4L0.A04(r15, r1)
            if (r0 <= r3) goto L_0x0074
            r3 = r0
        L_0x0074:
            int r14 = r14 + r2
            int r14 = X.C86664Kz.A0G(r15, r14)
            int r0 = r5.A00
            int r14 = r14 + r0
            int r16 = r16 + r14
            int r0 = r5.getChildCount()
            int r0 = r0 + -1
            if (r10 != r0) goto L_0x0087
            int r3 = r3 + r2
        L_0x0087:
            int r10 = r10 + 1
            goto L_0x0031
        L_0x008a:
            r14 = 0
            r2 = 0
            goto L_0x0054
        L_0x008d:
            int r0 = r5.getPaddingRight()
            int r3 = r3 + r0
            int r0 = r5.getPaddingBottom()
            int r4 = r4 + r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 == r0) goto L_0x00b1
            r0 = 1073741824(0x40000000, float:2.0)
            if (r8 == r0) goto L_0x00b5
        L_0x009f:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == r0) goto L_0x00ab
            r0 = 1073741824(0x40000000, float:2.0)
            if (r6 == r0) goto L_0x00af
        L_0x00a7:
            r5.setMeasuredDimension(r3, r4)
            return
        L_0x00ab:
            int r7 = java.lang.Math.min(r4, r7)
        L_0x00af:
            r4 = r7
            goto L_0x00a7
        L_0x00b1:
            int r9 = java.lang.Math.min(r3, r9)
        L_0x00b5:
            r3 = r9
            goto L_0x009f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4Nw.onMeasure(int, int):void");
    }

    public AnonymousClass4Nw(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C1463179t.A0E, 0, 0);
        this.A01 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.A00 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int paddingLeft;
        int paddingRight;
        int i5;
        int i6;
        if (getChildCount() == 0) {
            this.A02 = 0;
            return;
        }
        this.A02 = 1;
        if (AnonymousClass0YH.A01(this) == 1) {
            z2 = true;
            paddingLeft = getPaddingRight();
            paddingRight = getPaddingLeft();
        } else {
            z2 = false;
            paddingLeft = getPaddingLeft();
            paddingRight = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int i7 = (i3 - i) - paddingRight;
        int i8 = paddingLeft;
        int i9 = paddingTop;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, AnonymousClass0x7.A0f());
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i6 = C06060Wb.A02(marginLayoutParams);
                    i5 = C06060Wb.A01(marginLayoutParams);
                } else {
                    i5 = 0;
                    i6 = 0;
                }
                int A0G = C86664Kz.A0G(childAt, i8 + i6);
                if (!this.A03 && A0G > i7) {
                    i9 = this.A01 + paddingTop;
                    this.A02++;
                    i8 = paddingLeft;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.A02 - 1));
                int i11 = i8 + i6;
                int measuredWidth = childAt.getMeasuredWidth() + i11;
                paddingTop = childAt.getMeasuredHeight() + i9;
                if (z2) {
                    i11 = i7 - measuredWidth;
                    measuredWidth = (i7 - i8) - i6;
                }
                childAt.layout(i11, i9, measuredWidth, paddingTop);
                i8 += C86664Kz.A0G(childAt, i6 + i5) + this.A00;
            }
        }
    }

    public void setItemSpacing(int i) {
        this.A00 = i;
    }

    public void setLineSpacing(int i) {
        this.A01 = i;
    }
}
