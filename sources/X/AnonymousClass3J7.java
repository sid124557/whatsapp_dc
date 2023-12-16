package X;

/* renamed from: X.3J7  reason: invalid class name */
public final class AnonymousClass3J7 implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        C162457s7.A0J(r5, 0);
        r5.A0B("newsletter_message_index", "CREATE UNIQUE INDEX IF NOT EXISTS newsletter_message_index ON newsletter_message (chat_row_id, server_message_id)");
    }

    public void B3j(C41492Kl r8, C56622sI r9) {
        C54912pU A01 = C54912pU.A01(r9);
        C59422wt[] r3 = new C59422wt[9];
        AnonymousClass220 A02 = AnonymousClass220.A02(A01);
        boolean A0n = C54912pU.A0n(A01, A02, r3);
        C54912pU.A0V(A01, A02, "chat_row_id", r3, A0n);
        C54912pU.A0W(A01, A02, "server_message_id", r3, A0n);
        r3[3] = C54912pU.A05(A01, A02, "comments_count", 0, A0n);
        A01.A02 = "reaction_from_me";
        C54912pU.A0a(A01, AnonymousClass220.TEXT, r3);
        r3[5] = C54912pU.A05(A01, A02, "extra_newsletter_tables", 0, A0n);
        C54912pU.A0E(A01, A02, "extra_table_last_update_ts", r3);
        C54912pU.A0F(A01, A02, "reactions_from_me_ts", r3);
        C54912pU.A0G(A01, A02, "view_count", r3);
        r9.A0E("newsletter_message", r3);
    }

    public /* synthetic */ void B3l(C56862sg r4, C41492Kl r5, C56622sI r6) {
        C162457s7.A0J(r6, 0);
        C56622sI.A04(r6, "message", "newsletter_message", "message_row_id=old._id");
    }
}
