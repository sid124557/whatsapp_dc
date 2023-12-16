package X;

/* renamed from: X.3KA  reason: invalid class name */
public class AnonymousClass3KA implements AnonymousClass4ED {
    public /* synthetic */ void B3l(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0C("business_profiles_bd_for_linked_accounts_trigger", "CREATE TRIGGER business_profiles_bd_for_linked_accounts_trigger BEFORE DELETE ON wa_biz_profiles BEGIN DELETE FROM wa_biz_profiles_linked_accounts_table WHERE wa_biz_profile_id = old._id; END");
    }

    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("wa_biz_profiles_linked_accounts_index", " CREATE INDEX IF NOT EXISTS wa_biz_profiles_linked_accounts_index ON wa_biz_profiles_linked_accounts_table(wa_biz_profile_id);");
    }

    public void B3j(C41492Kl r8, C56622sI r9) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r5 = new C59422wt[7];
        AnonymousClass220 A01 = AnonymousClass220.A01(A00);
        A00.A00 = A01;
        boolean A0q = C54912pU.A0q(A00, r5);
        C54912pU.A0V(A00, A01, "wa_biz_profile_id", r5, true);
        A00.A02 = "account_id";
        AnonymousClass220 r1 = AnonymousClass220.TEXT;
        C54912pU.A0e(A00, r1, r5, true);
        C54912pU.A0X(A00, A01, "account_type", r5, true);
        A00.A02 = "account_display_name";
        C54912pU.A0g(A00, r1, r5, true);
        A00.A02 = "account_fan_count";
        C54912pU.A0h(A00, A01, r5, true);
        r5[6] = C54912pU.A05(A00, A01, "account_has_media_post", A0q ? 1 : 0, true);
        r9.A0E("wa_biz_profiles_linked_accounts_table", r5);
    }
}
