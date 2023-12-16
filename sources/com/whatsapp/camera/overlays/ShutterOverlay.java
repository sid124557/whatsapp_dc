package com.whatsapp.camera.overlays;

import X.AnonymousClass4GJ;
import X.AnonymousClass4L0;
import X.C116855qy;
import X.C86604Kt;
import X.C86634Kw;
import X.C86664Kz;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.R;

public class ShutterOverlay extends View implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;
    public boolean A02;
    public final Paint A03;

    public void A00() {
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public final void A01(Context context) {
        Paint paint = this.A03;
        paint.setStrokeWidth(context.getResources().getDimension(R.dimen.f6nameremoved));
        C86634Kw.A17(paint);
        paint.setColor(-1);
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A00;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public void onDraw(Canvas canvas) {
        if (this.A02) {
            canvas.drawRect(0.0f, 0.0f, AnonymousClass4L0.A00(this), C86664Kz.A02(this), this.A03);
        }
    }

    public ShutterOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
        this.A03 = C86604Kt.A0B();
        A01(context);
    }

    public ShutterOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        this.A03 = C86604Kt.A0B();
        A01(context);
    }

    public ShutterOverlay(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00();
        this.A03 = C86604Kt.A0B();
        A01(context);
    }

    public ShutterOverlay(Context context) {
        super(context);
        A00();
        this.A03 = C86604Kt.A0B();
        A01(context);
    }

    public ShutterOverlay(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }
}
