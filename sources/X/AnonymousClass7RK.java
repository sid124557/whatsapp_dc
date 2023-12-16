package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.7RK  reason: invalid class name */
public final class AnonymousClass7RK {
    public final CopyOnWriteArrayList A00 = new CopyOnWriteArrayList();

    public void A00(C178258hF r5) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A00;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C148697Jj r1 = (C148697Jj) it.next();
            if (r1.A02 == r5) {
                r1.A00 = true;
                copyOnWriteArrayList.remove(r1);
            }
        }
    }
}
