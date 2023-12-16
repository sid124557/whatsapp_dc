package X;

/* renamed from: X.9W0  reason: invalid class name */
public final class AnonymousClass9W0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final AnonymousClass9VI A06;
    public final AnonymousClass9VI A07;
    public final AnonymousClass9VI A08;
    public final C203219nJ A09;
    public final AnonymousClass9WK A0A;
    public final AnonymousClass9WK A0B;
    public final AnonymousClass9WK A0C;

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0054 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x0055
            r2 = 0
            if (r5 == 0) goto L_0x005f
            java.lang.Class<X.9W0> r1 = X.AnonymousClass9W0.class
            java.lang.Class r0 = r5.getClass()
            if (r1 != r0) goto L_0x005f
            X.9W0 r5 = (X.AnonymousClass9W0) r5
            int r1 = r4.A00
            int r0 = r5.A00
            if (r1 != r0) goto L_0x0054
            int r1 = r4.A02
            int r0 = r5.A02
            if (r1 != r0) goto L_0x0054
            int r1 = r4.A04
            int r0 = r5.A04
            if (r1 != r0) goto L_0x0054
            int r1 = r4.A05
            int r0 = r5.A05
            if (r1 != r0) goto L_0x0054
            int r1 = r4.A01
            int r0 = r5.A01
            if (r1 != r0) goto L_0x0054
            X.9WK r1 = r4.A0A
            X.9WK r0 = r5.A0A
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0054
            X.9WK r1 = r4.A0C
            X.9WK r0 = r5.A0C
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0054
            X.9WK r1 = r4.A0B
            X.9WK r0 = r5.A0B
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0054
            X.9VI r1 = r4.A06
            X.9VI r0 = r5.A06
            if (r1 != 0) goto L_0x0056
            if (r0 == 0) goto L_0x0055
        L_0x0054:
            r3 = 0
        L_0x0055:
            return r3
        L_0x0056:
            if (r0 == 0) goto L_0x0054
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0054
            return r3
        L_0x005f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9W0.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass9W0(int r12) {
        /*
            r11 = this;
            r7 = 8
            r8 = -1
            r10 = 0
            X.9WK r3 = X.AnonymousClass9WK.A05
            r1 = 0
            r0 = r11
            r6 = r12
            r2 = r1
            r4 = r3
            r5 = r3
            r9 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9W0.<init>(int):void");
    }

    public int hashCode() {
        return ((((((((((((this.A02 + 31) * 31) + this.A04) * 31) + this.A05) * 31) + this.A01) * 31) + this.A0A.hashCode()) * 31) + this.A0C.hashCode()) * 31) + this.A0B.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PaymentBannerConfiguration{bannerVisibility=");
        A0o.append(this.A02);
        A0o.append(", ctaButtonVisibility=");
        A0o.append(this.A04);
        A0o.append(", secondaryCtaButtonVisibility=");
        A0o.append(this.A05);
        A0o.append(", bannerType=");
        A0o.append(this.A01);
        A0o.append(", cta=");
        A0o.append(this.A0A);
        A0o.append(", title=");
        A0o.append(this.A0C);
        A0o.append(", description=");
        A0o.append(this.A0B);
        A0o.append(", bannerOnClickListener=");
        return AnonymousClass000.A0Q(this.A09, A0o);
    }

    public AnonymousClass9W0(AnonymousClass9VI r1, AnonymousClass9VI r2, AnonymousClass9VI r3, C203219nJ r4, AnonymousClass9WK r5, AnonymousClass9WK r6, AnonymousClass9WK r7, int i, int i2, int i3, int i4, int i5, int i6) {
        this.A0A = r5;
        this.A0C = r6;
        this.A0B = r7;
        this.A01 = i6;
        this.A06 = r1;
        this.A07 = r2;
        this.A08 = r3;
        this.A00 = i;
        this.A02 = i2;
        this.A04 = i3;
        this.A05 = i4;
        this.A03 = i5;
        this.A09 = r4;
    }

    public AnonymousClass9W0(AnonymousClass9VI r15, C203219nJ r16, AnonymousClass9WK r17, AnonymousClass9WK r18, AnonymousClass9WK r19, int i, int i2, int i3, int i4, int i5) {
        this(r15, (AnonymousClass9VI) null, (AnonymousClass9VI) null, r16, r17, r18, r19, i, i2, i3, 8, i4, i5);
    }
}
