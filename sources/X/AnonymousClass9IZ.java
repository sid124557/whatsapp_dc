package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.9IZ  reason: invalid class name */
public final class AnonymousClass9IZ extends C35201wU {
    public AnonymousClass9IZ(C35371wl r7, List list) {
        C56052rL A01 = C56052rL.A01();
        C56052rL A0U = C1899593h.A0U();
        C56052rL.A0D(A0U, "action", "get-contacts-payment-status");
        if (C626836d.A0O(list, 0, Long.MAX_VALUE)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0U.A0H(((C41032Ir) it.next()).A00);
            }
        }
        C35201wU.A01(A0U, A01, r7, this);
    }
}
