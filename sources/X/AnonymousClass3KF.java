package X;

/* renamed from: X.3KF  reason: invalid class name */
public class AnonymousClass3KF implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("biz_profile_jid_index", "CREATE UNIQUE INDEX IF NOT EXISTS biz_profile_jid_index ON wa_biz_profiles (jid);");
    }

    public /* synthetic */ void B3l(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0C("contact_bd_for_business_profiles", "CREATE TRIGGER contact_bd_for_business_profiles BEFORE DELETE ON wa_contacts BEGIN DELETE FROM wa_biz_profiles WHERE jid = old.jid; END");
        r5.A0C("contact_bu_for_business_profiles", "CREATE TRIGGER contact_bu_for_business_profiles BEFORE UPDATE ON wa_contacts BEGIN UPDATE wa_biz_profiles SET jid = new.jid WHERE jid = old.jid; END");
    }

    public void B3j(C41492Kl r9, C56622sI r10) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r2 = new C59422wt[37];
        AnonymousClass220 A01 = AnonymousClass220.A01(A00);
        A00.A00 = A01;
        boolean A0q = C54912pU.A0q(A00, r2);
        A00.A02 = "jid";
        AnonymousClass220 r7 = AnonymousClass220.TEXT;
        C54912pU.A0c(A00, r7, r2, true);
        C54912pU.A0A(A00, r7, "email", r2);
        C54912pU.A0B(A00, r7, "address", r2);
        C54912pU.A0C(A00, r7, "business_description", r2);
        A00.A02 = "latitude";
        AnonymousClass220 r5 = AnonymousClass220.REAL;
        r2[5] = C54912pU.A02(A00, r5);
        C54912pU.A0E(A00, r5, "longitude", r2);
        C54912pU.A0F(A00, r7, "tag", r2);
        C54912pU.A0G(A00, r7, "vertical", r2);
        C54912pU.A0H(A00, r7, "time_zone", r2);
        C54912pU.A0I(A00, r7, "hours_note", r2);
        A00.A02 = "has_catalog";
        AnonymousClass220 r52 = AnonymousClass220.BOOLEAN;
        A00.A00 = r52;
        A00.A01 = Integer.toString(A0q ? 1 : 0);
        r2[11] = A00.A0x();
        C54912pU.A0K(A00, r7, "address_postal_code", r2);
        C54912pU.A0L(A00, r7, "address_city_id", r2);
        C54912pU.A0M(A00, r7, "address_city_name", r2);
        C54912pU.A0N(A00, r7, "commerce_experience", r2);
        C54912pU.A0O(A00, r7, "shop_url", r2);
        r2[17] = C54912pU.A04(A00, r52, "cart_enabled", A0q);
        C54912pU.A0Q(A00, r7, "commerce_manager_url", r2);
        r2[19] = C54912pU.A04(A00, r52, "direct_connection_enabled", A0q);
        r2[20] = C54912pU.A04(A00, r52, "is_shop_banned", A0q);
        C54912pU.A0S(A00, r7, "default_postcode", r2);
        C54912pU.A0T(A00, r7, "location_name", r2);
        r2[23] = C54912pU.A04(A00, r52, "galaxy_business_enabled", A0q);
        r2[24] = C54912pU.A03(A00, r7, "cover_photo_url");
        r2[25] = C54912pU.A03(A00, r7, "cover_photo_id");
        r2[26] = C54912pU.A03(A00, r7, "custom_url");
        r2[27] = C54912pU.A03(A00, r7, "member_since");
        r2[28] = C54912pU.A04(A00, r52, "capi_calling_enabled", A0q);
        r2[29] = C54912pU.A04(A00, r52, "is_responsive", A0q);
        r2[30] = C54912pU.A03(A00, r7, "postcode_type");
        r2[31] = C54912pU.A03(A00, r7, "price_tier_id");
        r2[32] = C54912pU.A03(A00, r7, "business_blocked_status");
        r2[33] = C54912pU.A03(A00, A01, "survey_sampling_rate");
        r2[34] = C54912pU.A04(A00, r52, "is_offerings_eligible", A0q);
        r2[35] = C54912pU.A03(A00, A01, "automated_type");
        r2[36] = C54912pU.A03(A00, A01, "welcome_message_protocol_mode");
        r10.A0E("wa_biz_profiles", r2);
    }
}
