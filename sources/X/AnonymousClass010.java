package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: X.010  reason: invalid class name */
public class AnonymousClass010 extends Drawable.ConstantState {
    public final Drawable.ConstantState A00;

    public boolean canApplyTheme() {
        return this.A00.canApplyTheme();
    }

    public int getChangingConfigurations() {
        return this.A00.getChangingConfigurations();
    }

    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        AnonymousClass0AQ r1 = new AnonymousClass0AQ();
        r1.A00 = this.A00.newDrawable(resources, theme);
        return r1;
    }

    public AnonymousClass010(Drawable.ConstantState constantState) {
        this.A00 = constantState;
    }

    public Drawable newDrawable(Resources resources) {
        AnonymousClass0AQ r1 = new AnonymousClass0AQ();
        r1.A00 = this.A00.newDrawable(resources);
        return r1;
    }

    public Drawable newDrawable() {
        AnonymousClass0AQ r1 = new AnonymousClass0AQ();
        r1.A00 = this.A00.newDrawable();
        return r1;
    }
}
