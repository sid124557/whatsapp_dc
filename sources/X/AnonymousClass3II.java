package X;

/* renamed from: X.3II  reason: invalid class name */
public class AnonymousClass3II implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("message_poll_option_message_row_id_index", "CREATE INDEX IF NOT EXISTS message_poll_option_message_row_id_index ON message_poll_option (message_row_id)");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] A0t = C54912pU.A0t(A00);
        AnonymousClass220 r2 = AnonymousClass220.INTEGER;
        C54912pU.A0U(A00, r2, "message_row_id", A0t, C54912pU.A0m(A00, r2, A0t) ? 1 : 0);
        A00.A02 = "option_sha256";
        AnonymousClass220 r1 = AnonymousClass220.TEXT;
        C54912pU.A0Y(A00, r1, A0t);
        C54912pU.A0B(A00, r1, "option_name", A0t);
        C54912pU.A0C(A00, r2, "vote_total", A0t);
        r7.A0E("message_poll_option", A0t);
    }

    public /* synthetic */ void B3l(C56862sg r4, C41492Kl r5, C56622sI r6) {
        C56622sI.A05(r6, "message_poll", "message_poll_option", "message_row_id=old.message_row_id");
    }
}
