package X;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.8St  reason: invalid class name and case insensitive filesystem */
public class C174048St<K, V> extends AbstractCollection<V> {
    public final Map map;

    public final Map map() {
        return this.map;
    }

    public C174048St(Map map2) {
        this.map = map2;
    }

    public void clear() {
        map().clear();
    }

    public boolean contains(Object obj) {
        return map().containsValue(obj);
    }

    public boolean isEmpty() {
        return map().isEmpty();
    }

    public Iterator iterator() {
        return C162057r9.valueIterator(AnonymousClass000.A0q(map()));
    }

    public boolean remove(Object obj) {
        try {
            return super.remove(obj);
        } catch (UnsupportedOperationException unused) {
            Iterator A0q = AnonymousClass000.A0q(map());
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                if (C1447372t.A00(obj, A0w.getValue())) {
                    map().remove(A0w.getKey());
                    return true;
                }
            }
            return false;
        }
    }

    public boolean removeAll(Collection collection) {
        try {
            collection.getClass();
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet newHashSet = C162207rR.newHashSet();
            Iterator A0q = AnonymousClass000.A0q(map());
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                if (collection.contains(A0w.getValue())) {
                    newHashSet.add(A0w.getKey());
                }
            }
            return map().keySet().removeAll(newHashSet);
        }
    }

    public boolean retainAll(Collection collection) {
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet newHashSet = C162207rR.newHashSet();
            Iterator A0q = AnonymousClass000.A0q(map());
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                if (collection.contains(A0w.getValue())) {
                    newHashSet.add(A0w.getKey());
                }
            }
            return map().keySet().retainAll(newHashSet);
        }
    }

    public int size() {
        return map().size();
    }
}
