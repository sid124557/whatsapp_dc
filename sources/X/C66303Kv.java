package X;

/* renamed from: X.3Kv  reason: invalid class name and case insensitive filesystem */
public final class C66303Kv implements AnonymousClass4ED, C838049v {
    public void B17(C56862sg r3, C41492Kl r4) {
        C162457s7.A0J(r3, 0);
        C626235v.A03(r3, "NewsletterMessageReactionTable/", "newsletter_message_reactions");
    }

    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        C162457s7.A0J(r5, 0);
        r5.A0B("newsletter_message_reaction_index", "CREATE UNIQUE INDEX IF NOT EXISTS newsletter_message_reaction_index ON newsletter_message_reaction (message_row_id, reaction)");
    }

    public /* synthetic */ void B3l(C56862sg r4, C41492Kl r5, C56622sI r6) {
        C162457s7.A0J(r6, 0);
        C56622sI.A04(r6, "message", "newsletter_message_reaction", "message_row_id=old._id");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A01 = C54912pU.A01(r7);
        C59422wt[] A0s = C54912pU.A0s(A01);
        AnonymousClass220 r2 = AnonymousClass220.INTEGER;
        boolean A0l = C54912pU.A0l(A01, r2, A0s);
        C54912pU.A0V(A01, r2, "message_row_id", A0s, A0l);
        A01.A02 = "reaction";
        C54912pU.A0e(A01, AnonymousClass220.TEXT, A0s, A0l);
        C54912pU.A0X(A01, r2, "reaction_count", A0s, A0l);
        r7.A0E("newsletter_message_reaction", A0s);
        r7.A09(this, "newsletter_message_reactions");
    }
}
