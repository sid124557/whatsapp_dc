package X;

/* renamed from: X.3HO  reason: invalid class name */
public class AnonymousClass3HO implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("call_log_key_index", "CREATE UNIQUE INDEX IF NOT EXISTS call_log_key_index ON call_log (jid_row_id, from_me, call_id, transaction_id)");
    }

    public void B3l(C56862sg r4, C41492Kl r5, C56622sI r6) {
        if (!C626235v.A04(r4, "call_logs")) {
            C56622sI.A05(r6, "call_logs", "call_log_participant", "call_logs_row_id=old._id");
        }
    }

    public void B3j(C41492Kl r9, C56622sI r10) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r3 = new C59422wt[19];
        AnonymousClass220 A01 = AnonymousClass220.A01(A00);
        A00.A00 = A01;
        boolean A0q = C54912pU.A0q(A00, r3);
        C54912pU.A0U(A00, A01, "jid_row_id", r3, 1);
        C54912pU.A0A(A00, A01, "from_me", r3);
        A00.A02 = "call_id";
        AnonymousClass220 r2 = AnonymousClass220.TEXT;
        C54912pU.A0Z(A00, r2, r3);
        C54912pU.A0C(A00, A01, "transaction_id", r3);
        C54912pU.A0D(A00, A01, "timestamp", r3);
        C54912pU.A0E(A00, A01, "video_call", r3);
        C54912pU.A0F(A00, A01, "duration", r3);
        C54912pU.A0G(A00, A01, "call_result", r3);
        C54912pU.A0H(A00, A01, "is_dnd_mode_on", r3);
        C54912pU.A0I(A00, A01, "bytes_transferred", r3);
        r3[11] = C54912pU.A05(A00, A01, "group_jid_row_id", A0q ? 1 : 0, true);
        C54912pU.A0K(A00, A01, "is_joinable_group_call", r3);
        r3[13] = C54912pU.A05(A00, A01, "call_creator_device_jid_row_id", A0q, true);
        C54912pU.A0M(A00, r2, "call_random_id", r3);
        r3[15] = C54912pU.A05(A00, A01, "call_link_row_id", A0q, true);
        C54912pU.A0O(A00, A01, "call_type", r3);
        C54912pU.A0P(A00, A01, "offer_silence_reason", r3);
        C54912pU.A0Q(A00, r2, "scheduled_id", r3);
        r10.A0E("call_log", r3);
    }
}
