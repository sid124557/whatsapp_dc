package X;

import java.math.BigInteger;
import java.security.cert.CRLSelector;

/* renamed from: X.8Qy  reason: invalid class name and case insensitive filesystem */
public class C173628Qy implements C188108yK {
    public final BigInteger A00;
    public final CRLSelector A01;
    public final boolean A02;
    public final boolean A03;
    public final byte[] A04;

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004f, code lost:
        if (java.util.Arrays.equals(r1, r0) == false) goto L_0x0051;
     */
    /* renamed from: A00 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BKp(java.security.cert.CRL r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.security.cert.X509CRL
            if (r0 == 0) goto L_0x0052
            r4 = r7
            java.security.cert.X509CRL r4 = (java.security.cert.X509CRL) r4
            r5 = 0
            X.8dX r0 = X.C176548dB.A0C     // Catch:{ Exception -> 0x0051 }
            java.lang.String r0 = r0.A01     // Catch:{ Exception -> 0x0051 }
            byte[] r0 = r4.getExtensionValue(r0)     // Catch:{ Exception -> 0x0051 }
            if (r0 == 0) goto L_0x001b
            byte[] r0 = X.C176778dY.A0C(r0)     // Catch:{ Exception -> 0x0051 }
            X.8dV r1 = X.C176748dV.A0A(r0)     // Catch:{ Exception -> 0x0051 }
            goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            boolean r0 = r6.A02
            if (r0 == 0) goto L_0x0023
            if (r1 == 0) goto L_0x0038
            return r5
        L_0x0023:
            if (r1 == 0) goto L_0x0038
            java.math.BigInteger r3 = r6.A00
            if (r3 == 0) goto L_0x0038
            r2 = 1
            byte[] r1 = r1.A01
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r2, r1)
            int r0 = r0.compareTo(r3)
            if (r0 != r2) goto L_0x0038
            return r5
        L_0x0038:
            boolean r0 = r6.A03
            if (r0 == 0) goto L_0x0052
            X.8dX r0 = X.C176548dB.A0K
            java.lang.String r0 = r0.A01
            byte[] r1 = r4.getExtensionValue(r0)
            byte[] r0 = r6.A04
            if (r0 != 0) goto L_0x004b
            if (r1 == 0) goto L_0x0052
            return r5
        L_0x004b:
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 != 0) goto L_0x0052
        L_0x0051:
            return r5
        L_0x0052:
            java.security.cert.CRLSelector r0 = r6.A01
            boolean r0 = r0.match(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C173628Qy.BKp(java.security.cert.CRL):boolean");
    }

    public Object clone() {
        return this;
    }

    public C173628Qy(AnonymousClass7OC r2) {
        this.A01 = r2.A04;
        this.A02 = r2.A01;
        this.A00 = r2.A00;
        this.A04 = r2.A03;
        this.A03 = r2.A02;
    }
}
