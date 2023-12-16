package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.8Tq  reason: invalid class name and case insensitive filesystem */
public final class C174278Tq<K, V> extends LinkedHashMap<K, V> {
    public static final C174278Tq A00;
    public boolean isMutable = true;

    static {
        C174278Tq r1 = new C174278Tq();
        A00 = r1;
        r1.isMutable = false;
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
        } else if (!(obj instanceof C181358md)) {
            return obj.hashCode();
        } else {
            throw C18320x8.A0m();
        }
    }

    public void clear() {
        if (this.isMutable) {
            super.clear();
            return;
        }
        throw C18320x8.A0m();
    }

    public boolean equals(Object obj) {
        boolean equals;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        Iterator A0u = AnonymousClass001.A0u(this);
        while (A0u.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0u);
            if (!map.containsKey(A0w.getKey())) {
                return false;
            }
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
                return false;
            }
        }
        return true;
    }

    public Object put(Object obj, Object obj2) {
        if (this.isMutable) {
            obj.getClass();
            obj2.getClass();
            return super.put(obj, obj2);
        }
        throw C18320x8.A0m();
    }

    public void putAll(Map map) {
        if (this.isMutable) {
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

    public Object remove(Object obj) {
        if (this.isMutable) {
            return super.remove(obj);
        }
        throw C18320x8.A0m();
    }

    public C174278Tq(Map map) {
        super(map);
    }

    public C174278Tq A01() {
        C174278Tq r0;
        if (isEmpty()) {
            return r0;
        }
        r0 = new C174278Tq(this);
        return r0;
    }

    public Set entrySet() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        return super.entrySet();
    }

    public int hashCode() {
        Iterator A0u = AnonymousClass001.A0u(this);
        int i = 0;
        while (A0u.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0u);
            i += A00(A0w.getValue()) ^ A00(A0w.getKey());
        }
        return i;
    }

    public C174278Tq() {
    }
}
