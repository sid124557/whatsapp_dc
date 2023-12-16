package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: X.01E  reason: invalid class name */
public class AnonymousClass01E extends Drawable implements Animatable {
    public static final Interpolator A09 = C05030Rp.A00(0.33f, 0.0f, 0.67f, 1.0f);
    public static final Interpolator A0A = new LinearInterpolator();
    public static final float[] A0B = {0.8f, 0.8f, 1.0f, 0.8f, 0.8f};
    public static final float[] A0C = {0.0f, 180.0f, 360.0f, 540.0f, 1080.0f};
    public static final float[] A0D = {0.0f, 0.7f, 0.45f, 0.7f, 0.0f};
    public float A00;
    public float A01 = -90.0f;
    public boolean A02;
    public final int A03;
    public final int A04;
    public final ValueAnimator.AnimatorUpdateListener A05;
    public final ValueAnimator A06;
    public final Paint A07;
    public final RectF A08 = AnonymousClass002.A07();

    public AnonymousClass01E(Context context, int i, int i2) {
        Paint paint = new Paint(1);
        this.A07 = paint;
        C02910Ib r1 = new C02910Ib(this, 3);
        this.A05 = r1;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.A06 = valueAnimator;
        valueAnimator.setInterpolator(A0A);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        valueAnimator.addUpdateListener(r1);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.setDuration(2000);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AnonymousClass0J7.A00(context, 2.0f));
        this.A03 = i;
        this.A04 = i2;
    }

    public void draw(Canvas canvas) {
        Paint paint = this.A07;
        paint.setColor(this.A03);
        canvas.drawArc(this.A08, this.A01, this.A00, false, paint);
    }

    public int getIntrinsicHeight() {
        return this.A04;
    }

    public int getIntrinsicWidth() {
        return this.A04;
    }

    public int getOpacity() {
        return -1;
    }

    public boolean isRunning() {
        ValueAnimator valueAnimator = this.A06;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return false;
        }
        return true;
    }

    public boolean setVisible(boolean z, boolean z2) {
        ValueAnimator valueAnimator = this.A06;
        if (!z) {
            if (valueAnimator != null && this.A02) {
                valueAnimator.cancel();
            }
        } else if (valueAnimator != null && this.A02) {
            valueAnimator.start();
        }
        return super.setVisible(z, z2);
    }

    public void start() {
        ValueAnimator valueAnimator = this.A06;
        if (valueAnimator != null) {
            valueAnimator.start();
            this.A02 = true;
        }
    }

    public void stop() {
        ValueAnimator valueAnimator = this.A06;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.A02 = false;
        }
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        float strokeWidth = this.A07.getStrokeWidth() / 2.0f;
        RectF rectF = this.A08;
        rectF.set(rect);
        rectF.offset(strokeWidth, strokeWidth);
        int i = rect.left;
        int i2 = this.A04;
        rectF.right = ((float) (i + i2)) - strokeWidth;
        rectF.bottom = ((float) (rect.top + i2)) - strokeWidth;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
