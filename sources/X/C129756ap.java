package X;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6ap  reason: invalid class name and case insensitive filesystem */
public class C129756ap extends AnonymousClass8TB<K, Collection<V>> {
    public final transient Map submap;
    public final /* synthetic */ C129366aC this$0;

    public C129756ap(C129366aC r1, Map map) {
        this.this$0 = r1;
        this.submap = map;
    }

    public void clear() {
        Map map = this.submap;
        C129366aC r1 = this.this$0;
        if (map == r1.map) {
            r1.clear();
        } else {
            C162467s8.clear(new C172998Nv(this));
        }
    }

    public boolean containsKey(Object obj) {
        return C162057r9.safeContainsKey(this.submap, obj);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Set, X.6b2] */
    public Set createEntrySet() {
        return new C129886b2(this);
    }

    public boolean equals(Object obj) {
        if (this == obj || this.submap.equals(obj)) {
            return true;
        }
        return false;
    }

    public Collection get(Object obj) {
        Collection collection = (Collection) C162057r9.safeGet(this.submap, obj);
        if (collection == null) {
            return null;
        }
        return this.this$0.wrapCollection(obj, collection);
    }

    public int hashCode() {
        return this.submap.hashCode();
    }

    public Set keySet() {
        return this.this$0.keySet();
    }

    public Collection remove(Object obj) {
        Collection collection = (Collection) this.submap.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection createCollection = this.this$0.createCollection();
        createCollection.addAll(collection);
        C129366aC.access$220(this.this$0, collection.size());
        collection.clear();
        return createCollection;
    }

    public int size() {
        return this.submap.size();
    }

    public String toString() {
        return this.submap.toString();
    }

    public Map.Entry wrapEntry(Map.Entry entry) {
        Object key = entry.getKey();
        return C162057r9.immutableEntry(key, this.this$0.wrapCollection(key, (Collection) entry.getValue()));
    }
}
