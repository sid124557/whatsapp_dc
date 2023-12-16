package X;

import java.math.BigInteger;

/* renamed from: X.8QL  reason: invalid class name */
public class AnonymousClass8QL implements C834748n {
    public BigInteger A00;
    public BigInteger A01;
    public BigInteger A02;
    public AnonymousClass7W1 A03;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r1.equals(r0) == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof X.AnonymousClass8QL
            r2 = 0
            if (r0 == 0) goto L_0x0013
            X.8QL r4 = (X.AnonymousClass8QL) r4
            java.math.BigInteger r1 = r3.A02
            java.math.BigInteger r0 = r4.A02
            if (r1 == 0) goto L_0x0014
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0017
        L_0x0013:
            return r2
        L_0x0014:
            if (r0 == 0) goto L_0x0017
            return r2
        L_0x0017:
            java.math.BigInteger r1 = r4.A01
            java.math.BigInteger r0 = r3.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0013
            java.math.BigInteger r1 = r4.A00
            java.math.BigInteger r0 = r3.A00
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0013
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8QL.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return AnonymousClass6CA.A05(this.A00, this.A01.hashCode()) ^ C18280x3.A04(this.A02);
    }

    public AnonymousClass8QL(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, AnonymousClass7W1 r5, int i) {
        if (i <= bigInteger.bitLength() || C159797mT.A01("org.spongycastle.dh.allow_unsafe_p_value")) {
            this.A00 = bigInteger2;
            this.A01 = bigInteger;
            this.A02 = bigInteger3;
            this.A03 = r5;
            return;
        }
        throw AnonymousClass001.A0c("unsafe p value so small specific l required");
    }
}
