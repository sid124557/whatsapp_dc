package X;

/* renamed from: X.2bi  reason: invalid class name and case insensitive filesystem */
public final class C46492bi {
    public final C69263Wi A00;
    public final C29431io A01;
    public final C72303dV A02;
    public final AnonymousClass2LV A03;
    public final C72173dI A04;

    public C46492bi(C69263Wi r3, C29431io r4, C72303dV r5, AnonymousClass2LV r6, AnonymousClass4FS r7) {
        C162457s7.A0J(r7, 1);
        C18260x0.A0e(r3, r4, r5, r6);
        this.A00 = r3;
        this.A01 = r4;
        this.A02 = r5;
        this.A03 = r6;
        this.A04 = new C72173dI(r7, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008e, code lost:
        if (java.lang.Long.valueOf(r17) != null) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c7, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ca, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00cb, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ce, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C624134x r22) {
        /*
            r21 = this;
            r3 = 0
            r4 = r22
            boolean r0 = X.AnonymousClass2z0.A0C(r4)
            if (r0 == 0) goto L_0x00cf
            r1 = r21
            X.3dV r0 = r1.A02
            X.4GK r2 = r0.get()
            r0 = 1
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ all -> 0x00c8 }
            X.C624134x.A0Y(r4, r6, r3)     // Catch:{ all -> 0x00c8 }
            r0 = r2
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00c8 }
            X.2sg r5 = r0.A03     // Catch:{ all -> 0x00c8 }
            java.lang.String r3 = "SELECT comments_count, reaction_from_me, reactions_from_me_ts, extra_newsletter_tables, extra_table_last_update_ts, view_count  FROM newsletter_message WHERE message_row_id = ?"
            java.lang.String r0 = "GET_NEWSLETTER_MESSAGE_INFO"
            android.database.Cursor r3 = r5.A0E(r3, r0, r6)     // Catch:{ all -> 0x00c8 }
            X.C162457s7.A0H(r3)     // Catch:{ all -> 0x00c1 }
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x00c1 }
            if (r0 == 0) goto L_0x00ba
            java.lang.String r0 = "comments_count"
            int r10 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x00c1 }
            java.lang.String r0 = "reaction_from_me"
            int r9 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x00c1 }
            java.lang.String r0 = "reactions_from_me_ts"
            int r8 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x00c1 }
            java.lang.String r0 = "extra_newsletter_tables"
            int r7 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x00c1 }
            java.lang.String r0 = "extra_table_last_update_ts"
            int r6 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x00c1 }
            java.lang.String r0 = "view_count"
            int r5 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x00c1 }
            boolean r0 = r3.isNull(r10)     // Catch:{ all -> 0x00c1 }
            r11 = 0
            if (r0 == 0) goto L_0x005c
            goto L_0x0061
        L_0x005c:
            java.lang.Long r0 = X.C18280x3.A0T(r3, r10)     // Catch:{ all -> 0x00c1 }
            goto L_0x0062
        L_0x0061:
            r0 = r11
        L_0x0062:
            r19 = 0
            if (r0 == 0) goto L_0x0067
            goto L_0x006a
        L_0x0067:
            r13 = 0
            goto L_0x006e
        L_0x006a:
            long r13 = r0.longValue()     // Catch:{ all -> 0x00c1 }
        L_0x006e:
            java.lang.String r12 = r3.getString(r9)     // Catch:{ all -> 0x00c1 }
            boolean r0 = r3.isNull(r8)     // Catch:{ all -> 0x00c1 }
            if (r0 != 0) goto L_0x007c
            java.lang.Long r11 = X.C18280x3.A0T(r3, r8)     // Catch:{ all -> 0x00c1 }
        L_0x007c:
            long r15 = r3.getLong(r7)     // Catch:{ all -> 0x00c1 }
            boolean r0 = r3.isNull(r6)     // Catch:{ all -> 0x00c1 }
            if (r0 != 0) goto L_0x00a1
            long r17 = r3.getLong(r6)     // Catch:{ all -> 0x00c1 }
            java.lang.Long r0 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x00c1 }
            if (r0 == 0) goto L_0x00a1
        L_0x0090:
            boolean r0 = r3.isNull(r5)     // Catch:{ all -> 0x00c1 }
            if (r0 != 0) goto L_0x00a6
            long r5 = r3.getLong(r5)     // Catch:{ all -> 0x00c1 }
            java.lang.Long r0 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x00c1 }
            if (r0 == 0) goto L_0x00a6
            goto L_0x00a4
        L_0x00a1:
            r17 = 0
            goto L_0x0090
        L_0x00a4:
            r19 = r5
        L_0x00a6:
            X.2SV r10 = new X.2SV     // Catch:{ all -> 0x00c1 }
            r10.<init>(r11, r12, r13, r15, r17, r19)     // Catch:{ all -> 0x00c1 }
            r4.A1X(r10)     // Catch:{ all -> 0x00c1 }
            X.3dI r6 = r1.A04     // Catch:{ all -> 0x00c1 }
            r5 = 36
            X.3Zy r0 = new X.3Zy     // Catch:{ all -> 0x00c1 }
            r0.<init>(r1, r5, r4)     // Catch:{ all -> 0x00c1 }
            r6.execute(r0)     // Catch:{ all -> 0x00c1 }
        L_0x00ba:
            r3.close()     // Catch:{ all -> 0x00c8 }
            r2.close()
            return
        L_0x00c1:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c3 }
        L_0x00c3:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)     // Catch:{ all -> 0x00c8 }
            throw r0     // Catch:{ all -> 0x00c8 }
        L_0x00c8:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ca }
        L_0x00ca:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)
            throw r0
        L_0x00cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46492bi.A00(X.34x):void");
    }
}
