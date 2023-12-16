package X;

import java.util.Enumeration;

/* renamed from: X.8cm  reason: invalid class name and case insensitive filesystem */
public class C176298cm extends AnonymousClass8Q0 {
    public C176338cq[] A00;
    public C176338cq[] A01;

    public C176298cm(C176958dq r6) {
        Enumeration A0V = r6.A0V();
        while (A0V.hasMoreElements()) {
            C176908dl A0A = C176908dl.A0A(A0V.nextElement());
            int i = A0A.A00;
            if (i == 0) {
                this.A01 = A0A(C176958dq.A0D(A0A, false));
            } else if (i == 1) {
                this.A00 = A0A(C176958dq.A0D(A0A, false));
            } else {
                throw AnonymousClass000.A0G("Unknown tag encountered: ", AnonymousClass001.A0o(), i);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.8cq[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C176338cq[] A0A(X.C176958dq r5) {
        /*
            int r4 = r5.A0U()
            X.8cq[] r3 = new X.C176338cq[r4]
            r2 = 0
        L_0x0007:
            if (r2 == r4) goto L_0x0023
            X.8qL r1 = r5.A0W(r2)
            if (r1 != 0) goto L_0x0015
            r1 = 0
        L_0x0010:
            r3[r2] = r1
            int r2 = r2 + 1
            goto L_0x0007
        L_0x0015:
            boolean r0 = r1 instanceof X.C176338cq
            if (r0 != 0) goto L_0x0010
            X.8dq r0 = X.C176958dq.A0C(r1)
            X.8cq r1 = new X.8cq
            r1.<init>(r0)
            goto L_0x0010
        L_0x0023:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C176298cm.A0A(X.8dq):X.8cq[]");
    }
}
