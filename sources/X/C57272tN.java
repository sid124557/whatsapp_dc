package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: X.2tN  reason: invalid class name and case insensitive filesystem */
public final class C57272tN {
    public static final Map A01(Map map) {
        C162457s7.A0J(map, 0);
        Set entrySet = map.entrySet();
        LinkedHashMap A0r = C18320x8.A0r();
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(it);
            ((List) C18310x6.A0h(A0w.getValue(), A0r)).add(A0w.getKey());
        }
        return A0r;
    }

    public static final Object A00(Collection collection) {
        if (!AnonymousClass0x7.A1T(collection)) {
            return collection.iterator().next();
        }
        throw new NoSuchElementException();
    }
}
