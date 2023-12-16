package X;

/* renamed from: X.2C7  reason: invalid class name */
public abstract class AnonymousClass2C7 {
    public static final String A00;
    public static final String A01;
    public static final String A02;
    public static final String A03;
    public static final String A04;

    static {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("   SELECT ");
        String str = AnonymousClass2C5.A01;
        String A10 = AnonymousClass0x9.A10(str, A0o);
        A0o.append("available_message_view");
        A0o.append(" WHERE ");
        A0o.append("_id > ? ");
        A0o.append(" ORDER BY ");
        A0o.append("_id ASC");
        A00 = AnonymousClass000.A0X(" LIMIT ?", A0o);
        StringBuilder A0o2 = AnonymousClass001.A0o();
        AnonymousClass001.A1K("   SELECT ", str, A10, A0o2);
        C18260x0.A0p("message_view", " WHERE ", "_id > ? ", " ORDER BY ", A0o2);
        A01 = AnonymousClass000.A0V("_id ASC", " LIMIT ?", A0o2);
        StringBuilder A0o3 = AnonymousClass001.A0o();
        A0o3.append("SELECT ");
        A0o3.append(C39152Aw.A00);
        A0o3.append(", ");
        A0o3.append("messages.key_remote_jid AS parent_key_remote_jid, ");
        A0o3.append("messages._id AS parent_row_id");
        A0o3.append(A10);
        A0o3.append("messages AS messages");
        A0o3.append(" LEFT JOIN ");
        C18300x5.A1P(A0o3, "messages_quotes");
        A0o3.append("messages.quoted_row_id = messages_quotes._id");
        A0o3.append(" LEFT JOIN ");
        A0o3.append("jid AS chat_jid ON messages_quotes.key_remote_jid = chat_jid.raw_string");
        A0o3.append(" LEFT JOIN ");
        A0o3.append("chat AS chat ON chat.jid_row_id = chat_jid._id");
        A0o3.append(" WHERE ");
        A0o3.append("messages._id > ?");
        A0o3.append(" ORDER BY ");
        A03 = AnonymousClass000.A0V("messages._id ASC", " LIMIT ?", A0o3);
        StringBuilder A0l = AnonymousClass000.A0l("SELECT ");
        C57212tH.A03("messages", A0l, C58162uo.A0O);
        A0l.append(", messages.");
        AnonymousClass001.A1K("key_remote_jid", A10, "messages", A0l);
        A0l.append(" AS messages LEFT JOIN ");
        A0l.append("missed_call_logs AS missed_call_logs");
        A0l.append(" ON messages.");
        A0l.append("_id");
        A0l.append(" = missed_call_logs.message_row_id WHERE ");
        String A0p = C18310x6.A0p("messages._id > ? ", A0l);
        A0l.append("media_wa_type = 10");
        A0l.append(" AND missed_call_logs._id IS NULL");
        A02 = AnonymousClass000.A0V(" ORDER BY _id ASC", " LIMIT ?", A0l);
        StringBuilder A0l2 = AnonymousClass000.A0l("SELECT ");
        C18260x0.A0p(C58162uo.A00, ", ", "key_remote_jid", A10, A0l2);
        A0l2.append("messages");
        A0l2.append(" WHERE ");
        A0l2.append("_id > ?");
        A0l2.append(A0p);
        AnonymousClass001.A1K("media_wa_type IN (0,7)", " ORDER BY ", "_id", A0l2);
        A04 = AnonymousClass000.A0X(" ASC LIMIT ?", A0l2);
    }
}
