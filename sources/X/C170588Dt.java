package X;

import java.util.Deque;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.8Dt  reason: invalid class name and case insensitive filesystem */
public class C170588Dt implements C179008iS {
    public final Deque A00 = AnonymousClass0x9.A18();
    public final Map A01 = AnonymousClass0x9.A1D();
    public final ReentrantLock A02 = new ReentrantLock();

    public final void A00(String str) {
        ReentrantLock reentrantLock = this.A02;
        reentrantLock.lock();
        try {
            Deque deque = this.A00;
            deque.removeFirstOccurrence(str);
            deque.addFirst(str);
        } finally {
            reentrantLock.unlock();
        }
    }

    public String toString() {
        return this.A01.toString();
    }
}
