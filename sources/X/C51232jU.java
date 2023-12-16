package X;

/* renamed from: X.2jU  reason: invalid class name and case insensitive filesystem */
public final class C51232jU {
    public final C56722sS A00;
    public final C72303dV A01;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0041, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003e, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C51962kf r7, long r8) {
        /*
            r6 = this;
            r0 = 1
            X.C162457s7.A0J(r7, r0)
            X.3dV r0 = r6.A01
            X.4Fq r4 = r0.A04()
            android.content.ContentValues r5 = X.C18290x4.A0E()     // Catch:{ all -> 0x003b }
            X.C18270x1.A0a(r5, r8)     // Catch:{ all -> 0x003b }
            java.lang.String r1 = "target_id"
            java.lang.String r0 = r7.A01     // Catch:{ all -> 0x003b }
            r5.put(r1, r0)     // Catch:{ all -> 0x003b }
            java.lang.String r1 = "message_state"
            X.21Q r0 = r7.A00     // Catch:{ all -> 0x003b }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x003b }
            X.2sg r3 = X.AnonymousClass3H0.A01(r5, r4, r1, r0)     // Catch:{ all -> 0x003b }
            java.lang.String r2 = "bot_message_info"
            r1 = 5
            java.lang.String r0 = "INSERT_OR_UPDATE_BOT_MESSAGE_INFO"
            r3.A0C(r2, r0, r5, r1)     // Catch:{ all -> 0x003b }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x003b }
            java.lang.String r0 = "BotMessageInfoStore/insertOrUpdateBotMessageInfo jid="
            X.C18260x0.A10(r0, r1, r8)     // Catch:{ all -> 0x003b }
            r4.close()
            return
        L_0x003b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003d }
        L_0x003d:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51232jU.A01(X.2kf, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(long r7) {
        /*
            r6 = this;
            X.3dV r0 = r6.A01
            X.4Fq r5 = r0.A04()
            java.lang.String r4 = "message_row_id = ?"
            r0 = r5
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0026 }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x0026 }
            java.lang.String r2 = "bot_message_info"
            java.lang.String[] r1 = X.C18260x0.A1b(r7)     // Catch:{ all -> 0x0026 }
            java.lang.String r0 = "DELETE_BOT_MESSAGE_INFO"
            r3.A07(r2, r4, r0, r1)     // Catch:{ all -> 0x0026 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0026 }
            java.lang.String r0 = "BotMessageInfoStore/deleteBotMessageInfo jid="
            X.C18260x0.A10(r0, r1, r7)     // Catch:{ all -> 0x0026 }
            r5.close()
            return
        L_0x0026:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0028 }
        L_0x0028:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51232jU.A00(long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0058, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0060, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0063, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.C624134x r6) {
        /*
            r5 = this;
            X.2z0 r0 = r6.A1J
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0064
            com.whatsapp.jid.UserJid r0 = r6.A0o()
            boolean r0 = X.C155477ey.A00(r0)
            if (r0 == 0) goto L_0x0064
            long r0 = r6.A1L
            X.3dV r2 = r5.A01
            X.4GK r4 = r2.get()
            r2 = r4
            X.3H0 r2 = (X.AnonymousClass3H0) r2     // Catch:{ all -> 0x005d }
            X.2sg r3 = r2.A03     // Catch:{ all -> 0x005d }
            java.lang.String r2 = "SELECT target_id, message_state FROM bot_message_info WHERE message_row_id= ?"
            java.lang.String[] r1 = X.C18260x0.A1b(r0)     // Catch:{ all -> 0x005d }
            java.lang.String r0 = "GET_BOT_MESSAGE_INFO_BY_ROW_ID"
            android.database.Cursor r3 = r3.A0E(r2, r0, r1)     // Catch:{ all -> 0x005d }
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0056 }
            r1 = 0
            if (r0 == 0) goto L_0x004c
            java.lang.String r0 = "target_id"
            java.lang.String r2 = X.AnonymousClass0x2.A0Z(r3, r0)     // Catch:{ all -> 0x0056 }
            java.lang.String r0 = "message_state"
            int r1 = X.AnonymousClass0x2.A04(r3, r0)     // Catch:{ all -> 0x0056 }
            X.C162457s7.A0H(r2)     // Catch:{ all -> 0x0056 }
            X.21Q[] r0 = X.AnonymousClass21Q.values()     // Catch:{ all -> 0x0056 }
            r0 = r0[r1]     // Catch:{ all -> 0x0056 }
            X.2kf r1 = new X.2kf     // Catch:{ all -> 0x0056 }
            r1.<init>(r0, r2)     // Catch:{ all -> 0x0056 }
        L_0x004c:
            r3.close()     // Catch:{ all -> 0x005d }
            r4.close()
            r6.A1K(r1)
            return
        L_0x0056:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)     // Catch:{ all -> 0x005d }
            throw r0     // Catch:{ all -> 0x005d }
        L_0x005d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005f }
        L_0x005f:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)
            throw r0
        L_0x0064:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51232jU.A02(X.34x):void");
    }

    public C51232jU(C56722sS r1, C72303dV r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
