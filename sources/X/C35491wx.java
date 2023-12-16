package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.1wx  reason: invalid class name and case insensitive filesystem */
public class C35491wx extends C35561x4 implements C833548b {
    public C35491wx(List list) {
        C56052rL A04 = C56052rL.A04("sub_group_suggestion");
        if (C41032Ir.A0G(list)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C41032Ir.A0F(A04, it);
            }
        }
        C41032Ir.A0A(A04, this);
    }

    public C35491wx(C35251wZ r10, String str) {
        C56052rL A04 = C56052rL.A04("sub_group_suggestion");
        C41032Ir.A0B(A04, r10);
        C56052rL A042 = C56052rL.A04("subject");
        if (C626836d.A0M(str, 1, 65536, false)) {
            A042.A0J(str);
        }
        C41032Ir.A06(A042, A04, this);
    }
}
