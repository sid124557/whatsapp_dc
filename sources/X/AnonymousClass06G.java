package X;

import android.view.WindowInsets;

/* renamed from: X.06G  reason: invalid class name */
public class AnonymousClass06G extends AnonymousClass06H {
    public AnonymousClass0XU A00 = null;

    public final AnonymousClass0XU A02() {
        AnonymousClass0XU r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        WindowInsets windowInsets = this.A04;
        AnonymousClass0XU A002 = AnonymousClass0XU.A00(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        this.A00 = A002;
        return A002;
    }

    public AnonymousClass0XY A07() {
        return AnonymousClass001.A0X(this.A04.consumeStableInsets());
    }

    public AnonymousClass0XY A08() {
        return AnonymousClass001.A0X(this.A04.consumeSystemWindowInsets());
    }

    public boolean A0A() {
        return this.A04.isConsumed();
    }

    public AnonymousClass06G(AnonymousClass0XY r2, WindowInsets windowInsets) {
        super(r2, windowInsets);
    }

    public void A09(AnonymousClass0XU r1) {
        this.A00 = r1;
    }
}
