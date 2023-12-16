package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: X.0Bs  reason: invalid class name and case insensitive filesystem */
public class C01660Bs extends C09320g0 {
    public C04850Qx A00;
    public final Paint A01;
    public final Path A02;
    public final RectF A03 = AnonymousClass002.A07();
    public final C04510Oo A04;
    public final float[] A05;

    public void A07(Canvas canvas, Matrix matrix, int i) {
        int A032;
        C04510Oo r2 = this.A04;
        int alpha = Color.alpha(r2.A04);
        if (alpha != 0) {
            C04850Qx r0 = this.A0L.A02;
            if (r0 == null) {
                A032 = 100;
            } else {
                A032 = C04850Qx.A03(r0);
            }
            int i2 = (int) ((((float) i) / 255.0f) * (((((float) alpha) / 255.0f) * ((float) A032)) / 100.0f) * 255.0f);
            Paint paint = this.A01;
            paint.setAlpha(i2);
            AnonymousClass001.A11(paint, this.A00);
            if (i2 > 0) {
                float[] fArr = this.A05;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                float f = (float) r2.A06;
                fArr[2] = f;
                fArr[3] = 0.0f;
                fArr[4] = f;
                float f2 = (float) r2.A05;
                fArr[5] = f2;
                fArr[6] = 0.0f;
                fArr[7] = f2;
                matrix.mapPoints(fArr);
                Path path = this.A02;
                path.reset();
                path.moveTo(fArr[0], fArr[1]);
                path.lineTo(fArr[2], fArr[3]);
                path.lineTo(fArr[4], fArr[5]);
                path.lineTo(fArr[6], fArr[7]);
                path.lineTo(fArr[0], fArr[1]);
                path.close();
                canvas.drawPath(path, paint);
            }
        }
    }

    public C01660Bs(AnonymousClass01G r3, C04510Oo r4) {
        super(r3, r4);
        AnonymousClass00u r1 = new AnonymousClass00u();
        this.A01 = r1;
        this.A05 = new float[8];
        this.A02 = AnonymousClass002.A06();
        this.A04 = r4;
        r1.setAlpha(0);
        AnonymousClass001.A10(r1);
        r1.setColor(r4.A04);
    }

    public void Aws(C05560Tz r3, Object obj) {
        AnonymousClass0BZ r1;
        super.Aws(r3, obj);
        if (obj == C17150ue.A00) {
            if (r3 == null) {
                r1 = null;
            } else {
                r1 = new AnonymousClass0BZ(r3, (Object) null);
            }
            this.A00 = r1;
        }
    }

    public void B4p(Matrix matrix, RectF rectF, boolean z) {
        super.B4p(matrix, rectF, z);
        RectF rectF2 = this.A03;
        C04510Oo r1 = this.A04;
        rectF2.set(0.0f, 0.0f, (float) r1.A06, (float) r1.A05);
        this.A08.mapRect(rectF2);
        rectF.set(rectF2);
    }
}
