package X;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2Ep  reason: invalid class name and case insensitive filesystem */
public class C40122Ep {
    public final Map A00 = new AnonymousClass05C();

    public C40122Ep(Map map) {
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            Object key = A0w.getKey();
            Object value = A0w.getValue();
            C626936e.A06(key);
            for (Object put : (Set) key) {
                this.A00.put(put, value);
            }
        }
    }
}
