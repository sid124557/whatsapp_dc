package X;

/* renamed from: X.3K0  reason: invalid class name */
public class AnonymousClass3K0 implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("message_add_on_poll_vote_selected_option_message_add_on_row_id_index", "CREATE INDEX IF NOT EXISTS message_add_on_poll_vote_selected_option_message_add_on_row_id_index ON message_add_on_poll_vote_selected_option (message_add_on_row_id)");
    }

    public /* synthetic */ void B3l(C56862sg r4, C41492Kl r5, C56622sI r6) {
        C56622sI.A03(r6, "message_add_on", "message_add_on_poll_vote_selected_option", "message_add_on_row_id=old._id");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] A0r = C54912pU.A0r(A00);
        AnonymousClass220 r2 = AnonymousClass220.INTEGER;
        C54912pU.A0U(A00, r2, "message_add_on_row_id", A0r, C54912pU.A0m(A00, r2, A0r) ? 1 : 0);
        C54912pU.A0A(A00, r2, "message_poll_option_id", A0r);
        r7.A0E("message_add_on_poll_vote_selected_option", A0r);
    }
}
