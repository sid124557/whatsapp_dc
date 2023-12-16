package X;

/* renamed from: X.2Bq  reason: invalid class name and case insensitive filesystem */
public final class C39352Bq {
    public static final String A00;
    public static final String A01;

    static {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SELECT ");
        String str = AnonymousClass2C5.A01;
        String A10 = AnonymousClass0x9.A10(str, A0o);
        A0o.append("message_ephemeral ephemeral");
        A0o.append(" JOIN ");
        C18300x5.A1P(A0o, "message_view messages");
        A0o.append("ephemeral.message_row_id = messages._id");
        A0o.append(" WHERE ");
        String A0p = C18310x6.A0p("ephemeral.keep_in_chat != 1", A0o);
        A0o.append("ephemeral.expire_timestamp < ?");
        A00 = AnonymousClass000.A0X(" LIMIT ?", A0o);
        StringBuilder A0B = C18260x0.A0B("SELECT ", str, A10, "message_ephemeral ephemeral", " JOIN ");
        C18260x0.A0p("available_message_view messages", " WHERE ", "ephemeral.message_row_id = messages._id", A0p, A0B);
        C18260x0.A0p("ephemeral.keep_in_chat != 1", A0p, "ephemeral.expire_timestamp < ?", " LIMIT ?", A0B);
        A01 = A0B.toString();
    }
}
