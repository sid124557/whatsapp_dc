package X;

import java.util.List;
import java.util.Set;

/* renamed from: X.2e1  reason: invalid class name and case insensitive filesystem */
public final class C47902e1 {
    public final C06290Wz A00 = new C06290Wz();

    public boolean A01(Object obj, Object obj2) {
        C06290Wz r1 = this.A00;
        if (!r1.containsKey(obj) || !r1.containsKey(obj2)) {
            throw AnonymousClass001.A0c("All nodes must be present in the graph before being added as an edge");
        }
        List list = (List) r1.get(obj);
        if (list == null) {
            list = AnonymousClass001.A0s();
            r1.put(obj, list);
        }
        return list.add(obj2);
    }

    public final void A00(Object obj, List list, Set set) {
        if (list.contains(obj)) {
            return;
        }
        if (!set.contains(obj)) {
            set.add(obj);
            List<Object> list2 = (List) this.A00.get(obj);
            if (list2 != null) {
                for (Object A002 : list2) {
                    A00(A002, list, set);
                }
            }
            set.remove(obj);
            list.add(obj);
            return;
        }
        throw new AnonymousClass23W();
    }
}
