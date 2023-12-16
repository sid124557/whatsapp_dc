package X;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3g7  reason: invalid class name and case insensitive filesystem */
public class C73813g7 extends AnonymousClass8UG {
    public static final Object A07(Map map, Object obj) {
        C162457s7.A0J(map, 0);
        return C57692u3.A02(map, obj);
    }

    public static final HashMap A08(AnonymousClass3Z6... r2) {
        HashMap hashMap = new HashMap(AnonymousClass8UG.A0I(r2.length));
        A0H(hashMap, r2);
        return hashMap;
    }

    public static final LinkedHashMap A09(AnonymousClass3Z6... r1) {
        LinkedHashMap A0C = C18330xA.A0C(AnonymousClass8UG.A0I(r1.length));
        A0H(A0C, r1);
        return A0C;
    }

    public static final Map A0B(Iterable iterable) {
        Object next;
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return C72043d5.A00();
            }
            if (size != 1) {
                LinkedHashMap A0C = C18330xA.A0C(AnonymousClass8UG.A0I(collection.size()));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    AnonymousClass3Z6.A0A(A0C, it);
                }
                return A0C;
            }
            if (iterable instanceof List) {
                next = ((List) iterable).get(0);
            } else {
                next = iterable.iterator().next();
            }
            AnonymousClass3Z6 r0 = (AnonymousClass3Z6) next;
            C162457s7.A0J(r0, 0);
            Map singletonMap = Collections.singletonMap(r0.first, r0.second);
            C162457s7.A0D(singletonMap);
            return singletonMap;
        }
        LinkedHashMap A0r = C18320x8.A0r();
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            AnonymousClass3Z6.A0A(A0r, it2);
        }
        return A0C(A0r);
    }

    public static final Map A0D(Map map) {
        C162457s7.A0J(map, 0);
        int size = map.size();
        if (size == 0) {
            return C72043d5.A00();
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry A0w = AnonymousClass001.A0w(AnonymousClass000.A0q(map));
        Map singletonMap = Collections.singletonMap(A0w.getKey(), A0w.getValue());
        C162457s7.A0D(singletonMap);
        return singletonMap;
    }

    public static final Map A0F(AnonymousClass3Z6... r1) {
        int length = r1.length;
        if (length <= 0) {
            return C72043d5.A00();
        }
        LinkedHashMap A0C = C18330xA.A0C(AnonymousClass8UG.A0I(length));
        A0H(A0C, r1);
        return A0C;
    }

    public static final Map A0G(AnonymousClass3Z6... r1) {
        LinkedHashMap A0C = C18330xA.A0C(AnonymousClass8UG.A0I(r1.length));
        A0H(A0C, r1);
        return A0C;
    }

    public static final void A0H(Map map, AnonymousClass3Z6[] r5) {
        for (AnonymousClass3Z6 r0 : r5) {
            map.put(r0.first, r0.second);
        }
    }

    public static final Map A0A() {
        return C72043d5.A00();
    }

    public static final Map A0C(Map map) {
        int size = map.size();
        if (size == 0) {
            return C72043d5.A00();
        }
        if (size != 1) {
            return map;
        }
        Map.Entry A0w = AnonymousClass001.A0w(AnonymousClass000.A0q(map));
        Map singletonMap = Collections.singletonMap(A0w.getKey(), A0w.getValue());
        C162457s7.A0D(singletonMap);
        return singletonMap;
    }

    public static final Map A0E(Map map, AnonymousClass3Z6 r4) {
        if (map.isEmpty()) {
            C162457s7.A0J(r4, 0);
            Map singletonMap = Collections.singletonMap(r4.first, r4.second);
            C162457s7.A0D(singletonMap);
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(r4.first, r4.second);
        return linkedHashMap;
    }
}
