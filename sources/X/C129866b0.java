package X;

import com.google.common.collect.Multisets;
import java.util.Iterator;

/* renamed from: X.6b0  reason: invalid class name and case insensitive filesystem */
public class C129866b0 extends Multisets.EntrySet<E> {
    public final /* synthetic */ C174078Sw this$0;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C129866b0(C174078Sw r1) {
        this();
        this.this$0 = r1;
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof C153177an)) {
            return false;
        }
        C153177an r4 = (C153177an) obj;
        if (r4.getCount() <= 0 || multiset().count(r4.getElement()) != r4.getCount()) {
            return false;
        }
        return true;
    }

    public Iterator iterator() {
        return this.this$0.entryIterator();
    }

    public C188168yS multiset() {
        return this.this$0;
    }

    public boolean remove(Object obj) {
        if (obj instanceof C153177an) {
            C153177an r5 = (C153177an) obj;
            Object element = r5.getElement();
            int count = r5.getCount();
            if (count != 0) {
                return multiset().setCount(element, count, 0);
            }
        }
        return false;
    }

    public int size() {
        return this.this$0.distinctElements();
    }

    public void clear() {
        multiset().clear();
    }

    public C129866b0() {
    }
}
