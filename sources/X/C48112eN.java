package X;

/* renamed from: X.2eN  reason: invalid class name and case insensitive filesystem */
public class C48112eN {
    public final C60692yy A00;

    public synchronized boolean A00(String str, String str2) {
        C60692yy r2 = this.A00;
        String A0Z = C18280x3.A0Z(r2.A01(), C60692yy.A00(str, "auth/token"));
        if (A0Z == null) {
            return false;
        }
        return A0Z.equals(str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A01(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            r3 = 0
            if (r6 == 0) goto L_0x0020
            X.2yy r2 = r4.A00     // Catch:{ all -> 0x001d }
            java.lang.String r0 = "request/token"
            java.lang.String r1 = X.C60692yy.A00(r5, r0)     // Catch:{ all -> 0x001d }
            android.content.SharedPreferences r0 = r2.A01()     // Catch:{ all -> 0x001d }
            java.lang.String r0 = X.C18280x3.A0Z(r0, r1)     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x0020
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x001d }
            monitor-exit(r4)
            return r0
        L_0x001d:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0020:
            monitor-exit(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48112eN.A01(java.lang.String, java.lang.String):boolean");
    }

    public C48112eN(C60692yy r1) {
        this.A00 = r1;
    }
}
