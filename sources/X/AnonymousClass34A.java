package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.34A  reason: invalid class name */
public final /* synthetic */ class AnonymousClass34A {
    public static final Object A00(C84814Du r1, C85474Gj r2) {
        r2.AyX((CancellationException) null);
        return AnonymousClass218.A00(r2.BJQ(r1));
    }

    public static final C85474Gj A01(C85494Gl r2) {
        C85474Gj A0v = C18310x6.A0v(r2);
        if (A0v != null) {
            return A0v;
        }
        throw AnonymousClass000.A0H(r2, "Current context doesn't contain Job in it: ", AnonymousClass001.A0o());
    }

    public static final void A02(C85494Gl r1) {
        C85474Gj A0v = C18310x6.A0v(r1);
        if (A0v != null && !A0v.BGz()) {
            throw A0v.B5G();
        }
    }
}
