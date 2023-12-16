package com.whatsapp;

import X.AnonymousClass001;
import X.AnonymousClass4L0;
import X.C100905Cs;
import X.C125116Fn;
import X.C86664Kz;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

public class InfoCard extends C125116Fn {
    public int A00;
    public Drawable A01;
    public Drawable A02;
    public final Paint A03 = C86664Kz.A0Z();

    public final void A02(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C100905Cs.A0A);
            this.A02 = obtainStyledAttributes.getDrawable(2);
            this.A01 = obtainStyledAttributes.getDrawable(0);
            this.A00 = obtainStyledAttributes.getInteger(1, 0);
            obtainStyledAttributes.recycle();
        }
        setWillNotDraw(false);
    }

    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        if (!(this.A02 == null || getPaddingTop() == 0)) {
            this.A02.setBounds(0, 0, getWidth(), getPaddingTop());
            this.A02.draw(canvas);
        }
        if (!(this.A01 == null || getPaddingBottom() == 0)) {
            this.A01.setBounds(0, AnonymousClass001.A0H(this), getWidth(), getHeight());
            this.A01.draw(canvas);
        }
        Paint paint = this.A03;
        paint.setColor(this.A00);
        canvas2.drawRect(0.0f, (float) getPaddingTop(), AnonymousClass4L0.A00(this), (float) AnonymousClass001.A0H(this), paint);
    }

    public InfoCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A02(context, attributeSet);
    }

    public InfoCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02(context, attributeSet);
    }

    public InfoCard(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A02(context, attributeSet);
    }

    public InfoCard(Context context) {
        super(context);
        setWillNotDraw(false);
    }
}
