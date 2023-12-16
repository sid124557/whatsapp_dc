package X;

/* renamed from: X.2zg  reason: invalid class name and case insensitive filesystem */
public final class C61082zg {
    public final C72303dV A00;

    public C61082zg(C72303dV r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003e, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0041, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A00(long r6) {
        /*
            r5 = this;
            X.3dV r0 = r5.A00
            X.4GK r4 = r0.get()
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x003b }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x003b }
            java.lang.String r2 = "SELECT pn_requested_ts FROM lid_chat_state WHERE jid_row_id = ?"
            java.lang.String[] r1 = X.C18260x0.A1b(r6)     // Catch:{ all -> 0x003b }
            java.lang.String r0 = "LidChatStateStore/GET_PN_REQUESTED_TS"
            android.database.Cursor r2 = X.C56862sg.A02(r3, r2, r0, r1)     // Catch:{ all -> 0x003b }
            java.lang.String r0 = "pn_requested_ts"
            int r1 = r2.getColumnIndex(r0)     // Catch:{ all -> 0x0034 }
            if (r1 < 0) goto L_0x002b
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x002b
            long r0 = r2.getLong(r1)     // Catch:{ all -> 0x0034 }
            goto L_0x002d
        L_0x002b:
            r0 = 0
        L_0x002d:
            r2.close()     // Catch:{ all -> 0x003b }
            r4.close()
            return r0
        L_0x0034:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0036 }
        L_0x0036:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ all -> 0x003b }
            throw r0     // Catch:{ all -> 0x003b }
        L_0x003b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003d }
        L_0x003d:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61082zg.A00(long):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0041, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0044, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0045, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0048, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Boolean A01(long r6) {
        /*
            r5 = this;
            X.3dV r0 = r5.A00
            X.4GK r4 = r0.get()
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0042 }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x0042 }
            java.lang.String r2 = "SELECT is_pn_shared FROM lid_chat_state WHERE jid_row_id = ?"
            java.lang.String[] r1 = X.C18260x0.A1b(r6)     // Catch:{ all -> 0x0042 }
            java.lang.String r0 = "LidChatStateStore/GET_PN_SHARED_BY_JID"
            android.database.Cursor r3 = X.C56862sg.A02(r3, r2, r0, r1)     // Catch:{ all -> 0x0042 }
            java.lang.String r0 = "is_pn_shared"
            int r1 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x003b }
            r2 = 0
            if (r1 < 0) goto L_0x0034
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x0034
            int r1 = r3.getInt(r1)     // Catch:{ all -> 0x003b }
            if (r1 == 0) goto L_0x0032
            r0 = 1
            if (r1 != r0) goto L_0x0034
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x003b }
            goto L_0x0034
        L_0x0032:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x003b }
        L_0x0034:
            r3.close()     // Catch:{ all -> 0x0042 }
            r4.close()
            return r2
        L_0x003b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003d }
        L_0x003d:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)     // Catch:{ all -> 0x0042 }
            throw r0     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0044 }
        L_0x0044:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61082zg.A01(long):java.lang.Boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0040, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0043, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(long r6) {
        /*
            r5 = this;
            X.3dV r0 = r5.A00
            X.4GK r4 = r0.get()
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x003d }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x003d }
            java.lang.String r2 = "SELECT pnh_duplicate_lid_thread FROM lid_chat_state WHERE jid_row_id = ?"
            java.lang.String[] r1 = X.C18260x0.A1b(r6)     // Catch:{ all -> 0x003d }
            java.lang.String r0 = "LidChatStateStore/GET_LID_DUPLICATE_FLAG"
            android.database.Cursor r3 = X.C56862sg.A02(r3, r2, r0, r1)     // Catch:{ all -> 0x003d }
            java.lang.String r0 = "pnh_duplicate_lid_thread"
            int r2 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x0036 }
            r1 = 0
            if (r2 < 0) goto L_0x002f
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x002f
            int r0 = r3.getInt(r2)     // Catch:{ all -> 0x0036 }
            boolean r1 = X.C18310x6.A1W(r0)
        L_0x002f:
            r3.close()     // Catch:{ all -> 0x003d }
            r4.close()
            return r1
        L_0x0036:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)     // Catch:{ all -> 0x003d }
            throw r0     // Catch:{ all -> 0x003d }
        L_0x003d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003f }
        L_0x003f:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61082zg.A02(long):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(long r8, long r10) {
        /*
            r7 = this;
            X.3dV r0 = r7.A00     // Catch:{ all -> 0x0043 }
            X.4Fq r4 = r0.A04()     // Catch:{ all -> 0x0043 }
            X.C162457s7.A0H(r4)     // Catch:{ all -> 0x003c }
            X.3Yo r5 = r4.Axl()     // Catch:{ all -> 0x003c }
            android.content.ContentValues r6 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x0035 }
            java.lang.String r0 = "jid_row_id"
            X.C18270x1.A0c(r6, r0, r8)     // Catch:{ all -> 0x0035 }
            java.lang.String r0 = "pn_requested_ts"
            X.C18270x1.A0c(r6, r0, r10)     // Catch:{ all -> 0x0035 }
            java.lang.String r3 = "LidChatStateStore/SET_PN_REQUESTED_TS"
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0035 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x0035 }
            java.lang.String r1 = "lid_chat_state"
            r0 = 5
            r2.A0C(r1, r3, r6, r0)     // Catch:{ all -> 0x0035 }
            r5.A00()     // Catch:{ all -> 0x0035 }
            r5.close()     // Catch:{ all -> 0x003c }
            r4.close()     // Catch:{ all -> 0x0043 }
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0043 }
            goto L_0x0048
        L_0x0035:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)     // Catch:{ all -> 0x003c }
            throw r0     // Catch:{ all -> 0x003c }
        L_0x003c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)     // Catch:{ all -> 0x0043 }
            throw r0     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r0 = move-exception
            X.3Z0 r2 = X.AnonymousClass3Z0.A01(r0)
        L_0x0048:
            java.lang.Throwable r1 = X.AnonymousClass3Z9.A00(r2)
            if (r1 == 0) goto L_0x0054
            java.lang.String r0 = "{LidChatStateStore/}failed to set phone requested time"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0054:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r0 = r2 instanceof X.AnonymousClass3Z0
            if (r0 == 0) goto L_0x005b
            r2 = r1
        L_0x005b:
            boolean r0 = X.AnonymousClass001.A1Z(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61082zg.A03(long, long):boolean");
    }
}
