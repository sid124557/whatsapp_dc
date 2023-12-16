package X;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: X.2u3  reason: invalid class name and case insensitive filesystem */
public class C57692u3 {
    public static int A00(Iterable iterable) {
        int A0I = AnonymousClass8UG.A0I(C73783g4.A0b(iterable, 10));
        if (A0I < 16) {
            return 16;
        }
        return A0I;
    }

    public static int A01(Iterable iterable) {
        int A0I = AnonymousClass8UG.A0I(C73783g4.A0b(iterable, 10));
        if (A0I < 16) {
            return 16;
        }
        return A0I;
    }

    public static final Object A02(Map map, Object obj) {
        if (map instanceof C72053d6) {
            C72053d6 r2 = (C72053d6) map;
            Map map2 = r2.A00;
            Object obj2 = map2.get(obj);
            if (obj2 != null || map2.containsKey(obj)) {
                return obj2;
            }
            return r2.A01.invoke(obj);
        }
        Object obj3 = map.get(obj);
        if (obj3 != null || map.containsKey(obj)) {
            return obj3;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Key ");
        A0o.append(obj);
        throw new NoSuchElementException(AnonymousClass000.A0X(" is missing in the map.", A0o));
    }

    public static Map A04(Object obj, Object obj2) {
        AnonymousClass3Z6 r0 = new AnonymousClass3Z6(obj, obj2);
        Map singletonMap = Collections.singletonMap(r0.first, r0.second);
        C162457s7.A0D(singletonMap);
        return singletonMap;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.3d6, java.util.Map] */
    public static final Map A05(Map map, AnonymousClass4GQ r2) {
        if (map instanceof C72053d6) {
            return A05(((C72053d6) map).A00, r2);
        }
        return new C72053d6(map, r2);
    }

    public static LinkedHashMap A03(AbstractMap abstractMap) {
        return new LinkedHashMap(AnonymousClass8UG.A0I(abstractMap.size()));
    }
}
