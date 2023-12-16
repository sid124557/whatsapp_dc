package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0ne  reason: invalid class name and case insensitive filesystem */
public final class C13730ne implements ThreadFactory {
    public final String A00;
    public final AtomicInteger A01 = new AtomicInteger(0);

    public Thread newThread(Runnable runnable) {
        C11410jb r2 = new C11410jb(runnable);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A00);
        return new C173778Rq(r2, AnonymousClass000.A0h(A0o, this.A01.getAndIncrement()));
    }

    public C13730ne(String str) {
        this.A00 = str;
    }
}
