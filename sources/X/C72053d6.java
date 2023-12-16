package X;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.collections.MutableMapWithDefault;

/* renamed from: X.3d6  reason: invalid class name and case insensitive filesystem */
public final class C72053d6<K, V> implements MutableMapWithDefault<K, V>, C834348j, AnonymousClass4GZ {
    public final Map A00;
    public final AnonymousClass4GQ A01;

    public void putAll(Map map) {
        C162457s7.A0J(map, 0);
        this.A00.putAll(map);
    }

    public void clear() {
        this.A00.clear();
    }

    public boolean containsKey(Object obj) {
        return this.A00.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return this.A00.containsValue(obj);
    }

    public final /* bridge */ Set entrySet() {
        return this.A00.entrySet();
    }

    public boolean equals(Object obj) {
        return this.A00.equals(obj);
    }

    public Object get(Object obj) {
        return this.A00.get(obj);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public final /* bridge */ Set keySet() {
        return this.A00.keySet();
    }

    public Object put(Object obj, Object obj2) {
        return this.A00.put(obj, obj2);
    }

    public Object remove(Object obj) {
        return this.A00.remove(obj);
    }

    public final /* bridge */ int size() {
        return this.A00.size();
    }

    public String toString() {
        return this.A00.toString();
    }

    public final /* bridge */ Collection values() {
        return this.A00.values();
    }

    public C72053d6(Map map, AnonymousClass4GQ r2) {
        this.A00 = map;
        this.A01 = r2;
    }
}
