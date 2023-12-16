package X;

@Deprecated
/* renamed from: X.3Jb  reason: invalid class name and case insensitive filesystem */
public class C65843Jb implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("receipts_key_index", "CREATE INDEX IF NOT EXISTS receipts_key_index ON receipts (key_remote_jid, key_id)");
    }

    public void B3j(C41492Kl r7, C56622sI r8) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r4 = new C59422wt[7];
        AnonymousClass220 A01 = AnonymousClass220.A01(A00);
        boolean A0m = C54912pU.A0m(A00, A01, r4);
        A00.A02 = "key_remote_jid";
        AnonymousClass220 r1 = AnonymousClass220.TEXT;
        C54912pU.A0c(A00, r1, r4, A0m);
        C54912pU.A0W(A00, r1, "key_id", r4, A0m);
        C54912pU.A0B(A00, r1, "remote_resource", r4);
        C54912pU.A0C(A00, A01, "receipt_device_timestamp", r4);
        C54912pU.A0D(A00, A01, "read_device_timestamp", r4);
        C54912pU.A0E(A00, A01, "played_device_timestamp", r4);
        r8.A0E("receipts", r4);
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
