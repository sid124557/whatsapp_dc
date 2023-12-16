package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.8To  reason: invalid class name and case insensitive filesystem */
public final class C174258To<K, V> extends LinkedHashMap<K, V> {
    public static final C174258To A00;
    public boolean zzfa = true;

    static {
        C174258To r1 = new C174258To();
        A00 = r1;
        r1.zzfa = false;
    }

    public static int A00(Object obj) {
        if (obj instanceof byte[]) {
            int i = r3;
            for (byte b : (byte[]) obj) {
                i = (i * 31) + b;
            }
            if (i == 0) {
                return 1;
            }
            return i;
        } else if (!(obj instanceof C178538hh)) {
            return obj.hashCode();
        } else {
            throw C18320x8.A0m();
        }
    }

    public final void clear() {
        if (this.zzfa) {
            super.clear();
            return;
        }
        throw C18320x8.A0m();
    }

    public final boolean equals(Object obj) {
        boolean equals;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    Iterator A0u = AnonymousClass001.A0u(this);
                    while (A0u.hasNext()) {
                        Map.Entry A0w = AnonymousClass001.A0w(A0u);
                        if (map.containsKey(A0w.getKey())) {
                            Object value = A0w.getValue();
                            Object A0k = AnonymousClass0x7.A0k(A0w, map);
                            if (!(value instanceof byte[]) || !(A0k instanceof byte[])) {
                                equals = value.equals(A0k);
                                continue;
                            } else {
                                equals = Arrays.equals((byte[]) value, (byte[]) A0k);
                                continue;
                            }
                            if (!equals) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final Object put(Object obj, Object obj2) {
        if (this.zzfa) {
            obj.getClass();
            obj2.getClass();
            return super.put(obj, obj2);
        }
        throw C18320x8.A0m();
    }

    public final void putAll(Map map) {
        if (this.zzfa) {
            Iterator A0i = C18280x3.A0i(map);
            while (A0i.hasNext()) {
                Object next = A0i.next();
                next.getClass();
                map.get(next).getClass();
            }
            super.putAll(map);
            return;
        }
        throw C18320x8.A0m();
    }

    public final Object remove(Object obj) {
        if (this.zzfa) {
            return super.remove(obj);
        }
        throw C18320x8.A0m();
    }

    public C174258To(Map map) {
        super(map);
    }

    public final Set entrySet() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        return super.entrySet();
    }

    public final int hashCode() {
        Iterator A0u = AnonymousClass001.A0u(this);
        int i = 0;
        while (A0u.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0u);
            i += A00(A0w.getValue()) ^ A00(A0w.getKey());
        }
        return i;
    }

    public C174258To() {
    }
}
