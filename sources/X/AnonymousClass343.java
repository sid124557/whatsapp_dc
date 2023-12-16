package X;

import java.util.concurrent.ThreadFactory;

/* renamed from: X.343  reason: invalid class name */
public class AnonymousClass343 implements ThreadFactory {
    public final int A00;

    public AnonymousClass343(int i) {
        this.A00 = i;
    }

    public final Thread newThread(Runnable runnable) {
        if (this.A00 != 0) {
            return new C173778Rq(new C71273bq((Object) runnable, 18), "DecryptMessageExecutor");
        }
        return new C173778Rq(runnable, "EphremeralExecutor");
    }
}
