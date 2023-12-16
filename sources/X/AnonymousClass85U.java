package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.85U  reason: invalid class name */
public class AnonymousClass85U implements C183828qj {
    public final CountDownLatch A00 = C18290x4.A14();
    public volatile AnonymousClass7QS A01;

    public void cancel() {
        AnonymousClass7QS r2 = this.A01;
        if (r2 != null) {
            r2.A0P = true;
            C186348v9 r0 = r2.A08;
            if (r0 != null) {
                r0.cancel();
            }
            C157737in r1 = r2.A06;
            if (r1 != null) {
                r1.A0B = true;
            }
            C152797a8 r02 = r2.A05;
            if (r02 != null) {
                r02.A00();
            }
            this.A01 = null;
        }
    }

    public void BsR() {
        this.A00.await();
    }

    public AnonymousClass85U(AnonymousClass7QS r2) {
        this.A01 = r2;
    }
}
