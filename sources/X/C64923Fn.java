package X;

/* renamed from: X.3Fn  reason: invalid class name and case insensitive filesystem */
public final class C64923Fn implements AnonymousClass664 {
    public final AnonymousClass1RF A00;
    public final AnonymousClass2G0 A01;
    public final AnonymousClass4FV A02;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0060, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0064, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BQV() {
        /*
            r7 = this;
            X.1RF r4 = r7.A00     // Catch:{ SQLiteException -> 0x0065 }
            X.4GK r3 = r4.get()     // Catch:{ SQLiteException -> 0x0065 }
            X.2G0 r6 = r7.A01     // Catch:{ all -> 0x005e }
            X.C162457s7.A0H(r3)     // Catch:{ all -> 0x005e }
            r5 = 0
            r0 = r3
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ Exception -> 0x0041 }
            X.2sg r2 = r0.A03     // Catch:{ Exception -> 0x0041 }
            java.lang.String r1 = "\n          SELECT\n            comment_parent_group_id, \n            comment_space_id, \n            comments, \n            comment_deletes, \n            accumulated_comments, \n            group_size_bucket,\n            cag_message_sent_ds \n          FROM comments_event_logging\n        "
            java.lang.String r0 = "get_comment_action_counts"
            android.database.Cursor r5 = X.C56862sg.A02(r2, r1, r0, r5)     // Catch:{ Exception -> 0x0041 }
            r1 = 0
            X.4IG r0 = new X.4IG     // Catch:{ Exception -> 0x0041 }
            r0.<init>(r6, r1)     // Catch:{ Exception -> 0x0041 }
            X.3cu r2 = new X.3cu     // Catch:{ Exception -> 0x0041 }
            r2.<init>(r5, r0)     // Catch:{ Exception -> 0x0041 }
        L_0x0024:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0036
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x003a }
            X.1a6 r1 = (X.C25181a6) r1     // Catch:{ all -> 0x003a }
            X.4FV r0 = r7.A02     // Catch:{ all -> 0x003a }
            r0.BhA(r1)     // Catch:{ all -> 0x003a }
            goto L_0x0024
        L_0x0036:
            r2.close()     // Catch:{ all -> 0x005e }
            goto L_0x004b
        L_0x003a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003c }
        L_0x003c:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ all -> 0x005e }
            throw r0     // Catch:{ all -> 0x005e }
        L_0x0041:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x005e }
            java.lang.String r0 = "CommentDailyActionLoggingStore/getWamCommentsDailyStats: "
            X.C18260x0.A16(r0, r1, r2)     // Catch:{ all -> 0x005e }
        L_0x004b:
            r3.close()     // Catch:{ SQLiteException -> 0x0065 }
            X.2sg r0 = r4.BEc()
            android.database.sqlite.SQLiteDatabase r3 = r0.A00
            java.lang.String r2 = "DROP TABLE IF EXISTS comments_event_logging"
            java.lang.String r1 = "CREATE TABLE comments_event_logging (comment_space_id TEXT PRIMARY KEY, comment_parent_group_id TEXT NOT NULL, comments INTEGER NOT NULL DEFAULT 0, comment_deletes INTEGER NOT NULL DEFAULT 0, accumulated_comments INTEGER NOT NULL DEFAULT 0, group_size_bucket INTEGER NOT NULL DEFAULT 0, cag_message_sent_ds INTEGER NOT NULL DEFAULT 0)"
            java.lang.String r0 = "comments_event_logging"
            r4.A0H(r3, r0, r2, r1)
            return
        L_0x005e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0060 }
        L_0x0060:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)     // Catch:{ SQLiteException -> 0x0065 }
            throw r0     // Catch:{ SQLiteException -> 0x0065 }
        L_0x0065:
            r1 = move-exception
            java.lang.String r0 = "CommentsDailyEventLoggerDailyCron/failed to send comments daily actions"
            com.whatsapp.util.Log.e(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64923Fn.BQV():void");
    }

    public C64923Fn(AnonymousClass1RF r1, AnonymousClass2G0 r2, AnonymousClass4FV r3) {
        C18260x0.A0V(r3, r1, r2);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public String BDW() {
        return "CommentsDailyEventLoggerDailyCron";
    }
}
