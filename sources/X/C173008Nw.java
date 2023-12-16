package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.8Nw  reason: invalid class name and case insensitive filesystem */
public abstract class C173008Nw implements Iterator {
    public Collection collection = null;
    public Object key = null;
    public final Iterator keyIterator;
    public final /* synthetic */ C129366aC this$0;
    public Iterator valueIterator = C162467s8.emptyModifiableIterator();

    public abstract Object output(Object obj, Object obj2);

    public C173008Nw(C129366aC r2) {
        this.this$0 = r2;
        this.keyIterator = AnonymousClass000.A0q(r2.map);
    }

    public boolean hasNext() {
        if (this.keyIterator.hasNext() || this.valueIterator.hasNext()) {
            return true;
        }
        return false;
    }

    public Object next() {
        if (!this.valueIterator.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(this.keyIterator);
            this.key = A0w.getKey();
            Collection collection2 = (Collection) A0w.getValue();
            this.collection = collection2;
            this.valueIterator = collection2.iterator();
        }
        return output(this.key, this.valueIterator.next());
    }

    public void remove() {
        this.valueIterator.remove();
        Collection collection2 = this.collection;
        Objects.requireNonNull(collection2);
        if (collection2.isEmpty()) {
            this.keyIterator.remove();
        }
        C129366aC.access$210(this.this$0);
    }
}
