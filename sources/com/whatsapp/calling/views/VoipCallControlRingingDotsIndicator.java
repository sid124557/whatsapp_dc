package com.whatsapp.calling.views;

import X.AnonymousClass4GJ;
import X.C116855qy;
import X.C86604Kt;
import X.C86614Ku;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.R;

public class VoipCallControlRingingDotsIndicator extends View implements AnonymousClass4GJ {
    public int A00;
    public int A01;
    public C116855qy A02;
    public boolean A03;
    public final Paint A04;
    public final float[] A05;

    public void A00() {
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A02;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public VoipCallControlRingingDotsIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
        this.A05 = new float[3];
        this.A04 = C86604Kt.A0B();
        A01(context);
    }

    public final void A01(Context context) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A01 = dimensionPixelSize;
        this.A00 = dimensionPixelSize * 2;
        C86614Ku.A10(getContext(), this.A04, 17170443);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = 0;
        do {
            Paint paint = this.A04;
            paint.setAlpha((int) (this.A05[i] * 255.0f));
            int i2 = this.A01;
            float f = (float) i2;
            canvas.drawCircle((float) ((this.A00 * 2 * i) + i2), f, f, paint);
            i++;
        } while (i < 3);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.A00;
        setMeasuredDimension(i3 * 5, i3);
    }

    public VoipCallControlRingingDotsIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        this.A05 = new float[3];
        this.A04 = C86604Kt.A0B();
        A01(context);
    }

    public VoipCallControlRingingDotsIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00();
        this.A05 = new float[3];
        this.A04 = C86604Kt.A0B();
        A01(context);
    }

    public VoipCallControlRingingDotsIndicator(Context context) {
        super(context);
        A00();
        this.A05 = new float[3];
        this.A04 = C86604Kt.A0B();
        A01(context);
    }

    public VoipCallControlRingingDotsIndicator(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }
}
