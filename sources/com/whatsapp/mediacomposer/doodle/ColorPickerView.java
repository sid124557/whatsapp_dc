package com.whatsapp.mediacomposer.doodle;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass4GJ;
import X.AnonymousClass4L0;
import X.AnonymousClass5VG;
import X.C100895Cr;
import X.C111685iW;
import X.C116855qy;
import X.C124856Ed;
import X.C179448jA;
import X.C620733j;
import X.C86604Kt;
import X.C86614Ku;
import X.C86634Kw;
import X.C86664Kz;
import X.C88864av;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.R;
import java.util.Arrays;

public class ColorPickerView extends View implements AnonymousClass4GJ {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public Bitmap A07;
    public C620733j A08;
    public C179448jA A09;
    public C116855qy A0A;
    public boolean A0B;
    public boolean A0C;
    public int[] A0D;
    public final Paint A0E;
    public final Paint A0F;

    public void A00() {
        if (!this.A0C) {
            this.A0C = true;
            this.A08 = C88864av.A02((C111685iW) generatedComponent());
        }
    }

    public final void A01() {
        this.A0D = AnonymousClass5VG.A01(this.A01);
        Path A062 = AnonymousClass002.A06();
        A062.setFillType(Path.FillType.WINDING);
        float[] fArr = new float[8];
        Arrays.fill(fArr, ((float) this.A04) / 0.8f);
        A062.addRoundRect(new RectF(1.0f, 1.0f, (float) (this.A04 - 1), (float) (this.A01 - 1)), fArr, Path.Direction.CW);
        Bitmap bitmap = this.A07;
        if (!(bitmap != null && bitmap.getWidth() == this.A04 && this.A07.getHeight() == this.A01)) {
            this.A07 = C86664Kz.A0Y(this.A04, this.A01);
        }
        Canvas A063 = AnonymousClass4L0.A06(this.A07);
        Paint paint = this.A0E;
        C86634Kw.A17(paint);
        A063.save();
        A063.clipPath(A062);
        paint.setStrokeWidth(1.0f);
        for (int i = 0; i < this.A01; i++) {
            paint.setColor(this.A0D[i]);
            float f = (float) i;
            A063.drawLine(0.0f, f, (float) this.A04, f, paint);
        }
        A063.restore();
        Paint paint2 = this.A0F;
        C86614Ku.A10(getContext(), paint2, R.color.f5nameremoved);
        C86634Kw.A17(paint2);
        paint2.setStrokeWidth(C86664Kz.A01(getResources(), R.dimen.f6nameremoved));
        A063.drawPath(A062, paint2);
    }

    public final void A02(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C100895Cr.A03);
            this.A04 = (int) obtainStyledAttributes.getDimension(2, 1.0f);
            this.A06 = (int) obtainStyledAttributes.getDimension(1, 1.0f);
            this.A05 = (int) obtainStyledAttributes.getDimension(0, 1.0f);
            this.A00 = (float) this.A06;
            obtainStyledAttributes.recycle();
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A0A;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A0A = r0;
        }
        return r0.generatedComponent();
    }

    public int getColor() {
        return this.A02;
    }

    public float getMinSize() {
        return (float) this.A06;
    }

    public float getSize() {
        return this.A00;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        C124856Ed r2 = (C124856Ed) parcelable;
        this.A02 = r2.A01;
        this.A00 = r2.A00;
        super.onRestoreInstanceState(r2.getSuperState());
    }

    public void setColorAndInvalidate(int i) {
        this.A02 = i;
        invalidate();
    }

    public void setSizeAndInvalidate(float f) {
        this.A00 = f;
        invalidate();
    }

    public ColorPickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
        this.A0E = C86664Kz.A0Z();
        this.A0F = C86604Kt.A0B();
        A02(context, attributeSet);
    }

    private void setColor(int i) {
        this.A02 = i;
    }

    private void setSize(float f) {
        this.A00 = f;
    }

    public void draw(Canvas canvas) {
        int paddingRight;
        super.draw(canvas);
        if (C620733j.A04(this.A08)) {
            paddingRight = AnonymousClass001.A0I(this);
        } else {
            paddingRight = this.A04 + getPaddingRight();
        }
        canvas.drawBitmap(this.A07, (float) paddingRight, (float) getPaddingTop(), this.A0E);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A03 != 0 && getMeasuredHeight() > this.A03) {
            setMeasuredDimension(getMeasuredWidth(), this.A03);
        }
    }

    public Parcelable onSaveInstanceState() {
        return new C124856Ed(super.onSaveInstanceState(), this.A00, this.A02);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int max = Math.max(1, AnonymousClass000.A05(this, i2));
        this.A01 = max;
        int[] iArr = this.A0D;
        if (iArr == null || iArr.length < max) {
            this.A0D = new int[max];
        }
        A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0053, code lost:
        if (r7 != 6) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c8, code lost:
        if (r7 != 1) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            int r7 = r10.getActionMasked()
            int r0 = r10.getPointerCount()
            r6 = 0
            r5 = 1
            if (r0 > r5) goto L_0x0046
            r3 = 5
            r8 = 2
            if (r7 == r3) goto L_0x0012
            if (r7 != 0) goto L_0x0047
        L_0x0012:
            float r2 = r10.getX()
            int r1 = X.AnonymousClass001.A0I(r9)
            int r0 = r9.A04
            int r0 = r0 * 2
            int r1 = r1 - r0
            float r0 = (float) r1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x002c
            X.33j r0 = r9.A08
            boolean r0 = X.C620733j.A04(r0)
            if (r0 != 0) goto L_0x0046
        L_0x002c:
            float r2 = r10.getX()
            int r1 = r9.getPaddingLeft()
            int r0 = r9.A04
            int r0 = r0 * 2
            int r1 = r1 + r0
            float r0 = (float) r1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0047
            X.33j r0 = r9.A08
            boolean r0 = X.C102805Ki.A00(r0)
            if (r0 == 0) goto L_0x0047
        L_0x0046:
            return r6
        L_0x0047:
            r4 = 6
            if (r7 == 0) goto L_0x0059
            if (r7 == r5) goto L_0x0059
            if (r7 == r8) goto L_0x0059
            r0 = 3
            if (r7 == r0) goto L_0x00ca
            if (r7 == r3) goto L_0x0059
            if (r7 == r4) goto L_0x0059
        L_0x0055:
            r9.invalidate()
            return r5
        L_0x0059:
            X.8jA r0 = r9.A09
            if (r0 == 0) goto L_0x0055
            float r0 = r10.getY()
            int r1 = (int) r0
            int r0 = r9.getPaddingTop()
            int r1 = r1 - r0
            if (r1 >= 0) goto L_0x006a
            r1 = 0
        L_0x006a:
            int r0 = r9.A01
            if (r1 < r0) goto L_0x0070
            int r1 = r0 + -1
        L_0x0070:
            int[] r0 = r9.A0D
            r1 = r0[r1]
            int r0 = r9.A02
            if (r1 == r0) goto L_0x00c6
            r9.A02 = r1
            X.33j r0 = r9.A08
            boolean r0 = X.C620733j.A04(r0)
            if (r0 == 0) goto L_0x0103
            float r8 = X.AnonymousClass4L0.A00(r9)
            float r0 = r10.getX()
            float r8 = r8 - r0
        L_0x008b:
            int r0 = r9.A04
            int r1 = X.C86664Kz.A0F(r9, r0)
            int r0 = r9.getPaddingRight()
            int r1 = r1 + r0
            float r3 = (float) r1
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ad
            int r1 = r9.A06
            float r2 = (float) r1
            int r0 = r9.A05
            int r0 = r0 - r1
            float r1 = (float) r0
            float r8 = r8 - r3
            float r1 = r1 * r8
            float r0 = X.AnonymousClass4L0.A00(r9)
            float r0 = r0 - r3
            float r1 = r1 / r0
            float r2 = r2 + r1
            r9.A00 = r2
        L_0x00ad:
            r9.A0B = r5
            X.8jA r3 = r9.A09
            float r2 = r9.A00
            int r1 = r9.A02
            X.8HY r3 = (X.AnonymousClass8HY) r3
            X.8om r0 = r3.A02
            if (r0 == 0) goto L_0x00be
            r0.BnS(r2, r1)
        L_0x00be:
            X.8rs r0 = r3.A00
            r0.BPM(r2, r1)
            r0.Bev()
        L_0x00c6:
            if (r7 == r4) goto L_0x00ca
            if (r7 != r5) goto L_0x0055
        L_0x00ca:
            r9.A0B = r6
            X.8jA r4 = r9.A09
            X.8HY r4 = (X.AnonymousClass8HY) r4
            X.8om r0 = r4.A02
            if (r0 == 0) goto L_0x00f3
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = (com.whatsapp.mediacomposer.doodle.DoodleView) r0
            X.5US r3 = r0.A0I
            X.5Uw r0 = r3.A02
            if (r0 == 0) goto L_0x00f3
            X.5Uw r2 = r3.A01
            if (r0 != r2) goto L_0x00f3
            X.7N4 r0 = r3.A00
            X.4vK r1 = new X.4vK
            r1.<init>(r0, r2)
            X.5PR r0 = r3.A03
            java.util.LinkedList r0 = r0.A00
            r0.add(r1)
            r0 = 0
            r3.A02 = r0
            r3.A00 = r0
        L_0x00f3:
            X.8rs r0 = r4.A00
            r0.Bev()
            com.whatsapp.mediacomposer.doodle.ColorPickerComponent r0 = r4.A01
            com.whatsapp.mediacomposer.doodle.ColorPickerView r1 = r0.A05
            int r0 = r1.A02
            X.AnonymousClass5VG.A00(r1, r0)
            goto L_0x0055
        L_0x0103:
            float r8 = r10.getX()
            goto L_0x008b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.doodle.ColorPickerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setListener(C179448jA r1) {
        this.A09 = r1;
    }

    public void setMaxHeight(int i) {
        this.A03 = i;
    }

    public ColorPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        this.A0E = C86664Kz.A0Z();
        this.A0F = C86604Kt.A0B();
        A02(context, attributeSet);
    }

    public ColorPickerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00();
        this.A0E = C86664Kz.A0Z();
        this.A0F = C86604Kt.A0B();
        A02(context, attributeSet);
    }

    public ColorPickerView(Context context) {
        super(context);
        A00();
        this.A0E = C86664Kz.A0Z();
        this.A0F = C86604Kt.A0B();
    }

    public ColorPickerView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }
}
