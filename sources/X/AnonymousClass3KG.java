package X;

/* renamed from: X.3KG  reason: invalid class name */
public class AnonymousClass3KG implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("biz_category_id_service_offerings_index", " CREATE UNIQUE INDEX IF NOT EXISTS biz_category_id_service_offerings_index ON wa_biz_category_service_offerings(_id, category_id);");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] A0s = C54912pU.A0s(A00);
        AnonymousClass220 r2 = AnonymousClass220.TEXT;
        boolean A0k = C54912pU.A0k(A00, r2);
        C54912pU.A0j(A00, A0s, A0k);
        C54912pU.A0V(A00, r2, "category_id", A0s, A0k);
        C54912pU.A0W(A00, r2, "category_name", A0s, A0k);
        C54912pU.A0X(A00, r2, "offering_name", A0s, A0k);
        r7.A0E("wa_biz_category_service_offerings", A0s);
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
