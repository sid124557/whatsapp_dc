package X;

/* renamed from: X.2eE  reason: invalid class name and case insensitive filesystem */
public final class C48032eE {
    public final C72303dV A00;

    public C48032eE(C72303dV r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C51572k2 A00(long r7) {
        /*
            r6 = this;
            X.3dV r0 = r6.A00
            X.4GK r5 = r0.get()
            r0 = r5
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0047 }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x0047 }
            java.lang.String r2 = "SELECT message_template_id, message_hsm_tag FROM template_messages_metadata WHERE message_row_id = ?"
            java.lang.String[] r1 = X.C18260x0.A1b(r7)     // Catch:{ all -> 0x0047 }
            java.lang.String r0 = "GET_METADATA_BY_MESSAGE_ID"
            android.database.Cursor r4 = X.C56862sg.A02(r3, r2, r0, r1)     // Catch:{ all -> 0x0047 }
            r5.close()
            java.lang.String r0 = "message_template_id"
            int r1 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0040 }
            java.lang.String r0 = "message_hsm_tag"
            int r3 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0040 }
            boolean r0 = r4.moveToLast()     // Catch:{ all -> 0x0040 }
            r2 = 0
            if (r0 == 0) goto L_0x003c
            java.lang.String r1 = r4.getString(r1)     // Catch:{ all -> 0x0040 }
            java.lang.String r0 = r4.getString(r3)     // Catch:{ all -> 0x0040 }
            X.2k2 r2 = new X.2k2     // Catch:{ all -> 0x0040 }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x0040 }
        L_0x003c:
            r4.close()
            return r2
        L_0x0040:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)
            throw r0
        L_0x0047:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48032eE.A00(long):X.2k2");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C624134x r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            X.3dV r0 = r6.A00
            X.4Fq r5 = r0.A04()
            android.content.ContentValues r4 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x0028 }
            X.C624134x.A0H(r4, r7)     // Catch:{ all -> 0x0028 }
            java.lang.String r0 = "message_template_id"
            r4.put(r0, r8)     // Catch:{ all -> 0x0028 }
            java.lang.String r0 = "message_hsm_tag"
            X.2sg r3 = X.AnonymousClass3H0.A03(r4, r5, r0, r9)     // Catch:{ all -> 0x0028 }
            java.lang.String r2 = "template_messages_metadata"
            r1 = 5
            java.lang.String r0 = "storeMetadata/INSERT_TEMPLATE_MESSAGES_METADATA"
            r3.A0C(r2, r0, r4, r1)     // Catch:{ all -> 0x0028 }
            r5.close()
            return
        L_0x0028:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002a }
        L_0x002a:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48032eE.A01(X.34x, java.lang.String, java.lang.String):void");
    }
}
