package X;

import android.animation.ArgbEvaluator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* renamed from: X.01F  reason: invalid class name */
public class AnonymousClass01F extends Drawable implements Animatable {
    public static final ArgbEvaluator A08 = new ArgbEvaluator();
    public static final TimeInterpolator A09 = new C06590Yk();
    public boolean A00;
    public final float A01;
    public final int A02;
    public final ValueAnimator.AnimatorUpdateListener A03;
    public final ValueAnimator A04;
    public final Paint A05;
    public final RectF A06;
    public final AnonymousClass0FT A07;

    public AnonymousClass01F(Context context, AnonymousClass0LN r11, AnonymousClass0LN r12, AnonymousClass0FT r13, C153427bI r14, float f, int i, int i2, long j) {
        float f2;
        float f3;
        C02910Ib r1 = new C02910Ib(this, 2);
        this.A03 = r1;
        this.A07 = r13;
        this.A06 = AnonymousClass002.A07();
        Paint paint = new Paint();
        this.A05 = paint;
        AnonymousClass001.A10(paint);
        paint.setAntiAlias(true);
        int i3 = i2;
        this.A02 = i3;
        this.A01 = f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.A04 = valueAnimator;
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(r1);
        valueAnimator.setStartDelay(((long) (i % 10)) * 200);
        valueAnimator.setDuration(2000);
        valueAnimator.setInterpolator(A09);
        valueAnimator.setEvaluator(A08);
        if (C153867c9.A01(context, r14)) {
            f2 = r12.A00;
            f3 = r12.A01;
        } else {
            f2 = r11.A00;
            f3 = r11.A01;
        }
        valueAnimator.setFloatValues(new float[]{f2, f3});
        paint.setColor(AnonymousClass0J6.A00(i3, f2));
    }

    public void draw(Canvas canvas) {
        int ordinal = this.A07.ordinal();
        RectF rectF = this.A06;
        if (ordinal != 0) {
            float f = this.A01;
            canvas.drawRoundRect(rectF, f, f, this.A05);
            return;
        }
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, this.A05);
    }

    public int getOpacity() {
        return -1;
    }

    public boolean isRunning() {
        return this.A04.isStarted();
    }

    public void setAlpha(int i) {
        Paint paint = this.A05;
        if (paint.getAlpha() != i) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (!z) {
            this.A04.cancel();
        } else if (this.A00) {
            this.A04.start();
        }
        return super.setVisible(z, z2);
    }

    public void start() {
        this.A04.start();
        this.A00 = true;
    }

    public void stop() {
        this.A04.cancel();
        this.A00 = false;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.A06.set(rect);
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public AnonymousClass01F(Context context, AnonymousClass0LN r13, AnonymousClass0LN r14, AnonymousClass0FT r15, C153427bI r16, float f, int i, int i2) {
        this(context, r13, r14, r15, r16, f, i, i2, 200);
    }
}
