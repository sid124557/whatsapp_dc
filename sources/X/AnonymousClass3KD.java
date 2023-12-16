package X;

/* renamed from: X.3KD  reason: invalid class name */
public class AnonymousClass3KD implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("biz_profile_id_service_offerings_index", " CREATE UNIQUE INDEX IF NOT EXISTS biz_profile_id_service_offerings_index ON wa_biz_profile_to_service_offerings (wa_biz_profile_id, wa_biz_category_service_offerings_id);");
    }

    public /* synthetic */ void B3l(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0C("business_profiles_bd_for_biz_profile_to_service_offerings_trigger", "CREATE TRIGGER business_profiles_bd_for_biz_profile_to_service_offerings_trigger BEFORE DELETE ON wa_biz_profiles BEGIN DELETE FROM wa_biz_profile_to_service_offerings WHERE wa_biz_profile_id = old._id; END");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] A0s = C54912pU.A0s(A00);
        AnonymousClass220 r2 = AnonymousClass220.INTEGER;
        boolean A0m = C54912pU.A0m(A00, r2, A0s);
        C54912pU.A0V(A00, r2, "wa_biz_profile_id", A0s, A0m);
        A00.A02 = "wa_biz_category_service_offerings_id";
        C54912pU.A0e(A00, AnonymousClass220.TEXT, A0s, A0m);
        A00.A02 = "is_offered";
        C54912pU.A0f(A00, AnonymousClass220.BOOLEAN, A0s, A0m);
        r7.A0E("wa_biz_profile_to_service_offerings", A0s);
    }
}
