package X;

import java.util.concurrent.Executor;

/* renamed from: X.91s  reason: invalid class name and case insensitive filesystem */
public class C1895491s implements Executor {
    public final int A00;

    public C1895491s(int i) {
        this.A00 = i;
    }

    public static final void A00(Runnable runnable) {
        new C173778Rq(runnable, "AnomalyExecutorThread").start();
    }

    public final void execute(Runnable runnable) {
        if (this.A00 != 0) {
            runnable.run();
        } else {
            A00(runnable);
        }
    }
}
