package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2Ud  reason: invalid class name and case insensitive filesystem */
public final class C43962Ud {
    public final C58672vd A00(String str, Map map) {
        Set set;
        C58672vd r0;
        Object obj;
        C162457s7.A0J(str, 0);
        ArrayList A0s = AnonymousClass001.A0s();
        if (map == null || (set = map.entrySet()) == null) {
            set = C72063d7.A00;
        }
        Iterator it = set.iterator();
        while (true) {
            Map map2 = null;
            if (!it.hasNext()) {
                return new C58672vd(str, (C58672vd[]) A0s.toArray(new C58672vd[0]));
            }
            Map.Entry A0w = AnonymousClass001.A0w(it);
            if (A0w.getValue() == null || !(A0w.getValue() instanceof Map)) {
                r0 = new C58672vd(C18310x6.A0q(A0w), (C58672vd[]) null);
            } else {
                String A0q = C18310x6.A0q(A0w);
                if (map != null) {
                    obj = AnonymousClass0x7.A0k(A0w, map);
                } else {
                    obj = null;
                }
                if (obj instanceof Map) {
                    map2 = (Map) obj;
                }
                r0 = A00(A0q, map2);
            }
            A0s.add(r0);
        }
    }
}
