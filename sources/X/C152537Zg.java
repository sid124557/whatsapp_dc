package X;

import java.util.Arrays;

/* renamed from: X.7Zg  reason: invalid class name and case insensitive filesystem */
public final class C152537Zg {
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final byte[] A04;
    public final char[] A05;

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0083, code lost:
        r3 = 31 - java.lang.Integer.numberOfLeadingZeros(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0098, code lost:
        r8.A00 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009a, code lost:
        r2 = java.lang.Integer.numberOfTrailingZeros(r3);
        r8.A01 = 1 << (3 - r2);
        r8.A02 = r3 >> r2;
        r8.A04 = r5;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ac, code lost:
        if (r3 >= r8.A02) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ae, code lost:
        X.AnonymousClass72X.A00(java.math.RoundingMode.CEILING, r3 * 8, r8.A00);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ba, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C152537Zg(java.lang.String r9, char[] r10) {
        /*
            r8 = this;
            r7 = 128(0x80, float:1.794E-43)
            byte[] r5 = new byte[r7]
            r6 = -1
            java.util.Arrays.fill(r5, r6)
            r2 = 0
        L_0x0009:
            int r4 = r10.length
            if (r2 >= r4) goto L_0x004c
            char r4 = r10[r2]
            r1 = 1
            boolean r0 = X.AnonymousClass001.A1Y(r4, r7)
            java.lang.String r3 = "Non-ASCII character: %s"
            if (r0 == 0) goto L_0x003a
            byte r0 = r5[r4]
            if (r0 == r6) goto L_0x001c
            r1 = 0
        L_0x001c:
            java.lang.String r3 = "Duplicate character: %s"
            if (r1 == 0) goto L_0x0026
            byte r0 = (byte) r2
            r5[r4] = r0
            int r2 = r2 + 1
            goto L_0x0009
        L_0x0026:
            java.lang.Object[] r2 = X.AnonymousClass002.A0L()
            r1 = 0
            java.lang.Character r0 = java.lang.Character.valueOf(r4)
            r2[r1] = r0
            java.lang.String r0 = X.AnonymousClass72W.A00(r3, r2)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x003a:
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r1 = 0
            java.lang.Character r0 = java.lang.Character.valueOf(r4)
            r2[r1] = r0
            java.lang.String r0 = X.AnonymousClass72W.A00(r3, r2)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x004c:
            r8.<init>()
            r8.A03 = r9
            r8.A05 = r10
            java.math.RoundingMode r1 = java.math.RoundingMode.UNNECESSARY     // Catch:{ ArithmeticException -> 0x00bb }
            if (r4 <= 0) goto L_0x0073
            int[] r0 = X.C1456976x.A00     // Catch:{ ArithmeticException -> 0x00bb }
            int r0 = X.AnonymousClass6CA.A04(r1, r0)     // Catch:{ ArithmeticException -> 0x00bb }
            switch(r0) {
                case 1: goto L_0x0066;
                case 2: goto L_0x0083;
                case 3: goto L_0x0083;
                case 4: goto L_0x007a;
                case 5: goto L_0x007a;
                case 6: goto L_0x008a;
                case 7: goto L_0x008a;
                case 8: goto L_0x008a;
                default: goto L_0x0060;
            }     // Catch:{ ArithmeticException -> 0x00bb }
        L_0x0060:
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch:{ ArithmeticException -> 0x00bb }
            r1.<init>()     // Catch:{ ArithmeticException -> 0x00bb }
        L_0x0065:
            throw r1     // Catch:{ ArithmeticException -> 0x00bb }
        L_0x0066:
            int r0 = r4 + -1
            r0 = r0 & r4
            if (r0 == 0) goto L_0x0083
            java.lang.String r0 = "mode was UNNECESSARY, but rounding was necessary"
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException     // Catch:{ ArithmeticException -> 0x00bb }
            r1.<init>(r0)     // Catch:{ ArithmeticException -> 0x00bb }
            goto L_0x0065
        L_0x0073:
            java.lang.String r0 = "x (0) must be > 0"
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A0c(r0)     // Catch:{ ArithmeticException -> 0x00bb }
            goto L_0x0065
        L_0x007a:
            int r0 = r4 + -1
            int r0 = java.lang.Integer.numberOfLeadingZeros(r0)     // Catch:{ ArithmeticException -> 0x00bb }
            int r3 = 32 - r0
            goto L_0x0098
        L_0x0083:
            int r0 = java.lang.Integer.numberOfLeadingZeros(r4)     // Catch:{ ArithmeticException -> 0x00bb }
            int r3 = 31 - r0
            goto L_0x0098
        L_0x008a:
            int r1 = java.lang.Integer.numberOfLeadingZeros(r4)     // Catch:{ ArithmeticException -> 0x00bb }
            r0 = -1257966797(0xffffffffb504f333, float:-4.9527733E-7)
            int r0 = r0 >>> r1
            int r3 = 31 - r1
            int r0 = r0 - r4
            int r0 = r0 >>> 31
            int r3 = r3 + r0
        L_0x0098:
            r8.A00 = r3     // Catch:{ ArithmeticException -> 0x00bb }
            int r2 = java.lang.Integer.numberOfTrailingZeros(r3)
            int r1 = 3 - r2
            r0 = 1
            int r0 = r0 << r1
            r8.A01 = r0
            int r3 = r3 >> r2
            r8.A02 = r3
            r8.A04 = r5
            r3 = 0
        L_0x00aa:
            int r0 = r8.A02
            if (r3 >= r0) goto L_0x00ba
            int r2 = r3 * 8
            int r1 = r8.A00
            java.math.RoundingMode r0 = java.math.RoundingMode.CEILING
            X.AnonymousClass72X.A00(r0, r2, r1)
            int r3 = r3 + 1
            goto L_0x00aa
        L_0x00ba:
            return
        L_0x00bb:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Illegal alphabet length "
            java.lang.String r1 = X.AnonymousClass000.A0Y(r0, r1, r4)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C152537Zg.<init>(java.lang.String, char[]):void");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C152537Zg) || !Arrays.equals(this.A05, ((C152537Zg) obj).A05)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.A05) + 1237;
    }

    public final String toString() {
        return this.A03;
    }
}
