package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: X.016  reason: invalid class name */
public class AnonymousClass016 extends Drawable {
    public final float A00;
    public final int A01;
    public final Paint A02;
    public final Paint A03;
    public final Path A04 = AnonymousClass002.A06();
    public final C04330Nu A05;
    public final C04330Nu A06;
    public final C04330Nu A07;
    public final AnonymousClass0MV A08;

    public void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        int save = canvas.save();
        try {
            if (this.A00 != 0.0f) {
                canvas.clipPath(this.A04);
            }
            canvas.drawColor(this.A01);
            int height = getBounds().height();
            int width = getBounds().width();
            float f = (float) width;
            canvas2.drawRect(0.0f, 0.0f, f, (float) height, this.A02);
            canvas.drawCircle(f, 0.0f, (float) ((int) Math.sqrt((double) ((((float) (width * width)) / 4.0f) + (((float) (height * height)) / 4.0f)))), this.A03);
            AnonymousClass0MV r0 = this.A08;
            canvas.drawPath(r0.A01, r0.A00);
            C04330Nu r02 = this.A06;
            canvas.drawPath(r02.A01, r02.A00);
            C04330Nu r03 = this.A05;
            canvas.drawPath(r03.A01, r03.A00);
            C04330Nu r04 = this.A07;
            canvas.drawPath(r04.A01, r04.A00);
        } catch (Exception unused) {
            C159737mN.A01("CDSHarmonizationCompanyGradientDrawable", "Exception when drawing CDSHarmonizationCompanyGradientDrawable");
        } catch (Throwable th) {
            canvas.restoreToCount(save);
            throw th;
        }
        canvas.restoreToCount(save);
    }

    public int getOpacity() {
        return -3;
    }

    public void onBoundsChange(Rect rect) {
        Rect rect2 = rect;
        super.onBoundsChange(rect2);
        float f = this.A00;
        if (f > 0.0f) {
            Path path = this.A04;
            path.reset();
            path.addRoundRect(new RectF(rect2), f, f, Path.Direction.CW);
            path.close();
        }
        int height = rect2.height();
        int width = rect2.width();
        float f2 = (float) height;
        float f3 = (float) width;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.A02.setShader(new LinearGradient(0.0f, f2, f3, 0.0f, -16751392, -16743685, tileMode));
        float f4 = f3 * -0.333f;
        float f5 = -0.333f * f2;
        float f6 = f3 * 1.333f;
        float f7 = 1.333f * f2;
        AnonymousClass0MV r10 = this.A08;
        AnonymousClass0LO r9 = r10.A03;
        r9.A00 = f6;
        r9.A01 = f7;
        AnonymousClass0LO r6 = r10.A04;
        r6.A00 = f6;
        r6.A01 = 0.55f * f2;
        AnonymousClass0LO r5 = r10.A02;
        r5.A00 = -0.37f * f3;
        r5.A01 = f7;
        C04330Nu r4 = this.A07;
        AnonymousClass0LO r2 = r4.A05;
        r2.A00 = f4;
        r2.A01 = f5;
        AnonymousClass0LO r3 = r4.A06;
        r3.A00 = 0.032f * f3;
        r3.A01 = f5;
        AnonymousClass0LO r32 = r4.A04;
        r32.A00 = f4;
        r32.A01 = 1.078f * f2;
        AnonymousClass0LO r33 = r4.A02;
        r33.A00 = 0.122f * f3;
        r33.A01 = 0.415f * f2;
        AnonymousClass0LO r34 = r4.A03;
        r34.A00 = -0.01f * f3;
        r34.A01 = 0.753f * f2;
        C04330Nu r35 = this.A05;
        AnonymousClass0LO r22 = r35.A05;
        r22.A00 = f4;
        r22.A01 = f5;
        AnonymousClass0LO r12 = r35.A06;
        r12.A00 = 0.19f * f3;
        r12.A01 = f5;
        AnonymousClass0LO r122 = r35.A04;
        r122.A00 = f4;
        r122.A01 = 1.087f * f2;
        AnonymousClass0LO r123 = r35.A02;
        r123.A00 = 0.197f * f3;
        r123.A01 = 0.473f * f2;
        AnonymousClass0LO r124 = r35.A03;
        r124.A00 = 0.025f * f3;
        r124.A01 = 0.803f * f2;
        C04330Nu r23 = this.A06;
        AnonymousClass0LO r125 = r23.A05;
        r125.A00 = f4;
        r125.A01 = f5;
        AnonymousClass0LO r15 = r23.A06;
        r15.A00 = 0.355f * f3;
        r15.A01 = f5;
        AnonymousClass0LO r14 = r23.A04;
        r14.A00 = f4;
        r14.A01 = 1.043f * f2;
        AnonymousClass0LO r13 = r23.A02;
        r13.A00 = 0.27f * f3;
        r13.A01 = 0.49f * f2;
        AnonymousClass0LO r132 = r23.A03;
        r132.A00 = 0.057f * f3;
        r132.A01 = f2 * 0.807f;
        float max = Math.max((float) Math.sqrt((double) ((((float) (width * width)) / 4.0f) + (((float) (height * height)) / 4.0f))), Float.MIN_VALUE);
        int[] iArr = new int[2];
        iArr[0] = AnonymousClass0J6.A00(-1, 0.25f);
        AnonymousClass0J6.A01(iArr, 0.0f, -1, 1);
        this.A03.setShader(new RadialGradient(f3, 0.0f, max, iArr, (float[]) null, tileMode));
        Path path2 = r10.A01;
        path2.reset();
        path2.moveTo(r6.A00, r6.A01);
        path2.lineTo(r5.A00, r5.A01);
        path2.lineTo(r9.A00, r9.A01);
        path2.close();
        r23.A00();
        r35.A00();
        r4.A00();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A02.setColorFilter(colorFilter);
        this.A08.A00.setColorFilter(colorFilter);
        this.A07.A00.setColorFilter(colorFilter);
        this.A05.A00.setColorFilter(colorFilter);
        this.A06.A00.setColorFilter(colorFilter);
        this.A03.setColorFilter(colorFilter);
    }

    public AnonymousClass016(int i, float f) {
        this.A01 = i;
        this.A00 = f;
        this.A02 = new Paint();
        this.A08 = new AnonymousClass0MV();
        this.A07 = new C04330Nu(-11695, 100);
        this.A05 = new C04330Nu(-44416, 190);
        this.A06 = new C04330Nu(-6278145, 175);
        Paint paint = new Paint();
        this.A03 = paint;
        paint.setAntiAlias(true);
        AnonymousClass001.A10(paint);
        paint.setDither(true);
    }

    public void setAlpha(int i) {
    }
}
