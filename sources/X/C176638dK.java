package X;

import java.util.Enumeration;

/* renamed from: X.8dK  reason: invalid class name and case insensitive filesystem */
public class C176638dK extends AnonymousClass8Q0 implements C186938wB {
    public C176748dV A00;
    public C176998du A01;
    public C176998du A02;
    public C176998du A03;
    public C176998du A04;
    public C176628dJ A05;

    public C176638dK(C176958dq r5) {
        C176628dJ r1;
        Enumeration A0V = r5.A0V();
        this.A00 = (C176748dV) A0V.nextElement();
        this.A03 = (C176998du) A0V.nextElement();
        Object nextElement = A0V.nextElement();
        if (nextElement instanceof C176628dJ) {
            r1 = (C176628dJ) nextElement;
        } else if (nextElement != null) {
            r1 = new C176628dJ(C176958dq.A0C(nextElement));
        } else {
            r1 = null;
        }
        this.A05 = r1;
        while (A0V.hasMoreElements()) {
            C177088e3 r12 = (C177088e3) A0V.nextElement();
            if (r12 instanceof C176908dl) {
                C176908dl r13 = (C176908dl) r12;
                int i = r13.A00;
                if (i == 0) {
                    this.A01 = C176998du.A0B(r13);
                } else if (i == 1) {
                    this.A02 = C176998du.A0B(r13);
                } else {
                    throw AnonymousClass000.A0G("unknown tag value ", AnonymousClass001.A0o(), i);
                }
            } else {
                this.A04 = (C176998du) r12;
            }
        }
    }

    public C176638dK(C176748dV r2, C176998du r3, C176998du r4, C176998du r5, C176628dJ r6) {
        this.A00 = r2;
        this.A03 = r3;
        this.A05 = r6;
        this.A01 = r4;
        this.A02 = null;
        this.A04 = r5;
    }
}
