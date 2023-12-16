package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0T5  reason: invalid class name */
public final class AnonymousClass0T5 {
    public static final AnonymousClass0T5 A02 = new AnonymousClass0T5(C73813g7.A0A(), C73833g9.A04());
    public final Map A00;
    public final Set A01;

    public AnonymousClass0T5(Map map, Set set) {
        this.A01 = set;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            linkedHashMap.put(A0w.getKey(), A0w.getValue());
        }
        this.A00 = linkedHashMap;
    }
}
