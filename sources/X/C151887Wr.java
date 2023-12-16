package X;

/* renamed from: X.7Wr  reason: invalid class name and case insensitive filesystem */
public final class C151887Wr {
    public final int A00;
    public final int A01;
    public final C166527yp A02;
    public final C166527yp A03;
    public final String A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C151887Wr.class != obj.getClass()) {
                return false;
            }
            C151887Wr r5 = (C151887Wr) obj;
            if (this.A01 != r5.A01 || this.A00 != r5.A00 || !this.A04.equals(r5.A04) || !this.A03.equals(r5.A03) || !this.A02.equals(r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A02, AnonymousClass000.A08(this.A03, AnonymousClass0x2.A07(this.A04, (((527 + this.A01) * 31) + this.A00) * 31)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        if (r6 == 0) goto L_0x0008;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C151887Wr(X.C166527yp r2, X.C166527yp r3, java.lang.String r4, int r5, int r6) {
        /*
            r1 = this;
            r1.<init>()
            if (r5 == 0) goto L_0x0008
            r0 = 0
            if (r6 != 0) goto L_0x0009
        L_0x0008:
            r0 = 1
        L_0x0009:
            X.C161487pm.A03(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0020
            r1.A04 = r4
            r2.getClass()
            r1.A03 = r2
            r1.A02 = r3
            r1.A01 = r5
            r1.A00 = r6
            return
        L_0x0020:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass6CA.A0N()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C151887Wr.<init>(X.7yp, X.7yp, java.lang.String, int, int):void");
    }
}
