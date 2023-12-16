package X;

/* renamed from: X.3KC  reason: invalid class name */
public class AnonymousClass3KC implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("biz_profile_id_service_area_index", " CREATE INDEX IF NOT EXISTS biz_profile_id_service_area_index ON wa_biz_profiles_service_areas(wa_biz_profile_id);");
    }

    public /* synthetic */ void B3l(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0C("business_profiles_bd_for_service_areas_trigger", "CREATE TRIGGER business_profiles_bd_for_service_areas_trigger BEFORE DELETE ON wa_biz_profiles BEGIN DELETE FROM wa_biz_profiles_service_areas WHERE wa_biz_profile_id = old._id; END");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r3 = new C59422wt[6];
        AnonymousClass220 A01 = AnonymousClass220.A01(A00);
        boolean A0m = C54912pU.A0m(A00, A01, r3);
        C54912pU.A0V(A00, A01, "wa_biz_profile_id", r3, A0m);
        A00.A02 = "area_description";
        C54912pU.A0Y(A00, AnonymousClass220.TEXT, r3);
        C54912pU.A0X(A00, A01, "radius", r3, A0m);
        A00.A02 = "center_latitude";
        AnonymousClass220 r1 = AnonymousClass220.REAL;
        C54912pU.A0g(A00, r1, r3, A0m);
        A00.A02 = "center_longitude";
        C54912pU.A0h(A00, r1, r3, A0m);
        r7.A0E("wa_biz_profiles_service_areas", r3);
    }
}
