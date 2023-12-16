package X;

/* renamed from: X.3K9  reason: invalid class name */
public class AnonymousClass3K9 implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("biz_profile_id_hours_index", " CREATE INDEX IF NOT EXISTS biz_profile_id_hours_index ON wa_biz_profiles_hours(wa_biz_profile_id);");
    }

    public /* synthetic */ void B3l(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0C("business_profiles_bd_for_hours_trigger", "CREATE TRIGGER business_profiles_bd_for_hours_trigger BEFORE DELETE ON wa_biz_profiles BEGIN DELETE FROM wa_biz_profiles_hours WHERE wa_biz_profile_id = old._id; END");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r3 = new C59422wt[6];
        AnonymousClass220 A01 = AnonymousClass220.A01(A00);
        C54912pU.A0V(A00, A01, "wa_biz_profile_id", r3, C54912pU.A0m(A00, A01, r3));
        C54912pU.A0A(A00, A01, "day_of_week", r3);
        C54912pU.A0B(A00, A01, "mode", r3);
        C54912pU.A0C(A00, A01, "open_time", r3);
        C54912pU.A0D(A00, A01, "close_time", r3);
        r7.A0E("wa_biz_profiles_hours", r3);
    }
}
