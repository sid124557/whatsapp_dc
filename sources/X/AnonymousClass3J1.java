package X;

/* renamed from: X.3J1  reason: invalid class name */
public class AnonymousClass3J1 implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("missed_call_log_participants_key_index", "CREATE UNIQUE INDEX IF NOT EXISTS missed_call_log_participants_key_index ON missed_call_log_participant (call_logs_row_id, jid)");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] A0s = C54912pU.A0s(A00);
        AnonymousClass220 r2 = AnonymousClass220.INTEGER;
        C54912pU.A0U(A00, r2, "call_logs_row_id", A0s, C54912pU.A0m(A00, r2, A0s) ? 1 : 0);
        A00.A02 = "jid";
        C54912pU.A0Y(A00, AnonymousClass220.TEXT, A0s);
        C54912pU.A0B(A00, r2, "call_result", A0s);
        r7.A0E("missed_call_log_participant", A0s);
    }

    public /* synthetic */ void B3l(C56862sg r4, C41492Kl r5, C56622sI r6) {
        C56622sI.A05(r6, "missed_call_logs", "missed_call_log_participant", "call_logs_row_id=old._id");
    }
}
