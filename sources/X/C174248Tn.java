package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.8Tn  reason: invalid class name and case insensitive filesystem */
public final class C174248Tn extends LinkedHashMap {
    public static final C174248Tn A00;
    public boolean zzb = true;

    static {
        C174248Tn r1 = new C174248Tn();
        A00 = r1;
        r1.zzb = false;
    }

    public final void clear() {
        if (this.zzb) {
            super.clear();
            return;
        }
        throw C18320x8.A0m();
    }

    public final boolean equals(Object obj) {
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

    public final Object put(Object obj, Object obj2) {
        if (this.zzb) {
            obj.getClass();
            obj2.getClass();
            return super.put(obj, obj2);
        }
        throw C18320x8.A0m();
    }

    public final void putAll(Map map) {
        if (this.zzb) {
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
        if (this.zzb) {
            return super.remove(obj);
        }
        throw C18320x8.A0m();
    }

    public C174248Tn(Map map) {
        super(map);
    }

    public final Set entrySet() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        return super.entrySet();
    }

    public final int hashCode() {
        int i;
        int i2;
        Iterator A0u = AnonymousClass001.A0u(this);
        int i3 = 0;
        while (A0u.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0u);
            Object key = A0w.getKey();
            if (key instanceof byte[]) {
                i = r2;
                for (byte b : (byte[]) key) {
                    i = (i * 31) + b;
                }
                if (i == 0) {
                    i = 1;
                }
            } else {
                i = key.hashCode();
            }
            Object value = A0w.getValue();
            if (value instanceof byte[]) {
                i2 = r3;
                for (byte b2 : (byte[]) value) {
                    i2 = (i2 * 31) + b2;
                }
                if (i2 == 0) {
                    i2 = 1;
                }
            } else {
                i2 = value.hashCode();
            }
            i3 += i2 ^ i;
        }
        return i3;
    }

    public C174248Tn() {
    }
}
