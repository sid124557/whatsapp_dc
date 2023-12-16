package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5A9  reason: invalid class name */
public final class AnonymousClass5A9 {
    public static final void A00(String str, HashMap hashMap, HashSet hashSet, List list) {
        List list2;
        if (hashSet.contains(str)) {
            throw new C118205tA("Dependency cycle detected in biz_value_features");
        } else if (!list.contains(str) && (list2 = (List) hashMap.get(str)) != null) {
            hashSet.add(str);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                String A0m = AnonymousClass001.A0m(it);
                if (!C162457s7.A0P(A0m, str)) {
                    A00(A0m, hashMap, hashSet, list);
                }
            }
            hashSet.remove(str);
            list.add(str);
        }
    }
}
