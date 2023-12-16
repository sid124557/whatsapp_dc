package X;

/* renamed from: X.3Ja  reason: invalid class name and case insensitive filesystem */
public class C65833Ja implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("receipt_user_index", "CREATE UNIQUE INDEX IF NOT EXISTS receipt_user_index ON receipt_user(message_row_id,receipt_user_jid_row_id)");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r3 = new C59422wt[6];
        AnonymousClass220 A01 = AnonymousClass220.A01(A00);
        boolean A0m = C54912pU.A0m(A00, A01, r3);
        C54912pU.A0V(A00, A01, "message_row_id", r3, A0m);
        C54912pU.A0W(A00, A01, "receipt_user_jid_row_id", r3, A0m);
        C54912pU.A0B(A00, A01, "receipt_timestamp", r3);
        C54912pU.A0C(A00, A01, "read_timestamp", r3);
        C54912pU.A0D(A00, A01, "played_timestamp", r3);
        r7.A0E("receipt_user", r3);
    }

    public /* synthetic */ void B3l(C56862sg r2, C41492Kl r3, C56622sI r4) {
        C56622sI.A00(r4, "receipt_user");
    }
}
