package X;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3Gy  reason: invalid class name and case insensitive filesystem */
public class C65293Gy implements AnonymousClass4EC {
    public final /* synthetic */ C25781b4 A00;
    public final /* synthetic */ C43892Tw A01;
    public final /* synthetic */ AtomicBoolean A02;

    public C65293Gy(C25781b4 r1, C43892Tw r2, AtomicBoolean atomicBoolean) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = atomicBoolean;
    }

    public void BOj(C40462Fx r6) {
        Iterator it = r6.A00.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((AnonymousClass3ZS) it.next()).A00.A0I;
        }
        this.A00.A01 = Long.valueOf((j / 10000000) * 10000000);
        this.A02.set(true);
        this.A01.A07.A0A.remove(this);
    }

    public void BOk(C40472Fy r1) {
    }

    public void BQm(AnonymousClass39K r1, C95814uZ r2) {
    }

    public C65293Gy() {
    }
}
