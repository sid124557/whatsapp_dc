package X;

/* renamed from: X.3JP  reason: invalid class name */
public class AnonymousClass3JP implements AnonymousClass4ED {
    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] A0s = C54912pU.A0s(A00);
        AnonymousClass220 r2 = AnonymousClass220.INTEGER;
        boolean A0m = C54912pU.A0m(A00, r2, A0s);
        A00.A02 = "quick_reply_id";
        C54912pU.A0c(A00, AnonymousClass220.TEXT, A0s, A0m);
        A00.A02 = "usage_date";
        C54912pU.A0Y(A00, AnonymousClass220.DATE, A0s);
        C54912pU.A0B(A00, r2, "usage_count", A0s);
        r7.A0E("quick_reply_usage", A0s);
    }

    public /* synthetic */ void B3l(C56862sg r4, C41492Kl r5, C56622sI r6) {
        C56622sI.A03(r6, "quick_replies", "quick_reply_usage", "quick_reply_id=old._id");
    }

    public /* synthetic */ void B3g(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
