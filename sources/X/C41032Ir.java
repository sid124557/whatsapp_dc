package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.2Ir  reason: invalid class name and case insensitive filesystem */
public abstract class C41032Ir {
    public AnonymousClass36K A00;

    public static AnonymousClass36K A02(AnonymousClass36K r1, C41032Ir r2) {
        AnonymousClass36K.A0N(r1, "iq");
        return r2.A00;
    }

    public static AnonymousClass36K A04(C56052rL r1, C41032Ir r2, C41032Ir r3) {
        r1.A0I(r2.A00);
        r1.A0I(r3.A00);
        return r1.A0F();
    }

    public static AnonymousClass36K A05(C41032Ir r0) {
        AnonymousClass36K r02 = r0.A00;
        C162457s7.A0D(r02);
        return r02;
    }

    public static void A08(C56052rL r1, C41032Ir r2) {
        r1.A0I(r2.A00);
    }

    public static void A09(C56052rL r1, C41032Ir r2) {
        r1.A0I(r2.A00);
    }

    public static void A0B(C56052rL r1, C41032Ir r2) {
        if (r2 != null) {
            r1.A0H(r2.A00);
        }
    }

    public static void A0C(C56052rL r1, C41032Ir r2, C41032Ir r3) {
        r1.A0I(r2.A00);
        r3.A00 = r1.A0F();
    }

    public static void A0D(C56052rL r1, C41032Ir r2, C41032Ir r3) {
        r1.A0I(r2.A00);
        r3.A00 = r1.A0F();
    }

    public static void A0E(C56052rL r2, C41032Ir r3, String str) {
        C56052rL r1 = new C56052rL(str);
        r1.A0I(r3.A00);
        r2.A0H(r1.A0F());
    }

    public static boolean A0G(List list) {
        return C626836d.A0O(list, 1, 1000);
    }

    public static AnonymousClass36K A03(C56052rL r0, C56052rL r1, C41032Ir r2) {
        r1.A0H(r0.A0F());
        r1.A0I(r2.A00);
        return r1.A0F();
    }

    public static void A06(C56052rL r0, C56052rL r1, C41032Ir r2) {
        r1.A0H(r0.A0F());
        r2.A00 = r1.A0F();
    }

    public static void A07(C56052rL r0, C56052rL r1, C41032Ir r2, C41032Ir r3) {
        r1.A0H(r0.A0F());
        r1.A0I(r2.A00);
        r3.A00 = r1.A0F();
    }

    public static void A0A(C56052rL r0, C41032Ir r1) {
        r1.A00 = r0.A0F();
    }

    public static void A0F(C56052rL r1, Iterator it) {
        r1.A0H(((C41032Ir) it.next()).A00);
    }
}
