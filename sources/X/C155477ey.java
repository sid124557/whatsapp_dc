package X;

import com.whatsapp.jid.PhoneUserJid;
import java.util.Collection;
import java.util.List;

/* renamed from: X.7ey  reason: invalid class name and case insensitive filesystem */
public final class C155477ey {
    public static final List A00;
    public static final C175718Zl A01;
    public static final C175718Zl A02;

    public static final boolean A00(C95814uZ r7) {
        if (r7 instanceof PhoneUserJid) {
            String str = r7.user;
            C162457s7.A0J(str, 0);
            C172438Lc A002 = C1453475d.A00(str, 10);
            if (A002 != null) {
                List<C172558Lr> list = A00;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (C172558Lr r4 : list) {
                        long j = A002.A00;
                        if (Long.compare(r4.A00 ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE) <= 0 && Long.compare(j ^ Long.MIN_VALUE, r4.A01 ^ Long.MIN_VALUE) <= 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    static {
        C175718Zl r6 = new C175718Zl(13135550000L, 13135559999L);
        A01 = r6;
        C175718Zl r1 = new C175718Zl(13165550000L, 13165550099L);
        A02 = r1;
        C175718Zl[] r0 = new C175718Zl[2];
        AnonymousClass000.A16(r6, r1, r0);
        A00 = AnonymousClass8UF.A0o(r0);
    }
}
