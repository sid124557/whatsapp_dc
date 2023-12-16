package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* renamed from: X.4Ze  reason: invalid class name */
public class AnonymousClass4Ze extends C110815h5 {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public Bitmap A08;
    public final float A09;

    public AnonymousClass4Ze(C110885hC r16) {
        super(r16);
        float f = this.A05;
        float f2 = f * 12.0f;
        this.A05 = f2;
        this.A00 = 0.4f * f;
        float f3 = 16.0f * f;
        this.A03 = f3;
        this.A06 = f2;
        this.A07 = 4.8f * f;
        this.A04 = 1.6f * f;
        this.A09 = f * 44.0f;
        this.A03 = 5;
        this.A02 = 1.0f;
        int ceil = (int) Math.ceil((double) (f3 * 1.08f * 2.0f));
        Bitmap createBitmap = Bitmap.createBitmap(ceil, ceil, Bitmap.Config.ARGB_8888);
        this.A08 = createBitmap;
        Canvas A062 = AnonymousClass4L0.A06(createBitmap);
        float f4 = ((float) ceil) / 2.0f;
        float f5 = this.A04;
        float f6 = f4 - f5;
        float f7 = f5 + f4;
        RectF rectF = new RectF(f6, f6, f7, f7);
        float f8 = 1.08f * this.A03;
        RadialGradient radialGradient = new RadialGradient(f4, f4, f8, new int[]{570425344, 570425344, 0}, new float[]{0.9259259f, 0.9259259f, 1.0f}, Shader.TileMode.CLAMP);
        Path A063 = AnonymousClass002.A06();
        Paint A0a = C86664Kz.A0a(1);
        Paint.Style style = Paint.Style.FILL;
        A0a.setStyle(style);
        A0a.setShader(radialGradient);
        A062.drawCircle(f4, f4, f8, A0a);
        A0a.reset();
        A0a.setFlags(1);
        A0a.setStyle(style);
        A0a.setColor(-2046820353);
        A062.drawCircle(f4, f4, this.A03, A0a);
        C86634Kw.A17(A0a);
        A0a.setColor(-6118750);
        A0a.setStrokeWidth(this.A00);
        A062.drawCircle(f4, f4, this.A03, A0a);
        A0a.setFlags(1);
        A0a.setStyle(style);
        A0a.setColor(-1365724);
        A063.reset();
        A063.moveTo(f4 - this.A07, f4);
        A063.lineTo(f4 - this.A04, f4);
        A063.addArc(rectF, 180.0f, 90.0f);
        A063.lineTo(f4, f4 - this.A06);
        C86654Ky.A0z(A062, A0a, A063, f4 - this.A07, f4);
        A0a.setStyle(style);
        A0a.setColor(-2811114);
        A063.reset();
        A063.moveTo(this.A07 + f4, f4);
        A063.lineTo(this.A04 + f4, f4);
        A063.addArc(rectF, 0.0f, -90.0f);
        A063.lineTo(f4, f4 - this.A06);
        C86654Ky.A0z(A062, A0a, A063, this.A07 + f4, f4);
        AnonymousClass001.A10(A0a);
        A0a.setColor(-4013374);
        A063.reset();
        A063.moveTo(f4 - this.A07, f4);
        A063.lineTo(f4 - this.A04, f4);
        A063.addArc(rectF, 180.0f, -90.0f);
        A063.lineTo(f4, this.A06 + f4);
        C86654Ky.A0z(A062, A0a, A063, f4 - this.A07, f4);
        AnonymousClass001.A10(A0a);
        A0a.setColor(-2434342);
        A063.reset();
        A063.moveTo(this.A07 + f4, f4);
        A063.lineTo(this.A04 + f4, f4);
        A063.addArc(rectF, 0.0f, 90.0f);
        A063.lineTo(f4, this.A06 + f4);
        C86654Ky.A0z(A062, A0a, A063, this.A07 + f4, f4);
    }

    public void A0B(Canvas canvas) {
        canvas.save();
        float f = this.A09.A0S.A00.A0R.A0A;
        if (f < 0.0f) {
            f += 360.0f;
        }
        canvas.rotate(f, this.A01, this.A02);
        Bitmap bitmap = this.A08;
        float f2 = this.A01;
        float f3 = this.A03;
        canvas.drawBitmap(bitmap, f2 - f3, this.A02 - f3, (Paint) null);
        canvas.restore();
    }
}
