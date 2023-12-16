package X;

/* renamed from: X.7Zo  reason: invalid class name and case insensitive filesystem */
public final class C152617Zo {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public int hashCode() {
        Object[] objArr = new Object[7];
        objArr[0] = this.A01;
        objArr[1] = this.A00;
        objArr[2] = this.A02;
        objArr[3] = this.A03;
        objArr[4] = this.A04;
        objArr[5] = this.A06;
        return C18310x6.A08(this.A05, objArr, 6);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C152617Zo)) {
            return false;
        }
        C152617Zo r4 = (C152617Zo) obj;
        if (!AnonymousClass72K.A00(this.A01, r4.A01) || !AnonymousClass72K.A00(this.A00, r4.A00) || !AnonymousClass72K.A00(this.A02, r4.A02) || !AnonymousClass72K.A00(this.A03, r4.A03) || !AnonymousClass72K.A00(this.A04, r4.A04) || !AnonymousClass72K.A00(this.A06, r4.A06) || !AnonymousClass72K.A00(this.A05, r4.A05)) {
            return false;
        }
        return true;
    }

    public String toString() {
        C151567Vh r2 = new C151567Vh(this);
        r2.A00(this.A01, "applicationId");
        r2.A00(this.A00, "apiKey");
        r2.A00(this.A02, "databaseUrl");
        r2.A00(this.A04, "gcmSenderId");
        r2.A00(this.A06, "storageBucket");
        r2.A00(this.A05, "projectId");
        return r2.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r3.trim().isEmpty() != false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C152617Zo(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L_0x0010
            java.lang.String r0 = r3.trim()
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            r1 = r0 ^ 1
            java.lang.String r0 = "ApplicationId must be set."
            X.C162177rO.A04(r0, r1)
            r2.A01 = r3
            r2.A00 = r4
            r2.A02 = r5
            r2.A03 = r6
            r2.A04 = r7
            r2.A06 = r8
            r2.A05 = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C152617Zo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
