package X;

import android.content.ContentValues;

/* renamed from: X.2f2  reason: invalid class name and case insensitive filesystem */
public class C48522f2 {
    public final C56922sm A00;
    public final C72303dV A01;

    public void A00(AnonymousClass31A r14) {
        ContentValues A06;
        synchronized (r14) {
            A06 = AnonymousClass0x9.A06();
            C18270x1.A0c(A06, "last_activity_ts", r14.A0K);
            C18270x1.A0c(A06, "last_activity_seen_ts", r14.A0J);
            C18270x1.A0c(A06, "join_ts", r14.A0I);
            AnonymousClass0x2.A0o(A06, "closed", r14.A0n);
        }
        C95814uZ r6 = r14.A0q;
        C72303dV r3 = this.A01;
        C85284Fq A04 = r3.A04();
        try {
            C56922sm r4 = this.A00;
            int A05 = ((AnonymousClass3H0) A04).A03.A05(A06, "community_chat", "chat_row_id = ?", "updateCommunityChatTable", C18260x0.A1b(r4.A07(r6)));
            A04.close();
            if (A05 == 0) {
                C18270x1.A0c(A06, "chat_row_id", r4.A07(r6));
                A04 = r3.A04();
                try {
                    long A08 = ((AnonymousClass3H0) A04).A03.A08("community_chat", "updateCommunityChatTable", A06);
                    A04.close();
                    r14.A0W = A08;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                    throw th;
                }
            }
        } finally {
            th = th;
            A04.close();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00aa, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ab, code lost:
        if (r7 != null) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b5, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(java.util.Map r19) {
        /*
            r18 = this;
            java.lang.String r0 = "CommunityChatStore/loadData"
            X.33M r17 = X.AnonymousClass33M.A01(r0)
            r8 = r18
            X.3dV r0 = r8.A01
            X.4GK r16 = r0.get()
            r0 = r16
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00b6 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x00b6 }
            java.lang.String r1 = "SELECT chat_row_id, last_activity_ts, last_activity_seen_ts, join_ts, closed FROM community_chat"
            java.lang.String r0 = "GET_COMMUNITY_CHATS_SQL"
            android.database.Cursor r7 = X.C56862sg.A01(r2, r1, r0)     // Catch:{ all -> 0x00b6 }
            java.lang.String r0 = "chat_row_id"
            int r6 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00aa }
            java.lang.String r0 = "last_activity_ts"
            int r5 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00aa }
            java.lang.String r0 = "last_activity_seen_ts"
            int r4 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00aa }
            java.lang.String r0 = "join_ts"
            int r3 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00aa }
            java.lang.String r0 = "closed"
            int r2 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00aa }
        L_0x003a:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x00aa }
            if (r0 == 0) goto L_0x00a0
            X.2sm r9 = r8.A00     // Catch:{ all -> 0x00aa }
            long r0 = r7.getLong(r6)     // Catch:{ all -> 0x00aa }
            X.4uZ r10 = r9.A0B(r0)     // Catch:{ all -> 0x00aa }
            if (r10 != 0) goto L_0x0060
            java.lang.StringBuilder r9 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00aa }
            java.lang.String r0 = "CommunityChatStore/failed to find chatJid by row id: "
            r9.append(r0)     // Catch:{ all -> 0x00aa }
            long r0 = r7.getLong(r6)     // Catch:{ all -> 0x00aa }
            r9.append(r0)     // Catch:{ all -> 0x00aa }
            X.AnonymousClass0x2.A19(r9)     // Catch:{ all -> 0x00aa }
            goto L_0x003a
        L_0x0060:
            r11 = r19
            java.lang.Object r12 = r11.get(r10)     // Catch:{ all -> 0x00aa }
            r9 = r12
            X.31A r9 = (X.AnonymousClass31A) r9     // Catch:{ all -> 0x00aa }
            if (r9 != 0) goto L_0x0075
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00aa }
            java.lang.String r0 = "CommunityChatStore/missing chat in map: "
            X.C18260x0.A1S(r1, r0, r10)     // Catch:{ all -> 0x00aa }
            goto L_0x003a
        L_0x0075:
            long r0 = r7.getLong(r5)     // Catch:{ all -> 0x00aa }
            monitor-enter(r12)     // Catch:{ all -> 0x00aa }
            r9.A0K = r0     // Catch:{ all -> 0x009d }
            monitor-exit(r12)     // Catch:{ all -> 0x00aa }
            long r0 = r7.getLong(r4)     // Catch:{ all -> 0x00aa }
            monitor-enter(r12)     // Catch:{ all -> 0x00aa }
            r9.A0J = r0     // Catch:{ all -> 0x009d }
            monitor-exit(r12)     // Catch:{ all -> 0x00aa }
            long r0 = r7.getLong(r3)     // Catch:{ all -> 0x00aa }
            r9.A0I = r0     // Catch:{ all -> 0x00aa }
            long r14 = r7.getLong(r2)     // Catch:{ all -> 0x00aa }
            r12 = 1
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1T(r0)
            r9.A0n = r0     // Catch:{ all -> 0x00aa }
            r11.put(r10, r9)     // Catch:{ all -> 0x00aa }
            goto L_0x003a
        L_0x009d:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x00aa }
            throw r0     // Catch:{ all -> 0x00aa }
        L_0x00a0:
            r17.A07()     // Catch:{ all -> 0x00aa }
            r7.close()     // Catch:{ all -> 0x00b6 }
            r16.close()
            return
        L_0x00aa:
            r1 = move-exception
            if (r7 == 0) goto L_0x00b5
            r7.close()     // Catch:{ all -> 0x00b1 }
            goto L_0x00b5
        L_0x00b1:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00b6 }
        L_0x00b5:
            throw r1     // Catch:{ all -> 0x00b6 }
        L_0x00b6:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x00bb }
            throw r1
        L_0x00bb:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48522f2.A01(java.util.Map):void");
    }

    public C48522f2(C56922sm r1, C72303dV r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
