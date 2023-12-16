package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.46E  reason: invalid class name */
public final class AnonymousClass46E extends C73853gB implements C84824Dv {
    public static final AtomicIntegerFieldUpdater A05 = AtomicIntegerFieldUpdater.newUpdater(AnonymousClass46E.class, "runningWorkers");
    public final int A00;
    public final Object A01;
    public final C73853gB A02;
    public final C61122zk A03;
    public final /* synthetic */ C84824Dv A04;
    public volatile int runningWorkers;

    public final Runnable A04() {
        while (true) {
            C61122zk r3 = this.A03;
            Runnable runnable = (Runnable) r3.A01();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.A01) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A05;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (r3.A00() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean A05() {
        synchronized (this.A01) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A05;
            if (atomicIntegerFieldUpdater.get(this) >= this.A00) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    public AnonymousClass4C7 BGx(Runnable runnable, C85494Gl r3, long j) {
        return this.A04.BGx(runnable, r3, j);
    }

    public void Bkq(AnonymousClass4GW r2, long j) {
        this.A04.Bkq(r2, j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r2 = (X.C84824Dv) r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass46E(X.C73853gB r2, int r3) {
        /*
            r1 = this;
            r1.<init>()
            r1.A02 = r2
            r1.A00 = r3
            boolean r0 = r2 instanceof X.C84824Dv
            if (r0 == 0) goto L_0x000f
            X.4Dv r2 = (X.C84824Dv) r2
            if (r2 != 0) goto L_0x0011
        L_0x000f:
            X.4Dv r2 = X.C39212Bc.A00
        L_0x0011:
            r1.A04 = r2
            X.2zk r0 = new X.2zk
            r0.<init>()
            r1.A03 = r0
            java.lang.Object r0 = X.AnonymousClass002.A0D()
            r1.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass46E.<init>(X.3gB, int):void");
    }
}
