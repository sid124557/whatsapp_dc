package X;

/* renamed from: X.69Z  reason: invalid class name */
public class AnonymousClass69Z implements C182278o9 {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public AnonymousClass69Z(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj3;
        this.A02 = obj2;
    }

    public final void BYC(int i) {
        if (this.A03 != 0) {
            C113245l7 r4 = (C113245l7) this.A00;
            C30721mu r3 = (C30721mu) this.A01;
            C116095pj r2 = (C116095pj) this.A02;
            if (r4.A6J && r4.A2f(r3, i, r2.A0U, r2.A0Z)) {
                r2.A0T = true;
                return;
            }
            return;
        }
        C93234oB r5 = (C93234oB) this.A00;
        C30721mu r42 = (C30721mu) this.A01;
        C116095pj r6 = (C116095pj) this.A02;
        ((C185738uA) r5.A01.get()).BjM(r42.A1L);
        AnonymousClass677 r22 = r5.A0m;
        C185928uT r32 = (C185928uT) r22;
        if (r32.Ayn(r42, r6.A0U) && r32.Azg(r42, i, r6.A0U, r6.A0Z)) {
            r6.A0T = true;
        } else if (r5.A0G && (r22 instanceof C185928uT)) {
            r32.Bs6(r42, (long) r5.A0b.A03(C66663Mh.A1p), true);
        }
    }
}
