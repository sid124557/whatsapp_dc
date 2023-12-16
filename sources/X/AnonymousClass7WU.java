package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7WU  reason: invalid class name */
public abstract class AnonymousClass7WU {
    public AnonymousClass7WU A00;
    public C150727Ry A01;
    public AtomicInteger A02 = AnonymousClass6CA.A0d();
    public boolean A03;

    public void A01() {
        AnonymousClass7WU r2 = this.A00;
        if (r2 != null) {
            throw AnonymousClass000.A0H(r2, "Already added to ", AnonymousClass001.A0o());
        }
    }

    public void A02(C150727Ry r4) {
        int incrementAndGet = this.A02.incrementAndGet();
        if (incrementAndGet == 1) {
            this.A01 = r4;
            if (!this.A03) {
                this.A03 = true;
                return;
            }
            throw AnonymousClass001.A0e("Internal bug, expected object to be immutable");
        }
        throw C86604Kt.A0h("Acquired object with non-zero initial refCount current = ", AnonymousClass001.A0o(), incrementAndGet);
    }
}
