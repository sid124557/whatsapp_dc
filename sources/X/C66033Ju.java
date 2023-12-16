package X;

/* renamed from: X.3Ju  reason: invalid class name and case insensitive filesystem */
public class C66033Ju implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("user_device_info_index", "CREATE UNIQUE INDEX IF NOT EXISTS user_device_info_index ON user_device_info (user_jid_row_id)");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r3 = new C59422wt[7];
        A00.A02 = "user_jid_row_id";
        AnonymousClass220 r2 = AnonymousClass220.INTEGER;
        boolean A0o = C54912pU.A0o(A00, r2, r3);
        C54912pU.A0V(A00, r2, "raw_id", r3, A0o);
        C54912pU.A0W(A00, r2, "timestamp", r3, A0o);
        C54912pU.A0B(A00, r2, "expected_timestamp", r3);
        C54912pU.A0C(A00, r2, "expected_ts_last_device_job_ts", r3);
        C54912pU.A0D(A00, r2, "expected_timestamp_update_ts", r3);
        C54912pU.A0E(A00, r2, "account_encryption_type", r3);
        r7.A0E("user_device_info", r3);
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
