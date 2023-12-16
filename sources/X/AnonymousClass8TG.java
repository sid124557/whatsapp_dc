package X;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Set;

/* renamed from: X.8TG  reason: invalid class name */
public abstract class AnonymousClass8TG<E> extends AbstractSet<E> {
    public boolean removeAll(Collection collection) {
        return C162207rR.removeAllImpl((Set) this, collection);
    }

    public boolean retainAll(Collection collection) {
        collection.getClass();
        return super.retainAll(collection);
    }
}
