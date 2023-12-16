package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.4Lp  reason: invalid class name */
public final class AnonymousClass4Lp extends Drawable {
    public final Paint A00;
    public final Drawable A01;

    public void draw(Canvas canvas) {
        C162457s7.A0J(canvas, 0);
        Rect bounds = getBounds();
        C162457s7.A0D(bounds);
        RectF rectF = new RectF(bounds);
        canvas.drawCircle(rectF.centerX(), rectF.centerX(), Math.min(rectF.width(), rectF.height()) / 2.0f, this.A00);
        this.A01.draw(canvas);
    }

    public void setBounds(Rect rect) {
        C162457s7.A0J(rect, 0);
        super.setBounds(rect);
        A00();
        invalidateSelf();
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
        this.A00.setAlpha(i);
        this.A01.setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A00.setColorFilter(colorFilter);
        this.A01.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public AnonymousClass4Lp(Drawable drawable, int i) {
        this.A01 = drawable;
        Paint A0Z = C86664Kz.A0Z();
        A0Z.setColor(i);
        this.A00 = A0Z;
    }

    public final void A00() {
        Rect bounds = getBounds();
        C162457s7.A0D(bounds);
        RectF rectF = new RectF(bounds);
        Drawable drawable = this.A01;
        RectF A09 = AnonymousClass4L0.A09(rectF.width() * 0.2f, rectF.height() * 0.2f, rectF.width() * 0.8f, rectF.height() * 0.8f);
        Rect A0N = AnonymousClass001.A0N();
        A09.roundOut(A0N);
        drawable.setBounds(A0N);
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        A00();
        invalidateSelf();
    }
}
