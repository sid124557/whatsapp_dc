package X;

/* renamed from: X.3KZ  reason: invalid class name */
public final class AnonymousClass3KZ implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        C162457s7.A0J(r5, 0);
        r5.A0B("user_jid_index", " CREATE INDEX IF NOT EXISTS user_jid_index ON recently_accepted_deeplink_invites (user_jid);");
    }

    public void B3j(C41492Kl r7, C56622sI r8) {
        C54912pU A01 = C54912pU.A01(r8);
        C59422wt[] r3 = new C59422wt[3];
        A01.A02 = "user_jid";
        AnonymousClass220 r2 = AnonymousClass220.TEXT;
        A01.A00 = r2;
        A01.A04 = true;
        C54912pU.A0i(A01, r3, 0);
        A01.A02 = "invite_accepted_time";
        C54912pU.A0b(A01, AnonymousClass220.INTEGER, r3, 1);
        C54912pU.A0A(A01, r2, "invite_receiver_reason", r3);
        r8.A0D("recently_accepted_deeplink_invites", AnonymousClass8UF.A0p(r3), AnonymousClass8UF.A0p("PRIMARY KEY (user_jid)"));
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
