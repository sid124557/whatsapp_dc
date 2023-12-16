package X;

import com.whatsapp.util.Log;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.0wZ  reason: invalid class name and case insensitive filesystem */
public class C17990wZ implements RejectedExecutionHandler {
    public final int A00;

    public C17990wZ(int i) {
        this.A00 = i;
    }

    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        if (this.A00 != 0) {
            A00(runnable, threadPoolExecutor);
        } else {
            A01(runnable, threadPoolExecutor);
        }
    }

    public static void A00(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        try {
            threadPoolExecutor.getQueue().put(runnable);
        } catch (InterruptedException e) {
            Log.e((Throwable) e);
        }
    }

    public static /* synthetic */ void A01(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        try {
            threadPoolExecutor.getQueue().put(runnable);
        } catch (InterruptedException e) {
            Log.e((Throwable) e);
        }
    }
}
