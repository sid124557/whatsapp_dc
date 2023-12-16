package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* renamed from: X.4Lg  reason: invalid class name */
public final class AnonymousClass4Lg extends Drawable {
    public final Paint A00;

    public void draw(Canvas canvas) {
        C162457s7.A0J(canvas, 0);
        canvas.drawRect(getBounds(), this.A00);
    }

    public int getOpacity() {
        return -3;
    }

    public AnonymousClass4Lg(int i) {
        Paint A0B = C86604Kt.A0B();
        this.A00 = A0B;
        if (A0B.getColor() != i) {
            A0B.setColor(i);
            invalidateSelf();
        }
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
