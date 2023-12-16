package X;

/* renamed from: X.3Kl  reason: invalid class name and case insensitive filesystem */
public class C66203Kl implements AnonymousClass4ED {
    public static final String[] A00 = {"_id", "chat_row_id", "from_me", "key_id", "sender_jid_row_id", "parent_message_row_id", "timestamp", "status", "message_add_on_type", "received_timestamp", "expiry_duration_in_secs", "server_timestamp", "expiry_timestamp"};

    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("message_add_on_key_index", "CREATE UNIQUE INDEX IF NOT EXISTS message_add_on_key_index ON message_add_on (chat_row_id, from_me, key_id, sender_jid_row_id)");
        r5.A0B("message_add_on_status_index", "CREATE INDEX IF NOT EXISTS message_add_on_status_index ON message_add_on (status)");
        r5.A0B("message_add_on_chat_status_index", "CREATE INDEX IF NOT EXISTS message_add_on_chat_status_index ON message_add_on (chat_row_id, status)");
        r5.A0B("message_add_on_parent_message_row_id_index", "CREATE INDEX IF NOT EXISTS message_add_on_parent_message_row_id_index ON message_add_on (parent_message_row_id)");
        r5.A0A("message_add_on_expiry_timestamp_index", "CREATE INDEX IF NOT EXISTS message_add_on_expiry_timestamp_index ON message_add_on (expiry_timestamp)");
    }

    public /* synthetic */ void B3l(C56862sg r4, C41492Kl r5, C56622sI r6) {
        C56622sI.A03(r6, "message", "message_add_on", "parent_message_row_id=old._id");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A002 = C54912pU.A00();
        C59422wt[] r2 = new C59422wt[13];
        AnonymousClass220 A01 = AnonymousClass220.A01(A002);
        boolean A0m = C54912pU.A0m(A002, A01, r2);
        C54912pU.A0U(A002, A01, "chat_row_id", r2, A0m ? 1 : 0);
        C54912pU.A0A(A002, A01, "from_me", r2);
        A002.A02 = "key_id";
        C54912pU.A0f(A002, AnonymousClass220.TEXT, r2, A0m);
        C54912pU.A0C(A002, A01, "sender_jid_row_id", r2);
        C54912pU.A0D(A002, A01, "parent_message_row_id", r2);
        C54912pU.A0E(A002, A01, "timestamp", r2);
        C54912pU.A0F(A002, A01, "status", r2);
        C54912pU.A0G(A002, A01, "message_add_on_type", r2);
        C54912pU.A0H(A002, A01, "received_timestamp", r2);
        C54912pU.A0I(A002, A01, "expiry_duration_in_secs", r2);
        C54912pU.A0J(A002, A01, "server_timestamp", r2);
        C54912pU.A0K(A002, A01, "expiry_timestamp", r2);
        r7.A0E("message_add_on", r2);
    }
}
