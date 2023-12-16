package com.whatsapp.qrcode;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0AQ;
import X.AnonymousClass0Y8;
import X.AnonymousClass34K;
import X.AnonymousClass4GJ;
import X.C100895Cr;
import X.C116855qy;
import X.C125056Ez;
import X.C626936e;
import X.C86604Kt;
import X.C86634Kw;
import X.C86664Kz;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.R;

public class QrScannerOverlay extends View implements AnonymousClass4GJ {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public Drawable A04;
    public C125056Ez A05;
    public C116855qy A06;
    public String A07;
    public boolean A08;
    public final float A09;
    public final float A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final Paint A0E;
    public final Paint A0F;
    public final Rect A0G;
    public final RectF A0H;

    public final Object generatedComponent() {
        C116855qy r0 = this.A06;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A06 = r0;
        }
        return r0.generatedComponent();
    }

    public void onDraw(Canvas canvas) {
        int A062 = AnonymousClass000.A06(this, getWidth());
        int A052 = AnonymousClass000.A05(this, getHeight());
        int min = (Math.min(A062, A052) * 3) / 4;
        int A0F2 = C86664Kz.A0F(this, (A062 - min) / 2);
        int paddingTop = ((A052 - min) / 2) + getPaddingTop();
        int i = A0F2 + min;
        int i2 = min + paddingTop;
        float f = this.A01;
        float f2 = this.A00;
        float f3 = f + f2;
        this.A01 = f3;
        if (f3 > 1.0f || f3 < 0.0f) {
            if (f3 > 1.0f) {
                this.A01 = 1.0f;
            } else {
                this.A01 = 0.0f;
            }
            this.A00 = -f2;
        }
        Canvas canvas2 = canvas;
        canvas2.drawColor(this.A0B);
        RectF rectF = this.A0H;
        float f4 = (float) A0F2;
        float f5 = (float) paddingTop;
        float f6 = (float) i2;
        rectF.set(f4, f5, (float) i, f6);
        if (this.A0D == 0) {
            canvas2.drawArc(rectF, 0.0f, 360.0f, true, this.A0F);
            Paint paint = this.A0E;
            C86634Kw.A17(paint);
            paint.setColor(this.A0C);
            paint.setAlpha(127);
            float f7 = this.A0A * 2.0f;
            paint.setStrokeWidth(f7);
            int i3 = (int) (f5 + f7);
            i2 = (int) (f6 - f7);
            float f8 = this.A01;
            float f9 = (f8 * 2.0f) - 1.0f;
            float f10 = (float) ((A0F2 + i) / 2);
            float sqrt = (((float) (i - A0F2)) * ((float) Math.sqrt((double) (1.0f - (f9 * f9))))) / 2.0f;
            float f11 = (((float) (i2 - i3)) * f8) + ((float) i3);
            canvas2.drawLine(f10 - sqrt, f11, sqrt + f10, f11, paint);
        } else {
            float f12 = this.A09;
            canvas2.drawRoundRect(rectF, f12, f12, this.A0F);
            Drawable drawable = this.A04;
            drawable.setAlpha((int) (this.A01 * 255.0f));
            canvas2.save();
            canvas2.translate(f4, f5);
            drawable.draw(canvas2);
            canvas2.translate((float) (i - A0F2), 0.0f);
            canvas2.rotate(90.0f);
            drawable.draw(canvas2);
            canvas2.rotate(-90.0f);
            canvas2.translate(0.0f, (float) (i2 - paddingTop));
            canvas2.rotate(180.0f);
            drawable.draw(canvas2);
            canvas2.rotate(-180.0f);
            canvas2.translate((float) (A0F2 - i), 0.0f);
            canvas2.rotate(270.0f);
            drawable.draw(canvas2);
            canvas2.restore();
        }
        String str = this.A07;
        if (str != null) {
            Paint paint2 = this.A0E;
            C86604Kt.A0u(-1, paint2);
            paint2.setTextSize((float) this.A02);
            int length = str.length();
            Rect rect = this.A0G;
            paint2.getTextBounds(str, 0, length, rect);
            canvas2.drawText(str, ((float) (A062 - rect.width())) / 2.0f, (float) (i2 + this.A03 + (rect.height() / 2)), paint2);
        }
    }

    public QrScannerOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A08) {
            this.A08 = true;
            generatedComponent();
        }
        this.A0E = C86664Kz.A0a(1);
        this.A0G = AnonymousClass001.A0N();
        this.A0H = AnonymousClass002.A07();
        this.A01 = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C100895Cr.A06);
        int i2 = obtainStyledAttributes.getInt(0, 1);
        this.A0D = i2;
        int resourceId = obtainStyledAttributes.getResourceId(1, 0);
        if (resourceId != 0) {
            this.A07 = context.getString(resourceId);
            this.A02 = obtainStyledAttributes.getDimensionPixelSize(2, 0);
            this.A03 = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        }
        obtainStyledAttributes.recycle();
        this.A0A = getResources().getDimension(R.dimen.f6nameremoved);
        this.A09 = getResources().getDimension(R.dimen.f6nameremoved);
        this.A0C = AnonymousClass0Y8.A04(context, AnonymousClass34K.A01(context, R.attr.f3nameremoved));
        this.A0B = AnonymousClass0Y8.A04(context, R.color.f5nameremoved);
        if (i2 == 1) {
            this.A00 = 0.0125f;
            AnonymousClass0AQ A032 = AnonymousClass0AQ.A03((Resources.Theme) null, getResources(), R.drawable.vec_ic_qr_frame);
            C626936e.A06(A032);
            this.A04 = A032;
            A032.setBounds(0, 0, A032.getIntrinsicWidth(), this.A04.getIntrinsicHeight());
        } else {
            this.A00 = 0.01f;
        }
        Paint A0a = C86664Kz.A0a(1);
        this.A0F = A0a;
        C86634Kw.A18(A0a, PorterDuff.Mode.CLEAR);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C125056Ez r2 = new C125056Ez(this);
        this.A05 = r2;
        r2.setDuration(2000);
        this.A05.setRepeatCount(-1);
        this.A05.setRepeatMode(2);
        startAnimation(this.A05);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearAnimation();
    }

    public void onVisibilityChanged(View view, int i) {
        C125056Ez r0;
        if (getVisibility() != 0) {
            clearAnimation();
        } else if (getAnimation() == null && (r0 = this.A05) != null) {
            startAnimation(r0);
        }
    }

    public QrScannerOverlay(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public QrScannerOverlay(Context context) {
        this(context, (AttributeSet) null);
    }
}
