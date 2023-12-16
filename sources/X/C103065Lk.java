package X;

import java.math.BigDecimal;

/* renamed from: X.5Lk  reason: invalid class name and case insensitive filesystem */
public class C103065Lk {
    public AnonymousClass7KN A00(AnonymousClass36K r8) {
        C160617ny r2;
        if (r8 == null) {
            return null;
        }
        AnonymousClass36K A0l = r8.A0l("subtotal");
        AnonymousClass36K A0l2 = r8.A0l("total");
        AnonymousClass36K A0l3 = r8.A0l("currency");
        String A0Q = AnonymousClass4L0.A0Q(r8.A0l("price_status"));
        if (A0l3 == null || C107575bX.A0F(A0l3.A0n())) {
            r2 = null;
        } else {
            r2 = new C160617ny(A0l3.A0n());
        }
        BigDecimal A0p = C86654Ky.A0p(r2, A0l2);
        BigDecimal A0p2 = C86654Ky.A0p(r2, A0l);
        if (A0Q == null || r2 == null || A0p == null || A0p2 == null) {
            return null;
        }
        return new AnonymousClass7KN(r2, A0p2, A0p);
    }
}
