package X;

/* renamed from: X.3IF  reason: invalid class name */
public class AnonymousClass3IF implements AnonymousClass4ED {
    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r3 = new C59422wt[6];
        boolean A0o = C54912pU.A0o(A00, AnonymousClass220.A02(A00), r3);
        A00.A02 = "transaction_info";
        AnonymousClass220 r1 = AnonymousClass220.TEXT;
        C54912pU.A0b(A00, r1, r3, A0o ? 1 : 0);
        C54912pU.A0A(A00, r1, "transaction_data", r3);
        C54912pU.A0B(A00, r1, "init_timestamp", r3);
        C54912pU.A0C(A00, r1, "update_timestamp", r3);
        C54912pU.A0D(A00, r1, "amount_data", r3);
        r7.A0E("message_payment_status_update", r3);
    }

    public /* synthetic */ void B3l(C56862sg r2, C41492Kl r3, C56622sI r4) {
        C56622sI.A02(r4, "message_payment_status_update");
    }

    public /* synthetic */ void B3g(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
