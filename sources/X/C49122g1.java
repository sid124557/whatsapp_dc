package X;

import com.whatsapp.Me;

/* renamed from: X.2g1  reason: invalid class name and case insensitive filesystem */
public final class C49122g1 {
    public final C56972sr A00;
    public final C620733j A01;
    public final C106675Zy A02;

    public final String A00() {
        String A0w;
        Me A002 = C56972sr.A00(this.A00);
        if (A002 == null || (A0w = AnonymousClass0x9.A0w(A002)) == null || A0w.length() == 0) {
            return "ZZ";
        }
        return A0w;
    }

    public final String A01(String str) {
        String A022;
        if (C162457s7.A0P(str, "Global")) {
            return "Global";
        }
        if (str != null && (A022 = this.A02.A02(this.A01, str)) != null) {
            return A022;
        }
        Me A002 = C56972sr.A00(this.A00);
        if (A002 != null) {
            return this.A02.A02(this.A01, AnonymousClass0x9.A0w(A002));
        }
        return null;
    }

    public C49122g1(C56972sr r1, C620733j r2, C106675Zy r3) {
        C18260x0.A0V(r1, r3, r2);
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}
