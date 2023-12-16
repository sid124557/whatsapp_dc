package X;

/* renamed from: X.8d6  reason: invalid class name and case insensitive filesystem */
public class C176498d6 extends AnonymousClass8Q0 {
    public C176588dF A00;
    public C176518d8 A01;
    public C177048dz A02;

    public String toString() {
        String str = C162077rB.A00;
        StringBuffer A0X = AnonymousClass6CA.A0X();
        A0X.append("DistributionPoint: [");
        A0X.append(str);
        C176588dF r0 = this.A00;
        if (r0 != null) {
            AnonymousClass8Q0.A06("distributionPoint", str, r0.toString(), A0X);
        }
        C177048dz r02 = this.A02;
        if (r02 != null) {
            AnonymousClass8Q0.A06("reasons", str, r02.toString(), A0X);
        }
        C176518d8 r03 = this.A01;
        if (r03 != null) {
            AnonymousClass8Q0.A06("cRLIssuer", str, r03.toString(), A0X);
        }
        return AnonymousClass6C7.A0l("]", str, A0X);
    }

    public C176498d6(C176958dq r6) {
        C176588dF r0;
        for (int i = 0; i != r6.A0U(); i++) {
            C176908dl A0A = C176908dl.A0A(r6.A0W(i));
            int i2 = A0A.A00;
            if (i2 == 0) {
                C176908dl A0A2 = C176908dl.A0A(AnonymousClass8Q0.A03(A0A));
                if (A0A2 != null) {
                    r0 = new C176588dF(A0A2);
                } else {
                    r0 = null;
                }
                this.A00 = r0;
            } else if (i2 == 1) {
                this.A02 = new C177048dz(C176068cP.A0B(A0A));
            } else if (i2 == 2) {
                this.A01 = new C176518d8(C176958dq.A0D(A0A, false));
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Unknown tag encountered in structure: ");
                A0o.append(A0A.A00);
                throw C18310x6.A0d(A0o);
            }
        }
    }

    public C176498d6(C176588dF r2) {
        this.A00 = r2;
        this.A02 = null;
        this.A01 = null;
    }
}
