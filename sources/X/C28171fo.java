package X;

/* renamed from: X.1fo  reason: invalid class name and case insensitive filesystem */
public class C28171fo extends C1000359d {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C28171fo(java.lang.String r3, java.lang.Exception r4) {
        /*
            r2 = this;
            boolean r0 = r4 instanceof java.net.UnknownHostException
            if (r0 == 0) goto L_0x0009
            r0 = 2
        L_0x0005:
            r2.<init>(r4, r3, r0)
            return
        L_0x0009:
            boolean r0 = r4 instanceof java.net.SocketTimeoutException
            if (r0 == 0) goto L_0x000f
            r0 = 3
            goto L_0x0005
        L_0x000f:
            boolean r0 = r4 instanceof org.chromium.net.CronetException
            if (r0 == 0) goto L_0x0027
            java.lang.Integer r1 = X.C154457dC.A00(r4)
            boolean r0 = X.C154457dC.A01(r4)
            if (r0 == 0) goto L_0x0024
            if (r1 == 0) goto L_0x0024
            int r0 = r1.intValue()
            goto L_0x0005
        L_0x0024:
            r0 = 22
            goto L_0x0005
        L_0x0027:
            r0 = 19
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28171fo.<init>(java.lang.String, java.lang.Exception):void");
    }

    public String toString() {
        return AnonymousClass000.A0a("ConnectionFailureException: ", AnonymousClass001.A0o(), this);
    }

    public C28171fo() {
        super((Exception) null, "no internet connection", 25);
    }
}
