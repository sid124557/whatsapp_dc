package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.349  reason: invalid class name */
public final class AnonymousClass349 {
    public static AnonymousClass4C6 A01(C85494Gl r2) {
        return A02(new AnonymousClass46U((C85474Gj) null).plus(r2));
    }

    public static final AnonymousClass4C6 A02(C85494Gl r2) {
        if (r2.get(C85474Gj.A00) == null) {
            r2 = r2.plus(new C831246f((C85474Gj) null));
        }
        return new C72663e5(r2);
    }

    public static final Object A00(C84814Du r2, AnonymousClass4GR r3) {
        C830645z r0 = new C830645z(r2, r2.B5w());
        return AnonymousClass2AU.A00(r0, r3, r0);
    }

    public static final void A03(CancellationException cancellationException, AnonymousClass4C6 r2) {
        C85474Gj A0v = C18310x6.A0v(r2.B61());
        if (A0v != null) {
            A0v.AyX(cancellationException);
            return;
        }
        throw AnonymousClass000.A0H(r2, "Scope cannot be cancelled because it does not have a job: ", AnonymousClass001.A0o());
    }

    public static final boolean A04(AnonymousClass4C6 r0) {
        C85474Gj A0v = C18310x6.A0v(r0.B61());
        if (A0v != null) {
            return A0v.BGz();
        }
        return true;
    }
}
