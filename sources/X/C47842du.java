package X;

/* renamed from: X.2du  reason: invalid class name and case insensitive filesystem */
public final class C47842du {
    public final C72303dV A00;

    public C47842du(C72303dV r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a1, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a5, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a8, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C624134x r13) {
        /*
            r12 = this;
            r6 = 0
            boolean r0 = r13 instanceof X.C30251m9
            if (r0 == 0) goto L_0x00a9
            X.3dV r0 = r12.A00
            X.4GK r2 = r0.get()
            r0 = r2
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00a2 }
            X.2sg r5 = r0.A03     // Catch:{ all -> 0x00a2 }
            java.lang.String r3 = "SELECT bot_feedback_kind, bot_feedback_text, bot_feedback_key_remote_jid, bot_feedback_key_from_me, bot_feedback_key_id, bot_feedback_kind_negative, bot_feedback_kind_positive FROM message_bot_feedback WHERE message_row_id = ?"
            r4 = 1
            java.lang.String[] r1 = new java.lang.String[r4]     // Catch:{ all -> 0x00a2 }
            X.1m9 r13 = (X.C30251m9) r13     // Catch:{ all -> 0x00a2 }
            X.C624134x.A0Y(r13, r1, r6)     // Catch:{ all -> 0x00a2 }
            java.lang.String r0 = "GET_MESSAGE_BOT_FEEDBACK"
            android.database.Cursor r3 = r5.A0E(r3, r0, r1)     // Catch:{ all -> 0x00a2 }
            boolean r0 = r3.moveToLast()     // Catch:{ all -> 0x009b }
            r11 = 0
            if (r0 == 0) goto L_0x0094
            java.lang.String r0 = "bot_feedback_kind"
            int r10 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x009b }
            java.lang.String r0 = "bot_feedback_kind_positive"
            int r1 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x009b }
            java.lang.String r0 = "bot_feedback_kind_negative"
            int r9 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x009b }
            java.lang.String r0 = "bot_feedback_text"
            int r8 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x009b }
            java.lang.String r0 = "bot_feedback_key_remote_jid"
            int r7 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x009b }
            java.lang.String r0 = "bot_feedback_key_from_me"
            int r6 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x009b }
            java.lang.String r0 = "bot_feedback_key_id"
            int r5 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x009b }
            int r0 = r3.getInt(r10)     // Catch:{ all -> 0x009b }
            X.23M r0 = X.AnonymousClass23M.A00(r0)     // Catch:{ all -> 0x009b }
            X.C162457s7.A0D(r0)     // Catch:{ all -> 0x009b }
            r13.A02 = r0     // Catch:{ all -> 0x009b }
            int r0 = r3.getInt(r1)     // Catch:{ all -> 0x009b }
            long r0 = (long) r0     // Catch:{ all -> 0x009b }
            r13.A01 = r0     // Catch:{ all -> 0x009b }
            int r0 = r3.getInt(r9)     // Catch:{ all -> 0x009b }
            long r0 = (long) r0     // Catch:{ all -> 0x009b }
            r13.A00 = r0     // Catch:{ all -> 0x009b }
            java.lang.String r1 = r3.getString(r8)     // Catch:{ all -> 0x009b }
            if (r1 == 0) goto L_0x0078
            int r0 = r1.length()     // Catch:{ all -> 0x009b }
            if (r0 != 0) goto L_0x0079
        L_0x0078:
            r1 = r11
        L_0x0079:
            r13.A04 = r1     // Catch:{ all -> 0x009b }
            java.lang.String r0 = r3.getString(r7)     // Catch:{ all -> 0x009b }
            X.4uZ r1 = X.C106405Yw.A04(r0)     // Catch:{ all -> 0x009b }
            int r0 = r3.getInt(r6)     // Catch:{ all -> 0x009b }
            if (r0 == r4) goto L_0x008a
            r4 = 0
        L_0x008a:
            java.lang.String r0 = r3.getString(r5)     // Catch:{ all -> 0x009b }
            X.2z0 r0 = X.AnonymousClass2z0.A05(r1, r0, r4)     // Catch:{ all -> 0x009b }
            r13.A03 = r0     // Catch:{ all -> 0x009b }
        L_0x0094:
            r3.close()     // Catch:{ all -> 0x00a2 }
            r2.close()
            return
        L_0x009b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x009d }
        L_0x009d:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)     // Catch:{ all -> 0x00a2 }
            throw r0     // Catch:{ all -> 0x00a2 }
        L_0x00a2:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)
            throw r0
        L_0x00a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47842du.A00(X.34x):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007f, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0082, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C624134x r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C30251m9
            if (r0 == 0) goto L_0x008c
            X.1m9 r7 = (X.C30251m9) r7
            X.2z0 r2 = r7.A03
            if (r2 == 0) goto L_0x0083
            X.4uZ r0 = r2.A00
            if (r0 == 0) goto L_0x0083
            X.3dV r0 = r6.A00
            X.4Fq r5 = r0.A04()
            r0 = 8
            android.content.ContentValues r4 = X.AnonymousClass0x9.A07(r0)     // Catch:{ all -> 0x007c }
            X.C624134x.A0H(r4, r7)     // Catch:{ all -> 0x007c }
            java.lang.String r1 = "bot_feedback_kind"
            X.23M r0 = r7.A02     // Catch:{ all -> 0x007c }
            int r0 = r0.value     // Catch:{ all -> 0x007c }
            X.C18270x1.A0b(r4, r1, r0)     // Catch:{ all -> 0x007c }
            java.lang.String r3 = "bot_feedback_kind_positive"
            long r0 = r7.A01     // Catch:{ all -> 0x007c }
            X.C18270x1.A0c(r4, r3, r0)     // Catch:{ all -> 0x007c }
            java.lang.String r3 = "bot_feedback_kind_negative"
            long r0 = r7.A00     // Catch:{ all -> 0x007c }
            X.C18270x1.A0c(r4, r3, r0)     // Catch:{ all -> 0x007c }
            java.lang.String r1 = "bot_feedback_text"
            java.lang.String r0 = r7.A04     // Catch:{ all -> 0x007c }
            if (r0 != 0) goto L_0x003c
            java.lang.String r0 = ""
        L_0x003c:
            r4.put(r1, r0)     // Catch:{ all -> 0x007c }
            java.lang.String r1 = "bot_feedback_key_remote_jid"
            X.4uZ r0 = r2.A00     // Catch:{ all -> 0x007c }
            X.C162457s7.A0H(r0)     // Catch:{ all -> 0x007c }
            X.AnonymousClass0x2.A0n(r4, r0, r1)     // Catch:{ all -> 0x007c }
            java.lang.String r1 = "bot_feedback_key_from_me"
            boolean r0 = r2.A02     // Catch:{ all -> 0x007c }
            boolean r0 = X.AnonymousClass000.A1S(r0)
            X.C18270x1.A0b(r4, r1, r0)     // Catch:{ all -> 0x007c }
            java.lang.String r1 = "bot_feedback_key_id"
            java.lang.String r0 = r2.A01     // Catch:{ all -> 0x007c }
            X.2sg r3 = X.AnonymousClass3H0.A03(r4, r5, r1, r0)     // Catch:{ all -> 0x007c }
            java.lang.String r2 = "message_bot_feedback"
            r1 = 5
            java.lang.String r0 = "BotFeedbackMessageStoreImpl/insertOrUpdateBotFeedbackMessage"
            long r3 = r3.A0C(r2, r0, r4, r1)     // Catch:{ all -> 0x007c }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0078
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x007c }
            java.lang.String r0 = "BotFeedbackMessageStoreImpl/insertOrUpdateBotFeedbackMessage/insert error, rowId="
            java.lang.String r0 = X.C624134x.A0C(r7, r0, r1)     // Catch:{ all -> 0x007c }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x007c }
        L_0x0078:
            r5.close()
            return
        L_0x007c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x007e }
        L_0x007e:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)
            throw r0
        L_0x0083:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "BotFeedbackMessageStoreImpl/insertOrUpdateBotFeedbackMessage feedbackMsgKey is "
            X.C18260x0.A1Q(r1, r0, r2)
        L_0x008c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47842du.A01(X.34x):void");
    }
}
