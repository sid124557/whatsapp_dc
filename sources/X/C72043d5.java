package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3d5  reason: invalid class name and case insensitive filesystem */
public final class C72043d5 implements Map, Serializable, C834348j {
    public static final C72043d5 A00 = new C72043d5();
    public static final long serialVersionUID = 8246714829545688274L;

    public static C72043d5 A00() {
        C72043d5 r1 = A00;
        C162457s7.A0K(r1, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return r1;
    }

    public boolean containsKey(Object obj) {
        return false;
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Map) || !((Map) obj).isEmpty()) {
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    private final Object readResolve() {
        return A00;
    }

    public void clear() {
        throw C18290x4.A0x();
    }

    public final /* bridge */ Set entrySet() {
        return C72063d7.A00;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public final /* bridge */ Set keySet() {
        return C72063d7.A00;
    }

    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw C18290x4.A0x();
    }

    public void putAll(Map map) {
        throw C18290x4.A0x();
    }

    public /* bridge */ /* synthetic */ Object remove(Object obj) {
        throw C18290x4.A0x();
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public String toString() {
        return "{}";
    }

    public final /* bridge */ Collection values() {
        return C72023d3.A00;
    }
}
