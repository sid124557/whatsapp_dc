package com.whatsapp.mediacomposer.doodle.textentry;

import X.AnonymousClass4GJ;
import X.C116855qy;
import X.C1458677p;
import X.C179498jF;
import X.C86604Kt;
import X.C86664Kz;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class TextToolColorPicker extends View implements AnonymousClass4GJ {
    public int A00;
    public int A01;
    public int A02;
    public Bitmap A03;
    public C179498jF A04;
    public C116855qy A05;
    public boolean A06;
    public boolean A07;
    public int[] A08;
    public final Paint A09;
    public final Paint A0A;

    public void A00() {
        if (!this.A06) {
            this.A06 = true;
            generatedComponent();
        }
    }

    public final void A01(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1458677p.A00);
            this.A02 = (int) obtainStyledAttributes.getDimension(1, 1.0f);
            this.A07 = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A05;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }

    public int getColor() {
        return this.A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006f, code lost:
        if (r1 != r10.A00) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSizeChanged(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            boolean r0 = r10.A07
            if (r0 == 0) goto L_0x00cd
            int r1 = X.AnonymousClass000.A06(r10, r11)
        L_0x0008:
            r0 = 1
            int r1 = java.lang.Math.max(r0, r1)
            r10.A00 = r1
            int[] r0 = r10.A08
            if (r0 == 0) goto L_0x0016
            int r0 = r0.length
            if (r0 >= r1) goto L_0x001a
        L_0x0016:
            int[] r0 = new int[r1]
            r10.A08 = r0
        L_0x001a:
            int[] r0 = X.AnonymousClass5VG.A01(r1)
            r10.A08 = r0
            android.graphics.Path r3 = X.AnonymousClass002.A06()
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
            r3.setFillType(r0)
            r0 = 8
            float[] r5 = new float[r0]
            int r0 = r10.A02
            float r1 = (float) r0
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            float r1 = r1 / r0
            java.util.Arrays.fill(r5, r1)
            boolean r1 = r10.A07
            if (r1 == 0) goto L_0x00c9
            int r0 = r10.A00
        L_0x003d:
            int r0 = r0 + -1
            float r4 = (float) r0
            if (r1 == 0) goto L_0x00c5
            int r0 = r10.A02
        L_0x0044:
            int r0 = r0 + -1
            float r0 = (float) r0
            r2 = 1065353216(0x3f800000, float:1.0)
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>(r2, r2, r4, r0)
            android.graphics.Path$Direction r0 = android.graphics.Path.Direction.CW
            r3.addRoundRect(r1, r5, r0)
            android.graphics.Bitmap r1 = r10.A03
            if (r1 == 0) goto L_0x0071
            boolean r0 = r10.A07
            if (r0 == 0) goto L_0x00c0
            int r1 = r1.getHeight()
        L_0x005f:
            int r0 = r10.A02
            if (r1 != r0) goto L_0x0071
            boolean r1 = r10.A07
            android.graphics.Bitmap r0 = r10.A03
            if (r1 == 0) goto L_0x00bb
            int r1 = r0.getWidth()
        L_0x006d:
            int r0 = r10.A00
            if (r1 == r0) goto L_0x007f
        L_0x0071:
            boolean r0 = r10.A07
            if (r0 == 0) goto L_0x00b6
            int r1 = r10.A00
            int r0 = r10.A02
        L_0x0079:
            android.graphics.Bitmap r0 = X.C86664Kz.A0Y(r1, r0)
            r10.A03 = r0
        L_0x007f:
            android.graphics.Bitmap r0 = r10.A03
            android.graphics.Canvas r4 = X.AnonymousClass4L0.A06(r0)
            android.graphics.Paint r9 = r10.A09
            X.C86634Kw.A17(r9)
            r4.save()
            r4.clipPath(r3)
            r9.setStrokeWidth(r2)
            r1 = 0
        L_0x0094:
            int r0 = r10.A00
            if (r1 >= r0) goto L_0x00d3
            int[] r0 = r10.A08
            r0 = r0[r1]
            r9.setColor(r0)
            boolean r0 = r10.A07
            if (r0 == 0) goto L_0x00af
            float r5 = (float) r1
            r6 = 0
            r7 = r5
            int r0 = r10.A02
            float r8 = (float) r0
        L_0x00a9:
            r4.drawLine(r5, r6, r7, r8, r9)
            int r1 = r1 + 1
            goto L_0x0094
        L_0x00af:
            r5 = 0
            float r8 = (float) r1
            r6 = r8
            int r0 = r10.A02
            float r7 = (float) r0
            goto L_0x00a9
        L_0x00b6:
            int r1 = r10.A02
            int r0 = r10.A00
            goto L_0x0079
        L_0x00bb:
            int r1 = r0.getHeight()
            goto L_0x006d
        L_0x00c0:
            int r1 = r1.getWidth()
            goto L_0x005f
        L_0x00c5:
            int r0 = r10.A00
            goto L_0x0044
        L_0x00c9:
            int r0 = r10.A02
            goto L_0x003d
        L_0x00cd:
            int r1 = X.AnonymousClass000.A05(r10, r12)
            goto L_0x0008
        L_0x00d3:
            r4.restore()
            android.graphics.Paint r2 = r10.A0A
            android.content.Context r1 = r10.getContext()
            r0 = 2131100118(0x7f0601d6, float:1.7812608E38)
            X.C86614Ku.A10(r1, r2, r0)
            X.C86634Kw.A17(r2)
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131168290(0x7f070c22, float:1.7950878E38)
            float r0 = X.C86664Kz.A01(r1, r0)
            r2.setStrokeWidth(r0)
            r4.drawPath(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.doodle.textentry.TextToolColorPicker.onSizeChanged(int, int, int, int):void");
    }

    public void setColorAndInvalidate(int i) {
        this.A01 = i;
        invalidate();
    }

    public TextToolColorPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
        this.A09 = C86664Kz.A0Z();
        this.A0A = C86604Kt.A0B();
        A01(context, attributeSet);
    }

    private void setColor(int i) {
        this.A01 = i;
    }

    public void draw(Canvas canvas) {
        float width;
        float paddingTop;
        super.draw(canvas);
        Bitmap bitmap = this.A03;
        if (bitmap != null) {
            if (this.A07) {
                width = (float) getPaddingLeft();
            } else {
                width = ((float) (getWidth() - this.A02)) / 2.0f;
            }
            if (this.A07) {
                paddingTop = ((float) (getHeight() - this.A02)) / 2.0f;
            } else {
                paddingTop = (float) getPaddingTop();
            }
            canvas.drawBitmap(bitmap, width, paddingTop, this.A09);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        if (r6 != 6) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0059, code lost:
        if (r6 != 1) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            int r6 = r8.getActionMasked()
            int r1 = r8.getPointerCount()
            r0 = 0
            r4 = 1
            if (r1 <= r4) goto L_0x000d
            return r0
        L_0x000d:
            r5 = 6
            if (r6 == 0) goto L_0x0021
            if (r6 == r4) goto L_0x0021
            r0 = 2
            if (r6 == r0) goto L_0x0021
            r0 = 3
            if (r6 == r0) goto L_0x005b
            r0 = 5
            if (r6 == r0) goto L_0x0021
            if (r6 == r5) goto L_0x0021
        L_0x001d:
            r7.invalidate()
            return r4
        L_0x0021:
            X.8jF r0 = r7.A04
            if (r0 == 0) goto L_0x001d
            boolean r0 = r7.A07
            if (r0 == 0) goto L_0x0069
            float r0 = r8.getX()
        L_0x002d:
            int r1 = (int) r0
            if (r1 >= 0) goto L_0x0031
            r1 = 0
        L_0x0031:
            int r0 = r7.A00
            if (r1 < r0) goto L_0x0037
            int r1 = r0 + -1
        L_0x0037:
            int[] r0 = r7.A08
            r3 = r0[r1]
            int r0 = r7.A01
            if (r3 == r0) goto L_0x0057
            r7.A01 = r3
            X.8jF r2 = r7.A04
            X.8Hd r2 = (X.C171458Hd) r2
            X.7Nx r0 = r2.A01
            X.5X6 r1 = r0.A03
            r1.A03 = r3
            int r0 = r1.A02
            r1.A01(r3, r0)
            com.whatsapp.mediacomposer.doodle.textentry.NewTextEntryView r0 = r2.A00
            com.whatsapp.mediacomposer.doodle.textentry.DoodleEditText r0 = r0.A01
            r0.A0A(r3)
        L_0x0057:
            if (r6 == r5) goto L_0x005b
            if (r6 != r4) goto L_0x001d
        L_0x005b:
            X.8jF r0 = r7.A04
            X.8Hd r0 = (X.C171458Hd) r0
            com.whatsapp.mediacomposer.doodle.textentry.NewTextEntryView r0 = r0.A00
            com.whatsapp.mediacomposer.doodle.textentry.TextToolColorPicker r1 = r0.A06
            int r0 = r1.A01
            X.AnonymousClass5VG.A00(r1, r0)
            goto L_0x001d
        L_0x0069:
            float r0 = r8.getY()
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.doodle.textentry.TextToolColorPicker.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setListener(C179498jF r1) {
        this.A04 = r1;
    }

    public TextToolColorPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        this.A09 = C86664Kz.A0Z();
        this.A0A = C86604Kt.A0B();
        A01(context, attributeSet);
    }

    public TextToolColorPicker(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00();
        this.A09 = C86664Kz.A0Z();
        this.A0A = C86604Kt.A0B();
        A01(context, attributeSet);
    }

    public TextToolColorPicker(Context context) {
        super(context);
        A00();
        this.A09 = C86664Kz.A0Z();
        this.A0A = C86604Kt.A0B();
    }

    public TextToolColorPicker(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }
}
