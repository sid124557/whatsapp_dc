package X;

/* renamed from: X.2g2  reason: invalid class name and case insensitive filesystem */
public final class C49132g2 {
    public final C56922sm A00;
    public final C623334p A01;
    public final C72303dV A02;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0056, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        X.AnonymousClass2A8.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005e, code lost:
        X.AnonymousClass2A8.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0061, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C30381mM r11) {
        /*
            r10 = this;
            r0 = 0
            X.C162457s7.A0J(r11, r0)
            r9 = 1
            java.lang.String[] r3 = new java.lang.String[r9]
            X.C624134x.A0Y(r11, r3, r0)
            X.3dV r0 = r10.A02
            X.4GK r7 = r0.get()
            r0 = r7
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x005b }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x005b }
            java.lang.String r1 = "SELECT newsletter_jid_row_id, newsletter_name, expiration FROM message_newsletter_admin_invite WHERE message_row_id = ? "
            java.lang.String r0 = "GET_NEWSLETTER_ADMIN_INVITE_MESSAGE_BY_ROW_ID_SQL"
            android.database.Cursor r8 = r2.A0E(r1, r0, r3)     // Catch:{ all -> 0x005b }
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x0054 }
            if (r0 == 0) goto L_0x004d
            java.lang.String r0 = "expiration"
            long r3 = X.AnonymousClass0x2.A0C(r8, r0)     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = "newsletter_jid_row_id"
            long r1 = X.AnonymousClass0x2.A0C(r8, r0)     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = "newsletter_name"
            java.lang.String r6 = X.AnonymousClass0x2.A0Z(r8, r0)     // Catch:{ all -> 0x0054 }
            X.34p r5 = r10.A01     // Catch:{ all -> 0x0054 }
            java.lang.Class<X.4uY> r0 = X.C95804uY.class
            com.whatsapp.jid.Jid r0 = r5.A0B(r0, r1)     // Catch:{ all -> 0x0054 }
            X.4uY r0 = (X.C95804uY) r0     // Catch:{ all -> 0x0054 }
            if (r0 != 0) goto L_0x0044
            r9 = 0
        L_0x0044:
            X.C626936e.A0C(r9)     // Catch:{ all -> 0x0054 }
            r11.A01 = r0     // Catch:{ all -> 0x0054 }
            r11.A03 = r6     // Catch:{ all -> 0x0054 }
            r11.A00 = r3     // Catch:{ all -> 0x0054 }
        L_0x004d:
            r8.close()     // Catch:{ all -> 0x005b }
            r7.close()
            return
        L_0x0054:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r8, r1)     // Catch:{ all -> 0x005b }
            throw r0     // Catch:{ all -> 0x005b }
        L_0x005b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005d }
        L_0x005d:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r7, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49132g2.A00(X.1mM):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004e, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0051, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C30381mM r7) {
        /*
            r6 = this;
            r0 = 0
            X.C162457s7.A0J(r7, r0)
            X.3dV r0 = r6.A02
            X.4Fq r4 = r0.A04()
            long r2 = r7.A1L     // Catch:{ all -> 0x004b }
            android.content.ContentValues r5 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x004b }
            java.lang.String r1 = "message_row_id"
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x004b }
            r5.put(r1, r0)     // Catch:{ all -> 0x004b }
            X.4uY r1 = r7.A01     // Catch:{ all -> 0x004b }
            if (r1 == 0) goto L_0x002a
            X.34p r0 = r6.A01     // Catch:{ all -> 0x004b }
            java.lang.Long r1 = X.C623334p.A03(r0, r1)     // Catch:{ all -> 0x004b }
            java.lang.String r0 = "newsletter_jid_row_id"
            r5.put(r0, r1)     // Catch:{ all -> 0x004b }
        L_0x002a:
            java.lang.String r1 = "newsletter_name"
            java.lang.String r0 = r7.A03     // Catch:{ all -> 0x004b }
            r5.put(r1, r0)     // Catch:{ all -> 0x004b }
            long r0 = r7.A00     // Catch:{ all -> 0x004b }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x004b }
            java.lang.String r0 = "expiration"
            X.2sg r3 = X.AnonymousClass3H0.A00(r5, r1, r4, r0)     // Catch:{ all -> 0x004b }
            java.lang.String r2 = "message_newsletter_admin_invite"
            r1 = 5
            java.lang.String r0 = "INSERT_NEWSLETTER_ADMIN_INVITE_MESSAGE_SQL"
            r3.A0C(r2, r0, r5, r1)     // Catch:{ all -> 0x004b }
            r4.close()
            return
        L_0x004b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004d }
        L_0x004d:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49132g2.A01(X.1mM):void");
    }

    public C49132g2(C56922sm r1, C623334p r2, C72303dV r3) {
        C18260x0.A0V(r2, r1, r3);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
