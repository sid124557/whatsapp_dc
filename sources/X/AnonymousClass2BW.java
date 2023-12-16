package X;

/* renamed from: X.2BW  reason: invalid class name */
public final class AnonymousClass2BW {
    public static final String A00;

    static {
        StringBuilder A0h = AnonymousClass0x2.A0h();
        C57212tH.A03("wa_biz_profile_to_service_offerings", A0h, new String[]{"wa_biz_category_service_offerings_id", "wa_biz_profile_id", "is_offered"});
        C18320x8.A1K(A0h);
        AnonymousClass0x2.A1O(A0h, C57212tH.A01("wa_biz_category_service_offerings", new String[]{"_id", "category_id", "category_name", "offering_name"}));
        A0h.append("wa_biz_profile_to_service_offerings");
        A0h.append(" INNER JOIN ");
        C18300x5.A1P(A0h, "wa_biz_category_service_offerings");
        A0h.append("wa_biz_profile_to_service_offerings.wa_biz_profile_id");
        A0h.append(" = ? AND ");
        C18300x5.A1O(A0h, "wa_biz_category_service_offerings._id");
        A00 = AnonymousClass000.A0X("wa_biz_profile_to_service_offerings.wa_biz_category_service_offerings_id", A0h);
    }
}
