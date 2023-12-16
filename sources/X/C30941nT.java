package X;

/* renamed from: X.1nT  reason: invalid class name and case insensitive filesystem */
public class C30941nT extends C30281mC {
    public String A00;
    public String A01;

    public void A1H(int i) {
        C626936e.A0E(AnonymousClass000.A1U(i, 2), "FMessageBlankReply can only be quote message.");
        super.A1H(i);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C30941nT r5 = (C30941nT) obj;
            if (!AnonymousClass75J.A00(this.A00, r5.A00) || !AnonymousClass75J.A00(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public C30941nT(AnonymousClass2z0 r2, long j) {
        super(r2, (byte) 33, j);
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = this.A00;
        return C18310x6.A08(this.A01, A0M, 1);
    }
}
