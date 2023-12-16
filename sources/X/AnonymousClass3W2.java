package X;

/* renamed from: X.3W2  reason: invalid class name */
public final class AnonymousClass3W2 implements AnonymousClass4BV {
    public final C183538qC A00;

    public AnonymousClass3W2(C183538qC r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public void BhY(C624134x r4, C378824k r5, int i) {
        C162457s7.A0J(r4, 0);
        C614630w A0y = r4.A0y();
        if (A0y != null && A0y.A07()) {
            byte[] A09 = A0y.A09();
            C612830a r0 = (C612830a) this.A00.get();
            if (A09 != null) {
                r0.A03(r4, A09);
            } else {
                r0.A02(r4);
            }
            A0y.A01();
            if (r5 != null) {
                throw C18260x0.A02(AnonymousClass3W2.class);
            }
        }
    }
}
