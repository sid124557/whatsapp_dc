package X;

import java.util.Iterator;

/* renamed from: X.8Nu  reason: invalid class name */
public abstract class AnonymousClass8Nu implements Iterator {
    public final Iterator backingIterator;

    public abstract Object transform(Object obj);

    public final boolean hasNext() {
        return this.backingIterator.hasNext();
    }

    public final Object next() {
        return transform(this.backingIterator.next());
    }

    public final void remove() {
        this.backingIterator.remove();
    }

    public AnonymousClass8Nu(Iterator it) {
        it.getClass();
        this.backingIterator = it;
    }
}
