package X;

import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;

/* renamed from: X.4M7  reason: invalid class name */
public final class AnonymousClass4M7 extends InsetDrawable {
    public final PorterDuffColorFilter A00;

    public AnonymousClass4M7(Drawable drawable) {
        super(drawable, 0);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-1, PorterDuff.Mode.DST);
        this.A00 = porterDuffColorFilter;
        super.setColorFilter(porterDuffColorFilter);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(this.A00);
    }

    public void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(this.A00);
    }
}
