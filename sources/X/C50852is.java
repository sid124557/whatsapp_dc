package X;

/* renamed from: X.2is  reason: invalid class name and case insensitive filesystem */
public final class C50852is {
    public final AnonymousClass1RI A00;

    public C50852is(AnonymousClass1RI r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: type inference failed for: r0v19, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ab, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00af, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b3, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        throw r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A00(X.C27991fJ r25) {
        /*
            r24 = this;
            r5 = 0
            r0 = r24
            X.1RI r0 = r0.A00
            X.4GK r4 = r0.get()
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00b0 }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x00b0 }
            java.lang.String r2 = "SELECT group_jid, parent_group_jid, subject, description, creator_jid, request_creation_time, participant_count, is_existing_group FROM member_suggested_groups_v2 WHERE parent_group_jid = ? ORDER BY request_creation_time DESC "
            java.lang.String[] r1 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x00b0 }
            r0 = r25
            X.C18280x3.A0w(r0, r1, r5)     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "GET_GROUP_SUGGESTIONS_BY_PARENT_GROUP_JID"
            android.database.Cursor r3 = r3.A0E(r2, r0, r1)     // Catch:{ all -> 0x00b0 }
            X.C162457s7.A0H(r3)     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = "group_jid"
            int r12 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = "parent_group_jid"
            int r11 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = "subject"
            int r10 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = "description"
            int r9 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = "creator_jid"
            int r8 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = "request_creation_time"
            int r7 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = "participant_count"
            int r2 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = "is_existing_group"
            int r1 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00a9 }
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x00a0
            java.util.ArrayList r0 = X.AnonymousClass000.A0o(r3)     // Catch:{ all -> 0x00a9 }
        L_0x0060:
            java.lang.String r5 = r3.getString(r11)     // Catch:{ all -> 0x00a9 }
            X.1fJ r14 = X.AnonymousClass34R.A05(r5)     // Catch:{ all -> 0x00a9 }
            java.lang.String r5 = r3.getString(r12)     // Catch:{ all -> 0x00a9 }
            X.1fJ r15 = X.AnonymousClass34R.A05(r5)     // Catch:{ all -> 0x00a9 }
            java.lang.String r17 = r3.getString(r10)     // Catch:{ all -> 0x00a9 }
            java.lang.String r18 = r3.getString(r9)     // Catch:{ all -> 0x00a9 }
            java.lang.String r5 = r3.getString(r8)     // Catch:{ all -> 0x00a9 }
            com.whatsapp.jid.UserJid r16 = X.AnonymousClass32Y.A0A(r5)     // Catch:{ all -> 0x00a9 }
            long r19 = r3.getLong(r7)     // Catch:{ all -> 0x00a9 }
            long r21 = r3.getLong(r2)     // Catch:{ all -> 0x00a9 }
            int r6 = r3.getInt(r1)     // Catch:{ all -> 0x00a9 }
            r5 = 1
            boolean r23 = X.AnonymousClass000.A1U(r6, r5)
            X.2nf r13 = new X.2nf     // Catch:{ all -> 0x00a9 }
            r13.<init>(r14, r15, r16, r17, r18, r19, r21, r23)     // Catch:{ all -> 0x00a9 }
            r0.add(r13)     // Catch:{ all -> 0x00a9 }
            boolean r5 = r3.moveToNext()     // Catch:{ all -> 0x00a9 }
            if (r5 != 0) goto L_0x0060
            goto L_0x00a2
        L_0x00a0:
            X.3d3 r0 = X.C72023d3.A00     // Catch:{ all -> 0x00a9 }
        L_0x00a2:
            r3.close()     // Catch:{ all -> 0x00b0 }
            r4.close()
            return r0
        L_0x00a9:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)     // Catch:{ all -> 0x00b0 }
            throw r0     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50852is.A00(X.1fJ):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0064, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        X.AnonymousClass2A8.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0068, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C27991fJ r13, java.lang.Iterable r14) {
        /*
            r12 = this;
            r9 = 0
            X.1RI r0 = r12.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x0070 }
            X.4Fq r5 = r0.A0C()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0070 }
            X.3Yo r7 = r5.Axl()     // Catch:{ all -> 0x0069 }
            java.util.Iterator r11 = r14.iterator()     // Catch:{ all -> 0x0062 }
        L_0x000f:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x0062 }
            if (r0 == 0) goto L_0x0058
            java.lang.Object r0 = r11.next()     // Catch:{ all -> 0x0062 }
            X.2lC r0 = (X.C52262lC) r0     // Catch:{ all -> 0x0062 }
            X.1fJ r10 = r0.A00     // Catch:{ all -> 0x0062 }
            com.whatsapp.jid.UserJid r8 = r0.A02     // Catch:{ all -> 0x0062 }
            r6 = 1
            r1 = 2
            java.lang.String r4 = "member_suggested_groups_v2"
            if (r8 == 0) goto L_0x0040
            r0 = r5
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0062 }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x0062 }
            java.lang.String[] r2 = X.AnonymousClass0x9.A1a()     // Catch:{ all -> 0x0062 }
            X.C18280x3.A0w(r13, r2, r9)     // Catch:{ all -> 0x0062 }
            X.C18280x3.A0w(r10, r2, r6)     // Catch:{ all -> 0x0062 }
            X.C18280x3.A0w(r8, r2, r1)     // Catch:{ all -> 0x0062 }
            java.lang.String r1 = "DELETE_GROUP_SUGGESTIONS_BY_PARENT_AND_GROUP_JID_AND_CREATOR"
            java.lang.String r0 = "parent_group_jid = ?  AND group_jid = ?  AND creator_jid = ?"
        L_0x003c:
            r3.A07(r4, r0, r1, r2)     // Catch:{ all -> 0x0062 }
            goto L_0x000f
        L_0x0040:
            java.lang.String r0 = "deleteSubgroupSuggestionHelper/Deprecated sql DELETE_GROUP_SUGGESTIONS_BY_PARENT_AND_GROUP_JID is used, possibly revoke with no creator"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0062 }
            r0 = r5
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0062 }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x0062 }
            java.lang.String[] r2 = new java.lang.String[r1]     // Catch:{ all -> 0x0062 }
            X.C18280x3.A0w(r13, r2, r9)     // Catch:{ all -> 0x0062 }
            X.C18280x3.A0w(r10, r2, r6)     // Catch:{ all -> 0x0062 }
            java.lang.String r1 = "DELETE_GROUP_SUGGESTIONS_BY_PARENT_AND_GROUP_JID"
            java.lang.String r0 = "parent_group_jid = ?  AND group_jid = ?"
            goto L_0x003c
        L_0x0058:
            r7.A00()     // Catch:{ all -> 0x0062 }
            r7.close()     // Catch:{ all -> 0x0069 }
            r5.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0070 }
            return
        L_0x0062:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r7, r1)     // Catch:{ all -> 0x0069 }
            throw r0     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006b }
        L_0x006b:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0070 }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0070 }
        L_0x0070:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50852is.A01(X.1fJ, java.lang.Iterable):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0096, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a1, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(java.lang.Iterable r11) {
        /*
            r10 = this;
            X.1RI r0 = r10.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a2 }
            X.4Fq r4 = r0.A0C()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a2 }
            X.3Yo r5 = r4.Axl()     // Catch:{ all -> 0x009b }
            java.util.Iterator r9 = r11.iterator()     // Catch:{ all -> 0x0094 }
        L_0x000e:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0094 }
            if (r0 == 0) goto L_0x008a
            java.lang.Object r3 = r9.next()     // Catch:{ all -> 0x0094 }
            X.2nf r3 = (X.C53782nf) r3     // Catch:{ all -> 0x0094 }
            r0 = 8
            android.content.ContentValues r6 = X.AnonymousClass0x9.A07(r0)     // Catch:{ all -> 0x0094 }
            X.1fJ r0 = r3.A02     // Catch:{ all -> 0x0094 }
            java.lang.String r1 = r0.getRawString()     // Catch:{ all -> 0x0094 }
            java.lang.String r0 = "group_jid"
            r6.put(r0, r1)     // Catch:{ all -> 0x0094 }
            X.1fJ r0 = r3.A03     // Catch:{ all -> 0x0094 }
            java.lang.String r1 = r0.getRawString()     // Catch:{ all -> 0x0094 }
            java.lang.String r0 = "parent_group_jid"
            r6.put(r0, r1)     // Catch:{ all -> 0x0094 }
            java.lang.String r1 = "subject"
            java.lang.String r0 = r3.A06     // Catch:{ all -> 0x0094 }
            r6.put(r1, r0)     // Catch:{ all -> 0x0094 }
            java.lang.String r1 = "description"
            java.lang.String r0 = r3.A05     // Catch:{ all -> 0x0094 }
            r6.put(r1, r0)     // Catch:{ all -> 0x0094 }
            com.whatsapp.jid.UserJid r0 = r3.A04     // Catch:{ all -> 0x0094 }
            java.lang.String r1 = r0.getRawString()     // Catch:{ all -> 0x0094 }
            java.lang.String r0 = "creator_jid"
            r6.put(r0, r1)     // Catch:{ all -> 0x0094 }
            long r0 = r3.A00     // Catch:{ all -> 0x0094 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0094 }
            java.lang.String r0 = "request_creation_time"
            r6.put(r0, r1)     // Catch:{ all -> 0x0094 }
            long r1 = r3.A01     // Catch:{ all -> 0x0094 }
            r7 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x006f
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0094 }
            java.lang.String r0 = "participant_count"
            r6.put(r0, r1)     // Catch:{ all -> 0x0094 }
        L_0x006f:
            boolean r0 = r3.A07     // Catch:{ all -> 0x0094 }
            if (r0 == 0) goto L_0x007c
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0094 }
            java.lang.String r0 = "is_existing_group"
            r6.put(r0, r1)     // Catch:{ all -> 0x0094 }
        L_0x007c:
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0094 }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x0094 }
            java.lang.String r2 = "member_suggested_groups_v2"
            r1 = 5
            java.lang.String r0 = "member_suggested_groups_v2.insert"
            r3.A0C(r2, r0, r6, r1)     // Catch:{ all -> 0x0094 }
            goto L_0x000e
        L_0x008a:
            r5.A00()     // Catch:{ all -> 0x0094 }
            r5.close()     // Catch:{ all -> 0x009b }
            r4.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a2 }
            return
        L_0x0094:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0096 }
        L_0x0096:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)     // Catch:{ all -> 0x009b }
            throw r0     // Catch:{ all -> 0x009b }
        L_0x009b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x009d }
        L_0x009d:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a2 }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a2 }
        L_0x00a2:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50852is.A02(java.lang.Iterable):void");
    }
}
