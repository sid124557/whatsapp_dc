package X;

import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2fm  reason: invalid class name and case insensitive filesystem */
public class C48972fm {
    public final ThreadPoolExecutor A00 = new ThreadPoolExecutor(0, 1, 300, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C72223dN(this));
    public volatile WeakReference A01;
    public volatile boolean A02 = false;

    public static Object A00(C48972fm r2, Object obj, int i) {
        return r2.A00.submit(new AnonymousClass4IH(obj, i)).get();
    }

    public static Object A01(C48972fm r0, Callable callable) {
        return r0.A00.submit(callable).get();
    }

    public static void A02(C48972fm r0, Runnable runnable) {
        r0.A00.execute(runnable);
    }

    public boolean A03() {
        WeakReference weakReference = this.A01;
        if (weakReference == null || Thread.currentThread() != weakReference.get()) {
            return false;
        }
        return true;
    }
}
