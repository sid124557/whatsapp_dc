package X;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1uD  reason: invalid class name and case insensitive filesystem */
public class C34091uD extends C174368Tz {
    public final /* synthetic */ C69423Wy A00;
    public final /* synthetic */ boolean A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34091uD(C69423Wy r11, String str, BlockingQueue blockingQueue, ThreadFactory threadFactory, TimeUnit timeUnit, int i, int i2, long j, boolean z) {
        super(str, blockingQueue, threadFactory, timeUnit, i, i2, j);
        this.A00 = r11;
        this.A01 = z;
    }

    public void afterExecute(Runnable runnable, Throwable th) {
        if (this.A01) {
            C69423Wy.A06.A01(this, runnable);
        }
    }

    public void beforeExecute(Thread thread, Runnable runnable) {
        if (this.A01) {
            C69423Wy.A06.A03(this, runnable, thread);
        }
    }

    public void execute(Runnable runnable) {
        if (this.A01) {
            C69423Wy.A06.A02(this, runnable);
        }
        super.execute(runnable);
    }
}
