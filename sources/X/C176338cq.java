package X;

import java.math.BigInteger;

/* renamed from: X.8cq  reason: invalid class name and case insensitive filesystem */
public class C176338cq extends AnonymousClass8Q0 {
    public static final BigInteger A03 = BigInteger.valueOf(0);
    public C176748dV A00;
    public C176748dV A01;
    public C176608dH A02;

    public C176338cq(C176958dq r5) {
        C176908dl r0;
        this.A02 = C176608dH.A0A(r5.A0W(0));
        int A0U = r5.A0U();
        if (A0U != 1) {
            if (A0U == 2) {
                r0 = C176908dl.A0A(r5.A0W(1));
                int i = r0.A00;
                if (i == 0) {
                    this.A01 = C176748dV.A0B(r0);
                    return;
                } else if (i != 1) {
                    throw AnonymousClass000.A0G("Bad tag number: ", AnonymousClass001.A0o(), i);
                }
            } else if (A0U == 3) {
                C176908dl A0A = C176908dl.A0A(r5.A0W(1));
                int i2 = A0A.A00;
                if (i2 == 0) {
                    this.A01 = C176748dV.A0B(A0A);
                    r0 = C176908dl.A0A(r5.A0W(2));
                    int i3 = r0.A00;
                    if (i3 != 1) {
                        throw AnonymousClass000.A0G("Bad tag number for 'maximum': ", AnonymousClass001.A0o(), i3);
                    }
                } else {
                    throw AnonymousClass000.A0G("Bad tag number for 'minimum': ", AnonymousClass001.A0o(), i2);
                }
            } else {
                throw AnonymousClass8Q0.A01(r5);
            }
            this.A00 = C176748dV.A0B(r0);
        }
    }
}
