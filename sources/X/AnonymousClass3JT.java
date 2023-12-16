package X;

/* renamed from: X.3JT  reason: invalid class name */
public class AnonymousClass3JT implements AnonymousClass4ED {
    public void B3j(C41492Kl r7, C56622sI r8) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r2 = new C59422wt[13];
        AnonymousClass220 A02 = AnonymousClass220.A02(A00);
        boolean A0o = C54912pU.A0o(A00, A02, r2);
        A00.A02 = "order_id";
        AnonymousClass220 r4 = AnonymousClass220.TEXT;
        C54912pU.A0b(A00, r4, r2, A0o ? 1 : 0);
        A00.A02 = "thumbnail";
        C54912pU.A0Y(A00, AnonymousClass220.BLOB, r2);
        C54912pU.A0B(A00, r4, "order_title", r2);
        C54912pU.A0C(A00, A02, "item_count", r2);
        C54912pU.A0D(A00, A02, "status", r2);
        C54912pU.A0E(A00, A02, "surface", r2);
        C54912pU.A0F(A00, r4, "message", r2);
        C54912pU.A0G(A00, A02, "seller_jid", r2);
        C54912pU.A0H(A00, r4, "token", r2);
        C54912pU.A0I(A00, r4, "currency_code", r2);
        C54912pU.A0J(A00, A02, "total_amount_1000", r2);
        C54912pU.A0K(A00, A02, "message_version", r2);
        r8.A0E("message_quoted_order", r2);
    }

    public /* synthetic */ void B3l(C56862sg r2, C41492Kl r3, C56622sI r4) {
        C56622sI.A01(r4, "message_quoted_order");
    }

    public /* synthetic */ void B3g(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
