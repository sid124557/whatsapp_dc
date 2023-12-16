package X;

/* renamed from: X.3J2  reason: invalid class name */
public class AnonymousClass3J2 implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("missed_call_logs_key_index", "CREATE UNIQUE INDEX IF NOT EXISTS missed_call_logs_key_index ON missed_call_logs (message_row_id)");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r3 = new C59422wt[8];
        AnonymousClass220 A01 = AnonymousClass220.A01(A00);
        boolean A0m = C54912pU.A0m(A00, A01, r3);
        C54912pU.A0U(A00, A01, "message_row_id", r3, A0m ? 1 : 0);
        C54912pU.A0A(A00, A01, "timestamp", r3);
        C54912pU.A0B(A00, A01, "video_call", r3);
        r3[4] = C54912pU.A06(A00, A01, "group_jid_row_id", A0m);
        C54912pU.A0D(A00, A01, "is_joinable_group_call", r3);
        C54912pU.A0E(A00, A01, "is_dnd_mode_on", r3);
        C54912pU.A0F(A00, A01, "offer_silence_reason", r3);
        r7.A0E("missed_call_logs", r3);
    }

    public /* synthetic */ void B3l(C56862sg r2, C41492Kl r3, C56622sI r4) {
        C56622sI.A00(r4, "missed_call_logs");
    }
}
