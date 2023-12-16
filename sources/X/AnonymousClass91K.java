package X;

/* renamed from: X.91K  reason: invalid class name */
public class AnonymousClass91K implements AnonymousClass658 {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass91K(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final void BPS(Object obj) {
        switch (this.A02) {
            case 0:
                ((C94134px) this.A00).A0I((C95814uZ) this.A01, (AnonymousClass3ZF) obj);
                return;
            case 1:
                C623234o r1 = (C623234o) this.A00;
                C95814uZ r0 = (C95814uZ) this.A01;
                AnonymousClass3ZF r4 = (AnonymousClass3ZF) obj;
                if (r4 != null) {
                    r1.A06(r0, r4);
                    return;
                }
                return;
            default:
                C94184qG r2 = (C94184qG) this.A00;
                AnonymousClass658 r12 = (AnonymousClass658) this.A01;
                AnonymousClass4q2 r02 = r2.A00;
                if (r02 != null && !r02.A00.A04()) {
                    r12.BPS(obj);
                }
                r2.A00 = null;
                return;
        }
    }
}
