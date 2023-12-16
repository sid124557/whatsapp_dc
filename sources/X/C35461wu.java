package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.1wu  reason: invalid class name and case insensitive filesystem */
public final class C35461wu extends C35561x4 implements C833548b {
    public C35461wu(C35321wg r6, List list) {
        C56052rL A04 = C56052rL.A04("config");
        if (C626836d.A0O(list, 0, Long.MAX_VALUE)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C41032Ir.A0F(A04, it);
            }
        }
        C41032Ir.A0C(A04, r6, this);
    }
}
