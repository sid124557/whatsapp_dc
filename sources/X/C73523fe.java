package X;

import com.whatsapp.util.Log;
import java.io.Closeable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.3fe  reason: invalid class name and case insensitive filesystem */
public class C73523fe extends ReentrantLock implements Closeable {
    public final /* synthetic */ C614730x this$0;
    public final AtomicLong threadId = new AtomicLong(-1);

    public C73523fe(C614730x r4) {
        this.this$0 = r4;
    }

    public final void A00() {
        AtomicLong atomicLong = this.threadId;
        Thread currentThread = Thread.currentThread();
        atomicLong.compareAndSet(-1, currentThread.getId());
        if (!this.this$0.A0B()) {
            return;
        }
        if (getHoldCount() == 0 || this.threadId.get() != currentThread.getId()) {
            Log.e("SignalLock/getLock/trying to acquire lock from a transaction");
            this.this$0.A00.A0A("signal-lock-in-transaction", true, (String) null);
        }
    }

    public void close() {
        unlock();
    }

    public void lock() {
        A00();
        super.lock();
    }

    public boolean tryLock(long j, TimeUnit timeUnit) {
        A00();
        return super.tryLock(j, timeUnit);
    }

    public void unlock() {
        super.unlock();
        if (getHoldCount() == 0) {
            this.threadId.set(-1);
        }
        Iterator it = new LinkedList(this.this$0.A06).iterator();
        while (it.hasNext()) {
            ((CountDownLatch) it.next()).countDown();
        }
    }

    public boolean tryLock() {
        A00();
        return super.tryLock();
    }
}
