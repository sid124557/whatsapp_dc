package X;

/* renamed from: X.3Mw  reason: invalid class name and case insensitive filesystem */
public final class C66813Mw implements C84554Cu {
    public final AnonymousClass2W2 A00;

    public C66813Mw(AnonymousClass2W2 r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0042, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BJr(X.C51692kE r7, X.C624134x r8) {
        /*
            r6 = this;
            r5 = 0
            boolean r1 = X.AnonymousClass0x2.A1Y(r8, r7)
            boolean r0 = r6.BLR(r7, r8)
            if (r0 == 0) goto L_0x0049
            X.2W2 r0 = r6.A00
            X.3dV r0 = r0.A00
            X.4GK r4 = r0.get()
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x003f }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x003f }
            java.lang.String r2 = "SELECT campaign_id FROM premium_message_info WHERE message_row_id = ?"
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x003f }
            X.C624134x.A0Y(r8, r1, r5)     // Catch:{ all -> 0x003f }
            java.lang.String r0 = "GET_PREMIUM_MESSAGE_CAMPAIGN_ID"
            android.database.Cursor r2 = r3.A0E(r2, r0, r1)     // Catch:{ all -> 0x003f }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = "campaign_id"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r2, r0)     // Catch:{ all -> 0x0038 }
            r8.A1b(r0)     // Catch:{ all -> 0x0038 }
        L_0x0034:
            r2.close()     // Catch:{ all -> 0x003f }
            goto L_0x0046
        L_0x0038:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003a }
        L_0x003a:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ all -> 0x003f }
            throw r0     // Catch:{ all -> 0x003f }
        L_0x003f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)
            throw r0
        L_0x0046:
            r4.close()
        L_0x0049:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66813Mw.BJr(X.2kE, X.34x):void");
    }

    public boolean BLR(C51692kE r3, C624134x r4) {
        C162457s7.A0J(r4, 0);
        if (!C624134x.A0f(r4) || r4.A14() != null) {
            return false;
        }
        return true;
    }
}
