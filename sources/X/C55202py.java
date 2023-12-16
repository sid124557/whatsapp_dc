package X;

/* renamed from: X.2py  reason: invalid class name and case insensitive filesystem */
public final class C55202py {
    public final C72303dV A00;
    public final C56012rH A01;

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009c, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(java.util.List r13, java.util.List r14, int r15) {
        /*
            r12 = this;
            r0 = 1
            X.C162457s7.A0J(r14, r0)
            android.content.ContentValues r7 = X.AnonymousClass0x9.A06()
            java.lang.String r0 = "state"
            X.C18270x1.A0b(r7, r0, r15)
            X.2rH r6 = r12.A01
            r6.A02()
            r6.A02()
            android.util.LongSparseArray r5 = r6.A00
            monitor-enter(r5)
            java.util.Iterator r4 = r13.iterator()     // Catch:{ all -> 0x00a0 }
        L_0x001d:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x00a0 }
            if (r0 == 0) goto L_0x003b
            long r0 = X.C18270x1.A02(r4)     // Catch:{ all -> 0x00a0 }
            java.util.Iterator r3 = r14.iterator()     // Catch:{ all -> 0x00a0 }
        L_0x002b:
            boolean r2 = r3.hasNext()     // Catch:{ all -> 0x00a0 }
            if (r2 == 0) goto L_0x001d
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x00a0 }
            X.223 r2 = (X.AnonymousClass223) r2     // Catch:{ all -> 0x00a0 }
            r6.A03(r2, r15, r0)     // Catch:{ all -> 0x00a0 }
            goto L_0x002b
        L_0x003b:
            monitor-exit(r5)
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.ArrayList r2 = X.C73783g4.A0d(r13)
            java.util.Iterator r1 = r13.iterator()
        L_0x0048:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0052
            X.C18270x1.A1M(r2, r1)
            goto L_0x0048
        L_0x0052:
            r3.addAll(r2)
            java.util.ArrayList r2 = X.C73783g4.A0d(r14)
            java.util.Iterator r1 = r14.iterator()
        L_0x005d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x006f
            java.lang.Object r0 = r1.next()
            X.223 r0 = (X.AnonymousClass223) r0
            int r0 = r0.databaseValue
            X.AnonymousClass0x7.A1I(r2, r0)
            goto L_0x005d
        L_0x006f:
            r3.addAll(r2)
            X.3dV r0 = r12.A00
            X.4Fq r2 = r0.A04()
            r0 = r2
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0099 }
            X.2sg r6 = r0.A03     // Catch:{ all -> 0x0099 }
            java.lang.String r8 = "status_crossposting_v3"
            int r1 = r13.size()     // Catch:{ all -> 0x0099 }
            int r0 = r14.size()     // Catch:{ all -> 0x0099 }
            java.lang.String r9 = X.AnonymousClass26G.A00(r1, r0)     // Catch:{ all -> 0x0099 }
            java.lang.String[] r11 = X.C18280x3.A1b(r3)     // Catch:{ all -> 0x0099 }
            java.lang.String r10 = "[WAFFLE] WaffleStatusCrosspostingStore/UPDATE_CROSSPOSTING_COLUMN_BY_MESSAGE_ROW_IDS"
            r6.A05(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0099 }
            r2.close()
            return
        L_0x0099:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x009b }
        L_0x009b:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)
            throw r0
        L_0x00a0:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55202py.A04(java.util.List, java.util.List, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006f, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0072, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(android.content.ContentValues r12, X.AnonymousClass223 r13, java.util.List r14) {
        /*
            r11 = this;
            X.3dV r0 = r11.A00
            X.4Fq r4 = r0.A04()
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x006c }
            X.2sg r5 = r0.A03     // Catch:{ all -> 0x006c }
            java.lang.String r7 = "status_crossposting_v3"
            int r1 = r14.size()     // Catch:{ all -> 0x006c }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x006c }
            java.lang.String r0 = "status_message_row_id IN  ("
            r2.append(r0)     // Catch:{ all -> 0x006c }
            java.lang.String r0 = "?"
            java.util.List r1 = java.util.Collections.nCopies(r1, r0)     // Catch:{ all -> 0x006c }
            X.C162457s7.A0D(r1)     // Catch:{ all -> 0x006c }
            java.lang.String r0 = ","
            java.lang.String r0 = X.C73723fy.A09(r0, r1)     // Catch:{ all -> 0x006c }
            r2.append(r0)     // Catch:{ all -> 0x006c }
            java.lang.String r0 = ") AND destination = ?"
            java.lang.String r8 = X.AnonymousClass000.A0X(r0, r2)     // Catch:{ all -> 0x006c }
            java.util.ArrayList r2 = X.C73783g4.A0c(r14)     // Catch:{ all -> 0x006c }
            java.util.Iterator r1 = r14.iterator()     // Catch:{ all -> 0x006c }
        L_0x003c:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x006c }
            if (r0 == 0) goto L_0x0046
            X.C18270x1.A1M(r2, r1)     // Catch:{ all -> 0x006c }
            goto L_0x003c
        L_0x0046:
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x006c }
            java.lang.Object[] r3 = r2.toArray(r0)     // Catch:{ all -> 0x006c }
            int r0 = r13.databaseValue     // Catch:{ all -> 0x006c }
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x006c }
            r0 = 0
            X.C162457s7.A0J(r3, r0)     // Catch:{ all -> 0x006c }
            int r1 = r3.length     // Catch:{ all -> 0x006c }
            int r0 = r1 + 1
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r3, r0)     // Catch:{ all -> 0x006c }
            r10[r1] = r2     // Catch:{ all -> 0x006c }
            java.lang.String[] r10 = (java.lang.String[]) r10     // Catch:{ all -> 0x006c }
            java.lang.String r9 = "[WAFFLE] WaffleStatusCrosspostingStore/UPDATE_CROSSPOSTING_COLUMN_BY_MESSAGE_ROW_IDS"
            r6 = r12
            r5.A05(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x006c }
            r4.close()
            return
        L_0x006c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006e }
        L_0x006e:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55202py.A01(android.content.ContentValues, X.223, java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0051, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0052, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0055, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(android.content.ContentValues r11, java.util.List r12) {
        /*
            r10 = this;
            X.3dV r0 = r10.A00
            X.4Fq r3 = r0.A04()
            r0 = r3
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x004f }
            X.2sg r4 = r0.A03     // Catch:{ all -> 0x004f }
            java.lang.String r6 = "status_crossposting_v3"
            int r1 = r12.size()     // Catch:{ all -> 0x004f }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x004f }
            java.lang.String r0 = "status_message_row_id IN  ("
            r2.append(r0)     // Catch:{ all -> 0x004f }
            java.lang.String r0 = "?"
            java.util.List r1 = java.util.Collections.nCopies(r1, r0)     // Catch:{ all -> 0x004f }
            X.C162457s7.A0D(r1)     // Catch:{ all -> 0x004f }
            java.lang.String r0 = ","
            java.lang.String r0 = X.C73723fy.A09(r0, r1)     // Catch:{ all -> 0x004f }
            java.lang.String r7 = X.C18260x0.A07(r0, r2)     // Catch:{ all -> 0x004f }
            java.util.ArrayList r2 = X.C73783g4.A0c(r12)     // Catch:{ all -> 0x004f }
            java.util.Iterator r1 = r12.iterator()     // Catch:{ all -> 0x004f }
        L_0x0037:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x004f }
            if (r0 == 0) goto L_0x0041
            X.C18270x1.A1M(r2, r1)     // Catch:{ all -> 0x004f }
            goto L_0x0037
        L_0x0041:
            java.lang.String[] r9 = X.C18280x3.A1b(r2)     // Catch:{ all -> 0x004f }
            java.lang.String r8 = "[WAFFLE] WaffleStatusCrosspostingStore/UPDATE_CROSSPOSTING_COLUMN_BY_MESSAGE_ROW_IDS"
            r5 = r11
            r4.A05(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x004f }
            r3.close()
            return
        L_0x004f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55202py.A02(android.content.ContentValues, java.util.List):void");
    }

    public C55202py(C72303dV r1, C56012rH r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        X.AnonymousClass2A8.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d5, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d9, code lost:
        X.AnonymousClass2A8.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00dc, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map A00(java.util.List r26) {
        /*
            r25 = this;
            java.util.HashMap r8 = X.AnonymousClass001.A0t()
            r0 = r25
            X.3dV r0 = r0.A00
            X.4GK r7 = r0.get()
            r0 = r7
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00d6 }
            X.2sg r4 = r0.A03     // Catch:{ all -> 0x00d6 }
            int r1 = r26.size()     // Catch:{ all -> 0x00d6 }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00d6 }
            java.lang.String r0 = "SELECT * FROM status_crossposting_v3 WHERE status_message_row_id IN ("
            r2.append(r0)     // Catch:{ all -> 0x00d6 }
            java.lang.String r0 = "?"
            java.util.List r1 = java.util.Collections.nCopies(r1, r0)     // Catch:{ all -> 0x00d6 }
            X.C162457s7.A0D(r1)     // Catch:{ all -> 0x00d6 }
            java.lang.String r0 = ","
            java.lang.String r0 = X.C73723fy.A09(r0, r1)     // Catch:{ all -> 0x00d6 }
            java.lang.String r3 = X.C18260x0.A07(r0, r2)     // Catch:{ all -> 0x00d6 }
            java.util.ArrayList r2 = X.C73783g4.A0c(r26)     // Catch:{ all -> 0x00d6 }
            java.util.Iterator r1 = r26.iterator()     // Catch:{ all -> 0x00d6 }
        L_0x0039:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00d6 }
            if (r0 == 0) goto L_0x0043
            X.C18270x1.A1M(r2, r1)     // Catch:{ all -> 0x00d6 }
            goto L_0x0039
        L_0x0043:
            java.lang.String[] r1 = X.C18300x5.A1b(r2)     // Catch:{ all -> 0x00d6 }
            java.lang.String r0 = "[WAFFLE] WaffleStatusCrosspostingStore/GET_CROSSPOSTING_DATA_BY_MESSAGE_ROW_IDS"
            android.database.Cursor r6 = r4.A0E(r3, r0, r1)     // Catch:{ all -> 0x00d6 }
            java.lang.String r0 = "status_message_row_id"
            int r15 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00cf }
            java.lang.String r0 = "crossposting_session_id"
            int r14 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00cf }
            java.lang.String r0 = "crossposting_status_unique_id"
            int r13 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00cf }
            java.lang.String r0 = "state"
            int r12 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00cf }
            java.lang.String r0 = "direct_url_path"
            int r11 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00cf }
            java.lang.String r0 = "media_file_path"
            int r10 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00cf }
            java.lang.String r0 = "destination"
            int r9 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00cf }
        L_0x0079:
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x00cf }
            if (r0 == 0) goto L_0x00c8
            long r23 = r6.getLong(r15)     // Catch:{ all -> 0x00cf }
            java.lang.String r18 = r6.getString(r14)     // Catch:{ all -> 0x00cf }
            java.lang.String r19 = r6.getString(r13)     // Catch:{ all -> 0x00cf }
            java.lang.String r20 = r6.getString(r10)     // Catch:{ all -> 0x00cf }
            java.lang.String r21 = r6.getString(r11)     // Catch:{ all -> 0x00cf }
            int r22 = r6.getInt(r12)     // Catch:{ all -> 0x00cf }
            int r5 = r6.getInt(r9)     // Catch:{ all -> 0x00cf }
            X.223[] r4 = X.AnonymousClass223.values()     // Catch:{ all -> 0x00cf }
            int r3 = r4.length     // Catch:{ all -> 0x00cf }
            r2 = 0
        L_0x00a1:
            if (r2 >= r3) goto L_0x00c3
            r1 = r4[r2]     // Catch:{ all -> 0x00cf }
            int r0 = r1.databaseValue     // Catch:{ all -> 0x00cf }
            if (r0 != r5) goto L_0x00c0
            X.2nQ r2 = new X.2nQ     // Catch:{ all -> 0x00cf }
            r17 = r1
            r16 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x00cf }
            long r0 = r2.A01     // Catch:{ all -> 0x00cf }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00cf }
            java.util.List r0 = X.C18280x3.A0k(r0, r8)     // Catch:{ all -> 0x00cf }
            r0.add(r2)     // Catch:{ all -> 0x00cf }
            goto L_0x0079
        L_0x00c0:
            int r2 = r2 + 1
            goto L_0x00a1
        L_0x00c3:
            java.util.NoSuchElementException r0 = X.C18320x8.A0t()     // Catch:{ all -> 0x00cf }
            throw r0     // Catch:{ all -> 0x00cf }
        L_0x00c8:
            r6.close()     // Catch:{ all -> 0x00d6 }
            r7.close()
            return r8
        L_0x00cf:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00d1 }
        L_0x00d1:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r6, r1)     // Catch:{ all -> 0x00d6 }
            throw r0     // Catch:{ all -> 0x00d6 }
        L_0x00d6:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00d8 }
        L_0x00d8:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r7, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55202py.A00(java.util.List):java.util.Map");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0065, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0066, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0069, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(java.lang.String r8, java.util.List r9, int r10, long r11) {
        /*
            r7 = this;
            java.util.Iterator r6 = r9.iterator()
        L_0x0004:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x006d
            java.lang.Object r2 = r6.next()
            X.223 r2 = (X.AnonymousClass223) r2
            java.lang.String r3 = "destination"
            r5 = 4
            X.C162457s7.A0J(r2, r5)
            android.content.ContentValues r4 = X.AnonymousClass0x9.A06()
            int r0 = (int) r11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "status_message_row_id"
            r4.put(r0, r1)
            java.lang.String r0 = "state"
            X.C18270x1.A0b(r4, r0, r10)
            int r0 = r2.databaseValue
            X.C18270x1.A0b(r4, r3, r0)
            if (r8 == 0) goto L_0x003d
            int r0 = r8.length()
            if (r0 == 0) goto L_0x003d
            java.lang.String r0 = "crossposting_session_id"
            r4.put(r0, r8)
        L_0x003d:
            X.2rH r0 = r7.A01
            r0.A02()
            r0.A02()
            android.util.LongSparseArray r1 = r0.A00
            monitor-enter(r1)
            r0.A03(r2, r10, r11)     // Catch:{ all -> 0x006a }
            monitor-exit(r1)
            X.3dV r0 = r7.A00
            X.4Fq r3 = r0.A04()
            r0 = r3
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0063 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x0063 }
            java.lang.String r1 = "status_crossposting_v3"
            java.lang.String r0 = "[WAFFLE] WaffleStatusCrosspostingStore/INSERT_CROSSPOSTING_RECORDS"
            r2.A0C(r1, r0, r4, r5)     // Catch:{ all -> 0x0063 }
            r3.close()
            goto L_0x0004
        L_0x0063:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)
            throw r0
        L_0x006a:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55202py.A03(java.lang.String, java.util.List, int, long):void");
    }
}
