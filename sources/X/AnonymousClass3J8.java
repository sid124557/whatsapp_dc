package X;

/* renamed from: X.3J8  reason: invalid class name */
public final class AnonymousClass3J8 implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        C162457s7.A0J(r5, 0);
        r5.A0B("newsletter_my_reaction_orphan_message_index", "CREATE UNIQUE INDEX IF NOT EXISTS newsletter_my_reaction_orphan_message_index ON newsletter_my_reaction_orphan_message (chat_row_id, server_message_id)");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A01 = C54912pU.A01(r7);
        C59422wt[] r3 = new C59422wt[7];
        AnonymousClass220 A012 = AnonymousClass220.A01(A01);
        boolean A0l = C54912pU.A0l(A01, A012, r3);
        C54912pU.A0V(A01, A012, "chat_row_id", r3, A0l);
        C54912pU.A0W(A01, A012, "server_message_id", r3, A0l);
        A01.A02 = "reaction_from_me";
        AnonymousClass220 r1 = AnonymousClass220.TEXT;
        C54912pU.A0Z(A01, r1, r3);
        C54912pU.A0C(A01, A012, "reactions_from_me_ts", r3);
        C54912pU.A0D(A01, r1, "votes_from_me", r3);
        C54912pU.A0E(A01, A012, "votes_from_me_ts", r3);
        r7.A0E("newsletter_my_reaction_orphan_message", r3);
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
