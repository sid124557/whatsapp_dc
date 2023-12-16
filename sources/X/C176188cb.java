package X;

import java.util.Enumeration;

/* renamed from: X.8cb  reason: invalid class name and case insensitive filesystem */
public class C176188cb extends AnonymousClass8Q0 {
    public C176888dj A00;
    public C176748dV A01;
    public C176778dY A02;
    public C176998du A03;
    public C176528d9 A04;

    public C176188cb(C176958dq r7) {
        Enumeration A0V = r7.A0V();
        C176748dV A0A = C176748dV.A0A(A0V.nextElement());
        this.A01 = A0A;
        int A0U = A0A.A0U();
        if (A0U < 0 || A0U > 1) {
            throw AnonymousClass001.A0c("invalid version for private key info");
        }
        this.A04 = C176528d9.A0A(A0V.nextElement());
        this.A02 = C176778dY.A0A(A0V.nextElement());
        int i = -1;
        while (A0V.hasMoreElements()) {
            C176908dl r0 = (C176908dl) A0V.nextElement();
            int i2 = r0.A00;
            if (i2 > i) {
                if (i2 == 0) {
                    this.A03 = C176998du.A0B(r0);
                } else if (i2 != 1) {
                    throw AnonymousClass001.A0c("unknown optional field in private key info");
                } else if (A0U >= 1) {
                    this.A00 = C176068cP.A0B(r0);
                } else {
                    throw AnonymousClass001.A0c("'publicKey' requires version v2(1) or later");
                }
                i = i2;
            } else {
                throw AnonymousClass001.A0c("invalid optional field in private key info");
            }
        }
    }
}
