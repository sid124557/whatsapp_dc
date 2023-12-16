package androidx.appcompat.widget;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass03W;
import X.AnonymousClass0KC;
import X.AnonymousClass0UD;
import X.AnonymousClass0YH;
import X.C06560Yg;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

public class LinearLayoutCompat extends ViewGroup {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public Drawable A0A;
    public boolean A0B;
    public boolean A0C;
    public int[] A0D;
    public int[] A0E;

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0B = true;
        this.A01 = -1;
        this.A02 = 0;
        this.A06 = 8388659;
        int[] iArr = AnonymousClass0KC.A0C;
        AnonymousClass0UD A002 = AnonymousClass0UD.A00(context, attributeSet, iArr, i, 0);
        TypedArray typedArray = A002.A02;
        C06560Yg.A0B(context, typedArray, attributeSet, this, iArr, i);
        int i2 = typedArray.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = typedArray.getInt(0, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        if (!typedArray.getBoolean(2, true)) {
            this.A0B = false;
        }
        this.A00 = typedArray.getFloat(4, -1.0f);
        this.A01 = typedArray.getInt(3, -1);
        this.A0C = typedArray.getBoolean(7, false);
        setDividerDrawable(A002.A02(5));
        this.A08 = typedArray.getInt(8, 0);
        this.A04 = typedArray.getDimensionPixelSize(6, 0);
        typedArray.recycle();
    }

    public boolean A06(int i) {
        int i2;
        if (i == 0) {
            i2 = this.A08 & 1;
        } else {
            int childCount = getChildCount();
            int i3 = this.A08;
            if (i == childCount) {
                i2 = i3 & 4;
            } else if ((i3 & 2) == 0) {
                return false;
            } else {
                int i4 = i - 1;
                while (i4 >= 0) {
                    if (getChildAt(i4).getVisibility() == 8) {
                        i4--;
                    }
                }
                return false;
            }
        }
        return i2 != 0;
    }

    public void setWeightSum(float f) {
        this.A00 = Math.max(0.0f, f);
    }

    /* renamed from: A01 */
    public AnonymousClass03W generateDefaultLayoutParams() {
        int i = this.A07;
        int i2 = -2;
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            i2 = -1;
        }
        return new AnonymousClass03W(i2);
    }

    /* renamed from: A03 */
    public AnonymousClass03W generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new AnonymousClass03W(layoutParams);
    }

    public void A04(Canvas canvas, int i) {
        this.A0A.setBounds(getPaddingLeft() + this.A04, i, AnonymousClass001.A0I(this) - this.A04, this.A03 + i);
        this.A0A.draw(canvas);
    }

    public void A05(Canvas canvas, int i) {
        this.A0A.setBounds(i, getPaddingTop() + this.A04, this.A05 + i, AnonymousClass001.A0H(this) - this.A04);
        this.A0A.draw(canvas);
    }

    public int getBaseline() {
        int i;
        if (this.A01 < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.A01;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i3 = this.A02;
                if (this.A07 == 1 && (i = this.A06 & 112) != 48) {
                    if (i == 16) {
                        i3 += (AnonymousClass000.A05(this, getBottom() - getTop()) - this.A09) / 2;
                    } else if (i == 80) {
                        i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.A09;
                    }
                }
                return i3 + AnonymousClass001.A0U(childAt).topMargin + baseline;
            } else if (this.A01 == 0) {
                return -1;
            } else {
                throw AnonymousClass002.A0E("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw AnonymousClass002.A0E("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.A01;
    }

    public Drawable getDividerDrawable() {
        return this.A0A;
    }

    public int getDividerPadding() {
        return this.A04;
    }

    public int getDividerWidth() {
        return this.A05;
    }

    public int getGravity() {
        return this.A06;
    }

    public int getOrientation() {
        return this.A07;
    }

    public int getShowDividers() {
        return this.A08;
    }

    public float getWeightSum() {
        return this.A00;
    }

    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int left;
        int bottom;
        if (this.A0A == null) {
            return;
        }
        if (this.A07 == 1) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (!(childAt == null || childAt.getVisibility() == 8 || !A06(i4))) {
                    A04(canvas, (childAt.getTop() - AnonymousClass001.A0U(childAt).topMargin) - this.A03);
                }
            }
            if (A06(childCount)) {
                View childAt2 = getChildAt(childCount - 1);
                if (childAt2 == null) {
                    bottom = AnonymousClass001.A0H(this) - this.A03;
                } else {
                    bottom = childAt2.getBottom() + AnonymousClass001.A0U(childAt2).bottomMargin;
                }
                A04(canvas, bottom);
                return;
            }
            return;
        }
        int childCount2 = getChildCount();
        boolean z = true;
        if (AnonymousClass0YH.A01(this) != 1) {
            z = false;
        }
        for (int i5 = 0; i5 < childCount2; i5++) {
            View childAt3 = getChildAt(i5);
            if (!(childAt3 == null || childAt3.getVisibility() == 8 || !A06(i5))) {
                LinearLayout.LayoutParams A0U = AnonymousClass001.A0U(childAt3);
                if (z) {
                    left = childAt3.getRight() + A0U.rightMargin;
                } else {
                    left = (childAt3.getLeft() - A0U.leftMargin) - this.A05;
                }
                A05(canvas, left);
            }
        }
        if (A06(childCount2)) {
            View childAt4 = getChildAt(childCount2 - 1);
            if (childAt4 != null) {
                LinearLayout.LayoutParams A0U2 = AnonymousClass001.A0U(childAt4);
                if (z) {
                    i = childAt4.getLeft();
                    i2 = A0U2.leftMargin;
                    i3 = (i - i2) - this.A05;
                } else {
                    i3 = childAt4.getRight() + A0U2.rightMargin;
                }
            } else if (z) {
                i3 = getPaddingLeft();
            } else {
                i = getWidth();
                i2 = getPaddingRight();
                i3 = (i - i2) - this.A05;
            }
            A05(canvas, i3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x0150  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            r22 = this;
            r7 = r22
            int r0 = r7.A07
            r6 = 1
            if (r0 != r6) goto L_0x00a4
            int r13 = r7.getPaddingLeft()
            int r26 = r26 - r24
            int r0 = r7.getPaddingRight()
            int r12 = r26 - r0
            int r26 = r26 - r13
            int r0 = r7.getPaddingRight()
            int r26 = r26 - r0
            int r4 = r7.getChildCount()
            int r3 = r7.A06
            r1 = r3 & 112(0x70, float:1.57E-43)
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r3 = r3 & r0
            r0 = 16
            if (r1 == r0) goto L_0x0096
            r0 = 80
            int r2 = r7.getPaddingTop()
            if (r1 != r0) goto L_0x003a
            int r2 = r2 + r27
            int r2 = r2 - r25
            int r0 = r7.A09
            int r2 = r2 - r0
        L_0x003a:
            r9 = 0
        L_0x003b:
            if (r9 >= r4) goto L_0x0191
            android.view.View r10 = r7.getChildAt(r9)
            if (r10 == 0) goto L_0x0084
            int r1 = r10.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x0084
            int r8 = r10.getMeasuredWidth()
            int r11 = r10.getMeasuredHeight()
            android.widget.LinearLayout$LayoutParams r5 = X.AnonymousClass001.A0U(r10)
            int r1 = r5.gravity
            if (r1 >= 0) goto L_0x005c
            r1 = r3
        L_0x005c:
            int r0 = X.AnonymousClass0YH.A01(r7)
            int r0 = android.view.Gravity.getAbsoluteGravity(r1, r0)
            r1 = r0 & 7
            if (r1 == r6) goto L_0x0087
            r0 = 5
            if (r1 == r0) goto L_0x0090
            int r1 = r5.leftMargin
            int r1 = r1 + r13
        L_0x006e:
            boolean r0 = r7.A06(r9)
            if (r0 == 0) goto L_0x0077
            int r0 = r7.A03
            int r2 = r2 + r0
        L_0x0077:
            int r0 = r5.topMargin
            int r2 = r2 + r0
            int r8 = r8 + r1
            int r0 = r11 + r2
            r10.layout(r1, r2, r8, r0)
            int r0 = r5.bottomMargin
            int r11 = r11 + r0
            int r2 = r2 + r11
        L_0x0084:
            int r9 = r9 + 1
            goto L_0x003b
        L_0x0087:
            int r0 = r26 - r8
            int r1 = r0 / 2
            int r1 = r1 + r13
            int r0 = r5.leftMargin
            int r1 = r1 + r0
            goto L_0x0092
        L_0x0090:
            int r1 = r12 - r8
        L_0x0092:
            int r0 = r5.rightMargin
            int r1 = r1 - r0
            goto L_0x006e
        L_0x0096:
            int r2 = r7.getPaddingTop()
            int r27 = r27 - r25
            int r0 = r7.A09
            int r27 = r27 - r0
            int r0 = r27 / 2
            int r2 = r2 + r0
            goto L_0x003a
        L_0x00a4:
            int r0 = X.AnonymousClass0YH.A01(r7)
            r9 = 1
            if (r0 == r6) goto L_0x00ac
            r9 = 0
        L_0x00ac:
            int r21 = r7.getPaddingTop()
            int r27 = r27 - r25
            int r0 = r7.getPaddingBottom()
            int r20 = r27 - r0
            int r27 = r27 - r21
            int r0 = r7.getPaddingBottom()
            int r27 = r27 - r0
            int r8 = r7.getChildCount()
            int r0 = r7.A06
            r1 = 8388615(0x800007, float:1.1754953E-38)
            r1 = r1 & r0
            r19 = r0 & 112(0x70, float:1.57E-43)
            boolean r5 = r7.A0B
            int[] r4 = r7.A0D
            int[] r3 = r7.A0E
            int r0 = X.AnonymousClass0YH.A01(r7)
            int r2 = android.view.Gravity.getAbsoluteGravity(r1, r0)
            r1 = 2
            if (r2 == r6) goto L_0x0181
            r0 = 5
            int r18 = r7.getPaddingLeft()
            if (r2 != r0) goto L_0x00ec
            int r18 = r18 + r26
            int r18 = r18 - r24
            int r0 = r7.A09
            int r18 = r18 - r0
        L_0x00ec:
            r17 = 0
            r16 = 1
            if (r9 == 0) goto L_0x00f6
            int r17 = r8 + -1
            r16 = -1
        L_0x00f6:
            r12 = 0
        L_0x00f7:
            if (r12 >= r8) goto L_0x0191
            int r0 = r16 * r12
            int r11 = r17 + r0
            android.view.View r10 = r7.getChildAt(r11)
            if (r10 == 0) goto L_0x0164
            int r1 = r10.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x0164
            int r15 = r10.getMeasuredWidth()
            int r9 = r10.getMeasuredHeight()
            android.widget.LinearLayout$LayoutParams r2 = X.AnonymousClass001.A0U(r10)
            if (r5 == 0) goto L_0x017f
            int r1 = r2.height
            r0 = -1
            if (r1 == r0) goto L_0x017f
            int r13 = r10.getBaseline()
        L_0x0122:
            int r0 = r2.gravity
            if (r0 >= 0) goto L_0x0128
            r0 = r19
        L_0x0128:
            r14 = r0 & 112(0x70, float:1.57E-43)
            r0 = 16
            if (r14 == r0) goto L_0x0173
            r0 = 48
            if (r14 == r0) goto L_0x0167
            r0 = 80
            r1 = r21
            if (r14 != r0) goto L_0x014a
            int r1 = r20 - r9
            int r0 = r2.bottomMargin
            int r1 = r1 - r0
            r0 = -1
            if (r13 == r0) goto L_0x014a
            int r14 = r10.getMeasuredHeight()
            int r14 = r14 - r13
            r0 = 2
            r0 = r3[r0]
            int r0 = r0 - r14
        L_0x0149:
            int r1 = r1 - r0
        L_0x014a:
            boolean r0 = r7.A06(r11)
            if (r0 == 0) goto L_0x0154
            int r0 = r7.A05
            int r18 = r18 + r0
        L_0x0154:
            int r11 = r2.leftMargin
            int r11 = r11 + r18
            int r0 = r15 + r11
            int r9 = r9 + r1
            r10.layout(r11, r1, r0, r9)
            int r0 = r2.rightMargin
            int r15 = r15 + r0
            int r11 = r11 + r15
            r18 = r11
        L_0x0164:
            int r12 = r12 + 1
            goto L_0x00f7
        L_0x0167:
            r0 = -1
            int r1 = r2.topMargin
            int r1 = r1 + r21
            if (r13 == r0) goto L_0x014a
            r0 = r4[r6]
            int r0 = r0 - r13
            int r1 = r1 + r0
            goto L_0x014a
        L_0x0173:
            int r1 = r27 - r9
            r0 = 2
            int r1 = r1 / r0
            int r1 = r1 + r21
            int r0 = r2.topMargin
            int r1 = r1 + r0
            int r0 = r2.bottomMargin
            goto L_0x0149
        L_0x017f:
            r13 = -1
            goto L_0x0122
        L_0x0181:
            int r18 = r7.getPaddingLeft()
            int r26 = r26 - r24
            int r0 = r7.A09
            int r26 = r26 - r0
            int r26 = r26 / r1
            int r18 = r18 + r26
            goto L_0x00ec
        L_0x0191:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01f6, code lost:
        if (r12.width == -1) goto L_0x01f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0202, code lost:
        if (r12.width != r6) goto L_0x0204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03b2, code lost:
        if (r11.height != -1) goto L_0x03b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0572, code lost:
        if (r11.height != -1) goto L_0x0574;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0591, code lost:
        if (r11.height != -1) goto L_0x0593;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ff, code lost:
        if (r2.width != -1) goto L_0x0101;
     */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x036b  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x038c  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x03ad  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03bc  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x03ca  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x03d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r37, int r38) {
        /*
            r36 = this;
            r1 = r36
            int r0 = r1.A07
            r10 = 1
            r32 = r37
            r34 = r38
            if (r0 != r10) goto L_0x02bd
            r0 = 0
            r1.A09 = r0
            int r4 = r1.getChildCount()
            int r23 = android.view.View.MeasureSpec.getMode(r32)
            int r9 = android.view.View.MeasureSpec.getMode(r34)
            int r12 = r1.A01
            boolean r11 = r1.A0C
            r22 = 0
            r21 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r6 = 0
            r5 = 0
            r3 = 0
            r20 = 0
            r19 = 1
            r18 = 0
        L_0x002e:
            r13 = 8
            if (r3 >= r4) goto L_0x0120
            android.view.View r17 = r1.getChildAt(r3)
            if (r17 != 0) goto L_0x003f
            int r0 = r1.A09
            r1.A09 = r0
        L_0x003c:
            int r3 = r3 + 1
            goto L_0x002e
        L_0x003f:
            int r0 = r17.getVisibility()
            if (r0 == r13) goto L_0x003c
            boolean r0 = r1.A06(r3)
            if (r0 == 0) goto L_0x0052
            int r2 = r1.A09
            int r0 = r1.A03
            int r2 = r2 + r0
            r1.A09 = r2
        L_0x0052:
            android.widget.LinearLayout$LayoutParams r2 = X.AnonymousClass001.A0U(r17)
            float r13 = r2.weight
            float r21 = r21 + r13
            r0 = 1073741824(0x40000000, float:2.0)
            if (r9 != r0) goto L_0x008e
            int r0 = r2.height
            if (r0 != 0) goto L_0x008e
            int r0 = (r13 > r22 ? 1 : (r13 == r22 ? 0 : -1))
            if (r0 <= 0) goto L_0x008e
            int r13 = r1.A09
            int r9 = r2.topMargin
            int r9 = r9 + r13
            int r0 = r2.bottomMargin
            int r13 = X.AnonymousClass001.A0B(r9, r0, r13)
            r1.A09 = r13
            r20 = 1
            r9 = 1073741824(0x40000000, float:2.0)
        L_0x0077:
            if (r12 < 0) goto L_0x007f
            int r0 = r3 + 1
            if (r12 != r0) goto L_0x007f
            r1.A02 = r13
        L_0x007f:
            if (r3 >= r12) goto L_0x00d4
            float r0 = r2.weight
            int r0 = (r0 > r22 ? 1 : (r0 == r22 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d4
            java.lang.String r0 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            java.lang.RuntimeException r0 = X.AnonymousClass002.A0E(r0)
            throw r0
        L_0x008e:
            int r0 = r2.height
            if (r0 != 0) goto L_0x00d1
            int r0 = (r13 > r22 ? 1 : (r13 == r22 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d1
            r0 = -2
            r2.height = r0
            r13 = 0
        L_0x009a:
            int r0 = (r21 > r22 ? 1 : (r21 == r22 ? 0 : -1))
            if (r0 != 0) goto L_0x00cf
            int r0 = r1.A09
        L_0x00a0:
            r27 = 0
            r24 = r1
            r25 = r17
            r26 = r32
            r28 = r34
            r29 = r0
            r24.measureChildWithMargins(r25, r26, r27, r28, r29)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r13 == r0) goto L_0x00b5
            r2.height = r13
        L_0x00b5:
            int r15 = r17.getMeasuredHeight()
            int r14 = r1.A09
            int r13 = r14 + r15
            int r0 = r2.topMargin
            int r13 = r13 + r0
            int r0 = r2.bottomMargin
            int r13 = X.AnonymousClass001.A0B(r13, r0, r14)
            r1.A09 = r13
            if (r11 == 0) goto L_0x0077
            int r10 = java.lang.Math.max(r15, r10)
            goto L_0x0077
        L_0x00cf:
            r0 = 0
            goto L_0x00a0
        L_0x00d1:
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x009a
        L_0x00d4:
            r13 = 1073741824(0x40000000, float:2.0)
            r0 = r23
            if (r0 == r13) goto L_0x011d
            int r13 = r2.width
            r0 = -1
            if (r13 != r0) goto L_0x011d
            r16 = 1
            r18 = 1
        L_0x00e3:
            int r15 = r2.leftMargin
            int r0 = r2.rightMargin
            int r15 = r15 + r0
            int r14 = r17.getMeasuredWidth()
            int r14 = r14 + r15
            int r8 = java.lang.Math.max(r8, r14)
            r0 = r17
            int r7 = X.AnonymousClass000.A04(r0, r7)
            if (r19 == 0) goto L_0x0101
            int r0 = r2.width
            r13 = r0
            r19 = 1
            r0 = -1
            if (r13 == r0) goto L_0x0103
        L_0x0101:
            r19 = 0
        L_0x0103:
            float r0 = r2.weight
            int r0 = (r0 > r22 ? 1 : (r0 == r22 ? 0 : -1))
            if (r0 <= 0) goto L_0x0115
            if (r16 != 0) goto L_0x010c
            r15 = r14
        L_0x010c:
            int r6 = java.lang.Math.max(r6, r15)
        L_0x0110:
            r0 = 0
            int r0 = r0 + r3
            r3 = r0
            goto L_0x003c
        L_0x0115:
            if (r16 != 0) goto L_0x0118
            r15 = r14
        L_0x0118:
            int r5 = java.lang.Math.max(r5, r15)
            goto L_0x0110
        L_0x011d:
            r16 = 0
            goto L_0x00e3
        L_0x0120:
            int r0 = r1.A09
            if (r0 <= 0) goto L_0x0131
            boolean r0 = r1.A06(r4)
            if (r0 == 0) goto L_0x0131
            int r2 = r1.A09
            int r0 = r1.A03
            int r2 = r2 + r0
            r1.A09 = r2
        L_0x0131:
            if (r11 == 0) goto L_0x0163
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 == r0) goto L_0x0139
            if (r9 != 0) goto L_0x0163
        L_0x0139:
            r14 = 0
            r1.A09 = r14
        L_0x013c:
            if (r14 >= r4) goto L_0x0163
            android.view.View r2 = r1.getChildAt(r14)
            if (r2 != 0) goto L_0x014b
            int r0 = r1.A09
        L_0x0146:
            r1.A09 = r0
        L_0x0148:
            int r14 = r14 + 1
            goto L_0x013c
        L_0x014b:
            int r0 = r2.getVisibility()
            if (r0 == r13) goto L_0x0148
            android.widget.LinearLayout$LayoutParams r12 = X.AnonymousClass001.A0U(r2)
            int r3 = r1.A09
            int r2 = r3 + r10
            int r0 = r12.topMargin
            int r2 = r2 + r0
            int r0 = r12.bottomMargin
            int r0 = X.AnonymousClass001.A0B(r2, r0, r3)
            goto L_0x0146
        L_0x0163:
            int r2 = r1.A09
            int r0 = X.AnonymousClass000.A03(r1)
            int r2 = r2 + r0
            r1.A09 = r2
            int r0 = r1.getSuggestedMinimumHeight()
            int r3 = java.lang.Math.max(r2, r0)
            r2 = 0
            r0 = r34
            int r3 = android.view.View.resolveSizeAndState(r3, r0, r2)
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r3
            int r0 = r1.A09
            int r2 = r2 - r0
            if (r20 != 0) goto L_0x018a
            if (r2 == 0) goto L_0x0228
            int r0 = (r21 > r22 ? 1 : (r21 == r22 ? 0 : -1))
            if (r0 <= 0) goto L_0x0228
        L_0x018a:
            float r6 = r1.A00
            int r0 = (r6 > r22 ? 1 : (r6 == r22 ? 0 : -1))
            if (r0 <= 0) goto L_0x0192
            r21 = r6
        L_0x0192:
            r0 = 0
            r1.A09 = r0
            r11 = 0
        L_0x0196:
            if (r11 >= r4) goto L_0x025b
            android.view.View r13 = r1.getChildAt(r11)
            int r6 = r13.getVisibility()
            r0 = 8
            if (r6 == r0) goto L_0x0218
            android.widget.LinearLayout$LayoutParams r12 = X.AnonymousClass001.A0U(r13)
            float r6 = r12.weight
            int r0 = (r6 > r22 ? 1 : (r6 == r22 ? 0 : -1))
            if (r0 <= 0) goto L_0x01df
            float r0 = (float) r2
            float r0 = r0 * r6
            float r0 = r0 / r21
            int r10 = (int) r0
            float r21 = r21 - r6
            int r2 = r2 - r10
            int r14 = X.AnonymousClass000.A02(r1)
            int r0 = r12.leftMargin
            int r14 = r14 + r0
            int r0 = r12.rightMargin
            int r14 = r14 + r0
            int r6 = r12.width
            r0 = r32
            int r14 = android.view.ViewGroup.getChildMeasureSpec(r0, r14, r6)
            int r0 = r12.height
            r6 = 1073741824(0x40000000, float:2.0)
            if (r0 != 0) goto L_0x021f
            if (r9 != r6) goto L_0x021f
            if (r10 <= 0) goto L_0x0226
        L_0x01d2:
            X.AnonymousClass001.A19(r13, r10, r6, r14)
            int r0 = r13.getMeasuredState()
            r0 = r0 & -256(0xffffffffffffff00, float:NaN)
            int r7 = android.view.View.combineMeasuredStates(r7, r0)
        L_0x01df:
            int r14 = r12.leftMargin
            int r0 = r12.rightMargin
            int r14 = r14 + r0
            int r10 = r13.getMeasuredWidth()
            int r10 = r10 + r14
            int r8 = java.lang.Math.max(r8, r10)
            r6 = 1073741824(0x40000000, float:2.0)
            r0 = r23
            if (r0 == r6) goto L_0x021c
            int r0 = r12.width
            r6 = -1
            if (r0 != r6) goto L_0x021d
        L_0x01f8:
            int r5 = java.lang.Math.max(r5, r14)
            if (r19 == 0) goto L_0x0204
            int r0 = r12.width
            r19 = 1
            if (r0 == r6) goto L_0x0206
        L_0x0204:
            r19 = 0
        L_0x0206:
            int r10 = r1.A09
            int r6 = r13.getMeasuredHeight()
            int r6 = r6 + r10
            int r0 = r12.topMargin
            int r6 = r6 + r0
            int r0 = r12.bottomMargin
            int r0 = X.AnonymousClass001.A0B(r6, r0, r10)
            r1.A09 = r0
        L_0x0218:
            int r11 = r11 + 1
            goto L_0x0196
        L_0x021c:
            r6 = -1
        L_0x021d:
            r14 = r10
            goto L_0x01f8
        L_0x021f:
            int r0 = r13.getMeasuredHeight()
            int r10 = r10 + r0
            if (r10 >= 0) goto L_0x01d2
        L_0x0226:
            r10 = 0
            goto L_0x01d2
        L_0x0228:
            int r5 = java.lang.Math.max(r5, r6)
            if (r11 == 0) goto L_0x0264
            r0 = 1073741824(0x40000000, float:2.0)
            if (r9 == r0) goto L_0x0264
            r9 = 0
        L_0x0233:
            if (r9 >= r4) goto L_0x0264
            android.view.View r6 = r1.getChildAt(r9)
            if (r6 == 0) goto L_0x0258
            int r0 = r6.getVisibility()
            if (r0 == r13) goto L_0x0258
            android.widget.LinearLayout$LayoutParams r0 = X.AnonymousClass001.A0U(r6)
            float r0 = r0.weight
            int r0 = (r0 > r22 ? 1 : (r0 == r22 ? 0 : -1))
            if (r0 <= 0) goto L_0x0258
            int r0 = r6.getMeasuredWidth()
            r2 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            X.AnonymousClass001.A19(r6, r10, r2, r0)
        L_0x0258:
            int r9 = r9 + 1
            goto L_0x0233
        L_0x025b:
            int r2 = r1.A09
            int r0 = X.AnonymousClass000.A03(r1)
            int r2 = r2 + r0
            r1.A09 = r2
        L_0x0264:
            if (r19 != 0) goto L_0x02bb
            r2 = 1073741824(0x40000000, float:2.0)
            r0 = r23
            if (r0 == r2) goto L_0x02bb
        L_0x026c:
            int r0 = X.AnonymousClass000.A02(r1)
            int r5 = r5 + r0
            int r0 = r1.getSuggestedMinimumWidth()
            int r2 = java.lang.Math.max(r5, r0)
            r0 = r32
            int r0 = android.view.View.resolveSizeAndState(r2, r0, r7)
            r1.setMeasuredDimension(r0, r3)
            if (r18 == 0) goto L_0x06b7
            int r2 = r1.getMeasuredWidth()
            r0 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r5 = 0
        L_0x028f:
            if (r5 >= r4) goto L_0x06b7
            android.view.View r7 = r1.getChildAt(r5)
            int r2 = r7.getVisibility()
            r0 = 8
            if (r2 == r0) goto L_0x02b8
            android.widget.LinearLayout$LayoutParams r3 = X.AnonymousClass001.A0U(r7)
            int r2 = r3.width
            r0 = -1
            if (r2 != r0) goto L_0x02b8
            int r2 = r3.height
            int r0 = r7.getMeasuredHeight()
            r3.height = r0
            r9 = 0
            r6 = r1
            r10 = r34
            r11 = r9
            r6.measureChildWithMargins(r7, r8, r9, r10, r11)
            r3.height = r2
        L_0x02b8:
            int r5 = r5 + 1
            goto L_0x028f
        L_0x02bb:
            r5 = r8
            goto L_0x026c
        L_0x02bd:
            r2 = 0
            r1.A09 = r2
            int r4 = r1.getChildCount()
            int r9 = android.view.View.MeasureSpec.getMode(r32)
            int r29 = android.view.View.MeasureSpec.getMode(r34)
            int[] r8 = r1.A0D
            r0 = 4
            if (r8 == 0) goto L_0x02d5
            int[] r7 = r1.A0E
            if (r7 != 0) goto L_0x02dd
        L_0x02d5:
            int[] r8 = new int[r0]
            r1.A0D = r8
            int[] r7 = new int[r0]
            r1.A0E = r7
        L_0x02dd:
            r28 = 3
            r0 = -1
            r8[r28] = r0
            r27 = 2
            r8[r27] = r0
            r8[r10] = r0
            r8[r2] = r0
            r7[r28] = r0
            r7[r27] = r0
            r7[r10] = r0
            r7[r2] = r0
            boolean r0 = r1.A0B
            r26 = r0
            boolean r0 = r1.A0C
            r25 = r0
            r14 = 1073741824(0x40000000, float:2.0)
            boolean r24 = X.AnonymousClass000.A1U(r9, r14)
            r23 = 0
            r22 = 0
            r12 = 0
            r6 = 0
            r5 = 0
            r21 = 0
            r20 = 0
            r3 = 0
            r19 = 1
            r18 = 0
        L_0x0310:
            r11 = 8
            if (r12 >= r4) goto L_0x0432
            android.view.View r16 = r1.getChildAt(r12)
            if (r16 != 0) goto L_0x0323
            int r0 = r1.A09
            r1.A09 = r0
        L_0x031e:
            int r12 = r12 + 1
            r14 = 1073741824(0x40000000, float:2.0)
            goto L_0x0310
        L_0x0323:
            int r0 = r16.getVisibility()
            if (r0 == r11) goto L_0x031e
            boolean r0 = r1.A06(r12)
            if (r0 == 0) goto L_0x0336
            int r11 = r1.A09
            int r0 = r1.A05
            int r11 = r11 + r0
            r1.A09 = r11
        L_0x0336:
            android.widget.LinearLayout$LayoutParams r11 = X.AnonymousClass001.A0U(r16)
            float r13 = r11.weight
            float r22 = r22 + r13
            if (r9 != r14) goto L_0x03e5
            int r0 = r11.width
            if (r0 != 0) goto L_0x03e5
            int r0 = (r13 > r23 ? 1 : (r13 == r23 ? 0 : -1))
            if (r0 <= 0) goto L_0x03e5
            int r14 = r1.A09
            int r13 = r11.leftMargin
            if (r24 == 0) goto L_0x03dc
            int r0 = r11.rightMargin
            int r13 = r13 + r0
            int r14 = r14 + r13
        L_0x0352:
            r1.A09 = r14
            if (r26 == 0) goto L_0x03d5
            r0 = 0
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r0 = r16
            r0.measure(r13, r13)
        L_0x0360:
            r13 = 1073741824(0x40000000, float:2.0)
        L_0x0362:
            r0 = r29
            if (r0 == r13) goto L_0x03d2
            int r13 = r11.height
            r0 = -1
            if (r13 != r0) goto L_0x03d2
            r17 = 1
            r18 = 1
        L_0x036f:
            int r13 = r11.topMargin
            int r0 = r11.bottomMargin
            int r13 = r13 + r0
            int r14 = r16.getMeasuredHeight()
            int r14 = r14 + r13
            r0 = r16
            int r3 = X.AnonymousClass000.A04(r0, r3)
            if (r26 == 0) goto L_0x03a7
            int r15 = r16.getBaseline()
            r0 = -1
            if (r15 == r0) goto L_0x03a7
            int r0 = r11.gravity
            if (r0 >= 0) goto L_0x038e
            int r0 = r1.A06
        L_0x038e:
            r16 = r0 & 112(0x70, float:1.57E-43)
            r0 = 4
            int r16 = r16 >> r0
            r0 = r16 & -2
            int r16 = r0 >> 1
            r0 = r8[r16]
            int r0 = java.lang.Math.max(r0, r15)
            r8[r16] = r0
            r0 = r7[r16]
            int r0 = X.AnonymousClass001.A0C(r14, r15, r0)
            r7[r16] = r0
        L_0x03a7:
            int r6 = java.lang.Math.max(r6, r14)
            if (r19 == 0) goto L_0x03b4
            int r15 = r11.height
            r0 = -1
            r19 = 1
            if (r15 == r0) goto L_0x03b6
        L_0x03b4:
            r19 = 0
        L_0x03b6:
            float r0 = r11.weight
            int r0 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r0 <= 0) goto L_0x03ca
            if (r17 != 0) goto L_0x03bf
            r13 = r14
        L_0x03bf:
            r0 = r21
            int r21 = java.lang.Math.max(r0, r13)
        L_0x03c5:
            r0 = 0
            int r0 = r0 + r12
            r12 = r0
            goto L_0x031e
        L_0x03ca:
            if (r17 != 0) goto L_0x03cd
            r13 = r14
        L_0x03cd:
            int r5 = java.lang.Math.max(r5, r13)
            goto L_0x03c5
        L_0x03d2:
            r17 = 0
            goto L_0x036f
        L_0x03d5:
            r26 = 0
            r13 = 1073741824(0x40000000, float:2.0)
            r20 = 1
            goto L_0x0362
        L_0x03dc:
            int r13 = r13 + r14
            int r0 = r11.rightMargin
            int r14 = X.AnonymousClass001.A0B(r13, r0, r14)
            goto L_0x0352
        L_0x03e5:
            int r0 = r11.width
            if (r0 != 0) goto L_0x042f
            int r0 = (r13 > r23 ? 1 : (r13 == r23 ? 0 : -1))
            if (r0 <= 0) goto L_0x042f
            r0 = -2
            r11.width = r0
            r14 = 0
        L_0x03f1:
            int r0 = (r22 > r23 ? 1 : (r22 == r23 ? 0 : -1))
            if (r0 != 0) goto L_0x042d
            int r13 = r1.A09
        L_0x03f7:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r35 = 0
            r30 = r1
            r31 = r16
            r33 = r13
            r30.measureChildWithMargins(r31, r32, r33, r34, r35)
            if (r14 == r0) goto L_0x0408
            r11.width = r14
        L_0x0408:
            int r15 = r16.getMeasuredWidth()
            int r14 = r1.A09
            if (r24 == 0) goto L_0x0421
            int r13 = r11.leftMargin
            int r13 = r13 + r15
            int r0 = r11.rightMargin
            int r13 = r13 + r0
            int r14 = r14 + r13
        L_0x0417:
            r1.A09 = r14
            if (r25 == 0) goto L_0x0360
            int r2 = java.lang.Math.max(r15, r2)
            goto L_0x0360
        L_0x0421:
            int r13 = r14 + r15
            int r0 = r11.leftMargin
            int r13 = r13 + r0
            int r0 = r11.rightMargin
            int r14 = X.AnonymousClass001.A0B(r13, r0, r14)
            goto L_0x0417
        L_0x042d:
            r13 = 0
            goto L_0x03f7
        L_0x042f:
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x03f1
        L_0x0432:
            int r0 = r1.A09
            if (r0 <= 0) goto L_0x0443
            boolean r0 = r1.A06(r4)
            if (r0 == 0) goto L_0x0443
            int r11 = r1.A09
            int r0 = r1.A05
            int r11 = r11 + r0
            r1.A09 = r11
        L_0x0443:
            r13 = r8[r10]
            r11 = -1
            if (r13 != r11) goto L_0x0455
            r0 = 0
            r0 = r8[r0]
            if (r0 != r11) goto L_0x0455
            r0 = r8[r27]
            if (r0 != r11) goto L_0x0455
            r0 = r8[r28]
            if (r0 == r11) goto L_0x0481
        L_0x0455:
            r12 = r8[r28]
            r0 = 0
            r11 = r8[r0]
            r0 = r8[r27]
            int r0 = java.lang.Math.max(r13, r0)
            int r0 = java.lang.Math.max(r11, r0)
            int r12 = java.lang.Math.max(r12, r0)
            r13 = r7[r28]
            r0 = 0
            r14 = r7[r0]
            r11 = r7[r10]
            r0 = r7[r27]
            int r0 = java.lang.Math.max(r11, r0)
            int r0 = java.lang.Math.max(r14, r0)
            int r0 = java.lang.Math.max(r13, r0)
            int r6 = X.AnonymousClass001.A0B(r12, r0, r6)
        L_0x0481:
            if (r25 == 0) goto L_0x04c1
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 == r0) goto L_0x0489
            if (r9 != 0) goto L_0x04c1
        L_0x0489:
            r13 = 0
            r1.A09 = r13
        L_0x048c:
            if (r13 >= r4) goto L_0x04c1
            android.view.View r12 = r1.getChildAt(r13)
            if (r12 != 0) goto L_0x049b
            int r0 = r1.A09
        L_0x0496:
            r1.A09 = r0
        L_0x0498:
            int r13 = r13 + 1
            goto L_0x048c
        L_0x049b:
            int r11 = r12.getVisibility()
            r0 = 8
            if (r11 == r0) goto L_0x0498
            android.widget.LinearLayout$LayoutParams r14 = X.AnonymousClass001.A0U(r12)
            int r12 = r1.A09
            if (r24 == 0) goto L_0x04b5
            int r11 = r14.leftMargin
            int r11 = r11 + r2
            int r0 = r14.rightMargin
            int r11 = r11 + r0
            int r12 = r12 + r11
            r1.A09 = r12
            goto L_0x0498
        L_0x04b5:
            int r11 = r12 + r2
            int r0 = r14.leftMargin
            int r11 = r11 + r0
            int r0 = r14.rightMargin
            int r0 = X.AnonymousClass001.A0B(r11, r0, r12)
            goto L_0x0496
        L_0x04c1:
            int r11 = r1.A09
            int r0 = X.AnonymousClass000.A02(r1)
            int r11 = r11 + r0
            r1.A09 = r11
            int r0 = r1.getSuggestedMinimumWidth()
            int r11 = java.lang.Math.max(r11, r0)
            r13 = 0
            r0 = r32
            int r17 = android.view.View.resolveSizeAndState(r11, r0, r13)
            r12 = 16777215(0xffffff, float:2.3509886E-38)
            r12 = r12 & r17
            int r0 = r1.A09
            int r12 = r12 - r0
            if (r20 != 0) goto L_0x04e9
            if (r12 == 0) goto L_0x05d8
            int r0 = (r22 > r23 ? 1 : (r22 == r23 ? 0 : -1))
            if (r0 <= 0) goto L_0x05d8
        L_0x04e9:
            float r2 = r1.A00
            int r0 = (r2 > r23 ? 1 : (r2 == r23 ? 0 : -1))
            if (r0 <= 0) goto L_0x04f1
            r22 = r2
        L_0x04f1:
            r0 = -1
            r8[r28] = r0
            r8[r27] = r0
            r8[r10] = r0
            r8[r13] = r0
            r7[r28] = r0
            r7[r27] = r0
            r7[r10] = r0
            r7[r13] = r0
            r1.A09 = r13
            r6 = -1
        L_0x0505:
            if (r13 >= r4) goto L_0x060f
            android.view.View r16 = r1.getChildAt(r13)
            if (r16 == 0) goto L_0x05bb
            int r2 = r16.getVisibility()
            r0 = 8
            if (r2 == r0) goto L_0x05bb
            android.widget.LinearLayout$LayoutParams r11 = X.AnonymousClass001.A0U(r16)
            float r2 = r11.weight
            int r0 = (r2 > r23 ? 1 : (r2 == r23 ? 0 : -1))
            if (r0 <= 0) goto L_0x0557
            float r0 = (float) r12
            float r0 = r0 * r2
            float r0 = r0 / r22
            int r14 = (int) r0
            float r22 = r22 - r2
            int r12 = r12 - r14
            int r2 = X.AnonymousClass000.A03(r1)
            int r0 = r11.topMargin
            int r2 = r2 + r0
            int r0 = r11.bottomMargin
            int r2 = r2 + r0
            int r0 = r11.height
            r15 = r34
            int r15 = android.view.ViewGroup.getChildMeasureSpec(r15, r2, r0)
            int r0 = r11.width
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != 0) goto L_0x05ce
            if (r9 != r2) goto L_0x05ce
            if (r14 <= 0) goto L_0x05d5
        L_0x0543:
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r2)
            r2 = r16
            r2.measure(r14, r15)
            int r2 = r16.getMeasuredState()
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r2 & r0
            int r3 = android.view.View.combineMeasuredStates(r3, r2)
        L_0x0557:
            int r14 = r1.A09
            int r2 = r16.getMeasuredWidth()
            if (r24 == 0) goto L_0x05c1
            int r0 = r11.leftMargin
            int r2 = r2 + r0
            int r0 = r11.rightMargin
            int r2 = r2 + r0
            int r14 = r14 + r2
            r1.A09 = r14
        L_0x0568:
            r2 = 1073741824(0x40000000, float:2.0)
            r0 = r29
            if (r0 == r2) goto L_0x0574
            int r2 = r11.height
            r0 = -1
            r15 = 1
            if (r2 == r0) goto L_0x0575
        L_0x0574:
            r15 = 0
        L_0x0575:
            int r2 = r11.topMargin
            int r0 = r11.bottomMargin
            int r2 = r2 + r0
            int r14 = r16.getMeasuredHeight()
            int r14 = r14 + r2
            int r6 = java.lang.Math.max(r6, r14)
            if (r15 != 0) goto L_0x0586
            r2 = r14
        L_0x0586:
            int r5 = java.lang.Math.max(r5, r2)
            if (r19 == 0) goto L_0x05bf
            int r2 = r11.height
            r0 = -1
            r19 = 1
            if (r2 == r0) goto L_0x0595
        L_0x0593:
            r19 = 0
        L_0x0595:
            if (r26 == 0) goto L_0x05bb
            int r2 = r16.getBaseline()
            if (r2 == r0) goto L_0x05bb
            int r0 = r11.gravity
            if (r0 >= 0) goto L_0x05a3
            int r0 = r1.A06
        L_0x05a3:
            r11 = r0 & 112(0x70, float:1.57E-43)
            r0 = 4
            int r11 = r11 >> r0
            r0 = r11 & -2
            int r11 = r0 >> 1
            r0 = r8[r11]
            int r0 = java.lang.Math.max(r0, r2)
            r8[r11] = r0
            r0 = r7[r11]
            int r0 = X.AnonymousClass001.A0C(r14, r2, r0)
            r7[r11] = r0
        L_0x05bb:
            int r13 = r13 + 1
            goto L_0x0505
        L_0x05bf:
            r0 = -1
            goto L_0x0593
        L_0x05c1:
            int r2 = r2 + r14
            int r0 = r11.leftMargin
            int r2 = r2 + r0
            int r0 = r11.rightMargin
            int r0 = X.AnonymousClass001.A0B(r2, r0, r14)
            r1.A09 = r0
            goto L_0x0568
        L_0x05ce:
            int r0 = r16.getMeasuredWidth()
            int r14 = r14 + r0
            if (r14 >= 0) goto L_0x0543
        L_0x05d5:
            r14 = 0
            goto L_0x0543
        L_0x05d8:
            r0 = r21
            int r5 = java.lang.Math.max(r5, r0)
            if (r25 == 0) goto L_0x0655
            r0 = 1073741824(0x40000000, float:2.0)
            if (r9 == r0) goto L_0x0655
            r10 = 0
        L_0x05e5:
            if (r10 >= r4) goto L_0x0655
            android.view.View r9 = r1.getChildAt(r10)
            if (r9 == 0) goto L_0x060c
            int r7 = r9.getVisibility()
            r0 = 8
            if (r7 == r0) goto L_0x060c
            android.widget.LinearLayout$LayoutParams r0 = X.AnonymousClass001.A0U(r9)
            float r0 = r0.weight
            int r0 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r0 <= 0) goto L_0x060c
            r8 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r8)
            int r0 = r9.getMeasuredHeight()
            X.AnonymousClass001.A19(r9, r0, r8, r7)
        L_0x060c:
            int r10 = r10 + 1
            goto L_0x05e5
        L_0x060f:
            int r2 = r1.A09
            int r0 = X.AnonymousClass000.A02(r1)
            int r2 = r2 + r0
            r1.A09 = r2
            r11 = r8[r10]
            r2 = -1
            if (r11 != r2) goto L_0x062a
            r0 = 0
            r0 = r8[r0]
            if (r0 != r2) goto L_0x062a
            r0 = r8[r27]
            if (r0 != r2) goto L_0x062a
            r0 = r8[r28]
            if (r0 == r2) goto L_0x0655
        L_0x062a:
            r9 = r8[r28]
            r12 = 0
            r2 = r8[r12]
            r0 = r8[r27]
            int r0 = java.lang.Math.max(r11, r0)
            int r0 = java.lang.Math.max(r2, r0)
            int r11 = java.lang.Math.max(r9, r0)
            r9 = r7[r28]
            r8 = r7[r12]
            r2 = r7[r10]
            r0 = r7[r27]
            int r0 = java.lang.Math.max(r2, r0)
            int r0 = java.lang.Math.max(r8, r0)
            int r0 = java.lang.Math.max(r9, r0)
            int r6 = X.AnonymousClass001.A0B(r11, r0, r6)
        L_0x0655:
            if (r19 != 0) goto L_0x06b5
            r2 = 1073741824(0x40000000, float:2.0)
            r0 = r29
            if (r0 == r2) goto L_0x06b5
        L_0x065d:
            int r0 = X.AnonymousClass000.A03(r1)
            int r5 = r5 + r0
            int r0 = r1.getSuggestedMinimumHeight()
            int r5 = java.lang.Math.max(r5, r0)
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r3
            r17 = r17 | r0
            int r2 = r3 << 16
            r0 = r34
            int r2 = android.view.View.resolveSizeAndState(r5, r0, r2)
            r0 = r17
            r1.setMeasuredDimension(r0, r2)
            if (r18 == 0) goto L_0x06b7
            int r2 = r1.getMeasuredHeight()
            r0 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r5 = 0
        L_0x0689:
            if (r5 >= r4) goto L_0x06b7
            android.view.View r7 = r1.getChildAt(r5)
            int r2 = r7.getVisibility()
            r0 = 8
            if (r2 == r0) goto L_0x06b2
            android.widget.LinearLayout$LayoutParams r3 = X.AnonymousClass001.A0U(r7)
            int r2 = r3.height
            r0 = -1
            if (r2 != r0) goto L_0x06b2
            int r2 = r3.width
            int r0 = r7.getMeasuredWidth()
            r3.width = r0
            r9 = 0
            r6 = r1
            r8 = r32
            r11 = r9
            r6.measureChildWithMargins(r7, r8, r9, r10, r11)
            r3.width = r2
        L_0x06b2:
            int r5 = r5 + 1
            goto L_0x0689
        L_0x06b5:
            r5 = r6
            goto L_0x065d
        L_0x06b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onMeasure(int, int):void");
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("base aligned child index out of range (0, ");
            A0o.append(getChildCount());
            throw AnonymousClass000.A0F(")", A0o);
        }
        this.A01 = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.A0A) {
            this.A0A = drawable;
            boolean z = false;
            if (drawable != null) {
                this.A05 = drawable.getIntrinsicWidth();
                this.A03 = drawable.getIntrinsicHeight();
            } else {
                this.A05 = 0;
                this.A03 = 0;
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setGravity(int i) {
        if (this.A06 != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.A06 = i;
            requestLayout();
        }
    }

    public void setOrientation(int i) {
        if (this.A07 != i) {
            this.A07 = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.A08) {
            requestLayout();
        }
        this.A08 = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.A06;
        if ((i3 & 112) != i2) {
            this.A06 = i2 | (i3 & -113);
            requestLayout();
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: A02 */
    public AnonymousClass03W generateLayoutParams(AttributeSet attributeSet) {
        return new AnonymousClass03W(getContext(), attributeSet);
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.A06;
        if ((8388615 & i3) != i2) {
            this.A06 = i2 | (-8388616 & i3);
            requestLayout();
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof AnonymousClass03W;
    }

    public void setBaselineAligned(boolean z) {
        this.A0B = z;
    }

    public void setDividerPadding(int i) {
        this.A04 = i;
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.A0C = z;
    }

    public LinearLayoutCompat(Context context) {
        this(context, (AttributeSet) null);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
