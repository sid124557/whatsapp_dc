package X;

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: X.6Zy  reason: invalid class name and case insensitive filesystem */
public class C129226Zy extends C129366aC<K, V>.AsMap implements SortedMap<K, Collection<V>> {
    public SortedSet sortedKeySet;
    public final /* synthetic */ C129366aC this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C129226Zy(C129366aC r1, SortedMap sortedMap) {
        super(r1, sortedMap);
        this.this$0 = r1;
    }

    public SortedSet createKeySet() {
        return new C129256a1(this.this$0, sortedMap());
    }

    public SortedMap headMap(Object obj) {
        return new C129226Zy(this.this$0, sortedMap().headMap(obj));
    }

    public SortedSet keySet() {
        SortedSet sortedSet = this.sortedKeySet;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet createKeySet = createKeySet();
        this.sortedKeySet = createKeySet;
        return createKeySet;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.6Zy, X.6ap] */
    public SortedMap sortedMap() {
        return (SortedMap) this.submap;
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new C129226Zy(this.this$0, sortedMap().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new C129226Zy(this.this$0, sortedMap().tailMap(obj));
    }

    public Comparator comparator() {
        return sortedMap().comparator();
    }

    public Object firstKey() {
        return sortedMap().firstKey();
    }

    public Object lastKey() {
        return sortedMap().lastKey();
    }
}
