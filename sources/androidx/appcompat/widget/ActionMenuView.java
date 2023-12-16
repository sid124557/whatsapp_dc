package androidx.appcompat.widget;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass03V;
import X.AnonymousClass03W;
import X.AnonymousClass04N;
import X.AnonymousClass04R;
import X.AnonymousClass0YH;
import X.AnonymousClass0b0;
import X.AnonymousClass0b2;
import X.C07530bB;
import X.C07890cz;
import X.C07910d1;
import X.C14500pn;
import X.C15560rZ;
import X.C15570ra;
import X.C16460tR;
import X.C16470tS;
import X.C16490tU;
import X.C17050uU;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

public class ActionMenuView extends LinearLayoutCompat implements C15560rZ, C15570ra {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Context A04;
    public C16460tR A05;
    public C07890cz A06;
    public C16470tS A07;
    public C07530bB A08;
    public C14500pn A09;
    public boolean A0A;
    public boolean A0B;

    public boolean A08(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C16490tU)) {
            z = false | ((C16490tU) childAt).BLP();
        }
        if (i <= 0 || !(childAt2 instanceof C16490tU)) {
            return z;
        }
        return z | ((C16490tU) childAt2).BLQ();
    }

    public /* bridge */ /* synthetic */ AnonymousClass03W A01() {
        AnonymousClass03V r1 = new AnonymousClass03V();
        r1.gravity = 16;
        return r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r1.gravity <= 0) goto L_0x0011;
     */
    /* renamed from: A07 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass03V generateLayoutParams(android.view.ViewGroup.LayoutParams r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x001c
            boolean r0 = r3 instanceof X.AnonymousClass03V
            if (r0 == 0) goto L_0x0016
            X.03V r3 = (X.AnonymousClass03V) r3
            X.03V r1 = new X.03V
            r1.<init>((X.AnonymousClass03V) r3)
        L_0x000d:
            int r0 = r1.gravity
            if (r0 > 0) goto L_0x0015
        L_0x0011:
            r0 = 16
            r1.gravity = r0
        L_0x0015:
            return r1
        L_0x0016:
            X.03V r1 = new X.03V
            r1.<init>((android.view.ViewGroup.LayoutParams) r3)
            goto L_0x000d
        L_0x001c:
            X.03V r1 = new X.03V
            r1.<init>()
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.generateLayoutParams(android.view.ViewGroup$LayoutParams):X.03V");
    }

    public boolean BGr(C07910d1 r4) {
        return this.A06.A0L(r4, (C17050uU) null, 0);
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AnonymousClass03V r1 = new AnonymousClass03V();
        r1.gravity = 16;
        return r1;
    }

    public Menu getMenu() {
        C07890cz r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        Context context = getContext();
        C07890cz r1 = new C07890cz(context);
        this.A06 = r1;
        r1.A0D(new AnonymousClass0b0(this));
        C07530bB r2 = new C07530bB(context);
        this.A08 = r2;
        r2.A0K = true;
        r2.A0L = true;
        C16470tS r02 = this.A07;
        if (r02 == null) {
            r02 = new AnonymousClass0b2();
        }
        r2.A0B = r02;
        this.A06.A09(this.A04, r2);
        C07530bB r03 = this.A08;
        r03.A0C = this;
        C07890cz r04 = r03.A0A;
        this.A06 = r04;
        return r04;
    }

    public int getPopupTheme() {
        return this.A03;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int A0I;
        int i6;
        if (!this.A0A) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int i8 = this.A05;
        int i9 = i3 - i;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean A082 = AnonymousClass0YH.A08(this);
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                AnonymousClass03V r11 = (AnonymousClass03V) childAt.getLayoutParams();
                if (r11.A04) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (A08(i12)) {
                        measuredWidth += i8;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (A082) {
                        i6 = getPaddingLeft() + r11.leftMargin;
                        A0I = i6 + measuredWidth;
                    } else {
                        A0I = AnonymousClass001.A0I(this) - r11.rightMargin;
                        i6 = A0I - measuredWidth;
                    }
                    int i13 = i7 - (measuredHeight / 2);
                    childAt.layout(i6, i13, A0I, measuredHeight + i13);
                    paddingRight -= measuredWidth;
                    i10 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + r11.leftMargin) + r11.rightMargin;
                    A08(i12);
                    i11++;
                }
            }
        }
        if (childCount == 1 && i10 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i14 = (i9 / 2) - (measuredWidth2 / 2);
            int i15 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
            return;
        }
        int i16 = i11 - (i10 ^ 1);
        if (i16 > 0) {
            i5 = paddingRight / i16;
        } else {
            i5 = 0;
        }
        int max = Math.max(0, i5);
        if (A082) {
            int A0I2 = AnonymousClass001.A0I(this);
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt3 = getChildAt(i17);
                AnonymousClass03V r4 = (AnonymousClass03V) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !r4.A04) {
                    int i18 = A0I2 - r4.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    A0I2 = i18 - ((measuredWidth3 + r4.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt4 = getChildAt(i20);
            AnonymousClass03V r42 = (AnonymousClass03V) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !r42.A04) {
                int i21 = paddingLeft + r42.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft = i21 + measuredWidth4 + r42.rightMargin + max;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01d2, code lost:
        if (r10 != 1) goto L_0x01d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00aa, code lost:
        if ((!android.text.TextUtils.isEmpty(((X.AnonymousClass03n) r13).getText())) == false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e0, code lost:
        if ((!android.text.TextUtils.isEmpty(r0.getText())) == false) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0153, code lost:
        if (r10 != 2) goto L_0x0155;
     */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0141 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x013c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r32, int r33) {
        /*
            r31 = this;
            r5 = r31
            boolean r1 = r5.A0A
            r3 = r32
            int r0 = android.view.View.MeasureSpec.getMode(r3)
            r7 = 1
            r9 = 0
            r4 = 1073741824(0x40000000, float:2.0)
            boolean r0 = X.AnonymousClass000.A1U(r0, r4)
            r5.A0A = r0
            if (r1 == r0) goto L_0x0018
            r5.A00 = r9
        L_0x0018:
            int r2 = android.view.View.MeasureSpec.getSize(r3)
            boolean r0 = r5.A0A
            if (r0 == 0) goto L_0x002d
            X.0cz r1 = r5.A06
            if (r1 == 0) goto L_0x002d
            int r0 = r5.A00
            if (r2 == r0) goto L_0x002d
            r5.A00 = r2
            r1.A0F(r7)
        L_0x002d:
            int r2 = r5.getChildCount()
            boolean r0 = r5.A0A
            r6 = r33
            if (r0 == 0) goto L_0x02ab
            if (r2 <= 0) goto L_0x02bd
            int r30 = android.view.View.MeasureSpec.getMode(r6)
            int r3 = android.view.View.MeasureSpec.getSize(r3)
            int r29 = android.view.View.MeasureSpec.getSize(r6)
            int r2 = X.AnonymousClass000.A02(r5)
            int r22 = X.AnonymousClass000.A03(r5)
            r1 = -2
            r0 = r22
            int r28 = android.view.ViewGroup.getChildMeasureSpec(r6, r0, r1)
            int r3 = r3 - r2
            int r6 = r5.A02
            int r8 = r3 / r6
            int r0 = r3 % r6
            r27 = 0
            if (r8 == 0) goto L_0x02a5
            int r0 = r0 / r8
            int r6 = r6 + r0
            int r2 = r5.getChildCount()
            r11 = 0
            r26 = 0
            r10 = 0
            r25 = 0
            r19 = 0
            r20 = 0
        L_0x006f:
            if (r11 >= r2) goto L_0x014e
            android.view.View r13 = r5.getChildAt(r11)
            int r1 = r13.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x0141
            boolean r1 = r13 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            int r10 = r10 + 1
            if (r1 == 0) goto L_0x0088
            int r0 = r5.A01
            r13.setPadding(r0, r9, r0, r9)
        L_0x0088:
            android.view.ViewGroup$LayoutParams r12 = r13.getLayoutParams()
            X.03V r12 = (X.AnonymousClass03V) r12
            r12.A03 = r9
            r12.A01 = r9
            r12.A00 = r9
            r12.A02 = r9
            r12.leftMargin = r9
            r12.rightMargin = r9
            if (r1 == 0) goto L_0x00ac
            r0 = r13
            X.03n r0 = (X.AnonymousClass03n) r0
            java.lang.CharSequence r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = r0 ^ 1
            r0 = 1
            if (r1 != 0) goto L_0x00ad
        L_0x00ac:
            r0 = 0
        L_0x00ad:
            r12.A05 = r0
            boolean r0 = r12.A04
            r15 = r8
            if (r0 == 0) goto L_0x00b5
            r15 = 1
        L_0x00b5:
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            X.03V r14 = (X.AnonymousClass03V) r14
            int r1 = android.view.View.MeasureSpec.getSize(r28)
            int r1 = r1 - r22
            int r0 = android.view.View.MeasureSpec.getMode(r28)
            int r18 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            boolean r0 = r13 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            if (r0 == 0) goto L_0x014c
            r0 = r13
            X.03n r0 = (X.AnonymousClass03n) r0
        L_0x00d0:
            r17 = 1
            if (r0 == 0) goto L_0x00e2
            java.lang.CharSequence r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            r16 = 1
            if (r0 != 0) goto L_0x00e4
        L_0x00e2:
            r16 = 0
        L_0x00e4:
            if (r15 <= 0) goto L_0x014a
            r1 = 2
            if (r16 == 0) goto L_0x00eb
            if (r15 < r1) goto L_0x014a
        L_0x00eb:
            int r15 = r15 * r6
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r0)
            r0 = r18
            r13.measure(r15, r0)
            int r15 = r13.getMeasuredWidth()
            int r0 = r15 / r6
            int r15 = r15 % r6
            if (r15 == 0) goto L_0x0102
            int r0 = r0 + 1
        L_0x0102:
            if (r16 == 0) goto L_0x0148
            if (r0 >= r1) goto L_0x0148
        L_0x0106:
            boolean r0 = r14.A04
            if (r0 != 0) goto L_0x0145
            if (r16 == 0) goto L_0x0145
        L_0x010c:
            r0 = r17
            r14.A02 = r0
            r14.A00 = r1
            int r0 = r6 * r1
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            r0 = r18
            r13.measure(r14, r0)
            r0 = r25
            int r25 = java.lang.Math.max(r0, r1)
            boolean r0 = r12.A02
            if (r0 == 0) goto L_0x0129
            int r19 = r19 + 1
        L_0x0129:
            boolean r0 = r12.A04
            if (r0 == 0) goto L_0x012f
            r26 = 1
        L_0x012f:
            int r8 = r8 - r1
            int r12 = r13.getMeasuredHeight()
            r0 = r27
            int r27 = java.lang.Math.max(r0, r12)
            if (r1 != r7) goto L_0x0141
            int r0 = r7 << r11
            long r0 = (long) r0
            long r20 = r20 | r0
        L_0x0141:
            int r11 = r11 + 1
            goto L_0x006f
        L_0x0145:
            r17 = 0
            goto L_0x010c
        L_0x0148:
            r1 = r0
            goto L_0x0106
        L_0x014a:
            r1 = 0
            goto L_0x0106
        L_0x014c:
            r0 = 0
            goto L_0x00d0
        L_0x014e:
            r0 = 2
            if (r26 == 0) goto L_0x0155
            r24 = 1
            if (r10 == r0) goto L_0x0157
        L_0x0155:
            r24 = 0
        L_0x0157:
            r16 = 0
            if (r19 <= 0) goto L_0x01cf
        L_0x015b:
            if (r8 <= 0) goto L_0x01cf
            r12 = 0
            r11 = 0
            r1 = 2147483647(0x7fffffff, float:NaN)
            r22 = 0
        L_0x0164:
            if (r11 >= r2) goto L_0x0189
            android.view.View r0 = r5.getChildAt(r11)
            android.view.ViewGroup$LayoutParams r13 = r0.getLayoutParams()
            X.03V r13 = (X.AnonymousClass03V) r13
            boolean r0 = r13.A02
            if (r0 == 0) goto L_0x017e
            int r0 = r13.A00
            r13 = 1
            if (r0 >= r1) goto L_0x0181
            long r22 = r13 << r11
            r1 = r0
            r12 = 1
        L_0x017e:
            int r11 = r11 + 1
            goto L_0x0164
        L_0x0181:
            if (r0 != r1) goto L_0x017e
            long r13 = r13 << r11
            long r22 = r22 | r13
            int r12 = r12 + 1
            goto L_0x017e
        L_0x0189:
            long r20 = r20 | r22
            if (r12 > r8) goto L_0x01cf
            int r13 = r1 + 1
            r12 = 0
        L_0x0190:
            if (r12 >= r2) goto L_0x01cc
            android.view.View r14 = r5.getChildAt(r12)
            android.view.ViewGroup$LayoutParams r11 = r14.getLayoutParams()
            X.03V r11 = (X.AnonymousClass03V) r11
            int r0 = r7 << r12
            long r0 = (long) r0
            long r18 = r22 & r0
            r16 = 0
            int r15 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r15 != 0) goto L_0x01b0
            int r11 = r11.A00
            if (r11 != r13) goto L_0x01ad
            long r20 = r20 | r0
        L_0x01ad:
            int r12 = r12 + 1
            goto L_0x0190
        L_0x01b0:
            if (r24 == 0) goto L_0x01c1
            boolean r0 = r11.A05
            if (r0 == 0) goto L_0x01c1
            if (r8 != r7) goto L_0x01c1
            int r1 = r5.A01
            int r0 = r1 + r6
            r24 = 1
            r14.setPadding(r0, r9, r1, r9)
        L_0x01c1:
            int r0 = r11.A00
            int r0 = r0 + 1
            r11.A00 = r0
            r11.A03 = r7
            int r8 = r8 + -1
            goto L_0x01ad
        L_0x01cc:
            r16 = 1
            goto L_0x015b
        L_0x01cf:
            if (r26 != 0) goto L_0x01d4
            r1 = 1
            if (r10 == r7) goto L_0x01d5
        L_0x01d4:
            r1 = 0
        L_0x01d5:
            if (r8 <= 0) goto L_0x027a
            r13 = 0
            int r0 = (r20 > r13 ? 1 : (r20 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x027a
            int r10 = r10 - r7
            if (r8 < r10) goto L_0x01e6
            if (r1 != 0) goto L_0x01e6
            r0 = r25
            if (r0 <= r7) goto L_0x027a
        L_0x01e6:
            int r0 = java.lang.Long.bitCount(r20)
            float r10 = (float) r0
            if (r1 != 0) goto L_0x0222
            r0 = 1
            long r11 = r20 & r0
            r15 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x0206
            android.view.View r0 = r5.getChildAt(r9)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            X.03V r0 = (X.AnonymousClass03V) r0
            boolean r0 = r0.A05
            if (r0 != 0) goto L_0x0206
            float r10 = r10 - r15
        L_0x0206:
            int r9 = r2 + -1
            int r0 = r7 << r9
            long r0 = (long) r0
            long r13 = r20 & r0
            r11 = 0
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x0222
            android.view.View r0 = r5.getChildAt(r9)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            X.03V r0 = (X.AnonymousClass03V) r0
            boolean r0 = r0.A05
            if (r0 != 0) goto L_0x0222
            float r10 = r10 - r15
        L_0x0222:
            r0 = 0
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0278
            int r8 = r8 * r6
            float r0 = (float) r8
            float r0 = r0 / r10
            int r9 = (int) r0
        L_0x022b:
            r8 = 0
        L_0x022c:
            if (r8 >= r2) goto L_0x027a
            int r0 = r7 << r8
            long r0 = (long) r0
            long r12 = r20 & r0
            r10 = 0
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x0258
            android.view.View r0 = r5.getChildAt(r8)
            android.view.ViewGroup$LayoutParams r10 = r0.getLayoutParams()
            X.03V r10 = (X.AnonymousClass03V) r10
            boolean r0 = r0 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            if (r0 == 0) goto L_0x025b
            r10.A01 = r9
            r10.A03 = r7
            if (r8 != 0) goto L_0x0256
            boolean r0 = r10.A05
            if (r0 != 0) goto L_0x0256
            int r1 = -r9
            r0 = 2
            int r1 = r1 / r0
            r10.leftMargin = r1
        L_0x0256:
            r16 = 1
        L_0x0258:
            int r8 = r8 + 1
            goto L_0x022c
        L_0x025b:
            r1 = 2
            boolean r0 = r10.A04
            if (r0 == 0) goto L_0x0269
            r10.A01 = r9
            r10.A03 = r7
            int r0 = -r9
            int r0 = r0 / r1
            r10.rightMargin = r0
            goto L_0x0256
        L_0x0269:
            if (r8 == 0) goto L_0x026f
            int r0 = r9 / 2
            r10.leftMargin = r0
        L_0x026f:
            int r0 = r2 + -1
            if (r8 == r0) goto L_0x0258
            int r0 = r9 / 2
            r10.rightMargin = r0
            goto L_0x0258
        L_0x0278:
            r9 = 0
            goto L_0x022b
        L_0x027a:
            if (r16 == 0) goto L_0x029f
            r9 = 0
        L_0x027d:
            if (r9 >= r2) goto L_0x029f
            android.view.View r8 = r5.getChildAt(r9)
            android.view.ViewGroup$LayoutParams r7 = r8.getLayoutParams()
            X.03V r7 = (X.AnonymousClass03V) r7
            boolean r0 = r7.A03
            if (r0 == 0) goto L_0x029c
            int r1 = r7.A00
            int r1 = r1 * r6
            int r0 = r7.A01
            int r1 = r1 + r0
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r4)
            r0 = r28
            r8.measure(r1, r0)
        L_0x029c:
            int r9 = r9 + 1
            goto L_0x027d
        L_0x029f:
            r0 = r30
            if (r0 != r4) goto L_0x02a5
            r27 = r29
        L_0x02a5:
            r0 = r27
            r5.setMeasuredDimension(r3, r0)
            return
        L_0x02ab:
            r1 = 0
        L_0x02ac:
            if (r1 >= r2) goto L_0x02bd
            android.view.View r0 = r5.getChildAt(r1)
            android.widget.LinearLayout$LayoutParams r0 = X.AnonymousClass001.A0U(r0)
            r0.rightMargin = r9
            r0.leftMargin = r9
            int r1 = r1 + 1
            goto L_0x02ac
        L_0x02bd:
            super.onMeasure(r3, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.onMeasure(int, int):void");
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.A08.A0I = z;
    }

    public void setMenuCallbacks(C16470tS r1, C16460tR r2) {
        this.A07 = r1;
        this.A05 = r2;
    }

    public void setPopupTheme(int i) {
        Context contextThemeWrapper;
        if (this.A03 != i) {
            this.A03 = i;
            if (i == 0) {
                contextThemeWrapper = getContext();
            } else {
                contextThemeWrapper = new ContextThemeWrapper(getContext(), i);
            }
            this.A04 = contextThemeWrapper;
        }
    }

    public void setPresenter(C07530bB r2) {
        this.A08 = r2;
        r2.A0C = this;
        this.A06 = r2.A0A;
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0B = false;
        float f = AnonymousClass000.A0B(context).density;
        this.A02 = (int) (56.0f * f);
        this.A01 = (int) (f * 4.0f);
        this.A04 = context;
        this.A03 = 0;
    }

    public /* bridge */ /* synthetic */ AnonymousClass03W A02(AttributeSet attributeSet) {
        return new AnonymousClass03V(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new AnonymousClass03V(getContext(), attributeSet);
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C07530bB r1 = this.A08;
        AnonymousClass04R r0 = r1.A0G;
        if (r0 != null) {
            return r0.getDrawable();
        }
        if (r1.A0J) {
            return r1.A07;
        }
        return null;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C07530bB r1 = this.A08;
        if (r1 != null) {
            r1.Brl(false);
            if (this.A08.A02()) {
                this.A08.A01();
                this.A08.A03();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C07530bB r0 = this.A08;
        if (r0 != null) {
            r0.A01();
            AnonymousClass04N r02 = r0.A0D;
            if (r02 != null) {
                r02.A01();
            }
        }
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C07530bB r1 = this.A08;
        AnonymousClass04R r0 = r1.A0G;
        if (r0 != null) {
            r0.setImageDrawable(drawable);
            return;
        }
        r1.A0J = true;
        r1.A07 = drawable;
    }

    public void BGA(C07890cz r1) {
        this.A06 = r1;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof AnonymousClass03V;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public void setOnMenuItemClickListener(C14500pn r1) {
        this.A09 = r1;
    }

    public void setOverflowReserved(boolean z) {
        this.A0B = z;
    }

    public ActionMenuView(Context context) {
        this(context, (AttributeSet) null);
    }
}
