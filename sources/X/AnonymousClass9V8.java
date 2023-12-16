package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.9V8  reason: invalid class name */
public class AnonymousClass9V8 {
    public static final AtomicInteger A05 = new AtomicInteger(0);
    public C192369Jj A00 = C192369Jj.NOT_STARTED;
    public boolean A01;
    public final int A02;
    public final C193399Oi A03;
    public final C195349Xk A04;

    public void A00(C192369Jj r3) {
        C192369Jj r0 = this.A00;
        if (r3 != r0) {
            int ordinal = r0.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        throw AnonymousClass000.A0E(r3, "Already finished, cannot change to ", AnonymousClass001.A0o());
                    } else if (ordinal == 4) {
                        throw AnonymousClass000.A0E(r3, "Already cancelled, cannot change to ", AnonymousClass001.A0o());
                    }
                } else if (r3 == C192369Jj.FINISHED) {
                    throw new IllegalArgumentException();
                }
            } else if (r3 == C192369Jj.FINISHED || r3 == C192369Jj.PAUSED) {
                throw new IllegalArgumentException();
            }
            this.A00 = r3;
            return;
        }
        throw AnonymousClass000.A0E(r3, "Already in state: ", AnonymousClass001.A0o());
    }

    public AnonymousClass9V8(C193399Oi r2, C195349Xk r3, boolean z) {
        this.A01 = z;
        this.A04 = r3;
        this.A03 = r2;
        this.A02 = A05.incrementAndGet();
    }
}
