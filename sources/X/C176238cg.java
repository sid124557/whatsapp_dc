package X;

/* renamed from: X.8cg  reason: invalid class name and case insensitive filesystem */
public class C176238cg extends AnonymousClass8Q0 {
    public C176768dX A00;
    public C176958dq A01;

    public C176238cg(C176958dq r4) {
        if (r4.A0U() < 1 || r4.A0U() > 2) {
            throw AnonymousClass8Q0.A01(r4);
        }
        this.A00 = C176768dX.A0A(C176958dq.A0A(r4));
        if (r4.A0U() > 1) {
            this.A01 = C176958dq.A0C(r4.A0W(1));
        }
    }

    public String toString() {
        StringBuffer A0X = AnonymousClass6CA.A0X();
        A0X.append("Policy information: ");
        A0X.append(this.A00);
        C176958dq r4 = this.A01;
        if (r4 != null) {
            StringBuffer A0X2 = AnonymousClass6CA.A0X();
            for (int i = 0; i < r4.A0U(); i++) {
                if (A0X2.length() != 0) {
                    A0X2.append(", ");
                }
                Object A0W = r4.A0W(i);
                if (!(A0W instanceof C176168cZ)) {
                    if (A0W != null) {
                        A0W = new C176168cZ(C176958dq.A0C(A0W));
                    } else {
                        A0W = null;
                    }
                }
                A0X2.append(A0W);
            }
            A0X.append("[");
            A0X.append(A0X2);
            A0X.append("]");
        }
        return A0X.toString();
    }
}
