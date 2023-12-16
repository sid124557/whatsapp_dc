package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass107;
import X.AnonymousClass79H;
import X.C15910sA;
import X.C15930sC;
import X.C185058sz;
import X.C71333bw;
import X.C86614Ku;
import X.C86634Kw;
import X.C86664Kz;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.R;

public class MediaProgressRing extends View {
    public float A00;
    public Paint A01;
    public RectF A02;
    public C15930sC A03;
    public C185058sz A04;
    public Runnable A05;
    public boolean A06;

    public void A01(C15910sA r4, C185058sz r5) {
        Runnable runnable = this.A05;
        if (runnable != null) {
            runnable.run();
        }
        this.A04 = r5;
        AnonymousClass107 BCx = r5.BCx();
        BCx.A0B(r4, this.A03);
        this.A05 = new C71333bw(this, 32, BCx);
    }

    public int getColor() {
        return this.A01.getColor();
    }

    public void onDraw(Canvas canvas) {
        float value;
        C185058sz r0 = this.A04;
        if (r0 != null) {
            int B9O = r0.B9O();
            if (B9O == 0) {
                value = 0.0f;
            } else {
                value = ((float) this.A04.getValue()) / ((float) B9O);
            }
            canvas.drawArc(this.A02, -90.0f, value * 360.0f, false, this.A01);
            if (this.A06) {
                postInvalidateOnAnimation();
            }
        }
    }

    public void setColor(int i) {
        this.A01.setColor(i);
    }

    public MediaProgressRing(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C86614Ku.A1Q(this);
        A00(attributeSet);
    }

    public final void A00(AttributeSet attributeSet) {
        Context context = getContext();
        this.A00 = C86664Kz.A01(context.getResources(), R.dimen.f6nameremoved);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass79H.A02);
            setColor(obtainStyledAttributes.getColor(0, -16777216));
            obtainStyledAttributes.recycle();
        }
        Paint paint = this.A01;
        paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.BUTT);
        C86634Kw.A17(paint);
        paint.setStrokeWidth(this.A00);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        RectF rectF = this.A02;
        rectF.set(0.0f, 0.0f, (float) i, (float) i2);
        float f = this.A00 / 2.0f;
        rectF.inset(f, f);
    }

    public MediaProgressRing(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C86614Ku.A1Q(this);
        A00(attributeSet);
    }

    public MediaProgressRing(Context context) {
        super(context);
        C86614Ku.A1Q(this);
        A00((AttributeSet) null);
    }
}
