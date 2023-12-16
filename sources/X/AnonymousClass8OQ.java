package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.SortedMap;

/* renamed from: X.8OQ  reason: invalid class name */
public abstract class AnonymousClass8OQ<K, V> implements Map<K, V>, Serializable {
    public static final Map.Entry[] EMPTY_ENTRY_ARRAY = new Map.Entry[0];
    public transient C129526aS entrySet;
    public transient C129526aS keySet;
    public transient C174098Sy values;

    public abstract C129526aS createEntrySet();

    public abstract C129526aS createKeySet();

    public abstract C174098Sy createValues();

    public abstract Object get(Object obj);

    public static C160667o6 builder() {
        return new C160667o6();
    }

    public static C160667o6 builderWithExpectedSize(int i) {
        C160937oh.checkNonnegative(i, "expectedSize");
        return new C160667o6(i);
    }

    public static AnonymousClass8OQ copyOf(Iterable iterable) {
        int i = 4;
        if (iterable instanceof Collection) {
            i = ((Collection) iterable).size();
        }
        C160667o6 r0 = new C160667o6(i);
        r0.putAll(iterable);
        return r0.build();
    }

    public C129526aS entrySet() {
        C129526aS r0 = this.entrySet;
        if (r0 != null) {
            return r0;
        }
        C129526aS createEntrySet = createEntrySet();
        this.entrySet = createEntrySet;
        return createEntrySet;
    }

    public C129526aS keySet() {
        C129526aS r0 = this.keySet;
        if (r0 != null) {
            return r0;
        }
        C129526aS createKeySet = createKeySet();
        this.keySet = createKeySet;
        return createKeySet;
    }

    public C174098Sy values() {
        C174098Sy r0 = this.values;
        if (r0 != null) {
            return r0;
        }
        C174098Sy createValues = createValues();
        this.values = createValues;
        return createValues;
    }

    public Object writeReplace() {
        return new AnonymousClass8LB(this);
    }

    public static AnonymousClass8OQ of(Object obj, Object obj2) {
        C160937oh.checkEntryNotNull(obj, obj2);
        Object[] A1a = C18310x6.A1a(obj);
        A1a[1] = obj2;
        return C129606aa.create(1, A1a);
    }

    @Deprecated
    public final void clear() {
        throw C18320x8.A0m();
    }

    public boolean containsKey(Object obj) {
        return AnonymousClass000.A1W(get(obj));
    }

    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public boolean equals(Object obj) {
        return C162057r9.equalsImpl(this, obj);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    public int hashCode() {
        return C162207rR.hashCodeImpl(entrySet());
    }

    public boolean isEmpty() {
        return AnonymousClass000.A1T(size());
    }

    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw C18320x8.A0m();
    }

    @Deprecated
    public final void putAll(Map map) {
        throw C18320x8.A0m();
    }

    @Deprecated
    public final Object remove(Object obj) {
        throw C18320x8.A0m();
    }

    public String toString() {
        return C162057r9.toStringImpl(this);
    }

    public static AnonymousClass8OQ copyOf(Map map) {
        if (!(map instanceof AnonymousClass8OQ) || (map instanceof SortedMap)) {
            return copyOf((Iterable) map.entrySet());
        }
        return (AnonymousClass8OQ) map;
    }

    public static AnonymousClass8OQ of(Object obj, Object obj2, Object obj3, Object obj4) {
        C160937oh.checkEntryNotNull(obj, obj2);
        C160937oh.checkEntryNotNull(obj3, obj4);
        Object[] objArr = new Object[4];
        AnonymousClass000.A16(obj, obj2, objArr);
        objArr[2] = obj3;
        objArr[3] = obj4;
        return C129606aa.create(2, objArr);
    }

    public static AnonymousClass8OQ of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        C160937oh.checkEntryNotNull(obj, obj2);
        C160937oh.checkEntryNotNull(obj3, obj4);
        C160937oh.checkEntryNotNull(obj5, obj6);
        C160937oh.checkEntryNotNull(obj7, obj8);
        C160937oh.checkEntryNotNull(obj9, obj10);
        Object[] A1Z = AnonymousClass6C9.A1Z(obj, 10);
        AnonymousClass000.A11(obj2, obj3, obj4, obj5, A1Z);
        A1Z[5] = obj6;
        A1Z[6] = obj7;
        A1Z[7] = obj8;
        A1Z[8] = obj9;
        A1Z[9] = obj10;
        return C129606aa.create(5, A1Z);
    }

    public static AnonymousClass8OQ of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        C160937oh.checkEntryNotNull(obj, "9314a74762f36e6f5bf6cdef5054f1630cafbe42269c2ef6e987de45b836e3a9");
        C160937oh.checkEntryNotNull(obj3, "418ba26569faa19bb4349abe25cfcc95ff4c9d2381d7ee5d1316123d69197581");
        C160937oh.checkEntryNotNull(obj5, "6dacaf20921b2ce236ea3dc5605a044d391d85d43ea9ded96c750283e0f3a5d8");
        C160937oh.checkEntryNotNull(obj7, "5e393972fefea10ed23589622eecf0bc53b6e83d4376009791003b42978a246d");
        Object[] objArr = new Object[8];
        C18260x0.A0i(obj, "9314a74762f36e6f5bf6cdef5054f1630cafbe42269c2ef6e987de45b836e3a9", obj3, objArr);
        objArr[3] = "418ba26569faa19bb4349abe25cfcc95ff4c9d2381d7ee5d1316123d69197581";
        objArr[4] = obj5;
        AnonymousClass0x2.A1D("6dacaf20921b2ce236ea3dc5605a044d391d85d43ea9ded96c750283e0f3a5d8", obj7, "5e393972fefea10ed23589622eecf0bc53b6e83d4376009791003b42978a246d", objArr);
        return C129606aa.create(4, objArr);
    }

    public static AnonymousClass8OQ of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        C160937oh.checkEntryNotNull(obj, obj2);
        C160937oh.checkEntryNotNull(obj3, obj4);
        C160937oh.checkEntryNotNull(obj5, obj6);
        Object[] objArr = new Object[6];
        C18260x0.A0i(obj, obj2, obj3, objArr);
        objArr[3] = obj4;
        objArr[4] = obj5;
        objArr[5] = obj6;
        return C129606aa.create(3, objArr);
    }

    public static AnonymousClass8OQ of() {
        return C129606aa.EMPTY;
    }
}
