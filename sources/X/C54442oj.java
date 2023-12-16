package X;

/* renamed from: X.2oj  reason: invalid class name and case insensitive filesystem */
public class C54442oj {
    public final C28781hl A00;
    public final AnonymousClass1RI A01;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A00(X.C27991fJ r7) {
        /*
            r6 = this;
            r1 = 0
            X.C162457s7.A0J(r7, r1)
            java.lang.String[] r5 = X.AnonymousClass0x9.A1Y()
            java.lang.String r0 = r7.getRawString()
            r4 = 0
            r5[r1] = r0
            X.1RI r0 = r6.A01
            X.4GK r3 = r0.get()
            r0 = r3
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x003a }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x003a }
            java.lang.String r1 = "SELECT COUNT(*) as count FROM group_membership_approval_requests WHERE group_jid = ?"
            java.lang.String r0 = "GET_GROUP_MEMBERSHIP_APPROVAL_REQUESTS_COUNT_WITH_JID_SQL"
            android.database.Cursor r2 = r2.A0E(r1, r0, r5)     // Catch:{ all -> 0x003a }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x002c
            int r4 = X.AnonymousClass0x2.A03(r2)     // Catch:{ all -> 0x0033 }
        L_0x002c:
            r2.close()     // Catch:{ all -> 0x003a }
            r3.close()
            return r4
        L_0x0033:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0035 }
        L_0x0035:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ all -> 0x003a }
            throw r0     // Catch:{ all -> 0x003a }
        L_0x003a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003c }
        L_0x003c:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54442oj.A00(X.1fJ):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C27991fJ r8) {
        /*
            r7 = this;
            r6 = 0
            X.C162457s7.A0J(r8, r6)
            X.1RI r0 = r7.A01
            X.4Fq r5 = r0.A0C()
            r0 = r5
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x002b }
            X.2sg r4 = r0.A03     // Catch:{ all -> 0x002b }
            java.lang.String r3 = "group_membership_approval_requests"
            java.lang.String r2 = "group_jid =?"
            java.lang.String[] r1 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x002b }
            X.C18280x3.A0w(r8, r1, r6)     // Catch:{ all -> 0x002b }
            java.lang.String r0 = "delete_membership_approval_requests_by_group_jid"
            int r0 = r4.A07(r3, r2, r0, r1)     // Catch:{ all -> 0x002b }
            r5.close()
            if (r0 <= 0) goto L_0x002a
            X.1hl r0 = r7.A00
            r0.A08(r8)
        L_0x002a:
            return
        L_0x002b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002d }
        L_0x002d:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54442oj.A01(X.1fJ):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        X.AnonymousClass2A8.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C27991fJ r10, com.whatsapp.jid.UserJid r11) {
        /*
            r9 = this;
            r8 = 0
            boolean r7 = X.AnonymousClass0x2.A1Y(r10, r11)
            X.1RI r0 = r9.A01
            X.4Fq r6 = r0.A0C()
            r0 = r6
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x003c }
            X.2sg r5 = r0.A03     // Catch:{ all -> 0x003c }
            java.lang.String r4 = "group_membership_approval_requests"
            java.lang.String r3 = "requester_jid =? AND group_jid =?"
            java.lang.String[] r1 = X.AnonymousClass0x9.A1Z()     // Catch:{ all -> 0x003c }
            java.lang.String r0 = r11.getRawString()     // Catch:{ all -> 0x003c }
            r2 = 0
            r1[r8] = r0     // Catch:{ all -> 0x003c }
            X.C18280x3.A0w(r10, r1, r7)     // Catch:{ all -> 0x003c }
            java.lang.String r0 = "delete_membership_approval_request"
            int r1 = r5.A07(r4, r3, r0, r1)     // Catch:{ all -> 0x003c }
            if (r1 > r7) goto L_0x002c
            r2 = 1
        L_0x002c:
            java.lang.String r0 = "There should not be more than 1 membership approval request entries with same requester_jid + group_jid"
            X.C626936e.A0D(r2, r0)     // Catch:{ all -> 0x003c }
            if (r1 <= 0) goto L_0x0038
            X.1hl r0 = r9.A00     // Catch:{ all -> 0x003c }
            r0.A08(r10)     // Catch:{ all -> 0x003c }
        L_0x0038:
            r6.close()
            return
        L_0x003c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r6, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54442oj.A02(X.1fJ, com.whatsapp.jid.UserJid):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ae, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        X.AnonymousClass2A8.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ca, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(java.util.List r11) {
        /*
            r10 = this;
            r7 = 0
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x00cf
            X.1RI r0 = r10.A01     // Catch:{ SQLiteDatabaseCorruptException -> 0x00cb }
            X.4Fq r4 = r0.A0C()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00cb }
            X.C162457s7.A0H(r4)     // Catch:{ all -> 0x00c4 }
            boolean r0 = r11.isEmpty()     // Catch:{ all -> 0x00c4 }
            if (r0 != 0) goto L_0x00b3
            java.lang.Object r0 = r11.get(r7)     // Catch:{ all -> 0x00c4 }
            X.2n0 r0 = (X.C53382n0) r0     // Catch:{ all -> 0x00c4 }
            X.1fJ r8 = r0.A01     // Catch:{ all -> 0x00c4 }
            X.3Yo r6 = r4.Axl()     // Catch:{ all -> 0x00c4 }
            java.util.Iterator r9 = r11.iterator()     // Catch:{ all -> 0x00ac }
        L_0x0026:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x00ac }
            if (r0 == 0) goto L_0x00a5
            java.lang.Object r2 = r9.next()     // Catch:{ all -> 0x00ac }
            X.2n0 r2 = (X.C53382n0) r2     // Catch:{ all -> 0x00ac }
            X.1fJ r5 = r2.A01     // Catch:{ all -> 0x00ac }
            boolean r3 = X.C162457s7.A0P(r8, r5)     // Catch:{ all -> 0x00ac }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = "Not all requests given to bulkInsertGroupMembershipApprovalRequests belong to the same group. Mismatched GroupJid1 : "
            r1.append(r0)     // Catch:{ all -> 0x00ac }
            r1.append(r8)     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = ",  GroupJid2: "
            java.lang.String r0 = X.AnonymousClass000.A0P(r5, r0, r1)     // Catch:{ all -> 0x00ac }
            X.C626936e.A0D(r3, r0)     // Catch:{ all -> 0x00ac }
            java.lang.String r3 = r5.getRawString()     // Catch:{ all -> 0x00ac }
            com.whatsapp.jid.UserJid r0 = r2.A04     // Catch:{ all -> 0x00ac }
            java.lang.String r1 = r0.getRawString()     // Catch:{ all -> 0x00ac }
            r0 = 6
            android.content.ContentValues r5 = X.AnonymousClass0x9.A07(r0)     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = "group_jid"
            r5.put(r0, r3)     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = "requester_jid"
            r5.put(r0, r1)     // Catch:{ all -> 0x00ac }
            java.lang.String r1 = "request_method"
            java.lang.String r0 = r2.A05     // Catch:{ all -> 0x00ac }
            r5.put(r1, r0)     // Catch:{ all -> 0x00ac }
            long r0 = r2.A00     // Catch:{ all -> 0x00ac }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = "request_creation_time"
            r5.put(r0, r1)     // Catch:{ all -> 0x00ac }
            X.1fJ r1 = r2.A02     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = "parent_group_jid"
            if (r1 == 0) goto L_0x00a1
            X.AnonymousClass0x2.A0n(r5, r1, r0)     // Catch:{ all -> 0x00ac }
        L_0x0085:
            com.whatsapp.jid.UserJid r1 = r2.A03     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = "requested_by_jid"
            if (r1 == 0) goto L_0x009d
            X.AnonymousClass0x2.A0n(r5, r1, r0)     // Catch:{ all -> 0x00ac }
        L_0x008f:
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00ac }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x00ac }
            java.lang.String r2 = "group_membership_approval_requests"
            r1 = 5
            java.lang.String r0 = "group_membership_approval_requests.insertGroupMembershipApprovalRequest"
            r3.A0C(r2, r0, r5, r1)     // Catch:{ all -> 0x00ac }
            goto L_0x0026
        L_0x009d:
            r5.putNull(r0)     // Catch:{ all -> 0x00ac }
            goto L_0x008f
        L_0x00a1:
            r5.putNull(r0)     // Catch:{ all -> 0x00ac }
            goto L_0x0085
        L_0x00a5:
            r6.A00()     // Catch:{ all -> 0x00ac }
            r6.close()     // Catch:{ all -> 0x00c4 }
            goto L_0x00b3
        L_0x00ac:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ae }
        L_0x00ae:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r6, r1)     // Catch:{ all -> 0x00c4 }
            throw r0     // Catch:{ all -> 0x00c4 }
        L_0x00b3:
            r4.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00cb }
            X.1hl r1 = r10.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x00cb }
            java.lang.Object r0 = r11.get(r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00cb }
            X.2n0 r0 = (X.C53382n0) r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x00cb }
            X.1fJ r0 = r0.A01     // Catch:{ SQLiteDatabaseCorruptException -> 0x00cb }
            r1.A08(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00cb }
            return
        L_0x00c4:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c6 }
        L_0x00c6:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00cb }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x00cb }
        L_0x00cb:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x00cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54442oj.A03(java.util.List):void");
    }

    public C54442oj(C28781hl r1, AnonymousClass1RI r2) {
        C18260x0.A0Q(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }
}
