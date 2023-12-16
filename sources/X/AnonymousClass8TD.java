package X;

import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Set;

/* renamed from: X.8TD  reason: invalid class name */
public class AnonymousClass8TD<K, V> extends AbstractMap<V, K> implements AnonymousClass4GN<V, K>, Serializable {
    public final AnonymousClass8TE forward;
    public transient Set inverseEntrySet;

    public void clear() {
        this.forward.clear();
    }

    public boolean containsKey(Object obj) {
        return this.forward.containsValue(obj);
    }

    public boolean containsValue(Object obj) {
        return this.forward.containsKey(obj);
    }

    public Set entrySet() {
        Set set = this.inverseEntrySet;
        if (set != null) {
            return set;
        }
        C129466aM r1 = new C129466aM(this.forward);
        this.inverseEntrySet = r1;
        return r1;
    }

    public Object get(Object obj) {
        return this.forward.getInverse(obj);
    }

    public Set keySet() {
        return this.forward.values();
    }

    public Object put(Object obj, Object obj2) {
        return this.forward.putInverse(obj, obj2, false);
    }

    public Object remove(Object obj) {
        return this.forward.removeInverse(obj);
    }

    public int size() {
        return this.forward.size;
    }

    public Set values() {
        return this.forward.keySet();
    }

    public AnonymousClass8TD(AnonymousClass8TE r1) {
        this.forward = r1;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        AnonymousClass4GN unused = this.forward.inverse = this;
    }
}
