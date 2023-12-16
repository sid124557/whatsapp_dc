package X;

import android.graphics.Typeface;

/* renamed from: X.6GO  reason: invalid class name */
public class AnonymousClass6GO extends C04570Ou {
    public final /* synthetic */ C153517bS A00;
    public final /* synthetic */ C151417Ur A01;

    public AnonymousClass6GO(C153517bS r1, C151417Ur r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void A01(int i) {
        this.A00.A03 = true;
        this.A01.A00(i);
    }

    public void A02(Typeface typeface) {
        C153517bS r1 = this.A00;
        Typeface create = Typeface.create(typeface, r1.A09);
        r1.A02 = create;
        r1.A03 = true;
        this.A01.A01(create, false);
    }
}
