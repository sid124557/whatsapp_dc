package X;

/* renamed from: X.2CE  reason: invalid class name */
public final class AnonymousClass2CE {
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
    public static final String A0B;
    public static final String A0C;
    public static final String A0D;
    public static final String A0E;
    public static final String A0F;
    public static final String A0G;
    public static final String A0H;
    public static final String A0I;

    public static void A00(StringBuilder sb, String str) {
        sb.append(C57212tH.A01("message", new String[]{str}));
        sb.append(",");
    }

    static {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SELECT ");
        String str = AnonymousClass2C5.A01;
        String A10 = AnonymousClass0x9.A10(str, A0o);
        A0o.append("available_message_view");
        A0o.append(" WHERE ");
        A02 = AnonymousClass000.A0X("message_type IN ('2', '1', '25', '3', '81', '28', '13', '29', '9', '26')", A0o);
        StringBuilder A0l = AnonymousClass000.A0l("SELECT ");
        String[] strArr = AnonymousClass2C5.A03;
        C57212tH.A03("message", A0l, strArr);
        A0l.append(", ");
        A0l.append("file_size");
        A0l.append(A10);
        A0l.append("message_media AS message_media");
        A0l.append(" JOIN ");
        A0l.append("available_message_view AS message");
        A00 = AnonymousClass000.A0U(" ON message_media.message_row_id = message._id", " WHERE ", "message_type IN ('2', '1', '25', '3', '81', '28', '13', '29', '9', '26')", A0l);
        StringBuilder A0l2 = AnonymousClass000.A0l("SELECT ");
        C18260x0.A0p(C57212tH.A01("message", strArr), ", ", "file_size", A10, A0l2);
        A0l2.append("message_media AS message_media");
        A0l2.append(" JOIN ");
        A0l2.append("available_message_view AS message");
        A0l2.append(" WHERE message_media.message_row_id = message._id");
        A01 = AnonymousClass000.A0V(" AND ", "message_type IN ('2', '1', '25', '3', '81', '28', '13', '29', '9', '26')", A0l2);
        StringBuilder A0m = AnonymousClass000.A0m("SELECT ", str);
        A0m.append(", remove_files  FROM ");
        A0m.append("deleted_messages_view");
        A0m.append(" WHERE ");
        A0m.append("message_type in ('2' , '1' , '25' , '3' , '28' , '13' , '29' , '20' , '9' , '26' , '23' , '37' ) ");
        A0m.append(" AND ");
        A0m.append("chat_row_id");
        A03 = AnonymousClass000.A0X(" = ?", A0m);
        StringBuilder A0B2 = C18260x0.A0B("SELECT ", str, A10, "available_message_view", " WHERE ");
        A0B2.append("message_type in ('2' , '1' , '25' , '3' , '28' , '13' , '29' , '20' , '9' , '26' , '23' , '37' ) ");
        A0B2.append(" AND ");
        A0B2.append("( NOT (message_type == 2 AND origin == 1)  OR (origin != 1))");
        A0B2.append(" AND ");
        A0B2.append("chat_row_id = ?");
        A09 = AnonymousClass000.A0X(" ORDER BY sort_id DESC", A0B2);
        StringBuilder A0B3 = C18260x0.A0B("SELECT ", str, A10, "available_message_view", " WHERE ");
        A0B3.append("+message_type in (2 , 1 , 25 , 3 , 28 , 13 , 29 , 20 , 9 , 26 , 23 , 37 ) ");
        A0B3.append(" AND ");
        A0B3.append("from_me = 0");
        A0B3.append(" AND ");
        A0B3.append("sort_id > ? ");
        A0I = AnonymousClass000.A0X(" ORDER BY sort_id ASC", A0B3);
        StringBuilder A0l3 = AnonymousClass000.A0l("SELECT ");
        C18260x0.A0p(C57212tH.A01("message", strArr), A10, "message_media AS message_media", " JOIN ", A0l3);
        A0l3.append("available_message_view AS message");
        A0l3.append(" ON message_media.message_row_id = message._id");
        A0l3.append(" WHERE ");
        C18260x0.A0p("message_media.file_hash = ?", " AND ", "message_type in ('2' , '1' , '25' , '3' , '28' , '13' , '29' , '20' , '9' , '26' , '23' , '37' ) ", " ORDER BY sort_id DESC", A0l3);
        A07 = AnonymousClass000.A0X(" LIMIT 1000", A0l3);
        StringBuilder A0l4 = AnonymousClass000.A0l("SELECT ");
        C18260x0.A0p(C57212tH.A01("message", strArr), A10, "message_media AS message_media", " JOIN ", A0l4);
        C18260x0.A0p("available_message_view AS message", " WHERE message_media.message_row_id = message._id", " AND ", "message_media.file_hash = ?", A0l4);
        C18260x0.A0p(" AND ", "message_type in ('2' , '1' , '25' , '3' , '28' , '13' , '29' , '20' , '9' , '26' , '23' , '37' ) ", " ORDER BY sort_id DESC", " LIMIT 1000", A0l4);
        A08 = A0l4.toString();
        StringBuilder A0l5 = AnonymousClass000.A0l("SELECT ");
        C18260x0.A0p(C57212tH.A01("message", strArr), A10, "message_media AS message_media", " JOIN ", A0l5);
        C18260x0.A0p("available_message_view AS message", " ON message_media.message_row_id = message._id", " WHERE ", "message_media.file_hash = ?", A0l5);
        A0l5.append(" AND ");
        A05 = AnonymousClass000.A0U("message.message_type = ?", " ORDER BY sort_id DESC", " LIMIT 1000", A0l5);
        StringBuilder A0l6 = AnonymousClass000.A0l("SELECT ");
        C18260x0.A0p(C57212tH.A01("message", strArr), A10, "message_media AS message_media", " JOIN ", A0l6);
        C18260x0.A0p("available_message_view AS message", " WHERE message_media.message_row_id = message._id", " AND ", "message_media.file_hash = ?", A0l6);
        C18260x0.A0p(" AND ", "message.message_type = ?", " ORDER BY sort_id DESC", " LIMIT 1000", A0l6);
        A06 = A0l6.toString();
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("SELECT message_media.*, ");
        C57212tH.A03("message", A0o2, new String[]{"timestamp"});
        A0o2.append(",");
        A00(A0o2, "message_type");
        C18260x0.A0p(C57212tH.A01("message", new String[]{"media_url"}), A10, "message_media AS message_media", " JOIN ", A0o2);
        A0o2.append("available_message_view AS message");
        A0o2.append(" ON message_media.message_row_id = message._id");
        A0o2.append(" WHERE ");
        A0o2.append("file_hash = ?");
        A0o2.append(" AND ");
        A0o2.append("enc_file_hash IS NOT NULL");
        A0E = AnonymousClass000.A0X(" ORDER BY message_row_id DESC", A0o2);
        StringBuilder A0l7 = AnonymousClass000.A0l("SELECT message_media.*, ");
        A00(A0l7, "timestamp");
        A00(A0l7, "message_type");
        C18260x0.A0p(C57212tH.A01("message", new String[]{"media_url"}), A10, "message_media AS message_media", " JOIN ", A0l7);
        C18260x0.A0p("available_message_view AS message", " WHERE message_media.message_row_id = message._id", " AND ", "file_hash = ?", A0l7);
        A0F = AnonymousClass000.A0U(" AND ", "enc_file_hash IS NOT NULL", " ORDER BY message_row_id DESC", A0l7);
        StringBuilder A0l8 = AnonymousClass000.A0l("SELECT message_media.*, ");
        A00(A0l8, "timestamp");
        A00(A0l8, "message_type");
        C18260x0.A0p(C57212tH.A01("message", new String[]{"media_url"}), A10, "message_media AS message_media", " JOIN ", A0l8);
        C18260x0.A0p("available_message_view AS message", " ON message_media.message_row_id = message._id", " WHERE ", "file_hash = ?", A0l8);
        A0l8.append(" AND ");
        C18260x0.A0p("enc_file_hash IS NOT NULL", " AND ", "message.message_type = ?", " ORDER BY sort_id DESC", A0l8);
        A0C = A0l8.toString();
        StringBuilder A0l9 = AnonymousClass000.A0l("SELECT message_media.*, ");
        A00(A0l9, "timestamp");
        A00(A0l9, "message_type");
        C18260x0.A0p(C57212tH.A01("message", new String[]{"media_url"}), A10, "message_media AS message_media", " JOIN ", A0l9);
        C18260x0.A0p("available_message_view AS message", " WHERE message_media.message_row_id = message._id", " AND ", "file_hash = ?", A0l9);
        A0l9.append(" AND ");
        C18260x0.A0p("enc_file_hash IS NOT NULL", " AND ", "message.message_type = ?", " ORDER BY sort_id DESC", A0l9);
        A0D = A0l9.toString();
        StringBuilder A0l10 = AnonymousClass000.A0l("SELECT message_media.*, ");
        String str2 = "chat_row_id";
        C18260x0.A0p(C57212tH.A01("message", new String[]{str2, "from_me", "key_id"}), A10, "message_media AS message_media", " JOIN ", A0l10);
        C18260x0.A0p("available_message_view AS message", " ON message_media.message_row_id = message._id", " WHERE ", "file_hash = ?", A0l10);
        A0l10.append(" AND ");
        A0l10.append("enc_file_hash = ?");
        A0l10.append(" AND ");
        A0l10.append("message_type in ('3', '1' ) ");
        A0l10.append(" ORDER BY sort_id DESC");
        A0G = AnonymousClass000.A0X(" LIMIT 10", A0l10);
        StringBuilder A0l11 = AnonymousClass000.A0l("SELECT message_media.*, ");
        C18260x0.A0p(C57212tH.A01("message", new String[]{str2, "from_me", "key_id"}), A10, "message_media AS message_media", " JOIN ", A0l11);
        C18260x0.A0p("available_message_view AS message", " WHERE message_media.message_row_id = message._id", " AND ", "file_hash = ?", A0l11);
        A0l11.append(" AND ");
        C18260x0.A0p("enc_file_hash = ?", " AND ", "message_type in ('3', '1' ) ", " ORDER BY sort_id DESC", A0l11);
        A0H = AnonymousClass000.A0X(" LIMIT 10", A0l11);
        StringBuilder A0B4 = C18260x0.A0B("SELECT ", str, A10, "available_message_view", " WHERE ");
        A0B4.append("message_type  IN ('2', '1', '25', '3', '28', '13', '29')");
        A0B4.append(" AND ");
        String A0U = AnonymousClass000.A0U(" ( NOT (message_type == 2 AND origin == 1)  OR (origin != 1))", " AND ", "chat_row_id = ?", A0B4);
        A0B = A0U;
        StringBuilder A0l12 = AnonymousClass000.A0l("SELECT ");
        C18260x0.A0p(AnonymousClass2C5.A00, A10, "available_message_view", " WHERE ", A0l12);
        A0l12.append("message_type  IN ('2', '1', '25', '3', '28', '13', '29')");
        A0l12.append(" AND ");
        String A0U2 = AnonymousClass000.A0U(" ( NOT (message_type == 2 AND origin == 1)  OR (origin != 1))", " AND ", "chat_row_id = ?", A0l12);
        A0A = AnonymousClass000.A0T(A0U, " ORDER BY sort_id DESC");
        A04 = AnonymousClass000.A0T(A0U2, " ORDER BY sort_id DESC");
    }
}
