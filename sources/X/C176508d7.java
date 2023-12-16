package X;

/* renamed from: X.8d7  reason: invalid class name and case insensitive filesystem */
public class C176508d7 extends AnonymousClass8Q0 {
    public C176958dq A00;
    public C176588dF A01;
    public C177048dz A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;

    public static C176508d7 A0A(Object obj) {
        if (obj instanceof C176508d7) {
            return (C176508d7) obj;
        }
        if (obj != null) {
            return new C176508d7(C176958dq.A0C(obj));
        }
        return null;
    }

    public String toString() {
        String str = C162077rB.A00;
        StringBuffer A0X = AnonymousClass6CA.A0X();
        A0X.append("IssuingDistributionPoint: [");
        A0X.append(str);
        C176588dF r0 = this.A01;
        if (r0 != null) {
            AnonymousClass8Q0.A06("distributionPoint", str, r0.toString(), A0X);
        }
        if (this.A06) {
            AnonymousClass8Q0.A06("onlyContainsUserCerts", str, "true", A0X);
        }
        if (this.A05) {
            AnonymousClass8Q0.A06("onlyContainsCACerts", str, "true", A0X);
        }
        C177048dz r02 = this.A02;
        if (r02 != null) {
            AnonymousClass8Q0.A06("onlySomeReasons", str, r02.toString(), A0X);
        }
        if (this.A04) {
            AnonymousClass8Q0.A06("onlyContainsAttributeCerts", str, "true", A0X);
        }
        if (this.A03) {
            AnonymousClass8Q0.A06("indirectCRL", str, "true", A0X);
        }
        return AnonymousClass6C7.A0l("]", str, A0X);
    }

    public C176508d7(C176958dq r5) {
        C176588dF r0;
        this.A00 = r5;
        for (int i = 0; i != r5.A0U(); i++) {
            C176908dl A0A = C176908dl.A0A(r5.A0W(i));
            int i2 = A0A.A00;
            if (i2 == 0) {
                C176908dl A0A2 = C176908dl.A0A(AnonymousClass8Q0.A03(A0A));
                if (A0A2 != null) {
                    r0 = new C176588dF(A0A2);
                } else {
                    r0 = null;
                }
                this.A01 = r0;
            } else if (i2 == 1) {
                this.A06 = AnonymousClass000.A1S(C176738dU.A0B(A0A).A00);
            } else if (i2 == 2) {
                this.A05 = AnonymousClass000.A1S(C176738dU.A0B(A0A).A00);
            } else if (i2 == 3) {
                this.A02 = new C177048dz(C176068cP.A0B(A0A));
            } else if (i2 == 4) {
                this.A03 = AnonymousClass000.A1S(C176738dU.A0B(A0A).A00);
            } else if (i2 == 5) {
                this.A04 = AnonymousClass000.A1S(C176738dU.A0B(A0A).A00);
            } else {
                throw AnonymousClass001.A0c("unknown tag in IssuingDistributionPoint");
            }
        }
    }
}
