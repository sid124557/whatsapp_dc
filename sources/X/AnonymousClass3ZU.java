package X;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.3ZU  reason: invalid class name */
public class AnonymousClass3ZU implements Iterable {
    public final C183538qC A00;
    public final ConcurrentLinkedQueue A01 = new ConcurrentLinkedQueue();

    public Iterator iterator() {
        return C162467s8.unmodifiableIterator(C162467s8.concat(AnonymousClass0x2.A0j(this.A00), this.A01.iterator()));
    }

    public AnonymousClass3ZU(C183538qC r2) {
        this.A00 = r2;
    }
}
