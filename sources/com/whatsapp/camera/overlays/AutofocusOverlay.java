package com.whatsapp.camera.overlays;

import X.AnonymousClass4GJ;
import X.C116855qy;
import X.C71553cI;
import X.C86604Kt;
import X.C86634Kw;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.R;

public class AutofocusOverlay extends View implements AnonymousClass4GJ {
    public float A00;
    public RectF A01;
    public C116855qy A02;
    public Boolean A03;
    public boolean A04;
    public boolean A05;
    public final Paint A06;
    public final Runnable A07;

    public void A00() {
        if (!this.A05) {
            this.A05 = true;
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

    public void onDraw(Canvas canvas) {
        Paint paint;
        int i;
        if (!this.A04) {
            Boolean bool = this.A03;
            if (bool == null) {
                paint = this.A06;
                i = -1;
            } else {
                Boolean bool2 = Boolean.TRUE;
                paint = this.A06;
                i = -65536;
                if (bool == bool2) {
                    i = -16711936;
                }
            }
            paint.setColor(i);
        }
        boolean z = this.A04;
        RectF rectF = this.A01;
        if (z) {
            float f = this.A00 / 2.0f;
            canvas.drawRoundRect(rectF, f, f, this.A06);
            return;
        }
        canvas.drawRect(rectF, this.A06);
    }

    public AutofocusOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
        this.A06 = C86604Kt.A0B();
        this.A07 = new C71553cI((Object) this, 3);
        A01();
    }

    public final void A01() {
        this.A00 = getResources().getDimension(R.dimen.f6nameremoved);
        Paint paint = this.A06;
        paint.setStrokeWidth(getResources().getDimension(R.dimen.f6nameremoved));
        C86634Kw.A17(paint);
        paint.setColor(-1);
    }

    public AutofocusOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        this.A06 = C86604Kt.A0B();
        this.A07 = new C71553cI((Object) this, 3);
        A01();
    }

    public AutofocusOverlay(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00();
        this.A06 = C86604Kt.A0B();
        this.A07 = new C71553cI((Object) this, 3);
        A01();
    }

    public AutofocusOverlay(Context context) {
        super(context);
        A00();
        this.A06 = C86604Kt.A0B();
        this.A07 = new C71553cI((Object) this, 3);
        A01();
    }

    public AutofocusOverlay(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }
}
