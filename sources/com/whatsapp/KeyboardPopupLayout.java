package com.whatsapp;

import X.AnonymousClass4L0;
import X.AnonymousClass4Rn;
import X.AnonymousClass4Rz;
import X.C105895Wv;
import X.C181568my;
import X.C86604Kt;
import X.C86634Kw;
import X.C86664Kz;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;

public class KeyboardPopupLayout extends AnonymousClass4Rz implements C181568my {
    public int A00;
    public int A01;
    public int A02;
    public Paint A03;
    public AnonymousClass4Rn A04;
    public C105895Wv A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final Rect A09 = AnonymousClass4Rz.A00(this);
    public final int[] A0A = C86664Kz.A1Z();

    public AnonymousClass4Rn getKeyboardPopup() {
        return this.A04;
    }

    public void invalidate(Rect rect) {
        if (!this.A07) {
            super.invalidate(rect);
        }
    }

    public void onDraw(Canvas canvas) {
        if (this.A03 != null && this.A00 != getHeight()) {
            Rect rect = this.A09;
            rect.set(0, this.A00, getWidth(), getHeight());
            canvas.drawRect(rect, this.A03);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int A032;
        if (this.A06) {
            this.A06 = false;
        } else if (this.A07) {
        } else {
            if (this.A04 != null) {
                super.onLayout(z, i, i2, i3, i2 + this.A00);
                int[] iArr = this.A0A;
                getLocationInWindow(iArr);
                boolean z2 = this.A08;
                AnonymousClass4Rn r4 = this.A04;
                int A0F = C86664Kz.A0F(this, iArr[0]);
                if (z2) {
                    A032 = AnonymousClass4L0.A03(this, i3 - i);
                    i5 = 1000000;
                } else {
                    i5 = iArr[1] + this.A00;
                    A032 = AnonymousClass4L0.A03(this, i3 - i);
                }
                r4.update(A0F, i5, A032, r4.A01);
                return;
            }
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    public void requestLayout() {
        if (!this.A07) {
            super.requestLayout();
        }
    }

    public void setKeyboardPopup(AnonymousClass4Rn r2) {
        if (this.A04 != r2) {
            this.A04 = r2;
            requestLayout();
        }
    }

    public void setKeyboardPopupBackgroundColor(int i) {
        if (this.A03 == null) {
            this.A03 = C86604Kt.A0B();
        }
        setWillNotDraw(false);
        this.A03.setColor(i);
    }

    public KeyboardPopupLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private int getSizeWithKeyboard() {
        int i = C86634Kw.A0E(this).orientation;
        if (i == 1) {
            return this.A02;
        }
        if (i != 2) {
            return -1;
        }
        return this.A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0097, code lost:
        if (X.C105895Wv.A00(r7) != false) goto L_0x0099;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            boolean r0 = r7.isInEditMode()
            if (r0 != 0) goto L_0x0103
            boolean r0 = r7.A08
            r2 = -1
            if (r0 != 0) goto L_0x0089
            int r3 = android.view.View.MeasureSpec.getSize(r9)
            android.content.Context r0 = r7.getContext()
            android.app.Activity r4 = X.C621633u.A00(r0)
            if (r4 == 0) goto L_0x005b
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x005b
            boolean r0 = r4.isInMultiWindowMode()
            if (r0 == 0) goto L_0x005b
        L_0x0025:
            r7.A00 = r3
            X.4Rn r1 = r7.A04
            if (r1 == 0) goto L_0x0103
            int r0 = r1.A08(r2)
            r1.A01 = r0
            int r2 = android.view.View.MeasureSpec.getMode(r9)
            if (r2 == 0) goto L_0x004a
            X.5Wv r0 = r7.A05
            if (r0 == 0) goto L_0x004a
            boolean r0 = X.C105895Wv.A00(r7)
            if (r0 != 0) goto L_0x004a
            int r1 = r7.A00
            X.4Rn r0 = r7.A04
            int r0 = r0.A01
            int r1 = r1 - r0
            r7.A00 = r1
        L_0x004a:
            int r0 = r7.A00
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            super.onMeasure(r8, r0)
            int r0 = r7.getMeasuredWidth()
            r7.setMeasuredDimension(r0, r3)
            return
        L_0x005b:
            X.5Wv r0 = r7.A05
            if (r0 == 0) goto L_0x007d
            boolean r0 = X.C105895Wv.A00(r7)
            if (r0 == 0) goto L_0x007d
            X.4Rn r0 = r7.A04
            if (r0 == 0) goto L_0x006f
            boolean r0 = r0.isShowing()
            if (r0 != 0) goto L_0x007d
        L_0x006f:
            android.content.res.Configuration r0 = X.C86634Kw.A0E(r7)
            int r1 = r0.orientation
            r0 = 1
            if (r1 == r0) goto L_0x0086
            r0 = 2
            if (r1 != r0) goto L_0x007d
            r7.A01 = r3
        L_0x007d:
            int r0 = r7.getSizeWithKeyboard()
            if (r0 == r2) goto L_0x0025
            int r2 = r3 - r0
            goto L_0x0025
        L_0x0086:
            r7.A02 = r3
            goto L_0x007d
        L_0x0089:
            X.4Rn r0 = r7.A04
            if (r0 == 0) goto L_0x0103
            X.5Wv r0 = r7.A05
            r6 = 0
            if (r0 == 0) goto L_0x0099
            boolean r0 = X.C105895Wv.A00(r7)
            r5 = 1
            if (r0 == 0) goto L_0x009a
        L_0x0099:
            r5 = 0
        L_0x009a:
            int r4 = android.view.View.MeasureSpec.getSize(r9)
            int r3 = android.view.View.MeasureSpec.getMode(r9)
            X.4Rn r1 = r7.A04
            int r0 = r1.A08(r2)
            r1.A01 = r0
            X.4Rn r0 = r7.A04
            int r2 = r0.A01
            r0 = 1073741824(0x40000000, float:2.0)
            if (r3 != r0) goto L_0x00c8
            if (r5 == 0) goto L_0x00b5
            int r4 = r4 - r2
        L_0x00b5:
            r7.A00 = r4
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r3)
            super.onMeasure(r8, r0)
        L_0x00be:
            int r1 = r7.getMeasuredWidth()
            int r0 = r7.A00
        L_0x00c4:
            r7.setMeasuredDimension(r1, r0)
            return
        L_0x00c8:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r0) goto L_0x00ee
            r0 = r4
            if (r5 == 0) goto L_0x00d1
            int r0 = r4 - r2
        L_0x00d1:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            super.onMeasure(r8, r0)
            int r0 = r7.getMeasuredHeight()
            r7.A00 = r0
            int r1 = r7.getMeasuredWidth()
            int r0 = r7.getMeasuredHeight()
            if (r5 == 0) goto L_0x00e9
            int r0 = r0 + r2
        L_0x00e9:
            int r0 = java.lang.Math.min(r0, r4)
            goto L_0x00c4
        L_0x00ee:
            if (r5 == 0) goto L_0x00f1
            int r4 = r4 - r2
        L_0x00f1:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r3)
            super.onMeasure(r8, r0)
            int r0 = r7.getMeasuredHeight()
            if (r5 == 0) goto L_0x00ff
            r6 = r2
        L_0x00ff:
            int r0 = r0 + r6
            r7.A00 = r0
            goto L_0x00be
        L_0x0103:
            super.onMeasure(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.KeyboardPopupLayout.onMeasure(int, int):void");
    }

    public void setHeightShouldWrap(boolean z) {
        this.A08 = z;
    }

    public void setIgnoreNextKeyboardLayoutUpdate(boolean z) {
        this.A06 = z;
    }

    public KeyboardPopupLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void invalidate(int i, int i2, int i3, int i4) {
        if (!this.A07) {
            super.invalidate(i, i2, i3, i4);
        }
    }

    public KeyboardPopupLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void invalidate() {
        if (!this.A07) {
            super.invalidate();
        }
    }

    public KeyboardPopupLayout(Context context) {
        super(context);
    }
}
