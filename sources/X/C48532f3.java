package X;

/* renamed from: X.2f3  reason: invalid class name and case insensitive filesystem */
public final class C48532f3 {
    public final C623334p A00;
    public final C72303dV A01;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0058, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        X.AnonymousClass2A8.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0060, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0063, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C624134x r8) {
        /*
            r7 = this;
            r4 = 0
            X.3dV r0 = r7.A01
            X.4GK r5 = r0.get()
            r0 = r5
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x005d }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x005d }
            java.lang.String r2 = "SELECT newsletter_jid_row_id,newsletter_server_message_id,newsletter_name FROM forwarded_newsletter_message_info WHERE message_row_id = ?"
            java.lang.String[] r1 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x005d }
            X.C624134x.A0Y(r8, r1, r4)     // Catch:{ all -> 0x005d }
            java.lang.String r0 = "GET_FORWARDED_NEWSLETTER_MESSAGE_INFO_FOR_ROW_ID_SQL"
            android.database.Cursor r6 = r3.A0E(r2, r0, r1)     // Catch:{ all -> 0x005d }
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x0056 }
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = "newsletter_jid_row_id"
            int r0 = X.AnonymousClass0x2.A04(r6, r0)     // Catch:{ all -> 0x0056 }
            long r1 = (long) r0     // Catch:{ all -> 0x0056 }
            X.34p r3 = r7.A00     // Catch:{ all -> 0x0056 }
            java.lang.Class<X.4uY> r0 = X.C95804uY.class
            com.whatsapp.jid.Jid r4 = r3.A0B(r0, r1)     // Catch:{ all -> 0x0056 }
            X.4uY r4 = (X.C95804uY) r4     // Catch:{ all -> 0x0056 }
            if (r4 == 0) goto L_0x004f
            java.lang.String r0 = "newsletter_server_message_id"
            int r3 = X.AnonymousClass0x2.A04(r6, r0)     // Catch:{ all -> 0x0056 }
            java.lang.String r0 = "newsletter_name"
            java.lang.String r2 = X.AnonymousClass0x2.A0Z(r6, r0)     // Catch:{ all -> 0x0056 }
            X.C162457s7.A0H(r2)     // Catch:{ all -> 0x0056 }
            r1 = 0
            X.2mS r0 = new X.2mS     // Catch:{ all -> 0x0056 }
            r0.<init>(r4, r1, r2, r3)     // Catch:{ all -> 0x0056 }
            r8.A1T(r0)     // Catch:{ all -> 0x0056 }
        L_0x004f:
            r6.close()     // Catch:{ all -> 0x005d }
            r5.close()
            return
        L_0x0056:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r6, r1)     // Catch:{ all -> 0x005d }
            throw r0     // Catch:{ all -> 0x005d }
        L_0x005d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005f }
        L_0x005f:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48532f3.A00(X.34x):void");
    }

    public C48532f3(C623334p r1, C72303dV r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0040, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0041, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C624134x r7) {
        /*
            r6 = this;
            X.2mS r3 = r7.A0z()
            if (r3 == 0) goto L_0x0045
            X.3dV r0 = r6.A01
            X.4Fq r4 = r0.A04()
            android.content.ContentValues r5 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x003e }
            X.C624134x.A0H(r5, r7)     // Catch:{ all -> 0x003e }
            java.lang.String r2 = "newsletter_jid_row_id"
            X.34p r1 = r6.A00     // Catch:{ all -> 0x003e }
            X.4uY r0 = r3.A01     // Catch:{ all -> 0x003e }
            long r0 = r1.A05(r0)     // Catch:{ all -> 0x003e }
            X.C18270x1.A0c(r5, r2, r0)     // Catch:{ all -> 0x003e }
            java.lang.String r1 = "newsletter_server_message_id"
            int r0 = r3.A00     // Catch:{ all -> 0x003e }
            X.C18270x1.A0b(r5, r1, r0)     // Catch:{ all -> 0x003e }
            java.lang.String r1 = "newsletter_name"
            java.lang.String r0 = r3.A03     // Catch:{ all -> 0x003e }
            X.2sg r3 = X.AnonymousClass3H0.A03(r5, r4, r1, r0)     // Catch:{ all -> 0x003e }
            java.lang.String r2 = "forwarded_newsletter_message_info"
            r1 = 5
            java.lang.String r0 = "INSERT_FORWARDED_NEWSLETTER_MESSAGE_INFO"
            r3.A0C(r2, r0, r5, r1)     // Catch:{ all -> 0x003e }
            r4.close()
            return
        L_0x003e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)
            throw r0
        L_0x0045:
            java.lang.String r0 = "ForwardedNewsletterMessageInfoStore/insertForwardedNewsletterMessageInfo/missing information in the FMessage"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48532f3.A01(X.34x):void");
    }
}
