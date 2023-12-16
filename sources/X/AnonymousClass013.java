package X;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.013  reason: invalid class name */
public class AnonymousClass013 extends Drawable {
    public int A00;
    public ValueAnimator A01;

    public int getAlpha() {
        return this.A00;
    }

    public int getOpacity() {
        return -1;
    }

    public void setAlpha(int i) {
        this.A00 = i;
        throw new NullPointerException("iterator");
    }

    public void setColorFilter(ColorFilter colorFilter) {
        throw new NullPointerException("iterator");
    }

    public void draw(Canvas canvas) {
        canvas.save();
        canvas.drawColor(0);
        float A002 = AnonymousClass001.A00(0.0f, 0.0f, 0.0f);
        Rect bounds = getBounds();
        if (A002 != 0.0f) {
            canvas.rotate(A002, bounds.exactCenterX(), bounds.exactCenterY());
        }
        throw new NullPointerException("iterator");
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        throw new NullPointerException("iterator");
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2);
    }
}
