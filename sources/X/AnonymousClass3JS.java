package X;

/* renamed from: X.3JS  reason: invalid class name */
public class AnonymousClass3JS implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("quoted_mentions_index", "CREATE UNIQUE INDEX IF NOT EXISTS quoted_mentions_index ON message_quoted_mentions (message_row_id, jid_row_id)");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] A0s = C54912pU.A0s(A00);
        AnonymousClass220 r2 = AnonymousClass220.INTEGER;
        C54912pU.A0U(A00, r2, "message_row_id", A0s, C54912pU.A0m(A00, r2, A0s) ? 1 : 0);
        C54912pU.A0A(A00, r2, "jid_row_id", A0s);
        A00.A02 = "display_name";
        C54912pU.A0Z(A00, AnonymousClass220.STRING, A0s);
        r7.A0E("message_quoted_mentions", A0s);
    }

    public /* synthetic */ void B3l(C56862sg r4, C41492Kl r5, C56622sI r6) {
        C56622sI.A05(r6, "message_quoted", "message_quoted_mentions", "message_row_id = old.message_row_id");
    }
}
