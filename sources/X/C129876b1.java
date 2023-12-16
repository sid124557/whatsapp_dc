package X;

import com.google.common.collect.Multisets;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.6b1  reason: invalid class name and case insensitive filesystem */
public class C129876b1 extends Multisets.ElementSet<E> {
    public final /* synthetic */ C174078Sw this$0;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C129876b1(C174078Sw r1) {
        this();
        this.this$0 = r1;
    }

    public Iterator iterator() {
        return this.this$0.elementIterator();
    }

    public C188168yS multiset() {
        return this.this$0;
    }

    public void clear() {
        multiset().clear();
    }

    public boolean contains(Object obj) {
        return multiset().contains(obj);
    }

    public boolean containsAll(Collection collection) {
        return multiset().containsAll(collection);
    }

    public boolean isEmpty() {
        return multiset().isEmpty();
    }

    public boolean remove(Object obj) {
        return AnonymousClass001.A1W(multiset().remove(obj, Integer.MAX_VALUE));
    }

    public int size() {
        return multiset().entrySet().size();
    }

    public C129876b1() {
    }
}
