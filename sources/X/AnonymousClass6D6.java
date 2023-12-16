package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;

/* renamed from: X.6D6  reason: invalid class name */
public class AnonymousClass6D6 extends Drawable implements Drawable.Callback {
    public int A00;
    public int A01;
    public final Drawable A02;
    public final Drawable A03;

    public void draw(Canvas canvas) {
        this.A03.draw(canvas);
        this.A02.draw(canvas);
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
        this.A03.setAlpha(i);
        this.A02.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A03.setColorFilter(colorFilter);
        this.A02.setColorFilter(colorFilter);
    }

    public AnonymousClass6D6(Context context) {
        Drawable A0G = C18310x6.A0G(context, R.drawable.carousel_scrollbar_track);
        this.A03 = A0G;
        A0G.setCallback(this);
        Drawable A0G2 = C18310x6.A0G(context, R.drawable.carousel_scrollbar_thumb);
        this.A02 = A0G2;
        A0G2.setCallback(this);
    }

    public final void A00() {
        Rect bounds = getBounds();
        this.A03.setBounds(bounds);
        Drawable drawable = this.A02;
        int i = bounds.left + this.A01;
        drawable.setBounds(i, bounds.top, i + this.A00, bounds.bottom);
        invalidateSelf();
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public void onBoundsChange(Rect rect) {
        A00();
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }
}
