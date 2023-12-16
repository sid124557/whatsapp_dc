package X;

import java.util.ArrayList;

/* renamed from: X.1wY  reason: invalid class name and case insensitive filesystem */
public final class C35241wY extends C41032Ir {
    public static final ArrayList A00 = AnonymousClass0x2.A0i(new String[]{"biz_profile", "broadcast_list_context_menu", "catalog_link", "click_to_chat_link", "contact_card", "contact_search", "ctwa", "global_search_new_chat", "group_participant_list", "message_short_link", "other_qbm", "otp_qbm", "phone_number_hyperlink", "product_link", "promotional_qbm", "qr_code", "status", "transactional_qbm", "unknown"});
    public static final ArrayList A01 = AnonymousClass0x2.A0i(new String[]{"false", "none", "true"});
    public static final ArrayList A02 = AnonymousClass0x2.A0i(new String[]{"inappropriate", "none", "spam"});

    public C35241wY(Long l, String str, String str2) {
        C56052rL A04 = C56052rL.A04("biz_opt_out");
        if (l != null && C626836d.A0K(l, true)) {
            C56052rL.A0A(A04, l, "business_discovery_timestamp");
        }
        if (str != null && C626836d.A0N(str, true)) {
            C56052rL.A0D(A04, "business_discovery_id", str);
        }
        A04.A0K(str2, "business_discovery_entry_point", A00);
        C41032Ir.A0A(A04, this);
    }
}
