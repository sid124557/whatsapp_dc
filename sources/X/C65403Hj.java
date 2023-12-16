package X;

/* renamed from: X.3Hj  reason: invalid class name and case insensitive filesystem */
public class C65403Hj implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("joinable_call_log_group_jid_row_id_index", "CREATE INDEX IF NOT EXISTS joinable_call_log_group_jid_row_id_index ON joinable_call_log (group_jid_row_id)");
        r5.A0B("joinable_call_log_call_id_index", "CREATE UNIQUE INDEX IF NOT EXISTS joinable_call_log_call_id_index ON joinable_call_log (call_id)");
    }

    public /* synthetic */ void B3l(C56862sg r4, C41492Kl r5, C56622sI r6) {
        C56622sI.A05(r6, "call_log", "joinable_call_log", "call_log_row_id=old._id");
    }

    public void B3j(C41492Kl r7, C56622sI r8) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r4 = new C59422wt[4];
        A00.A02 = "call_log_row_id";
        AnonymousClass220 r3 = AnonymousClass220.INTEGER;
        boolean A0o = C54912pU.A0o(A00, r3, r4);
        A00.A02 = "call_id";
        C54912pU.A0c(A00, AnonymousClass220.TEXT, r4, A0o);
        C54912pU.A09(A00, r3, "joinable_video_call", A0o);
        A00.A01 = "0";
        r4[2] = A00.A0x();
        r4[3] = C54912pU.A08(A00, r3, "group_jid_row_id", A0o);
        r8.A0E("joinable_call_log", r4);
    }
}
