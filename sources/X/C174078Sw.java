package X;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.8Sw  reason: invalid class name and case insensitive filesystem */
public abstract class C174078Sw<E> extends AbstractCollection<E> implements C188168yS<E> {
    public transient Set elementSet;
    public transient Set entrySet;

    public abstract int add(Object obj, int i);

    public final boolean add(Object obj) {
        add(obj, 1);
        return true;
    }

    public abstract void clear();

    public abstract int distinctElements();

    public abstract Iterator elementIterator();

    public abstract Iterator entryIterator();

    public abstract int remove(Object obj, int i);

    public final boolean remove(Object obj) {
        return remove(obj, 1) > 0;
    }

    public abstract boolean setCount(Object obj, int i, int i2);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.6b1, java.util.Set] */
    public Set createElementSet() {
        return new C129876b1(this);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.6b0, java.util.Set] */
    public Set createEntrySet() {
        return new C129866b0(this);
    }

    public Set elementSet() {
        Set set = this.elementSet;
        if (set != null) {
            return set;
        }
        Set createElementSet = createElementSet();
        this.elementSet = createElementSet;
        return createElementSet;
    }

    public Set entrySet() {
        Set set = this.entrySet;
        if (set != null) {
            return set;
        }
        Set createEntrySet = createEntrySet();
        this.entrySet = createEntrySet;
        return createEntrySet;
    }

    public final boolean addAll(Collection collection) {
        return C162067rA.addAllImpl((C188168yS) this, collection);
    }

    public boolean contains(Object obj) {
        return AnonymousClass001.A1W(count(obj));
    }

    public final boolean equals(Object obj) {
        return C162067rA.equalsImpl(this, obj);
    }

    public final int hashCode() {
        return entrySet().hashCode();
    }

    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    public final boolean removeAll(Collection collection) {
        return C162067rA.removeAllImpl(this, collection);
    }

    public final boolean retainAll(Collection collection) {
        return C162067rA.retainAllImpl(this, collection);
    }

    public final String toString() {
        return entrySet().toString();
    }
}
