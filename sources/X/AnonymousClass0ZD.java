package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.0ZD  reason: invalid class name */
public class AnonymousClass0ZD implements Drawable.Callback {
    public final /* synthetic */ AnonymousClass0AR A00;

    public AnonymousClass0ZD(AnonymousClass0AR r1) {
        this.A00 = r1;
    }

    public void invalidateDrawable(Drawable drawable) {
        this.A00.invalidateSelf();
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.A00.scheduleSelf(runnable, j);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.A00.unscheduleSelf(runnable);
    }
}
