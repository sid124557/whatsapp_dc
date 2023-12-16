package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: X.018  reason: invalid class name */
public class AnonymousClass018 extends Drawable {
    public float A00;
    public float A01;
    public float A02;
    public final float A03;
    public final float A04;
    public final int A05;
    public final int A06;
    public final Paint A07;
    public final RectF A08 = AnonymousClass002.A07();

    public final void A00() {
        float f = this.A02;
        if (f > 0.0f) {
            float f2 = this.A03 / f;
            float f3 = 1.0f - f2;
            float f4 = (f2 * 0.25f) + f3;
            if (f4 > 1.0f) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Gradient quarter fraction cannot be greater than 1, value is: ");
                A0o.append(f4);
                C159737mN.A01("CDSCircularShadowDrawable", A0o.toString());
                return;
            }
            int[] iArr = new int[5];
            int i = this.A05;
            iArr[0] = i;
            iArr[1] = i;
            int i2 = this.A06;
            float f5 = this.A04;
            AnonymousClass0J6.A01(iArr, f5, i2, 2);
            AnonymousClass0J6.A01(iArr, f5 * 0.66f, i2, 3);
            iArr[4] = 16777215;
            this.A07.setShader(new RadialGradient(this.A00, this.A01, f, iArr, new float[]{0.0f, f3, f3, f4, 1.0f}, Shader.TileMode.CLAMP));
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
        this.A07.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A07.setColorFilter(colorFilter);
    }

    public AnonymousClass018(int i, int i2, float f) {
        Paint paint = new Paint();
        this.A07 = paint;
        paint.setAntiAlias(false);
        paint.setDither(true);
        AnonymousClass001.A10(paint);
        this.A03 = f;
        this.A06 = i;
        this.A05 = i2;
        this.A04 = ((float) Color.alpha(i)) / 255.0f;
    }

    public void draw(Canvas canvas) {
        int save = canvas.save();
        canvas.drawCircle(this.A00, this.A01, this.A02, this.A07);
        canvas.restoreToCount(save);
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        RectF rectF = this.A08;
        float f = this.A03;
        rectF.set(((float) rect.left) + f, ((float) rect.top) + f, ((float) rect.right) - f, ((float) rect.bottom) - f);
        this.A00 = rectF.centerX();
        this.A01 = rectF.centerY();
        this.A02 = ((float) rect.width()) / 2.0f;
        A00();
    }
}
