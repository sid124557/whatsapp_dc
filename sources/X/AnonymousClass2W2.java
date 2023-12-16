package X;

/* renamed from: X.2W2  reason: invalid class name */
public final class AnonymousClass2W2 {
    public final C72303dV A00;

    public AnonymousClass2W2(C72303dV r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C624134x r6) {
        /*
            r5 = this;
            java.lang.String r1 = r6.A14()
            if (r1 == 0) goto L_0x002c
            X.3dV r0 = r5.A00
            X.4Fq r4 = r0.A04()
            android.content.ContentValues r3 = X.C18280x3.A09()     // Catch:{ all -> 0x0025 }
            X.C624134x.A0H(r3, r6)     // Catch:{ all -> 0x0025 }
            java.lang.String r0 = "campaign_id"
            X.2sg r2 = X.AnonymousClass3H0.A03(r3, r4, r0, r1)     // Catch:{ all -> 0x0025 }
            java.lang.String r1 = "premium_message_info"
            java.lang.String r0 = "INSERT_PREMIUM_MESSAGE_CAMPAIGN_ID"
            r2.A09(r1, r0, r3)     // Catch:{ all -> 0x0025 }
            r4.close()
            return
        L_0x0025:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0027 }
        L_0x0027:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)
            throw r0
        L_0x002c:
            java.lang.String r0 = "PremiumMessageInfoStore/insertInfo/campaignId is null"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2W2.A00(X.34x):void");
    }
}
