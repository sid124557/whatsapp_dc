package X;

/* renamed from: X.5ag  reason: invalid class name and case insensitive filesystem */
public final class C107095ag {
    public double A00;
    public C998858o A01;
    public final int A02;
    public final int A03;

    public C107095ag(C998858o r3, int i, int i2) {
        C162457s7.A0J(r3, 3);
        this.A02 = i;
        this.A03 = i2;
        this.A01 = r3;
        this.A00 = 0.0d;
    }

    public static final boolean A02(double d, double d2) {
        return AnonymousClass001.A1V((Math.abs(d - d2) > 1.0E-11d ? 1 : (Math.abs(d - d2) == 1.0E-11d ? 0 : -1)));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        if (r3 == 0.0d) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e3, code lost:
        if (A02(r0, r2) != false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00eb, code lost:
        if (A00(r0, r2) > 0) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f3, code lost:
        if (r4 >= 0) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00fb, code lost:
        if (A00(r0, r2) < 0) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0103, code lost:
        if (A00(r0, r2) <= 0) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0109, code lost:
        if (r0 == 0.0d) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x010b, code lost:
        r0 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0111, code lost:
        if (r0 == 0.0d) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0115, code lost:
        if (r2 != 0.0d) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final double A03(X.AnonymousClass5YC r11, java.util.ArrayList r12, int r13) {
        /*
            r10 = this;
            r6 = 0
            r5 = 18
            int r4 = r10.A02
            java.lang.String r9 = "Object has operation field set to "
            r3 = 19
            r1 = -1
            if (r4 != r1) goto L_0x002c
            int r0 = r10.A03
            if (r0 != r1) goto L_0x01af
            X.58o r2 = r10.A01
            int r0 = r2.ordinal()
            if (r0 == r3) goto L_0x0029
            if (r0 != r5) goto L_0x0133
            java.lang.Object r0 = X.C86654Ky.A0j(r12, r13)
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
            r10.A00 = r0
        L_0x0026:
            double r0 = r10.A00
            return r0
        L_0x0029:
            double r0 = r10.A00
            goto L_0x004c
        L_0x002c:
            if (r4 == r1) goto L_0x01af
            int r3 = r10.A03
            if (r3 != r1) goto L_0x0054
            X.5ag r0 = r11.A0A(r4)
            double r3 = r0.A03(r11, r12, r4)
            X.58o r2 = r10.A01
            int r0 = r2.ordinal()
            if (r0 != r6) goto L_0x0145
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x004a
        L_0x0048:
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x004a:
            r10.A00 = r0
        L_0x004c:
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r12.set(r13, r0)
            goto L_0x0026
        L_0x0054:
            if (r4 == r1) goto L_0x01af
            if (r3 == r1) goto L_0x01af
            X.5ag r0 = r11.A0A(r4)
            double r0 = r0.A03(r11, r12, r4)
            X.5ag r2 = r11.A0A(r3)
            double r2 = r2.A03(r11, r12, r3)
            X.58o r8 = r10.A01
            int r7 = r8.ordinal()
            java.lang.String r6 = "Division by zero found. rightValue="
            r4 = 0
            switch(r7) {
                case 1: goto L_0x0107;
                case 2: goto L_0x010f;
                case 3: goto L_0x00df;
                case 4: goto L_0x00d2;
                case 5: goto L_0x00e7;
                case 6: goto L_0x00ef;
                case 7: goto L_0x00f7;
                case 8: goto L_0x00ff;
                case 9: goto L_0x0118;
                case 10: goto L_0x011b;
                case 11: goto L_0x011e;
                case 12: goto L_0x0087;
                case 13: goto L_0x0121;
                case 14: goto L_0x0127;
                case 15: goto L_0x008f;
                case 16: goto L_0x012d;
                case 17: goto L_0x00c9;
                default: goto L_0x0075;
            }
        L_0x0075:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r9)
            java.lang.String r0 = r8.name()
            r1.append(r0)
            java.lang.String r0 = " which is not defined for two operands!"
            X.5tA r0 = X.C118205tA.A00(r0, r1)
            throw r0
        L_0x0087:
            boolean r4 = A02(r2, r4)
            if (r4 != 0) goto L_0x0157
            double r0 = r0 / r2
            goto L_0x004a
        L_0x008f:
            boolean r6 = A02(r0, r4)
            if (r6 != 0) goto L_0x0198
            int r6 = A00(r0, r4)
            if (r6 < 0) goto L_0x018a
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            boolean r6 = A02(r0, r6)
            if (r6 != 0) goto L_0x017c
            boolean r6 = A02(r2, r4)
            if (r6 != 0) goto L_0x016e
            int r4 = A00(r2, r4)
            if (r4 < 0) goto L_0x0160
            r5 = 0
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00c6
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x00c6
            double r4 = java.lang.Math.log(r2)
            double r2 = java.lang.Math.log(r0)
            double r0 = r4 / r2
            goto L_0x004a
        L_0x00c6:
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            goto L_0x004a
        L_0x00c9:
            boolean r4 = A02(r2, r4)
            if (r4 != 0) goto L_0x01a6
            double r0 = r0 % r2
            goto L_0x004a
        L_0x00d2:
            double r0 = r0 - r2
            double r2 = java.lang.Math.abs(r0)
            r0 = 4442235333156365461(0x3da5fd7fe1796495, double:1.0E-11)
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            goto L_0x00f3
        L_0x00df:
            boolean r0 = A02(r0, r2)
            if (r0 == 0) goto L_0x010b
            goto L_0x0048
        L_0x00e7:
            int r0 = A00(r0, r2)
            if (r0 <= 0) goto L_0x010b
            goto L_0x0048
        L_0x00ef:
            int r4 = A00(r0, r2)
        L_0x00f3:
            if (r4 < 0) goto L_0x010b
            goto L_0x0048
        L_0x00f7:
            int r0 = A00(r0, r2)
            if (r0 >= 0) goto L_0x010b
            goto L_0x0048
        L_0x00ff:
            int r0 = A00(r0, r2)
            if (r0 > 0) goto L_0x010b
            goto L_0x0048
        L_0x0107:
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0113
        L_0x010b:
            r0 = 0
            goto L_0x004a
        L_0x010f:
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0048
        L_0x0113:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0048
            goto L_0x010b
        L_0x0118:
            double r0 = r0 + r2
            goto L_0x004a
        L_0x011b:
            double r0 = r0 - r2
            goto L_0x004a
        L_0x011e:
            double r0 = r0 * r2
            goto L_0x004a
        L_0x0121:
            double r0 = java.lang.Math.min(r0, r2)
            goto L_0x004a
        L_0x0127:
            double r0 = java.lang.Math.max(r0, r2)
            goto L_0x004a
        L_0x012d:
            double r0 = java.lang.Math.pow(r0, r2)
            goto L_0x004a
        L_0x0133:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r9)
            java.lang.String r0 = r2.name()
            r1.append(r0)
            java.lang.String r0 = " which is not defined for zero operands!"
            X.5tA r0 = X.C118205tA.A00(r0, r1)
            throw r0
        L_0x0145:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r9)
            java.lang.String r0 = r2.name()
            r1.append(r0)
            java.lang.String r0 = " which is not defined for one operand!"
            X.5tA r0 = X.C118205tA.A00(r0, r1)
            throw r0
        L_0x0157:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0l(r6)
            X.5tA r0 = A01(r0, r2)
            throw r0
        L_0x0160:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "x of log is negative. rightValue="
            r1.append(r0)
            X.5tA r0 = A01(r1, r2)
            throw r0
        L_0x016e:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "x of log is zero. rightValue="
            r1.append(r0)
            X.5tA r0 = A01(r1, r2)
            throw r0
        L_0x017c:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "Base of log is one. leftValue="
            r3.append(r2)
            X.5tA r0 = A01(r3, r0)
            throw r0
        L_0x018a:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "Base of log is negative. leftValue="
            r3.append(r2)
            X.5tA r0 = A01(r3, r0)
            throw r0
        L_0x0198:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "Base of log is zero. leftValue="
            r3.append(r2)
            X.5tA r0 = A01(r3, r0)
            throw r0
        L_0x01a6:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0l(r6)
            X.5tA r0 = A01(r0, r2)
            throw r0
        L_0x01af:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Object has incorrect fields, can not represent an actual operation node. leftChildIndex="
            r2.append(r0)
            r2.append(r4)
            java.lang.String r0 = ", rightChildIndex="
            r2.append(r0)
            int r0 = r10.A03
            r2.append(r0)
            java.lang.String r0 = ", operation="
            r2.append(r0)
            X.58o r0 = r10.A01
            r2.append(r0)
            java.lang.String r0 = ", value="
            r2.append(r0)
            double r0 = r10.A00
            X.5tA r0 = A01(r2, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107095ag.A03(X.5YC, java.util.ArrayList, int):double");
    }

    public static final int A00(double d, double d2) {
        if (Math.abs(d - d2) < 1.0E-11d) {
            return 0;
        }
        if (d < d2) {
            return -1;
        }
        return 1;
    }

    public static C118205tA A01(StringBuilder sb, double d) {
        sb.append(d);
        return new C118205tA(sb.toString());
    }

    public C107095ag(C998858o r4, int i) {
        C162457s7.A0J(r4, 2);
        this.A02 = i;
        this.A03 = -1;
        this.A01 = r4;
        this.A00 = 0.0d;
    }

    public C107095ag(double d) {
        C998858o r1 = C998858o.CONSTANT;
        this.A02 = -1;
        this.A03 = -1;
        this.A01 = r1;
        this.A00 = d;
    }

    public C107095ag() {
        C998858o r3 = C998858o.VALUE;
        this.A02 = -1;
        this.A03 = -1;
        this.A01 = r3;
        this.A00 = 0.0d;
    }
}
