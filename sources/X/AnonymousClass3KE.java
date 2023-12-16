package X;

/* renamed from: X.3KE  reason: invalid class name */
public class AnonymousClass3KE implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("biz_profile_id_website_index", " CREATE INDEX IF NOT EXISTS biz_profile_id_website_index ON wa_biz_profiles_websites(wa_biz_profile_id, websites);");
    }

    public /* synthetic */ void B3l(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0C("business_profiles_bd_for_websites_trigger", "CREATE TRIGGER business_profiles_bd_for_websites_trigger BEFORE DELETE ON wa_biz_profiles BEGIN DELETE FROM wa_biz_profiles_websites WHERE wa_biz_profile_id = old._id; END");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] A0r = C54912pU.A0r(A00);
        AnonymousClass220 r2 = AnonymousClass220.INTEGER;
        C54912pU.A0V(A00, r2, "wa_biz_profile_id", A0r, C54912pU.A0m(A00, r2, A0r));
        A00.A02 = "websites";
        C54912pU.A0Y(A00, AnonymousClass220.TEXT, A0r);
        r7.A0E("wa_biz_profiles_websites", A0r);
    }
}
