package X;

/* renamed from: X.3J4  reason: invalid class name */
public final class AnonymousClass3J4 implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        C162457s7.A0J(r5, 0);
        r5.A0B("message_newsletter_admin_invite_newsletter_jid_row_id_index", "CREATE INDEX IF NOT EXISTS message_newsletter_admin_invite_newsletter_jid_row_id_index ON message_newsletter_admin_invite (newsletter_jid_row_id)");
    }

    public /* synthetic */ void B3l(C56862sg r2, C41492Kl r3, C56622sI r4) {
        C162457s7.A0J(r4, 0);
        C56622sI.A00(r4, "message_newsletter_admin_invite");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A01 = C54912pU.A01(r7);
        C59422wt[] A0w = C54912pU.A0w(A01);
        AnonymousClass220 r2 = AnonymousClass220.INTEGER;
        boolean A0n = C54912pU.A0n(A01, r2, A0w);
        C54912pU.A0V(A01, r2, "newsletter_jid_row_id", A0w, A0n);
        A01.A02 = "newsletter_name";
        C54912pU.A0e(A01, AnonymousClass220.TEXT, A0w, A0n);
        C54912pU.A0X(A01, r2, "expiration", A0w, A0n);
        r7.A0E("message_newsletter_admin_invite", A0w);
    }
}
