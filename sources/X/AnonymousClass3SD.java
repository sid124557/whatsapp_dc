package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.3SD  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3SD implements AnonymousClass4B0 {
    public final /* synthetic */ AnonymousClass2ST A00;
    public final /* synthetic */ CountDownLatch A01;

    public final void BVe(Integer num) {
        AnonymousClass2ST r2 = this.A00;
        CountDownLatch countDownLatch = this.A01;
        r2.A01 = C18270x1.A0T(num);
        countDownLatch.countDown();
    }

    public /* synthetic */ AnonymousClass3SD(AnonymousClass2ST r1, CountDownLatch countDownLatch) {
        this.A00 = r1;
        this.A01 = countDownLatch;
    }
}
