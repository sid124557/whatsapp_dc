package X;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.7Qh  reason: invalid class name and case insensitive filesystem */
public abstract class C150357Qh {
    public void A00(Throwable th, Throwable th2) {
        if (this instanceof C128476Wf) {
            th.addSuppressed(th2);
        } else if (this instanceof C128486Wg) {
            C128486Wg r0 = (C128486Wg) this;
            if (th2 != th) {
                AnonymousClass7GL r2 = r0.A00;
                ReferenceQueue referenceQueue = r2.A00;
                while (true) {
                    Reference poll = referenceQueue.poll();
                    if (poll == null) {
                        break;
                    }
                    r2.A01.remove(poll);
                }
                AnonymousClass8SK r02 = new AnonymousClass8SK(th, (ReferenceQueue) null);
                ConcurrentHashMap concurrentHashMap = r2.A01;
                List list = (List) concurrentHashMap.get(r02);
                if (list == null) {
                    list = new Vector(2);
                    List list2 = (List) concurrentHashMap.putIfAbsent(new AnonymousClass8SK(th, referenceQueue), list);
                    if (list2 != null) {
                        list = list2;
                    }
                }
                list.add(th2);
                return;
            }
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
    }
}
