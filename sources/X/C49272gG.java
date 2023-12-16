package X;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.2gG  reason: invalid class name and case insensitive filesystem */
public class C49272gG {
    public Object A00;
    public final Condition A01;
    public final ReentrantLock A02;

    public Object A00() {
        ReentrantLock reentrantLock = this.A02;
        reentrantLock.lockInterruptibly();
        while (true) {
            try {
                Object obj = this.A00;
                if (obj != null) {
                    return obj;
                }
                this.A01.await();
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public C49272gG() {
        ReentrantLock reentrantLock = new ReentrantLock(true);
        this.A02 = reentrantLock;
        this.A01 = reentrantLock.newCondition();
    }

    /* JADX INFO: finally extract failed */
    public boolean A01(Object obj) {
        C626936e.A06(obj);
        ReentrantLock reentrantLock = this.A02;
        reentrantLock.lock();
        try {
            if (this.A00 != null) {
                reentrantLock.unlock();
                return false;
            }
            this.A00 = obj;
            this.A01.signal();
            reentrantLock.unlock();
            return true;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
