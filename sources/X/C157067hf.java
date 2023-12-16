package X;

import java.lang.Thread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7hf  reason: invalid class name and case insensitive filesystem */
public class C157067hf {
    public static ExecutorService A00(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, int i, boolean z) {
        int i2 = i;
        int i3 = i;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i2, i3, C625635p.A0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new C173228Ou(str, uncaughtExceptionHandler, z));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public ExecutorService A01(C142176wl r6) {
        C172768Mq r4 = new C172768Mq();
        switch (r6.ordinal()) {
            case 1:
            case 6:
                return A00(r6.name(), r4, 2, false);
            case 4:
            case 5:
                return A00(r6.name(), r4, 1, false);
            case 7:
            case 8:
            case 9:
                return A00(r6.name(), r4, 4, true);
            default:
                throw AnonymousClass000.A0E(r6, "unknown type ", AnonymousClass001.A0o());
        }
    }
}
