package X;

/* renamed from: X.3J9  reason: invalid class name */
public final class AnonymousClass3J9 implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        C162457s7.A0J(r5, 0);
        r5.A0B("newsletter_subscribers_by_type_index", "CREATE INDEX IF NOT EXISTS newsletter_subscribers_by_type_index ON newsletter_subscribers (chat_row_id, type_of_fetch)");
    }

    public void B3j(C41492Kl r8, C56622sI r9) {
        C54912pU A01 = C54912pU.A01(r9);
        C59422wt[] r3 = new C59422wt[9];
        AnonymousClass220 A012 = AnonymousClass220.A01(A01);
        boolean A0n = C54912pU.A0n(A01, A012, r3);
        C54912pU.A0V(A01, A012, "chat_row_id", r3, A0n);
        C54912pU.A0A(A01, A012, "jid_row_id", r3);
        A01.A02 = "display_name";
        AnonymousClass220 r1 = AnonymousClass220.TEXT;
        C54912pU.A0Z(A01, r1, r3);
        C54912pU.A0C(A01, r1, "profile_picture_direct_path", r3);
        C54912pU.A0D(A01, A012, "subscription_time", r3);
        r3[6] = C54912pU.A05(A01, A012, "role", 0, A0n);
        r3[7] = C54912pU.A05(A01, A012, "type_of_fetch", 0, A0n);
        r3[8] = C54912pU.A05(A01, A012, "fetched_time", 0, A0n);
        r9.A0E("newsletter_subscribers", r3);
    }

    public /* synthetic */ void B3l(C56862sg r4, C41492Kl r5, C56622sI r6) {
        C162457s7.A0J(r6, 0);
        C56622sI.A04(r6, "newsletter", "newsletter_subscribers", "chat_row_id=old.chat_row_id");
    }
}
