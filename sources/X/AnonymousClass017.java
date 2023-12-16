package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.017  reason: invalid class name */
public class AnonymousClass017 extends Drawable {
    public boolean A00;
    public final Paint A01;
    public final Path A02 = AnonymousClass002.A06();
    public final RectF A03;
    public final float[] A04;

    public void A00(int i) {
        Paint paint = this.A01;
        if (i != paint.getColor()) {
            paint.setColor(i);
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        if (this.A00) {
            RectF rectF = this.A03;
            float f = this.A04[0];
            canvas.drawRoundRect(rectF, f, f, this.A01);
            return;
        }
        canvas.drawPath(this.A02, this.A01);
    }

    public int getOpacity() {
        float[] fArr = this.A04;
        int length = fArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (Float.compare(fArr[i], 0.0f) == 0) {
                    break;
                }
                i++;
            } else if (this.A01.getAlpha() != 255) {
                return -3;
            } else {
                return -1;
            }
        }
        return -3;
    }

    public void setAlpha(int i) {
        Paint paint = this.A01;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public AnonymousClass017() {
        Paint paint = new Paint();
        this.A01 = paint;
        this.A03 = AnonymousClass002.A07();
        this.A04 = new float[8];
        this.A00 = true;
        paint.setAntiAlias(true);
        AnonymousClass001.A10(paint);
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        RectF rectF = this.A03;
        rectF.set(rect);
        if (!this.A00) {
            Path path = this.A02;
            path.reset();
            path.addRoundRect(rectF, this.A04, Path.Direction.CW);
        }
    }
}
