package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: X.00x  reason: invalid class name and case insensitive filesystem */
public final class C001200x extends Drawable.ConstantState {
    public int A00;
    public ColorStateList A01 = null;
    public PorterDuff.Mode A02 = AnonymousClass01J.A07;
    public Drawable.ConstantState A03;

    public int getChangingConfigurations() {
        int i;
        int i2 = this.A00;
        Drawable.ConstantState constantState = this.A03;
        if (constantState != null) {
            i = constantState.getChangingConfigurations();
        } else {
            i = 0;
        }
        return i2 | i;
    }

    public Drawable newDrawable(Resources resources) {
        return new AnonymousClass01J(resources, this);
    }

    public C001200x(C001200x r2) {
        if (r2 != null) {
            this.A00 = r2.A00;
            this.A03 = r2.A03;
            this.A01 = r2.A01;
            this.A02 = r2.A02;
        }
    }

    public Drawable newDrawable() {
        return new AnonymousClass01J((Resources) null, this);
    }
}
