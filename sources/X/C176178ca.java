package X;

/* renamed from: X.8ca  reason: invalid class name and case insensitive filesystem */
public class C176178ca extends AnonymousClass8Q0 {
    public C176758dW A00;
    public C176758dW A01;
    public C176358cs A02;
    public C176578dE A03;
    public C176288cl A04;

    public C176178ca(C176958dq r5) {
        C176358cs r1;
        C176578dE r2;
        C176908dl r12;
        C183618qL A0A = C176958dq.A0A(r5);
        if (A0A instanceof C176358cs) {
            r1 = (C176358cs) A0A;
        } else if (A0A != null) {
            r1 = new C176358cs(C176958dq.A0C(A0A));
        } else {
            r1 = null;
        }
        this.A02 = r1;
        C183618qL A0W = r5.A0W(1);
        if (A0W == null || (A0W instanceof C176578dE)) {
            r2 = (C176578dE) A0W;
        } else if (A0W instanceof C176908dl) {
            r2 = new C176578dE((C176908dl) A0W);
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            C18260x0.A1T(A0o, "unknown object in factory: ", A0W);
            throw C18310x6.A0d(A0o);
        }
        this.A03 = r2;
        this.A01 = C176758dW.A0C(r5.A0W(2));
        if (r5.A0U() > 4) {
            this.A00 = C176758dW.A0C(AnonymousClass8Q0.A03((C176908dl) r5.A0W(3)));
            r12 = (C176908dl) r5.A0W(4);
        } else if (r5.A0U() > 3) {
            r12 = (C176908dl) r5.A0W(3);
            if (r12.A00 == 0) {
                this.A00 = C176758dW.A0C(AnonymousClass8Q0.A03(r12));
                return;
            }
        } else {
            return;
        }
        this.A04 = C176288cl.A0B(C176958dq.A0D(r12, true));
    }
}
