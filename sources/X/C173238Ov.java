package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.8Ov  reason: invalid class name and case insensitive filesystem */
public final class C173238Ov implements ThreadFactory {
    public int A00 = 10;
    public final String A01;
    public final ThreadGroup A02 = Thread.currentThread().getThreadGroup();
    public final AtomicInteger A03 = new AtomicInteger(1);

    public Thread newThread(Runnable runnable) {
        ThreadGroup threadGroup = this.A02;
        AnonymousClass8MF r3 = new AnonymousClass8MF(this, 16, runnable);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A01);
        Thread thread = new Thread(threadGroup, r3, AnonymousClass000.A0h(A0o, this.A03.getAndIncrement()), 0);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }

    public C173238Ov(C141406vW r3) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("cask-");
        A0o.append(r3.name());
        this.A01 = AnonymousClass000.A0X("-pool--thread-", A0o);
        if (r3 == C141406vW.IDLE) {
            this.A00 = 19;
        }
    }
}
