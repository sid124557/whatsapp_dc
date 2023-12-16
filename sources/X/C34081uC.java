package X;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1uC  reason: invalid class name and case insensitive filesystem */
public class C34081uC extends C174368Tz {
    public C34081uC(BlockingQueue blockingQueue, ThreadFactory threadFactory, TimeUnit timeUnit) {
        super("WhatsApp Worker", blockingQueue, threadFactory, timeUnit, 5, 128, 1);
    }

    public void afterExecute(Runnable runnable, Throwable th) {
        C69423Wy.A06.A01(this, runnable);
    }

    public void beforeExecute(Thread thread, Runnable runnable) {
        C69423Wy.A06.A03(this, runnable, thread);
    }

    public void execute(Runnable runnable) {
        C69423Wy.A06.A02(this, runnable);
        super.execute(runnable);
    }
}
