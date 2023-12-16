package X;

import java.util.Enumeration;

/* renamed from: X.8dJ  reason: invalid class name and case insensitive filesystem */
public class C176628dJ extends AnonymousClass8Q0 implements C186938wB {
    public C183618qL A00;
    public C176768dX A01;
    public boolean A02 = true;

    public C176628dJ(C183618qL r2, C176768dX r3) {
        this.A01 = r3;
        this.A00 = r2;
    }

    public C176628dJ(C176958dq r3) {
        Enumeration A0V = r3.A0V();
        this.A01 = (C176768dX) A0V.nextElement();
        if (A0V.hasMoreElements()) {
            this.A00 = AnonymousClass8Q0.A03((C176908dl) A0V.nextElement());
        }
        this.A02 = r3 instanceof C176928dn;
    }
}
