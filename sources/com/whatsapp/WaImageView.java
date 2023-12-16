package com.whatsapp;

import X.AnonymousClass4SX;
import X.AnonymousClass79W;
import X.C102805Ki;
import X.C620733j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;

public class WaImageView extends AnonymousClass4SX {
    public C620733j A00;
    public boolean A01;

    public final void A06(Context context, AttributeSet attributeSet) {
        if (attributeSet != null && this.A00 != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass79W.A03);
            int resourceId = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId != 0) {
                setContentDescription(this.A00.A0B(resourceId));
            }
            this.A01 = obtainStyledAttributes.getBoolean(2, false);
            obtainStyledAttributes.recycle();
        }
    }

    public void onDraw(Canvas canvas) {
        boolean z;
        C620733j r0;
        if (!this.A01 || (r0 = this.A00) == null) {
            z = false;
        } else {
            z = C102805Ki.A00(r0);
            if (z) {
                canvas.save();
                canvas.scale(-1.0f, 1.0f, ((float) super.getWidth()) * 0.5f, ((float) super.getHeight()) * 0.5f);
            }
        }
        super.onDraw(canvas);
        if (this.A01 && z) {
            canvas.restore();
        }
    }

    public WaImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A06(context, attributeSet);
    }

    public void setMirrorForRtl(boolean z) {
        this.A01 = z;
    }

    public WaImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A06(context, attributeSet);
    }

    public WaImageView(Context context) {
        super(context);
    }
}
