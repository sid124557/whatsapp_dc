package X;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6q0  reason: invalid class name and case insensitive filesystem */
public class C138246q0 extends C174368Tz {
    public C138246q0(BlockingQueue blockingQueue, ThreadFactory threadFactory, TimeUnit timeUnit) {
        super("High Pri Worker", blockingQueue, threadFactory, timeUnit, 1, Integer.MAX_VALUE, 120);
    }

    public void afterExecute(Runnable runnable, Throwable th) {
    }

    public void beforeExecute(Thread thread, Runnable runnable) {
    }

    public void execute(Runnable runnable) {
        super.execute(runnable);
    }
}
