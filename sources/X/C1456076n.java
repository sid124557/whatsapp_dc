package X;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.76n  reason: invalid class name and case insensitive filesystem */
public final class C1456076n {
    public static final ExecutorService A00;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C173218Ot());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        A00 = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
