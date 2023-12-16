package X;

/* renamed from: X.7lq  reason: invalid class name and case insensitive filesystem */
public class C159447lq implements C183378pw {
    public Object A00;
    public final int A01;

    public C159447lq(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BcF() {
        switch (this.A01) {
            case 0:
                C138386qG r1 = (C138386qG) this.A00;
                r1.A0h(r1.A0f());
                return;
            case 1:
                ((C138386qG) this.A00).A01++;
                return;
            case 2:
                ((AnonymousClass567) this.A00).A01++;
                return;
            default:
                AnonymousClass567 r2 = (AnonymousClass567) this.A00;
                AnonymousClass561 r12 = r2.A0D;
                if (r12 != null) {
                    r12.A04 = null;
                    r12.A05 = null;
                }
                r2.A0f();
                C153387bE r0 = r2.A0B;
                if (r0 != null) {
                    r0.A00();
                }
                r2.A0E();
                return;
        }
    }
}
