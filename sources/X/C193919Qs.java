package X;

import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.9Qs  reason: invalid class name and case insensitive filesystem */
public class C193919Qs {
    public int A00 = 0;
    public final ReentrantLock A01 = new ReentrantLock();

    public boolean A00() {
        ReentrantLock reentrantLock = this.A01;
        reentrantLock.lock();
        try {
            return AnonymousClass000.A1T(this.A00);
        } finally {
            reentrantLock.unlock();
        }
    }
}
