package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.location.Location;

/* renamed from: X.4Zg  reason: invalid class name */
public class AnonymousClass4Zg extends C110815h5 implements C180308kp {
    public float A00;
    public float A01;
    public float A02;
    public boolean A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final float A09;
    public final float A0A;
    public final Paint A0B = C86604Kt.A0B();
    public final Path A0C = AnonymousClass002.A06();
    public final C157467iL A0D = new C157467iL();
    public final AnonymousClass5ZJ A0E;

    public void A0B(Canvas canvas) {
        Location location = this.A09.A0V.A00;
        if (location != null) {
            float A012 = AnonymousClass001.A01(this.A04, location.getAccuracy(), this.A05);
            Paint paint = this.A0B;
            paint.setColor(-12888163);
            paint.setAlpha((int) ((1.0f - this.A01) * 255.0f));
            C106725a3 r11 = this.A0A;
            C157467iL r7 = this.A0D;
            r11.A07(r7);
            double A013 = C106725a3.A01(location.getLongitude());
            double A002 = C106725a3.A00(location.getLatitude());
            float[] fArr = this.A0C;
            r11.A09(fArr, A013 + ((double) ((int) Math.ceil(r7.A01 - A013))), A002);
            float f = fArr[0];
            float f2 = fArr[1];
            Canvas canvas2 = canvas;
            canvas2.drawCircle(f, f2, A012 * this.A01, paint);
            paint.setColor(-3355444);
            float f3 = this.A09;
            canvas2.drawCircle(f, f2, f3, paint);
            paint.setColor(-1);
            canvas2.drawCircle(f, f2, this.A0A, paint);
            paint.setColor(-12888163);
            paint.setAlpha((int) (this.A00 * 255.0f));
            canvas2.drawCircle(f, f2, this.A00 * this.A08, paint);
            if (location.hasBearing()) {
                canvas2.save();
                float f4 = r11.A00.A0R.A0A;
                if (f4 < 0.0f) {
                    f4 += 360.0f;
                }
                canvas2.rotate(f4 + location.getBearing(), f, f2);
                float f5 = this.A07;
                float f6 = f5 / 2.0f;
                float f7 = f - f6;
                float f8 = f2 - f3;
                Path path = this.A0C;
                path.reset();
                path.moveTo(f7, f8);
                float f9 = this.A06;
                path.lineTo(f6 + f7, f8 - f9);
                path.lineTo(f5 + f7, f8);
                path.lineTo((f5 * 0.5f) + f7, f8 - (f9 * 0.25f));
                C86654Ky.A0z(canvas2, paint, path, f7, f8);
                canvas2.restore();
            }
        }
    }

    public void BMT(AnonymousClass5ZJ r5) {
        float f;
        float f2 = r5.A00;
        this.A01 = f2;
        if (f2 < this.A02) {
            this.A03 = !this.A03;
        }
        if (this.A03) {
            f = 1.0f - ((1.0f - f2) * 0.25f);
        } else {
            f = 1.0f - (0.25f * f2);
        }
        this.A00 = f;
        this.A02 = f2;
        A02();
    }

    public AnonymousClass4Zg(C110885hC r5) {
        super(r5);
        this.A03 = 3;
        this.A02 = 0.0f;
        float f = this.A05;
        this.A08 = 8.0f * f;
        float f2 = 11.0f * f;
        this.A0A = f2;
        this.A09 = f2 + 1.5f;
        this.A07 = 12.0f * f;
        this.A06 = 10.0f * f;
        float f3 = f * 24.0f;
        this.A05 = f3;
        this.A04 = f3 * 2.0f;
        AnonymousClass5ZJ A002 = AnonymousClass5ZJ.A00(0.0f, 1.0f);
        this.A0E = A002;
        A002.A05 = -1;
        A002.A07(this);
        A002.A07 = 2100;
    }
}
