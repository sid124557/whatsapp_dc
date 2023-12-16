package X;

/* renamed from: X.3Mv  reason: invalid class name and case insensitive filesystem */
public class C66803Mv implements C84554Cu {
    public final C48102eL A00;

    public boolean BLR(C51692kE r4, C624134x r5) {
        if (!(r5 instanceof C30721mu) || r4.A01) {
            return false;
        }
        C30811nC r52 = (C30811nC) r5;
        if (r52.A00 != null || !AnonymousClass000.A1U(r52.A0A & 32768, 32768)) {
            return false;
        }
        return true;
    }

    public C66803Mv(C48102eL r1) {
        this.A00 = r1;
    }

    public void BJr(C51692kE r2, C624134x r3) {
        if (BLR(r2, r3)) {
            this.A00.A01((C30721mu) r3);
        }
    }
}
