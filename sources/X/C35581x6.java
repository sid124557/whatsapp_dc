package X;

import java.util.ArrayList;

/* renamed from: X.1x6  reason: invalid class name and case insensitive filesystem */
public abstract class C35581x6 extends C41042Is implements AnonymousClass4GD {
    public static void A00(AnonymousClass36K r4, C35721xK r5, C84974El r6) {
        ArrayList A0s = AnonymousClass001.A0s();
        try {
            r6.BEp(new C35781xQ(r4, r5));
        } catch (AnonymousClass24Y e) {
            C18260x0.A18("QueryResponseSuccess: ", AnonymousClass001.A0o(), e, A0s);
            try {
                r6.BEq(new C139776sb(r4, r5, 9));
            } catch (AnonymousClass24Y e2) {
                C18260x0.A18("QueryResponseRequestError: ", AnonymousClass001.A0o(), e2, A0s);
                try {
                    r6.BEr(new C139726sW(r4, r5));
                } catch (AnonymousClass24Y e3) {
                    throw AnonymousClass24Y.A03("QueryResponseServerError: ", AnonymousClass001.A0o(), e3, A0s);
                }
            }
        }
    }
}
