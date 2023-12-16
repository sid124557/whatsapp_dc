package X;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3dK  reason: invalid class name and case insensitive filesystem */
public class C72193dK implements RejectedExecutionHandler {
    public final AtomicBoolean A00 = new AtomicBoolean();

    public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        C55682qk r2;
        try {
            threadPoolExecutor.getQueue().put(runnable);
        } catch (InterruptedException unused) {
            C18300x5.A11();
        }
        if (!this.A00.getAndSet(true) && (r2 = C69423Wy.A04) != null) {
            r2.A0A("waworkers-task-queued", true, String.valueOf(threadPoolExecutor.getActiveCount()));
        }
    }
}
