package X;

import java.util.concurrent.Executor;

/* renamed from: X.0wb  reason: invalid class name and case insensitive filesystem */
public class C18010wb implements Executor {
    public final int A00;

    public C18010wb(int i) {
        this.A00 = i;
    }

    public void execute(Runnable runnable) {
        if (this.A00 != 0) {
            runnable.run();
        } else {
            C004004h.A00().A01(runnable);
        }
    }
}
