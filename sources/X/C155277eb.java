package X;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7eb  reason: invalid class name and case insensitive filesystem */
public final class C155277eb {
    public static final ThreadFactory A00;
    public static final ThreadPoolExecutor A01;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors() * 2;
        C173188Oq r7 = new C173188Oq();
        A00 = r7;
        A01 = new ThreadPoolExecutor(availableProcessors, availableProcessors, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), r7);
    }
}
