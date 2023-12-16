package com.whatsapp.camera.overlays;

import X.AnonymousClass002;
import X.AnonymousClass4GJ;
import X.C116855qy;
import X.C71553cI;
import X.C86634Kw;
import X.C86654Ky;
import X.C86664Kz;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.R;

public class ZoomOverlay extends View implements AnonymousClass4GJ {
    public float A00;
    public C116855qy A01;
    public String A02;
    public boolean A03;
    public final Paint A04;
    public final RectF A05;
    public final TextPaint A06;
    public final Runnable A07;

    public void A00() {
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
    }

    public final void A01(Context context) {
        Paint paint = this.A04;
        paint.setStrokeWidth(context.getResources().getDimension(R.dimen.f6nameremoved));
        C86634Kw.A17(paint);
        TextPaint textPaint = this.A06;
        textPaint.setTextSize(context.getResources().getDimension(R.dimen.f6nameremoved));
        textPaint.setColor(-1711276033);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setFakeBoldText(true);
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A01;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public ZoomOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
        this.A05 = AnonymousClass002.A07();
        this.A04 = C86664Kz.A0a(1);
        this.A06 = new TextPaint(1);
        this.A07 = new C71553cI((Object) this, 5);
        A01(context);
    }

    public float getMaxScale() {
        return (((float) Math.min(C86664Kz.A0B(this), C86654Ky.A04(this))) * 0.9f) / this.A06.measureText("x00.0");
    }

    public void onDraw(Canvas canvas) {
        int A0B = C86664Kz.A0B(this);
        int A042 = C86654Ky.A04(this);
        float min = ((float) Math.min(A0B, A042)) * 0.9f;
        Paint paint = this.A04;
        paint.setColor(-1711276033);
        RectF rectF = this.A05;
        float f = (float) A0B;
        float f2 = (float) A042;
        rectF.set(f - min, f2 - min, f + min, f2 + min);
        canvas.drawOval(rectF, paint);
        String str = this.A02;
        if (str != null) {
            TextPaint textPaint = this.A06;
            canvas.drawText(str, f, f2 - ((textPaint.descent() + textPaint.ascent()) / 2.0f), textPaint);
        }
        float measureText = this.A06.measureText("x00.0");
        rectF.set(f - measureText, f2 - measureText, f + measureText, f2 + measureText);
        canvas.drawOval(rectF, paint);
        float min2 = Math.min(min, measureText * this.A00);
        paint.setColor(-13388315);
        rectF.set(f - min2, f2 - min2, f + min2, f2 + min2);
        canvas.drawOval(rectF, paint);
    }

    public ZoomOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        this.A05 = AnonymousClass002.A07();
        this.A04 = C86664Kz.A0a(1);
        this.A06 = new TextPaint(1);
        this.A07 = new C71553cI((Object) this, 5);
        A01(context);
    }

    public ZoomOverlay(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00();
        this.A05 = AnonymousClass002.A07();
        this.A04 = C86664Kz.A0a(1);
        this.A06 = new TextPaint(1);
        this.A07 = new C71553cI((Object) this, 5);
        A01(context);
    }

    public ZoomOverlay(Context context) {
        super(context);
        A00();
        this.A05 = AnonymousClass002.A07();
        this.A04 = C86664Kz.A0a(1);
        this.A06 = new TextPaint(1);
        this.A07 = new C71553cI((Object) this, 5);
        A01(context);
    }

    public ZoomOverlay(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }
}
