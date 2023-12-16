package X;

import com.whatsapp.util.Log;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.5Wz  reason: invalid class name and case insensitive filesystem */
public abstract class C105935Wz {
    public final CountDownLatch A00 = new CountDownLatch(1);
    public volatile Object A01;

    public abstract void A01();

    public void A02(Object obj) {
        this.A01 = obj;
        this.A00.countDown();
    }

    public static Object A00(C105935Wz r1) {
        try {
            r1.A01();
            r1.A00.await();
            return r1.A01;
        } catch (Exception e) {
            Log.e("AsyncRunnable/runAndWait", e);
            return null;
        }
    }
}
