package X;

/* renamed from: X.3JB  reason: invalid class name */
public class AnonymousClass3JB implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("message_orphaned_edit_key_index", "CREATE UNIQUE INDEX IF NOT EXISTS message_orphaned_edit_key_index ON message_orphaned_edit (key_id, from_me, chat_row_id, sender_jid_row_id)");
    }

    public void B3j(C41492Kl r8, C56622sI r9) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r2 = new C59422wt[11];
        AnonymousClass220 A01 = AnonymousClass220.A01(A00);
        A00.A00 = A01;
        boolean A0p = C54912pU.A0p(A00, r2);
        A00.A02 = "key_id";
        AnonymousClass220 r5 = AnonymousClass220.TEXT;
        C54912pU.A0c(A00, r5, r2, true);
        C54912pU.A0W(A00, A01, "from_me", r2, true);
        C54912pU.A0X(A00, A01, "chat_row_id", r2, true);
        r2[4] = C54912pU.A05(A00, A01, "sender_jid_row_id", A0p ? 1 : 0, true);
        C54912pU.A0D(A00, A01, "timestamp", r2);
        r2[6] = C54912pU.A07(A00, A01, "message_type", true);
        C54912pU.A0F(A00, r5, "revoked_key_id", r2);
        C54912pU.A0G(A00, A01, "retry_count", r2);
        C54912pU.A0H(A00, A01, "admin_jid_row_id", r2);
        r2[10] = AnonymousClass220.A00(A00, "orphan_message_data");
        r9.A0E("message_orphaned_edit", r2);
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
