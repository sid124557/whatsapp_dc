package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7r9  reason: invalid class name and case insensitive filesystem */
public final class C162057r9 {
    public static int capacity(int i) {
        if (i < 3) {
            C160937oh.checkNonnegative(i, "expectedSize");
            return i + 1;
        } else if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    public static boolean equalsImpl(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static Map.Entry immutableEntry(Object obj, Object obj2) {
        return new C129346aA(obj, obj2);
    }

    public static Iterator valueIterator(Iterator it) {
        return new C129926b6(it);
    }

    public static boolean safeContainsKey(Map map, Object obj) {
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static Object safeGet(Map map, Object obj) {
        map.getClass();
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static Object safeRemove(Map map, Object obj) {
        map.getClass();
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static String toStringImpl(Map map) {
        StringBuilder newStringBuilderForCollection = C161497pn.newStringBuilderForCollection(map.size());
        newStringBuilderForCollection.append('{');
        Iterator A0q = AnonymousClass000.A0q(map);
        boolean z = true;
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            if (!z) {
                AnonymousClass001.A1M(newStringBuilderForCollection);
            }
            newStringBuilderForCollection.append(A0w.getKey());
            newStringBuilderForCollection.append('=');
            newStringBuilderForCollection.append(A0w.getValue());
            z = false;
        }
        return AnonymousClass000.A0d(newStringBuilderForCollection);
    }
}
