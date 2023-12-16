package X;

import java.util.Enumeration;

/* renamed from: X.8co  reason: invalid class name and case insensitive filesystem */
public class C176318co extends AnonymousClass8Q0 {
    public C176068cP A00;
    public C176528d9 A01;

    public static C176318co A0A(Object obj) {
        if (obj instanceof C176318co) {
            return (C176318co) obj;
        }
        if (obj != null) {
            return new C176318co(C176958dq.A0C(obj));
        }
        return null;
    }

    public C176318co(C176958dq r3) {
        if (r3.A0U() == 2) {
            Enumeration A0V = r3.A0V();
            this.A01 = C176528d9.A0A(A0V.nextElement());
            this.A00 = C176068cP.A0A(A0V.nextElement());
            return;
        }
        throw AnonymousClass8Q0.A01(r3);
    }
}
