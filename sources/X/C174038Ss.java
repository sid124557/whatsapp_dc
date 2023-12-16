package X;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.8Ss  reason: invalid class name and case insensitive filesystem */
public class C174038Ss<F, T> extends AbstractCollection<T> {
    public final Collection fromCollection;
    public final C181298mX function;

    public void clear() {
        this.fromCollection.clear();
    }

    public boolean isEmpty() {
        return this.fromCollection.isEmpty();
    }

    public Iterator iterator() {
        return C162467s8.transform(this.fromCollection.iterator(), this.function);
    }

    public int size() {
        return this.fromCollection.size();
    }

    public C174038Ss(Collection collection, C181298mX r2) {
        collection.getClass();
        this.fromCollection = collection;
        this.function = r2;
    }
}
