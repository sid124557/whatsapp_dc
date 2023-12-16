package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* renamed from: X.048  reason: invalid class name */
public class AnonymousClass048 extends AnonymousClass049 {
    public C10550i7 A00;
    public C10530i5 A01;

    public void A04() {
        this.A00 = this.A00.clone();
        this.A01 = this.A01.clone();
    }

    public Drawable newDrawable(Resources resources) {
        return new AnonymousClass04A(resources, this);
    }

    public AnonymousClass048(Resources resources, AnonymousClass048 r3, AnonymousClass04A r4) {
        super(resources, r3, r4);
        C10530i5 r0;
        if (r3 != null) {
            this.A00 = r3.A00;
            r0 = r3.A01;
        } else {
            this.A00 = new C10550i7();
            r0 = new C10530i5();
        }
        this.A01 = r0;
    }

    public int A09(int[] iArr) {
        int A08 = super.A08(iArr);
        if (A08 < 0) {
            return super.A08(StateSet.WILD_CARD);
        }
        return A08;
    }

    public Drawable newDrawable() {
        return new AnonymousClass04A((Resources) null, this);
    }
}
