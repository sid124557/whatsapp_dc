package X;

import com.whatsapp.jid.UserJid;
import java.util.Collection;

/* renamed from: X.7T1  reason: invalid class name */
public final class AnonymousClass7T1 {
    public final C56422rx A00;
    public final AnonymousClass1VX A01;
    public final AnonymousClass66R A02 = AnonymousClass8P7.A00(new AnonymousClass8WF(this));

    public final boolean A00(AnonymousClass3ZH r9) {
        UserJid userJid;
        Collection<C172558Lr> collection;
        C162457s7.A0J(r9, 0);
        C95814uZ A0H = r9.A0H();
        if (A0H instanceof UserJid) {
            userJid = (UserJid) A0H;
        } else {
            userJid = null;
        }
        if (r9.A0R() && userJid != null && this.A00.A03(userJid)) {
            String str = userJid.user;
            C162457s7.A0J(str, 0);
            C172438Lc A002 = C1453475d.A00(str, 10);
            if (A002 != null && ((collection = (Collection) this.A02.getValue()) == null || !collection.isEmpty())) {
                for (C172558Lr r4 : collection) {
                    long j = A002.A00;
                    if (Long.compare(r4.A00 ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE) <= 0 && Long.compare(j ^ Long.MIN_VALUE, r4.A01 ^ Long.MIN_VALUE) <= 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public AnonymousClass7T1(C56422rx r2, AnonymousClass1VX r3) {
        C18260x0.A0Q(r3, r2);
        this.A01 = r3;
        this.A00 = r2;
    }
}
