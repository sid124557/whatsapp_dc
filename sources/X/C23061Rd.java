package X;

/* renamed from: X.1Rd  reason: invalid class name and case insensitive filesystem */
public class C23061Rd extends AnonymousClass31D {
    public final C56922sm A00;

    /* JADX WARNING: Code restructure failed: missing block: B:143:0x031e, code lost:
        if (r9 == null) goto L_0x0328;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x01d6, code lost:
        if (r0 == 0) goto L_0x01d8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0T(X.C44342Vr r45) {
        /*
            r44 = this;
            r2 = r44
            X.2qk r1 = r2.A01
            r7 = 0
            r6 = 0
            java.lang.String r0 = "chat-store-migration-pending"
            r1.A0A(r0, r6, r7)
            X.2sm r5 = r2.A00
            java.lang.String r34 = "ephemeral_setting_timestamp"
            java.lang.String r33 = "ephemeral_expiration"
            java.lang.String r32 = "show_group_description"
            java.lang.String r31 = "vcard_ui_dismissed"
            java.lang.String r30 = "plaintext_disabled"
            java.lang.String r29 = "unseen_row_count"
            java.lang.String r28 = "unseen_missed_calls_count"
            java.lang.String r27 = "unseen_message_count"
            java.lang.String r26 = "unseen_earliest_message_received_time"
            java.lang.String r25 = "gen"
            java.lang.String r24 = "sort_timestamp"
            java.lang.String r23 = "archived"
            java.lang.String r14 = "subject"
            X.3dV r0 = r5.A06
            r43 = r0
            r43.A05()
            java.io.File r0 = r0.A05
            r42 = r0
            long r11 = r42.length()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ChatStore/populateChatTable/start/db size="
            X.C18260x0.A12(r0, r1, r11)
            java.lang.String r0 = "ChatStore/populate"
            X.33M r22 = X.AnonymousClass33M.A01(r0)
            X.4Fq r21 = r43.A04()     // Catch:{ SQLiteException -> 0x0343 }
            X.3Yo r20 = r21.Axl()     // Catch:{ all -> 0x0339 }
            X.2rO r0 = r5.A07     // Catch:{ all -> 0x032f }
            r41 = r0
            java.lang.String r19 = "chat_ready"
            r1 = r0
            r0 = r19
            java.lang.String r0 = r1.A01(r0)     // Catch:{ all -> 0x032f }
            if (r0 == 0) goto L_0x0079
            int r1 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x032f }
            r0 = 1
            if (r1 != r0) goto L_0x0079
            r0 = r21
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x032f }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x032f }
            java.lang.String r1 = "DELETE FROM chat_list WHERE  message_table_id=0  AND last_read_message_table_id=0  AND sort_timestamp=0  AND my_messages=0  AND plaintext_disabled=0  AND key_remote_jid NOT LIKE '%@g.us' AND key_remote_jid NOT LIKE '%@temp'"
            java.lang.String r0 = "DELETE_FROM_CHAT_LIST_WHEN_DB_PROP_CHAT_READY_IS_1"
            r2.A0H(r1, r0)     // Catch:{ all -> 0x032f }
        L_0x0079:
            monitor-enter(r5)     // Catch:{ all -> 0x032f }
            java.util.Map r0 = r5.A0A     // Catch:{ all -> 0x0329 }
            r0.clear()     // Catch:{ all -> 0x0329 }
            java.util.Map r0 = r5.A0B     // Catch:{ all -> 0x0329 }
            r0.clear()     // Catch:{ all -> 0x0329 }
            monitor-exit(r5)     // Catch:{ all -> 0x0329 }
            r0 = r21
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x032f }
            X.2sg r4 = r0.A03     // Catch:{ all -> 0x032f }
            java.lang.String r1 = X.C39092Aq.A00     // Catch:{ all -> 0x032f }
            java.lang.String r0 = "populateChatTable/QUERY_CHAT_LIST"
            android.database.Cursor r9 = r4.A0E(r1, r0, r7)     // Catch:{ all -> 0x032f }
            java.lang.String r0 = "key_remote_jid"
            int r13 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x031d }
        L_0x009a:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x031d }
            if (r0 == 0) goto L_0x01ee
            X.4uZ r8 = X.AnonymousClass0x2.A0K(r9, r13)     // Catch:{ all -> 0x01eb }
            if (r8 != 0) goto L_0x00b7
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01eb }
            java.lang.String r0 = "ChatStore/populateChatTable/could not parse raw chat jid: "
            r1.append(r0)     // Catch:{ all -> 0x01eb }
            java.lang.String r0 = r9.getString(r13)     // Catch:{ all -> 0x01eb }
            X.C18260x0.A1M(r1, r0)     // Catch:{ all -> 0x01eb }
            goto L_0x009a
        L_0x00b7:
            X.34p r0 = r5.A04     // Catch:{ all -> 0x01eb }
            long r2 = r0.A05(r8)     // Catch:{ all -> 0x01eb }
            android.content.ContentValues r10 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x01eb }
            java.lang.String r0 = "jid_row_id"
            X.C18270x1.A0c(r10, r0, r2)     // Catch:{ all -> 0x01eb }
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r9, r14)     // Catch:{ all -> 0x01eb }
            r10.put(r14, r0)     // Catch:{ all -> 0x01eb }
            java.lang.String r1 = "created_timestamp"
            java.lang.String r0 = "creation"
            int r0 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01eb }
            X.AnonymousClass31D.A06(r10, r9, r1, r0)     // Catch:{ all -> 0x01eb }
            java.lang.String r1 = "display_message_row_id"
            java.lang.String r0 = "message_table_id"
            int r0 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01eb }
            X.AnonymousClass31D.A06(r10, r9, r1, r0)     // Catch:{ all -> 0x01eb }
            java.lang.String r1 = "last_message_row_id"
            java.lang.String r0 = "last_message_table_id"
            int r0 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01eb }
            X.AnonymousClass31D.A06(r10, r9, r1, r0)     // Catch:{ all -> 0x01eb }
            java.lang.String r1 = "last_read_message_row_id"
            java.lang.String r0 = "last_read_message_table_id"
            int r0 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01eb }
            X.AnonymousClass31D.A06(r10, r9, r1, r0)     // Catch:{ all -> 0x01eb }
            java.lang.String r1 = "last_read_receipt_sent_message_row_id"
            java.lang.String r0 = "last_read_receipt_sent_message_table_id"
            int r0 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01eb }
            X.AnonymousClass31D.A06(r10, r9, r1, r0)     // Catch:{ all -> 0x01eb }
            java.lang.String r1 = "last_important_message_row_id"
            java.lang.String r0 = "last_important_message_table_id"
            int r0 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01eb }
            X.AnonymousClass31D.A06(r10, r9, r1, r0)     // Catch:{ all -> 0x01eb }
            r0 = r23
            int r1 = X.AnonymousClass0x2.A04(r9, r0)     // Catch:{ all -> 0x01eb }
            X.C18270x1.A0b(r10, r0, r1)     // Catch:{ all -> 0x01eb }
            r0 = r24
            int r1 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01eb }
            X.AnonymousClass31D.A06(r10, r9, r0, r1)     // Catch:{ all -> 0x01eb }
            r0 = r25
            double r0 = X.C18310x6.A00(r9, r0)     // Catch:{ all -> 0x01eb }
            r15 = r25
            X.C18300x5.A12(r10, r15, r0)     // Catch:{ all -> 0x01eb }
            java.lang.String r1 = "spam_detection"
            java.lang.String r0 = "my_messages"
            int r0 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01eb }
            X.AnonymousClass31D.A06(r10, r9, r1, r0)     // Catch:{ all -> 0x01eb }
            r0 = r26
            int r1 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01eb }
            X.AnonymousClass31D.A06(r10, r9, r0, r1)     // Catch:{ all -> 0x01eb }
            r0 = r27
            int r1 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01eb }
            X.AnonymousClass31D.A06(r10, r9, r0, r1)     // Catch:{ all -> 0x01eb }
            r0 = r28
            int r1 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01eb }
            X.AnonymousClass31D.A06(r10, r9, r0, r1)     // Catch:{ all -> 0x01eb }
            r0 = r29
            int r1 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01eb }
            X.AnonymousClass31D.A06(r10, r9, r0, r1)     // Catch:{ all -> 0x01eb }
            r0 = r30
            int r1 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01eb }
            X.AnonymousClass31D.A06(r10, r9, r0, r1)     // Catch:{ all -> 0x01eb }
            r0 = r31
            int r1 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01eb }
            X.AnonymousClass31D.A06(r10, r9, r0, r1)     // Catch:{ all -> 0x01eb }
            java.lang.String r1 = "change_number_notified_message_row_id"
            java.lang.String r0 = "change_number_notified_message_id"
            int r0 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01eb }
            X.AnonymousClass31D.A06(r10, r9, r1, r0)     // Catch:{ all -> 0x01eb }
            r0 = r32
            int r1 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01eb }
            X.AnonymousClass31D.A06(r10, r9, r0, r1)     // Catch:{ all -> 0x01eb }
            r0 = r33
            int r1 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01eb }
            X.AnonymousClass31D.A06(r10, r9, r0, r1)     // Catch:{ all -> 0x01eb }
            r0 = r34
            int r1 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01eb }
            X.AnonymousClass31D.A06(r10, r9, r0, r1)     // Catch:{ all -> 0x01eb }
            java.lang.String r0 = "hidden"
            X.C18270x1.A0b(r10, r0, r6)     // Catch:{ all -> 0x01eb }
            java.lang.String r15 = "chat"
            java.lang.String r38 = "jid_row_id = ?"
            java.lang.String[] r0 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x01eb }
            X.C18280x3.A1R(r0, r6, r2)     // Catch:{ all -> 0x01eb }
            java.lang.String r39 = "populateChatTable/UPDATE_CHAT"
            r35 = r4
            r36 = r10
            r37 = r15
            r40 = r0
            int r0 = r35.A05(r36, r37, r38, r39, r40)     // Catch:{ all -> 0x01eb }
            long r0 = (long) r0     // Catch:{ all -> 0x01eb }
            r17 = 0
            int r2 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r2 != 0) goto L_0x01d8
            java.lang.String r1 = "populateChatTable/INSERT_CHAT"
            long r0 = r4.A08(r15, r1, r10)     // Catch:{ all -> 0x01eb }
            r15 = -1
            int r2 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r2 != 0) goto L_0x01d4
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01eb }
            java.lang.String r0 = "ChatStore/populateChatTable/error insert chat;jid="
            X.C18260x0.A1Q(r1, r0, r8)     // Catch:{ all -> 0x01eb }
            goto L_0x009a
        L_0x01d4:
            int r2 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r2 != 0) goto L_0x01dc
        L_0x01d8:
            long r0 = r5.A09(r8)     // Catch:{ all -> 0x01eb }
        L_0x01dc:
            X.2ss r2 = r5.A02     // Catch:{ all -> 0x01eb }
            X.31A r2 = r2.A0A(r8, r6)     // Catch:{ all -> 0x01eb }
            if (r2 == 0) goto L_0x009a
            r2.A0W = r0     // Catch:{ all -> 0x01eb }
            r5.A0M(r8, r0)     // Catch:{ all -> 0x01eb }
            goto L_0x009a
        L_0x01eb:
            r1 = move-exception
            goto L_0x0320
        L_0x01ee:
            r9.close()     // Catch:{ all -> 0x032f }
            java.lang.String r1 = "SELECT DISTINCT key_remote_jid FROM messages LEFT JOIN (SELECT raw_string FROM jid AS jid JOIN chat AS chat ON jid._id = chat.jid_row_id) ON key_remote_jid = raw_string WHERE raw_string IS NULL"
            java.lang.String r0 = "GET_HIDDEN_CHATS"
            android.database.Cursor r3 = r4.A0E(r1, r0, r7)     // Catch:{ SQLiteBlobTooBigException -> 0x0227 }
        L_0x01f9:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x021b }
            if (r0 == 0) goto L_0x0217
            java.lang.String r0 = X.C626135u.A01(r3, r6)     // Catch:{ all -> 0x021b }
            X.4uZ r2 = X.C18310x6.A0S(r0)     // Catch:{ all -> 0x021b }
            if (r2 != 0) goto L_0x020f
            java.lang.String r0 = "ChatStore/populateChatTable/jid is null or invalid!"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x021b }
            goto L_0x01f9
        L_0x020f:
            long r0 = r5.A0A(r2)     // Catch:{ all -> 0x021b }
            r5.A0M(r2, r0)     // Catch:{ all -> 0x021b }
            goto L_0x01f9
        L_0x0217:
            r3.close()     // Catch:{ SQLiteBlobTooBigException -> 0x0227 }
            goto L_0x0296
        L_0x021b:
            r1 = move-exception
            if (r3 == 0) goto L_0x0226
            r3.close()     // Catch:{ all -> 0x0222 }
            goto L_0x0226
        L_0x0222:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteBlobTooBigException -> 0x0227 }
        L_0x0226:
            throw r1     // Catch:{ SQLiteBlobTooBigException -> 0x0227 }
        L_0x0227:
            java.lang.String r1 = "GET_DISTINCT_JID_FROM_MESSAGES_SQL"
            java.lang.String r0 = "SELECT DISTINCT key_remote_jid FROM messages"
            android.database.Cursor r3 = r4.A0E(r0, r1, r7)     // Catch:{ all -> 0x032f }
        L_0x022f:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0311 }
            if (r0 == 0) goto L_0x0293
            java.lang.String r0 = X.C626135u.A01(r3, r6)     // Catch:{ all -> 0x0311 }
            X.4uZ r9 = X.C18310x6.A0S(r0)     // Catch:{ all -> 0x0311 }
            if (r9 != 0) goto L_0x0245
            java.lang.String r0 = "ChatStore/alternativeInsertAllHiddenChats/jid is null or invalid!"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0311 }
            goto L_0x022f
        L_0x0245:
            X.34p r0 = r5.A04     // Catch:{ all -> 0x0311 }
            long r0 = r0.A05(r9)     // Catch:{ all -> 0x0311 }
            r7 = -1
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x025b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0311 }
            java.lang.String r0 = "ChatStore/alternativeInsertAllHiddenChats/jid row id not found; jid="
            X.C18260x0.A1Q(r1, r0, r9)     // Catch:{ all -> 0x0311 }
            goto L_0x022f
        L_0x025b:
            java.lang.String r7 = "SELECT COUNT(1) as count FROM chat WHERE jid_row_id = ?"
            java.lang.String[] r2 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x0311 }
            X.AnonymousClass0x2.A1S(r2, r6, r0)     // Catch:{ all -> 0x0311 }
            java.lang.String r0 = "ALTERNATIVE_HIDDEN_JID"
            android.database.Cursor r10 = r4.A0E(r7, r0, r2)     // Catch:{ all -> 0x0311 }
            boolean r0 = r10.moveToNext()     // Catch:{ all -> 0x0287 }
            if (r0 == 0) goto L_0x0283
            java.lang.String r0 = "count"
            long r7 = X.AnonymousClass0x2.A0C(r10, r0)     // Catch:{ all -> 0x0287 }
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0283
            long r0 = r5.A0A(r9)     // Catch:{ all -> 0x0287 }
            r5.A0M(r9, r0)     // Catch:{ all -> 0x0287 }
        L_0x0283:
            r10.close()     // Catch:{ all -> 0x0311 }
            goto L_0x022f
        L_0x0287:
            r1 = move-exception
            if (r10 == 0) goto L_0x0292
            r10.close()     // Catch:{ all -> 0x028e }
            goto L_0x0292
        L_0x028e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0311 }
        L_0x0292:
            throw r1     // Catch:{ all -> 0x0311 }
        L_0x0293:
            r3.close()     // Catch:{ all -> 0x032f }
        L_0x0296:
            java.lang.String r0 = "ChatStore/drop view"
            X.33M r4 = X.AnonymousClass33M.A01(r0)     // Catch:{ all -> 0x032f }
            X.4Fq r3 = r43.A04()     // Catch:{ all -> 0x032f }
            r0 = r3
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x030c }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x030c }
            java.lang.String r1 = "DROP VIEW IF EXISTS chat_view"
            java.lang.String r0 = "DROP_CHAT_VIEW"
            r2.A0H(r1, r0)     // Catch:{ all -> 0x030c }
            java.lang.StringBuilder r1 = X.C18280x3.A0f(r3)     // Catch:{ all -> 0x032f }
            java.lang.String r0 = "ChatChatStore/drop view time spent:"
            X.AnonymousClass33M.A05(r4, r0, r1)     // Catch:{ all -> 0x032f }
            monitor-enter(r5)     // Catch:{ all -> 0x032f }
            X.4Fq r6 = r43.A04()     // Catch:{ all -> 0x032c }
            r43.A05()     // Catch:{ all -> 0x0302 }
            java.lang.String r0 = "databasehelper/createChatView"
            X.33M r4 = X.AnonymousClass33M.A01(r0)     // Catch:{ all -> 0x0302 }
            X.3Yo r3 = r6.Axl()     // Catch:{ all -> 0x0302 }
            r0 = r6
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x02f8 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x02f8 }
            java.lang.String r1 = "CREATE VIEW chat_view AS SELECT chat._id AS _id, jid.raw_string AS raw_string_jid, hidden AS hidden, subject AS subject, created_timestamp AS created_timestamp, display_message_row_id AS display_message_row_id, last_message_row_id AS last_message_row_id, last_read_message_row_id AS last_read_message_row_id, last_read_receipt_sent_message_row_id AS last_read_receipt_sent_message_row_id, last_important_message_row_id AS last_important_message_row_id, archived AS archived, sort_timestamp AS sort_timestamp, mod_tag AS mod_tag, gen AS gen, spam_detection AS spam_detection, unseen_earliest_message_received_time AS unseen_earliest_message_received_time, unseen_message_count AS unseen_message_count, unseen_missed_calls_count AS unseen_missed_calls_count, unseen_row_count AS unseen_row_count, unseen_message_reaction_count AS unseen_message_reaction_count, unseen_comment_message_count AS unseen_comment_message_count, last_message_reaction_row_id AS last_message_reaction_row_id, last_seen_message_reaction_row_id AS last_seen_message_reaction_row_id, plaintext_disabled AS plaintext_disabled, vcard_ui_dismissed AS vcard_ui_dismissed, change_number_notified_message_row_id AS change_number_notified_message_row_id, show_group_description AS show_group_description, ephemeral_expiration AS ephemeral_expiration, last_read_ephemeral_message_row_id AS last_read_ephemeral_message_row_id, ephemeral_setting_timestamp AS ephemeral_setting_timestamp, ephemeral_displayed_exemptions AS ephemeral_displayed_exemptions, ephemeral_disappearing_messages_initiator AS ephemeral_disappearing_messages_initiator, unseen_important_message_count AS unseen_important_message_count, group_type AS group_type, growth_lock_level AS growth_lock_level, growth_lock_expiration_ts AS growth_lock_expiration_ts, last_read_message_sort_id AS last_read_message_sort_id, display_message_sort_id AS display_message_sort_id, last_message_sort_id AS last_message_sort_id, last_read_receipt_sent_message_sort_id AS last_read_receipt_sent_message_sort_id, has_new_community_admin_dialog_been_acknowledged AS has_new_community_admin_dialog_been_acknowledged, history_sync_progress AS history_sync_progress, chat_lock AS chat_lock, chat_origin AS chat_origin FROM chat chat LEFT JOIN jid jid ON chat.jid_row_id = jid._id"
            java.lang.String r0 = "CREATE_CHAT_VIEW_FROM_CHAT_TABLE"
            r2.A0H(r1, r0)     // Catch:{ all -> 0x02f8 }
            r3.A00()     // Catch:{ all -> 0x02f8 }
            r3.close()     // Catch:{ all -> 0x0302 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0302 }
            java.lang.String r0 = "databasehelper/createChatView time spent:"
            X.AnonymousClass33M.A05(r4, r0, r1)     // Catch:{ all -> 0x0302 }
            r6.close()     // Catch:{ all -> 0x032c }
            monitor-exit(r5)     // Catch:{ all -> 0x032f }
            r2 = 2
            r1 = r41
            r0 = r19
            r1.A03(r0, r2)     // Catch:{ all -> 0x032f }
            r20.A00()     // Catch:{ all -> 0x032f }
            r20.close()     // Catch:{ all -> 0x0339 }
            r21.close()     // Catch:{ SQLiteException -> 0x0343 }
            goto L_0x0353
        L_0x02f8:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x02fd }
            goto L_0x0301
        L_0x02fd:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0302 }
        L_0x0301:
            throw r1     // Catch:{ all -> 0x0302 }
        L_0x0302:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0307 }
            goto L_0x030b
        L_0x0307:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x032c }
        L_0x030b:
            throw r1     // Catch:{ all -> 0x032c }
        L_0x030c:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0318 }
            goto L_0x0328
        L_0x0311:
            r1 = move-exception
            if (r3 == 0) goto L_0x0328
            r3.close()     // Catch:{ all -> 0x0318 }
            goto L_0x0328
        L_0x0318:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x032f }
            goto L_0x0328
        L_0x031d:
            r1 = move-exception
            if (r9 == 0) goto L_0x0328
        L_0x0320:
            r9.close()     // Catch:{ all -> 0x0324 }
            goto L_0x0328
        L_0x0324:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x032f }
        L_0x0328:
            throw r1     // Catch:{ all -> 0x032f }
        L_0x0329:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0329 }
            goto L_0x032e
        L_0x032c:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x032f }
        L_0x032e:
            throw r0     // Catch:{ all -> 0x032f }
        L_0x032f:
            r1 = move-exception
            r20.close()     // Catch:{ all -> 0x0334 }
            goto L_0x0338
        L_0x0334:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0339 }
        L_0x0338:
            throw r1     // Catch:{ all -> 0x0339 }
        L_0x0339:
            r1 = move-exception
            r21.close()     // Catch:{ all -> 0x033e }
            goto L_0x0342
        L_0x033e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteException -> 0x0343 }
        L_0x0342:
            throw r1     // Catch:{ SQLiteException -> 0x0343 }
        L_0x0343:
            r1 = move-exception
            java.lang.String r0 = "ChatStore/populateChatTable/Error populating chat table"
            com.whatsapp.util.Log.e(r0, r1)
            X.2qk r3 = r5.A00
            java.lang.String r2 = "ChatStore/populateChatTable"
            java.lang.String r1 = "ChatStore/populateChatTable/error"
            r0 = 1
            r3.A0A(r2, r0, r1)
        L_0x0353:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "ChatStore/populateChatTable/time spent="
            r0 = r22
            X.AnonymousClass33M.A05(r0, r1, r2)
            r43.A05()
            long r4 = r42.length()
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ChatStore/populateChatTable/end/db size="
            r6.append(r0)
            r6.append(r4)
            java.lang.String r0 = "; increase="
            r6.append(r0)
            double r2 = (double) r4
            double r0 = (double) r11
            double r2 = r2 / r0
            r6.append(r2)
            X.C18280x3.A14(r6)
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23061Rd.A0T(X.2Vr):boolean");
    }

    public C23061Rd(C56922sm r3, AnonymousClass2U4 r4) {
        super(r4, "migration_chat_store", Integer.MIN_VALUE);
        C626936e.A06(r3);
        this.A00 = r3;
    }
}
