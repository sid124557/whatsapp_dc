package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* renamed from: X.4Mu  reason: invalid class name and case insensitive filesystem */
public final class C87024Mu extends ImageSpan {
    public C87024Mu(Drawable drawable) {
        super(drawable, 0);
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C162457s7.A0J(canvas, 0);
        C162457s7.A0J(paint, 8);
        Drawable drawable = getDrawable();
        canvas.save();
        canvas.translate(f, (float) (((i5 - drawable.getBounds().bottom) + ((drawable.getIntrinsicHeight() + paint.getFontMetricsInt().ascent) / 2)) - paint.getFontMetricsInt().descent));
        drawable.draw(canvas);
        canvas.restore();
    }
}
