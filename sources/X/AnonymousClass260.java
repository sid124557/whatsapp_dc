package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.260  reason: invalid class name */
public class AnonymousClass260 implements AnonymousClass4F2 {
    public Object A00;
    public final int A01;

    public AnonymousClass260(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BUB() {
        if (this.A01 == 0) {
            AnonymousClass3U1 r1 = (AnonymousClass3U1) this.A00;
            synchronized (r1) {
                C32231pm r0 = r1.A00;
                if (r0 != null) {
                    r1.A00(r0);
                }
                r1.A00 = null;
                r1.A02.A07(this);
            }
        }
    }

    public /* synthetic */ void BUD() {
        if (this.A01 != 0) {
            ((CountDownLatch) this.A00).countDown();
        }
    }

    public /* synthetic */ void BUC() {
    }

    public /* synthetic */ void BUE() {
    }

    public /* synthetic */ void BUF() {
    }
}
