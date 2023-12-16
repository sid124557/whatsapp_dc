package X;

/* renamed from: X.2C8  reason: invalid class name */
public final class AnonymousClass2C8 {
    public static final String A00;
    public static final String A01;
    public static final String A02;
    public static final String A03;
    public static final String A04;

    static {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SELECT ");
        String[] strArr = AnonymousClass2C5.A03;
        C57212tH.A03("message", A0o, strArr);
        A0o.append(", ");
        String A10 = AnonymousClass0x9.A10("file_size", A0o);
        A0o.append("message_media AS message_media");
        A0o.append(" JOIN ");
        A0o.append("available_message_view AS message");
        A0o.append(" ON message_media.message_row_id = message._id");
        A0o.append(" JOIN ");
        A0o.append("message_forwarded AS message_forwarded");
        A0o.append(" ON message_forwarded.message_row_id = message_media.message_row_id");
        A0o.append(" WHERE ");
        String A0p = C18310x6.A0p("message_forwarded.forward_score > ?", A0o);
        A0o.append("message_type IN ('2', '1', '25', '3', '81', '28', '13', '29', '9', '26')");
        A01 = AnonymousClass000.A0X(" ORDER BY file_size DESC", A0o);
        StringBuilder A0l = AnonymousClass000.A0l("SELECT ");
        C18260x0.A0p(C57212tH.A01("message", strArr), ", ", "file_size", A10, A0l);
        A0l.append("message_media AS message_media");
        A0l.append(" JOIN ");
        AnonymousClass001.A1K("available_message_view AS message", " JOIN ", "message_forwarded AS message_forwarded", A0l);
        A0l.append(" WHERE message_media.message_row_id = message._id");
        A0l.append(" AND message_forwarded.message_row_id = message_media.message_row_id");
        A0l.append(A0p);
        C18260x0.A0p("message_forwarded.forward_score > ?", A0p, "message_type IN ('2', '1', '25', '3', '81', '28', '13', '29', '9', '26')", " ORDER BY file_size DESC", A0l);
        A02 = A0l.toString();
        StringBuilder A0l2 = AnonymousClass000.A0l("SELECT ");
        A0l2.append(AnonymousClass2C5.A01);
        A0l2.append(" , ");
        C18260x0.A0p("message_forwarded.forward_score", A10, "available_message_view AS message", " JOIN ", A0l2);
        A0l2.append("message_forwarded AS message_forwarded");
        A0l2.append(" ON message_forwarded.message_row_id = message._id");
        A0l2.append(" WHERE ");
        String A0U = AnonymousClass000.A0U("message_forwarded.forward_score >= ?", A0p, "message_type IN ('2', '1', '25', '3', '81', '28', '13', '29', '9', '26')", A0l2);
        A04 = AnonymousClass000.A0X(" ORDER BY sort_id DESC", AnonymousClass000.A0l(A0U));
        A03 = AnonymousClass000.A0X(" ORDER BY sort_id ASC", AnonymousClass000.A0l(A0U));
        A00 = AnonymousClass000.A0X(" ORDER BY message_forwarded.forward_score DESC", AnonymousClass000.A0l(A0U));
    }
}
