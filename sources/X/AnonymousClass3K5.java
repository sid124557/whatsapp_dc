package X;

/* renamed from: X.3K5  reason: invalid class name */
public final class AnonymousClass3K5 implements AnonymousClass4ED {
    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A01 = C54912pU.A01(r7);
        C59422wt[] r3 = new C59422wt[6];
        A01.A02 = "wa_biz_profile_id";
        boolean A0k = C54912pU.A0k(A01, AnonymousClass220.INTEGER);
        A01.A04 = A0k;
        C54912pU.A0i(A01, r3, 0);
        A01.A02 = "sub_description";
        AnonymousClass220 r1 = AnonymousClass220.TEXT;
        C54912pU.A0b(A01, r1, r3, A0k ? 1 : 0);
        C54912pU.A0A(A01, r1, "commands", r3);
        C54912pU.A0B(A01, r1, "prompts", r3);
        C54912pU.A0C(A01, r1, "commands_description", r3);
        C54912pU.A0D(A01, r1, "bot_description", r3);
        r7.A0E("wa_biz_profiles_bot_attributes", r3);
    }

    public /* synthetic */ void B3l(C56862sg r3, C41492Kl r4, C56622sI r5) {
        C162457s7.A0J(r5, 0);
        r5.A0C("business_profiles_bd_for_bot_attributes_trigger", "CREATE TRIGGER business_profiles_bd_for_bot_attributes_trigger BEFORE DELETE ON wa_biz_profiles BEGIN DELETE FROM wa_biz_profiles_bot_attributes WHERE wa_biz_profile_id = old._id; END");
    }

    public /* synthetic */ void B3g(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
