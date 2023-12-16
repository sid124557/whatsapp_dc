package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.1ws  reason: invalid class name and case insensitive filesystem */
public final class C35441ws extends C35561x4 implements C833548b {
    public C35441ws(List list) {
        C56052rL A04 = C56052rL.A04("accept_pay");
        C56052rL.A0D(A04, "service", "UPI");
        if (C626836d.A0O(list, 1, 10)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C41032Ir.A0F(A04, it);
            }
        }
        C41032Ir.A0A(A04, this);
    }
}
