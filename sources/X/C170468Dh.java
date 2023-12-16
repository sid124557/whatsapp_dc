package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.8Dh  reason: invalid class name and case insensitive filesystem */
public class C170468Dh implements C181488mq {
    public Object BGp(C172478Lh r6, C158627kI r7, Object obj, String str, List list) {
        C187038wL r4 = r7.A01.A00;
        if (list != null && list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C161297pO r2 = (C161297pO) it.next();
                if (obj instanceof List) {
                    r4.Bli(obj, r4.BJg(obj), r2.A01.get());
                }
            }
        }
        return obj;
    }
}
