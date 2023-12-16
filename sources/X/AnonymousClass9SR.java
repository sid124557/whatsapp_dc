package X;

/* renamed from: X.9SR  reason: invalid class name */
public final class AnonymousClass9SR {
    public Runnable A00;
    public final AnonymousClass4FS A01;

    public synchronized void A00() {
        Runnable runnable = this.A00;
        if (runnable != null) {
            this.A01.BjN(runnable);
            this.A00 = null;
        }
    }

    public synchronized void A01(long j) {
        A00();
        this.A00 = this.A01.Bkn(new C199889hR(this, j), "LiteCameraView/GarbageCollector", j);
    }

    public AnonymousClass9SR(AnonymousClass4FS r1) {
        this.A01 = r1;
    }
}
