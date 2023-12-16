package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0nd  reason: invalid class name and case insensitive filesystem */
public class C13720nd implements ThreadFactory {
    public final AtomicInteger A00 = new AtomicInteger(0);
    public final /* synthetic */ C003904g A01;

    public C13720nd(C003904g r3) {
        this.A01 = r3;
    }

    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        Object[] A0L = AnonymousClass002.A0L();
        AnonymousClass000.A1L(A0L, this.A00.getAndIncrement());
        thread.setName(String.format("arch_disk_io_%d", A0L));
        return thread;
    }
}
