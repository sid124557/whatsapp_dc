package X;

import android.view.WindowInsets;

/* renamed from: X.06E  reason: invalid class name */
public class AnonymousClass06E extends AnonymousClass06F {
    public AnonymousClass0XU A00 = null;
    public AnonymousClass0XU A01 = null;
    public AnonymousClass0XU A02 = null;

    public AnonymousClass0XU A01() {
        AnonymousClass0XU r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass0XU A012 = AnonymousClass0XU.A01(this.A04.getMandatorySystemGestureInsets());
        this.A00 = A012;
        return A012;
    }

    public AnonymousClass0XU A03() {
        AnonymousClass0XU r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass0XU A012 = AnonymousClass0XU.A01(this.A04.getSystemGestureInsets());
        this.A01 = A012;
        return A012;
    }

    public AnonymousClass0XU A04() {
        AnonymousClass0XU r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass0XU A012 = AnonymousClass0XU.A01(this.A04.getTappableElementInsets());
        this.A02 = A012;
        return A012;
    }

    public AnonymousClass0XY A0E(int i, int i2, int i3, int i4) {
        return AnonymousClass001.A0X(this.A04.inset(i, i2, i3, i4));
    }

    public AnonymousClass06E(AnonymousClass0XY r2, WindowInsets windowInsets) {
        super(r2, windowInsets);
    }

    public void A09(AnonymousClass0XU r1) {
    }
}
