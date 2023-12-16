package X;

/* renamed from: X.3tx  reason: invalid class name and case insensitive filesystem */
public final class C77783tx extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C48582f8 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77783tx(C48582f8 r2) {
        super(0);
        this.this$0 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0042, code lost:
        if (r6.length() == 0) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a9, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ac, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        X.AnonymousClass2A8.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b0, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00cc, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00cf, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d0, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00d3, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r15 = this;
            java.lang.String r0 = "[XFAM] StatusCrosspostUnsentSessionManager/initializing unsentCrosspostStatusSessionCache lazily"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2f8 r0 = r15.this$0
            X.30J r0 = r0.A00
            java.util.LinkedHashMap r7 = X.C18320x8.A0r()
            X.3dV r10 = r0.A00
            X.4GK r4 = r10.get()
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00cd }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x00cd }
            java.lang.String r1 = "SELECT status_message_row_id, crossposting_session_id FROM status_crossposting WHERE state IN (1,7)"
            java.lang.String r0 = "XFamilyStatusCrosspostingStore/SELECT_UNSENT_CROSSPOST"
            android.database.Cursor r5 = X.C56862sg.A01(r2, r1, r0)     // Catch:{ all -> 0x00cd }
            java.lang.String r0 = "status_message_row_id"
            int r9 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00c6 }
            java.lang.String r0 = "crossposting_session_id"
            int r8 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00c6 }
        L_0x002d:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x00c6 }
            if (r0 == 0) goto L_0x00b1
            long r2 = r5.getLong(r9)     // Catch:{ all -> 0x00c6 }
            java.lang.String r6 = r5.getString(r8)     // Catch:{ all -> 0x00c6 }
            if (r6 == 0) goto L_0x0044
            int r1 = r6.length()     // Catch:{ all -> 0x00c6 }
            r0 = 0
            if (r1 != 0) goto L_0x0045
        L_0x0044:
            r0 = 1
        L_0x0045:
            if (r0 == 0) goto L_0x0092
            java.lang.StringBuilder r11 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00c6 }
            java.lang.String r0 = "XFamilyStatusCrosspostingStore//found empty session id during offline retry, record detail: "
            r11.append(r0)     // Catch:{ all -> 0x00c6 }
            X.4GK r6 = r10.get()     // Catch:{ all -> 0x00c6 }
            r0 = r6
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00aa }
            X.2sg r13 = r0.A03     // Catch:{ all -> 0x00aa }
            r14 = 1
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00aa }
            java.lang.String r0 = "SELECT * FROM status_crossposting WHERE status_message_row_id IN ("
            X.C18270x1.A1A(r0, r1, r14)     // Catch:{ all -> 0x00aa }
            java.lang.String r12 = X.AnonymousClass000.A0e(r1)     // Catch:{ all -> 0x00aa }
            java.lang.String[] r1 = new java.lang.String[r14]     // Catch:{ all -> 0x00aa }
            X.C18260x0.A1X(r1, r2)     // Catch:{ all -> 0x00aa }
            java.lang.String r0 = "XFamilyStatusCrosspostingStore/GET_CROSSPOSTING_DATA_BY_MESSAGE_ROW_IDS"
            android.database.Cursor r3 = r13.A0E(r12, r0, r1)     // Catch:{ all -> 0x00aa }
            r2 = 0
            r1 = r2
        L_0x0074:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x007f
            X.2mc r1 = X.AnonymousClass30J.A00(r3)     // Catch:{ all -> 0x00a3 }
            goto L_0x0074
        L_0x007f:
            r3.close()     // Catch:{ all -> 0x00aa }
            r6.close()     // Catch:{ all -> 0x00c6 }
            if (r1 == 0) goto L_0x008b
            java.lang.String r2 = r1.toString()     // Catch:{ all -> 0x00c6 }
        L_0x008b:
            r11.append(r2)     // Catch:{ all -> 0x00c6 }
            X.C18270x1.A0z(r11)     // Catch:{ all -> 0x00c6 }
            goto L_0x002d
        L_0x0092:
            X.C162457s7.A0H(r6)     // Catch:{ all -> 0x00c6 }
            java.lang.Object r1 = X.C18310x6.A0h(r6, r7)     // Catch:{ all -> 0x00c6 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x00c6 }
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x00c6 }
            r1.add(r0)     // Catch:{ all -> 0x00c6 }
            goto L_0x002d
        L_0x00a3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)     // Catch:{ all -> 0x00aa }
            throw r0     // Catch:{ all -> 0x00aa }
        L_0x00aa:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ac }
        L_0x00ac:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r6, r1)     // Catch:{ all -> 0x00c6 }
            throw r0     // Catch:{ all -> 0x00c6 }
        L_0x00b1:
            r5.close()     // Catch:{ all -> 0x00cd }
            r4.close()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "[XFAM] StatusCrosspostUnsentSessionManager/initializing result: "
            X.C18260x0.A1P(r1, r0, r7)
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>(r7)
            return r0
        L_0x00c6:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c8 }
        L_0x00c8:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)     // Catch:{ all -> 0x00cd }
            throw r0     // Catch:{ all -> 0x00cd }
        L_0x00cd:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00cf }
        L_0x00cf:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77783tx.invoke():java.lang.Object");
    }
}
