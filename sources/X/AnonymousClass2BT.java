package X;

/* renamed from: X.2BT  reason: invalid class name */
public final class AnonymousClass2BT {
    public static final String A00;

    static {
        StringBuilder A0h = AnonymousClass0x2.A0h();
        AnonymousClass0x2.A1O(A0h, C107575bX.A09(", ", "account_id", "account_type", "account_display_name", "account_fan_count", "account_has_media_post"));
        AnonymousClass0x2.A1P(A0h, "wa_biz_profiles_linked_accounts_table");
        A0h.append("wa_biz_profile_id");
        A00 = AnonymousClass000.A0X(" = ?", A0h);
    }
}
