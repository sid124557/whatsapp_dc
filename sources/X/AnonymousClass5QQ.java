package X;

/* renamed from: X.5QQ  reason: invalid class name */
public final class AnonymousClass5QQ {
    public final C54292oU A00;
    public final C620733j A01;
    public final AnonymousClass1VX A02;
    public final C102025He A03;
    public final AnonymousClass5BQ A04;

    public final int A00(int i) {
        AnonymousClass1VX r1 = this.A02;
        if (!r1.A0X(4653) || !r1.A0X(5402)) {
            return i;
        }
        String language = C620733j.A02(this.A01).getLanguage();
        C162457s7.A0D(language);
        if (language.equals("") || i < 1000) {
            return i;
        }
        return (i / 1000) * 1000;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0073, code lost:
        if (r2 != null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009b, code lost:
        if (r7 >= r15) goto L_0x009d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0111  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A01(int r18) {
        /*
            r17 = this;
            r3 = r17
            X.1VX r1 = r3.A02
            r0 = 4653(0x122d, float:6.52E-42)
            boolean r0 = r1.A0X(r0)
            r1 = r18
            if (r0 == 0) goto L_0x0199
            X.5He r2 = r3.A03
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            X.2oU r0 = r3.A00
            android.content.res.Resources r9 = X.C54292oU.A00(r0)
            X.C162457s7.A0D(r9)
            r7 = 1000(0x3e8, float:1.401E-42)
            r6 = 1
            X.33j r12 = r2.A00
            java.util.Locale r4 = X.C620733j.A02(r12)
            X.C162457s7.A0D(r4)
            if (r1 != 0) goto L_0x002e
            java.lang.String r0 = ""
            return r0
        L_0x002e:
            int r10 = r1.intValue()
            if (r10 >= r7) goto L_0x0040
            java.text.NumberFormat r0 = java.text.NumberFormat.getNumberInstance(r4)
            java.lang.String r0 = r0.format(r1)
            X.C162457s7.A0D(r0)
            return r0
        L_0x0040:
            X.66R r1 = r2.A01
            java.lang.Object r0 = r1.getValue()
            java.util.Set r0 = (java.util.Set) r0
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L_0x0075
            java.lang.Object r0 = r1.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r3 = r0.iterator()
        L_0x0058:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0185
            java.lang.Object r2 = r3.next()
            r0 = r2
            java.util.Locale r0 = (java.util.Locale) r0
            java.lang.String r1 = r0.getLanguage()
            java.lang.String r0 = r4.getLanguage()
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x0058
            if (r2 == 0) goto L_0x0185
        L_0x0075:
            X.59H r5 = X.AnonymousClass59H.A02
        L_0x0077:
            X.59H r0 = X.AnonymousClass59H.A02
            r4 = 0
            r2 = 4621819117588971520(0x4024000000000000, double:10.0)
            if (r5 != r0) goto L_0x009d
            double r7 = (double) r7
            int r0 = r0.stepSize
            double r0 = (double) r0
            double r15 = java.lang.Math.pow(r2, r0)
            int r0 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x009d
            double r7 = (double) r10
            X.59H r0 = X.AnonymousClass59H.A03
            int r0 = r0.stepSize
            double r0 = (double) r0
            double r13 = java.lang.Math.pow(r2, r0)
            int r0 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r0 < 0) goto L_0x009d
            int r1 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            r0 = 1
            if (r1 < 0) goto L_0x009e
        L_0x009d:
            r0 = 0
        L_0x009e:
            java.lang.String r11 = "%d"
            if (r0 == 0) goto L_0x0111
            java.lang.Object[] r13 = new java.lang.Object[r6]
            double r7 = (double) r10
            X.59H r5 = X.AnonymousClass59H.A03
            int r0 = r5.stepSize
            double r0 = (double) r0
            double r0 = java.lang.Math.pow(r2, r0)
            double r7 = r7 / r0
            int r0 = (int) r7
            X.AnonymousClass000.A1P(r13, r0, r4)
            java.util.Locale r2 = X.C620733j.A02(r12)
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r13, r6)
            int r0 = r1.length
            java.lang.String r13 = X.C86634Kw.A10(r11, r2, r1, r0)
            int r11 = r5.stepSize
        L_0x00c2:
            r0 = 3
            r1 = 2
            r2 = 1
            if (r11 == r0) goto L_0x00fb
            r0 = 4
            if (r11 == r0) goto L_0x00f7
            r0 = 6
            if (r11 == r0) goto L_0x00ff
            r0 = 8
            if (r11 == r0) goto L_0x00f3
            r0 = 9
            if (r11 != r0) goto L_0x0189
            r6 = 2131893844(0x7f121e54, float:1.9422476E38)
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r3 = "%s"
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r4] = r13
        L_0x00e0:
            r2 = 0
            int r0 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            int r0 = r1.length
            java.lang.String r0 = X.C86634Kw.A10(r3, r2, r1, r0)
            java.lang.String r0 = X.C18320x8.A0b(r9, r0, r5, r4, r6)
            X.C162457s7.A0H(r0)
            return r0
        L_0x00f3:
            r6 = 2131893845(0x7f121e55, float:1.9422478E38)
            goto L_0x0102
        L_0x00f7:
            r6 = 2131893847(0x7f121e57, float:1.9422482E38)
            goto L_0x0102
        L_0x00fb:
            r6 = 2131893848(0x7f121e58, float:1.9422484E38)
            goto L_0x0102
        L_0x00ff:
            r6 = 2131893846(0x7f121e56, float:1.942248E38)
        L_0x0102:
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r3 = "%s"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r4] = r13
            java.util.Locale r0 = X.C620733j.A02(r12)
            r1[r2] = r0
            goto L_0x00e0
        L_0x0111:
            double r7 = (double) r10
            int r10 = r5.stepSize
            double r0 = (double) r10
            double r2 = java.lang.Math.pow(r2, r0)
            double r13 = java.lang.Math.log10(r7)
            double r13 = java.lang.Math.floor(r13)
            double r13 = r13 / r0
            double r0 = java.lang.Math.floor(r13)
            double r0 = java.lang.Math.pow(r2, r0)
            double r13 = r7 / r0
            int r10 = r10 - r6
            double r2 = (double) r10
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r1 = java.lang.Math.pow(r0, r2)
            r10 = 10
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x017c
            double r0 = java.lang.Math.floor(r13)
        L_0x013e:
            double r2 = (double) r10
            double r2 = r2 * r0
            double r2 = java.lang.Math.floor(r2)
            int r11 = (int) r2
            int r11 = r11 % r10
            if (r11 != 0) goto L_0x0179
            java.lang.String r10 = "%.0f"
        L_0x014a:
            java.lang.Object[] r3 = new java.lang.Object[r6]
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r3[r4] = r0
            java.util.Locale r2 = X.C620733j.A02(r12)
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r3, r6)
            int r0 = r1.length
            java.lang.String r13 = X.C86634Kw.A10(r10, r2, r1, r0)
            r11 = 0
            r10 = 1
        L_0x0161:
            int r6 = r5.stepSize
            int r1 = r6 + r11
            int r0 = r5.maxMultiplier
            if (r1 > r0) goto L_0x00c2
            double r2 = (double) r6
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r0 = java.lang.Math.pow(r0, r2)
            int r2 = (int) r0
            int r10 = r10 * r2
            double r0 = (double) r10
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 > 0) goto L_0x00c2
            int r11 = r11 + r6
            goto L_0x0161
        L_0x0179:
            java.lang.String r10 = "%.1f"
            goto L_0x014a
        L_0x017c:
            double r2 = (double) r10
            double r13 = r13 * r2
            int r0 = X.C1222663s.A00(r13)
            double r0 = (double) r0
            double r0 = r0 / r2
            goto L_0x013e
        L_0x0185:
            X.59H r5 = X.AnonymousClass59H.A03
            goto L_0x0077
        L_0x0189:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid multiplier: "
            java.lang.String r1 = X.AnonymousClass000.A0Y(r0, r1, r11)
            X.5tC r0 = new X.5tC
            r0.<init>(r1)
            throw r0
        L_0x0199:
            long r1 = (long) r1
            X.33j r0 = r3.A01
            java.text.NumberFormat r0 = r0.A0M()
            java.lang.String r0 = r0.format(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5QQ.A01(int):java.lang.String");
    }

    public AnonymousClass5QQ(C54292oU r1, C620733j r2, AnonymousClass1VX r3, C102025He r4, AnonymousClass5BQ r5) {
        C18260x0.A0f(r3, r4, r2, r1, r5);
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = r1;
        this.A04 = r5;
    }
}
