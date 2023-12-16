package X;

import java.util.List;

/* renamed from: X.5Yz  reason: invalid class name and case insensitive filesystem */
public final class C106435Yz {
    public static final List A02 = AnonymousClass8UF.A0o("instagram.com", "www.instagram.com");
    public final AnonymousClass5MS A00;
    public final C106685Zz A01;

    public final boolean A01(C624134x r5, C624134x r6) {
        String str;
        C18270x1.A14(r5, r6);
        AnonymousClass5MS r0 = this.A00;
        AnonymousClass58L A002 = r0.A00(r5);
        AnonymousClass58L A003 = r0.A00(r6);
        if (!A00(r5) || !A00(r6) || A002 != A003) {
            return false;
        }
        C51962kf A0q = r5.A0q();
        String str2 = null;
        if (A0q != null) {
            str = A0q.A01;
        } else {
            str = null;
        }
        C51962kf A0q2 = r6.A0q();
        if (A0q2 != null) {
            str2 = A0q2.A01;
        }
        return C162457s7.A0P(str, str2);
    }

    public static final boolean A00(C624134x r2) {
        if (!(r2 instanceof C30481mW) || r2.A0r() == null || r2.A0q() == null) {
            return false;
        }
        return true;
    }

    public C106435Yz(AnonymousClass5MS r1, C106685Zz r2) {
        C18260x0.A0Q(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }
}
