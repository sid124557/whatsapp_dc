package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0Gg  reason: invalid class name and case insensitive filesystem */
public class C02460Gg implements ThreadFactory {
    public Object A00 = new AtomicInteger(1);
    public final int A01;

    public C02460Gg(int i) {
        this.A01 = i;
    }

    public static Thread A00(C02460Gg r3, Runnable runnable) {
        C11490jj r2 = new C11490jj(runnable);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Google Drive Checksum Calculation Worker #");
        return new C173778Rq(r2, AnonymousClass000.A0h(A0o, ((AtomicInteger) r3.A00).getAndIncrement()));
    }

    public Thread newThread(Runnable runnable) {
        if (this.A01 != 0) {
            return A00(this, runnable);
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ModernAsyncTask #");
        return new Thread(runnable, AnonymousClass000.A0h(A0o, ((AtomicInteger) this.A00).getAndIncrement()));
    }
}
