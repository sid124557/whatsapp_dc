package X;

/* renamed from: X.3K8  reason: invalid class name */
public class AnonymousClass3K8 implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("biz_profile_id_index", " CREATE INDEX IF NOT EXISTS biz_profile_id_index ON wa_biz_profiles_direct_connection_allowed_country_codes(wa_biz_profile_id);");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] A0r = C54912pU.A0r(A00);
        AnonymousClass220 r2 = AnonymousClass220.INTEGER;
        C54912pU.A0V(A00, r2, "wa_biz_profile_id", A0r, C54912pU.A0m(A00, r2, A0r));
        A00.A02 = "country_code";
        C54912pU.A0Y(A00, AnonymousClass220.TEXT, A0r);
        r7.A0E("wa_biz_profiles_direct_connection_allowed_country_codes", A0r);
    }

    public /* synthetic */ void B3l(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0C("wa_biz_profiles_bd_direct_connection_allowed_country_codes_trigger", "CREATE TRIGGER wa_biz_profiles_bd_direct_connection_allowed_country_codes_trigger BEFORE DELETE ON wa_biz_profiles BEGIN DELETE FROM wa_biz_profiles_direct_connection_allowed_country_codes WHERE wa_biz_profile_id = old._id; END");
    }
}
