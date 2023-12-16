package X;

/* renamed from: X.8Zu  reason: invalid class name and case insensitive filesystem */
public class C175808Zu extends C159107l8 {
    public int A00;
    public String A01;

    public static C143816zW A01(C159107l8 r3, int i) {
        return new C143816zW(r3.A04, r3.A01, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00bf, code lost:
        if (r1 > r0) goto L_0x00c1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A0C(boolean[] r15) {
        /*
            r14 = this;
            int r2 = r14.A01
            r14.A06()
        L_0x0005:
            char r7 = r14.A00
            r0 = 48
            if (r7 < r0) goto L_0x0013
            r0 = 57
            if (r7 > r0) goto L_0x0013
            r14.A07()
            goto L_0x0005
        L_0x0013:
            r3 = 101(0x65, float:1.42E-43)
            r4 = 26
            r6 = 126(0x7e, float:1.77E-43)
            r1 = 69
            r5 = 1
            r0 = 46
            if (r7 == r0) goto L_0x00fe
            if (r7 == r1) goto L_0x010f
            if (r7 == r3) goto L_0x010f
            r14.A09()
            char r1 = r14.A00
            if (r1 < 0) goto L_0x0044
            if (r1 >= r6) goto L_0x0044
            boolean r0 = r15[r1]
            if (r0 != 0) goto L_0x0044
            if (r1 == r4) goto L_0x0044
            r14.A0B(r15)
            int r0 = r14.A01
            r14.A0E(r2, r0)
            boolean r0 = r14.A09
            if (r0 != 0) goto L_0x01e5
            X.6zW r0 = A01(r14, r5)
            throw r0
        L_0x0044:
            int r0 = r14.A01
            r14.A0E(r2, r0)
            java.lang.String r2 = r14.A04
            int r4 = r2.length()
            r10 = 0
            char r6 = r2.charAt(r10)
            r1 = 45
            r3 = 6
            r8 = 48
            boolean r0 = r14.A07
            if (r6 != r1) goto L_0x0075
            if (r0 != 0) goto L_0x0070
            r0 = 3
            if (r4 < r0) goto L_0x0070
            char r0 = r2.charAt(r5)
            if (r0 != r8) goto L_0x0070
            int r1 = r14.A01
            X.6zW r0 = new X.6zW
            r0.<init>(r2, r1, r3)
            throw r0
        L_0x0070:
            r0 = 20
            r10 = 1
            r13 = 1
            goto L_0x008b
        L_0x0075:
            if (r0 != 0) goto L_0x0088
            r0 = 2
            if (r4 < r0) goto L_0x0088
            char r0 = r2.charAt(r10)
            if (r0 != r8) goto L_0x0088
            int r1 = r14.A01
            X.6zW r0 = new X.6zW
            r0.<init>(r2, r1, r3)
            throw r0
        L_0x0088:
            r0 = 19
            r13 = 0
        L_0x008b:
            r9 = 10
            if (r4 >= r0) goto L_0x00a3
            r5 = 0
        L_0x0090:
            r6 = 0
        L_0x0092:
            r11 = 10
            if (r10 >= r4) goto L_0x00a8
            long r6 = r6 * r11
            int r3 = r10 + 1
            char r0 = r2.charAt(r10)
            int r0 = 48 - r0
            long r0 = (long) r0
            long r6 = r6 + r0
            r10 = r3
            goto L_0x0092
        L_0x00a3:
            if (r4 > r0) goto L_0x00c1
            int r4 = r4 + -1
            goto L_0x0090
        L_0x00a8:
            if (r5 == 0) goto L_0x00cf
            r3 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x00c7
            if (r0 < 0) goto L_0x00c1
            char r1 = r2.charAt(r10)
            r0 = 55
            if (r13 == 0) goto L_0x00bf
            r0 = 56
        L_0x00bf:
            if (r1 <= r0) goto L_0x00c7
        L_0x00c1:
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r2, r9)
            return r0
        L_0x00c7:
            long r6 = r6 * r11
            char r0 = r2.charAt(r10)
            int r8 = r8 - r0
            long r0 = (long) r8
            long r6 = r6 + r0
        L_0x00cf:
            if (r13 == 0) goto L_0x00e7
            boolean r0 = r14.A0I
            if (r0 == 0) goto L_0x00e2
            r1 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00e2
            int r0 = (int) r6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x00e2:
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            return r0
        L_0x00e7:
            long r3 = -r6
            boolean r0 = r14.A0I
            if (r0 == 0) goto L_0x00f9
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00f9
            int r0 = (int) r3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x00f9:
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            return r0
        L_0x00fe:
            r14.A06()
        L_0x0101:
            char r7 = r14.A00
            r0 = 48
            if (r7 < r0) goto L_0x010f
            r0 = 57
            if (r7 > r0) goto L_0x010f
            r14.A07()
            goto L_0x0101
        L_0x010f:
            if (r7 == r1) goto L_0x0133
            if (r7 == r3) goto L_0x0133
            r14.A09()
            char r1 = r14.A00
            if (r1 < 0) goto L_0x0181
            if (r1 >= r6) goto L_0x0181
            boolean r0 = r15[r1]
            if (r0 != 0) goto L_0x0181
            if (r1 == r4) goto L_0x0181
            r14.A0B(r15)
            int r0 = r14.A01
            r14.A0E(r2, r0)
            boolean r0 = r14.A09
            if (r0 != 0) goto L_0x01e5
            X.6zW r0 = A01(r14, r5)
            throw r0
        L_0x0133:
            X.7Vy r3 = r14.A06
            r3.A00(r1)
            r14.A06()
            char r1 = r14.A00
            r0 = 43
            if (r1 == r0) goto L_0x014d
            r0 = 45
            if (r1 == r0) goto L_0x014d
            r0 = 48
            if (r1 < r0) goto L_0x01d2
            r0 = 57
            if (r1 > r0) goto L_0x01d2
        L_0x014d:
            r3.A00(r1)
            r14.A06()
        L_0x0153:
            char r1 = r14.A00
            r0 = 48
            if (r1 < r0) goto L_0x0161
            r0 = 57
            if (r1 > r0) goto L_0x0161
            r14.A07()
            goto L_0x0153
        L_0x0161:
            r14.A09()
            char r1 = r14.A00
            if (r1 < 0) goto L_0x0181
            if (r1 >= r6) goto L_0x0181
            boolean r0 = r15[r1]
            if (r0 != 0) goto L_0x0181
            if (r1 == r4) goto L_0x0181
            r14.A0B(r15)
            int r0 = r14.A01
            r14.A0E(r2, r0)
            boolean r0 = r14.A09
            if (r0 != 0) goto L_0x01e5
            X.6zW r0 = A01(r14, r5)
            throw r0
        L_0x0181:
            int r0 = r14.A01
            r14.A0E(r2, r0)
            boolean r0 = r14.A07
            if (r0 != 0) goto L_0x018d
            r14.A05()
        L_0x018d:
            boolean r0 = r14.A0H     // Catch:{ NumberFormatException -> 0x01cd }
            if (r0 != 0) goto L_0x019c
            java.lang.String r0 = r14.A04     // Catch:{ NumberFormatException -> 0x01cd }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x01cd }
            java.lang.Float r4 = java.lang.Float.valueOf(r0)     // Catch:{ NumberFormatException -> 0x01cd }
            return r4
        L_0x019c:
            java.lang.String r2 = r14.A04     // Catch:{ NumberFormatException -> 0x01cd }
            int r1 = r2.length()     // Catch:{ NumberFormatException -> 0x01cd }
            r0 = 18
            if (r1 <= r0) goto L_0x01c4
            java.math.BigDecimal r4 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x01cd }
            r4.<init>(r2)     // Catch:{ NumberFormatException -> 0x01cd }
            boolean r0 = r14.A0G     // Catch:{ NumberFormatException -> 0x01cd }
            if (r0 != 0) goto L_0x01cc
            java.lang.String r3 = r14.A04     // Catch:{ NumberFormatException -> 0x01cd }
            double r1 = java.lang.Double.parseDouble(r3)     // Catch:{ NumberFormatException -> 0x01cd }
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch:{ NumberFormatException -> 0x01cd }
            boolean r0 = r0.equals(r3)     // Catch:{ NumberFormatException -> 0x01cd }
            if (r0 == 0) goto L_0x01cc
            java.lang.Double r4 = java.lang.Double.valueOf(r1)     // Catch:{ NumberFormatException -> 0x01cd }
            return r4
        L_0x01c4:
            double r0 = java.lang.Double.parseDouble(r2)     // Catch:{ NumberFormatException -> 0x01cd }
            java.lang.Double r4 = java.lang.Double.valueOf(r0)     // Catch:{ NumberFormatException -> 0x01cd }
        L_0x01cc:
            return r4
        L_0x01cd:
            X.6zW r0 = A01(r14, r5)
            throw r0
        L_0x01d2:
            r14.A0B(r15)
            int r0 = r14.A01
            r14.A0E(r2, r0)
            boolean r0 = r14.A09
            if (r0 == 0) goto L_0x01e8
            boolean r0 = r14.A07
            if (r0 != 0) goto L_0x01e5
            r14.A05()
        L_0x01e5:
            java.lang.String r0 = r14.A04
            return r0
        L_0x01e8:
            X.6zW r0 = A01(r14, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175808Zu.A0C(boolean[]):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        r4 = new X.C143816zW(java.lang.Character.valueOf(r1), r5.A01, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c0, code lost:
        r1 = r7.A03(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ca, code lost:
        r0 = A0C(X.C159107l8.A0N);
        r5.A02 = r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A0D(java.lang.String r6, X.C153467bN r7) {
        /*
            r5 = this;
            X.7TE r0 = r7.A00
            r5.A05 = r0
            r5.A01 = r6
            int r0 = r6.length()
            r5.A00 = r0
            r0 = -1
            r5.A01 = r0
        L_0x000f:
            r5.A06()     // Catch:{ IOException -> 0x0111 }
            char r1 = r5.A00     // Catch:{ IOException -> 0x0111 }
            r0 = 9
            if (r1 == r0) goto L_0x000f
            r0 = 10
            if (r1 == r0) goto L_0x000f
            r3 = 1
            switch(r1) {
                case 13: goto L_0x000f;
                case 32: goto L_0x000f;
                case 34: goto L_0x00d3;
                case 39: goto L_0x00d3;
                case 45: goto L_0x00ca;
                case 78: goto L_0x009a;
                case 91: goto L_0x0095;
                case 93: goto L_0x0025;
                case 102: goto L_0x0077;
                case 110: goto L_0x0059;
                case 116: goto L_0x0039;
                case 123: goto L_0x0033;
                case 125: goto L_0x0025;
                default: goto L_0x0020;
            }     // Catch:{ IOException -> 0x0111 }
        L_0x0020:
            switch(r1) {
                case 48: goto L_0x00ca;
                case 49: goto L_0x00ca;
                case 50: goto L_0x00ca;
                case 51: goto L_0x00ca;
                case 52: goto L_0x00ca;
                case 53: goto L_0x00ca;
                case 54: goto L_0x00ca;
                case 55: goto L_0x00ca;
                case 56: goto L_0x00ca;
                case 57: goto L_0x00ca;
                case 58: goto L_0x0025;
                default: goto L_0x0023;
            }     // Catch:{ IOException -> 0x0111 }
        L_0x0023:
            goto L_0x00d9
        L_0x0025:
            int r2 = r5.A01     // Catch:{ IOException -> 0x0111 }
            java.lang.Character r1 = java.lang.Character.valueOf(r1)     // Catch:{ IOException -> 0x0111 }
            r0 = 0
            X.6zW r4 = new X.6zW     // Catch:{ IOException -> 0x0111 }
            r4.<init>(r1, r2, r0)     // Catch:{ IOException -> 0x0111 }
            goto L_0x0105
        L_0x0033:
            java.lang.Object r1 = r5.A03(r7)     // Catch:{ IOException -> 0x0111 }
            goto L_0x00e8
        L_0x0039:
            boolean[] r0 = X.C159107l8.A0N     // Catch:{ IOException -> 0x0111 }
            r5.A0A(r0)     // Catch:{ IOException -> 0x0111 }
            java.lang.String r0 = "true"
            java.lang.String r1 = r5.A04     // Catch:{ IOException -> 0x0111 }
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0111 }
            if (r0 == 0) goto L_0x004c
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ IOException -> 0x0111 }
            goto L_0x00e4
        L_0x004c:
            boolean r0 = r5.A09     // Catch:{ IOException -> 0x0111 }
            if (r0 != 0) goto L_0x00c0
            int r0 = r5.A01     // Catch:{ IOException -> 0x0111 }
            X.6zW r4 = new X.6zW     // Catch:{ IOException -> 0x0111 }
            r4.<init>(r1, r0, r3)     // Catch:{ IOException -> 0x0111 }
            goto L_0x0105
        L_0x0059:
            boolean[] r0 = X.C159107l8.A0N     // Catch:{ IOException -> 0x0111 }
            r5.A0A(r0)     // Catch:{ IOException -> 0x0111 }
            java.lang.String r0 = "null"
            java.lang.String r1 = r5.A04     // Catch:{ IOException -> 0x0111 }
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0111 }
            if (r0 == 0) goto L_0x006a
            r1 = 0
            goto L_0x00e8
        L_0x006a:
            boolean r0 = r5.A09     // Catch:{ IOException -> 0x0111 }
            if (r0 != 0) goto L_0x00c0
            int r0 = r5.A01     // Catch:{ IOException -> 0x0111 }
            X.6zW r4 = new X.6zW     // Catch:{ IOException -> 0x0111 }
            r4.<init>(r1, r0, r3)     // Catch:{ IOException -> 0x0111 }
            goto L_0x0105
        L_0x0077:
            boolean[] r0 = X.C159107l8.A0N     // Catch:{ IOException -> 0x0111 }
            r5.A0A(r0)     // Catch:{ IOException -> 0x0111 }
            java.lang.String r0 = "false"
            java.lang.String r1 = r5.A04     // Catch:{ IOException -> 0x0111 }
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0111 }
            if (r0 == 0) goto L_0x0089
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ IOException -> 0x0111 }
            goto L_0x00e4
        L_0x0089:
            boolean r0 = r5.A09     // Catch:{ IOException -> 0x0111 }
            if (r0 != 0) goto L_0x00c0
            int r0 = r5.A01     // Catch:{ IOException -> 0x0111 }
            X.6zW r4 = new X.6zW     // Catch:{ IOException -> 0x0111 }
            r4.<init>(r1, r0, r3)     // Catch:{ IOException -> 0x0111 }
            goto L_0x0105
        L_0x0095:
            java.lang.Object r1 = r5.A02(r7)     // Catch:{ IOException -> 0x0111 }
            goto L_0x00e8
        L_0x009a:
            boolean[] r0 = X.C159107l8.A0N     // Catch:{ IOException -> 0x0111 }
            r5.A0A(r0)     // Catch:{ IOException -> 0x0111 }
            boolean r0 = r5.A08     // Catch:{ IOException -> 0x0111 }
            if (r0 == 0) goto L_0x00c5
            java.lang.String r0 = "NaN"
            java.lang.String r1 = r5.A04     // Catch:{ IOException -> 0x0111 }
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0111 }
            if (r0 == 0) goto L_0x00b4
            r0 = 2143289344(0x7fc00000, float:NaN)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ IOException -> 0x0111 }
            goto L_0x00e4
        L_0x00b4:
            boolean r0 = r5.A09     // Catch:{ IOException -> 0x0111 }
            if (r0 != 0) goto L_0x00c0
            int r0 = r5.A01     // Catch:{ IOException -> 0x0111 }
            X.6zW r4 = new X.6zW     // Catch:{ IOException -> 0x0111 }
            r4.<init>(r1, r0, r3)     // Catch:{ IOException -> 0x0111 }
            goto L_0x0105
        L_0x00c0:
            java.lang.Object r1 = r7.A03(r1)     // Catch:{ IOException -> 0x0111 }
            goto L_0x00e8
        L_0x00c5:
            X.6zW r4 = A01(r5, r3)     // Catch:{ IOException -> 0x0111 }
            goto L_0x0105
        L_0x00ca:
            boolean[] r0 = X.C159107l8.A0N     // Catch:{ IOException -> 0x0111 }
            java.lang.Object r0 = r5.A0C(r0)     // Catch:{ IOException -> 0x0111 }
            r5.A02 = r0     // Catch:{ IOException -> 0x0111 }
            goto L_0x00e4
        L_0x00d3:
            r5.A08()     // Catch:{ IOException -> 0x0111 }
            java.lang.String r0 = r5.A04     // Catch:{ IOException -> 0x0111 }
            goto L_0x00e4
        L_0x00d9:
            boolean[] r0 = X.C159107l8.A0N     // Catch:{ IOException -> 0x0111 }
            r5.A0A(r0)     // Catch:{ IOException -> 0x0111 }
            boolean r0 = r5.A09     // Catch:{ IOException -> 0x0111 }
            if (r0 == 0) goto L_0x0106
            java.lang.String r0 = r5.A04     // Catch:{ IOException -> 0x0111 }
        L_0x00e4:
            java.lang.Object r1 = r7.A03(r0)     // Catch:{ IOException -> 0x0111 }
        L_0x00e8:
            boolean r0 = r5.A0C     // Catch:{ IOException -> 0x0111 }
            if (r0 == 0) goto L_0x010b
            boolean r0 = r5.A0D     // Catch:{ IOException -> 0x0111 }
            if (r0 != 0) goto L_0x00f3
            r5.A09()     // Catch:{ IOException -> 0x0111 }
        L_0x00f3:
            char r2 = r5.A00     // Catch:{ IOException -> 0x0111 }
            r0 = 26
            if (r2 == r0) goto L_0x010b
            int r1 = r5.A01     // Catch:{ IOException -> 0x0111 }
            int r1 = r1 - r3
            java.lang.Character r0 = java.lang.Character.valueOf(r2)     // Catch:{ IOException -> 0x0111 }
            X.6zW r4 = new X.6zW     // Catch:{ IOException -> 0x0111 }
            r4.<init>(r0, r1, r3)     // Catch:{ IOException -> 0x0111 }
        L_0x0105:
            throw r4     // Catch:{ IOException -> 0x0111 }
        L_0x0106:
            X.6zW r4 = A01(r5, r3)     // Catch:{ IOException -> 0x0111 }
            goto L_0x0105
        L_0x010b:
            r0 = 0
            r5.A04 = r0
            r5.A02 = r0
            return r1
        L_0x0111:
            r2 = move-exception
            int r1 = r5.A01
            X.6zW r0 = new X.6zW
            r0.<init>(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175808Zu.A0D(java.lang.String, X.7bN):java.lang.Object");
    }

    public void A0E(int i, int i2) {
        while (i < i2 - 1 && Character.isWhitespace(this.A01.charAt(i))) {
            i++;
        }
        while (true) {
            int i3 = i2 - 1;
            if (i3 <= i || !Character.isWhitespace(this.A01.charAt(i3))) {
                this.A04 = this.A01.substring(i, i2);
            } else {
                i2--;
            }
        }
        this.A04 = this.A01.substring(i, i2);
    }

    public C175808Zu(int i) {
        super(i);
    }
}
