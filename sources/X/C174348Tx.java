package X;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.8Tx  reason: invalid class name and case insensitive filesystem */
public class C174348Tx extends AbstractExecutorService {
    public final C172668Mf A00;
    public final String A01 = "SerialExecutor";
    public final BlockingQueue A02;
    public final Executor A03;
    public final AtomicInteger A04;
    public final AtomicInteger A05;
    public volatile int A06;

    public C174348Tx(BlockingQueue blockingQueue, Executor executor) {
        this.A03 = executor;
        this.A06 = 1;
        this.A02 = blockingQueue;
        this.A00 = new C172668Mf(this, 4);
        this.A05 = new AtomicInteger(0);
        this.A04 = new AtomicInteger(0);
    }

    public final void A00() {
        AtomicInteger atomicInteger = this.A05;
        while (true) {
            int i = atomicInteger.get();
            if (i < this.A06) {
                int i2 = i + 1;
                Class<C174348Tx> cls = C174348Tx.class;
                if (atomicInteger.compareAndSet(i, i2)) {
                    C161577py.A00(cls, this.A01, Integer.valueOf(i2), Integer.valueOf(this.A06), "%s: starting worker %d of %d");
                    this.A03.execute(this.A00);
                    return;
                }
                C161577py.A02(cls, this.A01, "%s: race in startWorkerIfNeeded; retrying");
            } else {
                return;
            }
        }
    }

    public void execute(Runnable runnable) {
        if (runnable != null) {
            BlockingQueue blockingQueue = this.A02;
            if (blockingQueue.offer(runnable)) {
                int size = blockingQueue.size();
                AtomicInteger atomicInteger = this.A04;
                int i = atomicInteger.get();
                if (size > i && atomicInteger.compareAndSet(i, size)) {
                    C161577py.A01(C174348Tx.class, this.A01, Integer.valueOf(size), "%s: max pending work in queue = %d");
                }
                A00();
                return;
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(this.A01);
            A0o.append(" queue is full, size=");
            throw new RejectedExecutionException(AnonymousClass000.A0h(A0o, blockingQueue.size()));
        }
        throw AnonymousClass001.A0g("runnable parameter is null");
    }

    public boolean isShutdown() {
        return false;
    }

    public boolean isTerminated() {
        return false;
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw C18320x8.A0m();
    }

    public void shutdown() {
        throw C18320x8.A0m();
    }

    public List shutdownNow() {
        throw C18320x8.A0m();
    }
}
