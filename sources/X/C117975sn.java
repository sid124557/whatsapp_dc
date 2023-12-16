package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.5sn  reason: invalid class name and case insensitive filesystem */
public class C117975sn implements ThreadFactory {
    public final AtomicInteger A00 = new AtomicInteger(1);

    public Thread newThread(Runnable runnable) {
        C70163a3 r2 = new C70163a3(runnable, 19, this);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("JobRunner");
        A0o.append(" #");
        return new Thread(r2, AnonymousClass000.A0h(A0o, this.A00.getAndIncrement()));
    }
}
