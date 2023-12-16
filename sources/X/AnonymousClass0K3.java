package X;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0K3  reason: invalid class name */
public final class AnonymousClass0K3 {
    public static final BlockingQueue A00;
    public static final ThreadFactory A01;
    public static final ThreadPoolExecutor A02;

    static {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(4);
        A00 = linkedBlockingQueue;
        C02460Gg r9 = new C02460Gg(1);
        A01 = r9;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 4, 1, TimeUnit.SECONDS, linkedBlockingQueue, r9);
        A02 = threadPoolExecutor;
        threadPoolExecutor.setRejectedExecutionHandler(new C17990wZ(1));
    }
}
