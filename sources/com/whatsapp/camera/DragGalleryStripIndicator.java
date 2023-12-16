package com.whatsapp.camera;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass4GJ;
import X.AnonymousClass5YI;
import X.C116855qy;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C86664Kz;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.whatsapp.R;

public class DragGalleryStripIndicator extends View implements AnonymousClass4GJ {
    public float A00;
    public float A01;
    public C116855qy A02;
    public boolean A03;
    public boolean A04;
    public final Paint A05;
    public final Paint A06;
    public final Path A07;

    public void A00() {
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
    }

    public final void A01(Context context) {
        Paint paint = this.A05;
        C86634Kw.A17(paint);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AnonymousClass5YI.A01(context, 2.0f));
        C86624Kv.A0k(getResources(), paint, R.color.f5nameremoved);
        Paint paint2 = this.A06;
        C86634Kw.A17(paint2);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setStrokeWidth(C86604Kt.A00(context) * 4.0f);
        C86624Kv.A0k(getResources(), paint2, R.color.f5nameremoved);
        this.A00 = TypedValue.applyDimension(1, 1.0f, C86614Ku.A0E(this));
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A02;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public void setOffset(float f) {
        this.A01 = f - 1.0f;
        invalidate();
    }

    public void setUpdating(boolean z) {
        this.A04 = z;
        if (z) {
            invalidate();
        }
    }

    public DragGalleryStripIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
        this.A05 = C86664Kz.A0a(1);
        this.A06 = C86664Kz.A0a(1);
        this.A07 = AnonymousClass002.A06();
        this.A01 = 0.0f;
        A01(context);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float paddingLeft = (float) getPaddingLeft();
        float paddingTop = (float) getPaddingTop();
        float A0I = (float) AnonymousClass001.A0I(this);
        float A0H = (float) AnonymousClass001.A0H(this);
        float f = (A0H + paddingTop) / 2.0f;
        float f2 = this.A01;
        float f3 = (((A0H - paddingTop) / 4.0f) * f2) + f;
        float f4 = f + (this.A00 * (-f2));
        Path path = this.A07;
        path.reset();
        path.moveTo(paddingLeft, f4);
        path.lineTo((paddingLeft + A0I) / 2.0f, f3);
        path.lineTo(A0I, f4);
        canvas.drawPath(path, this.A06);
        canvas.drawPath(path, this.A05);
        if (this.A04) {
            invalidate();
        }
    }

    public DragGalleryStripIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        this.A05 = C86664Kz.A0a(1);
        this.A06 = C86664Kz.A0a(1);
        this.A07 = AnonymousClass002.A06();
        this.A01 = 0.0f;
        A01(context);
    }

    public DragGalleryStripIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00();
        this.A05 = C86664Kz.A0a(1);
        this.A06 = C86664Kz.A0a(1);
        this.A07 = AnonymousClass002.A06();
        this.A01 = 0.0f;
        A01(context);
    }

    public DragGalleryStripIndicator(Context context) {
        super(context);
        A00();
        this.A05 = C86664Kz.A0a(1);
        this.A06 = C86664Kz.A0a(1);
        this.A07 = AnonymousClass002.A06();
        this.A01 = 0.0f;
        A01(context);
    }

    public DragGalleryStripIndicator(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }
}
