package X;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;

/* renamed from: X.6a0  reason: invalid class name and case insensitive filesystem */
public class C129246a0 extends C129366aC<K, V>.SortedKeySet implements NavigableSet<K> {
    public final /* synthetic */ C129366aC this$0;

    public NavigableSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C129246a0(C129366aC r1, NavigableMap navigableMap) {
        super(r1, navigableMap);
        this.this$0 = r1;
    }

    public NavigableSet descendingSet() {
        return new C129246a0(this.this$0, sortedMap().descendingMap());
    }

    public NavigableSet headSet(Object obj, boolean z) {
        return new C129246a0(this.this$0, sortedMap().headMap(obj, z));
    }

    public NavigableSet tailSet(Object obj, boolean z) {
        return new C129246a0(this.this$0, sortedMap().tailMap(obj, z));
    }

    public Object ceiling(Object obj) {
        return sortedMap().ceilingKey(obj);
    }

    public Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    public Object floor(Object obj) {
        return sortedMap().floorKey(obj);
    }

    public Object higher(Object obj) {
        return sortedMap().higherKey(obj);
    }

    public Object lower(Object obj) {
        return sortedMap().lowerKey(obj);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.6a0, java.util.AbstractCollection] */
    public Object pollFirst() {
        return C162467s8.pollNext(iterator());
    }

    public Object pollLast() {
        return C162467s8.pollNext(descendingIterator());
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.6a0, X.6a1] */
    public NavigableMap sortedMap() {
        return (NavigableMap) C129246a0.super.sortedMap();
    }

    public NavigableSet headSet(Object obj) {
        return headSet(obj, false);
    }

    public NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new C129246a0(this.this$0, sortedMap().subMap(obj, z, obj2, z2));
    }

    public NavigableSet tailSet(Object obj) {
        return tailSet(obj, true);
    }
}
