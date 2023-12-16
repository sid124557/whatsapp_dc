package X;

/* renamed from: X.3V2  reason: invalid class name */
public final class AnonymousClass3V2 implements AnonymousClass4BS, AnonymousClass4BT, AnonymousClass4G2 {
    public final C183538qC A00;
    public final C183538qC A01;

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a5, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a6, code lost:
        X.AnonymousClass2A8.A00(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a9, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c9, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00cc, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00cd, code lost:
        X.AnonymousClass2A8.A00(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d0, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void B3F(X.C624134x r12) {
        /*
            r11 = this;
            r7 = 0
            X.C162457s7.A0J(r12, r7)
            X.8qC r0 = r11.A00
            java.lang.Object r6 = r0.get()
            X.2Js r6 = (X.C41302Js) r6
            X.1m7 r12 = (X.C30231m7) r12
            X.C162457s7.A0J(r12, r7)
            X.3dV r0 = r6.A01
            X.4GK r5 = r0.get()
            r0 = r5
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00ca }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x00ca }
            java.lang.String r2 = "SELECT bcall_session_row_id FROM message_bcall_session WHERE message_row_id = ?"
            java.lang.String[] r1 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x00ca }
            X.C624134x.A0Y(r12, r1, r7)     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = "MessageBCallSessionStore/getSessionRowId"
            android.database.Cursor r2 = r3.A0E(r2, r0, r1)     // Catch:{ all -> 0x00ca }
            boolean r0 = r2.moveToLast()     // Catch:{ all -> 0x00c3 }
            if (r0 == 0) goto L_0x00bc
            java.lang.String r0 = "bcall_session_row_id"
            int r1 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00c3 }
            boolean r0 = r2.isNull(r1)     // Catch:{ all -> 0x00c3 }
            if (r0 != 0) goto L_0x00b7
            long r3 = r2.getLong(r1)     // Catch:{ all -> 0x00c3 }
            r2.close()     // Catch:{ all -> 0x00ca }
            r5.close()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b6
            X.2F9 r0 = r6.A00
            X.3dV r0 = r0.A00
            X.4GK r2 = r0.get()
            r0 = r2
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00a3 }
            X.2sg r6 = r0.A03     // Catch:{ all -> 0x00a3 }
            java.lang.String r5 = "SELECT * FROM bcall_session WHERE _id = ?"
            java.lang.String[] r1 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x00a3 }
            X.AnonymousClass0x2.A1S(r1, r7, r3)     // Catch:{ all -> 0x00a3 }
            java.lang.String r0 = "BCallSessionStore/getSessionByRowId"
            android.database.Cursor r3 = r6.A0E(r5, r0, r1)     // Catch:{ all -> 0x00a3 }
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x009c }
            r4 = 0
            if (r0 == 0) goto L_0x0098
            java.lang.String r0 = "session_id"
            java.lang.String r5 = X.AnonymousClass0x2.A0Z(r3, r0)     // Catch:{ all -> 0x009c }
            X.C162457s7.A0D(r5)     // Catch:{ all -> 0x009c }
            java.lang.String r0 = "media_type"
            int r8 = X.AnonymousClass0x2.A04(r3, r0)     // Catch:{ all -> 0x009c }
            java.lang.String r0 = "master_key"
            byte[] r7 = X.C18280x3.A1Z(r3, r0)     // Catch:{ all -> 0x009c }
            X.C162457s7.A0D(r7)     // Catch:{ all -> 0x009c }
            java.lang.String r0 = "caption"
            java.lang.String r6 = X.AnonymousClass0x2.A0Z(r3, r0)     // Catch:{ all -> 0x009c }
            long r9 = X.C18270x1.A01(r3)     // Catch:{ all -> 0x009c }
            X.2h1 r4 = new X.2h1     // Catch:{ all -> 0x009c }
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x009c }
        L_0x0098:
            r3.close()     // Catch:{ all -> 0x00a3 }
            goto L_0x00aa
        L_0x009c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x009e }
        L_0x009e:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)     // Catch:{ all -> 0x00a3 }
            throw r0     // Catch:{ all -> 0x00a3 }
        L_0x00a3:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r1 = move-exception
            X.AnonymousClass2A8.A00(r2, r0)
            throw r1
        L_0x00aa:
            r2.close()
            if (r4 != 0) goto L_0x00b4
            java.lang.String r0 = "MessageBCallSessionStore/fillMessage cannot load session"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00b4:
            r12.A00 = r4
        L_0x00b6:
            return
        L_0x00b7:
            java.lang.String r0 = "MessageBCallSessionStore/getSessionRowId bcall_session_row_id is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00c3 }
        L_0x00bc:
            r2.close()     // Catch:{ all -> 0x00ca }
            r5.close()
            return
        L_0x00c3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ all -> 0x00ca }
            throw r0     // Catch:{ all -> 0x00ca }
        L_0x00ca:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00cc }
        L_0x00cc:
            r1 = move-exception
            X.AnonymousClass2A8.A00(r5, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3V2.B3F(X.34x):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x011d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x011e, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0121, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BGd(X.C624134x r19) {
        /*
            r18 = this;
            r5 = r19
            r0 = 0
            X.C162457s7.A0J(r5, r0)
            boolean r0 = r5 instanceof X.C30231m7
            if (r0 == 0) goto L_0x0122
            X.1m7 r5 = (X.C30231m7) r5
            X.2h1 r7 = r5.A00
            if (r7 != 0) goto L_0x0016
            java.lang.String r0 = "FMessageBCallDatabase/insert no session"
        L_0x0012:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0016:
            long r1 = r7.A01
            r9 = 0
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            r6 = r18
            if (r0 > 0) goto L_0x00b1
            X.8qC r0 = r6.A01
            java.lang.Object r0 = r0.get()
            X.2F9 r0 = (X.AnonymousClass2F9) r0
            r8 = 0
            X.3dV r0 = r0.A00
            X.4Fq r4 = r0.A04()
            android.content.ContentValues r12 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x011b }
            java.lang.String r1 = r7.A03     // Catch:{ all -> 0x011b }
            java.lang.String r0 = "session_id"
            r12.put(r0, r1)     // Catch:{ all -> 0x011b }
            int r0 = r7.A00     // Catch:{ all -> 0x011b }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x011b }
            java.lang.String r0 = "media_type"
            r12.put(r0, r1)     // Catch:{ all -> 0x011b }
            java.lang.String r1 = "master_key"
            byte[] r0 = r7.A04     // Catch:{ all -> 0x011b }
            r12.put(r1, r0)     // Catch:{ all -> 0x011b }
            java.lang.String r1 = "caption"
            java.lang.String r0 = r7.A02     // Catch:{ all -> 0x011b }
            r12.put(r1, r0)     // Catch:{ all -> 0x011b }
            long r0 = r7.A01     // Catch:{ all -> 0x011b }
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x0087
            r2 = r4
            X.3H0 r2 = (X.AnonymousClass3H0) r2     // Catch:{ all -> 0x011b }
            X.2sg r11 = r2.A03     // Catch:{ all -> 0x011b }
            java.lang.String r13 = "bcall_session"
            java.lang.String r14 = "_id = ?"
            r3 = 1
            java.lang.String[] r2 = new java.lang.String[r3]     // Catch:{ all -> 0x011b }
            X.AnonymousClass0x2.A1S(r2, r8, r0)     // Catch:{ all -> 0x011b }
            java.lang.String r15 = "BCallSessionStore/updateSession"
            r17 = 4
            r16 = r2
            int r2 = r11.A06(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x011b }
            if (r2 == r3) goto L_0x00ae
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x011b }
            java.lang.String r0 = "BCallSessionStore/updateSession affects "
            r1.append(r0)     // Catch:{ all -> 0x011b }
            r1.append(r2)     // Catch:{ all -> 0x011b }
            java.lang.String r0 = " rows, supposed to be only one row"
            X.C18260x0.A1K(r1, r0)     // Catch:{ all -> 0x011b }
            goto L_0x00ae
        L_0x0087:
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x011b }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x011b }
            java.lang.String r2 = "bcall_session"
            r1 = 5
            java.lang.String r0 = "BCallSessionStore/insertSession"
            long r2 = r3.A0C(r2, r0, r12, r1)     // Catch:{ all -> 0x011b }
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a5
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x011b }
            java.lang.String r0 = "BCallSessionStore/insertSession succeeded, return="
            X.C18260x0.A10(r0, r1, r2)     // Catch:{ all -> 0x011b }
            r7.A01 = r2     // Catch:{ all -> 0x011b }
            goto L_0x00ae
        L_0x00a5:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x011b }
            java.lang.String r0 = "BCallSessionStore/insertSession failed, return="
            X.C18260x0.A11(r0, r1, r2)     // Catch:{ all -> 0x011b }
        L_0x00ae:
            r4.close()
        L_0x00b1:
            X.8qC r0 = r6.A00
            java.lang.Object r6 = r0.get()
            X.2Js r6 = (X.C41302Js) r6
            r4 = 0
            long r1 = r5.A1L
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x00ce
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessageBCallSessionStore/insertSession bad message rowId="
            java.lang.String r0 = X.C624134x.A0C(r5, r0, r1)
        L_0x00ca:
            X.C626936e.A0D(r4, r0)
            return
        L_0x00ce:
            X.2h1 r1 = r5.A00
            if (r1 != 0) goto L_0x00d6
            java.lang.String r0 = "MessageBCallSessionStore/insertSession session is null"
            goto L_0x0012
        L_0x00d6:
            long r2 = r1.A01
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x00e7
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessageBCallSessionStore/insertSession bad session rowId="
            java.lang.String r0 = X.AnonymousClass000.A0Z(r0, r1, r2)
            goto L_0x00ca
        L_0x00e7:
            X.3dV r0 = r6.A01
            X.4Fq r4 = r0.A04()
            android.content.ContentValues r6 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x011b }
            X.C624134x.A0H(r6, r5)     // Catch:{ all -> 0x011b }
            java.lang.String r2 = "bcall_session_row_id"
            long r0 = r1.A01     // Catch:{ all -> 0x011b }
            X.2sg r3 = X.AnonymousClass3H0.A02(r6, r4, r2, r0)     // Catch:{ all -> 0x011b }
            java.lang.String r2 = "message_bcall_session"
            r1 = 4
            java.lang.String r0 = "MessageBCallSessionStore/insertSession"
            long r2 = r3.A0C(r2, r0, r6, r1)     // Catch:{ all -> 0x011b }
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0117
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x011b }
            java.lang.String r0 = "MessageBCallSessionStore/insertSession/insert error, message_row_id="
            X.C624134x.A0P(r5, r0, r1)     // Catch:{ all -> 0x011b }
            java.lang.String r0 = ", return="
            X.C18260x0.A11(r0, r1, r2)     // Catch:{ all -> 0x011b }
        L_0x0117:
            r4.close()
            return
        L_0x011b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x011d }
        L_0x011d:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)
            throw r0
        L_0x0122:
            java.lang.String r0 = "FMessageBCallDatabase/insert only FMessageBCall is supporetd"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3V2.BGd(X.34x):void");
    }

    public AnonymousClass3V2(C183538qC r1, C183538qC r2) {
        C18260x0.A0Q(r1, r2);
        this.A01 = r1;
        this.A00 = r2;
    }
}
