package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;

/* renamed from: X.6Zx  reason: invalid class name and case insensitive filesystem */
public class C129216Zx extends C129366aC<K, V>.SortedAsMap implements NavigableMap<K, Collection<V>> {
    public final /* synthetic */ C129366aC this$0;

    public NavigableMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C129216Zx(C129366aC r1, NavigableMap navigableMap) {
        super(r1, navigableMap);
        this.this$0 = r1;
    }

    public NavigableSet createKeySet() {
        return new C129246a0(this.this$0, sortedMap());
    }

    public NavigableMap descendingMap() {
        return new C129216Zx(this.this$0, sortedMap().descendingMap());
    }

    public NavigableMap headMap(Object obj, boolean z) {
        return new C129216Zx(this.this$0, sortedMap().headMap(obj, z));
    }

    public NavigableMap tailMap(Object obj, boolean z) {
        return new C129216Zx(this.this$0, sortedMap().tailMap(obj, z));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.6ap, X.6Zx] */
    public Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = sortedMap().ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return wrapEntry(ceilingEntry);
    }

    public Object ceilingKey(Object obj) {
        return sortedMap().ceilingKey(obj);
    }

    public NavigableSet descendingKeySet() {
        return descendingMap().navigableKeySet();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.6ap, X.6Zx] */
    public Map.Entry firstEntry() {
        Map.Entry firstEntry = sortedMap().firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return wrapEntry(firstEntry);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.6ap, X.6Zx] */
    public Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = sortedMap().floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return wrapEntry(floorEntry);
    }

    public Object floorKey(Object obj) {
        return sortedMap().floorKey(obj);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.6ap, X.6Zx] */
    public Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = sortedMap().higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return wrapEntry(higherEntry);
    }

    public Object higherKey(Object obj) {
        return sortedMap().higherKey(obj);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.6Zy, X.6Zx] */
    public NavigableSet keySet() {
        return (NavigableSet) C129216Zx.super.keySet();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.6ap, X.6Zx] */
    public Map.Entry lastEntry() {
        Map.Entry lastEntry = sortedMap().lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return wrapEntry(lastEntry);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.6ap, X.6Zx] */
    public Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = sortedMap().lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return wrapEntry(lowerEntry);
    }

    public Object lowerKey(Object obj) {
        return sortedMap().lowerKey(obj);
    }

    public NavigableSet navigableKeySet() {
        return keySet();
    }

    public Map.Entry pollAsMapEntry(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry A0w = AnonymousClass001.A0w(it);
        Collection createCollection = this.this$0.createCollection();
        createCollection.addAll((Collection) A0w.getValue());
        it.remove();
        return C162057r9.immutableEntry(A0w.getKey(), this.this$0.unmodifiableCollectionSubclass(createCollection));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.AbstractMap, X.6Zx] */
    public Map.Entry pollFirstEntry() {
        return pollAsMapEntry(AnonymousClass001.A0u(this));
    }

    public Map.Entry pollLastEntry() {
        return pollAsMapEntry(descendingMap().entrySet().iterator());
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.6Zy, X.6Zx] */
    public NavigableMap sortedMap() {
        return (NavigableMap) C129216Zx.super.sortedMap();
    }

    public NavigableMap headMap(Object obj) {
        return headMap(obj, false);
    }

    public NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new C129216Zx(this.this$0, sortedMap().subMap(obj, z, obj2, z2));
    }

    public NavigableMap tailMap(Object obj) {
        return tailMap(obj, true);
    }
}
