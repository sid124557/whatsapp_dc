package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.6Cr  reason: invalid class name */
public class AnonymousClass6Cr extends Drawable.ConstantState {
    public final /* synthetic */ AnonymousClass6D0 A00;

    public AnonymousClass6Cr(AnonymousClass6D0 r1) {
        this.A00 = r1;
    }

    public int getChangingConfigurations() {
        return 0;
    }

    public Drawable newDrawable() {
        return this.A00;
    }
}
