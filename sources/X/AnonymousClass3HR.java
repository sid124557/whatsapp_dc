package X;

/* renamed from: X.3HR  reason: invalid class name */
public class AnonymousClass3HR implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("chat_group_type_index", "CREATE INDEX IF NOT EXISTS chat_group_type_index ON chat (group_type)");
        r5.A0A("chat_hidden_index", "CREATE INDEX IF NOT EXISTS chat_hidden_index ON chat (hidden)");
    }

    public void B3j(C41492Kl r8, C56622sI r9) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r2 = new C59422wt[44];
        AnonymousClass220 A01 = AnonymousClass220.A01(A00);
        boolean A0m = C54912pU.A0m(A00, A01, r2);
        A00.A02 = "jid_row_id";
        C54912pU.A0d(A00, A01, r2, A0m);
        C54912pU.A0A(A00, A01, "hidden", r2);
        A00.A02 = "subject";
        AnonymousClass220 r3 = AnonymousClass220.TEXT;
        C54912pU.A0Z(A00, r3, r2);
        C54912pU.A0C(A00, A01, "created_timestamp", r2);
        C54912pU.A0D(A00, A01, "display_message_row_id", r2);
        C54912pU.A0E(A00, A01, "last_message_row_id", r2);
        C54912pU.A0F(A00, A01, "last_read_message_row_id", r2);
        C54912pU.A0G(A00, A01, "last_read_receipt_sent_message_row_id", r2);
        C54912pU.A0H(A00, A01, "last_important_message_row_id", r2);
        C54912pU.A0I(A00, A01, "archived", r2);
        C54912pU.A0J(A00, A01, "sort_timestamp", r2);
        C54912pU.A0K(A00, A01, "mod_tag", r2);
        A00.A02 = "gen";
        r2[13] = C54912pU.A02(A00, AnonymousClass220.REAL);
        C54912pU.A0M(A00, A01, "spam_detection", r2);
        C54912pU.A0N(A00, A01, "unseen_earliest_message_received_time", r2);
        C54912pU.A0O(A00, A01, "unseen_message_count", r2);
        C54912pU.A0P(A00, A01, "unseen_missed_calls_count", r2);
        C54912pU.A0Q(A00, A01, "unseen_row_count", r2);
        C54912pU.A0R(A00, A01, "plaintext_disabled", r2);
        r2[20] = C54912pU.A03(A00, A01, "vcard_ui_dismissed");
        C54912pU.A0S(A00, A01, "change_number_notified_message_row_id", r2);
        C54912pU.A0T(A00, A01, "show_group_description", r2);
        r2[23] = C54912pU.A03(A00, A01, "ephemeral_expiration");
        r2[24] = C54912pU.A03(A00, A01, "last_read_ephemeral_message_row_id");
        r2[25] = C54912pU.A03(A00, A01, "ephemeral_setting_timestamp");
        r2[26] = C54912pU.A03(A00, A01, "ephemeral_displayed_exemptions");
        r2[27] = C54912pU.A03(A00, A01, "ephemeral_disappearing_messages_initiator");
        C54912pU.A09(A00, A01, "unseen_important_message_count", A0m);
        A00.A01 = "0";
        r2[28] = A00.A0x();
        r2[29] = C54912pU.A08(A00, A01, "group_type", A0m);
        r2[30] = C54912pU.A03(A00, A01, "last_message_reaction_row_id");
        r2[31] = C54912pU.A03(A00, A01, "last_seen_message_reaction_row_id");
        r2[32] = C54912pU.A03(A00, A01, "unseen_message_reaction_count");
        r2[33] = C54912pU.A03(A00, A01, "unseen_comment_message_count");
        r2[34] = C54912pU.A03(A00, A01, "growth_lock_level");
        r2[35] = C54912pU.A03(A00, A01, "growth_lock_expiration_ts");
        r2[36] = C54912pU.A03(A00, A01, "last_read_message_sort_id");
        r2[37] = C54912pU.A03(A00, A01, "display_message_sort_id");
        r2[38] = C54912pU.A03(A00, A01, "last_message_sort_id");
        r2[39] = C54912pU.A03(A00, A01, "last_read_receipt_sent_message_sort_id");
        r2[40] = C54912pU.A08(A00, A01, "has_new_community_admin_dialog_been_acknowledged", A0m);
        r2[41] = C54912pU.A03(A00, A01, "history_sync_progress");
        r2[42] = C54912pU.A03(A00, A01, "chat_lock");
        r2[43] = C54912pU.A03(A00, r3, "chat_origin");
        r9.A0E("chat", r2);
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
