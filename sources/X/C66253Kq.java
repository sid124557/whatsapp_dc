package X;

import java.util.Collections;

@Deprecated
/* renamed from: X.3Kq  reason: invalid class name and case insensitive filesystem */
public class C66253Kq implements AnonymousClass4ED, C838049v {
    public void B17(C56862sg r10, C41492Kl r11) {
        int i;
        try {
            i = Integer.parseInt(C622033z.A00(r10, "chat_ready", String.valueOf(0)));
        } catch (NumberFormatException unused) {
            i = 0;
        }
        if (i != 2) {
            C54912pU A00 = C54912pU.A00();
            C59422wt[] r2 = new C59422wt[25];
            AnonymousClass220 A01 = AnonymousClass220.A01(A00);
            boolean A0l = C54912pU.A0l(A00, A01, r2);
            A00.A02 = "key_remote_jid";
            AnonymousClass220 r1 = AnonymousClass220.TEXT;
            C54912pU.A0d(A00, r1, r2, A0l);
            C54912pU.A0U(A00, A01, "message_table_id", r2, 2);
            C54912pU.A0B(A00, r1, "subject", r2);
            C54912pU.A0C(A00, A01, "creation", r2);
            C54912pU.A0D(A00, A01, "last_read_message_table_id", r2);
            C54912pU.A0E(A00, A01, "last_read_receipt_sent_message_table_id", r2);
            C54912pU.A0F(A00, A01, "archived", r2);
            C54912pU.A0G(A00, A01, "sort_timestamp", r2);
            C54912pU.A0H(A00, A01, "mod_tag", r2);
            A00.A02 = "gen";
            r2[10] = C54912pU.A02(A00, AnonymousClass220.REAL);
            C54912pU.A0J(A00, A01, "my_messages", r2);
            A00.A02 = "plaintext_disabled";
            r2[12] = C54912pU.A02(A00, AnonymousClass220.BOOLEAN);
            C54912pU.A0L(A00, A01, "last_message_table_id", r2);
            C54912pU.A0M(A00, A01, "unseen_earliest_message_received_time", r2);
            C54912pU.A0N(A00, A01, "unseen_message_count", r2);
            C54912pU.A0O(A00, A01, "unseen_missed_calls_count", r2);
            C54912pU.A0P(A00, A01, "unseen_row_count", r2);
            C54912pU.A0Q(A00, A01, "vcard_ui_dismissed", r2);
            C54912pU.A0R(A00, A01, "change_number_notified_message_id", r2);
            r2[20] = C54912pU.A03(A00, A01, "last_important_message_table_id");
            C54912pU.A0S(A00, A01, "show_group_description", r2);
            C54912pU.A0T(A00, A01, "ephemeral_expiration", r2);
            r2[23] = C54912pU.A03(A00, A01, "last_read_ephemeral_message_table_id");
            C626235v.A06(r10, "chat_list", AnonymousClass0x9.A1A(C54912pU.A03(A00, A01, "ephemeral_setting_timestamp"), r2, 24), Collections.emptyList());
            if (i == A0l) {
                C622033z.A02(r10, "chat_ready", "ChatListTable", 0);
                r10.A0I("DELETE FROM chat_list WHERE message_table_id = 0 AND last_read_message_table_id = 0 AND sort_timestamp = 0 AND my_messages = 0 AND plaintext_disabled = 0 AND key_remote_jid NOT LIKE ? AND key_remote_jid NOT LIKE ?", "DELETE_CHAT_LIST_FOR_MIGRATION", new String[]{"%@g.us", "%@temp"});
            }
        }
    }

    public void B3j(C41492Kl r2, C56622sI r3) {
        r3.A09(this, "chat_list");
    }

    public /* synthetic */ void B3g(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
