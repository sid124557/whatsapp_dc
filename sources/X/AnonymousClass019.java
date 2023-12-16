package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: X.019  reason: invalid class name */
public class AnonymousClass019 extends Drawable {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final int A05;
    public final Paint A06;
    public final Paint A07;
    public final RectF A08;
    public final RectF A09;
    public final boolean A0A = true;
    public final boolean A0B = true;
    public final Paint[] A0C;
    public final Paint[] A0D;
    public final Path[] A0E;

    public AnonymousClass019(float f, float f2, int i, float f3, int i2, float f4) {
        this.A00 = f;
        this.A03 = f2;
        this.A01 = f3;
        this.A04 = f4;
        this.A05 = i;
        float alpha = (float) Color.alpha(i);
        this.A02 = alpha;
        Paint paint = new Paint();
        this.A07 = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(i2);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.A06 = paint2;
        paint2.setStyle(style);
        paint2.setColor(i);
        paint2.setAntiAlias(true);
        paint2.setAlpha(Math.round(alpha));
        this.A0E = new Path[4];
        this.A08 = AnonymousClass002.A07();
        this.A09 = AnonymousClass002.A07();
        this.A0C = new Paint[4];
        this.A0D = new Paint[4];
        int i3 = 0;
        do {
            this.A0E[i3] = AnonymousClass002.A06();
            Paint[] paintArr = this.A0C;
            Paint paint3 = new Paint(4);
            AnonymousClass001.A10(paint3);
            paintArr[i3] = paint3;
            this.A0C[i3].setAntiAlias(true);
            Paint[] paintArr2 = this.A0D;
            Paint paint4 = new Paint(4);
            AnonymousClass001.A10(paint4);
            paintArr2[i3] = paint4;
            i3++;
        } while (i3 < 4);
    }

    public void draw(Canvas canvas) {
        float f;
        float f2;
        Path path = this.A0E[0];
        Paint paint = this.A0C[0];
        Paint paint2 = this.A0D[0];
        boolean z = this.A0B;
        float f3 = 2.0f;
        Canvas canvas2 = canvas;
        if (z) {
            int save = canvas2.save();
            RectF rectF = this.A08;
            float f4 = rectF.left;
            float f5 = this.A00;
            canvas2.translate(f4 + f5, rectF.top + f5);
            canvas2.drawPath(path, paint);
            float f6 = -f5;
            canvas2.drawRect(0.0f, f6 - this.A03, rectF.width() - (f5 * 2.0f), f6, paint2);
            canvas2.restoreToCount(save);
        }
        int save2 = canvas2.save();
        RectF rectF2 = this.A08;
        float f7 = rectF2.right;
        float f8 = this.A00;
        canvas2.translate(f7 - f8, rectF2.top + f8);
        canvas2.rotate(90.0f);
        if (z) {
            canvas2.drawPath(path, paint);
            f = 0.0f;
        } else {
            f = -f8;
        }
        float f9 = -f8;
        float f10 = f9 - this.A03;
        float height = rectF2.height();
        boolean z2 = this.A0A;
        float f11 = 1.0f;
        if (z2) {
            f11 = 2.0f;
        }
        canvas2.drawRect(f, f10, height - (f11 * f8), f9, paint2);
        canvas2.restoreToCount(save2);
        if (z2) {
            int save3 = canvas2.save();
            canvas2.translate(rectF2.right - f8, rectF2.bottom - f8);
            canvas2.rotate(180.0f);
            canvas2.drawPath(path, paint);
            canvas2.drawRect(0.0f, f10, rectF2.width() - (f8 * 2.0f), f9, paint2);
            canvas2.restoreToCount(save3);
        }
        int save4 = canvas2.save();
        canvas2.translate(rectF2.left + f8, rectF2.bottom - f8);
        canvas2.rotate(270.0f);
        if (z2) {
            canvas2.drawPath(path, paint);
            f2 = 0.0f;
        } else {
            f2 = f9;
        }
        float height2 = rectF2.height();
        if (!z) {
            f3 = 1.0f;
        }
        canvas2.drawRect(f2, f10, height2 - (f3 * f8), f9, paint2);
        canvas2.restoreToCount(save4);
        if (f8 <= 0.0f || (!z && !z2)) {
            canvas2.drawRect(rectF2, this.A07);
            return;
        }
        if (this.A04 > 0.0f || this.A01 > 0.0f) {
            canvas2.drawRoundRect(rectF2, f8, f8, this.A06);
            rectF2 = this.A09;
        }
        canvas2.drawRoundRect(rectF2, f8, f8, this.A07);
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(Rect rect) {
        float f = this.A03;
        float f2 = this.A01;
        int i = (int) (f - f2);
        float f3 = 0.0f;
        if (this.A0B) {
            f3 = f;
        }
        float f4 = this.A04;
        int i2 = (int) (f3 - f4);
        int i3 = (int) (f2 + f);
        if (!this.A0A) {
            f = 0.0f;
        }
        rect.set(i, i2, i3, (int) (f + f4));
        return true;
    }

    public void onBoundsChange(Rect rect) {
        LinearGradient linearGradient;
        Rect rect2 = rect;
        super.onBoundsChange(rect2);
        RectF rectF = this.A08;
        float f = this.A03;
        float f2 = f;
        float f3 = ((float) rect2.left) + f;
        float f4 = (float) rect2.top;
        boolean z = this.A0B;
        float f5 = 0.0f;
        float f6 = 0.0f;
        if (z) {
            f6 = f;
        }
        float f7 = f4 + f6;
        float f8 = ((float) rect2.right) - f;
        float f9 = (float) rect2.bottom;
        boolean z2 = this.A0A;
        if (!z2) {
            f = 0.0f;
        }
        rectF.set(f3, f7, f8, f9 - f);
        RectF rectF2 = this.A09;
        float f10 = this.A01;
        float f11 = (((float) rect2.left) + f2) - f10;
        float f12 = (float) rect2.top;
        float f13 = 0.0f;
        if (z) {
            f13 = f2;
        }
        float f14 = this.A04;
        float f15 = (f12 + f13) - f14;
        float f16 = (((float) rect2.right) - f2) - f10;
        float f17 = (float) rect2.bottom;
        if (z2) {
            f5 = f2;
        }
        rectF2.set(f11, f15, f16, (f17 - f5) - f14);
        float f18 = this.A00;
        float f19 = -f18;
        RectF rectF3 = new RectF(f19, f19, f18, f18);
        RectF rectF4 = new RectF(rectF3);
        float f20 = -f2;
        rectF4.inset(f20, f20);
        int i = this.A05;
        float f21 = this.A02;
        int[] iArr = {AnonymousClass0J6.A00(i, f21 / 255.0f), AnonymousClass0J6.A00(i, (f21 * 0.5f) / 255.0f), AnonymousClass0J6.A00(i, 0.0f)};
        float[] fArr = new float[3];
        float[] fArr2 = fArr;
        // fill-array-data instruction
        fArr[0] = 0;
        fArr[1] = 1056964608;
        fArr[2] = 1065353216;
        float f22 = f2 + f18;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, f22, iArr, fArr, tileMode);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            Path[] pathArr = this.A0E;
            if (i3 < pathArr.length) {
                Path path = pathArr[i3];
                path.reset();
                path.setFillType(Path.FillType.EVEN_ODD);
                this.A0C[i3].setShader(radialGradient);
                if (i2 == 90) {
                    i2 = 90;
                    path.moveTo(0.0f, f19);
                    path.rLineTo(0.0f, f20);
                    linearGradient = new LinearGradient(0.0f, 0.0f, f22, 0.0f, iArr, fArr2, tileMode);
                } else if (i2 == 180) {
                    i2 = 180;
                    path.moveTo(f18, 0.0f);
                    path.rLineTo(f2, 0.0f);
                    linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, f22, iArr, fArr2, tileMode);
                } else if (i2 != 270) {
                    path.moveTo(f19, 0.0f);
                    path.rLineTo(f20, 0.0f);
                    linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, f20 - f18, iArr, fArr2, tileMode);
                } else {
                    i2 = 270;
                    path.moveTo(0.0f, f18);
                    path.rLineTo(0.0f, f2);
                    linearGradient = new LinearGradient(0.0f, 0.0f, f20 - f18, 0.0f, iArr, fArr2, tileMode);
                }
                float f23 = (float) i2;
                path.arcTo(rectF4, 180.0f + f23, 90.0f, false);
                path.arcTo(rectF3, f23 + 270.0f, -90.0f, false);
                path.close();
                this.A0D[i3].setShader(linearGradient);
                i2 += 90;
                i3++;
            } else {
                return;
            }
        }
    }

    public void setAlpha(int i) {
        for (Paint alpha : this.A0C) {
            alpha.setAlpha(i);
        }
        for (Paint alpha2 : this.A0D) {
            alpha2.setAlpha(i);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        for (Paint colorFilter2 : this.A0C) {
            colorFilter2.setColorFilter(colorFilter);
        }
        for (Paint colorFilter3 : this.A0D) {
            colorFilter3.setColorFilter(colorFilter);
        }
    }
}
