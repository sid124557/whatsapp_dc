package androidx.recyclerview.widget;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass098;
import X.AnonymousClass09X;
import X.AnonymousClass0JZ;
import X.AnonymousClass0KP;
import X.AnonymousClass0OM;
import X.AnonymousClass0Q1;
import X.AnonymousClass0QI;
import X.AnonymousClass0YH;
import X.AnonymousClass0YY;
import X.C002102g;
import X.C04460Oj;
import X.C04870Qz;
import X.C05650Ui;
import X.C06440Xs;
import X.C16020sL;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;

public class GridLayoutManager extends LinearLayoutManager {
    public int A00 = -1;
    public AnonymousClass0OM A01 = new AnonymousClass098();
    public boolean A02 = false;
    public int[] A03;
    public View[] A04;
    public final Rect A05 = AnonymousClass001.A0N();
    public final SparseIntArray A06 = new SparseIntArray();
    public final SparseIntArray A07 = new SparseIntArray();

    public int A0E(C04870Qz r3, AnonymousClass0Q1 r4) {
        if (this.A01 == 1) {
            return this.A00;
        }
        int A002 = r4.A00();
        if (A002 < 1) {
            return 0;
        }
        return A1j(r3, r4, A002 - 1) + 1;
    }

    public int A0F(C04870Qz r3, AnonymousClass0Q1 r4) {
        if (this.A01 == 0) {
            return this.A00;
        }
        int A002 = r4.A00();
        if (A002 < 1) {
            return 0;
        }
        return A1j(r3, r4, A002 - 1) + 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005d, code lost:
        if (X.AnonymousClass0YH.A08(r8.A07) == false) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A0R(android.view.View r25, X.C04870Qz r26, X.AnonymousClass0Q1 r27, int r28) {
        /*
            r24 = this;
            r8 = r24
            androidx.recyclerview.widget.RecyclerView r0 = r8.A07
            r21 = 0
            r3 = r25
            if (r0 == 0) goto L_0x001a
            android.view.View r7 = r0.A0E(r3)
            if (r7 == 0) goto L_0x001a
            X.0R0 r0 = r8.A05
            java.util.List r0 = r0.A02
            boolean r0 = r0.contains(r7)
            if (r0 == 0) goto L_0x001c
        L_0x001a:
            r7 = r21
        L_0x001c:
            r20 = 0
            if (r7 == 0) goto L_0x008b
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            X.09X r0 = (X.AnonymousClass09X) r0
            int r6 = r0.A00
            int r5 = r0.A01
            int r5 = r5 + r6
            r23 = r26
            r22 = r27
            r2 = r28
            r1 = r23
            r0 = r22
            android.view.View r0 = super.A0R(r3, r1, r0, r2)
            if (r0 == 0) goto L_0x008b
            int r0 = r8.A1K(r2)
            r2 = 1
            boolean r1 = X.AnonymousClass000.A1U(r0, r2)
            boolean r0 = r8.A0A
            int r10 = r8.A08()
            if (r1 == r0) goto L_0x0111
            int r10 = r10 - r2
            r19 = -1
            r18 = -1
        L_0x0051:
            int r0 = r8.A01
            if (r0 != r2) goto L_0x005f
            androidx.recyclerview.widget.RecyclerView r0 = r8.A07
            boolean r0 = X.AnonymousClass0YH.A08(r0)
            r17 = 1
            if (r0 != 0) goto L_0x0061
        L_0x005f:
            r17 = 0
        L_0x0061:
            r1 = r23
            r0 = r22
            int r16 = r8.A1j(r1, r0, r10)
            r3 = 0
            r4 = -1
            r12 = -1
            r2 = 0
        L_0x006d:
            r0 = r19
            if (r10 == r0) goto L_0x010e
            r1 = r23
            r0 = r22
            int r1 = r8.A1j(r1, r0, r10)
            android.view.View r14 = r8.A0Q(r10)
            if (r14 == r7) goto L_0x010e
            boolean r0 = r14.hasFocusable()
            if (r0 == 0) goto L_0x008c
            r0 = r16
            if (r1 == r0) goto L_0x008c
            if (r20 == 0) goto L_0x00c5
        L_0x008b:
            return r20
        L_0x008c:
            android.view.ViewGroup$LayoutParams r13 = r14.getLayoutParams()
            X.09X r13 = (X.AnonymousClass09X) r13
            int r11 = r13.A00
            int r9 = r13.A01
            int r9 = r9 + r11
            boolean r0 = r14.hasFocusable()
            if (r0 == 0) goto L_0x00a2
            if (r11 != r6) goto L_0x00a2
            if (r9 != r5) goto L_0x00a2
            return r14
        L_0x00a2:
            boolean r0 = r14.hasFocusable()
            if (r0 == 0) goto L_0x00aa
            if (r20 == 0) goto L_0x00b2
        L_0x00aa:
            boolean r0 = r14.hasFocusable()
            if (r0 != 0) goto L_0x00d6
            if (r21 != 0) goto L_0x00d6
        L_0x00b2:
            boolean r0 = r14.hasFocusable()
            if (r0 == 0) goto L_0x00c8
            int r4 = r13.A00
            int r3 = java.lang.Math.min(r9, r5)
            int r0 = java.lang.Math.max(r11, r6)
            int r3 = r3 - r0
            r20 = r14
        L_0x00c5:
            int r10 = r10 + r18
            goto L_0x006d
        L_0x00c8:
            int r12 = r13.A00
            int r2 = java.lang.Math.min(r9, r5)
            int r0 = java.lang.Math.max(r11, r6)
            int r2 = r2 - r0
            r21 = r14
            goto L_0x00c5
        L_0x00d6:
            int r0 = java.lang.Math.max(r11, r6)
            int r15 = java.lang.Math.min(r9, r5)
            int r15 = r15 - r0
            boolean r0 = r14.hasFocusable()
            if (r0 == 0) goto L_0x00f2
            if (r15 > r3) goto L_0x00b2
            if (r15 != r3) goto L_0x00c5
            r1 = 0
            if (r11 <= r4) goto L_0x00ed
            r1 = 1
        L_0x00ed:
            r0 = r17
            if (r0 != r1) goto L_0x00c5
            goto L_0x00b2
        L_0x00f2:
            if (r20 != 0) goto L_0x00c5
            r1 = 1
            X.0OO r0 = r8.A08
            boolean r0 = r0.A01(r14)
            if (r0 == 0) goto L_0x0106
            X.0OO r0 = r8.A09
            boolean r0 = r0.A01(r14)
            if (r0 == 0) goto L_0x0106
            goto L_0x00c5
        L_0x0106:
            if (r15 > r2) goto L_0x00b2
            if (r15 != r2) goto L_0x00c5
            if (r11 > r12) goto L_0x00ed
            r1 = 0
            goto L_0x00ed
        L_0x010e:
            if (r20 != 0) goto L_0x008b
            return r21
        L_0x0111:
            r19 = r10
            r10 = 0
            r18 = 1
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.A0R(android.view.View, X.0Qz, X.0Q1, int):android.view.View");
    }

    public C002102g A0S() {
        AnonymousClass09X r0;
        if (this.A01 == 0) {
            return r0;
        }
        r0 = new AnonymousClass09X(-1, -2);
        return r0;
    }

    public C002102g A0T(Context context, AttributeSet attributeSet) {
        return new AnonymousClass09X(context, attributeSet);
    }

    public C002102g A0U(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new AnonymousClass09X((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new AnonymousClass09X(layoutParams);
    }

    public void A0c(Rect rect, int i, int i2) {
        int A012;
        int A013;
        if (this.A03 == null) {
            super.A0c(rect, i, i2);
        }
        int A0B = A0B() + A0C();
        int A0D = A0D() + A0A();
        if (this.A01 == 1) {
            A013 = C06440Xs.A01(i2, rect.height() + A0D, AnonymousClass0YY.A01(this.A07));
            int[] iArr = this.A03;
            A012 = C06440Xs.A01(i, iArr[iArr.length - 1] + A0B, AnonymousClass0YY.A02(this.A07));
        } else {
            A012 = C06440Xs.A01(i, rect.width() + A0B, AnonymousClass0YY.A02(this.A07));
            int[] iArr2 = this.A03;
            A013 = C06440Xs.A01(i2, iArr2[iArr2.length - 1] + A0D, AnonymousClass0YY.A01(this.A07));
        }
        this.A07.setMeasuredDimension(A012, A013);
    }

    public void A0v(C04870Qz r7, AnonymousClass0Q1 r8) {
        if (r8.A08) {
            int A08 = A08();
            for (int i = 0; i < A08; i++) {
                AnonymousClass09X r3 = (AnonymousClass09X) A0Q(i).getLayoutParams();
                int A0J = AnonymousClass001.A0J(r3.A00);
                this.A07.put(A0J, r3.A01);
                this.A06.put(A0J, r3.A00);
            }
        }
        super.A0v(r7, r8);
        this.A07.clear();
        this.A06.clear();
    }

    public boolean A1B() {
        if (this.A05 != null || this.A02) {
            return false;
        }
        return true;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a8  */
    public void A1c(X.AnonymousClass0M6 r19, X.C04460Oj r20, X.C04870Qz r21, X.AnonymousClass0Q1 r22) {
        /*
            r18 = this;
            r6 = r18
            X.0Uc r0 = r6.A06
            X.0vq r0 = (X.C17600vq) r0
            int r1 = r0.A00
            X.0Xs r0 = r0.A02
            if (r1 == 0) goto L_0x006f
            int r10 = r0.A04
        L_0x000e:
            r5 = 1
            r2 = 0
            r0 = 1073741824(0x40000000, float:2.0)
            boolean r17 = X.AnonymousClass001.A1X(r10, r0)
            int r0 = r6.A08()
            if (r0 <= 0) goto L_0x006d
            int[] r1 = r6.A03
            int r0 = r6.A00
            r9 = r1[r0]
        L_0x0022:
            if (r17 == 0) goto L_0x0027
            r6.A1n()
        L_0x0027:
            r3 = r20
            int r0 = r3.A03
            boolean r16 = X.AnonymousClass000.A1U(r0, r5)
            int r14 = r6.A00
            r12 = r21
            r11 = r22
            if (r16 != 0) goto L_0x0044
            int r0 = r3.A01
            int r14 = r6.A1k(r12, r11, r0)
            int r0 = r3.A01
            int r0 = r6.A1l(r12, r11, r0)
            int r14 = r14 + r0
        L_0x0044:
            r4 = 0
        L_0x0045:
            int r0 = r6.A00
            if (r4 >= r0) goto L_0x0095
            int r13 = r3.A01
            if (r13 < 0) goto L_0x0095
            int r0 = r11.A00()
            if (r13 >= r0) goto L_0x0095
            if (r14 <= 0) goto L_0x0095
            int r8 = r6.A1l(r12, r11, r13)
            int r7 = r6.A00
            if (r8 > r7) goto L_0x0072
            int r14 = r14 - r8
            if (r14 < 0) goto L_0x0095
            android.view.View r1 = r3.A00(r12)
            if (r1 == 0) goto L_0x0095
            android.view.View[] r0 = r6.A04
            r0[r4] = r1
            int r4 = r4 + 1
            goto L_0x0045
        L_0x006d:
            r9 = 0
            goto L_0x0022
        L_0x006f:
            int r10 = r0.A01
            goto L_0x000e
        L_0x0072:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Item at position "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = " requires "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " spans but GridLayoutManager has only "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " spans."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0F(r0, r1)
            throw r0
        L_0x0095:
            r8 = r19
            if (r4 != 0) goto L_0x009c
            r8.A01 = r5
            return
        L_0x009c:
            r14 = r4
            r13 = 0
            r7 = 0
            r15 = 1
            if (r16 != 0) goto L_0x00f7
            int r7 = r4 + -1
            r14 = -1
            r15 = -1
        L_0x00a6:
            if (r7 != r14) goto L_0x00f7
            r1 = 0
            r11 = 0
            r7 = 0
        L_0x00ab:
            if (r11 >= r4) goto L_0x0110
            android.view.View[] r0 = r6.A04
            r12 = r0[r11]
            java.util.List r0 = r3.A09
            if (r0 != 0) goto L_0x00ec
            if (r16 == 0) goto L_0x00e8
            r0 = -1
            r6.A0i(r12, r0, r2)
        L_0x00bb:
            android.graphics.Rect r0 = r6.A05
            r6.A0j(r12, r0)
            r6.A1q(r12, r10, r2)
            X.0Uc r0 = r6.A06
            int r0 = r0.A07(r12)
            if (r0 <= r7) goto L_0x00cc
            r7 = r0
        L_0x00cc:
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            X.09X r13 = (X.AnonymousClass09X) r13
            X.0Uc r0 = r6.A06
            int r0 = r0.A08(r12)
            float r12 = (float) r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r12 = r12 * r0
            int r0 = r13.A01
            float r0 = (float) r0
            float r12 = r12 / r0
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e5
            r1 = r12
        L_0x00e5:
            int r11 = r11 + 1
            goto L_0x00ab
        L_0x00e8:
            r6.A0i(r12, r2, r2)
            goto L_0x00bb
        L_0x00ec:
            if (r16 == 0) goto L_0x00f3
            r0 = -1
            r6.A0i(r12, r0, r5)
            goto L_0x00bb
        L_0x00f3:
            r6.A0i(r12, r2, r5)
            goto L_0x00bb
        L_0x00f7:
            android.view.View[] r0 = r6.A04
            r0 = r0[r7]
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            X.09X r1 = (X.AnonymousClass09X) r1
            int r0 = X.C06440Xs.A03(r0)
            int r0 = r6.A1l(r12, r11, r0)
            r1.A01 = r0
            r1.A00 = r13
            int r13 = r13 + r0
            int r7 = r7 + r15
            goto L_0x00a6
        L_0x0110:
            if (r17 == 0) goto L_0x0139
            int r0 = r6.A00
            float r0 = (float) r0
            int r0 = X.AnonymousClass001.A07(r1, r0)
            int r0 = java.lang.Math.max(r0, r9)
            r6.A1p(r0)
            r9 = 0
            r7 = 0
        L_0x0122:
            if (r9 >= r4) goto L_0x0139
            android.view.View[] r0 = r6.A04
            r1 = r0[r9]
            r0 = 1073741824(0x40000000, float:2.0)
            r6.A1q(r1, r0, r5)
            X.0Uc r0 = r6.A06
            int r0 = r0.A07(r1)
            if (r0 <= r7) goto L_0x0136
            r7 = r0
        L_0x0136:
            int r9 = r9 + 1
            goto L_0x0122
        L_0x0139:
            r9 = 0
        L_0x013a:
            if (r9 >= r4) goto L_0x01d1
            android.view.View[] r0 = r6.A04
            r16 = r0[r9]
            X.0Uc r1 = r6.A06
            r0 = r16
            int r0 = r1.A07(r0)
            if (r0 == r7) goto L_0x01b6
            android.view.ViewGroup$LayoutParams r13 = r16.getLayoutParams()
            X.09X r13 = (X.AnonymousClass09X) r13
            android.graphics.Rect r1 = r13.A03
            int r12 = r1.top
            int r0 = r1.bottom
            int r12 = r12 + r0
            int r0 = r13.topMargin
            int r12 = r12 + r0
            int r0 = r13.bottomMargin
            int r12 = r12 + r0
            int r10 = r1.left
            int r0 = r1.right
            int r10 = r10 + r0
            int r0 = r13.leftMargin
            int r10 = r10 + r0
            int r0 = r13.rightMargin
            int r10 = r10 + r0
            int r14 = r13.A00
            int r1 = r13.A01
            int r0 = r6.A01
            if (r0 != r5) goto L_0x01c8
            androidx.recyclerview.widget.RecyclerView r0 = r6.A07
            boolean r0 = X.AnonymousClass0YH.A08(r0)
            if (r0 == 0) goto L_0x01c8
            int[] r15 = r6.A03
            int r0 = r6.A00
            int r0 = r0 - r14
            r11 = r15[r0]
            int r0 = r0 - r1
            r0 = r15[r0]
            int r11 = r11 - r0
        L_0x0183:
            int r0 = r6.A01
            if (r0 != r5) goto L_0x01b9
            int r0 = r13.width
            r1 = 1073741824(0x40000000, float:2.0)
            int r10 = X.C06440Xs.A02(r11, r1, r10, r0, r2)
            int r0 = r7 - r12
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
        L_0x0195:
            android.view.ViewGroup$MarginLayoutParams r12 = X.AnonymousClass001.A0T(r16)
            int r1 = r16.getMeasuredWidth()
            int r0 = r12.width
            boolean r0 = X.C06440Xs.A07(r1, r10, r0)
            if (r0 == 0) goto L_0x01b1
            int r1 = r16.getMeasuredHeight()
            int r0 = r12.height
            boolean r0 = X.C06440Xs.A07(r1, r11, r0)
            if (r0 != 0) goto L_0x01b6
        L_0x01b1:
            r0 = r16
            r0.measure(r10, r11)
        L_0x01b6:
            int r9 = r9 + 1
            goto L_0x013a
        L_0x01b9:
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = r7 - r10
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            int r0 = r13.height
            int r11 = X.C06440Xs.A02(r11, r1, r12, r0, r2)
            goto L_0x0195
        L_0x01c8:
            int[] r0 = r6.A03
            int r1 = r1 + r14
            r11 = r0[r1]
            r0 = r0[r14]
            int r11 = r11 - r0
            goto L_0x0183
        L_0x01d1:
            r8.A00 = r7
            int r2 = r6.A01
            r1 = -1
            int r0 = r3.A05
            if (r2 != r5) goto L_0x025b
            if (r0 != r1) goto L_0x0256
            int r0 = r3.A07
            int r2 = r0 - r7
        L_0x01e0:
            r3 = 0
            r11 = 0
        L_0x01e2:
            r10 = 0
        L_0x01e3:
            android.view.View[] r1 = r6.A04
            if (r10 >= r4) goto L_0x026a
            r9 = r1[r10]
            android.view.ViewGroup$LayoutParams r7 = r9.getLayoutParams()
            X.09X r7 = (X.AnonymousClass09X) r7
            int r1 = r6.A01
            if (r1 != r5) goto L_0x0243
            androidx.recyclerview.widget.RecyclerView r1 = r6.A07
            boolean r1 = X.AnonymousClass0YH.A08(r1)
            int r3 = r6.A0B()
            int[] r12 = r6.A03
            if (r1 == 0) goto L_0x0234
            int r11 = r6.A00
            int r1 = r7.A00
            int r11 = r11 - r1
            r1 = r12[r11]
            int r3 = r3 + r1
            X.0Uc r1 = r6.A06
            int r1 = r1.A08(r9)
            int r11 = r3 - r1
        L_0x0211:
            X.C06440Xs.A05(r9, r11, r2, r3, r0)
            X.0Ua r7 = r7.A00
            int r1 = r7.A00
            r1 = r1 & 8
            boolean r1 = X.AnonymousClass000.A1S(r1)
            if (r1 != 0) goto L_0x0226
            int r1 = r7.A00
            r1 = r1 & 2
            if (r1 == 0) goto L_0x0228
        L_0x0226:
            r8.A03 = r5
        L_0x0228:
            boolean r7 = r8.A02
            boolean r1 = r9.hasFocusable()
            r7 = r7 | r1
            r8.A02 = r7
            int r10 = r10 + 1
            goto L_0x01e3
        L_0x0234:
            int r1 = r7.A00
            r1 = r12[r1]
            int r3 = r3 + r1
            X.0Uc r1 = r6.A06
            int r1 = r1.A08(r9)
            int r1 = r1 + r3
            r11 = r3
            r3 = r1
            goto L_0x0211
        L_0x0243:
            int r2 = r6.A0D()
            int[] r1 = r6.A03
            int r0 = r7.A00
            r0 = r1[r0]
            int r2 = r2 + r0
            X.0Uc r0 = r6.A06
            int r0 = r0.A08(r9)
            int r0 = r0 + r2
            goto L_0x0211
        L_0x0256:
            int r2 = r3.A07
            int r0 = r2 + r7
            goto L_0x01e0
        L_0x025b:
            if (r0 != r1) goto L_0x0265
            int r3 = r3.A07
            int r11 = r3 - r7
        L_0x0261:
            r2 = 0
            r0 = 0
            goto L_0x01e2
        L_0x0265:
            int r11 = r3.A07
            int r3 = r11 + r7
            goto L_0x0261
        L_0x026a:
            r0 = 0
            java.util.Arrays.fill(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.A1c(X.0M6, X.0Oj, X.0Qz, X.0Q1):void");
    }

    public void A1d(C04460Oj r6, C16020sL r7, AnonymousClass0Q1 r8) {
        int i;
        int i2 = this.A00;
        for (int i3 = 0; i3 < this.A00 && (i = r6.A01) >= 0 && i < r8.A00() && i2 > 0; i3++) {
            r7.Awj(i, Math.max(0, r6.A08));
            i2 -= this.A01.A00(i);
            r6.A01 += r6.A03;
        }
    }

    public void A1i(boolean z) {
        if (!z) {
            super.A1i(false);
            return;
        }
        throw AnonymousClass002.A0G("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public final int A1j(C04870Qz r9, AnonymousClass0Q1 r10, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (!r10.A08) {
            AnonymousClass0OM r2 = this.A01;
            i2 = this.A00;
            i3 = 0;
            i4 = 0;
            i5 = r2.A00(i);
            for (int i6 = 0; i6 < i; i6++) {
                int A002 = r2.A00(i6);
                i4 += A002;
                if (i4 == i2) {
                    i3++;
                    i4 = 0;
                } else if (i4 > i2) {
                    i3++;
                    i4 = A002;
                }
            }
        } else {
            int A003 = r9.A00(i);
            if (A003 == -1) {
                Log.w("GridLayoutManager", AnonymousClass000.A0Y("Cannot find span size for pre layout position. ", AnonymousClass001.A0o(), i));
                return 0;
            }
            AnonymousClass0OM r22 = this.A01;
            i2 = this.A00;
            i3 = 0;
            int i7 = 0;
            i5 = r22.A00(A003);
            for (int i8 = 0; i8 < A003; i8++) {
                int A004 = r22.A00(i8);
                i7 = i4 + A004;
                if (i7 == i2) {
                    i3++;
                    i7 = 0;
                } else if (i7 > i2) {
                    i3++;
                    i7 = A004;
                }
            }
        }
        if (i4 + i5 > i2) {
            return i3 + 1;
        }
        return i3;
    }

    public final int A1k(C04870Qz r4, AnonymousClass0Q1 r5, int i) {
        if (!r5.A08) {
            return this.A01.A01(i, this.A00);
        }
        int i2 = this.A06.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int A002 = r4.A00(i);
        if (A002 != -1) {
            return this.A01.A01(A002, this.A00);
        }
        Log.w("GridLayoutManager", AnonymousClass000.A0Y("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:", AnonymousClass001.A0o(), i));
        return 0;
    }

    public final int A1l(C04870Qz r3, AnonymousClass0Q1 r4, int i) {
        if (!r4.A08) {
            return this.A01.A00(i);
        }
        int i2 = this.A07.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int A002 = r3.A00(i);
        if (A002 != -1) {
            return this.A01.A00(A002);
        }
        Log.w("GridLayoutManager", AnonymousClass000.A0Y("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:", AnonymousClass001.A0o(), i));
        return 1;
    }

    public final void A1m() {
        View[] viewArr = this.A04;
        if (viewArr == null || viewArr.length != this.A00) {
            this.A04 = new View[this.A00];
        }
    }

    public final void A1n() {
        int A0A;
        int A0D;
        if (this.A01 == 1) {
            A0A = this.A03 - A0C();
            A0D = A0B();
        } else {
            A0A = this.A00 - A0A();
            A0D = A0D();
        }
        A1p(A0A - A0D);
    }

    public void A1o(int i) {
        if (i != this.A00) {
            this.A02 = true;
            if (i >= 1) {
                this.A00 = i;
                this.A01.A01.clear();
                A0V();
                return;
            }
            throw AnonymousClass000.A0G("Span count should be at least 1. Provided ", AnonymousClass001.A0o(), i);
        }
    }

    public final void A1p(int i) {
        int i2;
        int length;
        int[] iArr = this.A03;
        int i3 = this.A00;
        if (!(iArr != null && (length = iArr.length) == i3 + 1 && iArr[length - 1] == i)) {
            iArr = new int[(i3 + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.A03 = iArr;
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0JZ.A00, i, i2);
        obtainStyledAttributes.getInt(0, 1);
        int i3 = obtainStyledAttributes.getInt(10, 1);
        obtainStyledAttributes.getBoolean(9, false);
        obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        A1o(i3);
    }

    public int A0G(C04870Qz r2, AnonymousClass0Q1 r3, int i) {
        A1n();
        A1m();
        return super.A0G(r2, r3, i);
    }

    public int A0H(C04870Qz r2, AnonymousClass0Q1 r3, int i) {
        A1n();
        A1m();
        return super.A0H(r2, r3, i);
    }

    public int A0J(AnonymousClass0Q1 r2) {
        return A1O(r2);
    }

    public int A0K(AnonymousClass0Q1 r2) {
        return A1P(r2);
    }

    public int A0M(AnonymousClass0Q1 r2) {
        return A1O(r2);
    }

    public int A0N(AnonymousClass0Q1 r2) {
        return A1P(r2);
    }

    public void A0l(View view, C05650Ui r10, C04870Qz r11, AnonymousClass0Q1 r12) {
        AccessibilityNodeInfo.CollectionItemInfo obtain;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof AnonymousClass09X)) {
            super.A0k(view, r10);
            return;
        }
        AnonymousClass09X r1 = (AnonymousClass09X) layoutParams;
        int A1j = A1j(r11, r12, AnonymousClass001.A0J(r1.A00));
        if (this.A01 == 0) {
            obtain = AccessibilityNodeInfo.CollectionItemInfo.obtain(r1.A00, r1.A01, A1j, 1, false, false);
        } else {
            obtain = AccessibilityNodeInfo.CollectionItemInfo.obtain(A1j, 1, r1.A00, r1.A01, false, false);
        }
        r10.A0G(new AnonymousClass0KP(obtain));
    }

    public void A0y(AnonymousClass0Q1 r2) {
        super.A0y(r2);
        this.A02 = false;
    }

    public View A1S(C04870Qz r8, AnonymousClass0Q1 r9, int i, int i2, int i3) {
        A1V();
        int A042 = this.A06.A04();
        int A022 = this.A06.A02();
        int i4 = -1;
        if (i2 > i) {
            i4 = 1;
        }
        View view = null;
        View view2 = null;
        while (i != i2) {
            View A0Q = A0Q(i);
            int A032 = C06440Xs.A03(A0Q);
            if (A032 >= 0 && A032 < i3 && A1k(r8, r9, A032) == 0) {
                if (AnonymousClass000.A1S(AnonymousClass001.A0Y(A0Q).A00.A00 & 8)) {
                    if (view2 == null) {
                        view2 = A0Q;
                    }
                } else if (this.A06.A09(A0Q) < A022 && this.A06.A06(A0Q) >= A042) {
                    return A0Q;
                } else {
                    if (view == null) {
                        view = A0Q;
                    }
                }
            }
            i += i4;
        }
        if (view == null) {
            return view2;
        }
        return view;
    }

    public void A1b(AnonymousClass0QI r6, C04870Qz r7, AnonymousClass0Q1 r8, int i) {
        A1n();
        if (r8.A00() > 0 && !r8.A08) {
            boolean A1U = AnonymousClass000.A1U(i, 1);
            int A1k = A1k(r7, r8, r6.A01);
            if (A1U) {
                while (A1k > 0) {
                    int i2 = r6.A01;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    r6.A01 = i3;
                    A1k = A1k(r7, r8, i3);
                }
            } else {
                int A002 = r8.A00() - 1;
                int i4 = r6.A01;
                while (i4 < A002) {
                    int i5 = i4 + 1;
                    int A1k2 = A1k(r7, r8, i5);
                    if (A1k2 <= A1k) {
                        break;
                    }
                    i4 = i5;
                    A1k = A1k2;
                }
                r6.A01 = i4;
            }
        }
        A1m();
    }

    public final void A1q(View view, int i, boolean z) {
        int i2;
        int A022;
        int A023;
        AnonymousClass09X r6 = (AnonymousClass09X) view.getLayoutParams();
        Rect rect = r6.A03;
        int i3 = rect.top + rect.bottom + r6.topMargin + r6.bottomMargin;
        int i4 = rect.left + rect.right + r6.leftMargin + r6.rightMargin;
        int i5 = r6.A00;
        int i6 = r6.A01;
        if (this.A01 != 1 || !AnonymousClass0YH.A08(this.A07)) {
            int[] iArr = this.A03;
            i2 = iArr[i6 + i5] - iArr[i5];
        } else {
            int[] iArr2 = this.A03;
            int i7 = this.A00 - i5;
            i2 = iArr2[i7] - iArr2[i7 - i6];
        }
        if (this.A01 == 1) {
            A023 = C06440Xs.A02(i2, i, i4, r6.width, false);
            A022 = C06440Xs.A02(this.A06.A05(), this.A01, i3, r6.height, true);
        } else {
            A022 = C06440Xs.A02(i2, i, i3, r6.height, false);
            A023 = C06440Xs.A02(this.A06.A05(), this.A04, i4, r6.width, true);
        }
        C002102g A0Y = AnonymousClass001.A0Y(view);
        if (z) {
            if (C06440Xs.A07(view.getMeasuredWidth(), A023, A0Y.width) && C06440Xs.A07(view.getMeasuredHeight(), A022, A0Y.height)) {
                return;
            }
        } else if (!A1E(view, A0Y, A023, A022)) {
            return;
        }
        view.measure(A023, A022);
    }

    public void A11(RecyclerView recyclerView) {
        C06440Xs.A06(this);
    }

    public boolean A1F(C002102g r2) {
        return r2 instanceof AnonymousClass09X;
    }

    public void A12(RecyclerView recyclerView, int i, int i2) {
        C06440Xs.A06(this);
    }

    public void A13(RecyclerView recyclerView, int i, int i2) {
        C06440Xs.A06(this);
    }

    public void A14(RecyclerView recyclerView, int i, int i2, int i3) {
        C06440Xs.A06(this);
    }

    public void A15(RecyclerView recyclerView, Object obj, int i, int i2) {
        C06440Xs.A06(this);
    }

    public GridLayoutManager(int i) {
        super(1);
        A1o(i);
    }

    public GridLayoutManager(int i, int i2) {
        super(i2);
        A1o(i);
    }
}
