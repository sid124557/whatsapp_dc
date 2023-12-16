package X;

import java.util.Locale;

/* renamed from: X.3Kp  reason: invalid class name and case insensitive filesystem */
public class C66243Kp implements AnonymousClass4ED {
    public static final String A02(String str, String str2, String str3, String str4) {
        String format = String.format("DELETE FROM backup_changes WHERE (table_name = '%s') AND (table_row_id = %s) AND ((operation = 'INSERT') OR (operation = 'UPDATE'));", new Object[]{str3, str4});
        String format2 = String.format(" INSERT INTO backup_changes(operation, table_name, table_row_id ) VALUES('%s', '%s', %s); ", new Object[]{str2, str3, str4});
        Locale locale = Locale.US;
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass001.A1K("CREATE TRIGGER IF NOT EXISTS %s AFTER %s ON %s BEGIN ", format, format2, A0o);
        return String.format(locale, AnonymousClass000.A0X(" END", A0o), new Object[]{str, str2, str3});
    }

    public static final String A01(String str, String str2, String str3) {
        String format = String.format("DELETE FROM backup_changes WHERE (table_name = '%s') AND (table_row_id = %s) AND ((operation = 'INSERT') OR (operation = 'UPDATE'));", new Object[]{"message", str3});
        String format2 = String.format(" INSERT INTO backup_changes(operation, table_name, table_row_id ) VALUES('%s', '%s', %s); ", new Object[]{str2, "message", str3});
        Locale locale = Locale.US;
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass001.A1K("CREATE TRIGGER IF NOT EXISTS %s AFTER %s ON %s BEGIN ", format, format2, A0o);
        return String.format(locale, AnonymousClass000.A0X(" END", A0o), new Object[]{str, str2, "message_add_on"});
    }

    public final void A03(C56622sI r5, String str, String str2) {
        String A00 = A00("INSERT", str);
        r5.A0C(A00, A02(A00, "INSERT", str, AnonymousClass000.A0V("NEW.", str2, AnonymousClass001.A0o())));
        String A002 = A00("UPDATE", str);
        r5.A0C(A002, A02(A002, "UPDATE", str, AnonymousClass000.A0T("NEW.", str2)));
        String A003 = A00("DELETE", str);
        r5.A0C(A003, A02(A003, "DELETE", str, AnonymousClass000.A0V("OLD.", str2, AnonymousClass001.A0o())));
    }

    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("backup_changes_operation_index", "CREATE INDEX IF NOT EXISTS backup_changes_operation_index ON backup_changes (operation, table_name, table_row_id)");
    }

    public /* synthetic */ void B3l(C56862sg r8, C41492Kl r9, C56622sI r10) {
        if (r9.A00) {
            A03(r10, "message", "_id");
            String A00 = A00("INSERT", "message_add_on");
            r10.A0C(A00, A01(A00, "INSERT", AnonymousClass000.A0V("NEW.", "parent_message_row_id", AnonymousClass001.A0o())));
            String A002 = A00("UPDATE", "message_add_on");
            r10.A0C(A002, A01(A002, "UPDATE", AnonymousClass000.A0T("NEW.", "parent_message_row_id")));
            String A003 = A00("DELETE", "message_add_on");
            r10.A0C(A003, A01(A003, "DELETE", AnonymousClass000.A0V("OLD.", "parent_message_row_id", AnonymousClass001.A0o())));
            A03(r10, "receipt_user", "_id");
            A03(r10, "receipt_device", "_id");
            A03(r10, "message_add_on_receipt_device", "receipt_device_id");
            A03(r10, "receipt_orphaned", "_id");
            A03(r10, "played_self_receipt", "message_row_id");
            A03(r10, "jid", "_id");
            A03(r10, "chat", "_id");
            A03(r10, "community_chat", "chat_row_id");
            A03(r10, "parent_group_participants", "rowid");
            A03(r10, "props", "_id");
            A03(r10, "user_device", "_id");
            A03(r10, "user_device_info", "user_jid_row_id");
            A03(r10, "group_notification_version", "group_jid_row_id");
            A03(r10, "group_participant_device", "_id");
            A03(r10, "group_participant_user", "_id");
            A03(r10, "group_past_participant_user", "_id");
            A03(r10, "frequent", "_id");
            A03(r10, "lid_chat_state", "jid_row_id");
            A03(r10, "lid_display_name", "lid_row_id");
            A03(r10, "call_log", "_id");
            A03(r10, "call_link", "_id");
            A03(r10, "call_log_participant_v2", "_id");
            A03(r10, "joinable_call_log", "call_log_row_id");
            A03(r10, "primary_device_version", "user_jid_row_id");
            A03(r10, "payment_background", "rowid");
            A03(r10, "payment_background_order", "rowid");
            A03(r10, "pay_transaction", "_id");
            A03(r10, "media_refs", "_id");
            A03(r10, "agent_chat_assignment", "jid_row_id");
            A03(r10, "agent_devices", "rowid");
            A03(r10, "agent_message_attribution", "message_row_id");
            A03(r10, "away_messages", "_id");
            A03(r10, "conversion_tuples", "jid_row_id");
            A03(r10, "keywords", "_id");
            A03(r10, "quick_replies", "_id");
            A03(r10, "quick_reply_attachments", "_id");
            A03(r10, "quick_reply_keywords", "_id");
            A03(r10, "quick_reply_usage", "_id");
        }
    }

    public static final String A00(String str, String str2) {
        Object[] A1X = AnonymousClass0x9.A1X();
        AnonymousClass000.A16(str2, str, A1X);
        A1X[2] = "backup_changes";
        return String.format("%s_%s_for_%s_trigger", A1X).toLowerCase(Locale.getDefault());
    }

    public void B3j(C41492Kl r7, C56622sI r8) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] A0s = C54912pU.A0s(A00);
        AnonymousClass220 r3 = AnonymousClass220.INTEGER;
        boolean A0m = C54912pU.A0m(A00, r3, A0s);
        A00.A02 = "operation";
        AnonymousClass220 r1 = AnonymousClass220.TEXT;
        C54912pU.A0c(A00, r1, A0s, A0m);
        C54912pU.A0W(A00, r1, "table_name", A0s, A0m);
        C54912pU.A0X(A00, r3, "table_row_id", A0s, A0m);
        r8.A0E("backup_changes", A0s);
    }
}
