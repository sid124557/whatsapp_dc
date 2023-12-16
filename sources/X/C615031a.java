package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.31a  reason: invalid class name and case insensitive filesystem */
public final class C615031a {
    public static boolean A00(C56422rx r3, AnonymousClass3LP r4, UserJid userJid) {
        return !A02(r4, userJid) && new C623134n(r3, (C48952fk) null, userJid).A02();
    }

    public static final boolean A01(AnonymousClass3LP r4, Jid jid) {
        C162457s7.A0J(r4, 0);
        if (jid == null) {
            return false;
        }
        AnonymousClass1VX r2 = r4.A00;
        C58422vE r1 = C58422vE.A02;
        if (A03(jid, r2.A0R(r1, 1035)) || A03(jid, r2.A0R(r1, 1036))) {
            return true;
        }
        return false;
    }

    public static final boolean A02(AnonymousClass3LP r2, Jid jid) {
        C162457s7.A0J(r2, 0);
        if (jid != null) {
            return A03(jid, r2.A00.A0R(C58422vE.A02, 1035));
        }
        return false;
    }

    public static final boolean A03(Jid jid, String str) {
        Iterable iterable;
        if (str == null || C175738Zn.A0V(str)) {
            return false;
        }
        List A01 = new C116975rB(",").A01(str, 0);
        if (!A01.isEmpty()) {
            ListIterator listIterator = A01.listIterator(A01.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        iterable = C73723fy.A0J(A01, listIterator.nextIndex() + 1);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        iterable = C72023d3.A00;
        return C73723fy.A0P(iterable).contains(jid.user);
    }
}
