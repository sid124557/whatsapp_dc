package X;

/* renamed from: X.3K7  reason: invalid class name */
public final class AnonymousClass3K7 implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        C162457s7.A0J(r5, 0);
        r5.A0B("dc_enabled_features_biz_profile_id_index", "CREATE INDEX IF NOT EXISTS dc_enabled_features_biz_profile_id_index ON wa_biz_profiles_dc_enabled_features(wa_biz_profile_id);");
    }

    public /* synthetic */ void B3l(C56862sg r3, C41492Kl r4, C56622sI r5) {
        C162457s7.A0J(r5, 0);
        r5.A0C("before_delete_dc_enabled_features_trigger", "CREATE TRIGGER before_delete_dc_enabled_features_trigger BEFORE DELETE ON wa_biz_profiles BEGIN DELETE FROM wa_biz_profiles_dc_enabled_features WHERE wa_biz_profile_id = old._id; END");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A01 = C54912pU.A01(r7);
        C59422wt[] A0r = C54912pU.A0r(A01);
        AnonymousClass220 r2 = AnonymousClass220.INTEGER;
        C54912pU.A0V(A01, r2, "wa_biz_profile_id", A0r, C54912pU.A0l(A01, r2, A0r));
        A01.A02 = "catalog_feature_type";
        C54912pU.A0Y(A01, AnonymousClass220.TEXT, A0r);
        r7.A0E("wa_biz_profiles_dc_enabled_features", A0r);
    }
}
