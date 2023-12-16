package X;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.3fd  reason: invalid class name and case insensitive filesystem */
public class C73513fd extends ScheduledThreadPoolExecutor {
    public final /* synthetic */ C69423Wy A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73513fd(C69423Wy r1, ThreadFactory threadFactory, int i) {
        super(i, threadFactory);
        this.A00 = r1;
    }

    public void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (runnable instanceof Future) {
            Future future = (Future) runnable;
            if (future.isDone()) {
                try {
                    future.get();
                } catch (InterruptedException unused) {
                } catch (ExecutionException e) {
                    th = e.getCause();
                }
            }
        }
        if (th != null) {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
        }
    }
}
