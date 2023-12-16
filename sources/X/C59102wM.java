package X;

import java.util.Map;

/* renamed from: X.2wM  reason: invalid class name and case insensitive filesystem */
public final class C59102wM {
    public final AnonymousClass1VX A00;

    public C59102wM(AnonymousClass1VX r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public final C370820w A01(C60742z5 r5, C53832nk r6, String str) {
        C162457s7.A0J(r6, 0);
        C60162y6 A002 = C60162y6.A00("2.23.26.14");
        if (r5 == null || A002 == null || this.A00.A0Y(C58422vE.A02, 5247)) {
            return C370820w.VALID;
        }
        C370820w A003 = A00(A002, String.valueOf(r6.A01), r5.A02);
        C370820w r2 = C370820w.VALID;
        if (A003 == r2 && (A003 = A00(A002, r6.A02, r5.A00)) == r2 && (str == null || (A003 = A00(A002, str, r5.A01)) == r2)) {
            return r2;
        }
        return A003;
    }

    public static final C370820w A00(C60162y6 r2, String str, Map map) {
        String str2;
        String str3;
        C60162y6 A002;
        C60162y6 A003;
        if (str == null) {
            str = "";
        }
        Map A1B = AnonymousClass0x9.A1B(str, map);
        if (A1B == null) {
            return C370820w.UNKNOWN_VERSION;
        }
        C51672kC r1 = (C51672kC) A1B.get("beta");
        if (r1 == null || (((str2 = r1.A01) != null && (A003 = C60162y6.A00(str2)) != null && r2.A01(A003) < 0) || ((str3 = r1.A00) != null && (A002 = C60162y6.A00(str3)) != null && r2.A01(A002) > 0))) {
            return C370820w.NOT_COMPATIBLE;
        }
        return C370820w.VALID;
    }
}
