package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6ao  reason: invalid class name and case insensitive filesystem */
public class C129746ao extends C129856az<K, Collection<V>> {
    public final /* synthetic */ C129366aC this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C129746ao(C129366aC r1, Map map) {
        super(map);
        this.this$0 = r1;
    }

    public boolean equals(Object obj) {
        if (this == obj || map().keySet().equals(obj)) {
            return true;
        }
        return false;
    }

    public void clear() {
        C162467s8.clear(iterator());
    }

    public boolean containsAll(Collection collection) {
        return map().keySet().containsAll(collection);
    }

    public int hashCode() {
        return map().keySet().hashCode();
    }

    public Iterator iterator() {
        return new C172968Nr(this, AnonymousClass000.A0q(map()));
    }

    public boolean remove(Object obj) {
        Collection collection = (Collection) map().remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        C129366aC.access$220(this.this$0, size);
        if (size > 0) {
            return true;
        }
        return false;
    }
}
