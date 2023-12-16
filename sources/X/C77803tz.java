package X;

/* renamed from: X.3tz  reason: invalid class name and case insensitive filesystem */
public final class C77803tz extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C48612fB this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77803tz(C48612fB r2) {
        super(0);
        this.this$0 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004c, code lost:
        if (r5.length() == 0) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ab, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        X.AnonymousClass2A8.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00af, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b3, code lost:
        X.AnonymousClass2A8.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b6, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r13 = this;
            java.lang.String r0 = "[WAFFLE] StatusCrosspostingUnsentSessionManager/initializing unsentCrosspostStatusSessionCache lazy"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2fB r0 = r13.this$0
            X.2py r0 = r0.A00
            java.util.LinkedHashMap r9 = X.C18320x8.A0r()
            X.3dV r0 = r0.A00
            X.4GK r7 = r0.get()
            r0 = r7
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00b0 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x00b0 }
            java.lang.String r1 = "SELECT status_message_row_id,crossposting_session_id, destination FROM status_crossposting_v3 WHERE state IN (1, 7)"
            java.lang.String r0 = "[WAFFLE] WaffleStatusCrosspostingStore/SELECT_UNSENT_CROSSPOST_UNSENT_SESSIONS"
            android.database.Cursor r8 = X.C56862sg.A01(r2, r1, r0)     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "status_message_row_id"
            int r12 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = "crossposting_session_id"
            int r11 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = "destination"
            int r10 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00a9 }
        L_0x0033:
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x0094
            long r0 = r8.getLong(r12)     // Catch:{ all -> 0x00a9 }
            java.lang.String r5 = r8.getString(r11)     // Catch:{ all -> 0x00a9 }
            int r6 = r8.getInt(r10)     // Catch:{ all -> 0x00a9 }
            if (r5 == 0) goto L_0x004e
            int r3 = r5.length()     // Catch:{ all -> 0x00a9 }
            r2 = 0
            if (r3 != 0) goto L_0x004f
        L_0x004e:
            r2 = 1
        L_0x004f:
            if (r2 == 0) goto L_0x0058
            java.lang.String r1 = "[WAFFLE] WaffleStatusCrosspostingStore//found empty session id during offline retry"
            r0 = 0
            X.C626936e.A0D(r0, r1)     // Catch:{ all -> 0x00a9 }
            goto L_0x0033
        L_0x0058:
            X.C162457s7.A0H(r5)     // Catch:{ all -> 0x00a9 }
            java.lang.Object r4 = r9.get(r5)     // Catch:{ all -> 0x00a9 }
            if (r4 != 0) goto L_0x0071
            java.util.LinkedHashSet r3 = X.AnonymousClass0x9.A17()     // Catch:{ all -> 0x00a9 }
            java.util.HashSet r2 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x00a9 }
            X.2k8 r4 = new X.2k8     // Catch:{ all -> 0x00a9 }
            r4.<init>(r3, r2)     // Catch:{ all -> 0x00a9 }
            r9.put(r5, r4)     // Catch:{ all -> 0x00a9 }
        L_0x0071:
            X.2k8 r4 = (X.C51632k8) r4     // Catch:{ all -> 0x00a9 }
            java.util.LinkedHashSet r2 = r4.A00     // Catch:{ all -> 0x00a9 }
            X.AnonymousClass0x2.A1Q(r2, r0)     // Catch:{ all -> 0x00a9 }
            java.util.Set r5 = r4.A01     // Catch:{ all -> 0x00a9 }
            X.223[] r4 = X.AnonymousClass223.values()     // Catch:{ all -> 0x00a9 }
            int r3 = r4.length     // Catch:{ all -> 0x00a9 }
            r2 = 0
        L_0x0080:
            if (r2 >= r3) goto L_0x008f
            r1 = r4[r2]     // Catch:{ all -> 0x00a9 }
            int r0 = r1.databaseValue     // Catch:{ all -> 0x00a9 }
            if (r0 != r6) goto L_0x008c
            r5.add(r1)     // Catch:{ all -> 0x00a9 }
            goto L_0x0033
        L_0x008c:
            int r2 = r2 + 1
            goto L_0x0080
        L_0x008f:
            java.util.NoSuchElementException r0 = X.C18320x8.A0t()     // Catch:{ all -> 0x00a9 }
            throw r0     // Catch:{ all -> 0x00a9 }
        L_0x0094:
            r8.close()     // Catch:{ all -> 0x00b0 }
            r7.close()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "[WAFFLE] StatusCrosspostingUnsentSessionManager/initializing result: "
            X.C18260x0.A1R(r1, r0, r9)
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>(r9)
            return r0
        L_0x00a9:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r8, r1)     // Catch:{ all -> 0x00b0 }
            throw r0     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r7, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77803tz.invoke():java.lang.Object");
    }
}
