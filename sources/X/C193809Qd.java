package X;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.9Qd  reason: invalid class name and case insensitive filesystem */
public class C193809Qd {
    public final AtomicReference A00 = new AtomicReference(new CountDownLatch(0));

    public void A00(int i) {
        CountDownLatch countDownLatch = (CountDownLatch) this.A00.getAndSet(new CountDownLatch(i));
        if (countDownLatch != null) {
            while (countDownLatch.getCount() > 0) {
                countDownLatch.countDown();
            }
        }
    }
}
