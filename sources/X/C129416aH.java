package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.6aH  reason: invalid class name and case insensitive filesystem */
public class C129416aH extends C117065rK {
    public final /* synthetic */ Iterable val$iterable;
    public final /* synthetic */ int val$numberToSkip;

    public C129416aH(Iterable iterable, int i) {
        this.val$iterable = iterable;
        this.val$numberToSkip = i;
    }

    public Iterator iterator() {
        Iterable iterable = this.val$iterable;
        if (iterable instanceof List) {
            List list = (List) iterable;
            return list.subList(Math.min(list.size(), this.val$numberToSkip), list.size()).iterator();
        }
        Iterator it = iterable.iterator();
        C162467s8.advance(it, this.val$numberToSkip);
        return new C172928Nk(this, it);
    }
}
