package X;

/* renamed from: X.2h9  reason: invalid class name and case insensitive filesystem */
public final class C49822h9 {
    public final C56922sm A00;
    public final C623334p A01;
    public final C72303dV A02;
    public final AnonymousClass1VX A03;
    public final C66383Le A04;

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b8, code lost:
        X.AnonymousClass2A8.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bb, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A00(X.C53912ns r8) {
        /*
            r7 = this;
            X.3dV r0 = r7.A02
            X.4Fq r6 = r0.A04()
            r0 = 12
            android.content.ContentValues r4 = X.AnonymousClass0x9.A07(r0)     // Catch:{ all -> 0x00b5 }
            X.2z0 r3 = r8.A04     // Catch:{ all -> 0x00b5 }
            X.4uZ r1 = r3.A00     // Catch:{ all -> 0x00b5 }
            if (r1 == 0) goto L_0x001d
            X.2sm r0 = r7.A00     // Catch:{ all -> 0x00b5 }
            long r0 = r0.A07(r1)     // Catch:{ all -> 0x00b5 }
            java.lang.String r2 = "chat_row_id"
            X.C18270x1.A0c(r4, r2, r0)     // Catch:{ all -> 0x00b5 }
        L_0x001d:
            java.lang.String r1 = "from_me"
            boolean r0 = r3.A02     // Catch:{ all -> 0x00b5 }
            X.AnonymousClass0x2.A0o(r4, r1, r0)     // Catch:{ all -> 0x00b5 }
            java.lang.String r1 = "key_id"
            java.lang.String r0 = r3.A01     // Catch:{ all -> 0x00b5 }
            r4.put(r1, r0)     // Catch:{ all -> 0x00b5 }
            com.whatsapp.jid.Jid r1 = r8.A03     // Catch:{ all -> 0x00b5 }
            if (r1 == 0) goto L_0x003b
            X.34p r0 = r7.A01     // Catch:{ all -> 0x00b5 }
            long r0 = r0.A05(r1)     // Catch:{ all -> 0x00b5 }
            java.lang.String r2 = "sender_jid_row_id"
            X.C18270x1.A0c(r4, r2, r0)     // Catch:{ all -> 0x00b5 }
        L_0x003b:
            X.2z0 r2 = r8.A05     // Catch:{ all -> 0x00b5 }
            if (r2 == 0) goto L_0x005f
            java.lang.String r1 = "parent_key_id"
            java.lang.String r0 = r2.A01     // Catch:{ all -> 0x00b5 }
            r4.put(r1, r0)     // Catch:{ all -> 0x00b5 }
            java.lang.String r1 = "parent_from_me"
            boolean r0 = r2.A02     // Catch:{ all -> 0x00b5 }
            X.AnonymousClass0x2.A0o(r4, r1, r0)     // Catch:{ all -> 0x00b5 }
            X.4uZ r1 = r2.A00     // Catch:{ all -> 0x00b5 }
            if (r1 == 0) goto L_0x005f
            X.2sm r0 = r7.A00     // Catch:{ all -> 0x00b5 }
            long r0 = r0.A07(r1)     // Catch:{ all -> 0x00b5 }
            java.lang.String r2 = "parent_chat_row_id"
            X.C18270x1.A0c(r4, r2, r0)     // Catch:{ all -> 0x00b5 }
        L_0x005f:
            com.whatsapp.jid.Jid r1 = r8.A02     // Catch:{ all -> 0x00b5 }
            if (r1 == 0) goto L_0x006f
            X.34p r0 = r7.A01     // Catch:{ all -> 0x00b5 }
            long r0 = r0.A05(r1)     // Catch:{ all -> 0x00b5 }
            java.lang.String r2 = "parent_sender_jid_row_id"
            X.C18270x1.A0c(r4, r2, r0)     // Catch:{ all -> 0x00b5 }
        L_0x006f:
            java.lang.String r2 = "timestamp"
            long r0 = r8.A01     // Catch:{ all -> 0x00b5 }
            X.C18270x1.A0c(r4, r2, r0)     // Catch:{ all -> 0x00b5 }
            byte[] r1 = r8.A07     // Catch:{ all -> 0x00b5 }
            if (r1 == 0) goto L_0x00aa
            java.lang.String r0 = "orphan_message_data"
            r4.put(r0, r1)     // Catch:{ all -> 0x00b5 }
        L_0x0081:
            java.lang.String r1 = "orphan_message_type"
            int r0 = r8.A00     // Catch:{ all -> 0x00b5 }
            X.C18270x1.A0b(r4, r1, r0)     // Catch:{ all -> 0x00b5 }
            byte[] r1 = r8.A08     // Catch:{ all -> 0x00b5 }
            if (r1 == 0) goto L_0x0093
            java.lang.String r0 = "orphan_message_stanza_data"
            r4.put(r0, r1)     // Catch:{ all -> 0x00b5 }
        L_0x0093:
            r0 = r6
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00b5 }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x00b5 }
            java.lang.String r2 = "message_orphan"
            r1 = 5
            java.lang.String r0 = "MessageOrphanStore/insertMessageOrphan"
            long r4 = r3.A0C(r2, r0, r4, r1)     // Catch:{ all -> 0x00b5 }
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 6
            if (r1 <= 0) goto L_0x00b1
            goto L_0x00b0
        L_0x00aa:
            java.lang.String r0 = "MessageOrphanStore/insertMessageOrphan/orphanMessageData is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x00b5 }
            goto L_0x0081
        L_0x00b0:
            r0 = 4
        L_0x00b1:
            r6.close()
            return r0
        L_0x00b5:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b7 }
        L_0x00b7:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r6, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49822h9.A00(X.2ns):int");
    }

    public C49822h9(C56922sm r1, C623334p r2, C72303dV r3, AnonymousClass1VX r4, C66383Le r5) {
        C18260x0.A0f(r4, r2, r1, r3, r5);
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A04 = r5;
    }
}
