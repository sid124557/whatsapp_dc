package X;

/* renamed from: X.2CA  reason: invalid class name */
public final class AnonymousClass2CA {
    public static final String A00;
    public static final String A01;
    public static final String A02;
    public static final String A03;
    public static final String A04;
    public static final String A05;

    static {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SELECT ");
        String[] strArr = AnonymousClass2C5.A03;
        C57212tH.A03("message_view", A0o, strArr);
        A0o.append(" FROM ");
        A0o.append("message_view_once_media view_once ");
        A0o.append(" JOIN message_view message_view  ON view_once.message_row_id=message_view._id");
        A0o.append(" JOIN message_media message_media  ON message_media.message_row_id =  message_view._id");
        A0o.append(" WHERE ");
        A0o.append("message_media.file_size != 0 AND message_view.from_me = 0  AND view_once.state IN (1, 2) ");
        A04 = AnonymousClass000.A0X(" LIMIT ?", A0o);
        StringBuilder A0l = AnonymousClass000.A0l("SELECT ");
        AnonymousClass001.A1K(C57212tH.A01("message_view", strArr), " FROM ", "message_view_once_media view_once ", A0l);
        A0l.append(" JOIN message_view message_view  JOIN message_media message_media  WHERE view_once.message_row_id=message_view._id AND message_media.message_row_id =  message_view._id");
        A05 = AnonymousClass000.A0U(" AND ", "message_media.file_size != 0 AND message_view.from_me = 0  AND view_once.state IN (1, 2) ", " LIMIT ?", A0l);
        StringBuilder A0l2 = AnonymousClass000.A0l("SELECT ");
        AnonymousClass001.A1K(C57212tH.A01("message_view", strArr), " FROM ", "message_view_once_media view_once ", A0l2);
        A0l2.append(" JOIN available_message_view message_view  ON view_once.message_row_id=message_view._id");
        A0l2.append(" WHERE ");
        A0l2.append("view_once.state = 0");
        A0l2.append(" AND ");
        A02 = AnonymousClass000.A0X("message_view.from_me = 0", A0l2);
        StringBuilder A0l3 = AnonymousClass000.A0l("SELECT ");
        AnonymousClass001.A1K(C57212tH.A01("message_view", strArr), " FROM ", "message_view_once_media view_once ", A0l3);
        A0l3.append(" JOIN available_message_view message_view  WHERE view_once.message_row_id=message_view._id");
        A0l3.append(" AND ");
        A03 = AnonymousClass000.A0U("view_once.state = 0", " AND ", "message_view.from_me = 0", A0l3);
        StringBuilder A0l4 = AnonymousClass000.A0l("SELECT ");
        C18260x0.A0p(C57212tH.A01("message_view", strArr), " FROM ", "message_view_once_media view_once ", " JOIN message_view message_view  ON view_once.message_row_id=message_view._id", A0l4);
        A0l4.append(" WHERE ");
        A00 = AnonymousClass000.A0V("message_view.timestamp <= ?  AND view_once.state = 0", " LIMIT ?", A0l4);
        StringBuilder A0l5 = AnonymousClass000.A0l("SELECT ");
        AnonymousClass001.A1K(C57212tH.A01("message_view", strArr), " FROM ", "message_view_once_media view_once ", A0l5);
        C18260x0.A0p(" JOIN message_view message_view  WHERE view_once.message_row_id=message_view._id", " AND ", "message_view.timestamp <= ?  AND view_once.state = 0", " LIMIT ?", A0l5);
        A01 = A0l5.toString();
    }
}
