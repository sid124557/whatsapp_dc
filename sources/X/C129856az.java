package X;

import java.util.Map;

/* renamed from: X.6az  reason: invalid class name and case insensitive filesystem */
public class C129856az<K, V> extends AnonymousClass8TG<K> {
    public final Map map;

    public Map map() {
        return this.map;
    }

    public C129856az(Map map2) {
        map2.getClass();
        this.map = map2;
    }

    public boolean contains(Object obj) {
        return map().containsKey(obj);
    }

    public boolean isEmpty() {
        return map().isEmpty();
    }

    public int size() {
        return map().size();
    }
}
