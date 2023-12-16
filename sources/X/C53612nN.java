package X;

/* renamed from: X.2nN  reason: invalid class name and case insensitive filesystem */
public final class C53612nN {
    public final C56922sm A00;
    public final C56982ss A01;
    public final C50012hU A02;
    public final C61142zm A03;
    public final C29431io A04;
    public final C72303dV A05;
    public final C55832qz A06;

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0068, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0070, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0073, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C624134x r8) {
        /*
            r7 = this;
            r5 = 0
            r0 = 16
            boolean r0 = r8.A1r(r0)
            if (r0 == 0) goto L_0x0074
            X.3dV r0 = r7.A05
            X.4GK r4 = r0.get()
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x006d }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x006d }
            java.lang.String r2 = "\n          SELECT \n            message_row_id,\n            number_of_comments,\n            last_comment_ts,\n            last_comment_message_row_id\n          FROM message_comment_parent\n          WHERE message_row_id = ?    \n        "
            java.lang.String[] r1 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x006d }
            X.C624134x.A0Y(r8, r1, r5)     // Catch:{ all -> 0x006d }
            java.lang.String r0 = "SELECT_PARENT_MESSAGE_COMMENT_INFO"
            android.database.Cursor r5 = r3.A0E(r2, r0, r1)     // Catch:{ all -> 0x006d }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0066 }
            r6 = 0
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = "number_of_comments"
            int r2 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0066 }
            java.lang.String r0 = "last_comment_ts"
            int r1 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0066 }
            java.lang.String r0 = "last_comment_message_row_id"
            int r3 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0066 }
            int r2 = r5.getInt(r2)     // Catch:{ all -> 0x0066 }
            boolean r0 = r5.isNull(r1)     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x0049
            r1 = r6
            goto L_0x004d
        L_0x0049:
            java.lang.Long r1 = X.C18280x3.A0T(r5, r1)     // Catch:{ all -> 0x0066 }
        L_0x004d:
            boolean r0 = r5.isNull(r3)     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x0057
            java.lang.Long r6 = X.C18280x3.A0T(r5, r3)     // Catch:{ all -> 0x0066 }
        L_0x0057:
            X.1m6 r0 = new X.1m6     // Catch:{ all -> 0x0066 }
            r0.<init>(r6, r1, r2)     // Catch:{ all -> 0x0066 }
            r8.A1N(r0)     // Catch:{ all -> 0x0066 }
        L_0x005f:
            r5.close()     // Catch:{ all -> 0x006d }
            r4.close()
            return
        L_0x0066:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0068 }
        L_0x0068:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)     // Catch:{ all -> 0x006d }
            throw r0     // Catch:{ all -> 0x006d }
        L_0x006d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006f }
        L_0x006f:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)
            throw r0
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53612nN.A01(X.34x):void");
    }

    public C53612nN(C56922sm r1, C56982ss r2, C50012hU r3, C61142zm r4, C29431io r5, C72303dV r6, C55832qz r7) {
        C18260x0.A0f(r1, r2, r3, r7, r5);
        C18260x0.A0U(r4, r6);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A06 = r7;
        this.A04 = r5;
        this.A03 = r4;
        this.A05 = r6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0073, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0077, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007b, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C624134x r8) {
        /*
            r7 = this;
            X.2pu r3 = r8.A0t()
            r0 = 16
            boolean r0 = r8.A1r(r0)
            if (r0 == 0) goto L_0x007f
            if (r3 == 0) goto L_0x007f
            X.3dV r0 = r7.A05
            X.4Fq r4 = r0.A04()
            X.3Yo r5 = r4.Axl()     // Catch:{ all -> 0x0078 }
            android.content.ContentValues r6 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x0071 }
            X.C624134x.A0H(r6, r8)     // Catch:{ all -> 0x0071 }
            java.lang.String r2 = "chat_row_id"
            X.2z0 r0 = r8.A1J     // Catch:{ all -> 0x0071 }
            X.4uZ r1 = r0.A00     // Catch:{ all -> 0x0071 }
            r0 = 0
            if (r1 == 0) goto L_0x0032
            X.2sm r0 = r7.A00     // Catch:{ all -> 0x0071 }
            long r0 = r0.A07(r1)     // Catch:{ all -> 0x0071 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0071 }
        L_0x0032:
            r6.put(r2, r0)     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = "number_of_comments"
            int r0 = r3.A01()     // Catch:{ all -> 0x0071 }
            X.C18270x1.A0b(r6, r1, r0)     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = "last_comment_ts"
            boolean r2 = r3 instanceof X.C30221m6     // Catch:{ all -> 0x0071 }
            if (r2 == 0) goto L_0x0050
            r0 = r3
            X.1m6 r0 = (X.C30221m6) r0     // Catch:{ all -> 0x0071 }
            java.lang.Long r0 = r0.A02     // Catch:{ all -> 0x0071 }
        L_0x004a:
            r6.put(r1, r0)     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = "last_comment_message_row_id"
            goto L_0x0052
        L_0x0050:
            r0 = 0
            goto L_0x004a
        L_0x0052:
            if (r2 == 0) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            r0 = 0
            goto L_0x005b
        L_0x0057:
            X.1m6 r3 = (X.C30221m6) r3     // Catch:{ all -> 0x0071 }
            java.lang.Long r0 = r3.A01     // Catch:{ all -> 0x0071 }
        L_0x005b:
            X.2sg r3 = X.AnonymousClass3H0.A00(r6, r0, r4, r1)     // Catch:{ all -> 0x0071 }
            java.lang.String r2 = "message_comment_parent"
            r1 = 5
            java.lang.String r0 = "insertIntoCommentParentTable/INSERT_COMMENT_PARENT_MESSAGE_INFO"
            r3.A0C(r2, r0, r6, r1)     // Catch:{ all -> 0x0071 }
            r5.A00()     // Catch:{ all -> 0x0071 }
            r5.close()     // Catch:{ all -> 0x0078 }
            r4.close()
            return
        L_0x0071:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)     // Catch:{ all -> 0x0078 }
            throw r0     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x007a }
        L_0x007a:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)
            throw r0
        L_0x007f:
            java.lang.String r0 = "MessageCommentParentStore/insertCommentParentMessageData message does not contain comments"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53612nN.A00(X.34x):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r0.longValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C624134x r7, boolean r8) {
        /*
            r6 = this;
            boolean r0 = X.C624134x.A0g(r7)
            if (r0 == 0) goto L_0x0069
            X.2pu r0 = r7.A0t()
            if (r0 == 0) goto L_0x0069
            java.lang.Long r0 = r0.A03()
            if (r0 == 0) goto L_0x0069
            long r0 = r0.longValue()
            X.2qz r2 = r6.A06
            X.34x r3 = X.C55122pp.A00(r2, r0)
            if (r3 == 0) goto L_0x0069
            r1 = 16
            boolean r0 = r3.A1r(r1)
            if (r0 != 0) goto L_0x0030
            long r4 = r3.A1P
            long r0 = (long) r1
            long r4 = r4 | r0
            r3.A1P = r4
            r0 = -1
            r2.A07(r3, r0)
        L_0x0030:
            X.2pu r5 = r3.A0t()
            if (r5 != 0) goto L_0x0039
            r6.A01(r3)
        L_0x0039:
            if (r8 == 0) goto L_0x0071
            r1 = -1
        L_0x003c:
            X.2pu r0 = r3.A0t()
            if (r0 == 0) goto L_0x006a
            int r4 = r0.A01()
            int r4 = r4 + r1
        L_0x0047:
            java.lang.Long r2 = X.C624134x.A0A(r7)
            long r0 = r7.A0K
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            X.1m6 r0 = new X.1m6
            r0.<init>(r2, r1, r4)
            r3.A1N(r0)
            r6.A00(r3)
            X.2hU r0 = r6.A02
            android.os.Handler r1 = r0.A02
            r0 = 41
            if (r5 != 0) goto L_0x0066
            r0 = 40
        L_0x0066:
            X.C70093Zw.A00(r1, r6, r3, r0)
        L_0x0069:
            return
        L_0x006a:
            X.2zm r0 = r6.A03
            int r4 = r0.A00(r3)
            goto L_0x0047
        L_0x0071:
            r1 = 65536(0x10000, float:9.18355E-41)
            int r0 = r7.A0A
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1U(r0, r1)
            r1 = 1
            if (r0 == 0) goto L_0x003c
            r1 = 0
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53612nN.A02(X.34x, boolean):void");
    }
}
