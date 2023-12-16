package X;

/* renamed from: X.3K6  reason: invalid class name */
public class AnonymousClass3K6 implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("biz_profile_id_category_index", " CREATE INDEX IF NOT EXISTS biz_profile_id_category_index ON wa_biz_profiles_categories(wa_biz_profile_id, category_id);");
    }

    public /* synthetic */ void B3l(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0C("business_profiles_bd_for_categories_trigger", "CREATE TRIGGER business_profiles_bd_for_categories_trigger BEFORE DELETE ON wa_biz_profiles BEGIN DELETE FROM wa_biz_profiles_categories WHERE wa_biz_profile_id = old._id; END");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] A0s = C54912pU.A0s(A00);
        AnonymousClass220 r1 = AnonymousClass220.INTEGER;
        boolean A0m = C54912pU.A0m(A00, r1, A0s);
        C54912pU.A0V(A00, r1, "wa_biz_profile_id", A0s, A0m);
        A00.A02 = "category_id";
        AnonymousClass220 r12 = AnonymousClass220.TEXT;
        C54912pU.A0e(A00, r12, A0s, A0m);
        C54912pU.A0X(A00, r12, "category_name", A0s, A0m);
        r7.A0E("wa_biz_profiles_categories", A0s);
    }
}
