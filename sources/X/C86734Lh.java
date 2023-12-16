package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.4Lh  reason: invalid class name and case insensitive filesystem */
public class C86734Lh extends Drawable {
    public int A00;
    public final Paint A01 = C86604Kt.A0B();

    public void draw(Canvas canvas) {
        Paint paint = this.A01;
        AnonymousClass001.A10(paint);
        paint.setColor(this.A00);
        Rect bounds = getBounds();
        canvas.drawCircle(0.0f, 0.0f, (float) Math.min(bounds.width(), bounds.height()), paint);
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
