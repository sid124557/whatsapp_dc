package X;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: X.8O5  reason: invalid class name */
public class AnonymousClass8O5 implements Iterator {
    public final Iterator delegateIterator;
    public final Collection originalDelegate;
    public final /* synthetic */ C174068Sv this$1;

    public AnonymousClass8O5(C174068Sv r2, Iterator it) {
        this.this$1 = r2;
        this.originalDelegate = r2.delegate;
        this.delegateIterator = it;
    }

    public void remove() {
        this.delegateIterator.remove();
        C174068Sv r1 = this.this$1;
        C129366aC.access$210(r1.this$0);
        r1.removeIfEmpty();
    }

    public void validateIterator() {
        this.this$1.refreshIfEmpty();
        if (this.this$1.delegate != this.originalDelegate) {
            throw new ConcurrentModificationException();
        }
    }

    public Iterator getDelegateIterator() {
        validateIterator();
        return this.delegateIterator;
    }

    public boolean hasNext() {
        validateIterator();
        return this.delegateIterator.hasNext();
    }

    public Object next() {
        validateIterator();
        return this.delegateIterator.next();
    }

    public AnonymousClass8O5(C174068Sv r2) {
        this.this$1 = r2;
        Collection collection = r2.delegate;
        this.originalDelegate = collection;
        this.delegateIterator = C129366aC.iteratorOrListIterator(collection);
    }
}
