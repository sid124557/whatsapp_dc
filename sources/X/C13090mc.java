package X;

/* renamed from: X.0mc  reason: invalid class name and case insensitive filesystem */
public final class C13090mc implements Runnable {
    public final /* synthetic */ AnonymousClass0LV A00;
    public final /* synthetic */ C153427bI A01;
    public final /* synthetic */ AnonymousClass84O A02;
    public final /* synthetic */ AnonymousClass84O A03;
    public final /* synthetic */ Runnable A04;

    public C13090mc(AnonymousClass0LV r1, C153427bI r2, AnonymousClass84O r3, AnonymousClass84O r4, Runnable runnable) {
        this.A00 = r1;
        this.A03 = r3;
        this.A04 = runnable;
        this.A02 = r4;
        this.A01 = r2;
    }

    public final void run() {
        AnonymousClass0LV r1 = this.A00;
        r1.A00 = null;
        if (!r1.A01) {
            r1.A01 = true;
            C835248t A0L = this.A03.A0L(35);
            if (A0L != null) {
                AnonymousClass84O r2 = this.A02;
                C153427bI r12 = this.A01;
                C152057Xj r0 = new C152057Xj();
                r0.A04(r2, 0);
                r0.A04(r12, 1);
                C159377lj.A01(r12, r2, r0.A03(), A0L);
            }
        }
        C835248t A0L2 = this.A03.A0L(36);
        if (A0L2 != null) {
            AnonymousClass84O r22 = this.A02;
            C153427bI r13 = this.A01;
            C152057Xj r02 = new C152057Xj();
            r02.A04(r22, 0);
            r02.A04(r13, 1);
            C159377lj.A01(r13, r22, r02.A03(), A0L2);
        }
        Runnable runnable = this.A04;
        if (runnable != null) {
            runnable.run();
        }
    }
}
