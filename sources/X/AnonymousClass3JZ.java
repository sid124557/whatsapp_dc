package X;

/* renamed from: X.3JZ  reason: invalid class name */
public class AnonymousClass3JZ implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("receipt_device_table_device_index", "CREATE INDEX IF NOT EXISTS receipt_device_table_device_index ON receipt_device (receipt_device_jid_row_id)");
        r5.A0B("receipt_device_index", "CREATE UNIQUE INDEX IF NOT EXISTS receipt_device_index ON receipt_device (message_row_id, receipt_device_jid_row_id)");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] A0t = C54912pU.A0t(A00);
        AnonymousClass220 r2 = AnonymousClass220.INTEGER;
        boolean A0m = C54912pU.A0m(A00, r2, A0t);
        C54912pU.A0V(A00, r2, "message_row_id", A0t, A0m);
        C54912pU.A0W(A00, r2, "receipt_device_jid_row_id", A0t, A0m);
        C54912pU.A0B(A00, r2, "receipt_device_timestamp", A0t);
        C54912pU.A0C(A00, r2, "primary_device_version", A0t);
        r7.A0E("receipt_device", A0t);
    }

    public /* synthetic */ void B3l(C56862sg r2, C41492Kl r3, C56622sI r4) {
        C56622sI.A00(r4, "receipt_device");
    }
}
