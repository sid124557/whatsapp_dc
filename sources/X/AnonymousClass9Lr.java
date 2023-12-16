package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9Lr  reason: invalid class name */
public final class AnonymousClass9Lr {
    public static final List A00(List list, List list2) {
        AnonymousClass39W r0;
        AnonymousClass39S r1;
        ArrayList A0s = AnonymousClass001.A0s();
        if (!list2.isEmpty()) {
            HashMap A0t = AnonymousClass001.A0t();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C1899593h.A1T(A0t, it);
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            AnonymousClass000.A1H("PaymentContactFilterUtils/filterTopCheckoutContacts latestCheckoutMessages size: ", A0o, list2);
            AnonymousClass0x2.A18(A0o);
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                C30791n7 r6 = (C30791n7) it2.next();
                C95814uZ r12 = r6.A1J.A00;
                String str = null;
                if (r12 != null) {
                    str = r12.getRawString();
                }
                Object obj = A0t.get(str);
                if (!(obj == null || A0s.contains(obj) || (r0 = r6.A00) == null || (r1 = r0.A01) == null)) {
                    if (AnonymousClass39S.A00(r1.A07.A01) != 1 || r1.A04 != null || r1.A05) {
                        A0s.add(obj);
                    }
                }
            }
            C18260x0.A1A("PaymentContactFilterUtils/filterTopCheckoutContacts paidMerchantContacts size: ", AnonymousClass001.A0o(), A0s);
        }
        return A0s;
    }
}
