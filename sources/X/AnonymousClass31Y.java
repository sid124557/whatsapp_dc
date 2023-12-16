package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.31Y  reason: invalid class name */
public final class AnonymousClass31Y {
    public static final boolean A01(C56892sj r4, AnonymousClass3ZH r5, C52472lX r6) {
        C27991fJ A03;
        C162457s7.A0J(r4, 0);
        C18260x0.A0Q(r6, r5);
        if (r6.A01(r5) || r6.A00(r5) || (A03 = AnonymousClass34R.A03(r5.A0H)) == null) {
            return false;
        }
        if (r4.A0D(A03) || (AnonymousClass001.A1T(r5.A04) && r4.A0C(A03))) {
            return true;
        }
        return false;
    }

    public static final boolean A02(AnonymousClass3ZH r1) {
        C162457s7.A0J(r1, 0);
        return AnonymousClass001.A1T(r1.A04);
    }

    public static final boolean A00(C56982ss r3, C56892sj r4, C30341mI r5) {
        C95814uZ r1;
        C18260x0.A0Q(r3, r4);
        C27991fJ A02 = AnonymousClass2z0.A02(r5);
        if (r5.A1v()) {
            r1 = r5.A0n();
        } else {
            r1 = null;
        }
        if (A02 == null || !(r1 instanceof UserJid) || !r4.A0D(A02) || r3.A0N(A02) || r4.A0I(A02, (UserJid) r1)) {
            return false;
        }
        return true;
    }
}
