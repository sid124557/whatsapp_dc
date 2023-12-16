package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.8Or  reason: invalid class name and case insensitive filesystem */
public final class C173198Or implements ThreadFactory {
    public final String A00;
    public final AtomicInteger A01 = new AtomicInteger(1);

    public C173198Or(String str) {
        this.A00 = str;
    }

    public Thread newThread(Runnable runnable) {
        C162457s7.A0J(runnable, 0);
        AnonymousClass8MF r2 = new AnonymousClass8MF(this, 12, runnable);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A00);
        A0o.append('-');
        return new Thread(r2, AnonymousClass000.A0h(A0o, this.A01.getAndIncrement()));
    }
}
