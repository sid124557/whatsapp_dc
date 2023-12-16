package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.6Ct  reason: invalid class name */
public class AnonymousClass6Ct extends Drawable {
    public final Paint A00;

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public AnonymousClass6Ct() {
        Paint A0B = C86604Kt.A0B();
        this.A00 = A0B;
        C86604Kt.A0u(285212672, A0B);
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.drawCircle((float) bounds.centerX(), (float) bounds.centerY(), (float) (bounds.width() / 2), this.A00);
    }
}
