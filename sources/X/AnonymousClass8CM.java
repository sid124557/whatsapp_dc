package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.8CM  reason: invalid class name */
public abstract class AnonymousClass8CM implements C185838uK {
    public transient Map asMap;
    public transient Set keySet;
    public transient Collection values;

    public abstract Map createAsMap();

    public abstract Set createKeySet();

    public abstract Collection createValues();

    public abstract boolean put(Object obj, Object obj2);

    public abstract Iterator valueIterator();

    public Map asMap() {
        Map map = this.asMap;
        if (map != null) {
            return map;
        }
        Map createAsMap = createAsMap();
        this.asMap = createAsMap;
        return createAsMap;
    }

    public Set keySet() {
        Set set = this.keySet;
        if (set != null) {
            return set;
        }
        Set createKeySet = createKeySet();
        this.keySet = createKeySet;
        return createKeySet;
    }

    public Collection values() {
        Collection collection = this.values;
        if (collection != null) {
            return collection;
        }
        Collection createValues = createValues();
        this.values = createValues;
        return createValues;
    }

    public boolean containsValue(Object obj) {
        Iterator A0v = AnonymousClass001.A0v(asMap());
        while (A0v.hasNext()) {
            if (((Collection) A0v.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        return C154057cX.equalsImpl(this, obj);
    }

    public int hashCode() {
        return asMap().hashCode();
    }

    public boolean isEmpty() {
        return AnonymousClass000.A1T(size());
    }

    public String toString() {
        return asMap().toString();
    }
}
