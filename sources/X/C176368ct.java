package X;

/* renamed from: X.8ct  reason: invalid class name and case insensitive filesystem */
public class C176368ct extends AnonymousClass8Q0 {
    public C176958dq A00;
    public C176068cP A01;
    public C176528d9 A02;
    public C176378cu A03;

    public static C176368ct A0A(Object obj) {
        if (obj instanceof C176368ct) {
            return (C176368ct) obj;
        }
        if (obj != null) {
            return new C176368ct(C176958dq.A0C(obj));
        }
        return null;
    }

    public C176368ct(C176958dq r3) {
        this.A00 = r3;
        if (r3.A0U() == 3) {
            this.A03 = C176378cu.A0A(C176958dq.A0A(r3));
            this.A02 = C176528d9.A0A(C176958dq.A0B(r3));
            this.A01 = C176068cP.A0A(r3.A0W(2));
            return;
        }
        throw AnonymousClass001.A0c("sequence wrong size for a certificate");
    }
}
