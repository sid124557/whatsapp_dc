package X;

/* renamed from: X.2nY  reason: invalid class name and case insensitive filesystem */
public final class C53722nY {
    public final int A00;
    public final int A01;
    public final AnonymousClass1kT A02;
    public final AnonymousClass1kU A03;
    public final AnonymousClass1kU A04;
    public final C53012mP A05;
    public final String A06;

    public C53722nY(AnonymousClass1kT r2, AnonymousClass1kU r3, AnonymousClass1kU r4, C53012mP r5, String str, int i, int i2) {
        C162457s7.A0J(str, 7);
        this.A00 = i;
        this.A01 = i2;
        this.A02 = r2;
        this.A04 = r3;
        this.A03 = r4;
        this.A05 = r5;
        this.A06 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        r1 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        r1 = r3.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        r1 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004d, code lost:
        r1 = r3.A05;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r2 = 1
            if (r3 == r4) goto L_0x0065
            java.lang.Class<X.2nY> r1 = X.C53722nY.class
            if (r4 == 0) goto L_0x0013
            java.lang.Class r0 = r4.getClass()
        L_0x000b:
            boolean r1 = r1.equals(r0)
            r0 = 0
            if (r1 != 0) goto L_0x0015
            return r0
        L_0x0013:
            r0 = 0
            goto L_0x000b
        L_0x0015:
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.privacy.usernotice.UserNoticeContent"
            X.C162457s7.A0K(r4, r0)
            X.2nY r4 = (X.C53722nY) r4
            int r1 = r3.A00
            int r0 = r4.A00
            if (r1 != r0) goto L_0x0064
            int r1 = r3.A01
            int r0 = r4.A01
            if (r1 != r0) goto L_0x0064
            X.1kT r1 = r3.A02
            if (r1 == 0) goto L_0x0035
            X.1kT r0 = r4.A02
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0064
        L_0x0035:
            X.1kU r1 = r3.A04
            if (r1 == 0) goto L_0x0041
            X.1kU r0 = r4.A04
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0064
        L_0x0041:
            X.1kU r1 = r3.A03
            if (r1 == 0) goto L_0x004d
            X.1kU r0 = r4.A03
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0064
        L_0x004d:
            X.2mP r1 = r3.A05
            if (r1 == 0) goto L_0x0059
            X.2mP r0 = r4.A05
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0064
        L_0x0059:
            java.lang.String r1 = r3.A06
            java.lang.String r0 = r4.A06
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x0064
            return r2
        L_0x0064:
            r2 = 0
        L_0x0065:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53722nY.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int A042 = ((((((((this.A00 * 31) + this.A01) * 31) + C18280x3.A04(this.A02)) * 31) + C18280x3.A04(this.A04)) * 31) + C18280x3.A04(this.A03)) * 31;
        C53012mP r0 = this.A05;
        if (r0 != null) {
            i = r0.hashCode();
        }
        return AnonymousClass0x7.A08(this.A06, (A042 + i) * 31);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("UserNoticeContent{policyVersion=");
        A0o.append(this.A01);
        A0o.append(", banner=");
        A0o.append(this.A02);
        A0o.append(", modal=");
        A0o.append(this.A04);
        A0o.append(", blockingModal=");
        A0o.append(this.A03);
        A0o.append(", badged=");
        return AnonymousClass000.A0Q(this.A05, A0o);
    }
}
