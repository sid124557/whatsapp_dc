package com.whatsapp.status;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass4L0;
import X.C1459377w;
import X.C162457s7;
import X.C18300x5;
import X.C86634Kw;
import X.C86664Kz;
import X.C91814l8;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.whatsapp.R;
import java.util.Map;

public class ContactStatusThumbnail extends C91814l8 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public final RectF A05 = AnonymousClass002.A07();
    public final Map A06 = AnonymousClass001.A0t();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactStatusThumbnail(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
        A03(context, attributeSet);
    }

    public void A07(Canvas canvas) {
        int i;
        Canvas canvas2 = canvas;
        C162457s7.A0J(canvas2, 0);
        if (this.A02 > 0) {
            this.A05.setStrokeWidth(this.A01);
            C86634Kw.A17(this.A05);
            this.A05.setStrokeCap(Paint.Cap.ROUND);
            RectF rectF = this.A05;
            float f = 0.0f;
            rectF.set(0.0f, 0.0f, AnonymousClass4L0.A00(this), C86664Kz.A02(this));
            float f2 = (float) 2;
            float f3 = this.A01 / f2;
            rectF.inset(f3, f3);
            this.A05.setColor(this.A00);
            canvas2.drawOval(rectF, this.A05);
            int i2 = this.A02;
            float f4 = 360.0f / ((float) i2);
            if (i2 != 1) {
                if (f4 <= 24.0f) {
                    f = f4 / 2.0f;
                } else {
                    f = 12.0f;
                }
            }
            this.A05.setStrokeWidth(this.A01 - ((float) 1));
            int i3 = this.A02;
            float f5 = -90.0f;
            for (int i4 = 0; i4 < i3; i4++) {
                Paint paint = this.A05;
                Map map = this.A06;
                if (map.containsKey(Integer.valueOf(i4))) {
                    Object A0i = AnonymousClass001.A0i(map, i4);
                    if (A0i != null) {
                        i = AnonymousClass001.A0K(A0i);
                    } else {
                        throw C18300x5.A0X();
                    }
                } else if (i4 < this.A04) {
                    i = this.A03;
                } else {
                    i = this.A01;
                }
                paint.setColor(i);
                canvas2.drawArc(rectF, f5 + (f / f2), f4 - f, false, this.A05);
                f5 += f4;
            }
        }
    }

    private final void A03(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1459377w.A00);
            C162457s7.A0D(obtainStyledAttributes);
            this.A01 = obtainStyledAttributes.getInteger(1, 0);
            this.A03 = obtainStyledAttributes.getInteger(2, 0);
            obtainStyledAttributes.recycle();
        }
        this.A00 = C18300x5.A03(context, R.attr.f3nameremoved, R.color.f5nameremoved);
    }

    public void A08(int i, int i2) {
        this.A04 = i;
        this.A02 = i2;
        invalidate();
    }

    public final int getTotalCount() {
        return this.A02;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactStatusThumbnail(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
        A03(context, attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactStatusThumbnail(Context context) {
        super(context);
        C162457s7.A0J(context, 1);
        A03(context, (AttributeSet) null);
    }
}
