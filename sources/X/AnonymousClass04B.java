package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* renamed from: X.04B  reason: invalid class name */
public class AnonymousClass04B extends AnonymousClass01I {
    public AnonymousClass049 A00;
    public boolean A01;

    /* renamed from: A05 */
    public AnonymousClass049 A00() {
        return new AnonymousClass049((Resources) null, this.A00, this);
    }

    public boolean isStateful() {
        return true;
    }

    public Drawable mutate() {
        if (!this.A01) {
            super.mutate();
            if (this == this) {
                this.A00.A04();
                this.A01 = true;
            }
        }
        return this;
    }

    public AnonymousClass04B(Resources resources, AnonymousClass049 r3) {
        A02(new AnonymousClass049(resources, r3, this));
        onStateChange(getState());
    }

    public void A02(AnonymousClass011 r2) {
        super.A02(r2);
        if (r2 instanceof AnonymousClass049) {
            this.A00 = (AnonymousClass049) r2;
        }
    }

    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int A08 = this.A00.A08(iArr);
        if (A08 < 0) {
            A08 = this.A00.A08(StateSet.WILD_CARD);
        }
        if (A04(A08) || onStateChange) {
            return true;
        }
        return false;
    }

    public AnonymousClass04B(AnonymousClass049 r1) {
    }

    public AnonymousClass04B() {
        this((Resources) null, (AnonymousClass049) null);
    }
}
