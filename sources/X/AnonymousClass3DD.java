package X;

/* renamed from: X.3DD  reason: invalid class name */
public class AnonymousClass3DD implements AnonymousClass66U {
    public final C56612sH A00;
    public final C72303dV A01;
    public final AnonymousClass1VX A02;
    public final AnonymousClass4FV A03;

    /* JADX WARNING: Can't wrap try/catch for region: R(2:19|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0090, code lost:
        if (java.lang.Integer.parseInt(X.C622033z.A00(r8, "chat_hidden_column_update_version", java.lang.String.valueOf(0))) != 1) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r5.BEc().A00.beginTransaction();
        r8.A0H("CREATE INDEX IF NOT EXISTS chat_hidden_index ON chat (hidden)", "chat/createAsyncIndex/chat_hidden_index");
        r9 = X.AnonymousClass0x9.A06();
        r9.put("hidden", 0);
        r8.A05(r9, "chat", "hidden IS NULL", "DatabaseHelper/updateNullHidden/hidden", (java.lang.String[]) null);
        X.C622033z.A02(r8, "chat_hidden_column_update_version", "MessageDBAsync", 1);
        r5.BEc().A00.setTransactionSuccessful();
        r5.BEc().A00.endTransaction();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0092 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BMe() {
        /*
            r14 = this;
            java.lang.String r6 = "chat_hidden_column_update_version"
            X.3dV r2 = r14.A01
            r2.A05()
            java.io.File r1 = r2.A05
            java.lang.String r0 = "msgstore/open-existing-db/list "
            X.C627536m.A0F(r1, r0)
            long r0 = android.os.SystemClock.uptimeMillis()
            X.4Fq r7 = r2.A04()
            r2.A05()     // Catch:{ all -> 0x00eb }
            X.0xz r5 = r2.A04     // Catch:{ all -> 0x00eb }
            r2 = r7
            X.3H0 r2 = (X.AnonymousClass3H0) r2     // Catch:{ all -> 0x00eb }
            X.2sg r8 = r2.A03     // Catch:{ all -> 0x00eb }
            java.lang.String r3 = "chat_ready"
            r2 = 0
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ NumberFormatException -> 0x003a }
            java.lang.String r2 = X.C622033z.A00(r8, r3, r2)     // Catch:{ NumberFormatException -> 0x003a }
            int r3 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x003a }
            r2 = 2
            if (r3 != r2) goto L_0x003a
            java.lang.String r3 = "MessageDBAsync"
            java.lang.String r2 = "chat_list"
            X.C626235v.A03(r8, r3, r2)     // Catch:{ all -> 0x00eb }
        L_0x003a:
            X.1VX r4 = r14.A02     // Catch:{ all -> 0x00eb }
            java.lang.String r3 = "CREATE INDEX IF NOT EXISTS message_add_on_expiry_timestamp_index ON message_add_on (expiry_timestamp)"
            java.lang.String r2 = "MessageAddOnTable/createMessageAddOnTable/CREATE_MESSAGE_ADD_ON_EXPIRY_TIMESTAMP_INDEX"
            r8.A0H(r3, r2)     // Catch:{ all -> 0x00eb }
            r3 = 6136(0x17f8, float:8.598E-42)
            X.2vE r2 = X.C58422vE.A02     // Catch:{ all -> 0x00eb }
            boolean r2 = r4.A0Y(r2, r3)     // Catch:{ all -> 0x00eb }
            if (r2 == 0) goto L_0x0054
            java.lang.String r3 = "CREATE INDEX IF NOT EXISTS call_log_ts_index ON call_log (timestamp)"
            java.lang.String r2 = "CallLogTableCREATE_CALL_LOG_TS_INDEX"
            r8.A0H(r3, r2)     // Catch:{ all -> 0x00eb }
        L_0x0054:
            java.lang.String r3 = "CREATE INDEX IF NOT EXISTS message_chat_sort_id_index ON message (chat_row_id, sort_id)"
            java.lang.String r2 = "CREATE_MESSAGE_JID_SORT_ID_INDEX"
            r8.A0H(r3, r2)     // Catch:{ all -> 0x00eb }
            java.lang.String r3 = "CREATE INDEX IF NOT EXISTS message_starred_sort_id_index ON message (starred, sort_id)"
            java.lang.String r2 = "CREATE_MESSAGE_STARRED_SORT_ID_INDEX"
            r8.A0H(r3, r2)     // Catch:{ all -> 0x00eb }
            java.lang.String r3 = "InteractiveMessageTable"
            java.lang.String r2 = "message_row_id_index"
            X.C626235v.A02(r8, r3, r2)     // Catch:{ all -> 0x00eb }
            java.lang.String r3 = "CREATE INDEX IF NOT EXISTS message_ui_elements_message_row_id_index ON message_ui_elements (message_row_id)"
            java.lang.String r2 = "CREATE_MESSAGE_UI_ELEMENTS_MESSAGE_ROW_ID_INDEX"
            r8.A0H(r3, r2)     // Catch:{ all -> 0x00eb }
            java.lang.String r3 = "CREATE INDEX IF NOT EXISTS message_ui_elements_element_type_index ON message_ui_elements (element_type)"
            java.lang.String r2 = "CREATE_ESSAGE_UI_ELEMENTS_ELEMENT_TYPE_INDEX"
            r8.A0H(r3, r2)     // Catch:{ all -> 0x00eb }
            X.2vE r3 = X.C58422vE.A01     // Catch:{ all -> 0x00eb }
            r2 = 3910(0xf46, float:5.479E-42)
            boolean r2 = r4.A0Y(r3, r2)     // Catch:{ all -> 0x00eb }
            if (r2 == 0) goto L_0x00d2
            r4 = 0
            java.lang.String r2 = java.lang.String.valueOf(r4)     // Catch:{ NumberFormatException -> 0x0092 }
            java.lang.String r2 = X.C622033z.A00(r8, r6, r2)     // Catch:{ NumberFormatException -> 0x0092 }
            int r3 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x0092 }
            r2 = 1
            if (r3 == r2) goto L_0x00d2
        L_0x0092:
            X.2sg r2 = r5.BEc()     // Catch:{ all -> 0x00eb }
            android.database.sqlite.SQLiteDatabase r2 = r2.A00     // Catch:{ all -> 0x00eb }
            r2.beginTransaction()     // Catch:{ all -> 0x00eb }
            java.lang.String r3 = "CREATE INDEX IF NOT EXISTS chat_hidden_index ON chat (hidden)"
            java.lang.String r2 = "chat/createAsyncIndex/chat_hidden_index"
            r8.A0H(r3, r2)     // Catch:{ all -> 0x00eb }
            android.content.ContentValues r9 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x00eb }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x00eb }
            java.lang.String r2 = "hidden"
            r9.put(r2, r3)     // Catch:{ all -> 0x00eb }
            java.lang.String r10 = "chat"
            java.lang.String r11 = "hidden IS NULL"
            r13 = 0
            java.lang.String r12 = "DatabaseHelper/updateNullHidden/hidden"
            r8.A05(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x00eb }
            java.lang.String r4 = "MessageDBAsync"
            r2 = 1
            X.C622033z.A02(r8, r6, r4, r2)     // Catch:{ all -> 0x00eb }
            X.2sg r2 = r5.BEc()     // Catch:{ all -> 0x00eb }
            android.database.sqlite.SQLiteDatabase r2 = r2.A00     // Catch:{ all -> 0x00eb }
            r2.setTransactionSuccessful()     // Catch:{ all -> 0x00eb }
            X.2sg r2 = r5.BEc()     // Catch:{ all -> 0x00eb }
            android.database.sqlite.SQLiteDatabase r2 = r2.A00     // Catch:{ all -> 0x00eb }
            r2.endTransaction()     // Catch:{ all -> 0x00eb }
        L_0x00d2:
            r7.close()
            X.1Xz r4 = new X.1Xz
            r4.<init>()
            long r2 = android.os.SystemClock.uptimeMillis()
            X.C24591Xz.A00(r4, r2, r0)
            java.lang.String r0 = "MessageDBAsync/onAsyncInitUserRegisteredAndDbReady"
            r4.A02 = r0
            X.4FV r0 = r14.A03
            r0.BhD(r4)
            return
        L_0x00eb:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x00f0 }
            throw r1
        L_0x00f0:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3DD.BMe():void");
    }

    public AnonymousClass3DD(C56612sH r1, C72303dV r2, AnonymousClass1VX r3, AnonymousClass4FV r4) {
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
    }

    public String BDW() {
        return "MessageDBAsync";
    }

    public /* synthetic */ void BMd() {
    }
}
