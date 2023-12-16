package X;

/* renamed from: X.2Y2  reason: invalid class name */
public final class AnonymousClass2Y2 {
    public final C56922sm A00;
    public final C72303dV A01;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass31A r7) {
        /*
            r6 = this;
            X.2kh r2 = r7.A0a
            if (r2 == 0) goto L_0x0041
            android.content.ContentValues r5 = X.AnonymousClass0x9.A06()
            int r0 = r2.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "ephemeral_trigger"
            r5.put(r0, r1)
            java.lang.Boolean r1 = r2.A01
            if (r1 == 0) goto L_0x001c
            java.lang.String r0 = "ephemeral_initiated_by_me"
            r5.put(r0, r1)
        L_0x001c:
            X.2sm r1 = r6.A00
            X.4uZ r0 = r7.A0q
            X.C56922sm.A00(r5, r1, r0)
            X.3dV r0 = r6.A01
            X.4Fq r4 = r0.A04()
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0037 }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x0037 }
            java.lang.String r2 = "chat_ephemeral"
            r1 = 5
            java.lang.String r0 = "INSERT_OR_UPDATE_EPEHEMERAL_CHATS_SQL"
            r3.A0C(r2, r0, r5, r1)     // Catch:{ all -> 0x0037 }
            goto L_0x003e
        L_0x0037:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0039 }
        L_0x0039:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)
            throw r0
        L_0x003e:
            r4.close()
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Y2.A00(X.31A):void");
    }

    public AnonymousClass2Y2(C56922sm r1, C72303dV r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
