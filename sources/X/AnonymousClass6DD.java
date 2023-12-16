package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;

/* renamed from: X.6DD  reason: invalid class name */
public final class AnonymousClass6DD extends InsetDrawable {
    public AnonymousClass6DD(Drawable drawable) {
        super(drawable, 0);
    }

    public void draw(Canvas canvas) {
        C162457s7.A0J(canvas, 0);
        super.draw(canvas);
    }

    public boolean getPadding(Rect rect) {
        C162457s7.A0J(rect, 0);
        return super.getPadding(rect);
    }
}
