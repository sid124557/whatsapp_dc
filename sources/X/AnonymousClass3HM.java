package X;

/* renamed from: X.3HM  reason: invalid class name */
public class AnonymousClass3HM implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("call_link_token_index", "CREATE UNIQUE INDEX IF NOT EXISTS call_link_token_index ON call_link(token)");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] A0r = C54912pU.A0r(A00);
        AnonymousClass220 r2 = AnonymousClass220.INTEGER;
        boolean A0m = C54912pU.A0m(A00, r2, A0r);
        A00.A02 = "token";
        C54912pU.A0c(A00, AnonymousClass220.TEXT, A0r, A0m);
        A0r[2] = C54912pU.A06(A00, r2, "creator_jid_row_id", A0m);
        r7.A0E("call_link", A0r);
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
