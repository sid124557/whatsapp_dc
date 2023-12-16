package X;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: X.8Sv  reason: invalid class name and case insensitive filesystem */
public class C174068Sv extends AbstractCollection<V> {
    public final C174068Sv ancestor;
    public final Collection ancestorDelegate;
    public Collection delegate;
    public final Object key;
    public final /* synthetic */ C129366aC this$0;

    public C174068Sv(C129366aC r2, Object obj, Collection collection, C174068Sv r5) {
        Collection delegate2;
        this.this$0 = r2;
        this.key = obj;
        this.delegate = collection;
        this.ancestor = r5;
        if (r5 == null) {
            delegate2 = null;
        } else {
            delegate2 = r5.getDelegate();
        }
        this.ancestorDelegate = delegate2;
    }

    public void addToMap() {
        C174068Sv r0 = this.ancestor;
        if (r0 != null) {
            r0.addToMap();
        } else {
            this.this$0.map.put(this.key, this.delegate);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        refreshIfEmpty();
        return this.delegate.equals(obj);
    }

    public C174068Sv getAncestor() {
        return this.ancestor;
    }

    public Collection getDelegate() {
        return this.delegate;
    }

    public Object getKey() {
        return this.key;
    }

    public void refreshIfEmpty() {
        Collection collection;
        C174068Sv r0 = this.ancestor;
        if (r0 != null) {
            r0.refreshIfEmpty();
            if (this.ancestor.getDelegate() != this.ancestorDelegate) {
                throw new ConcurrentModificationException();
            }
        } else if (this.delegate.isEmpty() && (collection = (Collection) this.this$0.map.get(this.key)) != null) {
            this.delegate = collection;
        }
    }

    public void removeIfEmpty() {
        C174068Sv r0 = this.ancestor;
        if (r0 != null) {
            r0.removeIfEmpty();
        } else if (this.delegate.isEmpty()) {
            this.this$0.map.remove(this.key);
        }
    }

    public boolean add(Object obj) {
        refreshIfEmpty();
        boolean isEmpty = this.delegate.isEmpty();
        boolean add = this.delegate.add(obj);
        if (add) {
            C129366aC.access$208(this.this$0);
            if (isEmpty) {
                addToMap();
            }
        }
        return add;
    }

    public boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.delegate.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        C129366aC.access$212(this.this$0, this.delegate.size() - size);
        if (size != 0) {
            return addAll;
        }
        addToMap();
        return addAll;
    }

    public void clear() {
        int size = size();
        if (size != 0) {
            this.delegate.clear();
            C129366aC.access$220(this.this$0, size);
            removeIfEmpty();
        }
    }

    public boolean contains(Object obj) {
        refreshIfEmpty();
        return this.delegate.contains(obj);
    }

    public boolean containsAll(Collection collection) {
        refreshIfEmpty();
        return this.delegate.containsAll(collection);
    }

    public int hashCode() {
        refreshIfEmpty();
        return this.delegate.hashCode();
    }

    public Iterator iterator() {
        refreshIfEmpty();
        return new AnonymousClass8O5(this);
    }

    public boolean remove(Object obj) {
        refreshIfEmpty();
        boolean remove = this.delegate.remove(obj);
        if (remove) {
            C129366aC.access$210(this.this$0);
            removeIfEmpty();
        }
        return remove;
    }

    public boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.delegate.removeAll(collection);
        if (!removeAll) {
            return removeAll;
        }
        C129366aC.access$212(this.this$0, this.delegate.size() - size);
        removeIfEmpty();
        return removeAll;
    }

    public boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.delegate.retainAll(collection);
        if (retainAll) {
            C129366aC.access$212(this.this$0, this.delegate.size() - size);
            removeIfEmpty();
        }
        return retainAll;
    }

    public int size() {
        refreshIfEmpty();
        return this.delegate.size();
    }

    public String toString() {
        refreshIfEmpty();
        return this.delegate.toString();
    }
}
