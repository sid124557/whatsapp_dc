package X;

import java.util.Arrays;

/* renamed from: X.7Zn  reason: invalid class name and case insensitive filesystem */
public final class C152607Zn {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final byte[] A05;
    public final char[] A06;

    public boolean equals(Object obj) {
        if (obj instanceof C152607Zn) {
            return Arrays.equals(this.A06, ((C152607Zn) obj).A06);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.A06);
    }

    public String toString() {
        return this.A04;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005a, code lost:
        r2 = 31 - java.lang.Integer.numberOfLeadingZeros(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0069, code lost:
        r10.A00 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006b, code lost:
        r0 = java.lang.Math.min(8, java.lang.Integer.lowestOneBit(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r10.A02 = 8 / r0;
        r10.A01 = r2 / r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007b, code lost:
        r10.A03 = r9 - 1;
        r6 = new byte[128];
        java.util.Arrays.fill(r6, (byte) -1);
        r3 = 0;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008a, code lost:
        r4 = r12[r1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0092, code lost:
        if (X.AnonymousClass001.A1Y(r4, 128) == false) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009c, code lost:
        if (X.AnonymousClass000.A1U(r6[r4], -1) == false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009e, code lost:
        r6[r4] = (byte) r1;
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a3, code lost:
        if (r1 < r9) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a5, code lost:
        r10.A05 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a9, code lost:
        if (r3 >= r10.A01) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ab, code lost:
        r1 = r10.A00;
        X.C1447572v.A00(java.math.RoundingMode.CEILING, r3 * 8, r1);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c8, code lost:
        throw X.AnonymousClass001.A0c(com.google.common.base.Strings.A00("Duplicate character: %s", java.lang.Character.valueOf(r4)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d9, code lost:
        throw X.AnonymousClass001.A0c(com.google.common.base.Strings.A00("Non-ASCII character: %s", java.lang.Character.valueOf(r4)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00da, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00db, code lost:
        r2 = new java.lang.String(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ef, code lost:
        throw new java.lang.IllegalArgumentException(X.AnonymousClass6C7.A0k("Illegal alphabet ", r2, r2.length()), r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C152607Zn(java.lang.String r11, char[] r12) {
        /*
            r10 = this;
            r10.<init>()
            r11.getClass()
            r10.A04 = r11
            r12.getClass()
            r10.A06 = r12
            int r9 = r12.length     // Catch:{ ArithmeticException -> 0x00f0 }
            java.math.RoundingMode r2 = java.math.RoundingMode.UNNECESSARY     // Catch:{ ArithmeticException -> 0x00f0 }
            java.lang.String r1 = "x"
            if (r9 <= 0) goto L_0x0030
            int[] r0 = X.AnonymousClass778.A00     // Catch:{ ArithmeticException -> 0x00f0 }
            int r0 = X.AnonymousClass6CA.A04(r2, r0)     // Catch:{ ArithmeticException -> 0x00f0 }
            switch(r0) {
                case 1: goto L_0x0023;
                case 2: goto L_0x005a;
                case 3: goto L_0x005a;
                case 4: goto L_0x0061;
                case 5: goto L_0x0061;
                case 6: goto L_0x0049;
                case 7: goto L_0x0049;
                case 8: goto L_0x0049;
                default: goto L_0x001d;
            }     // Catch:{ ArithmeticException -> 0x00f0 }
        L_0x001d:
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch:{ ArithmeticException -> 0x00f0 }
            r1.<init>()     // Catch:{ ArithmeticException -> 0x00f0 }
        L_0x0022:
            throw r1     // Catch:{ ArithmeticException -> 0x00f0 }
        L_0x0023:
            int r0 = r9 + -1
            r0 = r0 & r9
            if (r0 == 0) goto L_0x005a
            java.lang.String r0 = "mode was UNNECESSARY, but rounding was necessary"
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException     // Catch:{ ArithmeticException -> 0x00f0 }
            r1.<init>(r0)     // Catch:{ ArithmeticException -> 0x00f0 }
            goto L_0x0022
        L_0x0030:
            int r0 = X.AnonymousClass6C7.A06(r1)     // Catch:{ ArithmeticException -> 0x00f0 }
            int r0 = r0 + 26
            java.lang.StringBuilder r1 = X.AnonymousClass6C8.A0g(r0, r1)     // Catch:{ ArithmeticException -> 0x00f0 }
            java.lang.String r0 = " ("
            r1.append(r0)     // Catch:{ ArithmeticException -> 0x00f0 }
            r1.append(r9)     // Catch:{ ArithmeticException -> 0x00f0 }
            java.lang.String r0 = ") must be > 0"
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0F(r0, r1)     // Catch:{ ArithmeticException -> 0x00f0 }
            goto L_0x0022
        L_0x0049:
            int r1 = java.lang.Integer.numberOfLeadingZeros(r9)     // Catch:{ ArithmeticException -> 0x00f0 }
            r0 = -1257966797(0xffffffffb504f333, float:-4.9527733E-7)
            int r0 = r0 >>> r1
            int r2 = 31 - r1
            int r0 = r0 - r9
            int r0 = ~r0     // Catch:{ ArithmeticException -> 0x00f0 }
            int r0 = ~r0     // Catch:{ ArithmeticException -> 0x00f0 }
            int r0 = r0 >>> 31
            int r2 = r2 + r0
            goto L_0x0069
        L_0x005a:
            int r0 = java.lang.Integer.numberOfLeadingZeros(r9)     // Catch:{ ArithmeticException -> 0x00f0 }
            int r2 = 31 - r0
            goto L_0x0069
        L_0x0061:
            int r0 = r9 + -1
            int r0 = java.lang.Integer.numberOfLeadingZeros(r0)     // Catch:{ ArithmeticException -> 0x00f0 }
            int r2 = 32 - r0
        L_0x0069:
            r10.A00 = r2     // Catch:{ ArithmeticException -> 0x00f0 }
            int r0 = java.lang.Integer.lowestOneBit(r2)
            r1 = 8
            int r0 = java.lang.Math.min(r1, r0)
            int r1 = r1 / r0
            r10.A02 = r1     // Catch:{ ArithmeticException -> 0x00da }
            int r2 = r2 / r0
            r10.A01 = r2     // Catch:{ ArithmeticException -> 0x00da }
            r8 = 1
            int r0 = r9 - r8
            r10.A03 = r0
            r7 = 128(0x80, float:1.794E-43)
            byte[] r6 = new byte[r7]
            r5 = -1
            java.util.Arrays.fill(r6, r5)
            r3 = 0
            r1 = 0
        L_0x008a:
            char r4 = r12[r1]
            boolean r0 = X.AnonymousClass001.A1Y(r4, r7)
            java.lang.String r2 = "Non-ASCII character: %s"
            if (r0 == 0) goto L_0x00c9
            byte r0 = r6[r4]
            boolean r0 = X.AnonymousClass000.A1U(r0, r5)
            java.lang.String r2 = "Duplicate character: %s"
            if (r0 == 0) goto L_0x00b8
            byte r0 = (byte) r1
            r6[r4] = r0
            int r1 = r1 + 1
            if (r1 < r9) goto L_0x008a
            r10.A05 = r6
        L_0x00a7:
            int r0 = r10.A01
            if (r3 >= r0) goto L_0x00b7
            int r2 = r3 * 8
            int r1 = r10.A00
            java.math.RoundingMode r0 = java.math.RoundingMode.CEILING
            X.C1447572v.A00(r0, r2, r1)
            int r3 = r3 + 1
            goto L_0x00a7
        L_0x00b7:
            return
        L_0x00b8:
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.Character r0 = java.lang.Character.valueOf(r4)
            r1[r3] = r0
            java.lang.String r0 = com.google.common.base.Strings.A00(r2, r1)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x00c9:
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.Character r0 = java.lang.Character.valueOf(r4)
            r1[r3] = r0
            java.lang.String r0 = com.google.common.base.Strings.A00(r2, r1)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x00da:
            r3 = move-exception
            java.lang.String r2 = new java.lang.String
            r2.<init>(r12)
            int r1 = r2.length()
            java.lang.String r0 = "Illegal alphabet "
            java.lang.String r1 = X.AnonymousClass6C7.A0k(r0, r2, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1, r3)
            throw r0
        L_0x00f0:
            r3 = move-exception
            int r2 = r12.length
            r0 = 35
            java.lang.StringBuilder r1 = X.AnonymousClass6CA.A0Y(r0)
            java.lang.String r0 = "Illegal alphabet length "
            java.lang.String r1 = X.AnonymousClass000.A0Y(r0, r1, r2)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C152607Zn.<init>(java.lang.String, char[]):void");
    }
}
