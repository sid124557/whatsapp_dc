package com.whatsapp;

import X.C100905Cs;
import X.C109945fR;
import X.C86614Ku;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.TypedValue;

public class WaRoundCornerImageView extends WaImageView {
    public float A00;
    public Path A01;
    public C109945fR A02;
    public boolean A03;

    private void A03(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C100905Cs.A0V);
            try {
                this.A00 = obtainStyledAttributes.getDimension(0, TypedValue.applyDimension(1, 4.0f, C86614Ku.A0E(this)));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.A02 = new C109945fR(this);
    }

    public void onDraw(Canvas canvas) {
        Path path = this.A01;
        if (path != null) {
            canvas.clipPath(path);
        }
        super.onDraw(canvas);
    }

    public WaRoundCornerImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A05();
        A03(context, attributeSet);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalLayoutListener(this.A02);
    }

    public void onDetachedFromWindow() {
        getViewTreeObserver().removeGlobalOnLayoutListener(this.A02);
        super.onDetachedFromWindow();
    }

    public WaRoundCornerImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A05();
        A03(context, attributeSet);
    }

    public WaRoundCornerImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A05();
    }

    public WaRoundCornerImageView(Context context) {
        super(context);
        A05();
        A03(context, (AttributeSet) null);
    }
}
