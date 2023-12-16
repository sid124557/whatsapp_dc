package com.whatsapp.components;

import X.AnonymousClass4GJ;
import X.C100905Cs;
import X.C109125e7;
import X.C111685iW;
import X.C116855qy;
import X.C620733j;
import X.C86614Ku;
import X.C86644Kx;
import X.C86664Kz;
import X.C88864av;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;

public class TextAndDateLayout extends FrameLayout implements AnonymousClass4GJ {
    public float A00;
    public float A01;
    public int A02;
    public C620733j A03;
    public C116855qy A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0136, code lost:
        if (r13.A05 == false) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r14, int r15) {
        /*
            r13 = this;
            r5 = 0
            android.view.View r4 = r13.getChildAt(r5)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r7 = 1
            android.view.View r2 = r13.getChildAt(r7)
            android.text.Layout r0 = r4.getLayout()
            boolean r12 = X.AnonymousClass000.A1X(r0)
            super.onMeasure(r14, r15)
            int r1 = android.view.View.MeasureSpec.getMode(r15)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r1 == r0) goto L_0x0036
            int r1 = r4.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x0036
            int r3 = android.view.View.MeasureSpec.getSize(r14)
            android.text.Layout r6 = r4.getLayout()
            if (r6 != 0) goto L_0x0037
            java.lang.String r0 = "TextAndDateLayout/onMeasure/error getting textView layout"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0036:
            return
        L_0x0037:
            boolean r0 = r13.isInEditMode()
            r11 = 0
            if (r0 != 0) goto L_0x004d
            int r1 = r13.getLastParagraphDirection()
            r0 = -1
            if (r1 != r0) goto L_0x0128
            X.33j r0 = r13.A03
            boolean r0 = X.C620733j.A04(r0)
            if (r0 != 0) goto L_0x0132
        L_0x004d:
            r10 = 0
        L_0x004e:
            int r0 = r6.getLineCount()
            if (r0 <= r7) goto L_0x00e5
            int r0 = X.C86644Kx.A03(r6, r13)
            int r8 = r6.getLineStart(r0)
            int r0 = X.C86644Kx.A03(r6, r13)
            int r7 = r6.getLineEnd(r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r1 < r0) goto L_0x00e0
            java.lang.CharSequence r9 = r6.getText()
        L_0x006e:
            java.lang.CharSequence r1 = r9.subSequence(r8, r7)
            android.text.TextPaint r0 = r4.getPaint()
            float r0 = android.text.Layout.getDesiredWidth(r1, r0)
            int r8 = (int) r0
            int r1 = r13.A02
            if (r1 <= 0) goto L_0x008d
            int r0 = r6.getLineCount()
            if (r1 >= r0) goto L_0x008d
            int r0 = r6.getLineStart(r5)
            java.lang.CharSequence r9 = r9.subSequence(r0, r7)
        L_0x008d:
            int r7 = r4.getMeasuredWidth()
            if (r12 != 0) goto L_0x00b6
            r0 = 10
            int r0 = android.text.TextUtils.indexOf(r9, r0)
            if (r0 < 0) goto L_0x00b6
            android.text.TextPaint r0 = r4.getPaint()
            float r0 = android.text.Layout.getDesiredWidth(r9, r0)
            double r0 = (double) r0
            double r5 = java.lang.Math.ceil(r0)
            int r1 = (int) r5
            int r0 = r4.getPaddingRight()
            int r1 = r1 + r0
            int r0 = X.C86664Kz.A0F(r4, r1)
            int r7 = java.lang.Math.min(r7, r0)
        L_0x00b6:
            int r1 = X.AnonymousClass000.A06(r13, r3)
            int r0 = r2.getMeasuredWidth()
            int r0 = r0 + r7
            if (r1 < r0) goto L_0x010d
            if (r10 != 0) goto L_0x010d
            boolean r0 = r13.A07
            if (r0 != 0) goto L_0x00d4
            int r0 = X.C86664Kz.A0G(r2, r7)
            int r0 = X.C86664Kz.A0F(r13, r0)
            int r3 = r13.getPaddingRight()
            int r3 = r3 + r0
        L_0x00d4:
            int r1 = r13.getMeasuredHeight()
            float r0 = r13.A01
        L_0x00da:
            int r0 = (int) r0
            int r1 = r1 + r0
            r13.setMeasuredDimension(r3, r1)
            return
        L_0x00e0:
            java.lang.CharSequence r9 = r4.getText()
            goto L_0x006e
        L_0x00e5:
            int r1 = X.AnonymousClass000.A06(r13, r3)
            int r0 = r4.getMeasuredWidth()
            int r0 = X.C86664Kz.A0G(r2, r0)
            if (r1 < r0) goto L_0x0119
            if (r10 != 0) goto L_0x0119
            int r0 = r4.getMeasuredWidth()
            int r0 = X.C86664Kz.A0G(r2, r0)
            int r3 = X.C86664Kz.A0F(r13, r0)
            int r0 = r13.getPaddingRight()
            int r3 = r3 + r0
            int r0 = r13.getMeasuredWidth()
            if (r3 <= r0) goto L_0x0036
            goto L_0x00d4
        L_0x010d:
            int r1 = X.AnonymousClass000.A06(r4, r7)
            int r0 = X.C86664Kz.A0G(r2, r8)
            if (r1 < r0) goto L_0x0119
            if (r11 == 0) goto L_0x0036
        L_0x0119:
            int r3 = r13.getMeasuredWidth()
            int r0 = r13.getMeasuredHeight()
            int r1 = X.AnonymousClass4L0.A04(r2, r0)
            float r0 = r13.A00
            goto L_0x00da
        L_0x0128:
            if (r1 != r7) goto L_0x004d
            X.33j r0 = r13.A03
            boolean r0 = X.C102805Ki.A00(r0)
            if (r0 == 0) goto L_0x004d
        L_0x0132:
            r11 = 1
            boolean r0 = r13.A05
            r10 = 1
            if (r0 != 0) goto L_0x004e
            goto L_0x004d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.components.TextAndDateLayout.onMeasure(int, int):void");
    }

    public void A00() {
        if (!this.A06) {
            this.A06 = true;
            this.A03 = C88864av.A02((C111685iW) generatedComponent());
        }
    }

    public final void A01(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = C86614Ku.A0C(this).obtainStyledAttributes(attributeSet, C100905Cs.A0P, 0, 0);
            try {
                this.A02 = obtainStyledAttributes.getInt(3, 0);
                this.A05 = obtainStyledAttributes.getBoolean(0, false);
                this.A01 = obtainStyledAttributes.getDimension(2, 0.0f);
                this.A00 = obtainStyledAttributes.getDimension(1, 0.0f);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A04;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public void setMaxTextLineCount(int i) {
        if (this.A02 != i) {
            invalidate();
            setTextViewStyle(i);
        }
        this.A02 = i;
    }

    public TextAndDateLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
        A01(attributeSet);
    }

    private int getLastParagraphDirection() {
        Layout layout = ((TextView) C86644Kx.A0G(this)).getLayout();
        return layout.getParagraphDirection(C86644Kx.A03(layout, this));
    }

    private void setTextViewStyle(int i) {
        TextView textView = (TextView) C86644Kx.A0G(this);
        if (i > 0) {
            textView.setMaxLines(i);
            C86664Kz.A1S(textView);
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        setTextViewStyle(this.A02);
        if (this.A05) {
            TextView textView = (TextView) C86644Kx.A0G(this);
            textView.addTextChangedListener(new C109125e7(textView, this));
        }
    }

    public void setFullWidth(boolean z) {
        this.A07 = z;
    }

    public TextAndDateLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        A01(attributeSet);
    }

    public TextAndDateLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00();
        A01(attributeSet);
    }

    public TextAndDateLayout(Context context) {
        super(context);
        A00();
    }

    public TextAndDateLayout(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }
}
