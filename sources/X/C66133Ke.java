package X;

/* renamed from: X.3Ke  reason: invalid class name and case insensitive filesystem */
public final class C66133Ke implements AnonymousClass4ED {
    public static String[] A00 = {"_id", "chat_row_id", "from_me", "key_id", "sender_jid_row_id", "parent_chat_row_id", "parent_from_me", "parent_key_id", "parent_sender_jid_row_id", "timestamp", "orphan_message_data", "orphan_message_type", "orphan_message_stanza_data"};

    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        C162457s7.A0J(r5, 0);
        r5.A0B("message_orphan_key_index", "CREATE UNIQUE INDEX IF NOT EXISTS message_orphan_key_index ON message_orphan (chat_row_id, from_me, key_id, sender_jid_row_id)");
        r5.A0B("message_orphan_parent_key_index", "CREATE INDEX IF NOT EXISTS message_orphan_parent_key_index ON message_orphan (parent_chat_row_id, parent_from_me, parent_key_id, parent_sender_jid_row_id)");
    }

    public /* synthetic */ void B3l(C56862sg r4, C41492Kl r5, C56622sI r6) {
        C162457s7.A0J(r6, 0);
        C56622sI.A03(r6, "chat", "message_orphan", "parent_chat_row_id=old._id");
    }

    public void B3j(C41492Kl r7, C56622sI r8) {
        C54912pU A01 = C54912pU.A01(r8);
        C59422wt[] r3 = new C59422wt[13];
        AnonymousClass220 A012 = AnonymousClass220.A01(A01);
        boolean A0l = C54912pU.A0l(A01, A012, r3);
        C54912pU.A0U(A01, A012, "chat_row_id", r3, A0l ? 1 : 0);
        C54912pU.A0A(A01, A012, "from_me", r3);
        A01.A02 = "key_id";
        AnonymousClass220 r1 = AnonymousClass220.TEXT;
        C54912pU.A0f(A01, r1, r3, A0l);
        C54912pU.A0C(A01, A012, "sender_jid_row_id", r3);
        C54912pU.A0D(A01, A012, "parent_chat_row_id", r3);
        C54912pU.A0E(A01, A012, "parent_from_me", r3);
        C54912pU.A0F(A01, r1, "parent_key_id", r3);
        C54912pU.A0G(A01, A012, "parent_sender_jid_row_id", r3);
        C54912pU.A0H(A01, A012, "timestamp", r3);
        A01.A02 = "orphan_message_data";
        AnonymousClass220 r2 = AnonymousClass220.BLOB;
        r3[10] = C54912pU.A02(A01, r2);
        C54912pU.A0J(A01, A012, "orphan_message_type", r3);
        C54912pU.A0K(A01, r2, "orphan_message_stanza_data", r3);
        r8.A0E("message_orphan", r3);
    }
}
