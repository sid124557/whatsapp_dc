package X;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3f7  reason: invalid class name and case insensitive filesystem */
public class C73213f7 extends Thread {
    public static final String A04 = C73213f7.class.getSimpleName();
    public final ThreadPoolExecutor A00;
    public final AtomicInteger A01;
    public final C53752nb A02;
    public final C59692xK A03;

    public C73213f7(AtomicInteger atomicInteger, C53752nb r11, C59692xK r12, int i, int i2) {
        super("JobConsumer");
        this.A02 = r11;
        this.A03 = r12;
        this.A01 = atomicInteger;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i2, 60, TimeUnit.SECONDS, new SynchronousQueue(), new C117975sn());
        this.A00 = threadPoolExecutor;
        threadPoolExecutor.setRejectedExecutionHandler(new C72203dL(this, r11));
    }

    public void run() {
        while (true) {
            ThreadPoolExecutor threadPoolExecutor = this.A00;
            C53752nb r1 = this.A02;
            Object obj = null;
            do {
                try {
                    obj = r1.A04.take();
                    continue;
                } catch (InterruptedException unused) {
                }
            } while (obj == null);
            threadPoolExecutor.execute(new C70163a3(this, 18, obj));
        }
    }
}
