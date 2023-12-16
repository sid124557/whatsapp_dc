package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.6Cu  reason: invalid class name and case insensitive filesystem */
public class C124516Cu extends Drawable {
    public final C105425Uw A00;

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public C124516Cu(C105425Uw r1) {
        this.A00 = r1;
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        C105425Uw r3 = this.A00;
        float A08 = r3.A08() / 2.0f;
        r3.A0M(AnonymousClass002.A07(), ((float) bounds.left) + A08, ((float) bounds.top) + A08, ((float) bounds.right) - A08, ((float) bounds.bottom) - A08);
        r3.A0K(canvas);
    }
}
