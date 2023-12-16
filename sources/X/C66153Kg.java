package X;

/* renamed from: X.3Kg  reason: invalid class name and case insensitive filesystem */
public class C66153Kg implements AnonymousClass4ED {
    public static final String[] A00 = {"_id", "chat_row_id", "from_me", "key_id", "sender_jid_row_id", "parent_chat_row_id", "parent_from_me", "parent_key_id", "parent_sender_jid_row_id", "timestamp", "orphan_message_data"};

    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("message_add_on_orphan_key_index", "CREATE UNIQUE INDEX IF NOT EXISTS message_add_on_orphan_key_index ON message_add_on_orphan (chat_row_id, from_me, key_id, sender_jid_row_id)");
        r5.A0B("message_add_on_orphan_parent_key_index", "CREATE INDEX IF NOT EXISTS message_add_on_orphan_parent_key_index ON message_add_on_orphan (parent_chat_row_id, parent_from_me, parent_key_id, parent_sender_jid_row_id)");
    }

    public /* synthetic */ void B3l(C56862sg r4, C41492Kl r5, C56622sI r6) {
        C56622sI.A03(r6, "chat", "message_add_on_orphan", "parent_chat_row_id=old._id");
    }

    public void B3j(C41492Kl r7, C56622sI r8) {
        C54912pU A002 = C54912pU.A00();
        C59422wt[] r2 = new C59422wt[11];
        AnonymousClass220 A01 = AnonymousClass220.A01(A002);
        boolean A0m = C54912pU.A0m(A002, A01, r2);
        C54912pU.A0U(A002, A01, "chat_row_id", r2, A0m ? 1 : 0);
        C54912pU.A0A(A002, A01, "from_me", r2);
        A002.A02 = "key_id";
        AnonymousClass220 r1 = AnonymousClass220.TEXT;
        C54912pU.A0f(A002, r1, r2, A0m);
        C54912pU.A0C(A002, A01, "sender_jid_row_id", r2);
        C54912pU.A0D(A002, A01, "parent_chat_row_id", r2);
        C54912pU.A0E(A002, A01, "parent_from_me", r2);
        r2[7] = C54912pU.A07(A002, r1, "parent_key_id", A0m);
        C54912pU.A0G(A002, A01, "parent_sender_jid_row_id", r2);
        C54912pU.A0H(A002, A01, "timestamp", r2);
        r2[10] = AnonymousClass220.A00(A002, "orphan_message_data");
        r8.A0E("message_add_on_orphan", r2);
    }
}
