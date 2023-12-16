package X;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: X.2aa  reason: invalid class name and case insensitive filesystem */
public class C45792aa {
    public final C41212Jj A00;
    public final AnonymousClass4AM A01;
    public final Map A02 = new AnonymousClass05C();
    public final Map A03 = new AnonymousClass05C();

    public final C41212Jj A00(String str) {
        Object value;
        Map map = this.A02;
        if (map.containsKey(str)) {
            value = map.get(str);
        } else {
            Iterator A0q = AnonymousClass000.A0q(this.A03);
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                if (C18280x3.A1X(str, (Pattern) A0w.getKey())) {
                    value = A0w.getValue();
                }
            }
            return this.A00;
        }
        return (C41212Jj) value;
    }

    public C45792aa(C41212Jj r6, AnonymousClass4AM r7, Map map, Map map2) {
        this.A01 = r7;
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            Object key = A0w.getKey();
            Object value = A0w.getValue();
            C626936e.A06(key);
            for (Object put : (Set) key) {
                this.A02.put(put, value);
            }
        }
        Iterator A0q2 = AnonymousClass000.A0q(map2);
        while (A0q2.hasNext()) {
            Map.Entry A0w2 = AnonymousClass001.A0w(A0q2);
            Object key2 = A0w2.getKey();
            Object value2 = A0w2.getValue();
            C626936e.A06(key2);
            for (Object put2 : (Set) key2) {
                this.A03.put(put2, value2);
            }
        }
        this.A00 = r6;
    }
}
