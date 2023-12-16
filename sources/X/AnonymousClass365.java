package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.365  reason: invalid class name */
public class AnonymousClass365 implements AnonymousClass4CJ {
    public Object A00;
    public final int A01;

    public AnonymousClass365(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BRB(C108985dt r4) {
        if (this.A01 != 0) {
            ((AnonymousClass4B0) this.A00).BVe(C18280x3.A0S());
            return;
        }
        C41682Le r0 = (C41682Le) this.A00;
        AnonymousClass2ST r1 = r0.A00;
        CountDownLatch countDownLatch = r0.A01;
        r1.A02 = "direct_connection";
        countDownLatch.countDown();
    }

    public void BXC(C108985dt r4) {
        if (this.A01 != 0) {
            AnonymousClass4B0 r1 = (AnonymousClass4B0) this.A00;
            Integer num = null;
            if (r4 != null) {
                num = C18290x4.A0a();
            }
            r1.BVe(num);
            return;
        }
        C41682Le r0 = (C41682Le) this.A00;
        AnonymousClass2ST r12 = r0.A00;
        CountDownLatch countDownLatch = r0.A01;
        r12.A02 = "non_direct_connection";
        countDownLatch.countDown();
    }
}
