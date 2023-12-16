package X;

import android.content.Context;

/* renamed from: X.1PU  reason: invalid class name */
public abstract class AnonymousClass1PU extends C93314oJ {
    public boolean A00;

    public void A0v() {
        if (this instanceof AnonymousClass1PS) {
            AnonymousClass1PS r1 = (AnonymousClass1PS) this;
            if (!r1.A01) {
                r1.A01 = true;
                AnonymousClass0x7.A0I(r1).A4e(r1);
            }
        } else if (!this.A00) {
            this.A00 = true;
            ((C88864av) ((C111685iW) generatedComponent())).A4Y((AnonymousClass1PT) this);
        }
    }

    public AnonymousClass1PU(Context context, AnonymousClass677 r2, C624134x r3) {
        super(context, r2, r3);
        A0v();
    }
}
