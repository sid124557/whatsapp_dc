package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.0ZC  reason: invalid class name */
public class AnonymousClass0ZC implements Drawable.Callback {
    public Drawable.Callback A00;

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = this.A00;
        if (callback != null) {
            callback.scheduleDrawable(drawable, runnable, j);
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = this.A00;
        if (callback != null) {
            callback.unscheduleDrawable(drawable, runnable);
        }
    }

    public void invalidateDrawable(Drawable drawable) {
    }
}
