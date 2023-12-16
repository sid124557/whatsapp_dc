package X;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: X.0nb  reason: invalid class name and case insensitive filesystem */
public class C13700nb implements Executor {
    public Runnable A00;
    public final Object A01 = AnonymousClass002.A0D();
    public final ArrayDeque A02 = new ArrayDeque();
    public final Executor A03;

    public void A00() {
        Runnable runnable = (Runnable) this.A02.poll();
        this.A00 = runnable;
        if (runnable != null) {
            this.A03.execute(runnable);
        }
    }

    public void execute(Runnable runnable) {
        synchronized (this.A01) {
            this.A02.add(new C12090kx(this, runnable));
            if (this.A00 == null) {
                A00();
            }
        }
    }

    public C13700nb(Executor executor) {
        this.A03 = executor;
    }
}
