package X;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.8TJ  reason: invalid class name */
public class AnonymousClass8TJ extends AbstractSet<K> {
    public final /* synthetic */ AnonymousClass8TF this$0;

    public AnonymousClass8TJ(AnonymousClass8TF r1) {
        this.this$0 = r1;
    }

    public void clear() {
        this.this$0.clear();
    }

    public boolean contains(Object obj) {
        return this.this$0.containsKey(obj);
    }

    public Iterator iterator() {
        return this.this$0.keySetIterator();
    }

    public boolean remove(Object obj) {
        AnonymousClass8TF r1 = this.this$0;
        Map delegateOrNull = r1.delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.keySet().remove(obj);
        }
        return C18300x5.A1W(r1.removeHelper(obj), AnonymousClass8TF.NOT_FOUND);
    }

    public int size() {
        return this.this$0.size();
    }
}
