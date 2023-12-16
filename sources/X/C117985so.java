package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.5so  reason: invalid class name and case insensitive filesystem */
public class C117985so implements ThreadFactory {
    public final int A00;
    public final String A01;
    public final AtomicInteger A02 = new AtomicInteger(1);

    public Thread newThread(Runnable runnable) {
        C70153a2 r2 = new C70153a2(this, 1, runnable);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A01);
        A0o.append(" #");
        return new C173778Rq(r2, AnonymousClass000.A0h(A0o, this.A02.getAndIncrement()));
    }

    public C117985so(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }
}
