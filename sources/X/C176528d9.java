package X;

/* renamed from: X.8d9  reason: invalid class name and case insensitive filesystem */
public class C176528d9 extends AnonymousClass8Q0 {
    public C183618qL A00;
    public C176768dX A01;

    public static C176528d9 A0A(Object obj) {
        if (obj instanceof C176528d9) {
            return (C176528d9) obj;
        }
        if (obj != null) {
            return new C176528d9(C176958dq.A0C(obj));
        }
        return null;
    }

    public C176528d9(C183618qL r1, C176768dX r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public C176528d9(C176958dq r4) {
        C183618qL r0;
        if (r4.A0U() < 1 || r4.A0U() > 2) {
            throw AnonymousClass8Q0.A01(r4);
        }
        this.A01 = C176768dX.A0A(C176958dq.A0A(r4));
        if (r4.A0U() == 2) {
            r0 = r4.A0W(1);
        } else {
            r0 = null;
        }
        this.A00 = r0;
    }

    public C176528d9(C176768dX r1) {
        this.A01 = r1;
    }
}
