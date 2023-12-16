package X;

/* renamed from: X.8cj  reason: invalid class name and case insensitive filesystem */
public class C176268cj extends AnonymousClass8Q0 {
    public int A00;
    public C176068cP A01;
    public C176528d9 A02;
    public C176198cc A03;
    public boolean A04 = false;

    public int hashCode() {
        if (!this.A04) {
            this.A00 = super.hashCode();
            this.A04 = true;
        }
        return this.A00;
    }

    public C176268cj(C176958dq r4) {
        C176198cc r1;
        if (r4.A0U() == 3) {
            C183618qL A0W = r4.A0W(0);
            if (A0W instanceof C176198cc) {
                r1 = (C176198cc) A0W;
            } else if (A0W != null) {
                r1 = new C176198cc(C176958dq.A0C(A0W));
            } else {
                r1 = null;
            }
            this.A03 = r1;
            this.A02 = C176528d9.A0A(C176958dq.A0B(r4));
            this.A01 = C176068cP.A0A(r4.A0W(2));
            return;
        }
        throw AnonymousClass001.A0c("sequence wrong size for CertificateList");
    }
}
