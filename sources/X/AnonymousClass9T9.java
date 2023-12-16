package X;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.9T9  reason: invalid class name */
public class AnonymousClass9T9 {
    public long A00 = 5000;
    public C202369lu A01;
    public Condition A02;
    public final ReentrantLock A03 = new ReentrantLock();

    public void A00() {
        ReentrantLock reentrantLock = this.A03;
        reentrantLock.lock();
        try {
            Condition condition = this.A02;
            if (condition != null) {
                condition.await(this.A00, TimeUnit.MILLISECONDS);
            }
            if (this.A02 != null) {
                this.A02 = null;
                C202369lu r0 = this.A01;
                if (r0 != null) {
                    r0.Be8();
                }
            }
            reentrantLock.unlock();
        } catch (InterruptedException e) {
            throw new C201699ka("Operation blocker interrupted. ", e);
        } catch (Throwable th) {
            if (this.A02 != null) {
                this.A02 = null;
                C202369lu r02 = this.A01;
                if (r02 != null) {
                    r02.Be8();
                }
            }
            reentrantLock.unlock();
            throw th;
        }
    }

    public void A01() {
        ReentrantLock reentrantLock = this.A03;
        reentrantLock.lock();
        try {
            Condition condition = this.A02;
            if (condition != null) {
                condition.signal();
            }
        } finally {
            this.A02 = null;
            reentrantLock.unlock();
        }
    }

    public void A02(long j) {
        ReentrantLock reentrantLock = this.A03;
        reentrantLock.lock();
        if (this.A02 == null) {
            this.A02 = reentrantLock.newCondition();
            if (j <= 0) {
                j = 5000;
            }
            this.A00 = j;
            reentrantLock.unlock();
            return;
        }
        throw AnonymousClass001.A0e("There is already a block condition being used.");
    }
}
