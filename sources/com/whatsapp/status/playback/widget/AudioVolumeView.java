package com.whatsapp.status.playback.widget;

import X.AnonymousClass000;
import X.AnonymousClass002;
import X.AnonymousClass4GJ;
import X.C116855qy;
import X.C162457s7;
import X.C86634Kw;
import X.C86664Kz;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.R;

public final class AudioVolumeView extends View implements AnonymousClass4GJ {
    public float A00;
    public C116855qy A01;
    public boolean A02;
    public final Paint A03;
    public final Path A04;
    public final RectF A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AudioVolumeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
        A00();
        this.A03 = C86664Kz.A0a(1);
        this.A05 = AnonymousClass002.A07();
        this.A04 = AnonymousClass002.A06();
        A01(context);
    }

    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        C162457s7.A0J(canvas2, 0);
        super.onDraw(canvas2);
        float A052 = (float) AnonymousClass000.A05(this, getHeight());
        float f = 1.5f * A052;
        RectF rectF = this.A05;
        float f2 = (float) 2;
        rectF.set(0.0f, (A052 - f) / f2, f, (A052 + f) / f2);
        canvas2.translate((float) getPaddingLeft(), (float) getPaddingTop());
        Paint paint = this.A03;
        float strokeWidth = paint.getStrokeWidth();
        Path path = this.A04;
        path.reset();
        float f3 = (float) 3;
        float f4 = A052 / f3;
        path.moveTo(strokeWidth, f4);
        path.lineTo(f4, f4);
        float f5 = (f2 * A052) / f3;
        path.lineTo(f5, ((float) 0) + strokeWidth);
        path.lineTo(f5, A052 - strokeWidth);
        path.lineTo(f4, f5);
        path.lineTo(strokeWidth, f5);
        path.lineTo(strokeWidth, f4);
        paint.setColor(-1);
        canvas2.drawPath(path, paint);
        canvas2.translate(((-A052) / f2) + strokeWidth, 0.0f);
        for (int i = 0; i < 8; i++) {
            float f6 = this.A00;
            float f7 = (float) 8;
            float f8 = (((float) i) * 1.0f) / f7;
            int i2 = 51;
            if (f6 >= f8) {
                if (f6 > (((float) (i + 1)) * 1.0f) / f7) {
                    i2 = 255;
                } else {
                    i2 = 51 + ((int) (((float) 204) * (f6 - f8) * f7));
                }
            }
            paint.setColor((i2 << 24) | 16777215);
            canvas2.drawArc(rectF, -33.0f, 66.0f, false, paint);
            canvas2.translate(paint.getStrokeWidth() * f3, 0.0f);
        }
    }

    public void A00() {
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public final void A01(Context context) {
        Paint paint = this.A03;
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        C86634Kw.A17(paint);
        paint.setColor(-1);
        paint.setStrokeWidth(context.getResources().getDimension(R.dimen.f6nameremoved));
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A01;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public final void setVolume(float f) {
        this.A00 = f;
        invalidate();
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(((int) (((float) AnonymousClass000.A05(this, getMeasuredHeight())) + (((float) 8) * this.A03.getStrokeWidth() * ((float) 3)) + ((float) getPaddingLeft()) + ((float) getPaddingRight()))) + 1, getMeasuredHeight());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AudioVolumeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
        A00();
        this.A03 = C86664Kz.A0a(1);
        this.A05 = AnonymousClass002.A07();
        this.A04 = AnonymousClass002.A06();
        A01(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AudioVolumeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C162457s7.A0J(context, 1);
        A00();
        this.A03 = C86664Kz.A0a(1);
        this.A05 = AnonymousClass002.A07();
        this.A04 = AnonymousClass002.A06();
        A01(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AudioVolumeView(Context context) {
        super(context);
        C162457s7.A0J(context, 1);
        A00();
        this.A03 = C86664Kz.A0a(1);
        this.A05 = AnonymousClass002.A07();
        this.A04 = AnonymousClass002.A06();
        A01(context);
    }

    public AudioVolumeView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }
}
