package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.8Dj  reason: invalid class name and case insensitive filesystem */
public class C170488Dj implements C181488mq {
    public Object BGp(C172478Lh r5, C158627kI r6, Object obj, String str, List list) {
        StringBuilder A0o = AnonymousClass001.A0o();
        C187038wL r1 = r6.A01.A00;
        if (obj instanceof List) {
            for (Object next : r1.Bqo(obj)) {
                if (next instanceof String) {
                    AnonymousClass000.A1B(next, A0o);
                }
            }
        }
        if (list != null) {
            Iterator it = C161297pO.A00(r6, String.class, list).iterator();
            while (it.hasNext()) {
                A0o.append(AnonymousClass001.A0m(it));
            }
        }
        return A0o.toString();
    }
}
