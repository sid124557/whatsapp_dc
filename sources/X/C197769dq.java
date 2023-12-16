package X;

/* renamed from: X.9dq  reason: invalid class name and case insensitive filesystem */
public class C197769dq implements AnonymousClass4BF, AnonymousClass48M {
    public boolean A00;
    public final C195989a7 A01;
    public final C1907099n A02;
    public final AnonymousClass9U4 A03;
    public final C160757oG A04 = C160757oG.A00("PaymentsLifecycleManager", "network", "COMMON");
    public final C28861ht A05;

    public synchronized void A00() {
        if (this.A00) {
            this.A04.A06("payments was already initialized");
        } else if (this.A02.A02()) {
            this.A04.A06("initializing payments");
            C195989a7 r2 = this.A01;
            synchronized (r2) {
                r2.A00 = true;
                r2.A02.A0S(new C198919fh(r2));
            }
            this.A05.A06(this);
            this.A00 = true;
        }
    }

    public synchronized void A01(boolean z, boolean z2) {
        this.A04.A06("reinitializing payments");
        this.A00 = false;
        this.A03.A0L(z, z2);
        this.A05.A07(this);
        C195989a7 r2 = this.A01;
        synchronized (r2) {
            r2.A00 = false;
            r2.A02.A0S(new C198929fi(r2));
        }
        A00();
    }

    public void BVu(boolean z) {
        if (z) {
            this.A03.A0L(true, false);
        }
    }

    public C197769dq(C40602Ha r4, C195989a7 r5, C1907099n r6, AnonymousClass9U4 r7, C28861ht r8) {
        this.A05 = r8;
        this.A03 = r7;
        this.A02 = r6;
        this.A01 = r5;
        r4.A00 = this;
    }
}
