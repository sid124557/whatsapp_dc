package X;

/* renamed from: X.2C9  reason: invalid class name */
public final class AnonymousClass2C9 {
    public static final String A00;
    public static final String A01;
    public static final String A02;
    public static final String A03;
    public static final String A04;

    static {
        String str = AnonymousClass2C5.A01;
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass001.A1K("SELECT ", str, " FROM ", A0o);
        A0o.append("message_view");
        A0o.append(" WHERE ");
        String A0p = C18310x6.A0p("chat_row_id = ?", A0o);
        A0o.append("sort_id > ?");
        A0o.append(A0p);
        A0o.append("sort_id <= ?");
        A0o.append("ORDER BY ");
        A0o.append("sort_id");
        A00 = AnonymousClass000.A0X(" ASC LIMIT 1024", A0o);
        StringBuilder A0B = C18260x0.A0B("SELECT ", str, " FROM ", "message_view", " WHERE ");
        A0B.append("chat_row_id = ?");
        A01 = AnonymousClass000.A0X(" ORDER BY sort_id ASC", A0B);
        StringBuilder A0B2 = C18260x0.A0B("SELECT ", str, " FROM ", "message_view", " WHERE ");
        A0B2.append("chat_row_id = ?");
        A0B2.append(A0p);
        A0B2.append("(sender_jid_row_id = ? OR sender_jid_raw_string = ?) ");
        A0B2.append(" ORDER BY ");
        A03 = AnonymousClass000.A0X("sort_id ASC", A0B2);
        StringBuilder A0B3 = C18260x0.A0B("SELECT ", str, " FROM ", "message_view", " WHERE ");
        C18260x0.A0p("from_me = 1", A0p, "chat_row_id = ?", " ORDER BY ", A0B3);
        A0B3.append("sort_id");
        A04 = AnonymousClass000.A0X(" ASC", A0B3);
        StringBuilder A0B4 = C18260x0.A0B("SELECT ", str, " FROM ", "message_view", " WHERE ");
        A0B4.append("chat_row_id = ?");
        A0B4.append(A0p);
        A02 = AnonymousClass000.A0U("sort_id > ?", " ORDER BY ", "sort_id ASC", A0B4);
    }
}
