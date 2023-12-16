package X;

import java.math.BigDecimal;

/* renamed from: X.6df  reason: invalid class name and case insensitive filesystem */
public class C131486df extends C159187lJ {
    public static C131486df A01 = new C131486df((BigDecimal) null);
    public final BigDecimal A00;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000d, code lost:
        r2 = ((X.C159187lJ) r5).A03();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x0022
            boolean r0 = r5 instanceof X.C131486df
            r1 = 0
            if (r0 != 0) goto L_0x000d
            boolean r0 = r5 instanceof X.C131446db
            if (r0 != 0) goto L_0x000d
        L_0x000c:
            return r1
        L_0x000d:
            X.7lJ r5 = (X.C159187lJ) r5
            X.6df r2 = r5.A03()
            X.6df r0 = A01
            if (r2 == r0) goto L_0x000c
            java.math.BigDecimal r1 = r4.A00
            java.math.BigDecimal r0 = r2.A00
            int r0 = r1.compareTo(r0)
            if (r0 == 0) goto L_0x0022
            r3 = 0
        L_0x0022:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C131486df.equals(java.lang.Object):boolean");
    }

    public String toString() {
        return this.A00.toString();
    }

    public C131486df(CharSequence charSequence) {
        this.A00 = new BigDecimal(charSequence.toString());
    }

    public static int A00(C159187lJ r1, C159187lJ r2) {
        return r1.A03().A00.compareTo(r2.A03().A00);
    }

    public C131486df(BigDecimal bigDecimal) {
        this.A00 = bigDecimal;
    }
}
