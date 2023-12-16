package X;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: X.6a1  reason: invalid class name and case insensitive filesystem */
public class C129256a1 extends C129366aC<K, V>.KeySet implements SortedSet<K> {
    public final /* synthetic */ C129366aC this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C129256a1(C129366aC r1, SortedMap sortedMap) {
        super(r1, sortedMap);
        this.this$0 = r1;
    }

    public SortedSet headSet(Object obj) {
        return new C129256a1(this.this$0, sortedMap().headMap(obj));
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new C129256a1(this.this$0, sortedMap().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new C129256a1(this.this$0, sortedMap().tailMap(obj));
    }

    public Comparator comparator() {
        return sortedMap().comparator();
    }

    public Object first() {
        return sortedMap().firstKey();
    }

    public Object last() {
        return sortedMap().lastKey();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.6az, X.6a1] */
    public SortedMap sortedMap() {
        return (SortedMap) C129256a1.super.map();
    }
}
