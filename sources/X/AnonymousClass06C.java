package X;

import android.view.WindowInsets;

/* renamed from: X.06C  reason: invalid class name */
public class AnonymousClass06C extends AnonymousClass0UT {
    public final WindowInsets.Builder A00;

    public void A02(AnonymousClass0XU r3) {
        this.A00.setMandatorySystemGestureInsets(r3.A03());
    }

    public void A03(AnonymousClass0XU r3) {
        this.A00.setSystemGestureInsets(r3.A03());
    }

    public void A04(AnonymousClass0XU r3) {
        this.A00.setTappableElementInsets(r3.A03());
    }

    public void A05(AnonymousClass0XU r3) {
        this.A00.setStableInsets(r3.A03());
    }

    public void A06(AnonymousClass0XU r3) {
        this.A00.setSystemWindowInsets(r3.A03());
    }

    public AnonymousClass06C(AnonymousClass0XY r3) {
        super(r3);
        WindowInsets.Builder builder;
        WindowInsets A06 = r3.A06();
        if (A06 == null) {
            builder = new WindowInsets.Builder();
        }
        this.A00 = builder;
    }

    public AnonymousClass0XY A00() {
        A01();
        AnonymousClass0XY A0X = AnonymousClass001.A0X(this.A00.build());
        A0X.A00.A0H(this.A00);
        return A0X;
    }

    public AnonymousClass06C() {
        this.A00 = new WindowInsets.Builder();
    }
}
