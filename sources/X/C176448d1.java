package X;

/* renamed from: X.8d1  reason: invalid class name and case insensitive filesystem */
public class C176448d1 extends AnonymousClass8Q0 {
    public C183618qL A00;
    public C176768dX A01;

    public static C176448d1 A0A(Object obj) {
        if (obj instanceof C176448d1) {
            return (C176448d1) obj;
        }
        if (obj != null) {
            return new C176448d1(C176958dq.A0C(obj));
        }
        throw AnonymousClass001.A0c("null value in getInstance()");
    }

    public C176448d1(C183618qL r1, C176768dX r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public C176448d1(C176958dq r2) {
        this.A01 = (C176768dX) C176958dq.A0A(r2);
        this.A00 = C176958dq.A0B(r2);
    }
}
