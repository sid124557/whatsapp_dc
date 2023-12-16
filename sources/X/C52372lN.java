package X;

/* renamed from: X.2lN  reason: invalid class name and case insensitive filesystem */
public class C52372lN {
    public final C56662sM A00;
    public final C28781hl A01;
    public final AnonymousClass1RI A02;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C27991fJ r8) {
        /*
            r7 = this;
            r6 = 0
            X.C162457s7.A0J(r8, r6)
            X.1RI r0 = r7.A02
            X.4Fq r5 = r0.A0C()
            r0 = r5
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0024 }
            X.2sg r4 = r0.A03     // Catch:{ all -> 0x0024 }
            java.lang.String r3 = "non_admin_group_membership_approval_requests"
            java.lang.String r2 = "group_jid =?"
            java.lang.String[] r1 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x0024 }
            X.C18280x3.A0w(r8, r1, r6)     // Catch:{ all -> 0x0024 }
            java.lang.String r0 = "delete_non_admin_gjr_by_group_jid"
            r4.A07(r3, r2, r0, r1)     // Catch:{ all -> 0x0024 }
            r5.close()
            return
        L_0x0024:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0026 }
        L_0x0026:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52372lN.A00(X.1fJ):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        X.AnonymousClass2A8.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a0, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a7, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(java.util.List r12) {
        /*
            r11 = this;
            r7 = 0
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x00ac
            X.1RI r0 = r11.A02     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a8 }
            X.4Fq r4 = r0.A0C()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a8 }
            X.C162457s7.A0H(r4)     // Catch:{ all -> 0x00a1 }
            java.lang.Object r0 = r12.get(r7)     // Catch:{ all -> 0x00a1 }
            X.2lz r0 = (X.C52752lz) r0     // Catch:{ all -> 0x00a1 }
            X.1fJ r8 = r0.A01     // Catch:{ all -> 0x00a1 }
            X.3Yo r6 = r4.Axl()     // Catch:{ all -> 0x00a1 }
            java.util.Iterator r10 = r12.iterator()     // Catch:{ all -> 0x009a }
        L_0x0020:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x009a }
            if (r0 == 0) goto L_0x0083
            java.lang.Object r9 = r10.next()     // Catch:{ all -> 0x009a }
            X.2lz r9 = (X.C52752lz) r9     // Catch:{ all -> 0x009a }
            X.1fJ r3 = r9.A01     // Catch:{ all -> 0x009a }
            boolean r2 = X.C162457s7.A0P(r8, r3)     // Catch:{ all -> 0x009a }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x009a }
            java.lang.String r0 = "Not all requests given to bulkInsertRequests belong to the same group. Mismatched GroupJid1 : "
            r1.append(r0)     // Catch:{ all -> 0x009a }
            r1.append(r8)     // Catch:{ all -> 0x009a }
            java.lang.String r0 = ",  GroupJid2: "
            java.lang.String r0 = X.AnonymousClass000.A0P(r3, r0, r1)     // Catch:{ all -> 0x009a }
            X.C626936e.A0D(r2, r0)     // Catch:{ all -> 0x009a }
            java.lang.String r3 = r3.getRawString()     // Catch:{ all -> 0x009a }
            com.whatsapp.jid.UserJid r0 = r9.A03     // Catch:{ all -> 0x009a }
            java.lang.String r2 = r0.getRawString()     // Catch:{ all -> 0x009a }
            com.whatsapp.jid.UserJid r0 = r9.A02     // Catch:{ all -> 0x009a }
            java.lang.String r1 = r0.getRawString()     // Catch:{ all -> 0x009a }
            android.content.ContentValues r5 = X.C18300x5.A06()     // Catch:{ all -> 0x009a }
            java.lang.String r0 = "group_jid"
            r5.put(r0, r3)     // Catch:{ all -> 0x009a }
            java.lang.String r0 = "requested_for_jid"
            r5.put(r0, r2)     // Catch:{ all -> 0x009a }
            java.lang.String r0 = "requested_by_jid"
            r5.put(r0, r1)     // Catch:{ all -> 0x009a }
            long r0 = r9.A00     // Catch:{ all -> 0x009a }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x009a }
            java.lang.String r0 = "request_creation_time"
            X.2sg r3 = X.AnonymousClass3H0.A00(r5, r1, r4, r0)     // Catch:{ all -> 0x009a }
            java.lang.String r2 = "non_admin_group_membership_approval_requests"
            r1 = 5
            java.lang.String r0 = "insert_non_admin_gjr"
            r3.A0C(r2, r0, r5, r1)     // Catch:{ all -> 0x009a }
            goto L_0x0020
        L_0x0083:
            r6.A00()     // Catch:{ all -> 0x009a }
            r6.close()     // Catch:{ all -> 0x00a1 }
            r4.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a8 }
            X.1hl r1 = r11.A01     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a8 }
            java.lang.Object r0 = r12.get(r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a8 }
            X.2lz r0 = (X.C52752lz) r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a8 }
            X.1fJ r0 = r0.A01     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a8 }
            r1.A08(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a8 }
            return
        L_0x009a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x009c }
        L_0x009c:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r6, r1)     // Catch:{ all -> 0x00a1 }
            throw r0     // Catch:{ all -> 0x00a1 }
        L_0x00a1:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a3 }
        L_0x00a3:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a8 }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a8 }
        L_0x00a8:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52372lN.A02(java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0053, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0056, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0057, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C27991fJ r12, com.whatsapp.jid.UserJid r13) {
        /*
            r11 = this;
            java.lang.String r9 = "delete_non_admin_gjr"
            java.lang.String r8 = "requested_for_jid =? AND group_jid =?"
            java.lang.String r7 = "non_admin_group_membership_approval_requests"
            r6 = 0
            boolean r5 = X.AnonymousClass0x2.A1Y(r12, r13)
            X.1RI r0 = r11.A02
            X.4Fq r4 = r0.A0C()
            X.3Yo r3 = r4.Axl()     // Catch:{ all -> 0x0054 }
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x004d }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x004d }
            r10 = 2
            java.lang.String[] r0 = new java.lang.String[r10]     // Catch:{ all -> 0x004d }
            X.C18280x3.A0w(r13, r0, r6)     // Catch:{ all -> 0x004d }
            X.C18280x3.A0w(r12, r0, r5)     // Catch:{ all -> 0x004d }
            int r0 = r2.A07(r7, r8, r9, r0)     // Catch:{ all -> 0x004d }
            if (r0 != 0) goto L_0x003e
            X.2sM r0 = r11.A00     // Catch:{ all -> 0x004d }
            com.whatsapp.jid.UserJid r1 = r0.A03(r13)     // Catch:{ all -> 0x004d }
            if (r1 == 0) goto L_0x003e
            java.lang.String[] r0 = new java.lang.String[r10]     // Catch:{ all -> 0x004d }
            X.C18280x3.A0w(r1, r0, r6)     // Catch:{ all -> 0x004d }
            X.C18280x3.A0w(r12, r0, r5)     // Catch:{ all -> 0x004d }
            r2.A07(r7, r8, r9, r0)     // Catch:{ all -> 0x004d }
        L_0x003e:
            r3.A00()     // Catch:{ all -> 0x004d }
            X.1hl r0 = r11.A01     // Catch:{ all -> 0x004d }
            r0.A08(r12)     // Catch:{ all -> 0x004d }
            r3.close()     // Catch:{ all -> 0x0054 }
            r4.close()
            return
        L_0x004d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004f }
        L_0x004f:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)     // Catch:{ all -> 0x0054 }
            throw r0     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52372lN.A01(X.1fJ, com.whatsapp.jid.UserJid):void");
    }

    public C52372lN(C56662sM r1, C28781hl r2, AnonymousClass1RI r3) {
        C18260x0.A0V(r3, r1, r2);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }
}
