package X;

/* renamed from: X.2um  reason: invalid class name and case insensitive filesystem */
public final class C58142um {
    public static final String A00;
    public static final String A01;
    public static final String A02;
    public static final String A03;
    public static final String A04;
    public static final String A05;
    public static final String A06;
    public static final String A07;
    public static final String A08;
    public static final String A09;
    public static final String A0A;

    static {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SELECT ");
        String str = C66223Kn.A00;
        String A10 = AnonymousClass0x9.A10(str, A0o);
        A0o.append("wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid)");
        A0o.append(" WHERE ");
        A0o.append("is_whatsapp_user");
        A0o.append("= 1 AND ");
        A0o.append("raw_contact_id");
        A0o.append("=");
        A0o.append(-4);
        A0o.append(" ORDER BY ");
        A0o.append("display_name");
        A0o.append(", ");
        A0o.append("wa_contacts.jid");
        A0o.append(", ");
        A0o.append("phone_type");
        A0A = AnonymousClass000.A0X(" ASC", A0o);
        A05 = AnonymousClass000.A0X("wa_contacts.jid LIKE ?", C18260x0.A0B("SELECT ", str, A10, "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid)", " WHERE "));
        A06 = AnonymousClass000.A0X("wa_contacts.number = ?", C18260x0.A0B("SELECT ", str, A10, "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid)", " WHERE "));
        A04 = AnonymousClass000.A0X("wa_contacts.jid = ?", C18260x0.A0B("SELECT ", str, A10, "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid)", " WHERE "));
        A07 = AnonymousClass000.A0X("wa_contacts._id = ?", C18260x0.A0B("SELECT ", str, A10, "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid)", " WHERE "));
        A08 = AnonymousClass000.A0X("raw_contact_id = ? AND number = ?", C18260x0.A0B("SELECT ", str, A10, "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid)", " WHERE "));
        StringBuilder A0B = C18260x0.A0B("SELECT ", str, A10, "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid)", " WHERE ");
        A0B.append("wa_contacts.jid LIKE '%@g.us'");
        A0B.append(" OR ");
        A01 = AnonymousClass000.A0X("wa_contacts.jid LIKE '%@temp'", A0B);
        A03 = AnonymousClass000.A0X("wa_contacts.jid LIKE '%lid'", C18260x0.A0B("SELECT ", str, A10, "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid)", " WHERE "));
        StringBuilder A0B2 = C18260x0.A0B("SELECT ", str, A10, "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid)", " WHERE ");
        String A0p = C18310x6.A0p("is_whatsapp_user = 1", A0B2);
        A0B2.append("wa_contacts.jid != 'broadcast'");
        A0B2.append(A0p);
        A0B2.append("wa_contacts.jid NOT LIKE '%@broadcast'");
        A0B2.append(A0p);
        A0B2.append("wa_contacts.jid NOT LIKE '%@g.us'");
        A0B2.append(A0p);
        A0B2.append("wa_contacts.jid NOT LIKE '%@temp'");
        A0B2.append(A0p);
        A02 = AnonymousClass000.A0X("wa_contacts.jid != ?", A0B2);
        StringBuilder A0o2 = AnonymousClass001.A0o();
        C18260x0.A0p("SELECT ", str, A10, "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid)", A0o2);
        A00 = A0o2.toString();
        StringBuilder A0B3 = C18260x0.A0B("SELECT ", str, A10, "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid)", " WHERE ");
        A0B3.append("wa_contacts.is_wa_created_contact = 1");
        A0B3.append(A0p);
        A09 = AnonymousClass000.A0X("wa_contacts.sync_policy != 0", A0B3);
    }
}
