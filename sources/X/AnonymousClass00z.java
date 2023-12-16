package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: X.00z  reason: invalid class name */
public class AnonymousClass00z extends Drawable.ConstantState {
    public final Drawable.ConstantState A00;

    public boolean canApplyTheme() {
        return this.A00.canApplyTheme();
    }

    public int getChangingConfigurations() {
        return this.A00.getChangingConfigurations();
    }

    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        AnonymousClass0AR r2 = new AnonymousClass0AR();
        Drawable newDrawable = this.A00.newDrawable(resources, theme);
        r2.A00 = newDrawable;
        newDrawable.setCallback(r2.A05);
        return r2;
    }

    public AnonymousClass00z(Drawable.ConstantState constantState) {
        this.A00 = constantState;
    }

    public Drawable newDrawable(Resources resources) {
        AnonymousClass0AR r2 = new AnonymousClass0AR();
        Drawable newDrawable = this.A00.newDrawable(resources);
        r2.A00 = newDrawable;
        newDrawable.setCallback(r2.A05);
        return r2;
    }

    public Drawable newDrawable() {
        AnonymousClass0AR r2 = new AnonymousClass0AR();
        Drawable newDrawable = this.A00.newDrawable();
        r2.A00 = newDrawable;
        newDrawable.setCallback(r2.A05);
        return r2;
    }
}
