package X;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: X.4Zf  reason: invalid class name */
public class AnonymousClass4Zf extends C110815h5 {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public boolean A0D;
    public final Paint A0E = C86604Kt.A0B();

    public void A0B(Canvas canvas) {
        C110885hC r1 = this.A09;
        float A002 = AnonymousClass4L0.A00(r1.A0R);
        float f = this.A08;
        float f2 = (A002 - f) - ((float) r1.A05);
        this.A04 = f2;
        float f3 = f + ((float) r1.A06);
        this.A06 = f3;
        float f4 = this.A05;
        float f5 = f4 / 2.0f;
        this.A01 = f2 - f5;
        this.A02 = f3 + f5;
        float f6 = this.A09;
        this.A0C = this.A0A + f6;
        Paint paint = this.A0E;
        AnonymousClass001.A10(paint);
        int i = -1;
        if (this.A0D) {
            i = -2236963;
        }
        paint.setColor(i);
        paint.setAlpha(230);
        float f7 = this.A04;
        float f8 = this.A06;
        Canvas canvas2 = canvas;
        canvas2.drawRect(f7 - f4, f8, f7, f8 + f4, paint);
        paint.setColor(-7829368);
        canvas.drawCircle(this.A01, this.A02, this.A07, paint);
        C86634Kw.A17(paint);
        paint.setStrokeWidth(this.A0B);
        canvas.drawCircle(this.A01, this.A02, f6, paint);
        float f9 = this.A01;
        float f10 = this.A02;
        canvas2.drawLine(f9, f10 - f6, f9, f10 - this.A0C, paint);
        float f11 = this.A01;
        float f12 = this.A02;
        canvas2.drawLine(f11, f12 + f6, f11, f12 + this.A0C, paint);
        float f13 = this.A01;
        float f14 = this.A02;
        canvas2.drawLine(f13 - f6, f14, f13 - this.A0C, f14, paint);
        float f15 = this.A01;
        float f16 = this.A02;
        canvas2.drawLine(f15 + f6, f16, f15 + this.A0C, f16, paint);
        paint.setStrokeWidth(this.A00);
        paint.setColor(-3355444);
        float f17 = this.A04;
        float f18 = this.A06;
        canvas2.drawRect(f17 - f4, f18, f17, f18 + f4, paint);
    }

    public AnonymousClass4Zf(C110885hC r6) {
        super(r6);
        float f = this.A05;
        this.A08 = 12.0f * f;
        float f2 = 37.0f * f;
        this.A05 = f2;
        this.A00 = 0.5f * f;
        this.A0B = f * 2.0f;
        this.A07 = 5.0f * f;
        this.A09 = 8.0f * f;
        this.A0A = f * 3.0f;
        this.A03 = 5;
        this.A02 = 3.0f;
        this.A03 = ((f * 48.0f) - f2) / 2.0f;
    }
}
