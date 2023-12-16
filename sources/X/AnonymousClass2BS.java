package X;

/* renamed from: X.2BS  reason: invalid class name */
public final class AnonymousClass2BS {
    public static final String A00;

    static {
        StringBuilder A0h = AnonymousClass0x2.A0h();
        AnonymousClass0x2.A1O(A0h, C107575bX.A09(", ", "category_id", "category_name"));
        AnonymousClass0x2.A1P(A0h, "wa_biz_profiles_categories");
        A0h.append("wa_biz_profile_id");
        A0h.append(" = ? ORDER BY ");
        A0h.append("_id");
        A00 = AnonymousClass000.A0X(" ASC", A0h);
    }
}
