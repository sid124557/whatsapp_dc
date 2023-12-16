package X;

/* renamed from: X.8cw  reason: invalid class name and case insensitive filesystem */
public class C176398cw extends AnonymousClass8Q0 {
    public C176738dU A00 = C176738dU.A01;
    public C176748dV A01;

    public static C176398cw A0A(Object obj) {
        if (obj instanceof C176398cw) {
            return (C176398cw) obj;
        }
        if (obj != null) {
            return new C176398cw(C176958dq.A0C(obj));
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r1 == 0) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r4 = this;
            X.8dV r3 = r4.A01
            java.lang.String r0 = "BasicConstraints: isCa("
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0l(r0)
            X.8dU r0 = r4.A00
            if (r0 == 0) goto L_0x0011
            byte r1 = r0.A00
            r0 = 1
            if (r1 != 0) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r3 != 0) goto L_0x0021
            r2.append(r0)
            java.lang.String r0 = ")"
            r2.append(r0)
        L_0x001c:
            java.lang.String r0 = r2.toString()
            return r0
        L_0x0021:
            r2.append(r0)
            java.lang.String r0 = "), pathLenConstraint = "
            r2.append(r0)
            byte[] r1 = r3.A01
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r1)
            r2.append(r0)
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C176398cw.toString():java.lang.String");
    }

    public C176398cw(C176958dq r4) {
        if (r4.A0U() == 0) {
            this.A00 = null;
            return;
        }
        if (r4.A0W(0) instanceof C176738dU) {
            this.A00 = C176738dU.A0A(r4.A0W(0));
        } else {
            this.A00 = null;
            this.A01 = C176748dV.A0A(r4.A0W(0));
        }
        if (r4.A0U() <= 1) {
            return;
        }
        if (this.A00 != null) {
            this.A01 = C176748dV.A0A(r4.A0W(1));
            return;
        }
        throw AnonymousClass001.A0c("wrong sequence in constructor");
    }
}
