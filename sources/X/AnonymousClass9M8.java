package X;

/* renamed from: X.9M8  reason: invalid class name */
public final class AnonymousClass9M8 {
    public static final String A00;
    public static final String A01;
    public static final String A02;
    public static final String A03;

    static {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SELECT ");
        String[] strArr = AnonymousClass2C5.A03;
        A0o.append(C57212tH.A01("message", strArr));
        A0o.append(" FROM ");
        A0o.append("message_view AS message");
        A0o.append(" LEFT JOIN ");
        A0o.append("message_ui_elements AS content");
        A0o.append(" ON ");
        A0o.append("message._id = content.message_row_id");
        A0o.append(" WHERE ");
        A0o.append("content.element_type = ?");
        A0o.append(" AND ");
        A0o.append("message.chat_row_id = ?");
        A0o.append(" AND ");
        A0o.append("message.timestamp > ?");
        A0o.append(" ORDER BY message.sort_id DESC ");
        A01 = AnonymousClass000.A0X(" LIMIT 100", A0o);
        StringBuilder A0l = AnonymousClass000.A0l("SELECT ");
        A0l.append(C57212tH.A01("message", strArr));
        A0l.append(" FROM ");
        A0l.append("message_view AS message");
        A0l.append(" JOIN ");
        A0l.append("message_ui_elements AS content");
        A0l.append(" WHERE ");
        A0l.append("content.message_row_id = message._id");
        A0l.append(" AND ");
        A0l.append("message.from_me = 1 AND ");
        A0l.append("content.element_type = 4");
        A0l.append(" ORDER BY message.sort_id DESC ");
        A00 = AnonymousClass000.A0X("LIMIT ?, ?", A0l);
        StringBuilder A0l2 = AnonymousClass000.A0l("SELECT ");
        C18260x0.A0p(C57212tH.A01("message", strArr), " FROM ", "message_view AS message", " LEFT JOIN ", A0l2);
        C18260x0.A0p("message_ui_elements AS content", " ON ", "message._id = content.message_row_id", " WHERE ", A0l2);
        A0l2.append("content.element_type = 4");
        A03 = AnonymousClass000.A0V(" ORDER BY message.sort_id DESC ", " LIMIT 100", A0l2);
        StringBuilder A0l3 = AnonymousClass000.A0l("SELECT ");
        A0l3.append(C57212tH.A01("message", strArr));
        A0l3.append(" FROM ");
        A0l3.append("message_view");
        A0l3.append(" AS message WHERE ");
        A0l3.append("key_id = ?");
        A0l3.append(" AND ");
        A02 = AnonymousClass000.A0X("_id IN ( SELECT DISTINCT message_row_id FROM message_ui_elements WHERE element_type = 4)", A0l3);
    }
}
