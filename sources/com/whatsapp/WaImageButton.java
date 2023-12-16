package com.whatsapp;

import X.AnonymousClass6G0;
import X.AnonymousClass79W;
import X.C620733j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;

public class WaImageButton extends AnonymousClass6G0 {
    public C620733j A00;
    public boolean A01;

    public final void A01(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass79W.A02);
            int resourceId = obtainStyledAttributes.getResourceId(1, 0);
            if (!isInEditMode() && resourceId != 0) {
                setContentDescription(this.A00.A0B(resourceId));
            }
            this.A01 = obtainStyledAttributes.getBoolean(2, false);
            obtainStyledAttributes.recycle();
        }
    }

    public void onDraw(Canvas canvas) {
        boolean z;
        if (this.A01) {
            z = this.A00.A0U();
            if (z) {
                canvas.save();
                canvas.scale(-1.0f, 1.0f, ((float) super.getWidth()) * 0.5f, ((float) super.getHeight()) * 0.5f);
            }
        } else {
            z = false;
        }
        super.onDraw(canvas);
        if (this.A01 && z) {
            canvas.restore();
        }
    }

    public WaImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01(context, attributeSet);
    }

    public WaImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01(context, attributeSet);
    }

    public WaImageButton(Context context) {
        super(context);
    }
}
