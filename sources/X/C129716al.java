package X;

import java.util.Map;

/* renamed from: X.6al  reason: invalid class name and case insensitive filesystem */
public class C129716al<K, V> extends C129526aS<Map.Entry<K, V>> {
    public final transient Object[] alternatingKeysAndValues;
    public final transient AnonymousClass8OQ map;
    public final transient int size;

    public static /* synthetic */ int access$200(C129716al r0) {
        return 0;
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        if (value == null || !value.equals(this.map.get(key))) {
            return false;
        }
        return true;
    }

    public C129586aY createAsList() {
        return new C129546aU(this);
    }

    public boolean isPartialView() {
        return true;
    }

    public int size() {
        return this.size;
    }

    public C129716al(AnonymousClass8OQ r1, Object[] objArr, int i, int i2) {
        this.map = r1;
        this.alternatingKeysAndValues = objArr;
        this.size = i2;
    }

    public int copyIntoArray(Object[] objArr, int i) {
        return asList().copyIntoArray(objArr, i);
    }

    public C172878Nf iterator() {
        return asList().iterator();
    }
}
