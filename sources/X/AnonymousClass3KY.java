package X;

/* renamed from: X.3KY  reason: invalid class name */
public class AnonymousClass3KY implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("quick_promotion_payload_index", " CREATE UNIQUE INDEX IF NOT EXISTS quick_promotion_payload_index ON quick_promotion_payload (surface_id, trigger_id);");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r3 = new C59422wt[5];
        A00.A02 = "surface_id";
        A00.A00 = AnonymousClass220.INTEGER;
        C54912pU.A0j(A00, r3, true);
        A00.A02 = "trigger_id";
        AnonymousClass220 r1 = AnonymousClass220.TEXT;
        C54912pU.A0c(A00, r1, r3, true);
        C54912pU.A0A(A00, r1, "trigger_context", r3);
        A00.A02 = "qp_details";
        C54912pU.A0f(A00, AnonymousClass220.BLOB, r3, true);
        A00.A02 = "insertion_time";
        C54912pU.A0g(A00, AnonymousClass220.DATETIME, r3, true);
        r7.A0E("quick_promotion_payload", r3);
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
