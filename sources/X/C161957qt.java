package X;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7qt  reason: invalid class name and case insensitive filesystem */
public final class C161957qt {
    public static final BigDecimal A00 = new BigDecimal("100");

    public static final String A00(C620733j r2, long j) {
        C162457s7.A0J(r2, 1);
        String format = DateFormat.getDateInstance(2, C620733j.A02(r2)).format(Long.valueOf(TimeUnit.SECONDS.toMillis(j)));
        C162457s7.A0D(format);
        return format;
    }

    public static final BigDecimal A01(C166207yJ r4, BigDecimal bigDecimal) {
        C162457s7.A0J(r4, 0);
        BigDecimal bigDecimal2 = new BigDecimal(r4.A03);
        BigDecimal add = bigDecimal.multiply(bigDecimal2).add(bigDecimal.multiply(bigDecimal2).multiply(new BigDecimal(r4.A05).divide(A00)));
        C162457s7.A0D(add);
        return add;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0055, code lost:
        return r3.A0X(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A02(X.AnonymousClass1VX r3, java.lang.String r4) {
        /*
            r0 = 0
            X.C162457s7.A0J(r3, r0)
            r2 = 0
            if (r4 == 0) goto L_0x0025
            int r0 = r4.length()
            if (r0 == 0) goto L_0x0025
            r0 = 2617(0xa39, float:3.667E-42)
            boolean r0 = r3.A0X(r0)
            if (r0 == 0) goto L_0x0025
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r4.toLowerCase(r0)
            X.C162457s7.A0D(r1)
            int r0 = r1.hashCode()
            switch(r0) {
                case 113658: goto L_0x0047;
                case 3008417: goto L_0x003c;
                case 3197625: goto L_0x0031;
                case 100023093: goto L_0x0026;
                default: goto L_0x0025;
            }
        L_0x0025:
            return r2
        L_0x0026:
            java.lang.String r0 = "icici"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0025
            r0 = 2739(0xab3, float:3.838E-42)
            goto L_0x0051
        L_0x0031:
            java.lang.String r0 = "hdfc"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0025
            r0 = 2742(0xab6, float:3.842E-42)
            goto L_0x0051
        L_0x003c:
            java.lang.String r0 = "axis"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0025
            r0 = 2741(0xab5, float:3.841E-42)
            goto L_0x0051
        L_0x0047:
            java.lang.String r0 = "sbi"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0025
            r0 = 2740(0xab4, float:3.84E-42)
        L_0x0051:
            boolean r2 = r3.A0X(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161957qt.A02(X.1VX, java.lang.String):boolean");
    }

    public static final boolean A03(AnonymousClass1VX r6, String str) {
        boolean A1Y = AnonymousClass0x2.A1Y(str, r6);
        String A0Q = r6.A0Q(2944);
        C162457s7.A0D(A0Q);
        if (A0Q.length() != 0) {
            for (String str2 : AnonymousClass0x7.A1b(AnonymousClass2AB.A02(A0Q, ","))) {
                C162457s7.A0J(str2, A1Y ? 1 : 0);
                if (str.startsWith(str2)) {
                    return A1Y;
                }
            }
        }
        return false;
    }
}
