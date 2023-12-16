package X;

import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: X.6b2  reason: invalid class name and case insensitive filesystem */
public class C129886b2 extends Maps.EntrySet<K, Collection<V>> {
    public final /* synthetic */ C129756ap this$1;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C129886b2(C129756ap r1) {
        this();
        this.this$1 = r1;
    }

    public boolean contains(Object obj) {
        return C161497pn.safeContains(this.this$1.submap.entrySet(), obj);
    }

    public Iterator iterator() {
        return new C172998Nv(this.this$1);
    }

    public Map map() {
        return this.this$1;
    }

    public void clear() {
        map().clear();
    }

    public boolean isEmpty() {
        return map().isEmpty();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.AbstractCollection, X.6b2] */
    public boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        this.this$1.this$0.removeValuesForKey(entry.getKey());
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.8TG, java.util.Set, X.6b2] */
    public boolean removeAll(Collection collection) {
        try {
            collection.getClass();
            return C129886b2.super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            return C162207rR.removeAllImpl((Set) this, collection.iterator());
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.AbstractCollection, X.8TG, X.6b2] */
    public boolean retainAll(Collection collection) {
        try {
            collection.getClass();
            return C129886b2.super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet newHashSetWithExpectedSize = C162207rR.newHashSetWithExpectedSize(collection.size());
            for (Object next : collection) {
                if (contains(next) && (next instanceof Map.Entry)) {
                    newHashSetWithExpectedSize.add(((Map.Entry) next).getKey());
                }
            }
            return map().keySet().retainAll(newHashSetWithExpectedSize);
        }
    }

    public int size() {
        return map().size();
    }

    public C129886b2() {
    }
}
