package X;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* renamed from: X.5RR  reason: invalid class name */
public class AnonymousClass5RR {
    public final Set A00 = AnonymousClass002.A0K();

    public void A00() {
        Set<AnonymousClass8s5> set = this.A00;
        synchronized (set) {
            if (!set.isEmpty()) {
                for (AnonymousClass8s5 BNZ : set) {
                    BNZ.BNZ();
                }
            }
        }
    }

    public void A01() {
        Set<AnonymousClass8s5> set = this.A00;
        synchronized (set) {
            if (!set.isEmpty()) {
                LinkedList linkedList = null;
                for (AnonymousClass8s5 r1 : set) {
                    if (r1.BMG()) {
                        if (linkedList == null) {
                            linkedList = AnonymousClass0x9.A18();
                        }
                        linkedList.add(r1);
                    }
                }
                if (linkedList != null) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        set.remove((AnonymousClass8s5) it.next());
                    }
                }
            }
        }
    }

    public void A02(AnonymousClass8s5 r3) {
        Set set = this.A00;
        synchronized (set) {
            set.add(r3);
        }
    }
}
