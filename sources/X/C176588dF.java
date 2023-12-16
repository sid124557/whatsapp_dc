package X;

/* renamed from: X.8dF  reason: invalid class name and case insensitive filesystem */
public class C176588dF extends AnonymousClass8Q0 implements C180078kS {
    public int A00;
    public C183618qL A01;

    public String toString() {
        String str;
        String str2 = C162077rB.A00;
        StringBuffer A0X = AnonymousClass6CA.A0X();
        A0X.append("DistributionPointName: [");
        A0X.append(str2);
        int i = this.A00;
        String obj = this.A01.toString();
        if (i == 0) {
            str = "fullName";
        } else {
            str = "nameRelativeToCRLIssuer";
        }
        AnonymousClass8Q0.A06(str, str2, obj, A0X);
        return AnonymousClass6C7.A0l("]", str2, A0X);
    }

    public C176588dF(C176908dl r3) {
        C183618qL A0B;
        int i = r3.A00;
        this.A00 = i;
        if (i == 0) {
            A0B = new C176518d8(C176958dq.A0D(r3, false));
        } else {
            A0B = C176998du.A0B(r3);
        }
        this.A01 = A0B;
    }

    public C176588dF(C183618qL r2) {
        this.A00 = 0;
        this.A01 = r2;
    }
}
