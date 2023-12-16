package X;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: X.0na  reason: invalid class name and case insensitive filesystem */
public final class C13690na implements Executor {
    public Runnable A00;
    public final Object A01 = AnonymousClass002.A0D();
    public final ArrayDeque A02 = new ArrayDeque();
    public final Executor A03;

    public void execute(Runnable runnable) {
        C162457s7.A0J(runnable, 0);
        synchronized (this.A01) {
            this.A02.offer(new C11950kj(this, runnable));
            if (this.A00 == null) {
                A00();
            }
        }
    }

    public final void A00() {
        synchronized (this.A01) {
            Object poll = this.A02.poll();
            Runnable runnable = (Runnable) poll;
            this.A00 = runnable;
            if (poll != null) {
                this.A03.execute(runnable);
            }
        }
    }

    public C13690na(Executor executor) {
        this.A03 = executor;
    }
}
