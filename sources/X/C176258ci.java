package X;

import java.util.Enumeration;

/* renamed from: X.8ci  reason: invalid class name and case insensitive filesystem */
public class C176258ci extends AnonymousClass8Q0 {
    public C176748dV A00;
    public C176778dY A01;
    public C176518d8 A02;

    public String toString() {
        String str;
        C176778dY r0 = this.A01;
        if (r0 != null) {
            byte[] bArr = r0.A00;
            str = AnonymousClass6C9.A0g(bArr, bArr.length);
        } else {
            str = "null";
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AuthorityKeyIdentifier: KeyID(");
        A0o.append(str);
        return AnonymousClass000.A0e(A0o);
    }

    public C176258ci(C176958dq r6) {
        Enumeration A0V = r6.A0V();
        while (A0V.hasMoreElements()) {
            C176908dl A0A = C176908dl.A0A(A0V.nextElement());
            int i = A0A.A00;
            if (i == 0) {
                this.A01 = C176778dY.A0B(A0A, false);
            } else if (i == 1) {
                this.A02 = new C176518d8(C176958dq.A0D(A0A, false));
            } else if (i == 2) {
                this.A00 = C176748dV.A0B(A0A);
            } else {
                throw AnonymousClass001.A0c("illegal tag");
            }
        }
    }
}
